/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.autoedit;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.ui.editor.model.DocumentUtil;

import com.google.inject.Inject;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public abstract class AbstractTerminalsEditStrategy extends AbstractEditStrategy {
	
	private String leftTerminal, rightTerminal;
	
	@Inject
	protected DocumentUtil util = new DocumentUtil();
	
	public void setDocumentUtil(DocumentUtil util) {
		this.util = util;
	}
	
	public AbstractTerminalsEditStrategy(String leftTerminal, String rightTerminal) {
		if (leftTerminal==null || rightTerminal==null)
			throw new IllegalArgumentException("The terminals must not be null.");
		if (leftTerminal.equals(rightTerminal)) {
			throw new IllegalArgumentException("The left and right terminal have to be different.");
		}
		this.leftTerminal = leftTerminal;
		this.rightTerminal = rightTerminal;
	}
	
	public String getLeftTerminal() {
		return leftTerminal;
	}
	
	public String getRightTerminal() {
		return rightTerminal;
	}

	/**
	 * finds the first start terminal which is not closed before the cursor position.
	 */
	protected IRegion findStopTerminal(IDocument document, int offset) throws BadLocationException {
		IRegion stop = util.searchInSamePartition(getRightTerminal(), document, offset);
		if (stop==null)
			return null;
		IRegion start = util.searchInSamePartition(getLeftTerminal(), document, offset);
		if (start != null && start.getOffset()<stop.getOffset())
			return findStopTerminal(document, stop.getOffset()+stop.getLength());
		return stop;
	}

	/**
	 * finds the first stop terminal which has not been started after the cursor position.
	 */
	protected IRegion findStartTerminal(IDocument document, int offset) throws BadLocationException {
		IRegion start = util.searchBackwardsInSamePartition(getLeftTerminal(), document, offset);
		if (start==null)
			return null;
		IRegion stop = util.searchBackwardsInSamePartition(getRightTerminal(), document, offset);
		if (stop != null && stop.getOffset()>start.getOffset())
			return findStartTerminal(document, start.getOffset());
		return start;
	}

}