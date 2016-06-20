/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug289187TestLanguage.Attribute;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug289187TestLanguage.Bug289187TestLanguagePackage;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug289187TestLanguage.Model;
import org.eclipse.xtext.ui.tests.editor.contentassist.bug289187TestLanguage.Operation;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug289187TestLanguageGrammarAccess;

@SuppressWarnings("all")
public class Bug289187TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Bug289187TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Bug289187TestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Bug289187TestLanguagePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case Bug289187TestLanguagePackage.CLASS:
				sequence_Class(context, (org.eclipse.xtext.ui.tests.editor.contentassist.bug289187TestLanguage.Class) semanticObject); 
				return; 
			case Bug289187TestLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Bug289187TestLanguagePackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (visibility=Visibility? name=ID)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         transient?='transient'? 
	 *         name=ID 
	 *         superClass=[Class|ID]? 
	 *         (implementedInterfaces+=[Class|ID] implementedInterfaces+=[Class|ID]*)? 
	 *         classNumber=INT? 
	 *         quid=INT? 
	 *         documentation=STRING? 
	 *         attributes+=Attribute* 
	 *         operations+=Operation*
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, org.eclipse.xtext.ui.tests.editor.contentassist.bug289187TestLanguage.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     classes+=Class+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (visibility=Visibility? name=ID)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}