package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.BacktrackingContentAssistTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBacktrackingContentAssistTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'body'", "':'", "'context'", "'static'", "'def'", "'('", "','", "')'", "'='", "'derive'", "'init'", "'inv'", "'package'", "'endpackage'", "'post'", "'pre'", "'::'", "'.'", "'->'", "'^^'", "'^'", "'?'", "'e'", "'E'", "'+'", "'-'", "'Boolean'", "'Integer'", "'Real'", "'String'", "'UnlimitedNatural'", "'OclAny'", "'OclInvalid'", "'OclVoid'", "'Set'", "'Bag'", "'Sequence'", "'Collection'", "'OrderedSet'", "'Tuple'", "'{'", "'}'", "'..'", "'true'", "'false'", "'invalid'", "'null'", "'implies'", "'xor'", "'or'", "'and'", "'<>'", "'>'", "'<'", "'>='", "'<='", "'*'", "'/'", "'not'", "'@'", "';'", "'|'", "'['", "']'", "'self'", "'if'", "'then'", "'else'", "'endif'", "'let'", "'in'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBacktrackingContentAssistTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBacktrackingContentAssistTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBacktrackingContentAssistTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBacktrackingContentAssistTestLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private BacktrackingContentAssistTestLanguageGrammarAccess grammarAccess;

        public InternalBacktrackingContentAssistTestLanguageParser(TokenStream input, BacktrackingContentAssistTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Document";
       	}

       	@Override
       	protected BacktrackingContentAssistTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalBacktrackingContentAssistTestLanguage.g:70:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:70:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:71:2: iv_ruleDocument= ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocument; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalBacktrackingContentAssistTestLanguage.g:77:1: ruleDocument returns [EObject current=null] : ( ( (lv_packages_0_0= rulePackageDeclaration ) ) | ( (lv_contexts_1_0= ruleContextDecl ) ) )* ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;

        EObject lv_contexts_1_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:78:1: ( ( ( (lv_packages_0_0= rulePackageDeclaration ) ) | ( (lv_contexts_1_0= ruleContextDecl ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:79:2: ( ( (lv_packages_0_0= rulePackageDeclaration ) ) | ( (lv_contexts_1_0= ruleContextDecl ) ) )*
            {
            // InternalBacktrackingContentAssistTestLanguage.g:79:2: ( ( (lv_packages_0_0= rulePackageDeclaration ) ) | ( (lv_contexts_1_0= ruleContextDecl ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==23) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:80:3: ( (lv_packages_0_0= rulePackageDeclaration ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:80:3: ( (lv_packages_0_0= rulePackageDeclaration ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:81:4: (lv_packages_0_0= rulePackageDeclaration )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:81:4: (lv_packages_0_0= rulePackageDeclaration )
            	    // InternalBacktrackingContentAssistTestLanguage.g:82:5: lv_packages_0_0= rulePackageDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDocumentAccess().getPackagesPackageDeclarationParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_packages_0_0=rulePackageDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"packages",
            	      						lv_packages_0_0,
            	      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PackageDeclaration");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:100:3: ( (lv_contexts_1_0= ruleContextDecl ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:100:3: ( (lv_contexts_1_0= ruleContextDecl ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:101:4: (lv_contexts_1_0= ruleContextDecl )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:101:4: (lv_contexts_1_0= ruleContextDecl )
            	    // InternalBacktrackingContentAssistTestLanguage.g:102:5: lv_contexts_1_0= ruleContextDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDocumentAccess().getContextsContextDeclParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_contexts_1_0=ruleContextDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"contexts",
            	      						lv_contexts_1_0,
            	      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.ContextDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleBody"
    // InternalBacktrackingContentAssistTestLanguage.g:123:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:123:45: (iv_ruleBody= ruleBody EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:124:2: iv_ruleBody= ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalBacktrackingContentAssistTestLanguage.g:130:1: ruleBody returns [EObject current=null] : (otherlv_0= 'body' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_constraintName_1_0 = null;

        EObject lv_expression_3_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:131:1: ( (otherlv_0= 'body' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:132:2: (otherlv_0= 'body' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:132:2: (otherlv_0= 'body' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:133:3: otherlv_0= 'body' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getBodyKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:137:3: ( (lv_constraintName_1_0= ruleIdentifier ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=33 && LA2_0<=34)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:138:4: (lv_constraintName_1_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:138:4: (lv_constraintName_1_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:139:5: lv_constraintName_1_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBodyAccess().getConstraintNameIdentifierParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_constraintName_1_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBodyRule());
                      					}
                      					set(
                      						current,
                      						"constraintName",
                      						lv_constraintName_1_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getColonKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:160:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:161:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:161:4: (lv_expression_3_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:162:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBodyRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleClassifierContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:183:1: entryRuleClassifierContextDecl returns [EObject current=null] : iv_ruleClassifierContextDecl= ruleClassifierContextDecl EOF ;
    public final EObject entryRuleClassifierContextDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierContextDecl = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:183:62: (iv_ruleClassifierContextDecl= ruleClassifierContextDecl EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:184:2: iv_ruleClassifierContextDecl= ruleClassifierContextDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierContextDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassifierContextDecl=ruleClassifierContextDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierContextDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifierContextDecl"


    // $ANTLR start "ruleClassifierContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:190:1: ruleClassifierContextDecl returns [EObject current=null] : (otherlv_0= 'context' ( ( (lv_selfName_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_classifier_3_0= ruleClassifierRef ) ) ( ( (lv_invariants_4_0= ruleInvariant ) ) | ( (lv_definitions_5_0= ruleDefinition ) ) )* ) ;
    public final EObject ruleClassifierContextDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_selfName_1_0 = null;

        EObject lv_classifier_3_0 = null;

        EObject lv_invariants_4_0 = null;

        EObject lv_definitions_5_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:191:1: ( (otherlv_0= 'context' ( ( (lv_selfName_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_classifier_3_0= ruleClassifierRef ) ) ( ( (lv_invariants_4_0= ruleInvariant ) ) | ( (lv_definitions_5_0= ruleDefinition ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:192:2: (otherlv_0= 'context' ( ( (lv_selfName_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_classifier_3_0= ruleClassifierRef ) ) ( ( (lv_invariants_4_0= ruleInvariant ) ) | ( (lv_definitions_5_0= ruleDefinition ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:192:2: (otherlv_0= 'context' ( ( (lv_selfName_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_classifier_3_0= ruleClassifierRef ) ) ( ( (lv_invariants_4_0= ruleInvariant ) ) | ( (lv_definitions_5_0= ruleDefinition ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:193:3: otherlv_0= 'context' ( ( (lv_selfName_1_0= ruleIdentifier ) ) otherlv_2= ':' )? ( (lv_classifier_3_0= ruleClassifierRef ) ) ( ( (lv_invariants_4_0= ruleInvariant ) ) | ( (lv_definitions_5_0= ruleDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getClassifierContextDeclAccess().getContextKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:197:3: ( ( (lv_selfName_1_0= ruleIdentifier ) ) otherlv_2= ':' )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==12) ) {
                        alt3=1;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==12) ) {
                        alt3=1;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3==12) ) {
                        alt3=1;
                    }
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:198:4: ( (lv_selfName_1_0= ruleIdentifier ) ) otherlv_2= ':'
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:198:4: ( (lv_selfName_1_0= ruleIdentifier ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:199:5: (lv_selfName_1_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:199:5: (lv_selfName_1_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:200:6: lv_selfName_1_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getClassifierContextDeclAccess().getSelfNameIdentifierParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_selfName_1_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getClassifierContextDeclRule());
                      						}
                      						set(
                      							current,
                      							"selfName",
                      							lv_selfName_1_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getClassifierContextDeclAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBacktrackingContentAssistTestLanguage.g:222:3: ( (lv_classifier_3_0= ruleClassifierRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:223:4: (lv_classifier_3_0= ruleClassifierRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:223:4: (lv_classifier_3_0= ruleClassifierRef )
            // InternalBacktrackingContentAssistTestLanguage.g:224:5: lv_classifier_3_0= ruleClassifierRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getClassifierContextDeclAccess().getClassifierClassifierRefParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_classifier_3_0=ruleClassifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getClassifierContextDeclRule());
              					}
              					set(
              						current,
              						"classifier",
              						lv_classifier_3_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.ClassifierRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:241:3: ( ( (lv_invariants_4_0= ruleInvariant ) ) | ( (lv_definitions_5_0= ruleDefinition ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }
                else if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:242:4: ( (lv_invariants_4_0= ruleInvariant ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:242:4: ( (lv_invariants_4_0= ruleInvariant ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:243:5: (lv_invariants_4_0= ruleInvariant )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:243:5: (lv_invariants_4_0= ruleInvariant )
            	    // InternalBacktrackingContentAssistTestLanguage.g:244:6: lv_invariants_4_0= ruleInvariant
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassifierContextDeclAccess().getInvariantsInvariantParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_invariants_4_0=ruleInvariant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClassifierContextDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"invariants",
            	      							lv_invariants_4_0,
            	      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Invariant");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:262:4: ( (lv_definitions_5_0= ruleDefinition ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:262:4: ( (lv_definitions_5_0= ruleDefinition ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:263:5: (lv_definitions_5_0= ruleDefinition )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:263:5: (lv_definitions_5_0= ruleDefinition )
            	    // InternalBacktrackingContentAssistTestLanguage.g:264:6: lv_definitions_5_0= ruleDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getClassifierContextDeclAccess().getDefinitionsDefinitionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_definitions_5_0=ruleDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getClassifierContextDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"definitions",
            	      							lv_definitions_5_0,
            	      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Definition");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifierContextDecl"


    // $ANTLR start "entryRuleClassifierRef"
    // InternalBacktrackingContentAssistTestLanguage.g:286:1: entryRuleClassifierRef returns [EObject current=null] : iv_ruleClassifierRef= ruleClassifierRef EOF ;
    public final EObject entryRuleClassifierRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:286:54: (iv_ruleClassifierRef= ruleClassifierRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:287:2: iv_ruleClassifierRef= ruleClassifierRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassifierRef=ruleClassifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifierRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifierRef"


    // $ANTLR start "ruleClassifierRef"
    // InternalBacktrackingContentAssistTestLanguage.g:293:1: ruleClassifierRef returns [EObject current=null] : (this_QualifiedClassifierRef_0= ruleQualifiedClassifierRef | this_SimpleClassifierRef_1= ruleSimpleClassifierRef ) ;
    public final EObject ruleClassifierRef() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedClassifierRef_0 = null;

        EObject this_SimpleClassifierRef_1 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:294:1: ( (this_QualifiedClassifierRef_0= ruleQualifiedClassifierRef | this_SimpleClassifierRef_1= ruleSimpleClassifierRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:295:2: (this_QualifiedClassifierRef_0= ruleQualifiedClassifierRef | this_SimpleClassifierRef_1= ruleSimpleClassifierRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:295:2: (this_QualifiedClassifierRef_0= ruleQualifiedClassifierRef | this_SimpleClassifierRef_1= ruleSimpleClassifierRef )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==27) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||(LA5_1>=13 && LA5_1<=15)||(LA5_1>=22 && LA5_1<=24)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==27) ) {
                    alt5=1;
                }
                else if ( (LA5_2==EOF||(LA5_2>=13 && LA5_2<=15)||(LA5_2>=22 && LA5_2<=24)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==27) ) {
                    alt5=1;
                }
                else if ( (LA5_3==EOF||(LA5_3>=13 && LA5_3<=15)||(LA5_3>=22 && LA5_3<=24)) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:296:3: this_QualifiedClassifierRef_0= ruleQualifiedClassifierRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getClassifierRefAccess().getQualifiedClassifierRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QualifiedClassifierRef_0=ruleQualifiedClassifierRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QualifiedClassifierRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:308:3: this_SimpleClassifierRef_1= ruleSimpleClassifierRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getClassifierRefAccess().getSimpleClassifierRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimpleClassifierRef_1=ruleSimpleClassifierRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleClassifierRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifierRef"


    // $ANTLR start "entryRuleContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:323:1: entryRuleContextDecl returns [EObject current=null] : iv_ruleContextDecl= ruleContextDecl EOF ;
    public final EObject entryRuleContextDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextDecl = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:323:52: (iv_ruleContextDecl= ruleContextDecl EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:324:2: iv_ruleContextDecl= ruleContextDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContextDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContextDecl=ruleContextDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContextDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContextDecl"


    // $ANTLR start "ruleContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:330:1: ruleContextDecl returns [EObject current=null] : (this_PropertyContextDecl_0= rulePropertyContextDecl | this_ClassifierContextDecl_1= ruleClassifierContextDecl | this_OperationContextDecl_2= ruleOperationContextDecl ) ;
    public final EObject ruleContextDecl() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyContextDecl_0 = null;

        EObject this_ClassifierContextDecl_1 = null;

        EObject this_OperationContextDecl_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:331:1: ( (this_PropertyContextDecl_0= rulePropertyContextDecl | this_ClassifierContextDecl_1= ruleClassifierContextDecl | this_OperationContextDecl_2= ruleOperationContextDecl ) )
            // InternalBacktrackingContentAssistTestLanguage.g:332:2: (this_PropertyContextDecl_0= rulePropertyContextDecl | this_ClassifierContextDecl_1= ruleClassifierContextDecl | this_OperationContextDecl_2= ruleOperationContextDecl )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:332:2: (this_PropertyContextDecl_0= rulePropertyContextDecl | this_ClassifierContextDecl_1= ruleClassifierContextDecl | this_OperationContextDecl_2= ruleOperationContextDecl )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                int LA6_1 = input.LA(2);

                if ( (synpred8_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt6=1;
                }
                else if ( (synpred9_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt6=2;
                }
                else if ( (true) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:333:3: this_PropertyContextDecl_0= rulePropertyContextDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextDeclAccess().getPropertyContextDeclParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PropertyContextDecl_0=rulePropertyContextDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyContextDecl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:345:3: this_ClassifierContextDecl_1= ruleClassifierContextDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextDeclAccess().getClassifierContextDeclParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ClassifierContextDecl_1=ruleClassifierContextDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ClassifierContextDecl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBacktrackingContentAssistTestLanguage.g:357:3: this_OperationContextDecl_2= ruleOperationContextDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getContextDeclAccess().getOperationContextDeclParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OperationContextDecl_2=ruleOperationContextDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OperationContextDecl_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextDecl"


    // $ANTLR start "entryRuleDefinition"
    // InternalBacktrackingContentAssistTestLanguage.g:372:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:372:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:373:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalBacktrackingContentAssistTestLanguage.g:379:1: ruleDefinition returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'def' ( (lv_constraintName_2_0= ruleIdentifier ) )? otherlv_3= ':' ( (lv_constrainedName_4_0= ruleIdentifier ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= ':' ( (lv_type_11_0= ruleTypeExp ) )? otherlv_12= '=' ( (lv_expression_13_0= ruleExpression ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_constraintName_2_0 = null;

        AntlrDatatypeRuleToken lv_constrainedName_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_type_11_0 = null;

        EObject lv_expression_13_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:380:1: ( ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'def' ( (lv_constraintName_2_0= ruleIdentifier ) )? otherlv_3= ':' ( (lv_constrainedName_4_0= ruleIdentifier ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= ':' ( (lv_type_11_0= ruleTypeExp ) )? otherlv_12= '=' ( (lv_expression_13_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:381:2: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'def' ( (lv_constraintName_2_0= ruleIdentifier ) )? otherlv_3= ':' ( (lv_constrainedName_4_0= ruleIdentifier ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= ':' ( (lv_type_11_0= ruleTypeExp ) )? otherlv_12= '=' ( (lv_expression_13_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:381:2: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'def' ( (lv_constraintName_2_0= ruleIdentifier ) )? otherlv_3= ':' ( (lv_constrainedName_4_0= ruleIdentifier ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= ':' ( (lv_type_11_0= ruleTypeExp ) )? otherlv_12= '=' ( (lv_expression_13_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:382:3: ( (lv_static_0_0= 'static' ) )? otherlv_1= 'def' ( (lv_constraintName_2_0= ruleIdentifier ) )? otherlv_3= ':' ( (lv_constrainedName_4_0= ruleIdentifier ) ) (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )? otherlv_10= ':' ( (lv_type_11_0= ruleTypeExp ) )? otherlv_12= '=' ( (lv_expression_13_0= ruleExpression ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:382:3: ( (lv_static_0_0= 'static' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:383:4: (lv_static_0_0= 'static' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:383:4: (lv_static_0_0= 'static' )
                    // InternalBacktrackingContentAssistTestLanguage.g:384:5: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)match(input,14,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_static_0_0, grammarAccess.getDefinitionAccess().getStaticStaticKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getDefinitionRule());
                      					}
                      					setWithLastConsumed(current, "static", lv_static_0_0 != null, "static");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getDefKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:400:3: ( (lv_constraintName_2_0= ruleIdentifier ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=33 && LA8_0<=34)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:401:4: (lv_constraintName_2_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:401:4: (lv_constraintName_2_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:402:5: lv_constraintName_2_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefinitionAccess().getConstraintNameIdentifierParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_constraintName_2_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"constraintName",
                      						lv_constraintName_2_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getColonKeyword_3());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:423:3: ( (lv_constrainedName_4_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:424:4: (lv_constrainedName_4_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:424:4: (lv_constrainedName_4_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:425:5: lv_constrainedName_4_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getConstrainedNameIdentifierParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_constrainedName_4_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"constrainedName",
              						lv_constrainedName_4_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:442:3: (otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:443:4: otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')'
                    {
                    otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:447:4: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID||(LA10_0>=33 && LA10_0<=34)||(LA10_0>=37 && LA10_0<=50)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:448:5: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:448:5: ( (lv_parameters_6_0= ruleParameter ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:449:6: (lv_parameters_6_0= ruleParameter )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:449:6: (lv_parameters_6_0= ruleParameter )
                            // InternalBacktrackingContentAssistTestLanguage.g:450:7: lv_parameters_6_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getDefinitionAccess().getParametersParameterParserRuleCall_5_1_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_12);
                            lv_parameters_6_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getDefinitionRule());
                              							}
                              							add(
                              								current,
                              								"parameters",
                              								lv_parameters_6_0,
                              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Parameter");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalBacktrackingContentAssistTestLanguage.g:467:5: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==17) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // InternalBacktrackingContentAssistTestLanguage.g:468:6: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
                            	    {
                            	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getCommaKeyword_5_1_1_0());
                            	      					
                            	    }
                            	    // InternalBacktrackingContentAssistTestLanguage.g:472:6: ( (lv_parameters_8_0= ruleParameter ) )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:473:7: (lv_parameters_8_0= ruleParameter )
                            	    {
                            	    // InternalBacktrackingContentAssistTestLanguage.g:473:7: (lv_parameters_8_0= ruleParameter )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:474:8: lv_parameters_8_0= ruleParameter
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getDefinitionAccess().getParametersParameterParserRuleCall_5_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_12);
                            	    lv_parameters_8_0=ruleParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getDefinitionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"parameters",
                            	      									lv_parameters_8_0,
                            	      									"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Parameter");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getColonKeyword_6());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:502:3: ( (lv_type_11_0= ruleTypeExp ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=33 && LA12_0<=34)||(LA12_0>=37 && LA12_0<=50)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:503:4: (lv_type_11_0= ruleTypeExp )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:503:4: (lv_type_11_0= ruleTypeExp )
                    // InternalBacktrackingContentAssistTestLanguage.g:504:5: lv_type_11_0= ruleTypeExp
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefinitionAccess().getTypeTypeExpParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_type_11_0=ruleTypeExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefinitionRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_11_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getDefinitionAccess().getEqualsSignKeyword_8());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:525:3: ( (lv_expression_13_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:526:4: (lv_expression_13_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:526:4: (lv_expression_13_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:527:5: lv_expression_13_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_13_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_13_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleDer"
    // InternalBacktrackingContentAssistTestLanguage.g:548:1: entryRuleDer returns [EObject current=null] : iv_ruleDer= ruleDer EOF ;
    public final EObject entryRuleDer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDer = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:548:44: (iv_ruleDer= ruleDer EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:549:2: iv_ruleDer= ruleDer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDer=ruleDer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDer; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDer"


    // $ANTLR start "ruleDer"
    // InternalBacktrackingContentAssistTestLanguage.g:555:1: ruleDer returns [EObject current=null] : (otherlv_0= 'derive' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleDer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:556:1: ( (otherlv_0= 'derive' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:557:2: (otherlv_0= 'derive' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:557:2: (otherlv_0= 'derive' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:558:3: otherlv_0= 'derive' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDerAccess().getDeriveKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDerAccess().getColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:566:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:567:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:567:4: (lv_expression_2_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:568:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDerAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDerRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDer"


    // $ANTLR start "entryRuleInit"
    // InternalBacktrackingContentAssistTestLanguage.g:589:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:589:45: (iv_ruleInit= ruleInit EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:590:2: iv_ruleInit= ruleInit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInit=ruleInit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInit; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // InternalBacktrackingContentAssistTestLanguage.g:596:1: ruleInit returns [EObject current=null] : (otherlv_0= 'init' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:597:1: ( (otherlv_0= 'init' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:598:2: (otherlv_0= 'init' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:598:2: (otherlv_0= 'init' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:599:3: otherlv_0= 'init' otherlv_1= ':' ( (lv_expression_2_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitAccess().getInitKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitAccess().getColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:607:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:608:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:608:4: (lv_expression_2_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:609:5: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitAccess().getExpressionExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleInvariant"
    // InternalBacktrackingContentAssistTestLanguage.g:630:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:630:50: (iv_ruleInvariant= ruleInvariant EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:631:2: iv_ruleInvariant= ruleInvariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalBacktrackingContentAssistTestLanguage.g:637:1: ruleInvariant returns [EObject current=null] : (otherlv_0= 'inv' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_constraintName_1_0 = null;

        EObject lv_expression_3_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:638:1: ( (otherlv_0= 'inv' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:639:2: (otherlv_0= 'inv' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:639:2: (otherlv_0= 'inv' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:640:3: otherlv_0= 'inv' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:644:3: ( (lv_constraintName_1_0= ruleIdentifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=33 && LA13_0<=34)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:645:4: (lv_constraintName_1_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:645:4: (lv_constraintName_1_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:646:5: lv_constraintName_1_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getInvariantAccess().getConstraintNameIdentifierParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_constraintName_1_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getInvariantRule());
                      					}
                      					set(
                      						current,
                      						"constraintName",
                      						lv_constraintName_1_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInvariantAccess().getColonKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:667:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:668:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:668:4: (lv_expression_3_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:669:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvariantAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvariantRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRuleOperationContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:690:1: entryRuleOperationContextDecl returns [EObject current=null] : iv_ruleOperationContextDecl= ruleOperationContextDecl EOF ;
    public final EObject entryRuleOperationContextDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationContextDecl = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:690:61: (iv_ruleOperationContextDecl= ruleOperationContextDecl EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:691:2: iv_ruleOperationContextDecl= ruleOperationContextDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationContextDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperationContextDecl=ruleOperationContextDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationContextDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationContextDecl"


    // $ANTLR start "ruleOperationContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:697:1: ruleOperationContextDecl returns [EObject current=null] : (otherlv_0= 'context' ( (lv_operation_1_0= ruleOperationRef ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleTypeExp ) )? ( ( (lv_pres_9_0= rulePre ) ) | ( (lv_posts_10_0= rulePost ) ) | ( (lv_bodies_11_0= ruleBody ) ) )* ) ;
    public final EObject ruleOperationContextDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_operation_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_pres_9_0 = null;

        EObject lv_posts_10_0 = null;

        EObject lv_bodies_11_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:698:1: ( (otherlv_0= 'context' ( (lv_operation_1_0= ruleOperationRef ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleTypeExp ) )? ( ( (lv_pres_9_0= rulePre ) ) | ( (lv_posts_10_0= rulePost ) ) | ( (lv_bodies_11_0= ruleBody ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:699:2: (otherlv_0= 'context' ( (lv_operation_1_0= ruleOperationRef ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleTypeExp ) )? ( ( (lv_pres_9_0= rulePre ) ) | ( (lv_posts_10_0= rulePost ) ) | ( (lv_bodies_11_0= ruleBody ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:699:2: (otherlv_0= 'context' ( (lv_operation_1_0= ruleOperationRef ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleTypeExp ) )? ( ( (lv_pres_9_0= rulePre ) ) | ( (lv_posts_10_0= rulePost ) ) | ( (lv_bodies_11_0= ruleBody ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:700:3: otherlv_0= 'context' ( (lv_operation_1_0= ruleOperationRef ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleTypeExp ) )? ( ( (lv_pres_9_0= rulePre ) ) | ( (lv_posts_10_0= rulePost ) ) | ( (lv_bodies_11_0= ruleBody ) ) )*
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationContextDeclAccess().getContextKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:704:3: ( (lv_operation_1_0= ruleOperationRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:705:4: (lv_operation_1_0= ruleOperationRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:705:4: (lv_operation_1_0= ruleOperationRef )
            // InternalBacktrackingContentAssistTestLanguage.g:706:5: lv_operation_1_0= ruleOperationRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationContextDeclAccess().getOperationOperationRefParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_operation_1_0=ruleOperationRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationContextDeclRule());
              					}
              					set(
              						current,
              						"operation",
              						lv_operation_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OperationRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperationContextDeclAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:727:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||(LA15_0>=33 && LA15_0<=34)||(LA15_0>=37 && LA15_0<=50)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:728:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:728:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:729:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:729:5: (lv_parameters_3_0= ruleParameter )
                    // InternalBacktrackingContentAssistTestLanguage.g:730:6: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOperationContextDeclAccess().getParametersParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOperationContextDeclRule());
                      						}
                      						add(
                      							current,
                      							"parameters",
                      							lv_parameters_3_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Parameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:747:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBacktrackingContentAssistTestLanguage.g:748:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getOperationContextDeclAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalBacktrackingContentAssistTestLanguage.g:752:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:753:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalBacktrackingContentAssistTestLanguage.g:753:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:754:7: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOperationContextDeclAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOperationContextDeclRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parameters",
                    	      								lv_parameters_5_0,
                    	      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Parameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOperationContextDeclAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationContextDeclAccess().getColonKeyword_5());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:781:3: ( (lv_type_8_0= ruleTypeExp ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||(LA16_0>=33 && LA16_0<=34)||(LA16_0>=37 && LA16_0<=50)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:782:4: (lv_type_8_0= ruleTypeExp )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:782:4: (lv_type_8_0= ruleTypeExp )
                    // InternalBacktrackingContentAssistTestLanguage.g:783:5: lv_type_8_0= ruleTypeExp
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getOperationContextDeclAccess().getTypeTypeExpParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_type_8_0=ruleTypeExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getOperationContextDeclRule());
                      					}
                      					set(
                      						current,
                      						"type",
                      						lv_type_8_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalBacktrackingContentAssistTestLanguage.g:800:3: ( ( (lv_pres_9_0= rulePre ) ) | ( (lv_posts_10_0= rulePost ) ) | ( (lv_bodies_11_0= ruleBody ) ) )*
            loop17:
            do {
                int alt17=4;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt17=1;
                    }
                    break;
                case 25:
                    {
                    alt17=2;
                    }
                    break;
                case 11:
                    {
                    alt17=3;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:801:4: ( (lv_pres_9_0= rulePre ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:801:4: ( (lv_pres_9_0= rulePre ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:802:5: (lv_pres_9_0= rulePre )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:802:5: (lv_pres_9_0= rulePre )
            	    // InternalBacktrackingContentAssistTestLanguage.g:803:6: lv_pres_9_0= rulePre
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperationContextDeclAccess().getPresPreParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_pres_9_0=rulePre();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOperationContextDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"pres",
            	      							lv_pres_9_0,
            	      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Pre");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:821:4: ( (lv_posts_10_0= rulePost ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:821:4: ( (lv_posts_10_0= rulePost ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:822:5: (lv_posts_10_0= rulePost )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:822:5: (lv_posts_10_0= rulePost )
            	    // InternalBacktrackingContentAssistTestLanguage.g:823:6: lv_posts_10_0= rulePost
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperationContextDeclAccess().getPostsPostParserRuleCall_7_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_posts_10_0=rulePost();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOperationContextDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"posts",
            	      							lv_posts_10_0,
            	      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Post");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:841:4: ( (lv_bodies_11_0= ruleBody ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:841:4: ( (lv_bodies_11_0= ruleBody ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:842:5: (lv_bodies_11_0= ruleBody )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:842:5: (lv_bodies_11_0= ruleBody )
            	    // InternalBacktrackingContentAssistTestLanguage.g:843:6: lv_bodies_11_0= ruleBody
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperationContextDeclAccess().getBodiesBodyParserRuleCall_7_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_bodies_11_0=ruleBody();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOperationContextDeclRule());
            	      						}
            	      						add(
            	      							current,
            	      							"bodies",
            	      							lv_bodies_11_0,
            	      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Body");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationContextDecl"


    // $ANTLR start "entryRuleOperationRef"
    // InternalBacktrackingContentAssistTestLanguage.g:865:1: entryRuleOperationRef returns [EObject current=null] : iv_ruleOperationRef= ruleOperationRef EOF ;
    public final EObject entryRuleOperationRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:865:53: (iv_ruleOperationRef= ruleOperationRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:866:2: iv_ruleOperationRef= ruleOperationRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOperationRef=ruleOperationRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperationRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationRef"


    // $ANTLR start "ruleOperationRef"
    // InternalBacktrackingContentAssistTestLanguage.g:872:1: ruleOperationRef returns [EObject current=null] : (this_QualifiedOperationRef_0= ruleQualifiedOperationRef | this_SimpleOperationRef_1= ruleSimpleOperationRef ) ;
    public final EObject ruleOperationRef() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedOperationRef_0 = null;

        EObject this_SimpleOperationRef_1 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:873:1: ( (this_QualifiedOperationRef_0= ruleQualifiedOperationRef | this_SimpleOperationRef_1= ruleSimpleOperationRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:874:2: (this_QualifiedOperationRef_0= ruleQualifiedOperationRef | this_SimpleOperationRef_1= ruleSimpleOperationRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:874:2: (this_QualifiedOperationRef_0= ruleQualifiedOperationRef | this_SimpleOperationRef_1= ruleSimpleOperationRef )
            int alt18=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==27) ) {
                    alt18=1;
                }
                else if ( (LA18_1==EOF||LA18_1==16) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==EOF||LA18_2==16) ) {
                    alt18=2;
                }
                else if ( (LA18_2==27) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA18_3 = input.LA(2);

                if ( (LA18_3==27) ) {
                    alt18=1;
                }
                else if ( (LA18_3==EOF||LA18_3==16) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:875:3: this_QualifiedOperationRef_0= ruleQualifiedOperationRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationRefAccess().getQualifiedOperationRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QualifiedOperationRef_0=ruleQualifiedOperationRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QualifiedOperationRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:887:3: this_SimpleOperationRef_1= ruleSimpleOperationRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOperationRefAccess().getSimpleOperationRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimpleOperationRef_1=ruleSimpleOperationRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleOperationRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationRef"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalBacktrackingContentAssistTestLanguage.g:902:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:902:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:903:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalBacktrackingContentAssistTestLanguage.g:909:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_package_1_0= rulePackageRef ) ) ( (lv_contexts_2_0= ruleContextDecl ) )* otherlv_3= 'endpackage' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_package_1_0 = null;

        EObject lv_contexts_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:910:1: ( (otherlv_0= 'package' ( (lv_package_1_0= rulePackageRef ) ) ( (lv_contexts_2_0= ruleContextDecl ) )* otherlv_3= 'endpackage' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:911:2: (otherlv_0= 'package' ( (lv_package_1_0= rulePackageRef ) ) ( (lv_contexts_2_0= ruleContextDecl ) )* otherlv_3= 'endpackage' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:911:2: (otherlv_0= 'package' ( (lv_package_1_0= rulePackageRef ) ) ( (lv_contexts_2_0= ruleContextDecl ) )* otherlv_3= 'endpackage' )
            // InternalBacktrackingContentAssistTestLanguage.g:912:3: otherlv_0= 'package' ( (lv_package_1_0= rulePackageRef ) ) ( (lv_contexts_2_0= ruleContextDecl ) )* otherlv_3= 'endpackage'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:916:3: ( (lv_package_1_0= rulePackageRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:917:4: (lv_package_1_0= rulePackageRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:917:4: (lv_package_1_0= rulePackageRef )
            // InternalBacktrackingContentAssistTestLanguage.g:918:5: lv_package_1_0= rulePackageRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getPackagePackageRefParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_package_1_0=rulePackageRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
              					}
              					set(
              						current,
              						"package",
              						lv_package_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PackageRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:935:3: ( (lv_contexts_2_0= ruleContextDecl ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==13) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:936:4: (lv_contexts_2_0= ruleContextDecl )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:936:4: (lv_contexts_2_0= ruleContextDecl )
            	    // InternalBacktrackingContentAssistTestLanguage.g:937:5: lv_contexts_2_0= ruleContextDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getContextsContextDeclParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_contexts_2_0=ruleContextDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"contexts",
            	      						lv_contexts_2_0,
            	      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.ContextDecl");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getPackageDeclarationAccess().getEndpackageKeyword_3());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRulePackageRef"
    // InternalBacktrackingContentAssistTestLanguage.g:962:1: entryRulePackageRef returns [EObject current=null] : iv_rulePackageRef= rulePackageRef EOF ;
    public final EObject entryRulePackageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:962:51: (iv_rulePackageRef= rulePackageRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:963:2: iv_rulePackageRef= rulePackageRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePackageRef=rulePackageRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageRef"


    // $ANTLR start "rulePackageRef"
    // InternalBacktrackingContentAssistTestLanguage.g:969:1: rulePackageRef returns [EObject current=null] : (this_QualifiedPackageRef_0= ruleQualifiedPackageRef | this_SimplePackageRef_1= ruleSimplePackageRef ) ;
    public final EObject rulePackageRef() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedPackageRef_0 = null;

        EObject this_SimplePackageRef_1 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:970:1: ( (this_QualifiedPackageRef_0= ruleQualifiedPackageRef | this_SimplePackageRef_1= ruleSimplePackageRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:971:2: (this_QualifiedPackageRef_0= ruleQualifiedPackageRef | this_SimplePackageRef_1= ruleSimplePackageRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:971:2: (this_QualifiedPackageRef_0= ruleQualifiedPackageRef | this_SimplePackageRef_1= ruleSimplePackageRef )
            int alt20=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==27) ) {
                    alt20=1;
                }
                else if ( (LA20_1==EOF||LA20_1==13||LA20_1==24) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==EOF||LA20_2==13||LA20_2==24) ) {
                    alt20=2;
                }
                else if ( (LA20_2==27) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==27) ) {
                    alt20=1;
                }
                else if ( (LA20_3==EOF||LA20_3==13||LA20_3==24) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:972:3: this_QualifiedPackageRef_0= ruleQualifiedPackageRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageRefAccess().getQualifiedPackageRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QualifiedPackageRef_0=ruleQualifiedPackageRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QualifiedPackageRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:984:3: this_SimplePackageRef_1= ruleSimplePackageRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPackageRefAccess().getSimplePackageRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimplePackageRef_1=ruleSimplePackageRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimplePackageRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageRef"


    // $ANTLR start "entryRuleParameter"
    // InternalBacktrackingContentAssistTestLanguage.g:999:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:999:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1000:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalBacktrackingContentAssistTestLanguage.g:1006:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleTypeExp ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1007:1: ( ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleTypeExp ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1008:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleTypeExp ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1008:2: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleTypeExp ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1009:3: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )? ( (lv_type_2_0= ruleTypeExp ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1009:3: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )?
            int alt21=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==12) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==12) ) {
                        alt21=1;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (LA21_3==12) ) {
                        alt21=1;
                    }
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1010:4: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':'
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1010:4: ( (lv_name_0_0= ruleIdentifier ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1011:5: (lv_name_0_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1011:5: (lv_name_0_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:1012:6: lv_name_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_name_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_0_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBacktrackingContentAssistTestLanguage.g:1034:3: ( (lv_type_2_0= ruleTypeExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1035:4: (lv_type_2_0= ruleTypeExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1035:4: (lv_type_2_0= ruleTypeExp )
            // InternalBacktrackingContentAssistTestLanguage.g:1036:5: lv_type_2_0= ruleTypeExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeExpParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_2_0=ruleTypeExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePost"
    // InternalBacktrackingContentAssistTestLanguage.g:1057:1: entryRulePost returns [EObject current=null] : iv_rulePost= rulePost EOF ;
    public final EObject entryRulePost() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePost = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1057:45: (iv_rulePost= rulePost EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1058:2: iv_rulePost= rulePost EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePost=rulePost();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePost; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePost"


    // $ANTLR start "rulePost"
    // InternalBacktrackingContentAssistTestLanguage.g:1064:1: rulePost returns [EObject current=null] : (otherlv_0= 'post' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject rulePost() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_constraintName_1_0 = null;

        EObject lv_expression_3_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1065:1: ( (otherlv_0= 'post' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1066:2: (otherlv_0= 'post' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1066:2: (otherlv_0= 'post' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1067:3: otherlv_0= 'post' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPostAccess().getPostKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1071:3: ( (lv_constraintName_1_0= ruleIdentifier ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID||(LA22_0>=33 && LA22_0<=34)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1072:4: (lv_constraintName_1_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1072:4: (lv_constraintName_1_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:1073:5: lv_constraintName_1_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPostAccess().getConstraintNameIdentifierParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_constraintName_1_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPostRule());
                      					}
                      					set(
                      						current,
                      						"constraintName",
                      						lv_constraintName_1_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPostAccess().getColonKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1094:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1095:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1095:4: (lv_expression_3_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:1096:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPostAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPostRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePost"


    // $ANTLR start "entryRulePre"
    // InternalBacktrackingContentAssistTestLanguage.g:1117:1: entryRulePre returns [EObject current=null] : iv_rulePre= rulePre EOF ;
    public final EObject entryRulePre() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePre = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1117:44: (iv_rulePre= rulePre EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1118:2: iv_rulePre= rulePre EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePre=rulePre();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePre; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePre"


    // $ANTLR start "rulePre"
    // InternalBacktrackingContentAssistTestLanguage.g:1124:1: rulePre returns [EObject current=null] : (otherlv_0= 'pre' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject rulePre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_constraintName_1_0 = null;

        EObject lv_expression_3_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1125:1: ( (otherlv_0= 'pre' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1126:2: (otherlv_0= 'pre' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1126:2: (otherlv_0= 'pre' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1127:3: otherlv_0= 'pre' ( (lv_constraintName_1_0= ruleIdentifier ) )? otherlv_2= ':' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPreAccess().getPreKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1131:3: ( (lv_constraintName_1_0= ruleIdentifier ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||(LA23_0>=33 && LA23_0<=34)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1132:4: (lv_constraintName_1_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1132:4: (lv_constraintName_1_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:1133:5: lv_constraintName_1_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPreAccess().getConstraintNameIdentifierParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_5);
                    lv_constraintName_1_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPreRule());
                      					}
                      					set(
                      						current,
                      						"constraintName",
                      						lv_constraintName_1_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPreAccess().getColonKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1154:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1155:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1155:4: (lv_expression_3_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:1156:5: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreAccess().getExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_3_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePre"


    // $ANTLR start "entryRulePropertyContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:1177:1: entryRulePropertyContextDecl returns [EObject current=null] : iv_rulePropertyContextDecl= rulePropertyContextDecl EOF ;
    public final EObject entryRulePropertyContextDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyContextDecl = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1177:60: (iv_rulePropertyContextDecl= rulePropertyContextDecl EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1178:2: iv_rulePropertyContextDecl= rulePropertyContextDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyContextDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyContextDecl=rulePropertyContextDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyContextDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyContextDecl"


    // $ANTLR start "rulePropertyContextDecl"
    // InternalBacktrackingContentAssistTestLanguage.g:1184:1: rulePropertyContextDecl returns [EObject current=null] : (otherlv_0= 'context' ( (lv_property_1_0= rulePropertyRef ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) ( ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )? | ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? ) ) ) ;
    public final EObject rulePropertyContextDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_property_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_init_4_0 = null;

        EObject lv_der_5_0 = null;

        EObject lv_der_6_0 = null;

        EObject lv_init_7_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1185:1: ( (otherlv_0= 'context' ( (lv_property_1_0= rulePropertyRef ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) ( ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )? | ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1186:2: (otherlv_0= 'context' ( (lv_property_1_0= rulePropertyRef ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) ( ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )? | ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1186:2: (otherlv_0= 'context' ( (lv_property_1_0= rulePropertyRef ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) ( ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )? | ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1187:3: otherlv_0= 'context' ( (lv_property_1_0= rulePropertyRef ) ) otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) ( ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )? | ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? ) )
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyContextDeclAccess().getContextKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1191:3: ( (lv_property_1_0= rulePropertyRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1192:4: (lv_property_1_0= rulePropertyRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1192:4: (lv_property_1_0= rulePropertyRef )
            // InternalBacktrackingContentAssistTestLanguage.g:1193:5: lv_property_1_0= rulePropertyRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyContextDeclAccess().getPropertyPropertyRefParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_property_1_0=rulePropertyRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyContextDeclRule());
              					}
              					set(
              						current,
              						"property",
              						lv_property_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PropertyRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPropertyContextDeclAccess().getColonKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1214:3: ( (lv_type_3_0= ruleTypeExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1215:4: (lv_type_3_0= ruleTypeExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1215:4: (lv_type_3_0= ruleTypeExp )
            // InternalBacktrackingContentAssistTestLanguage.g:1216:5: lv_type_3_0= ruleTypeExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyContextDeclAccess().getTypeTypeExpParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_20);
            lv_type_3_0=ruleTypeExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyContextDeclRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:1233:3: ( ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )? | ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EOF||LA27_0==13||LA27_0==21||(LA27_0>=23 && LA27_0<=24)) ) {
                alt27=1;
            }
            else if ( (LA27_0==20) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1234:4: ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )?
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1234:4: ( ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )? )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==21) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1235:5: ( (lv_init_4_0= ruleInit ) ) ( (lv_der_5_0= ruleDer ) )?
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:1235:5: ( (lv_init_4_0= ruleInit ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:1236:6: (lv_init_4_0= ruleInit )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:1236:6: (lv_init_4_0= ruleInit )
                            // InternalBacktrackingContentAssistTestLanguage.g:1237:7: lv_init_4_0= ruleInit
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyContextDeclAccess().getInitInitParserRuleCall_4_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_21);
                            lv_init_4_0=ruleInit();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyContextDeclRule());
                              							}
                              							set(
                              								current,
                              								"init",
                              								lv_init_4_0,
                              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Init");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalBacktrackingContentAssistTestLanguage.g:1254:5: ( (lv_der_5_0= ruleDer ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==20) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalBacktrackingContentAssistTestLanguage.g:1255:6: (lv_der_5_0= ruleDer )
                                    {
                                    // InternalBacktrackingContentAssistTestLanguage.g:1255:6: (lv_der_5_0= ruleDer )
                                    // InternalBacktrackingContentAssistTestLanguage.g:1256:7: lv_der_5_0= ruleDer
                                    {
                                    if ( state.backtracking==0 ) {

                                      							newCompositeNode(grammarAccess.getPropertyContextDeclAccess().getDerDerParserRuleCall_4_0_1_0());
                                      						
                                    }
                                    pushFollow(FollowSets000.FOLLOW_2);
                                    lv_der_5_0=ruleDer();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      							if (current==null) {
                                      								current = createModelElementForParent(grammarAccess.getPropertyContextDeclRule());
                                      							}
                                      							set(
                                      								current,
                                      								"der",
                                      								lv_der_5_0,
                                      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Der");
                                      							afterParserOrEnumRuleCall();
                                      						
                                    }

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1275:4: ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1275:4: ( ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )? )
                    // InternalBacktrackingContentAssistTestLanguage.g:1276:5: ( (lv_der_6_0= ruleDer ) ) ( (lv_init_7_0= ruleInit ) )?
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1276:5: ( (lv_der_6_0= ruleDer ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1277:6: (lv_der_6_0= ruleDer )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1277:6: (lv_der_6_0= ruleDer )
                    // InternalBacktrackingContentAssistTestLanguage.g:1278:7: lv_der_6_0= ruleDer
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getPropertyContextDeclAccess().getDerDerParserRuleCall_4_1_0_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    lv_der_6_0=ruleDer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getPropertyContextDeclRule());
                      							}
                      							set(
                      								current,
                      								"der",
                      								lv_der_6_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Der");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1295:5: ( (lv_init_7_0= ruleInit ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==21) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1296:6: (lv_init_7_0= ruleInit )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:1296:6: (lv_init_7_0= ruleInit )
                            // InternalBacktrackingContentAssistTestLanguage.g:1297:7: lv_init_7_0= ruleInit
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyContextDeclAccess().getInitInitParserRuleCall_4_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_init_7_0=ruleInit();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getPropertyContextDeclRule());
                              							}
                              							set(
                              								current,
                              								"init",
                              								lv_init_7_0,
                              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Init");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyContextDecl"


    // $ANTLR start "entryRulePropertyRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1320:1: entryRulePropertyRef returns [EObject current=null] : iv_rulePropertyRef= rulePropertyRef EOF ;
    public final EObject entryRulePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1320:52: (iv_rulePropertyRef= rulePropertyRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1321:2: iv_rulePropertyRef= rulePropertyRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyRef=rulePropertyRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyRef"


    // $ANTLR start "rulePropertyRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1327:1: rulePropertyRef returns [EObject current=null] : (this_QualifiedPropertyRef_0= ruleQualifiedPropertyRef | this_SimplePropertyRef_1= ruleSimplePropertyRef ) ;
    public final EObject rulePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedPropertyRef_0 = null;

        EObject this_SimplePropertyRef_1 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1328:1: ( (this_QualifiedPropertyRef_0= ruleQualifiedPropertyRef | this_SimplePropertyRef_1= ruleSimplePropertyRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1329:2: (this_QualifiedPropertyRef_0= ruleQualifiedPropertyRef | this_SimplePropertyRef_1= ruleSimplePropertyRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1329:2: (this_QualifiedPropertyRef_0= ruleQualifiedPropertyRef | this_SimplePropertyRef_1= ruleSimplePropertyRef )
            int alt28=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==27) ) {
                    alt28=1;
                }
                else if ( (LA28_1==EOF||LA28_1==12) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==27) ) {
                    alt28=1;
                }
                else if ( (LA28_2==EOF||LA28_2==12) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==27) ) {
                    alt28=1;
                }
                else if ( (LA28_3==EOF||LA28_3==12) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1330:3: this_QualifiedPropertyRef_0= ruleQualifiedPropertyRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyRefAccess().getQualifiedPropertyRefParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_QualifiedPropertyRef_0=ruleQualifiedPropertyRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_QualifiedPropertyRef_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1342:3: this_SimplePropertyRef_1= ruleSimplePropertyRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyRefAccess().getSimplePropertyRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimplePropertyRef_1=ruleSimplePropertyRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimplePropertyRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyRef"


    // $ANTLR start "entryRuleQualifiedClassifierRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1357:1: entryRuleQualifiedClassifierRef returns [EObject current=null] : iv_ruleQualifiedClassifierRef= ruleQualifiedClassifierRef EOF ;
    public final EObject entryRuleQualifiedClassifierRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedClassifierRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1357:63: (iv_ruleQualifiedClassifierRef= ruleQualifiedClassifierRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1358:2: iv_ruleQualifiedClassifierRef= ruleQualifiedClassifierRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedClassifierRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedClassifierRef=ruleQualifiedClassifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedClassifierRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedClassifierRef"


    // $ANTLR start "ruleQualifiedClassifierRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1364:1: ruleQualifiedClassifierRef returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleClassifierRef ) ) ) ;
    public final EObject ruleQualifiedClassifierRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        EObject lv_element_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1365:1: ( ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleClassifierRef ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1366:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleClassifierRef ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1366:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleClassifierRef ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1367:3: ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleClassifierRef ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1367:3: ( (lv_namespace_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1368:4: (lv_namespace_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1368:4: (lv_namespace_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1369:5: lv_namespace_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedClassifierRefAccess().getNamespaceIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_namespace_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedClassifierRefRule());
              					}
              					set(
              						current,
              						"namespace",
              						lv_namespace_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQualifiedClassifierRefAccess().getColonColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1390:3: ( (lv_element_2_0= ruleClassifierRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1391:4: (lv_element_2_0= ruleClassifierRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1391:4: (lv_element_2_0= ruleClassifierRef )
            // InternalBacktrackingContentAssistTestLanguage.g:1392:5: lv_element_2_0= ruleClassifierRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedClassifierRefAccess().getElementClassifierRefParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_2_0=ruleClassifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedClassifierRefRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.ClassifierRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedClassifierRef"


    // $ANTLR start "entryRuleQualifiedOperationRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1413:1: entryRuleQualifiedOperationRef returns [EObject current=null] : iv_ruleQualifiedOperationRef= ruleQualifiedOperationRef EOF ;
    public final EObject entryRuleQualifiedOperationRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedOperationRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1413:62: (iv_ruleQualifiedOperationRef= ruleQualifiedOperationRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1414:2: iv_ruleQualifiedOperationRef= ruleQualifiedOperationRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedOperationRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedOperationRef=ruleQualifiedOperationRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedOperationRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedOperationRef"


    // $ANTLR start "ruleQualifiedOperationRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1420:1: ruleQualifiedOperationRef returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleOperationRef ) ) ) ;
    public final EObject ruleQualifiedOperationRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        EObject lv_element_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1421:1: ( ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleOperationRef ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1422:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleOperationRef ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1422:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleOperationRef ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1423:3: ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleOperationRef ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1423:3: ( (lv_namespace_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1424:4: (lv_namespace_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1424:4: (lv_namespace_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1425:5: lv_namespace_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedOperationRefAccess().getNamespaceIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_namespace_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedOperationRefRule());
              					}
              					set(
              						current,
              						"namespace",
              						lv_namespace_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQualifiedOperationRefAccess().getColonColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1446:3: ( (lv_element_2_0= ruleOperationRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1447:4: (lv_element_2_0= ruleOperationRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1447:4: (lv_element_2_0= ruleOperationRef )
            // InternalBacktrackingContentAssistTestLanguage.g:1448:5: lv_element_2_0= ruleOperationRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedOperationRefAccess().getElementOperationRefParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_2_0=ruleOperationRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedOperationRefRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OperationRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedOperationRef"


    // $ANTLR start "entryRuleQualifiedPropertyRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1469:1: entryRuleQualifiedPropertyRef returns [EObject current=null] : iv_ruleQualifiedPropertyRef= ruleQualifiedPropertyRef EOF ;
    public final EObject entryRuleQualifiedPropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPropertyRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1469:61: (iv_ruleQualifiedPropertyRef= ruleQualifiedPropertyRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1470:2: iv_ruleQualifiedPropertyRef= ruleQualifiedPropertyRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedPropertyRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedPropertyRef=ruleQualifiedPropertyRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedPropertyRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedPropertyRef"


    // $ANTLR start "ruleQualifiedPropertyRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1476:1: ruleQualifiedPropertyRef returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePropertyRef ) ) ) ;
    public final EObject ruleQualifiedPropertyRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        EObject lv_element_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1477:1: ( ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePropertyRef ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1478:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePropertyRef ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1478:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePropertyRef ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1479:3: ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePropertyRef ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1479:3: ( (lv_namespace_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1480:4: (lv_namespace_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1480:4: (lv_namespace_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1481:5: lv_namespace_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedPropertyRefAccess().getNamespaceIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_namespace_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedPropertyRefRule());
              					}
              					set(
              						current,
              						"namespace",
              						lv_namespace_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQualifiedPropertyRefAccess().getColonColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1502:3: ( (lv_element_2_0= rulePropertyRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1503:4: (lv_element_2_0= rulePropertyRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1503:4: (lv_element_2_0= rulePropertyRef )
            // InternalBacktrackingContentAssistTestLanguage.g:1504:5: lv_element_2_0= rulePropertyRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedPropertyRefAccess().getElementPropertyRefParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_2_0=rulePropertyRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedPropertyRefRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PropertyRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedPropertyRef"


    // $ANTLR start "entryRuleQualifiedPackageRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1525:1: entryRuleQualifiedPackageRef returns [EObject current=null] : iv_ruleQualifiedPackageRef= ruleQualifiedPackageRef EOF ;
    public final EObject entryRuleQualifiedPackageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPackageRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1525:60: (iv_ruleQualifiedPackageRef= ruleQualifiedPackageRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1526:2: iv_ruleQualifiedPackageRef= ruleQualifiedPackageRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedPackageRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedPackageRef=ruleQualifiedPackageRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedPackageRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedPackageRef"


    // $ANTLR start "ruleQualifiedPackageRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1532:1: ruleQualifiedPackageRef returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePackageRef ) ) ) ;
    public final EObject ruleQualifiedPackageRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        EObject lv_element_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1533:1: ( ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePackageRef ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1534:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePackageRef ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1534:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePackageRef ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1535:3: ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= rulePackageRef ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1535:3: ( (lv_namespace_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1536:4: (lv_namespace_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1536:4: (lv_namespace_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1537:5: lv_namespace_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedPackageRefAccess().getNamespaceIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_namespace_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedPackageRefRule());
              					}
              					set(
              						current,
              						"namespace",
              						lv_namespace_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQualifiedPackageRefAccess().getColonColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1558:3: ( (lv_element_2_0= rulePackageRef ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1559:4: (lv_element_2_0= rulePackageRef )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1559:4: (lv_element_2_0= rulePackageRef )
            // InternalBacktrackingContentAssistTestLanguage.g:1560:5: lv_element_2_0= rulePackageRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getQualifiedPackageRefAccess().getElementPackageRefParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_2_0=rulePackageRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getQualifiedPackageRefRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PackageRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedPackageRef"


    // $ANTLR start "entryRuleSimpleClassifierRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1581:1: entryRuleSimpleClassifierRef returns [EObject current=null] : iv_ruleSimpleClassifierRef= ruleSimpleClassifierRef EOF ;
    public final EObject entryRuleSimpleClassifierRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleClassifierRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1581:60: (iv_ruleSimpleClassifierRef= ruleSimpleClassifierRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1582:2: iv_ruleSimpleClassifierRef= ruleSimpleClassifierRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleClassifierRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleClassifierRef=ruleSimpleClassifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleClassifierRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleClassifierRef"


    // $ANTLR start "ruleSimpleClassifierRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1588:1: ruleSimpleClassifierRef returns [EObject current=null] : ( (lv_classifier_0_0= ruleIdentifier ) ) ;
    public final EObject ruleSimpleClassifierRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_classifier_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1589:1: ( ( (lv_classifier_0_0= ruleIdentifier ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1590:2: ( (lv_classifier_0_0= ruleIdentifier ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1590:2: ( (lv_classifier_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1591:3: (lv_classifier_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1591:3: (lv_classifier_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1592:4: lv_classifier_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSimpleClassifierRefAccess().getClassifierIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_classifier_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSimpleClassifierRefRule());
              				}
              				set(
              					current,
              					"classifier",
              					lv_classifier_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleClassifierRef"


    // $ANTLR start "entryRuleSimpleOperationRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1612:1: entryRuleSimpleOperationRef returns [EObject current=null] : iv_ruleSimpleOperationRef= ruleSimpleOperationRef EOF ;
    public final EObject entryRuleSimpleOperationRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOperationRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1612:59: (iv_ruleSimpleOperationRef= ruleSimpleOperationRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1613:2: iv_ruleSimpleOperationRef= ruleSimpleOperationRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleOperationRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleOperationRef=ruleSimpleOperationRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleOperationRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleOperationRef"


    // $ANTLR start "ruleSimpleOperationRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1619:1: ruleSimpleOperationRef returns [EObject current=null] : ( (lv_operation_0_0= ruleIdentifier ) ) ;
    public final EObject ruleSimpleOperationRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_operation_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1620:1: ( ( (lv_operation_0_0= ruleIdentifier ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1621:2: ( (lv_operation_0_0= ruleIdentifier ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1621:2: ( (lv_operation_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1622:3: (lv_operation_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1622:3: (lv_operation_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1623:4: lv_operation_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSimpleOperationRefAccess().getOperationIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_operation_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSimpleOperationRefRule());
              				}
              				set(
              					current,
              					"operation",
              					lv_operation_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleOperationRef"


    // $ANTLR start "entryRuleSimplePackageRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1643:1: entryRuleSimplePackageRef returns [EObject current=null] : iv_ruleSimplePackageRef= ruleSimplePackageRef EOF ;
    public final EObject entryRuleSimplePackageRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePackageRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1643:57: (iv_ruleSimplePackageRef= ruleSimplePackageRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1644:2: iv_ruleSimplePackageRef= ruleSimplePackageRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimplePackageRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimplePackageRef=ruleSimplePackageRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimplePackageRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimplePackageRef"


    // $ANTLR start "ruleSimplePackageRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1650:1: ruleSimplePackageRef returns [EObject current=null] : ( (lv_package_0_0= ruleIdentifier ) ) ;
    public final EObject ruleSimplePackageRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_package_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1651:1: ( ( (lv_package_0_0= ruleIdentifier ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1652:2: ( (lv_package_0_0= ruleIdentifier ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1652:2: ( (lv_package_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1653:3: (lv_package_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1653:3: (lv_package_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1654:4: lv_package_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSimplePackageRefAccess().getPackageIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_package_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSimplePackageRefRule());
              				}
              				set(
              					current,
              					"package",
              					lv_package_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimplePackageRef"


    // $ANTLR start "entryRuleSimplePropertyRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1674:1: entryRuleSimplePropertyRef returns [EObject current=null] : iv_ruleSimplePropertyRef= ruleSimplePropertyRef EOF ;
    public final EObject entryRuleSimplePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePropertyRef = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1674:58: (iv_ruleSimplePropertyRef= ruleSimplePropertyRef EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1675:2: iv_ruleSimplePropertyRef= ruleSimplePropertyRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimplePropertyRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimplePropertyRef=ruleSimplePropertyRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimplePropertyRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimplePropertyRef"


    // $ANTLR start "ruleSimplePropertyRef"
    // InternalBacktrackingContentAssistTestLanguage.g:1681:1: ruleSimplePropertyRef returns [EObject current=null] : ( (lv_feature_0_0= ruleIdentifier ) ) ;
    public final EObject ruleSimplePropertyRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_feature_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1682:1: ( ( (lv_feature_0_0= ruleIdentifier ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1683:2: ( (lv_feature_0_0= ruleIdentifier ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1683:2: ( (lv_feature_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1684:3: (lv_feature_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1684:3: (lv_feature_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:1685:4: lv_feature_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSimplePropertyRefAccess().getFeatureIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_feature_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSimplePropertyRefRule());
              				}
              				set(
              					current,
              					"feature",
              					lv_feature_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimplePropertyRef"


    // $ANTLR start "entryRuleNavigationExp"
    // InternalBacktrackingContentAssistTestLanguage.g:1705:1: entryRuleNavigationExp returns [EObject current=null] : iv_ruleNavigationExp= ruleNavigationExp EOF ;
    public final EObject entryRuleNavigationExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1705:54: (iv_ruleNavigationExp= ruleNavigationExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1706:2: iv_ruleNavigationExp= ruleNavigationExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigationExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigationExp=ruleNavigationExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigationExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigationExp"


    // $ANTLR start "ruleNavigationExp"
    // InternalBacktrackingContentAssistTestLanguage.g:1712:1: ruleNavigationExp returns [EObject current=null] : (this_SubNavigationExp_0= ruleSubNavigationExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? ) ;
    public final EObject ruleNavigationExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_5_1=null;
        Token lv_op_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_SubNavigationExp_0 = null;

        EObject lv_argument_3_0 = null;

        AntlrDatatypeRuleToken lv_messageName_6_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_arguments_10_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1713:1: ( (this_SubNavigationExp_0= ruleSubNavigationExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1714:2: (this_SubNavigationExp_0= ruleSubNavigationExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1714:2: (this_SubNavigationExp_0= ruleSubNavigationExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? )
            // InternalBacktrackingContentAssistTestLanguage.g:1715:3: this_SubNavigationExp_0= ruleSubNavigationExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNavigationExpAccess().getSubNavigationExpParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_SubNavigationExp_0=ruleSubNavigationExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubNavigationExp_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1726:3: ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=28 && LA33_0<=29)) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=30 && LA33_0<=31)) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1727:4: ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1727:4: ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1728:5: () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1728:5: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:1729:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getNavigationExpAccess().getInfixExpSourceAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1738:5: ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1739:6: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1739:6: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1740:7: (lv_op_2_1= '.' | lv_op_2_2= '->' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1740:7: (lv_op_2_1= '.' | lv_op_2_2= '->' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==28) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==29) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1741:8: lv_op_2_1= '.'
                            {
                            lv_op_2_1=(Token)match(input,28,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_1, grammarAccess.getNavigationExpAccess().getOpFullStopKeyword_1_0_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigationExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1752:8: lv_op_2_2= '->'
                            {
                            lv_op_2_2=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_2, grammarAccess.getNavigationExpAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigationExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1765:5: ( (lv_argument_3_0= ruleNavigatingExp ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1766:6: (lv_argument_3_0= ruleNavigatingExp )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1766:6: (lv_argument_3_0= ruleNavigatingExp )
                    // InternalBacktrackingContentAssistTestLanguage.g:1767:7: lv_argument_3_0= ruleNavigatingExp
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigationExpAccess().getArgumentNavigatingExpParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_argument_3_0=ruleNavigatingExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigationExpRule());
                      							}
                      							set(
                      								current,
                      								"argument",
                      								lv_argument_3_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NavigatingExp");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1786:4: ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1786:4: ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' )
                    // InternalBacktrackingContentAssistTestLanguage.g:1787:5: () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')'
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1787:5: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:1788:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getNavigationExpAccess().getOclMessageSourceAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1797:5: ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1798:6: ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1798:6: ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1799:7: (lv_op_5_1= '^^' | lv_op_5_2= '^' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1799:7: (lv_op_5_1= '^^' | lv_op_5_2= '^' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==30) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==31) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1800:8: lv_op_5_1= '^^'
                            {
                            lv_op_5_1=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_5_1, grammarAccess.getNavigationExpAccess().getOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigationExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_5_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1811:8: lv_op_5_2= '^'
                            {
                            lv_op_5_2=(Token)match(input,31,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_5_2, grammarAccess.getNavigationExpAccess().getOpCircumflexAccentKeyword_1_1_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigationExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_5_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1824:5: ( (lv_messageName_6_0= ruleIdentifier ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1825:6: (lv_messageName_6_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1825:6: (lv_messageName_6_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:1826:7: lv_messageName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigationExpAccess().getMessageNameIdentifierParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_messageName_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigationExpRule());
                      							}
                      							set(
                      								current,
                      								"messageName",
                      								lv_messageName_6_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getNavigationExpAccess().getLeftParenthesisKeyword_1_1_3());
                      				
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:1847:5: ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=RULE_INT && LA32_0<=RULE_STRING)||LA32_0==16||(LA32_0>=32 && LA32_0<=34)||(LA32_0>=36 && LA32_0<=50)||(LA32_0>=54 && LA32_0<=57)||LA32_0==69||(LA32_0>=75 && LA32_0<=76)||LA32_0==80) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1848:6: ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )*
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:1848:6: ( (lv_arguments_8_0= ruleOclMessageArg ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:1849:7: (lv_arguments_8_0= ruleOclMessageArg )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:1849:7: (lv_arguments_8_0= ruleOclMessageArg )
                            // InternalBacktrackingContentAssistTestLanguage.g:1850:8: lv_arguments_8_0= ruleOclMessageArg
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigationExpAccess().getArgumentsOclMessageArgParserRuleCall_1_1_4_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_12);
                            lv_arguments_8_0=ruleOclMessageArg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigationExpRule());
                              								}
                              								add(
                              									current,
                              									"arguments",
                              									lv_arguments_8_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OclMessageArg");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalBacktrackingContentAssistTestLanguage.g:1867:6: (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==17) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // InternalBacktrackingContentAssistTestLanguage.g:1868:7: otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) )
                            	    {
                            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_9, grammarAccess.getNavigationExpAccess().getCommaKeyword_1_1_4_1_0());
                            	      						
                            	    }
                            	    // InternalBacktrackingContentAssistTestLanguage.g:1872:7: ( (lv_arguments_10_0= ruleOclMessageArg ) )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:1873:8: (lv_arguments_10_0= ruleOclMessageArg )
                            	    {
                            	    // InternalBacktrackingContentAssistTestLanguage.g:1873:8: (lv_arguments_10_0= ruleOclMessageArg )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:1874:9: lv_arguments_10_0= ruleOclMessageArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getNavigationExpAccess().getArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_12);
                            	    lv_arguments_10_0=ruleOclMessageArg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getNavigationExpRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"arguments",
                            	      										lv_arguments_10_0,
                            	      										"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OclMessageArg");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop31;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getNavigationExpAccess().getRightParenthesisKeyword_1_1_5());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigationExp"


    // $ANTLR start "entryRuleNavigatingExp"
    // InternalBacktrackingContentAssistTestLanguage.g:1903:1: entryRuleNavigatingExp returns [EObject current=null] : iv_ruleNavigatingExp= ruleNavigatingExp EOF ;
    public final EObject entryRuleNavigatingExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatingExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1903:54: (iv_ruleNavigatingExp= ruleNavigatingExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:1904:2: iv_ruleNavigatingExp= ruleNavigatingExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNavigatingExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNavigatingExp=ruleNavigatingExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNavigatingExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatingExp"


    // $ANTLR start "ruleNavigatingExp"
    // InternalBacktrackingContentAssistTestLanguage.g:1910:1: ruleNavigatingExp returns [EObject current=null] : (this_SubNavigatingExp_0= ruleSubNavigatingExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? ) ;
    public final EObject ruleNavigatingExp() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_5_1=null;
        Token lv_op_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_SubNavigatingExp_0 = null;

        EObject lv_argument_3_0 = null;

        AntlrDatatypeRuleToken lv_messageName_6_0 = null;

        EObject lv_arguments_8_0 = null;

        EObject lv_arguments_10_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:1911:1: ( (this_SubNavigatingExp_0= ruleSubNavigatingExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:1912:2: (this_SubNavigatingExp_0= ruleSubNavigatingExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:1912:2: (this_SubNavigatingExp_0= ruleSubNavigatingExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )? )
            // InternalBacktrackingContentAssistTestLanguage.g:1913:3: this_SubNavigatingExp_0= ruleSubNavigatingExp ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNavigatingExpAccess().getSubNavigatingExpParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_24);
            this_SubNavigatingExp_0=ruleSubNavigatingExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubNavigatingExp_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:1924:3: ( ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) ) | ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=28 && LA38_0<=29)) ) {
                alt38=1;
            }
            else if ( ((LA38_0>=30 && LA38_0<=31)) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1925:4: ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1925:4: ( () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1926:5: () ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) ) ( (lv_argument_3_0= ruleNavigatingExp ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1926:5: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:1927:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getNavigatingExpAccess().getInfixExpSourceAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1936:5: ( ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1937:6: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1937:6: ( (lv_op_2_1= '.' | lv_op_2_2= '->' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1938:7: (lv_op_2_1= '.' | lv_op_2_2= '->' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1938:7: (lv_op_2_1= '.' | lv_op_2_2= '->' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==28) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==29) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1939:8: lv_op_2_1= '.'
                            {
                            lv_op_2_1=(Token)match(input,28,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_1, grammarAccess.getNavigatingExpAccess().getOpFullStopKeyword_1_0_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1950:8: lv_op_2_2= '->'
                            {
                            lv_op_2_2=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_2_2, grammarAccess.getNavigatingExpAccess().getOpHyphenMinusGreaterThanSignKeyword_1_0_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_2_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1963:5: ( (lv_argument_3_0= ruleNavigatingExp ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1964:6: (lv_argument_3_0= ruleNavigatingExp )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1964:6: (lv_argument_3_0= ruleNavigatingExp )
                    // InternalBacktrackingContentAssistTestLanguage.g:1965:7: lv_argument_3_0= ruleNavigatingExp
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingExpAccess().getArgumentNavigatingExpParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_argument_3_0=ruleNavigatingExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingExpRule());
                      							}
                      							set(
                      								current,
                      								"argument",
                      								lv_argument_3_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NavigatingExp");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:1984:4: ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1984:4: ( () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')' )
                    // InternalBacktrackingContentAssistTestLanguage.g:1985:5: () ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) ) ( (lv_messageName_6_0= ruleIdentifier ) ) otherlv_7= '(' ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )? otherlv_11= ')'
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1985:5: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:1986:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getNavigatingExpAccess().getOclMessageSourceAction_1_1_0(),
                      							current);
                      					
                    }

                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:1995:5: ( ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1996:6: ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1996:6: ( (lv_op_5_1= '^^' | lv_op_5_2= '^' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:1997:7: (lv_op_5_1= '^^' | lv_op_5_2= '^' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:1997:7: (lv_op_5_1= '^^' | lv_op_5_2= '^' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==30) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==31) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:1998:8: lv_op_5_1= '^^'
                            {
                            lv_op_5_1=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_5_1, grammarAccess.getNavigatingExpAccess().getOpCircumflexAccentCircumflexAccentKeyword_1_1_1_0_0());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_5_1, null);
                              							
                            }

                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2009:8: lv_op_5_2= '^'
                            {
                            lv_op_5_2=(Token)match(input,31,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								newLeafNode(lv_op_5_2, grammarAccess.getNavigatingExpAccess().getOpCircumflexAccentKeyword_1_1_1_0_1());
                              							
                            }
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElement(grammarAccess.getNavigatingExpRule());
                              								}
                              								setWithLastConsumed(current, "op", lv_op_5_2, null);
                              							
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:2022:5: ( (lv_messageName_6_0= ruleIdentifier ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:2023:6: (lv_messageName_6_0= ruleIdentifier )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2023:6: (lv_messageName_6_0= ruleIdentifier )
                    // InternalBacktrackingContentAssistTestLanguage.g:2024:7: lv_messageName_6_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getNavigatingExpAccess().getMessageNameIdentifierParserRuleCall_1_1_2_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_messageName_6_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getNavigatingExpRule());
                      							}
                      							set(
                      								current,
                      								"messageName",
                      								lv_messageName_6_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getNavigatingExpAccess().getLeftParenthesisKeyword_1_1_3());
                      				
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:2045:5: ( ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_INT && LA37_0<=RULE_STRING)||LA37_0==16||(LA37_0>=32 && LA37_0<=34)||(LA37_0>=36 && LA37_0<=50)||(LA37_0>=54 && LA37_0<=57)||LA37_0==69||(LA37_0>=75 && LA37_0<=76)||LA37_0==80) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2046:6: ( (lv_arguments_8_0= ruleOclMessageArg ) ) (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )*
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:2046:6: ( (lv_arguments_8_0= ruleOclMessageArg ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:2047:7: (lv_arguments_8_0= ruleOclMessageArg )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:2047:7: (lv_arguments_8_0= ruleOclMessageArg )
                            // InternalBacktrackingContentAssistTestLanguage.g:2048:8: lv_arguments_8_0= ruleOclMessageArg
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getNavigatingExpAccess().getArgumentsOclMessageArgParserRuleCall_1_1_4_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_12);
                            lv_arguments_8_0=ruleOclMessageArg();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getNavigatingExpRule());
                              								}
                              								add(
                              									current,
                              									"arguments",
                              									lv_arguments_8_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OclMessageArg");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalBacktrackingContentAssistTestLanguage.g:2065:6: (otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==17) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2066:7: otherlv_9= ',' ( (lv_arguments_10_0= ruleOclMessageArg ) )
                            	    {
                            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_26); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_9, grammarAccess.getNavigatingExpAccess().getCommaKeyword_1_1_4_1_0());
                            	      						
                            	    }
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2070:7: ( (lv_arguments_10_0= ruleOclMessageArg ) )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2071:8: (lv_arguments_10_0= ruleOclMessageArg )
                            	    {
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2071:8: (lv_arguments_10_0= ruleOclMessageArg )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2072:9: lv_arguments_10_0= ruleOclMessageArg
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getNavigatingExpAccess().getArgumentsOclMessageArgParserRuleCall_1_1_4_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_12);
                            	    lv_arguments_10_0=ruleOclMessageArg();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getNavigatingExpRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"arguments",
                            	      										lv_arguments_10_0,
                            	      										"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.OclMessageArg");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getNavigatingExpAccess().getRightParenthesisKeyword_1_1_5());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatingExp"


    // $ANTLR start "entryRuleOclMessageArg"
    // InternalBacktrackingContentAssistTestLanguage.g:2101:1: entryRuleOclMessageArg returns [EObject current=null] : iv_ruleOclMessageArg= ruleOclMessageArg EOF ;
    public final EObject entryRuleOclMessageArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOclMessageArg = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2101:54: (iv_ruleOclMessageArg= ruleOclMessageArg EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2102:2: iv_ruleOclMessageArg= ruleOclMessageArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOclMessageArgRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOclMessageArg=ruleOclMessageArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOclMessageArg; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOclMessageArg"


    // $ANTLR start "ruleOclMessageArg"
    // InternalBacktrackingContentAssistTestLanguage.g:2108:1: ruleOclMessageArg returns [EObject current=null] : ( ( () otherlv_1= '?' (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )? ) | this_Expression_4= ruleExpression ) ;
    public final EObject ruleOclMessageArg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;

        EObject this_Expression_4 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2109:1: ( ( ( () otherlv_1= '?' (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )? ) | this_Expression_4= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2110:2: ( ( () otherlv_1= '?' (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )? ) | this_Expression_4= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2110:2: ( ( () otherlv_1= '?' (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )? ) | this_Expression_4= ruleExpression )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_STRING)||LA40_0==16||(LA40_0>=33 && LA40_0<=34)||(LA40_0>=36 && LA40_0<=50)||(LA40_0>=54 && LA40_0<=57)||LA40_0==69||(LA40_0>=75 && LA40_0<=76)||LA40_0==80) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2111:3: ( () otherlv_1= '?' (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )? )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2111:3: ( () otherlv_1= '?' (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )? )
                    // InternalBacktrackingContentAssistTestLanguage.g:2112:4: () otherlv_1= '?' (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )?
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2112:4: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:2113:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getOclMessageArgAccess().getOclMessageArgAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getOclMessageArgAccess().getQuestionMarkKeyword_0_1());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:2126:4: (otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==12) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2127:5: otherlv_2= ':' ( (lv_type_3_0= ruleTypeExp ) )
                            {
                            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getOclMessageArgAccess().getColonKeyword_0_2_0());
                              				
                            }
                            // InternalBacktrackingContentAssistTestLanguage.g:2131:5: ( (lv_type_3_0= ruleTypeExp ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:2132:6: (lv_type_3_0= ruleTypeExp )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:2132:6: (lv_type_3_0= ruleTypeExp )
                            // InternalBacktrackingContentAssistTestLanguage.g:2133:7: lv_type_3_0= ruleTypeExp
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getOclMessageArgAccess().getTypeTypeExpParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_type_3_0=ruleTypeExp();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getOclMessageArgRule());
                              							}
                              							set(
                              								current,
                              								"type",
                              								lv_type_3_0,
                              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2153:3: this_Expression_4= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOclMessageArgAccess().getExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expression_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOclMessageArg"


    // $ANTLR start "entryRuleNUMBER_LITERAL"
    // InternalBacktrackingContentAssistTestLanguage.g:2168:1: entryRuleNUMBER_LITERAL returns [String current=null] : iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF ;
    public final String entryRuleNUMBER_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER_LITERAL = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2168:54: (iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2169:2: iv_ruleNUMBER_LITERAL= ruleNUMBER_LITERAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBER_LITERALRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNUMBER_LITERAL=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER_LITERAL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER_LITERAL"


    // $ANTLR start "ruleNUMBER_LITERAL"
    // InternalBacktrackingContentAssistTestLanguage.g:2175:1: ruleNUMBER_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_7=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2176:1: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2177:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2177:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalBacktrackingContentAssistTestLanguage.g:2178:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:2185:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_INT) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2186:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_2, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBacktrackingContentAssistTestLanguage.g:2199:3: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=33 && LA44_0<=34)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2200:4: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2200:4: (kw= 'e' | kw= 'E' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==33) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==34) ) {
                        alt42=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2201:5: kw= 'e'
                            {
                            kw=(Token)match(input,33,FollowSets000.FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2207:5: kw= 'E'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getEKeyword_2_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:2213:4: (kw= '+' | kw= '-' )?
                    int alt43=3;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==35) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==36) ) {
                        alt43=2;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2214:5: kw= '+'
                            {
                            kw=(Token)match(input,35,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getPlusSignKeyword_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2220:5: kw= '-'
                            {
                            kw=(Token)match(input,36,FollowSets000.FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getNUMBER_LITERALAccess().getHyphenMinusKeyword_2_1_1());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_7, grammarAccess.getNUMBER_LITERALAccess().getINTTerminalRuleCall_2_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER_LITERAL"


    // $ANTLR start "entryRuleEssentialOCLRestrictedKeywords"
    // InternalBacktrackingContentAssistTestLanguage.g:2238:1: entryRuleEssentialOCLRestrictedKeywords returns [String current=null] : iv_ruleEssentialOCLRestrictedKeywords= ruleEssentialOCLRestrictedKeywords EOF ;
    public final String entryRuleEssentialOCLRestrictedKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEssentialOCLRestrictedKeywords = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2238:70: (iv_ruleEssentialOCLRestrictedKeywords= ruleEssentialOCLRestrictedKeywords EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2239:2: iv_ruleEssentialOCLRestrictedKeywords= ruleEssentialOCLRestrictedKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEssentialOCLRestrictedKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEssentialOCLRestrictedKeywords=ruleEssentialOCLRestrictedKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEssentialOCLRestrictedKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEssentialOCLRestrictedKeywords"


    // $ANTLR start "ruleEssentialOCLRestrictedKeywords"
    // InternalBacktrackingContentAssistTestLanguage.g:2245:1: ruleEssentialOCLRestrictedKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'e' | kw= 'E' ) ;
    public final AntlrDatatypeRuleToken ruleEssentialOCLRestrictedKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2246:1: ( (kw= 'e' | kw= 'E' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2247:2: (kw= 'e' | kw= 'E' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2247:2: (kw= 'e' | kw= 'E' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            else if ( (LA45_0==34) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2248:3: kw= 'e'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLRestrictedKeywordsAccess().getEKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2254:3: kw= 'E'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEssentialOCLRestrictedKeywordsAccess().getEKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEssentialOCLRestrictedKeywords"


    // $ANTLR start "entryRuleRestrictedKeywords"
    // InternalBacktrackingContentAssistTestLanguage.g:2263:1: entryRuleRestrictedKeywords returns [String current=null] : iv_ruleRestrictedKeywords= ruleRestrictedKeywords EOF ;
    public final String entryRuleRestrictedKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRestrictedKeywords = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2263:58: (iv_ruleRestrictedKeywords= ruleRestrictedKeywords EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2264:2: iv_ruleRestrictedKeywords= ruleRestrictedKeywords EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRestrictedKeywordsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRestrictedKeywords=ruleRestrictedKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRestrictedKeywords.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictedKeywords"


    // $ANTLR start "ruleRestrictedKeywords"
    // InternalBacktrackingContentAssistTestLanguage.g:2270:1: ruleRestrictedKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_EssentialOCLRestrictedKeywords_0= ruleEssentialOCLRestrictedKeywords ;
    public final AntlrDatatypeRuleToken ruleRestrictedKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EssentialOCLRestrictedKeywords_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2271:1: (this_EssentialOCLRestrictedKeywords_0= ruleEssentialOCLRestrictedKeywords )
            // InternalBacktrackingContentAssistTestLanguage.g:2272:2: this_EssentialOCLRestrictedKeywords_0= ruleEssentialOCLRestrictedKeywords
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRestrictedKeywordsAccess().getEssentialOCLRestrictedKeywordsParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_EssentialOCLRestrictedKeywords_0=ruleEssentialOCLRestrictedKeywords();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_EssentialOCLRestrictedKeywords_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRestrictedKeywords"


    // $ANTLR start "entryRuleIdentifier"
    // InternalBacktrackingContentAssistTestLanguage.g:2285:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2285:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2286:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalBacktrackingContentAssistTestLanguage.g:2292:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_RestrictedKeywords_1= ruleRestrictedKeywords ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_RestrictedKeywords_1 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2293:1: ( (this_ID_0= RULE_ID | this_RestrictedKeywords_1= ruleRestrictedKeywords ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2294:2: (this_ID_0= RULE_ID | this_RestrictedKeywords_1= ruleRestrictedKeywords )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2294:2: (this_ID_0= RULE_ID | this_RestrictedKeywords_1= ruleRestrictedKeywords )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=33 && LA46_0<=34)) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2295:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2303:3: this_RestrictedKeywords_1= ruleRestrictedKeywords
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIdentifierAccess().getRestrictedKeywordsParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RestrictedKeywords_1=ruleRestrictedKeywords();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_RestrictedKeywords_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalBacktrackingContentAssistTestLanguage.g:2317:1: entryRuleStringLiteral returns [String current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final String entryRuleStringLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringLiteral = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2317:53: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2318:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalBacktrackingContentAssistTestLanguage.g:2324:1: ruleStringLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleStringLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2325:1: (this_STRING_0= RULE_STRING )
            // InternalBacktrackingContentAssistTestLanguage.g:2326:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRulePrimitiveTypeIdentifier"
    // InternalBacktrackingContentAssistTestLanguage.g:2336:1: entryRulePrimitiveTypeIdentifier returns [String current=null] : iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF ;
    public final String entryRulePrimitiveTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveTypeIdentifier = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2336:63: (iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2337:2: iv_rulePrimitiveTypeIdentifier= rulePrimitiveTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveTypeIdentifier=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeIdentifier"


    // $ANTLR start "rulePrimitiveTypeIdentifier"
    // InternalBacktrackingContentAssistTestLanguage.g:2343:1: rulePrimitiveTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2344:1: ( (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2345:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2345:2: (kw= 'Boolean' | kw= 'Integer' | kw= 'Real' | kw= 'String' | kw= 'UnlimitedNatural' | kw= 'OclAny' | kw= 'OclInvalid' | kw= 'OclVoid' )
            int alt47=8;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt47=1;
                }
                break;
            case 38:
                {
                alt47=2;
                }
                break;
            case 39:
                {
                alt47=3;
                }
                break;
            case 40:
                {
                alt47=4;
                }
                break;
            case 41:
                {
                alt47=5;
                }
                break;
            case 42:
                {
                alt47=6;
                }
                break;
            case 43:
                {
                alt47=7;
                }
                break;
            case 44:
                {
                alt47=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2346:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,37,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getBooleanKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2352:3: kw= 'Integer'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getIntegerKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2358:3: kw= 'Real'
                    {
                    kw=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getRealKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2364:3: kw= 'String'
                    {
                    kw=(Token)match(input,40,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getStringKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2370:3: kw= 'UnlimitedNatural'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getUnlimitedNaturalKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2376:3: kw= 'OclAny'
                    {
                    kw=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclAnyKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2382:3: kw= 'OclInvalid'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclInvalidKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2388:3: kw= 'OclVoid'
                    {
                    kw=(Token)match(input,44,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getPrimitiveTypeIdentifierAccess().getOclVoidKeyword_7());
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeIdentifier"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalBacktrackingContentAssistTestLanguage.g:2397:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2397:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2398:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalBacktrackingContentAssistTestLanguage.g:2404:1: rulePrimitiveType returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2405:1: ( ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2406:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2406:2: ( (lv_name_0_0= rulePrimitiveTypeIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2407:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2407:3: (lv_name_0_0= rulePrimitiveTypeIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:2408:4: lv_name_0_0= rulePrimitiveTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNamePrimitiveTypeIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=rulePrimitiveTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.PrimitiveTypeIdentifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleCollectionTypeIdentifier"
    // InternalBacktrackingContentAssistTestLanguage.g:2428:1: entryRuleCollectionTypeIdentifier returns [String current=null] : iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF ;
    public final String entryRuleCollectionTypeIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCollectionTypeIdentifier = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2428:64: (iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2429:2: iv_ruleCollectionTypeIdentifier= ruleCollectionTypeIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionTypeIdentifier=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionTypeIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionTypeIdentifier"


    // $ANTLR start "ruleCollectionTypeIdentifier"
    // InternalBacktrackingContentAssistTestLanguage.g:2435:1: ruleCollectionTypeIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) ;
    public final AntlrDatatypeRuleToken ruleCollectionTypeIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2436:1: ( (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2437:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2437:2: (kw= 'Set' | kw= 'Bag' | kw= 'Sequence' | kw= 'Collection' | kw= 'OrderedSet' )
            int alt48=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt48=1;
                }
                break;
            case 46:
                {
                alt48=2;
                }
                break;
            case 47:
                {
                alt48=3;
                }
                break;
            case 48:
                {
                alt48=4;
                }
                break;
            case 49:
                {
                alt48=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2438:3: kw= 'Set'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSetKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2444:3: kw= 'Bag'
                    {
                    kw=(Token)match(input,46,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getBagKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2450:3: kw= 'Sequence'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getSequenceKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2456:3: kw= 'Collection'
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getCollectionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2462:3: kw= 'OrderedSet'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCollectionTypeIdentifierAccess().getOrderedSetKeyword_4());
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionTypeIdentifier"


    // $ANTLR start "entryRuleTypeExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2471:1: entryRuleTypeExp returns [EObject current=null] : iv_ruleTypeExp= ruleTypeExp EOF ;
    public final EObject entryRuleTypeExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2471:48: (iv_ruleTypeExp= ruleTypeExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2472:2: iv_ruleTypeExp= ruleTypeExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeExp=ruleTypeExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeExp"


    // $ANTLR start "ruleTypeExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2478:1: ruleTypeExp returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_NameExp_1= ruleNameExp | this_CollectionType_2= ruleCollectionType | this_TupleType_3= ruleTupleType ) ;
    public final EObject ruleTypeExp() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_NameExp_1 = null;

        EObject this_CollectionType_2 = null;

        EObject this_TupleType_3 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2479:1: ( (this_PrimitiveType_0= rulePrimitiveType | this_NameExp_1= ruleNameExp | this_CollectionType_2= ruleCollectionType | this_TupleType_3= ruleTupleType ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2480:2: (this_PrimitiveType_0= rulePrimitiveType | this_NameExp_1= ruleNameExp | this_CollectionType_2= ruleCollectionType | this_TupleType_3= ruleTupleType )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2480:2: (this_PrimitiveType_0= rulePrimitiveType | this_NameExp_1= ruleNameExp | this_CollectionType_2= ruleCollectionType | this_TupleType_3= ruleTupleType )
            int alt49=4;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt49=1;
                }
                break;
            case RULE_ID:
            case 33:
            case 34:
                {
                alt49=2;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt49=3;
                }
                break;
            case 50:
                {
                alt49=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2481:3: this_PrimitiveType_0= rulePrimitiveType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpAccess().getPrimitiveTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2493:3: this_NameExp_1= ruleNameExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpAccess().getNameExpParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NameExp_1=ruleNameExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExp_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2505:3: this_CollectionType_2= ruleCollectionType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpAccess().getCollectionTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionType_2=ruleCollectionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2517:3: this_TupleType_3= ruleTupleType
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeExpAccess().getTupleTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleType_3=ruleTupleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeExp"


    // $ANTLR start "entryRuleCollectionType"
    // InternalBacktrackingContentAssistTestLanguage.g:2532:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2532:55: (iv_ruleCollectionType= ruleCollectionType EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2533:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // InternalBacktrackingContentAssistTestLanguage.g:2539:1: ruleCollectionType returns [EObject current=null] : ( ( (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_typeIdentifier_0_0 = null;

        EObject lv_type_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2540:1: ( ( ( (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= ')' )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2541:2: ( ( (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= ')' )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2541:2: ( ( (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= ')' )? )
            // InternalBacktrackingContentAssistTestLanguage.g:2542:3: ( (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier ) ) (otherlv_1= '(' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= ')' )?
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2542:3: ( (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2543:4: (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2543:4: (lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:2544:5: lv_typeIdentifier_0_0= ruleCollectionTypeIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeIdentifierCollectionTypeIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_typeIdentifier_0_0=ruleCollectionTypeIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
              					}
              					set(
              						current,
              						"typeIdentifier",
              						lv_typeIdentifier_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.CollectionTypeIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:2561:3: (otherlv_1= '(' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==16) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2562:4: otherlv_1= '(' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:2566:4: ( (lv_type_2_0= ruleTypeExp ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:2567:5: (lv_type_2_0= ruleTypeExp )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2567:5: (lv_type_2_0= ruleTypeExp )
                    // InternalBacktrackingContentAssistTestLanguage.g:2568:6: lv_type_2_0= ruleTypeExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionTypeAccess().getTypeTypeExpParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_type_2_0=ruleTypeExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleTupleType"
    // InternalBacktrackingContentAssistTestLanguage.g:2594:1: entryRuleTupleType returns [EObject current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final EObject entryRuleTupleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleType = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2594:50: (iv_ruleTupleType= ruleTupleType EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2595:2: iv_ruleTupleType= ruleTupleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // InternalBacktrackingContentAssistTestLanguage.g:2601:1: ruleTupleType returns [EObject current=null] : ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_part_2_0= ruletuplePart ) ) (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTupleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_part_2_0 = null;

        EObject lv_part_4_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2602:1: ( ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_part_2_0= ruletuplePart ) ) (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )* )? otherlv_5= ')' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2603:2: ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_part_2_0= ruletuplePart ) ) (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )* )? otherlv_5= ')' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2603:2: ( ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_part_2_0= ruletuplePart ) ) (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )* )? otherlv_5= ')' )
            // InternalBacktrackingContentAssistTestLanguage.g:2604:3: ( (lv_name_0_0= 'Tuple' ) ) otherlv_1= '(' ( ( (lv_part_2_0= ruletuplePart ) ) (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )* )? otherlv_5= ')'
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2604:3: ( (lv_name_0_0= 'Tuple' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2605:4: (lv_name_0_0= 'Tuple' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2605:4: (lv_name_0_0= 'Tuple' )
            // InternalBacktrackingContentAssistTestLanguage.g:2606:5: lv_name_0_0= 'Tuple'
            {
            lv_name_0_0=(Token)match(input,50,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getTupleTypeAccess().getNameTupleKeyword_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTupleTypeRule());
              					}
              					setWithLastConsumed(current, "name", lv_name_0_0, "Tuple");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleTypeAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:2622:3: ( ( (lv_part_2_0= ruletuplePart ) ) (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID||(LA52_0>=33 && LA52_0<=34)) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2623:4: ( (lv_part_2_0= ruletuplePart ) ) (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )*
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2623:4: ( (lv_part_2_0= ruletuplePart ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:2624:5: (lv_part_2_0= ruletuplePart )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2624:5: (lv_part_2_0= ruletuplePart )
                    // InternalBacktrackingContentAssistTestLanguage.g:2625:6: lv_part_2_0= ruletuplePart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleTypeAccess().getPartTuplePartParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_part_2_0=ruletuplePart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                      						}
                      						add(
                      							current,
                      							"part",
                      							lv_part_2_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.tuplePart");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:2642:4: (otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==17) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalBacktrackingContentAssistTestLanguage.g:2643:5: otherlv_3= ',' ( (lv_part_4_0= ruletuplePart ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getTupleTypeAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalBacktrackingContentAssistTestLanguage.g:2647:5: ( (lv_part_4_0= ruletuplePart ) )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:2648:6: (lv_part_4_0= ruletuplePart )
                    	    {
                    	    // InternalBacktrackingContentAssistTestLanguage.g:2648:6: (lv_part_4_0= ruletuplePart )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:2649:7: lv_part_4_0= ruletuplePart
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTupleTypeAccess().getPartTuplePartParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_part_4_0=ruletuplePart();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTupleTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"part",
                    	      								lv_part_4_0,
                    	      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.tuplePart");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleTypeAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRuletuplePart"
    // InternalBacktrackingContentAssistTestLanguage.g:2676:1: entryRuletuplePart returns [EObject current=null] : iv_ruletuplePart= ruletuplePart EOF ;
    public final EObject entryRuletuplePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletuplePart = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2676:50: (iv_ruletuplePart= ruletuplePart EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2677:2: iv_ruletuplePart= ruletuplePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTuplePartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruletuplePart=ruletuplePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletuplePart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletuplePart"


    // $ANTLR start "ruletuplePart"
    // InternalBacktrackingContentAssistTestLanguage.g:2683:1: ruletuplePart returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) ) ;
    public final EObject ruletuplePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2684:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2685:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2685:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2686:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2686:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2687:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2687:4: (lv_name_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:2688:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTuplePartAccess().getColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:2709:3: ( (lv_type_2_0= ruleTypeExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2710:4: (lv_type_2_0= ruleTypeExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2710:4: (lv_type_2_0= ruleTypeExp )
            // InternalBacktrackingContentAssistTestLanguage.g:2711:5: lv_type_2_0= ruleTypeExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTuplePartAccess().getTypeTypeExpParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_2_0=ruleTypeExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTuplePartRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletuplePart"


    // $ANTLR start "entryRuleCollectionLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2732:1: entryRuleCollectionLiteralExp returns [EObject current=null] : iv_ruleCollectionLiteralExp= ruleCollectionLiteralExp EOF ;
    public final EObject entryRuleCollectionLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2732:61: (iv_ruleCollectionLiteralExp= ruleCollectionLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2733:2: iv_ruleCollectionLiteralExp= ruleCollectionLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralExp=ruleCollectionLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralExp"


    // $ANTLR start "ruleCollectionLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2739:1: ruleCollectionLiteralExp returns [EObject current=null] : (this_CollectionType_0= ruleCollectionType ( () otherlv_2= '{' ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )? otherlv_6= '}' )? ) ;
    public final EObject ruleCollectionLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_CollectionType_0 = null;

        EObject lv_collectionLiteralParts_3_0 = null;

        EObject lv_collectionLiteralParts_5_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2740:1: ( (this_CollectionType_0= ruleCollectionType ( () otherlv_2= '{' ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )? otherlv_6= '}' )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2741:2: (this_CollectionType_0= ruleCollectionType ( () otherlv_2= '{' ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )? otherlv_6= '}' )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2741:2: (this_CollectionType_0= ruleCollectionType ( () otherlv_2= '{' ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )? otherlv_6= '}' )? )
            // InternalBacktrackingContentAssistTestLanguage.g:2742:3: this_CollectionType_0= ruleCollectionType ( () otherlv_2= '{' ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )? otherlv_6= '}' )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCollectionLiteralExpAccess().getCollectionTypeParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_35);
            this_CollectionType_0=ruleCollectionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CollectionType_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:2753:3: ( () otherlv_2= '{' ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )? otherlv_6= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==51) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2754:4: () otherlv_2= '{' ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )? otherlv_6= '}'
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2754:4: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:2755:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getCollectionLiteralExpAccess().getCollectionLiteralExpTypeAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getCollectionLiteralExpAccess().getLeftCurlyBracketKeyword_1_1());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:2768:4: ( ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )* )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( ((LA54_0>=RULE_INT && LA54_0<=RULE_STRING)||LA54_0==16||(LA54_0>=33 && LA54_0<=34)||(LA54_0>=36 && LA54_0<=50)||(LA54_0>=54 && LA54_0<=57)||LA54_0==69||(LA54_0>=75 && LA54_0<=76)||LA54_0==80) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:2769:5: ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) ) (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )*
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:2769:5: ( (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:2770:6: (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:2770:6: (lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart )
                            // InternalBacktrackingContentAssistTestLanguage.g:2771:7: lv_collectionLiteralParts_3_0= ruleCollectionLiteralPart
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getCollectionLiteralExpAccess().getCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_37);
                            lv_collectionLiteralParts_3_0=ruleCollectionLiteralPart();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getCollectionLiteralExpRule());
                              							}
                              							add(
                              								current,
                              								"collectionLiteralParts",
                              								lv_collectionLiteralParts_3_0,
                              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.CollectionLiteralPart");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalBacktrackingContentAssistTestLanguage.g:2788:5: (otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==17) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2789:6: otherlv_4= ',' ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) )
                            	    {
                            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_4, grammarAccess.getCollectionLiteralExpAccess().getCommaKeyword_1_2_1_0());
                            	      					
                            	    }
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2793:6: ( (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart ) )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2794:7: (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart )
                            	    {
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2794:7: (lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart )
                            	    // InternalBacktrackingContentAssistTestLanguage.g:2795:8: lv_collectionLiteralParts_5_0= ruleCollectionLiteralPart
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getCollectionLiteralExpAccess().getCollectionLiteralPartsCollectionLiteralPartParserRuleCall_1_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_37);
                            	    lv_collectionLiteralParts_5_0=ruleCollectionLiteralPart();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getCollectionLiteralExpRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"collectionLiteralParts",
                            	      									lv_collectionLiteralParts_5_0,
                            	      									"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.CollectionLiteralPart");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getCollectionLiteralExpAccess().getRightCurlyBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralExp"


    // $ANTLR start "entryRuleCollectionLiteralPart"
    // InternalBacktrackingContentAssistTestLanguage.g:2823:1: entryRuleCollectionLiteralPart returns [EObject current=null] : iv_ruleCollectionLiteralPart= ruleCollectionLiteralPart EOF ;
    public final EObject entryRuleCollectionLiteralPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteralPart = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2823:62: (iv_ruleCollectionLiteralPart= ruleCollectionLiteralPart EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2824:2: iv_ruleCollectionLiteralPart= ruleCollectionLiteralPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionLiteralPartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteralPart=ruleCollectionLiteralPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollectionLiteralPart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCollectionLiteralPart"


    // $ANTLR start "ruleCollectionLiteralPart"
    // InternalBacktrackingContentAssistTestLanguage.g:2830:1: ruleCollectionLiteralPart returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_lastExpression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleCollectionLiteralPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;

        EObject lv_lastExpression_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2831:1: ( ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_lastExpression_2_0= ruleExpression ) ) )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2832:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_lastExpression_2_0= ruleExpression ) ) )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2832:2: ( ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_lastExpression_2_0= ruleExpression ) ) )? )
            // InternalBacktrackingContentAssistTestLanguage.g:2833:3: ( (lv_expression_0_0= ruleExpression ) ) (otherlv_1= '..' ( (lv_lastExpression_2_0= ruleExpression ) ) )?
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2833:3: ( (lv_expression_0_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2834:4: (lv_expression_0_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2834:4: (lv_expression_0_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:2835:5: lv_expression_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCollectionLiteralPartAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_expression_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCollectionLiteralPartRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:2852:3: (otherlv_1= '..' ( (lv_lastExpression_2_0= ruleExpression ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==53) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2853:4: otherlv_1= '..' ( (lv_lastExpression_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCollectionLiteralPartAccess().getFullStopFullStopKeyword_1_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:2857:4: ( (lv_lastExpression_2_0= ruleExpression ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:2858:5: (lv_lastExpression_2_0= ruleExpression )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2858:5: (lv_lastExpression_2_0= ruleExpression )
                    // InternalBacktrackingContentAssistTestLanguage.g:2859:6: lv_lastExpression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCollectionLiteralPartAccess().getLastExpressionExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_lastExpression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCollectionLiteralPartRule());
                      						}
                      						set(
                      							current,
                      							"lastExpression",
                      							lv_lastExpression_2_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCollectionLiteralPart"


    // $ANTLR start "entryRulePrimitiveLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2881:1: entryRulePrimitiveLiteralExp returns [EObject current=null] : iv_rulePrimitiveLiteralExp= rulePrimitiveLiteralExp EOF ;
    public final EObject entryRulePrimitiveLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2881:60: (iv_rulePrimitiveLiteralExp= rulePrimitiveLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2882:2: iv_rulePrimitiveLiteralExp= rulePrimitiveLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimitiveLiteralExp=rulePrimitiveLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveLiteralExp"


    // $ANTLR start "rulePrimitiveLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2888:1: rulePrimitiveLiteralExp returns [EObject current=null] : (this_NumberLiteralExp_0= ruleNumberLiteralExp | this_StringLiteralExp_1= ruleStringLiteralExp | this_BooleanLiteralExp_2= ruleBooleanLiteralExp | this_InvalidLiteralExp_3= ruleInvalidLiteralExp | this_NullLiteralExp_4= ruleNullLiteralExp ) ;
    public final EObject rulePrimitiveLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteralExp_0 = null;

        EObject this_StringLiteralExp_1 = null;

        EObject this_BooleanLiteralExp_2 = null;

        EObject this_InvalidLiteralExp_3 = null;

        EObject this_NullLiteralExp_4 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2889:1: ( (this_NumberLiteralExp_0= ruleNumberLiteralExp | this_StringLiteralExp_1= ruleStringLiteralExp | this_BooleanLiteralExp_2= ruleBooleanLiteralExp | this_InvalidLiteralExp_3= ruleInvalidLiteralExp | this_NullLiteralExp_4= ruleNullLiteralExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2890:2: (this_NumberLiteralExp_0= ruleNumberLiteralExp | this_StringLiteralExp_1= ruleStringLiteralExp | this_BooleanLiteralExp_2= ruleBooleanLiteralExp | this_InvalidLiteralExp_3= ruleInvalidLiteralExp | this_NullLiteralExp_4= ruleNullLiteralExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2890:2: (this_NumberLiteralExp_0= ruleNumberLiteralExp | this_StringLiteralExp_1= ruleStringLiteralExp | this_BooleanLiteralExp_2= ruleBooleanLiteralExp | this_InvalidLiteralExp_3= ruleInvalidLiteralExp | this_NullLiteralExp_4= ruleNullLiteralExp )
            int alt57=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt57=1;
                }
                break;
            case RULE_STRING:
                {
                alt57=2;
                }
                break;
            case 54:
            case 55:
                {
                alt57=3;
                }
                break;
            case 56:
                {
                alt57=4;
                }
                break;
            case 57:
                {
                alt57=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2891:3: this_NumberLiteralExp_0= ruleNumberLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpAccess().getNumberLiteralExpParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumberLiteralExp_0=ruleNumberLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NumberLiteralExp_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2903:3: this_StringLiteralExp_1= ruleStringLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpAccess().getStringLiteralExpParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringLiteralExp_1=ruleStringLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringLiteralExp_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2915:3: this_BooleanLiteralExp_2= ruleBooleanLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpAccess().getBooleanLiteralExpParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteralExp_2=ruleBooleanLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanLiteralExp_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2927:3: this_InvalidLiteralExp_3= ruleInvalidLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpAccess().getInvalidLiteralExpParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_InvalidLiteralExp_3=ruleInvalidLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvalidLiteralExp_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2939:3: this_NullLiteralExp_4= ruleNullLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimitiveLiteralExpAccess().getNullLiteralExpParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NullLiteralExp_4=ruleNullLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NullLiteralExp_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveLiteralExp"


    // $ANTLR start "entryRuleTupleLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2954:1: entryRuleTupleLiteralExp returns [EObject current=null] : iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF ;
    public final EObject entryRuleTupleLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2954:56: (iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:2955:2: iv_ruleTupleLiteralExp= ruleTupleLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralExp=ruleTupleLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralExp"


    // $ANTLR start "ruleTupleLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:2961:1: ruleTupleLiteralExp returns [EObject current=null] : ( () otherlv_1= 'Tuple' (otherlv_2= '{' ( (lv_part_3_0= ruleTupleLiteralPart ) ) (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )* otherlv_6= '}' )? ) ;
    public final EObject ruleTupleLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_part_3_0 = null;

        EObject lv_part_5_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:2962:1: ( ( () otherlv_1= 'Tuple' (otherlv_2= '{' ( (lv_part_3_0= ruleTupleLiteralPart ) ) (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )* otherlv_6= '}' )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:2963:2: ( () otherlv_1= 'Tuple' (otherlv_2= '{' ( (lv_part_3_0= ruleTupleLiteralPart ) ) (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )* otherlv_6= '}' )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2963:2: ( () otherlv_1= 'Tuple' (otherlv_2= '{' ( (lv_part_3_0= ruleTupleLiteralPart ) ) (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )* otherlv_6= '}' )? )
            // InternalBacktrackingContentAssistTestLanguage.g:2964:3: () otherlv_1= 'Tuple' (otherlv_2= '{' ( (lv_part_3_0= ruleTupleLiteralPart ) ) (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )* otherlv_6= '}' )?
            {
            // InternalBacktrackingContentAssistTestLanguage.g:2964:3: ()
            // InternalBacktrackingContentAssistTestLanguage.g:2965:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleLiteralExpAccess().getTupleLiteralExpAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleLiteralExpAccess().getTupleKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:2978:3: (otherlv_2= '{' ( (lv_part_3_0= ruleTupleLiteralPart ) ) (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )* otherlv_6= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==51) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:2979:4: otherlv_2= '{' ( (lv_part_3_0= ruleTupleLiteralPart ) ) (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )* otherlv_6= '}'
                    {
                    otherlv_2=(Token)match(input,51,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTupleLiteralExpAccess().getLeftCurlyBracketKeyword_2_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:2983:4: ( (lv_part_3_0= ruleTupleLiteralPart ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:2984:5: (lv_part_3_0= ruleTupleLiteralPart )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:2984:5: (lv_part_3_0= ruleTupleLiteralPart )
                    // InternalBacktrackingContentAssistTestLanguage.g:2985:6: lv_part_3_0= ruleTupleLiteralPart
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralExpAccess().getPartTupleLiteralPartParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_part_3_0=ruleTupleLiteralPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleLiteralExpRule());
                      						}
                      						add(
                      							current,
                      							"part",
                      							lv_part_3_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TupleLiteralPart");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:3002:4: (otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==17) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalBacktrackingContentAssistTestLanguage.g:3003:5: otherlv_4= ',' ( (lv_part_5_0= ruleTupleLiteralPart ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getTupleLiteralExpAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalBacktrackingContentAssistTestLanguage.g:3007:5: ( (lv_part_5_0= ruleTupleLiteralPart ) )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:3008:6: (lv_part_5_0= ruleTupleLiteralPart )
                    	    {
                    	    // InternalBacktrackingContentAssistTestLanguage.g:3008:6: (lv_part_5_0= ruleTupleLiteralPart )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:3009:7: lv_part_5_0= ruleTupleLiteralPart
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTupleLiteralExpAccess().getPartTupleLiteralPartParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_part_5_0=ruleTupleLiteralPart();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTupleLiteralExpRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"part",
                    	      								lv_part_5_0,
                    	      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TupleLiteralPart");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTupleLiteralExpAccess().getRightCurlyBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralExp"


    // $ANTLR start "entryRuleTupleLiteralPart"
    // InternalBacktrackingContentAssistTestLanguage.g:3036:1: entryRuleTupleLiteralPart returns [EObject current=null] : iv_ruleTupleLiteralPart= ruleTupleLiteralPart EOF ;
    public final EObject entryRuleTupleLiteralPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralPart = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3036:57: (iv_ruleTupleLiteralPart= ruleTupleLiteralPart EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3037:2: iv_ruleTupleLiteralPart= ruleTupleLiteralPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralPartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTupleLiteralPart=ruleTupleLiteralPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralPart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralPart"


    // $ANTLR start "ruleTupleLiteralPart"
    // InternalBacktrackingContentAssistTestLanguage.g:3043:1: ruleTupleLiteralPart returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleTupleLiteralPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3044:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3045:2: ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3045:2: ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3046:3: ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3046:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3047:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3047:4: (lv_name_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:3048:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:3065:3: (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==12) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:3066:4: otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getTupleLiteralPartAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:3070:4: ( (lv_type_2_0= ruleTypeExp ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:3071:5: (lv_type_2_0= ruleTypeExp )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:3071:5: (lv_type_2_0= ruleTypeExp )
                    // InternalBacktrackingContentAssistTestLanguage.g:3072:6: lv_type_2_0= ruleTypeExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTupleLiteralPartAccess().getTypeTypeExpParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_type_2_0=ruleTypeExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTupleLiteralPartRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTupleLiteralPartAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3094:3: ( (lv_initExpression_4_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3095:4: (lv_initExpression_4_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3095:4: (lv_initExpression_4_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:3096:5: lv_initExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleLiteralPartAccess().getInitExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_initExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleLiteralPartRule());
              					}
              					set(
              						current,
              						"initExpression",
              						lv_initExpression_4_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralPart"


    // $ANTLR start "entryRuleNumberLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3117:1: entryRuleNumberLiteralExp returns [EObject current=null] : iv_ruleNumberLiteralExp= ruleNumberLiteralExp EOF ;
    public final EObject entryRuleNumberLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3117:57: (iv_ruleNumberLiteralExp= ruleNumberLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3118:2: iv_ruleNumberLiteralExp= ruleNumberLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumberLiteralExp=ruleNumberLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteralExp"


    // $ANTLR start "ruleNumberLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3124:1: ruleNumberLiteralExp returns [EObject current=null] : ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) ;
    public final EObject ruleNumberLiteralExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3125:1: ( ( (lv_name_0_0= ruleNUMBER_LITERAL ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3126:2: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3126:2: ( (lv_name_0_0= ruleNUMBER_LITERAL ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3127:3: (lv_name_0_0= ruleNUMBER_LITERAL )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3127:3: (lv_name_0_0= ruleNUMBER_LITERAL )
            // InternalBacktrackingContentAssistTestLanguage.g:3128:4: lv_name_0_0= ruleNUMBER_LITERAL
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getNumberLiteralExpAccess().getNameNUMBER_LITERALParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_0_0=ruleNUMBER_LITERAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getNumberLiteralExpRule());
              				}
              				set(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NUMBER_LITERAL");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteralExp"


    // $ANTLR start "entryRuleStringLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3148:1: entryRuleStringLiteralExp returns [EObject current=null] : iv_ruleStringLiteralExp= ruleStringLiteralExp EOF ;
    public final EObject entryRuleStringLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3148:57: (iv_ruleStringLiteralExp= ruleStringLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3149:2: iv_ruleStringLiteralExp= ruleStringLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteralExp=ruleStringLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteralExp"


    // $ANTLR start "ruleStringLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3155:1: ruleStringLiteralExp returns [EObject current=null] : ( (lv_values_0_0= ruleStringLiteral ) )+ ;
    public final EObject ruleStringLiteralExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_values_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3156:1: ( ( (lv_values_0_0= ruleStringLiteral ) )+ )
            // InternalBacktrackingContentAssistTestLanguage.g:3157:2: ( (lv_values_0_0= ruleStringLiteral ) )+
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3157:2: ( (lv_values_0_0= ruleStringLiteral ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_STRING) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3158:3: (lv_values_0_0= ruleStringLiteral )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3158:3: (lv_values_0_0= ruleStringLiteral )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3159:4: lv_values_0_0= ruleStringLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getStringLiteralExpAccess().getValuesStringLiteralParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    lv_values_0_0=ruleStringLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getStringLiteralExpRule());
            	      				}
            	      				add(
            	      					current,
            	      					"values",
            	      					lv_values_0_0,
            	      					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.StringLiteral");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteralExp"


    // $ANTLR start "entryRuleBooleanLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3179:1: entryRuleBooleanLiteralExp returns [EObject current=null] : iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF ;
    public final EObject entryRuleBooleanLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3179:58: (iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3180:2: iv_ruleBooleanLiteralExp= ruleBooleanLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteralExp=ruleBooleanLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExp"


    // $ANTLR start "ruleBooleanLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3186:1: ruleBooleanLiteralExp returns [EObject current=null] : ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBooleanLiteralExp() throws RecognitionException {
        EObject current = null;

        Token lv_isTrue_1_0=null;
        Token otherlv_2=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3187:1: ( ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3188:2: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3188:2: ( () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3189:3: () ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3189:3: ()
            // InternalBacktrackingContentAssistTestLanguage.g:3190:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBooleanLiteralExpAccess().getBooleanLiteralExpAction_0(),
              					current);
              			
            }

            }

            // InternalBacktrackingContentAssistTestLanguage.g:3199:3: ( ( (lv_isTrue_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            else if ( (LA62_0==55) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:3200:4: ( (lv_isTrue_1_0= 'true' ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:3200:4: ( (lv_isTrue_1_0= 'true' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:3201:5: (lv_isTrue_1_0= 'true' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:3201:5: (lv_isTrue_1_0= 'true' )
                    // InternalBacktrackingContentAssistTestLanguage.g:3202:6: lv_isTrue_1_0= 'true'
                    {
                    lv_isTrue_1_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_isTrue_1_0, grammarAccess.getBooleanLiteralExpAccess().getIsTrueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBooleanLiteralExpRule());
                      						}
                      						setWithLastConsumed(current, "isTrue", lv_isTrue_1_0 != null, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:3215:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralExpAccess().getFalseKeyword_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExp"


    // $ANTLR start "entryRuleInvalidLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3224:1: entryRuleInvalidLiteralExp returns [EObject current=null] : iv_ruleInvalidLiteralExp= ruleInvalidLiteralExp EOF ;
    public final EObject entryRuleInvalidLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvalidLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3224:58: (iv_ruleInvalidLiteralExp= ruleInvalidLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3225:2: iv_ruleInvalidLiteralExp= ruleInvalidLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvalidLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvalidLiteralExp=ruleInvalidLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvalidLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvalidLiteralExp"


    // $ANTLR start "ruleInvalidLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3231:1: ruleInvalidLiteralExp returns [EObject current=null] : ( () otherlv_1= 'invalid' ) ;
    public final EObject ruleInvalidLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3232:1: ( ( () otherlv_1= 'invalid' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3233:2: ( () otherlv_1= 'invalid' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3233:2: ( () otherlv_1= 'invalid' )
            // InternalBacktrackingContentAssistTestLanguage.g:3234:3: () otherlv_1= 'invalid'
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3234:3: ()
            // InternalBacktrackingContentAssistTestLanguage.g:3235:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInvalidLiteralExpAccess().getInvalidLiteralExpAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInvalidLiteralExpAccess().getInvalidKeyword_1());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvalidLiteralExp"


    // $ANTLR start "entryRuleNullLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3252:1: entryRuleNullLiteralExp returns [EObject current=null] : iv_ruleNullLiteralExp= ruleNullLiteralExp EOF ;
    public final EObject entryRuleNullLiteralExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteralExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3252:55: (iv_ruleNullLiteralExp= ruleNullLiteralExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3253:2: iv_ruleNullLiteralExp= ruleNullLiteralExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNullLiteralExp=ruleNullLiteralExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteralExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNullLiteralExp"


    // $ANTLR start "ruleNullLiteralExp"
    // InternalBacktrackingContentAssistTestLanguage.g:3259:1: ruleNullLiteralExp returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleNullLiteralExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3260:1: ( ( () otherlv_1= 'null' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3261:2: ( () otherlv_1= 'null' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3261:2: ( () otherlv_1= 'null' )
            // InternalBacktrackingContentAssistTestLanguage.g:3262:3: () otherlv_1= 'null'
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3262:3: ()
            // InternalBacktrackingContentAssistTestLanguage.g:3263:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNullLiteralExpAccess().getNullLiteralExpAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNullLiteralExpAccess().getNullKeyword_1());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNullLiteralExp"


    // $ANTLR start "entryRuleExpression"
    // InternalBacktrackingContentAssistTestLanguage.g:3280:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3280:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3281:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalBacktrackingContentAssistTestLanguage.g:3287:1: ruleExpression returns [EObject current=null] : (this_implies_0= ruleimplies | this_LetExp_1= ruleLetExp ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_implies_0 = null;

        EObject this_LetExp_1 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3288:1: ( (this_implies_0= ruleimplies | this_LetExp_1= ruleLetExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3289:2: (this_implies_0= ruleimplies | this_LetExp_1= ruleLetExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3289:2: (this_implies_0= ruleimplies | this_LetExp_1= ruleLetExp )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_INT && LA63_0<=RULE_STRING)||LA63_0==16||(LA63_0>=33 && LA63_0<=34)||(LA63_0>=36 && LA63_0<=50)||(LA63_0>=54 && LA63_0<=57)||LA63_0==69||(LA63_0>=75 && LA63_0<=76)) ) {
                alt63=1;
            }
            else if ( (LA63_0==80) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:3290:3: this_implies_0= ruleimplies
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getImpliesParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_implies_0=ruleimplies();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_implies_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:3302:3: this_LetExp_1= ruleLetExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getLetExpParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LetExp_1=ruleLetExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LetExp_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleimplies"
    // InternalBacktrackingContentAssistTestLanguage.g:3317:1: entryRuleimplies returns [EObject current=null] : iv_ruleimplies= ruleimplies EOF ;
    public final EObject entryRuleimplies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleimplies = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3317:48: (iv_ruleimplies= ruleimplies EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3318:2: iv_ruleimplies= ruleimplies EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleimplies=ruleimplies();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleimplies; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleimplies"


    // $ANTLR start "ruleimplies"
    // InternalBacktrackingContentAssistTestLanguage.g:3324:1: ruleimplies returns [EObject current=null] : (this_xor_0= rulexor ( () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject ruleimplies() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_xor_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3325:1: ( (this_xor_0= rulexor ( () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3326:2: (this_xor_0= rulexor ( () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3326:2: (this_xor_0= rulexor ( () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:3327:3: this_xor_0= rulexor ( () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getImpliesAccess().getXorParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            this_xor_0=rulexor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_xor_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3338:3: ( () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==58) ) {
                    int LA65_2 = input.LA(2);

                    if ( (synpred87_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3339:4: () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3339:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:3340:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getImpliesAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3349:4: ( (lv_op_2_0= 'implies' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3350:5: (lv_op_2_0= 'implies' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3350:5: (lv_op_2_0= 'implies' )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3351:6: lv_op_2_0= 'implies'
            	    {
            	    lv_op_2_0=(Token)match(input,58,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getImpliesAccess().getOpImpliesKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getImpliesRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "implies");
            	      					
            	    }

            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3363:4: ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3364:5: ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3364:5: ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3365:6: (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3365:6: (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( ((LA64_0>=RULE_INT && LA64_0<=RULE_STRING)||LA64_0==16||(LA64_0>=33 && LA64_0<=34)||(LA64_0>=36 && LA64_0<=50)||(LA64_0>=54 && LA64_0<=57)||LA64_0==69||(LA64_0>=75 && LA64_0<=76)) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==80) ) {
            	        alt64=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3366:7: lv_argument_3_1= rulexor
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getImpliesAccess().getArgumentXorParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_41);
            	            lv_argument_3_1=rulexor();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getImpliesRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.xor");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3382:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getImpliesAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_41);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getImpliesRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleimplies"


    // $ANTLR start "entryRulexor"
    // InternalBacktrackingContentAssistTestLanguage.g:3405:1: entryRulexor returns [EObject current=null] : iv_rulexor= rulexor EOF ;
    public final EObject entryRulexor() throws RecognitionException {
        EObject current = null;

        EObject iv_rulexor = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3405:44: (iv_rulexor= rulexor EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3406:2: iv_rulexor= rulexor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulexor=rulexor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulexor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulexor"


    // $ANTLR start "rulexor"
    // InternalBacktrackingContentAssistTestLanguage.g:3412:1: rulexor returns [EObject current=null] : (this_or_0= ruleor ( () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject rulexor() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_or_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3413:1: ( (this_or_0= ruleor ( () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3414:2: (this_or_0= ruleor ( () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3414:2: (this_or_0= ruleor ( () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:3415:3: this_or_0= ruleor ( () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getXorAccess().getOrParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_42);
            this_or_0=ruleor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_or_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3426:3: ( () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==59) ) {
                    int LA67_2 = input.LA(2);

                    if ( (synpred89_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3427:4: () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3427:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:3428:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getXorAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3437:4: ( (lv_op_2_0= 'xor' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3438:5: (lv_op_2_0= 'xor' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3438:5: (lv_op_2_0= 'xor' )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3439:6: lv_op_2_0= 'xor'
            	    {
            	    lv_op_2_0=(Token)match(input,59,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getXorAccess().getOpXorKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getXorRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "xor");
            	      					
            	    }

            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3451:4: ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3452:5: ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3452:5: ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3453:6: (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3453:6: (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp )
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( ((LA66_0>=RULE_INT && LA66_0<=RULE_STRING)||LA66_0==16||(LA66_0>=33 && LA66_0<=34)||(LA66_0>=36 && LA66_0<=50)||(LA66_0>=54 && LA66_0<=57)||LA66_0==69||(LA66_0>=75 && LA66_0<=76)) ) {
            	        alt66=1;
            	    }
            	    else if ( (LA66_0==80) ) {
            	        alt66=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3454:7: lv_argument_3_1= ruleor
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getXorAccess().getArgumentOrParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_42);
            	            lv_argument_3_1=ruleor();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getXorRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.or");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3470:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getXorAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_42);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getXorRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulexor"


    // $ANTLR start "entryRuleor"
    // InternalBacktrackingContentAssistTestLanguage.g:3493:1: entryRuleor returns [EObject current=null] : iv_ruleor= ruleor EOF ;
    public final EObject entryRuleor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleor = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3493:43: (iv_ruleor= ruleor EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3494:2: iv_ruleor= ruleor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleor=ruleor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleor"


    // $ANTLR start "ruleor"
    // InternalBacktrackingContentAssistTestLanguage.g:3500:1: ruleor returns [EObject current=null] : (this_and_0= ruleand ( () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject ruleor() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_and_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3501:1: ( (this_and_0= ruleand ( () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3502:2: (this_and_0= ruleand ( () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3502:2: (this_and_0= ruleand ( () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:3503:3: this_and_0= ruleand ( () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_43);
            this_and_0=ruleand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_and_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3514:3: ( () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==60) ) {
                    int LA69_2 = input.LA(2);

                    if ( (synpred91_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3515:4: () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3515:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:3516:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3525:4: ( (lv_op_2_0= 'or' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3526:5: (lv_op_2_0= 'or' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3526:5: (lv_op_2_0= 'or' )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3527:6: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,60,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getOrAccess().getOpOrKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	      					
            	    }

            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3539:4: ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3540:5: ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3540:5: ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3541:6: (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3541:6: (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( ((LA68_0>=RULE_INT && LA68_0<=RULE_STRING)||LA68_0==16||(LA68_0>=33 && LA68_0<=34)||(LA68_0>=36 && LA68_0<=50)||(LA68_0>=54 && LA68_0<=57)||LA68_0==69||(LA68_0>=75 && LA68_0<=76)) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==80) ) {
            	        alt68=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3542:7: lv_argument_3_1= ruleand
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getOrAccess().getArgumentAndParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_43);
            	            lv_argument_3_1=ruleand();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getOrRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.and");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3558:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getOrAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_43);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getOrRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleor"


    // $ANTLR start "entryRuleand"
    // InternalBacktrackingContentAssistTestLanguage.g:3581:1: entryRuleand returns [EObject current=null] : iv_ruleand= ruleand EOF ;
    public final EObject entryRuleand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleand = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3581:44: (iv_ruleand= ruleand EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3582:2: iv_ruleand= ruleand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleand=ruleand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleand; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleand"


    // $ANTLR start "ruleand"
    // InternalBacktrackingContentAssistTestLanguage.g:3588:1: ruleand returns [EObject current=null] : (this_equality_0= ruleequality ( () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject ruleand() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_equality_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3589:1: ( (this_equality_0= ruleequality ( () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3590:2: (this_equality_0= ruleequality ( () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3590:2: (this_equality_0= ruleequality ( () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:3591:3: this_equality_0= ruleequality ( () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_44);
            this_equality_0=ruleequality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3602:3: ( () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==61) ) {
                    int LA71_2 = input.LA(2);

                    if ( (synpred93_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt71=1;
                    }


                }


                switch (alt71) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3603:4: () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3603:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:3604:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3613:4: ( (lv_op_2_0= 'and' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3614:5: (lv_op_2_0= 'and' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3614:5: (lv_op_2_0= 'and' )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3615:6: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,61,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getAndAccess().getOpAndKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAndRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      					
            	    }

            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3627:4: ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3628:5: ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3628:5: ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3629:6: (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3629:6: (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( ((LA70_0>=RULE_INT && LA70_0<=RULE_STRING)||LA70_0==16||(LA70_0>=33 && LA70_0<=34)||(LA70_0>=36 && LA70_0<=50)||(LA70_0>=54 && LA70_0<=57)||LA70_0==69||(LA70_0>=75 && LA70_0<=76)) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==80) ) {
            	        alt70=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3630:7: lv_argument_3_1= ruleequality
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getAndAccess().getArgumentEqualityParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_44);
            	            lv_argument_3_1=ruleequality();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getAndRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.equality");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3646:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getAndAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_44);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getAndRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleand"


    // $ANTLR start "entryRuleequality"
    // InternalBacktrackingContentAssistTestLanguage.g:3669:1: entryRuleequality returns [EObject current=null] : iv_ruleequality= ruleequality EOF ;
    public final EObject entryRuleequality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleequality = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3669:49: (iv_ruleequality= ruleequality EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3670:2: iv_ruleequality= ruleequality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleequality=ruleequality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleequality; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleequality"


    // $ANTLR start "ruleequality"
    // InternalBacktrackingContentAssistTestLanguage.g:3676:1: ruleequality returns [EObject current=null] : (this_relational_0= rulerelational ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject ruleequality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_relational_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3677:1: ( (this_relational_0= rulerelational ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3678:2: (this_relational_0= rulerelational ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3678:2: (this_relational_0= rulerelational ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:3679:3: this_relational_0= rulerelational ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getRelationalParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_45);
            this_relational_0=rulerelational();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_relational_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3690:3: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==19) ) {
                    int LA74_2 = input.LA(2);

                    if ( (synpred96_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt74=1;
                    }


                }
                else if ( (LA74_0==62) ) {
                    int LA74_3 = input.LA(2);

                    if ( (synpred96_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3691:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3691:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:3692:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3701:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3702:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3702:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3703:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3703:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==19) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==62) ) {
            	        alt72=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3704:7: lv_op_2_1= '='
            	            {
            	            lv_op_2_1=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3715:7: lv_op_2_2= '<>'
            	            {
            	            lv_op_2_2=(Token)match(input,62,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3728:4: ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3729:5: ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3729:5: ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3730:6: (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3730:6: (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp )
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( ((LA73_0>=RULE_INT && LA73_0<=RULE_STRING)||LA73_0==16||(LA73_0>=33 && LA73_0<=34)||(LA73_0>=36 && LA73_0<=50)||(LA73_0>=54 && LA73_0<=57)||LA73_0==69||(LA73_0>=75 && LA73_0<=76)) ) {
            	        alt73=1;
            	    }
            	    else if ( (LA73_0==80) ) {
            	        alt73=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 73, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3731:7: lv_argument_3_1= rulerelational
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEqualityAccess().getArgumentRelationalParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_45);
            	            lv_argument_3_1=rulerelational();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.relational");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3747:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getEqualityAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_45);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getEqualityRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleequality"


    // $ANTLR start "entryRulerelational"
    // InternalBacktrackingContentAssistTestLanguage.g:3770:1: entryRulerelational returns [EObject current=null] : iv_rulerelational= rulerelational EOF ;
    public final EObject entryRulerelational() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelational = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3770:51: (iv_rulerelational= rulerelational EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3771:2: iv_rulerelational= rulerelational EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulerelational=rulerelational();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulerelational; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelational"


    // $ANTLR start "rulerelational"
    // InternalBacktrackingContentAssistTestLanguage.g:3777:1: rulerelational returns [EObject current=null] : (this_additive_0= ruleadditive ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject rulerelational() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_additive_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3778:1: ( (this_additive_0= ruleadditive ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3779:2: (this_additive_0= ruleadditive ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3779:2: (this_additive_0= ruleadditive ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:3780:3: this_additive_0= ruleadditive ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalAccess().getAdditiveParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_46);
            this_additive_0=ruleadditive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_additive_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3791:3: ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop77:
            do {
                int alt77=2;
                switch ( input.LA(1) ) {
                case 63:
                    {
                    int LA77_2 = input.LA(2);

                    if ( (synpred101_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt77=1;
                    }


                    }
                    break;
                case 64:
                    {
                    int LA77_3 = input.LA(2);

                    if ( (synpred101_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt77=1;
                    }


                    }
                    break;
                case 65:
                    {
                    int LA77_4 = input.LA(2);

                    if ( (synpred101_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt77=1;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA77_5 = input.LA(2);

                    if ( (synpred101_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt77=1;
                    }


                    }
                    break;

                }

                switch (alt77) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3792:4: () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3792:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:3793:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getRelationalAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3802:4: ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3803:5: ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3803:5: ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3804:6: (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3804:6: (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' )
            	    int alt75=4;
            	    switch ( input.LA(1) ) {
            	    case 63:
            	        {
            	        alt75=1;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt75=2;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt75=3;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt75=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 75, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt75) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3805:7: lv_op_2_1= '>'
            	            {
            	            lv_op_2_1=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getRelationalAccess().getOpGreaterThanSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3816:7: lv_op_2_2= '<'
            	            {
            	            lv_op_2_2=(Token)match(input,64,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getRelationalAccess().getOpLessThanSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3827:7: lv_op_2_3= '>='
            	            {
            	            lv_op_2_3=(Token)match(input,65,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getRelationalAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3838:7: lv_op_2_4= '<='
            	            {
            	            lv_op_2_4=(Token)match(input,66,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getRelationalAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getRelationalRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3851:4: ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3852:5: ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3852:5: ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3853:6: (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3853:6: (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp )
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( ((LA76_0>=RULE_INT && LA76_0<=RULE_STRING)||LA76_0==16||(LA76_0>=33 && LA76_0<=34)||(LA76_0>=36 && LA76_0<=50)||(LA76_0>=54 && LA76_0<=57)||LA76_0==69||(LA76_0>=75 && LA76_0<=76)) ) {
            	        alt76=1;
            	    }
            	    else if ( (LA76_0==80) ) {
            	        alt76=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 76, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3854:7: lv_argument_3_1= ruleadditive
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getRelationalAccess().getArgumentAdditiveParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_46);
            	            lv_argument_3_1=ruleadditive();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getRelationalRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.additive");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3870:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getRelationalAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_46);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getRelationalRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerelational"


    // $ANTLR start "entryRuleadditive"
    // InternalBacktrackingContentAssistTestLanguage.g:3893:1: entryRuleadditive returns [EObject current=null] : iv_ruleadditive= ruleadditive EOF ;
    public final EObject entryRuleadditive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleadditive = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3893:49: (iv_ruleadditive= ruleadditive EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3894:2: iv_ruleadditive= ruleadditive EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleadditive=ruleadditive();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleadditive; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleadditive"


    // $ANTLR start "ruleadditive"
    // InternalBacktrackingContentAssistTestLanguage.g:3900:1: ruleadditive returns [EObject current=null] : (this_multiplicative_0= rulemultiplicative ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject ruleadditive() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_multiplicative_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3901:1: ( (this_multiplicative_0= rulemultiplicative ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:3902:2: (this_multiplicative_0= rulemultiplicative ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:3902:2: (this_multiplicative_0= rulemultiplicative ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:3903:3: this_multiplicative_0= rulemultiplicative ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveAccess().getMultiplicativeParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_47);
            this_multiplicative_0=rulemultiplicative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_multiplicative_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:3914:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==35) ) {
                    int LA80_2 = input.LA(2);

                    if ( (synpred104_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt80=1;
                    }


                }
                else if ( (LA80_0==36) ) {
                    int LA80_3 = input.LA(2);

                    if ( (synpred104_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt80=1;
                    }


                }


                switch (alt80) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:3915:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3915:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:3916:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAdditiveAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3925:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3926:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3926:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3927:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3927:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==35) ) {
            	        alt78=1;
            	    }
            	    else if ( (LA78_0==36) ) {
            	        alt78=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 78, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3928:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,35,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getAdditiveAccess().getOpPlusSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAdditiveRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3939:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,36,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getAdditiveAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getAdditiveRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:3952:4: ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3953:5: ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3953:5: ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:3954:6: (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:3954:6: (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp )
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( ((LA79_0>=RULE_INT && LA79_0<=RULE_STRING)||LA79_0==16||(LA79_0>=33 && LA79_0<=34)||(LA79_0>=36 && LA79_0<=50)||(LA79_0>=54 && LA79_0<=57)||LA79_0==69||(LA79_0>=75 && LA79_0<=76)) ) {
            	        alt79=1;
            	    }
            	    else if ( (LA79_0==80) ) {
            	        alt79=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 79, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3955:7: lv_argument_3_1= rulemultiplicative
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getAdditiveAccess().getArgumentMultiplicativeParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_47);
            	            lv_argument_3_1=rulemultiplicative();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getAdditiveRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.multiplicative");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:3971:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getAdditiveAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_47);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getAdditiveRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleadditive"


    // $ANTLR start "entryRulemultiplicative"
    // InternalBacktrackingContentAssistTestLanguage.g:3994:1: entryRulemultiplicative returns [EObject current=null] : iv_rulemultiplicative= rulemultiplicative EOF ;
    public final EObject entryRulemultiplicative() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiplicative = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:3994:55: (iv_rulemultiplicative= rulemultiplicative EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:3995:2: iv_rulemultiplicative= rulemultiplicative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulemultiplicative=rulemultiplicative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiplicative; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplicative"


    // $ANTLR start "rulemultiplicative"
    // InternalBacktrackingContentAssistTestLanguage.g:4001:1: rulemultiplicative returns [EObject current=null] : (this_unary_0= ruleunary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) ) )* ) ;
    public final EObject rulemultiplicative() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_unary_0 = null;

        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4002:1: ( (this_unary_0= ruleunary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) ) )* ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4003:2: (this_unary_0= ruleunary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) ) )* )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4003:2: (this_unary_0= ruleunary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) ) )* )
            // InternalBacktrackingContentAssistTestLanguage.g:4004:3: this_unary_0= ruleunary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeAccess().getUnaryParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_48);
            this_unary_0=ruleunary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_unary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:4015:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==67) ) {
                    int LA83_2 = input.LA(2);

                    if ( (synpred107_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt83=1;
                    }


                }
                else if ( (LA83_0==68) ) {
                    int LA83_3 = input.LA(2);

                    if ( (synpred107_InternalBacktrackingContentAssistTestLanguage()) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:4016:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:4016:4: ()
            	    // InternalBacktrackingContentAssistTestLanguage.g:4017:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getMultiplicativeAccess().getInfixExpSourceAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:4026:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:4027:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:4027:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:4028:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:4028:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==67) ) {
            	        alt81=1;
            	    }
            	    else if ( (LA81_0==68) ) {
            	        alt81=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 81, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:4029:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,67,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getMultiplicativeAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicativeRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:4040:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,68,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getMultiplicativeAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getMultiplicativeRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalBacktrackingContentAssistTestLanguage.g:4053:4: ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:4054:5: ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:4054:5: ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:4055:6: (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:4055:6: (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp )
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( ((LA82_0>=RULE_INT && LA82_0<=RULE_STRING)||LA82_0==16||(LA82_0>=33 && LA82_0<=34)||(LA82_0>=36 && LA82_0<=50)||(LA82_0>=54 && LA82_0<=57)||LA82_0==69||(LA82_0>=75 && LA82_0<=76)) ) {
            	        alt82=1;
            	    }
            	    else if ( (LA82_0==80) ) {
            	        alt82=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 82, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:4056:7: lv_argument_3_1= ruleunary
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getMultiplicativeAccess().getArgumentUnaryParserRuleCall_1_2_0_0());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_48);
            	            lv_argument_3_1=ruleunary();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getMultiplicativeRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_1,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.unary");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalBacktrackingContentAssistTestLanguage.g:4072:7: lv_argument_3_2= ruleLetExp
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getMultiplicativeAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
            	              						
            	            }
            	            pushFollow(FollowSets000.FOLLOW_48);
            	            lv_argument_3_2=ruleLetExp();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getMultiplicativeRule());
            	              							}
            	              							set(
            	              								current,
            	              								"argument",
            	              								lv_argument_3_2,
            	              								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetExp");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiplicative"


    // $ANTLR start "entryRuleunary"
    // InternalBacktrackingContentAssistTestLanguage.g:4095:1: entryRuleunary returns [EObject current=null] : iv_ruleunary= ruleunary EOF ;
    public final EObject entryRuleunary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4095:46: (iv_ruleunary= ruleunary EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4096:2: iv_ruleunary= ruleunary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleunary=ruleunary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleunary; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary"


    // $ANTLR start "ruleunary"
    // InternalBacktrackingContentAssistTestLanguage.g:4102:1: ruleunary returns [EObject current=null] : (this_NavigationExp_0= ruleNavigationExp | ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) ) ( (lv_source_3_0= ruleunary ) ) ) ) ;
    public final EObject ruleunary() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_NavigationExp_0 = null;

        EObject lv_source_3_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4103:1: ( (this_NavigationExp_0= ruleNavigationExp | ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) ) ( (lv_source_3_0= ruleunary ) ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4104:2: (this_NavigationExp_0= ruleNavigationExp | ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) ) ( (lv_source_3_0= ruleunary ) ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4104:2: (this_NavigationExp_0= ruleNavigationExp | ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) ) ( (lv_source_3_0= ruleunary ) ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_INT && LA85_0<=RULE_STRING)||LA85_0==16||(LA85_0>=33 && LA85_0<=34)||(LA85_0>=37 && LA85_0<=50)||(LA85_0>=54 && LA85_0<=57)||(LA85_0>=75 && LA85_0<=76)) ) {
                alt85=1;
            }
            else if ( (LA85_0==36||LA85_0==69) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4105:3: this_NavigationExp_0= ruleNavigationExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getUnaryAccess().getNavigationExpParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NavigationExp_0=ruleNavigationExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NavigationExp_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4117:3: ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) ) ( (lv_source_3_0= ruleunary ) ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4117:3: ( () ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) ) ( (lv_source_3_0= ruleunary ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4118:4: () ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) ) ( (lv_source_3_0= ruleunary ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4118:4: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:4119:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryAccess().getPrefixExpAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:4128:4: ( ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4129:5: ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4129:5: ( (lv_op_2_1= '-' | lv_op_2_2= 'not' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4130:6: (lv_op_2_1= '-' | lv_op_2_2= 'not' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4130:6: (lv_op_2_1= '-' | lv_op_2_2= 'not' )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==36) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==69) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:4131:7: lv_op_2_1= '-'
                            {
                            lv_op_2_1=(Token)match(input,36,FollowSets000.FOLLOW_49); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_2_1, grammarAccess.getUnaryAccess().getOpHyphenMinusKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_2_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:4142:7: lv_op_2_2= 'not'
                            {
                            lv_op_2_2=(Token)match(input,69,FollowSets000.FOLLOW_49); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_2_2, grammarAccess.getUnaryAccess().getOpNotKeyword_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_2_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:4155:4: ( (lv_source_3_0= ruleunary ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4156:5: (lv_source_3_0= ruleunary )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4156:5: (lv_source_3_0= ruleunary )
                    // InternalBacktrackingContentAssistTestLanguage.g:4157:6: lv_source_3_0= ruleunary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryAccess().getSourceUnaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_source_3_0=ruleunary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryRule());
                      						}
                      						set(
                      							current,
                      							"source",
                      							lv_source_3_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.unary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary"


    // $ANTLR start "entryRuleSubNavigationExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4179:1: entryRuleSubNavigationExp returns [EObject current=null] : iv_ruleSubNavigationExp= ruleSubNavigationExp EOF ;
    public final EObject entryRuleSubNavigationExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubNavigationExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4179:57: (iv_ruleSubNavigationExp= ruleSubNavigationExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4180:2: iv_ruleSubNavigationExp= ruleSubNavigationExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubNavigationExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubNavigationExp=ruleSubNavigationExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubNavigationExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubNavigationExp"


    // $ANTLR start "ruleSubNavigationExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4186:1: ruleSubNavigationExp returns [EObject current=null] : (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_SelfExp_2= ruleSelfExp | this_PrimitiveLiteralExp_3= rulePrimitiveLiteralExp | this_TupleLiteralExp_4= ruleTupleLiteralExp | this_CollectionLiteralExp_5= ruleCollectionLiteralExp | this_PreExp_6= rulePreExp | this_TypeExp_7= ruleTypeExp | this_IfExp_8= ruleIfExp | (otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleSubNavigationExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject this_RoundBracketExp_0 = null;

        EObject this_SquareBracketExp_1 = null;

        EObject this_SelfExp_2 = null;

        EObject this_PrimitiveLiteralExp_3 = null;

        EObject this_TupleLiteralExp_4 = null;

        EObject this_CollectionLiteralExp_5 = null;

        EObject this_PreExp_6 = null;

        EObject this_TypeExp_7 = null;

        EObject this_IfExp_8 = null;

        EObject lv_source_11_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4187:1: ( (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_SelfExp_2= ruleSelfExp | this_PrimitiveLiteralExp_3= rulePrimitiveLiteralExp | this_TupleLiteralExp_4= ruleTupleLiteralExp | this_CollectionLiteralExp_5= ruleCollectionLiteralExp | this_PreExp_6= rulePreExp | this_TypeExp_7= ruleTypeExp | this_IfExp_8= ruleIfExp | (otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')' ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4188:2: (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_SelfExp_2= ruleSelfExp | this_PrimitiveLiteralExp_3= rulePrimitiveLiteralExp | this_TupleLiteralExp_4= ruleTupleLiteralExp | this_CollectionLiteralExp_5= ruleCollectionLiteralExp | this_PreExp_6= rulePreExp | this_TypeExp_7= ruleTypeExp | this_IfExp_8= ruleIfExp | (otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')' ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4188:2: (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_SelfExp_2= ruleSelfExp | this_PrimitiveLiteralExp_3= rulePrimitiveLiteralExp | this_TupleLiteralExp_4= ruleTupleLiteralExp | this_CollectionLiteralExp_5= ruleCollectionLiteralExp | this_PreExp_6= rulePreExp | this_TypeExp_7= ruleTypeExp | this_IfExp_8= ruleIfExp | (otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')' ) )
            int alt86=10;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4189:3: this_RoundBracketExp_0= ruleRoundBracketExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getRoundBracketExpParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RoundBracketExp_0=ruleRoundBracketExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RoundBracketExp_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4201:3: this_SquareBracketExp_1= ruleSquareBracketExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getSquareBracketExpParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SquareBracketExp_1=ruleSquareBracketExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SquareBracketExp_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4213:3: this_SelfExp_2= ruleSelfExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getSelfExpParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SelfExp_2=ruleSelfExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SelfExp_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4225:3: this_PrimitiveLiteralExp_3= rulePrimitiveLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getPrimitiveLiteralExpParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PrimitiveLiteralExp_3=rulePrimitiveLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveLiteralExp_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4237:3: this_TupleLiteralExp_4= ruleTupleLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getTupleLiteralExpParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TupleLiteralExp_4=ruleTupleLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleLiteralExp_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4249:3: this_CollectionLiteralExp_5= ruleCollectionLiteralExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getCollectionLiteralExpParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionLiteralExp_5=ruleCollectionLiteralExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CollectionLiteralExp_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4261:3: this_PreExp_6= rulePreExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getPreExpParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PreExp_6=rulePreExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreExp_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4273:3: this_TypeExp_7= ruleTypeExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getTypeExpParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeExp_7=ruleTypeExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeExp_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4285:3: this_IfExp_8= ruleIfExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigationExpAccess().getIfExpParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IfExp_8=ruleIfExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfExp_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4297:3: (otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4297:3: (otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')' )
                    // InternalBacktrackingContentAssistTestLanguage.g:4298:4: otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getSubNavigationExpAccess().getLeftParenthesisKeyword_9_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:4302:4: ()
                    // InternalBacktrackingContentAssistTestLanguage.g:4303:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getSubNavigationExpAccess().getNestedExpAction_9_1(),
                      						current);
                      				
                    }

                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:4312:4: ( (lv_source_11_0= ruleExpression ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4313:5: (lv_source_11_0= ruleExpression )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4313:5: (lv_source_11_0= ruleExpression )
                    // InternalBacktrackingContentAssistTestLanguage.g:4314:6: lv_source_11_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSubNavigationExpAccess().getSourceExpressionParserRuleCall_9_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_source_11_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSubNavigationExpRule());
                      						}
                      						set(
                      							current,
                      							"source",
                      							lv_source_11_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getSubNavigationExpAccess().getRightParenthesisKeyword_9_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubNavigationExp"


    // $ANTLR start "entryRuleSubNavigatingExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4340:1: entryRuleSubNavigatingExp returns [EObject current=null] : iv_ruleSubNavigatingExp= ruleSubNavigatingExp EOF ;
    public final EObject entryRuleSubNavigatingExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubNavigatingExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4340:57: (iv_ruleSubNavigatingExp= ruleSubNavigatingExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4341:2: iv_ruleSubNavigatingExp= ruleSubNavigatingExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubNavigatingExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubNavigatingExp=ruleSubNavigatingExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubNavigatingExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubNavigatingExp"


    // $ANTLR start "ruleSubNavigatingExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4347:1: ruleSubNavigatingExp returns [EObject current=null] : (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_PreExp_2= rulePreExp | this_NameExp_3= ruleNameExp ) ;
    public final EObject ruleSubNavigatingExp() throws RecognitionException {
        EObject current = null;

        EObject this_RoundBracketExp_0 = null;

        EObject this_SquareBracketExp_1 = null;

        EObject this_PreExp_2 = null;

        EObject this_NameExp_3 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4348:1: ( (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_PreExp_2= rulePreExp | this_NameExp_3= ruleNameExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4349:2: (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_PreExp_2= rulePreExp | this_NameExp_3= ruleNameExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4349:2: (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_PreExp_2= rulePreExp | this_NameExp_3= ruleNameExp )
            int alt87=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA87_1 = input.LA(2);

                if ( (synpred119_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=1;
                }
                else if ( (synpred120_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=2;
                }
                else if ( (synpred121_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=3;
                }
                else if ( (true) ) {
                    alt87=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA87_2 = input.LA(2);

                if ( (synpred119_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=1;
                }
                else if ( (synpred120_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=2;
                }
                else if ( (synpred121_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=3;
                }
                else if ( (true) ) {
                    alt87=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA87_3 = input.LA(2);

                if ( (synpred119_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=1;
                }
                else if ( (synpred120_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=2;
                }
                else if ( (synpred121_InternalBacktrackingContentAssistTestLanguage()) ) {
                    alt87=3;
                }
                else if ( (true) ) {
                    alt87=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4350:3: this_RoundBracketExp_0= ruleRoundBracketExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigatingExpAccess().getRoundBracketExpParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RoundBracketExp_0=ruleRoundBracketExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RoundBracketExp_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4362:3: this_SquareBracketExp_1= ruleSquareBracketExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigatingExpAccess().getSquareBracketExpParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SquareBracketExp_1=ruleSquareBracketExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SquareBracketExp_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4374:3: this_PreExp_2= rulePreExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigatingExpAccess().getPreExpParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PreExp_2=rulePreExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreExp_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4386:3: this_NameExp_3= ruleNameExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubNavigatingExpAccess().getNameExpParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NameExp_3=ruleNameExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameExp_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubNavigatingExp"


    // $ANTLR start "entryRuleiteratorVariable"
    // InternalBacktrackingContentAssistTestLanguage.g:4401:1: entryRuleiteratorVariable returns [EObject current=null] : iv_ruleiteratorVariable= ruleiteratorVariable EOF ;
    public final EObject entryRuleiteratorVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiteratorVariable = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4401:57: (iv_ruleiteratorVariable= ruleiteratorVariable EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4402:2: iv_ruleiteratorVariable= ruleiteratorVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleiteratorVariable=ruleiteratorVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleiteratorVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleiteratorVariable"


    // $ANTLR start "ruleiteratorVariable"
    // InternalBacktrackingContentAssistTestLanguage.g:4408:1: ruleiteratorVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? ) ;
    public final EObject ruleiteratorVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4409:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4410:2: ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4410:2: ( ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )? )
            // InternalBacktrackingContentAssistTestLanguage.g:4411:3: ( (lv_name_0_0= ruleIdentifier ) ) (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )?
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4411:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4412:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4412:4: (lv_name_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:4413:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIteratorVariableAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIteratorVariableRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:4430:3: (otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==12) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4431:4: otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) )
                    {
                    otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getIteratorVariableAccess().getColonKeyword_1_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:4435:4: ( (lv_type_2_0= ruleTypeExp ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4436:5: (lv_type_2_0= ruleTypeExp )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4436:5: (lv_type_2_0= ruleTypeExp )
                    // InternalBacktrackingContentAssistTestLanguage.g:4437:6: lv_type_2_0= ruleTypeExp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIteratorVariableAccess().getTypeTypeExpParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_type_2_0=ruleTypeExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIteratorVariableRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleiteratorVariable"


    // $ANTLR start "entryRuleiteratorAccumulator"
    // InternalBacktrackingContentAssistTestLanguage.g:4459:1: entryRuleiteratorAccumulator returns [EObject current=null] : iv_ruleiteratorAccumulator= ruleiteratorAccumulator EOF ;
    public final EObject entryRuleiteratorAccumulator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleiteratorAccumulator = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4459:60: (iv_ruleiteratorAccumulator= ruleiteratorAccumulator EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4460:2: iv_ruleiteratorAccumulator= ruleiteratorAccumulator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIteratorAccumulatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleiteratorAccumulator=ruleiteratorAccumulator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleiteratorAccumulator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleiteratorAccumulator"


    // $ANTLR start "ruleiteratorAccumulator"
    // InternalBacktrackingContentAssistTestLanguage.g:4466:1: ruleiteratorAccumulator returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleiteratorAccumulator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4467:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4468:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4468:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4469:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4469:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4470:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4470:4: (lv_name_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:4471:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIteratorAccumulatorAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIteratorAccumulatorRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIteratorAccumulatorAccess().getColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:4492:3: ( (lv_type_2_0= ruleTypeExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4493:4: (lv_type_2_0= ruleTypeExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4493:4: (lv_type_2_0= ruleTypeExp )
            // InternalBacktrackingContentAssistTestLanguage.g:4494:5: lv_type_2_0= ruleTypeExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIteratorAccumulatorAccess().getTypeTypeExpParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_type_2_0=ruleTypeExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIteratorAccumulatorRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIteratorAccumulatorAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:4515:3: ( (lv_initExpression_4_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4516:4: (lv_initExpression_4_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4516:4: (lv_initExpression_4_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:4517:5: lv_initExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIteratorAccumulatorAccess().getInitExpressionExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_initExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIteratorAccumulatorRule());
              					}
              					set(
              						current,
              						"initExpression",
              						lv_initExpression_4_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleiteratorAccumulator"


    // $ANTLR start "entryRuleRoundBracketExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4538:1: entryRuleRoundBracketExp returns [EObject current=null] : iv_ruleRoundBracketExp= ruleRoundBracketExp EOF ;
    public final EObject entryRuleRoundBracketExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoundBracketExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4538:56: (iv_ruleRoundBracketExp= ruleRoundBracketExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4539:2: iv_ruleRoundBracketExp= ruleRoundBracketExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoundBracketExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoundBracketExp=ruleRoundBracketExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoundBracketExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoundBracketExp"


    // $ANTLR start "ruleRoundBracketExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4545:1: ruleRoundBracketExp returns [EObject current=null] : ( ( (lv_name_0_0= ruleNameExp ) ) (otherlv_1= '@' ( (lv_pre_2_0= 'pre' ) ) )? otherlv_3= '(' ( ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|' )? ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' ) ;
    public final EObject ruleRoundBracketExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_name_0_0 = null;

        EObject lv_variable1_4_0 = null;

        EObject lv_variable2_6_0 = null;

        EObject lv_variable2_8_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4546:1: ( ( ( (lv_name_0_0= ruleNameExp ) ) (otherlv_1= '@' ( (lv_pre_2_0= 'pre' ) ) )? otherlv_3= '(' ( ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|' )? ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4547:2: ( ( (lv_name_0_0= ruleNameExp ) ) (otherlv_1= '@' ( (lv_pre_2_0= 'pre' ) ) )? otherlv_3= '(' ( ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|' )? ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4547:2: ( ( (lv_name_0_0= ruleNameExp ) ) (otherlv_1= '@' ( (lv_pre_2_0= 'pre' ) ) )? otherlv_3= '(' ( ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|' )? ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')' )
            // InternalBacktrackingContentAssistTestLanguage.g:4548:3: ( (lv_name_0_0= ruleNameExp ) ) (otherlv_1= '@' ( (lv_pre_2_0= 'pre' ) ) )? otherlv_3= '(' ( ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|' )? ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )? otherlv_13= ')'
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4548:3: ( (lv_name_0_0= ruleNameExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4549:4: (lv_name_0_0= ruleNameExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4549:4: (lv_name_0_0= ruleNameExp )
            // InternalBacktrackingContentAssistTestLanguage.g:4550:5: lv_name_0_0= ruleNameExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoundBracketExpAccess().getNameNameExpParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_50);
            lv_name_0_0=ruleNameExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRoundBracketExpRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NameExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:4567:3: (otherlv_1= '@' ( (lv_pre_2_0= 'pre' ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==70) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4568:4: otherlv_1= '@' ( (lv_pre_2_0= 'pre' ) )
                    {
                    otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRoundBracketExpAccess().getCommercialAtKeyword_1_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:4572:4: ( (lv_pre_2_0= 'pre' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4573:5: (lv_pre_2_0= 'pre' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4573:5: (lv_pre_2_0= 'pre' )
                    // InternalBacktrackingContentAssistTestLanguage.g:4574:6: lv_pre_2_0= 'pre'
                    {
                    lv_pre_2_0=(Token)match(input,26,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_pre_2_0, grammarAccess.getRoundBracketExpAccess().getPrePreKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRoundBracketExpRule());
                      						}
                      						setWithLastConsumed(current, "pre", lv_pre_2_0 != null, "pre");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRoundBracketExpAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:4591:3: ( ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|' )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4592:4: ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|'
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4592:4: ( (lv_variable1_4_0= ruleiteratorVariable ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4593:5: (lv_variable1_4_0= ruleiteratorVariable )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4593:5: (lv_variable1_4_0= ruleiteratorVariable )
                    // InternalBacktrackingContentAssistTestLanguage.g:4594:6: lv_variable1_4_0= ruleiteratorVariable
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketExpAccess().getVariable1IteratorVariableParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_53);
                    lv_variable1_4_0=ruleiteratorVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundBracketExpRule());
                      						}
                      						set(
                      							current,
                      							"variable1",
                      							lv_variable1_4_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.iteratorVariable");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:4611:4: ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )?
                    int alt90=3;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==17) ) {
                        alt90=1;
                    }
                    else if ( (LA90_0==71) ) {
                        alt90=2;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalBacktrackingContentAssistTestLanguage.g:4612:5: (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:4612:5: (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:4613:6: otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) )
                            {
                            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getRoundBracketExpAccess().getCommaKeyword_3_1_0_0());
                              					
                            }
                            // InternalBacktrackingContentAssistTestLanguage.g:4617:6: ( (lv_variable2_6_0= ruleiteratorVariable ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:4618:7: (lv_variable2_6_0= ruleiteratorVariable )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:4618:7: (lv_variable2_6_0= ruleiteratorVariable )
                            // InternalBacktrackingContentAssistTestLanguage.g:4619:8: lv_variable2_6_0= ruleiteratorVariable
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getRoundBracketExpAccess().getVariable2IteratorVariableParserRuleCall_3_1_0_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_54);
                            lv_variable2_6_0=ruleiteratorVariable();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getRoundBracketExpRule());
                              								}
                              								set(
                              									current,
                              									"variable2",
                              									lv_variable2_6_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.iteratorVariable");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBacktrackingContentAssistTestLanguage.g:4638:5: (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:4638:5: (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:4639:6: otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) )
                            {
                            otherlv_7=(Token)match(input,71,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_7, grammarAccess.getRoundBracketExpAccess().getSemicolonKeyword_3_1_1_0());
                              					
                            }
                            // InternalBacktrackingContentAssistTestLanguage.g:4643:6: ( (lv_variable2_8_0= ruleiteratorAccumulator ) )
                            // InternalBacktrackingContentAssistTestLanguage.g:4644:7: (lv_variable2_8_0= ruleiteratorAccumulator )
                            {
                            // InternalBacktrackingContentAssistTestLanguage.g:4644:7: (lv_variable2_8_0= ruleiteratorAccumulator )
                            // InternalBacktrackingContentAssistTestLanguage.g:4645:8: lv_variable2_8_0= ruleiteratorAccumulator
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getRoundBracketExpAccess().getVariable2IteratorAccumulatorParserRuleCall_3_1_1_1_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_54);
                            lv_variable2_8_0=ruleiteratorAccumulator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getRoundBracketExpRule());
                              								}
                              								set(
                              									current,
                              									"variable2",
                              									lv_variable2_8_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.iteratorAccumulator");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,72,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getRoundBracketExpAccess().getVerticalLineKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalBacktrackingContentAssistTestLanguage.g:4669:3: ( ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )* )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( ((LA93_0>=RULE_INT && LA93_0<=RULE_STRING)||LA93_0==16||(LA93_0>=33 && LA93_0<=34)||(LA93_0>=36 && LA93_0<=50)||(LA93_0>=54 && LA93_0<=57)||LA93_0==69||(LA93_0>=75 && LA93_0<=76)||LA93_0==80) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4670:4: ( (lv_arguments_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )*
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4670:4: ( (lv_arguments_10_0= ruleExpression ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4671:5: (lv_arguments_10_0= ruleExpression )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4671:5: (lv_arguments_10_0= ruleExpression )
                    // InternalBacktrackingContentAssistTestLanguage.g:4672:6: lv_arguments_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRoundBracketExpAccess().getArgumentsExpressionParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_arguments_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRoundBracketExpRule());
                      						}
                      						add(
                      							current,
                      							"arguments",
                      							lv_arguments_10_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBacktrackingContentAssistTestLanguage.g:4689:4: (otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) ) )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==17) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalBacktrackingContentAssistTestLanguage.g:4690:5: otherlv_11= ',' ( (lv_arguments_12_0= ruleExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getRoundBracketExpAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalBacktrackingContentAssistTestLanguage.g:4694:5: ( (lv_arguments_12_0= ruleExpression ) )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:4695:6: (lv_arguments_12_0= ruleExpression )
                    	    {
                    	    // InternalBacktrackingContentAssistTestLanguage.g:4695:6: (lv_arguments_12_0= ruleExpression )
                    	    // InternalBacktrackingContentAssistTestLanguage.g:4696:7: lv_arguments_12_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRoundBracketExpAccess().getArgumentsExpressionParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_12);
                    	    lv_arguments_12_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRoundBracketExpRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arguments",
                    	      								lv_arguments_12_0,
                    	      								"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getRoundBracketExpAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoundBracketExp"


    // $ANTLR start "entryRuleSquareBracketExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4723:1: entryRuleSquareBracketExp returns [EObject current=null] : iv_ruleSquareBracketExp= ruleSquareBracketExp EOF ;
    public final EObject entryRuleSquareBracketExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareBracketExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4723:57: (iv_ruleSquareBracketExp= ruleSquareBracketExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4724:2: iv_ruleSquareBracketExp= ruleSquareBracketExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSquareBracketExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSquareBracketExp=ruleSquareBracketExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSquareBracketExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSquareBracketExp"


    // $ANTLR start "ruleSquareBracketExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4730:1: ruleSquareBracketExp returns [EObject current=null] : ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '[' ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* otherlv_5= ']' (otherlv_6= '@' ( (lv_pre_7_0= 'pre' ) ) )? ) ;
    public final EObject ruleSquareBracketExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_pre_7_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4731:1: ( ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '[' ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* otherlv_5= ']' (otherlv_6= '@' ( (lv_pre_7_0= 'pre' ) ) )? ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4732:2: ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '[' ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* otherlv_5= ']' (otherlv_6= '@' ( (lv_pre_7_0= 'pre' ) ) )? )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4732:2: ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '[' ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* otherlv_5= ']' (otherlv_6= '@' ( (lv_pre_7_0= 'pre' ) ) )? )
            // InternalBacktrackingContentAssistTestLanguage.g:4733:3: ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '[' ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* otherlv_5= ']' (otherlv_6= '@' ( (lv_pre_7_0= 'pre' ) ) )?
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4733:3: ( (lv_name_0_0= ruleNameExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4734:4: (lv_name_0_0= ruleNameExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4734:4: (lv_name_0_0= ruleNameExp )
            // InternalBacktrackingContentAssistTestLanguage.g:4735:5: lv_name_0_0= ruleNameExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketExpAccess().getNameNameExpParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_55);
            lv_name_0_0=ruleNameExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSquareBracketExpRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NameExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSquareBracketExpAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:4756:3: ( (lv_arguments_2_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4757:4: (lv_arguments_2_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4757:4: (lv_arguments_2_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:4758:5: lv_arguments_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSquareBracketExpAccess().getArgumentsExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_56);
            lv_arguments_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSquareBracketExpRule());
              					}
              					add(
              						current,
              						"arguments",
              						lv_arguments_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:4775:3: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==17) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:4776:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getSquareBracketExpAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalBacktrackingContentAssistTestLanguage.g:4780:4: ( (lv_arguments_4_0= ruleExpression ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:4781:5: (lv_arguments_4_0= ruleExpression )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:4781:5: (lv_arguments_4_0= ruleExpression )
            	    // InternalBacktrackingContentAssistTestLanguage.g:4782:6: lv_arguments_4_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSquareBracketExpAccess().getArgumentsExpressionParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_56);
            	    lv_arguments_4_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSquareBracketExpRule());
            	      						}
            	      						add(
            	      							current,
            	      							"arguments",
            	      							lv_arguments_4_0,
            	      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_5=(Token)match(input,74,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getSquareBracketExpAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:4804:3: (otherlv_6= '@' ( (lv_pre_7_0= 'pre' ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==70) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4805:4: otherlv_6= '@' ( (lv_pre_7_0= 'pre' ) )
                    {
                    otherlv_6=(Token)match(input,70,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSquareBracketExpAccess().getCommercialAtKeyword_5_0());
                      			
                    }
                    // InternalBacktrackingContentAssistTestLanguage.g:4809:4: ( (lv_pre_7_0= 'pre' ) )
                    // InternalBacktrackingContentAssistTestLanguage.g:4810:5: (lv_pre_7_0= 'pre' )
                    {
                    // InternalBacktrackingContentAssistTestLanguage.g:4810:5: (lv_pre_7_0= 'pre' )
                    // InternalBacktrackingContentAssistTestLanguage.g:4811:6: lv_pre_7_0= 'pre'
                    {
                    lv_pre_7_0=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_pre_7_0, grammarAccess.getSquareBracketExpAccess().getPrePreKeyword_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSquareBracketExpRule());
                      						}
                      						setWithLastConsumed(current, "pre", lv_pre_7_0 != null, "pre");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSquareBracketExp"


    // $ANTLR start "entryRulePreExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4828:1: entryRulePreExp returns [EObject current=null] : iv_rulePreExp= rulePreExp EOF ;
    public final EObject entryRulePreExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4828:47: (iv_rulePreExp= rulePreExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4829:2: iv_rulePreExp= rulePreExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePreExp=rulePreExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreExp"


    // $ANTLR start "rulePreExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4835:1: rulePreExp returns [EObject current=null] : ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '@' otherlv_2= 'pre' ) ;
    public final EObject rulePreExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_name_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4836:1: ( ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '@' otherlv_2= 'pre' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4837:2: ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '@' otherlv_2= 'pre' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4837:2: ( ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '@' otherlv_2= 'pre' )
            // InternalBacktrackingContentAssistTestLanguage.g:4838:3: ( (lv_name_0_0= ruleNameExp ) ) otherlv_1= '@' otherlv_2= 'pre'
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4838:3: ( (lv_name_0_0= ruleNameExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4839:4: (lv_name_0_0= ruleNameExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4839:4: (lv_name_0_0= ruleNameExp )
            // InternalBacktrackingContentAssistTestLanguage.g:4840:5: lv_name_0_0= ruleNameExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreExpAccess().getNameNameExpParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_58);
            lv_name_0_0=ruleNameExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreExpRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NameExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPreExpAccess().getCommercialAtKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getPreExpAccess().getPreKeyword_2());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreExp"


    // $ANTLR start "entryRuleSelfExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4869:1: entryRuleSelfExp returns [EObject current=null] : iv_ruleSelfExp= ruleSelfExp EOF ;
    public final EObject entryRuleSelfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelfExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4869:48: (iv_ruleSelfExp= ruleSelfExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4870:2: iv_ruleSelfExp= ruleSelfExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelfExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelfExp=ruleSelfExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelfExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelfExp"


    // $ANTLR start "ruleSelfExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4876:1: ruleSelfExp returns [EObject current=null] : ( () otherlv_1= 'self' ) ;
    public final EObject ruleSelfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4877:1: ( ( () otherlv_1= 'self' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4878:2: ( () otherlv_1= 'self' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4878:2: ( () otherlv_1= 'self' )
            // InternalBacktrackingContentAssistTestLanguage.g:4879:3: () otherlv_1= 'self'
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4879:3: ()
            // InternalBacktrackingContentAssistTestLanguage.g:4880:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSelfExpAccess().getSelfExpAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,75,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSelfExpAccess().getSelfKeyword_1());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelfExp"


    // $ANTLR start "entryRuleNameExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4897:1: entryRuleNameExp returns [EObject current=null] : iv_ruleNameExp= ruleNameExp EOF ;
    public final EObject entryRuleNameExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4897:48: (iv_ruleNameExp= ruleNameExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4898:2: iv_ruleNameExp= ruleNameExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNameExp=ruleNameExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameExp"


    // $ANTLR start "ruleNameExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4904:1: ruleNameExp returns [EObject current=null] : (this_PathNameExp_0= rulePathNameExp | this_SimpleNameExp_1= ruleSimpleNameExp ) ;
    public final EObject ruleNameExp() throws RecognitionException {
        EObject current = null;

        EObject this_PathNameExp_0 = null;

        EObject this_SimpleNameExp_1 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4905:1: ( (this_PathNameExp_0= rulePathNameExp | this_SimpleNameExp_1= ruleSimpleNameExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4906:2: (this_PathNameExp_0= rulePathNameExp | this_SimpleNameExp_1= ruleSimpleNameExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4906:2: (this_PathNameExp_0= rulePathNameExp | this_SimpleNameExp_1= ruleSimpleNameExp )
            int alt96=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA96_1 = input.LA(2);

                if ( (LA96_1==EOF||LA96_1==11||(LA96_1>=13 && LA96_1<=26)||(LA96_1>=28 && LA96_1<=31)||(LA96_1>=35 && LA96_1<=36)||(LA96_1>=52 && LA96_1<=53)||(LA96_1>=58 && LA96_1<=68)||(LA96_1>=70 && LA96_1<=74)||(LA96_1>=77 && LA96_1<=79)||LA96_1==81) ) {
                    alt96=2;
                }
                else if ( (LA96_1==27) ) {
                    alt96=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 1, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA96_2 = input.LA(2);

                if ( (LA96_2==EOF||LA96_2==11||(LA96_2>=13 && LA96_2<=26)||(LA96_2>=28 && LA96_2<=31)||(LA96_2>=35 && LA96_2<=36)||(LA96_2>=52 && LA96_2<=53)||(LA96_2>=58 && LA96_2<=68)||(LA96_2>=70 && LA96_2<=74)||(LA96_2>=77 && LA96_2<=79)||LA96_2==81) ) {
                    alt96=2;
                }
                else if ( (LA96_2==27) ) {
                    alt96=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 2, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA96_3 = input.LA(2);

                if ( (LA96_3==EOF||LA96_3==11||(LA96_3>=13 && LA96_3<=26)||(LA96_3>=28 && LA96_3<=31)||(LA96_3>=35 && LA96_3<=36)||(LA96_3>=52 && LA96_3<=53)||(LA96_3>=58 && LA96_3<=68)||(LA96_3>=70 && LA96_3<=74)||(LA96_3>=77 && LA96_3<=79)||LA96_3==81) ) {
                    alt96=2;
                }
                else if ( (LA96_3==27) ) {
                    alt96=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4907:3: this_PathNameExp_0= rulePathNameExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNameExpAccess().getPathNameExpParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PathNameExp_0=rulePathNameExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PathNameExp_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBacktrackingContentAssistTestLanguage.g:4919:3: this_SimpleNameExp_1= ruleSimpleNameExp
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNameExpAccess().getSimpleNameExpParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SimpleNameExp_1=ruleSimpleNameExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SimpleNameExp_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameExp"


    // $ANTLR start "entryRulePathNameExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4934:1: entryRulePathNameExp returns [EObject current=null] : iv_rulePathNameExp= rulePathNameExp EOF ;
    public final EObject entryRulePathNameExp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathNameExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4934:52: (iv_rulePathNameExp= rulePathNameExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4935:2: iv_rulePathNameExp= rulePathNameExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathNameExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePathNameExp=rulePathNameExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePathNameExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathNameExp"


    // $ANTLR start "rulePathNameExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4941:1: rulePathNameExp returns [EObject current=null] : ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleNameExp ) ) ) ;
    public final EObject rulePathNameExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_namespace_0_0 = null;

        EObject lv_element_2_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4942:1: ( ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleNameExp ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4943:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleNameExp ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4943:2: ( ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleNameExp ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4944:3: ( (lv_namespace_0_0= ruleIdentifier ) ) otherlv_1= '::' ( (lv_element_2_0= ruleNameExp ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4944:3: ( (lv_namespace_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4945:4: (lv_namespace_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4945:4: (lv_namespace_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:4946:5: lv_namespace_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathNameExpAccess().getNamespaceIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_namespace_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPathNameExpRule());
              					}
              					set(
              						current,
              						"namespace",
              						lv_namespace_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPathNameExpAccess().getColonColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:4967:3: ( (lv_element_2_0= ruleNameExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4968:4: (lv_element_2_0= ruleNameExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4968:4: (lv_element_2_0= ruleNameExp )
            // InternalBacktrackingContentAssistTestLanguage.g:4969:5: lv_element_2_0= ruleNameExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPathNameExpAccess().getElementNameExpParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_2_0=ruleNameExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPathNameExpRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.NameExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathNameExp"


    // $ANTLR start "entryRuleSimpleNameExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4990:1: entryRuleSimpleNameExp returns [EObject current=null] : iv_ruleSimpleNameExp= ruleSimpleNameExp EOF ;
    public final EObject entryRuleSimpleNameExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleNameExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4990:54: (iv_ruleSimpleNameExp= ruleSimpleNameExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:4991:2: iv_ruleSimpleNameExp= ruleSimpleNameExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleNameExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleNameExp=ruleSimpleNameExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleNameExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleNameExp"


    // $ANTLR start "ruleSimpleNameExp"
    // InternalBacktrackingContentAssistTestLanguage.g:4997:1: ruleSimpleNameExp returns [EObject current=null] : ( (lv_element_0_0= ruleIdentifier ) ) ;
    public final EObject ruleSimpleNameExp() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_element_0_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:4998:1: ( ( (lv_element_0_0= ruleIdentifier ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:4999:2: ( (lv_element_0_0= ruleIdentifier ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:4999:2: ( (lv_element_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5000:3: (lv_element_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5000:3: (lv_element_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:5001:4: lv_element_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSimpleNameExpAccess().getElementIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getSimpleNameExpRule());
              				}
              				set(
              					current,
              					"element",
              					lv_element_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleNameExp"


    // $ANTLR start "entryRuleIfExp"
    // InternalBacktrackingContentAssistTestLanguage.g:5021:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:5021:46: (iv_ruleIfExp= ruleIfExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:5022:2: iv_ruleIfExp= ruleIfExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExp"


    // $ANTLR start "ruleIfExp"
    // InternalBacktrackingContentAssistTestLanguage.g:5028:1: ruleIfExp returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpression ) ) otherlv_6= 'endif' ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_1_0 = null;

        EObject lv_thenExpression_3_0 = null;

        EObject lv_elseExpression_5_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:5029:1: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpression ) ) otherlv_6= 'endif' ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5030:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpression ) ) otherlv_6= 'endif' )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5030:2: (otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpression ) ) otherlv_6= 'endif' )
            // InternalBacktrackingContentAssistTestLanguage.g:5031:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_thenExpression_3_0= ruleExpression ) ) otherlv_4= 'else' ( (lv_elseExpression_5_0= ruleExpression ) ) otherlv_6= 'endif'
            {
            otherlv_0=(Token)match(input,76,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfExpAccess().getIfKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:5035:3: ( (lv_condition_1_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5036:4: (lv_condition_1_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5036:4: (lv_condition_1_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:5037:5: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpAccess().getConditionExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_59);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,77,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfExpAccess().getThenKeyword_2());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:5058:3: ( (lv_thenExpression_3_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5059:4: (lv_thenExpression_3_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5059:4: (lv_thenExpression_3_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:5060:5: lv_thenExpression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpAccess().getThenExpressionExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_60);
            lv_thenExpression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpRule());
              					}
              					set(
              						current,
              						"thenExpression",
              						lv_thenExpression_3_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,78,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfExpAccess().getElseKeyword_4());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:5081:3: ( (lv_elseExpression_5_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5082:4: (lv_elseExpression_5_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5082:4: (lv_elseExpression_5_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:5083:5: lv_elseExpression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfExpAccess().getElseExpressionExpressionParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_61);
            lv_elseExpression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfExpRule());
              					}
              					set(
              						current,
              						"elseExpression",
              						lv_elseExpression_5_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,79,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfExpAccess().getEndifKeyword_6());
              		
            }

            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExp"


    // $ANTLR start "entryRuleLetExp"
    // InternalBacktrackingContentAssistTestLanguage.g:5108:1: entryRuleLetExp returns [EObject current=null] : iv_ruleLetExp= ruleLetExp EOF ;
    public final EObject entryRuleLetExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExp = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:5108:47: (iv_ruleLetExp= ruleLetExp EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:5109:2: iv_ruleLetExp= ruleLetExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetExp=ruleLetExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExp; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExp"


    // $ANTLR start "ruleLetExp"
    // InternalBacktrackingContentAssistTestLanguage.g:5115:1: ruleLetExp returns [EObject current=null] : (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariable ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLetExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_in_5_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:5116:1: ( (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariable ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5117:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariable ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5117:2: (otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariable ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5118:3: otherlv_0= 'let' ( (lv_variable_1_0= ruleLetVariable ) ) (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariable ) ) )* otherlv_4= 'in' ( (lv_in_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,80,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetExpAccess().getLetKeyword_0());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:5122:3: ( (lv_variable_1_0= ruleLetVariable ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5123:4: (lv_variable_1_0= ruleLetVariable )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5123:4: (lv_variable_1_0= ruleLetVariable )
            // InternalBacktrackingContentAssistTestLanguage.g:5124:5: lv_variable_1_0= ruleLetVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpAccess().getVariableLetVariableParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_62);
            lv_variable_1_0=ruleLetVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpRule());
              					}
              					add(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetVariable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBacktrackingContentAssistTestLanguage.g:5141:3: (otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariable ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==17) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalBacktrackingContentAssistTestLanguage.g:5142:4: otherlv_2= ',' ( (lv_variable_3_0= ruleLetVariable ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getLetExpAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalBacktrackingContentAssistTestLanguage.g:5146:4: ( (lv_variable_3_0= ruleLetVariable ) )
            	    // InternalBacktrackingContentAssistTestLanguage.g:5147:5: (lv_variable_3_0= ruleLetVariable )
            	    {
            	    // InternalBacktrackingContentAssistTestLanguage.g:5147:5: (lv_variable_3_0= ruleLetVariable )
            	    // InternalBacktrackingContentAssistTestLanguage.g:5148:6: lv_variable_3_0= ruleLetVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLetExpAccess().getVariableLetVariableParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_variable_3_0=ruleLetVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLetExpRule());
            	      						}
            	      						add(
            	      							current,
            	      							"variable",
            	      							lv_variable_3_0,
            	      							"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.LetVariable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            otherlv_4=(Token)match(input,81,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getLetExpAccess().getInKeyword_3());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:5170:3: ( (lv_in_5_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5171:4: (lv_in_5_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5171:4: (lv_in_5_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:5172:5: lv_in_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetExpAccess().getInExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_in_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetExpRule());
              					}
              					set(
              						current,
              						"in",
              						lv_in_5_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExp"


    // $ANTLR start "entryRuleLetVariable"
    // InternalBacktrackingContentAssistTestLanguage.g:5193:1: entryRuleLetVariable returns [EObject current=null] : iv_ruleLetVariable= ruleLetVariable EOF ;
    public final EObject entryRuleLetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetVariable = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:5193:52: (iv_ruleLetVariable= ruleLetVariable EOF )
            // InternalBacktrackingContentAssistTestLanguage.g:5194:2: iv_ruleLetVariable= ruleLetVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetVariableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLetVariable=ruleLetVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetVariable"


    // $ANTLR start "ruleLetVariable"
    // InternalBacktrackingContentAssistTestLanguage.g:5200:1: ruleLetVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) ) ;
    public final EObject ruleLetVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_initExpression_4_0 = null;


        try {
            // InternalBacktrackingContentAssistTestLanguage.g:5201:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5202:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5202:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5203:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ( (lv_type_2_0= ruleTypeExp ) ) otherlv_3= '=' ( (lv_initExpression_4_0= ruleExpression ) )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5203:3: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5204:4: (lv_name_0_0= ruleIdentifier )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5204:4: (lv_name_0_0= ruleIdentifier )
            // InternalBacktrackingContentAssistTestLanguage.g:5205:5: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableAccess().getNameIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetVariableAccess().getColonKeyword_1());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:5226:3: ( (lv_type_2_0= ruleTypeExp ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5227:4: (lv_type_2_0= ruleTypeExp )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5227:4: (lv_type_2_0= ruleTypeExp )
            // InternalBacktrackingContentAssistTestLanguage.g:5228:5: lv_type_2_0= ruleTypeExp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableAccess().getTypeTypeExpParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_type_2_0=ruleTypeExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.TypeExp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLetVariableAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalBacktrackingContentAssistTestLanguage.g:5249:3: ( (lv_initExpression_4_0= ruleExpression ) )
            // InternalBacktrackingContentAssistTestLanguage.g:5250:4: (lv_initExpression_4_0= ruleExpression )
            {
            // InternalBacktrackingContentAssistTestLanguage.g:5250:4: (lv_initExpression_4_0= ruleExpression )
            // InternalBacktrackingContentAssistTestLanguage.g:5251:5: lv_initExpression_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetVariableAccess().getInitExpressionExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_initExpression_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetVariableRule());
              					}
              					set(
              						current,
              						"initExpression",
              						lv_initExpression_4_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.BacktrackingContentAssistTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetVariable"

    // $ANTLR start synpred8_InternalBacktrackingContentAssistTestLanguage
    public final void synpred8_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_PropertyContextDecl_0 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:333:3: (this_PropertyContextDecl_0= rulePropertyContextDecl )
        // InternalBacktrackingContentAssistTestLanguage.g:333:3: this_PropertyContextDecl_0= rulePropertyContextDecl
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PropertyContextDecl_0=rulePropertyContextDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred9_InternalBacktrackingContentAssistTestLanguage
    public final void synpred9_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_ClassifierContextDecl_1 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:345:3: (this_ClassifierContextDecl_1= ruleClassifierContextDecl )
        // InternalBacktrackingContentAssistTestLanguage.g:345:3: this_ClassifierContextDecl_1= ruleClassifierContextDecl
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ClassifierContextDecl_1=ruleClassifierContextDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred87_InternalBacktrackingContentAssistTestLanguage
    public final void synpred87_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:3339:4: ( () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3339:4: () ( (lv_op_2_0= 'implies' ) ) ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3339:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:3340:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:3349:4: ( (lv_op_2_0= 'implies' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3350:5: (lv_op_2_0= 'implies' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3350:5: (lv_op_2_0= 'implies' )
        // InternalBacktrackingContentAssistTestLanguage.g:3351:6: lv_op_2_0= 'implies'
        {
        lv_op_2_0=(Token)match(input,58,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:3363:4: ( ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3364:5: ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3364:5: ( (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3365:6: (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3365:6: (lv_argument_3_1= rulexor | lv_argument_3_2= ruleLetExp )
        int alt123=2;
        int LA123_0 = input.LA(1);

        if ( ((LA123_0>=RULE_INT && LA123_0<=RULE_STRING)||LA123_0==16||(LA123_0>=33 && LA123_0<=34)||(LA123_0>=36 && LA123_0<=50)||(LA123_0>=54 && LA123_0<=57)||LA123_0==69||(LA123_0>=75 && LA123_0<=76)) ) {
            alt123=1;
        }
        else if ( (LA123_0==80) ) {
            alt123=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 123, 0, input);

            throw nvae;
        }
        switch (alt123) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3366:7: lv_argument_3_1= rulexor
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=rulexor();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3382:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getImpliesAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred87_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred89_InternalBacktrackingContentAssistTestLanguage
    public final void synpred89_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:3427:4: ( () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3427:4: () ( (lv_op_2_0= 'xor' ) ) ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3427:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:3428:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:3437:4: ( (lv_op_2_0= 'xor' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3438:5: (lv_op_2_0= 'xor' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3438:5: (lv_op_2_0= 'xor' )
        // InternalBacktrackingContentAssistTestLanguage.g:3439:6: lv_op_2_0= 'xor'
        {
        lv_op_2_0=(Token)match(input,59,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:3451:4: ( ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3452:5: ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3452:5: ( (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3453:6: (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3453:6: (lv_argument_3_1= ruleor | lv_argument_3_2= ruleLetExp )
        int alt124=2;
        int LA124_0 = input.LA(1);

        if ( ((LA124_0>=RULE_INT && LA124_0<=RULE_STRING)||LA124_0==16||(LA124_0>=33 && LA124_0<=34)||(LA124_0>=36 && LA124_0<=50)||(LA124_0>=54 && LA124_0<=57)||LA124_0==69||(LA124_0>=75 && LA124_0<=76)) ) {
            alt124=1;
        }
        else if ( (LA124_0==80) ) {
            alt124=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 124, 0, input);

            throw nvae;
        }
        switch (alt124) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3454:7: lv_argument_3_1= ruleor
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=ruleor();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3470:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getXorAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred89_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred91_InternalBacktrackingContentAssistTestLanguage
    public final void synpred91_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:3515:4: ( () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3515:4: () ( (lv_op_2_0= 'or' ) ) ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3515:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:3516:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:3525:4: ( (lv_op_2_0= 'or' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3526:5: (lv_op_2_0= 'or' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3526:5: (lv_op_2_0= 'or' )
        // InternalBacktrackingContentAssistTestLanguage.g:3527:6: lv_op_2_0= 'or'
        {
        lv_op_2_0=(Token)match(input,60,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:3539:4: ( ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3540:5: ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3540:5: ( (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3541:6: (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3541:6: (lv_argument_3_1= ruleand | lv_argument_3_2= ruleLetExp )
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( ((LA125_0>=RULE_INT && LA125_0<=RULE_STRING)||LA125_0==16||(LA125_0>=33 && LA125_0<=34)||(LA125_0>=36 && LA125_0<=50)||(LA125_0>=54 && LA125_0<=57)||LA125_0==69||(LA125_0>=75 && LA125_0<=76)) ) {
            alt125=1;
        }
        else if ( (LA125_0==80) ) {
            alt125=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 125, 0, input);

            throw nvae;
        }
        switch (alt125) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3542:7: lv_argument_3_1= ruleand
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=ruleand();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3558:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getOrAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred91_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred93_InternalBacktrackingContentAssistTestLanguage
    public final void synpred93_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_0=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:3603:4: ( () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3603:4: () ( (lv_op_2_0= 'and' ) ) ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3603:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:3604:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:3613:4: ( (lv_op_2_0= 'and' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3614:5: (lv_op_2_0= 'and' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3614:5: (lv_op_2_0= 'and' )
        // InternalBacktrackingContentAssistTestLanguage.g:3615:6: lv_op_2_0= 'and'
        {
        lv_op_2_0=(Token)match(input,61,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:3627:4: ( ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3628:5: ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3628:5: ( (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3629:6: (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3629:6: (lv_argument_3_1= ruleequality | lv_argument_3_2= ruleLetExp )
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( ((LA126_0>=RULE_INT && LA126_0<=RULE_STRING)||LA126_0==16||(LA126_0>=33 && LA126_0<=34)||(LA126_0>=36 && LA126_0<=50)||(LA126_0>=54 && LA126_0<=57)||LA126_0==69||(LA126_0>=75 && LA126_0<=76)) ) {
            alt126=1;
        }
        else if ( (LA126_0==80) ) {
            alt126=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 126, 0, input);

            throw nvae;
        }
        switch (alt126) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3630:7: lv_argument_3_1= ruleequality
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=ruleequality();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3646:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getAndAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred93_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred96_InternalBacktrackingContentAssistTestLanguage
    public final void synpred96_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:3691:4: ( () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3691:4: () ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) ) ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3691:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:3692:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:3701:4: ( ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3702:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3702:5: ( (lv_op_2_1= '=' | lv_op_2_2= '<>' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3703:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3703:6: (lv_op_2_1= '=' | lv_op_2_2= '<>' )
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==19) ) {
            alt127=1;
        }
        else if ( (LA127_0==62) ) {
            alt127=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 127, 0, input);

            throw nvae;
        }
        switch (alt127) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3704:7: lv_op_2_1= '='
                {
                lv_op_2_1=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3715:7: lv_op_2_2= '<>'
                {
                lv_op_2_2=(Token)match(input,62,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:3728:4: ( ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3729:5: ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3729:5: ( (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3730:6: (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3730:6: (lv_argument_3_1= rulerelational | lv_argument_3_2= ruleLetExp )
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( ((LA128_0>=RULE_INT && LA128_0<=RULE_STRING)||LA128_0==16||(LA128_0>=33 && LA128_0<=34)||(LA128_0>=36 && LA128_0<=50)||(LA128_0>=54 && LA128_0<=57)||LA128_0==69||(LA128_0>=75 && LA128_0<=76)) ) {
            alt128=1;
        }
        else if ( (LA128_0==80) ) {
            alt128=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 128, 0, input);

            throw nvae;
        }
        switch (alt128) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3731:7: lv_argument_3_1= rulerelational
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=rulerelational();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3747:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getEqualityAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred96_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred101_InternalBacktrackingContentAssistTestLanguage
    public final void synpred101_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:3792:4: ( () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3792:4: () ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) ) ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3792:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:3793:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:3802:4: ( ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3803:5: ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3803:5: ( (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3804:6: (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3804:6: (lv_op_2_1= '>' | lv_op_2_2= '<' | lv_op_2_3= '>=' | lv_op_2_4= '<=' )
        int alt129=4;
        switch ( input.LA(1) ) {
        case 63:
            {
            alt129=1;
            }
            break;
        case 64:
            {
            alt129=2;
            }
            break;
        case 65:
            {
            alt129=3;
            }
            break;
        case 66:
            {
            alt129=4;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 129, 0, input);

            throw nvae;
        }

        switch (alt129) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3805:7: lv_op_2_1= '>'
                {
                lv_op_2_1=(Token)match(input,63,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3816:7: lv_op_2_2= '<'
                {
                lv_op_2_2=(Token)match(input,64,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;
            case 3 :
                // InternalBacktrackingContentAssistTestLanguage.g:3827:7: lv_op_2_3= '>='
                {
                lv_op_2_3=(Token)match(input,65,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;
            case 4 :
                // InternalBacktrackingContentAssistTestLanguage.g:3838:7: lv_op_2_4= '<='
                {
                lv_op_2_4=(Token)match(input,66,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:3851:4: ( ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3852:5: ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3852:5: ( (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3853:6: (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3853:6: (lv_argument_3_1= ruleadditive | lv_argument_3_2= ruleLetExp )
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( ((LA130_0>=RULE_INT && LA130_0<=RULE_STRING)||LA130_0==16||(LA130_0>=33 && LA130_0<=34)||(LA130_0>=36 && LA130_0<=50)||(LA130_0>=54 && LA130_0<=57)||LA130_0==69||(LA130_0>=75 && LA130_0<=76)) ) {
            alt130=1;
        }
        else if ( (LA130_0==80) ) {
            alt130=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 130, 0, input);

            throw nvae;
        }
        switch (alt130) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3854:7: lv_argument_3_1= ruleadditive
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=ruleadditive();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3870:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getRelationalAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred101_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred104_InternalBacktrackingContentAssistTestLanguage
    public final void synpred104_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:3915:4: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3915:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3915:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:3916:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:3925:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3926:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3926:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3927:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3927:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
        int alt131=2;
        int LA131_0 = input.LA(1);

        if ( (LA131_0==35) ) {
            alt131=1;
        }
        else if ( (LA131_0==36) ) {
            alt131=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 131, 0, input);

            throw nvae;
        }
        switch (alt131) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3928:7: lv_op_2_1= '+'
                {
                lv_op_2_1=(Token)match(input,35,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3939:7: lv_op_2_2= '-'
                {
                lv_op_2_2=(Token)match(input,36,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:3952:4: ( ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3953:5: ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3953:5: ( (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:3954:6: (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:3954:6: (lv_argument_3_1= rulemultiplicative | lv_argument_3_2= ruleLetExp )
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( ((LA132_0>=RULE_INT && LA132_0<=RULE_STRING)||LA132_0==16||(LA132_0>=33 && LA132_0<=34)||(LA132_0>=36 && LA132_0<=50)||(LA132_0>=54 && LA132_0<=57)||LA132_0==69||(LA132_0>=75 && LA132_0<=76)) ) {
            alt132=1;
        }
        else if ( (LA132_0==80) ) {
            alt132=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 132, 0, input);

            throw nvae;
        }
        switch (alt132) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:3955:7: lv_argument_3_1= rulemultiplicative
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=rulemultiplicative();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:3971:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getAdditiveAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred104_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred107_InternalBacktrackingContentAssistTestLanguage
    public final void synpred107_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject lv_argument_3_1 = null;

        EObject lv_argument_3_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4016:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:4016:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:4016:4: ()
        // InternalBacktrackingContentAssistTestLanguage.g:4017:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalBacktrackingContentAssistTestLanguage.g:4026:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:4027:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:4027:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
        // InternalBacktrackingContentAssistTestLanguage.g:4028:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:4028:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==67) ) {
            alt133=1;
        }
        else if ( (LA133_0==68) ) {
            alt133=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 133, 0, input);

            throw nvae;
        }
        switch (alt133) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:4029:7: lv_op_2_1= '*'
                {
                lv_op_2_1=(Token)match(input,67,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:4040:7: lv_op_2_2= '/'
                {
                lv_op_2_2=(Token)match(input,68,FollowSets000.FOLLOW_6); if (state.failed) return ;

                }
                break;

        }


        }


        }

        // InternalBacktrackingContentAssistTestLanguage.g:4053:4: ( ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) ) )
        // InternalBacktrackingContentAssistTestLanguage.g:4054:5: ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:4054:5: ( (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp ) )
        // InternalBacktrackingContentAssistTestLanguage.g:4055:6: (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp )
        {
        // InternalBacktrackingContentAssistTestLanguage.g:4055:6: (lv_argument_3_1= ruleunary | lv_argument_3_2= ruleLetExp )
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( ((LA134_0>=RULE_INT && LA134_0<=RULE_STRING)||LA134_0==16||(LA134_0>=33 && LA134_0<=34)||(LA134_0>=36 && LA134_0<=50)||(LA134_0>=54 && LA134_0<=57)||LA134_0==69||(LA134_0>=75 && LA134_0<=76)) ) {
            alt134=1;
        }
        else if ( (LA134_0==80) ) {
            alt134=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 134, 0, input);

            throw nvae;
        }
        switch (alt134) {
            case 1 :
                // InternalBacktrackingContentAssistTestLanguage.g:4056:7: lv_argument_3_1= ruleunary
                {
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_1=ruleunary();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalBacktrackingContentAssistTestLanguage.g:4072:7: lv_argument_3_2= ruleLetExp
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getMultiplicativeAccess().getArgumentLetExpParserRuleCall_1_2_0_1());
                  						
                }
                pushFollow(FollowSets000.FOLLOW_2);
                lv_argument_3_2=ruleLetExp();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred107_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred110_InternalBacktrackingContentAssistTestLanguage
    public final void synpred110_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_RoundBracketExp_0 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4189:3: (this_RoundBracketExp_0= ruleRoundBracketExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4189:3: this_RoundBracketExp_0= ruleRoundBracketExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_RoundBracketExp_0=ruleRoundBracketExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred111_InternalBacktrackingContentAssistTestLanguage
    public final void synpred111_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_SquareBracketExp_1 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4201:3: (this_SquareBracketExp_1= ruleSquareBracketExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4201:3: this_SquareBracketExp_1= ruleSquareBracketExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_SquareBracketExp_1=ruleSquareBracketExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred114_InternalBacktrackingContentAssistTestLanguage
    public final void synpred114_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_TupleLiteralExp_4 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4237:3: (this_TupleLiteralExp_4= ruleTupleLiteralExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4237:3: this_TupleLiteralExp_4= ruleTupleLiteralExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TupleLiteralExp_4=ruleTupleLiteralExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred115_InternalBacktrackingContentAssistTestLanguage
    public final void synpred115_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_CollectionLiteralExp_5 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4249:3: (this_CollectionLiteralExp_5= ruleCollectionLiteralExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4249:3: this_CollectionLiteralExp_5= ruleCollectionLiteralExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CollectionLiteralExp_5=ruleCollectionLiteralExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred116_InternalBacktrackingContentAssistTestLanguage
    public final void synpred116_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_PreExp_6 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4261:3: (this_PreExp_6= rulePreExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4261:3: this_PreExp_6= rulePreExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PreExp_6=rulePreExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred116_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred117_InternalBacktrackingContentAssistTestLanguage
    public final void synpred117_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_TypeExp_7 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4273:3: (this_TypeExp_7= ruleTypeExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4273:3: this_TypeExp_7= ruleTypeExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeExp_7=ruleTypeExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred119_InternalBacktrackingContentAssistTestLanguage
    public final void synpred119_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_RoundBracketExp_0 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4350:3: (this_RoundBracketExp_0= ruleRoundBracketExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4350:3: this_RoundBracketExp_0= ruleRoundBracketExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_RoundBracketExp_0=ruleRoundBracketExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred120_InternalBacktrackingContentAssistTestLanguage
    public final void synpred120_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_SquareBracketExp_1 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4362:3: (this_SquareBracketExp_1= ruleSquareBracketExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4362:3: this_SquareBracketExp_1= ruleSquareBracketExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_SquareBracketExp_1=ruleSquareBracketExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_InternalBacktrackingContentAssistTestLanguage

    // $ANTLR start synpred121_InternalBacktrackingContentAssistTestLanguage
    public final void synpred121_InternalBacktrackingContentAssistTestLanguage_fragment() throws RecognitionException {   
        EObject this_PreExp_2 = null;


        // InternalBacktrackingContentAssistTestLanguage.g:4374:3: (this_PreExp_2= rulePreExp )
        // InternalBacktrackingContentAssistTestLanguage.g:4374:3: this_PreExp_2= rulePreExp
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PreExp_2=rulePreExp();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred121_InternalBacktrackingContentAssistTestLanguage

    // Delegated rules

    public final boolean synpred89_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred115_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred116_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred116_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred107_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred107_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred121_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred121_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_InternalBacktrackingContentAssistTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_InternalBacktrackingContentAssistTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA86 dfa86 = new DFA86(this);
    protected DFA91 dfa91 = new DFA91(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\1\4\3\0\7\uffff\6\0\17\uffff";
    static final String dfa_3s = "\1\114\3\0\7\uffff\6\0\17\uffff";
    static final String dfa_4s = "\4\uffff\1\3\1\4\13\uffff\1\10\7\uffff\1\11\1\12\1\1\1\2\1\7\1\5\1\6";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\7\uffff\1\3\1\4\1\5\1\6\1\7\1\10\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\1\1\5\11\uffff\1\32\20\uffff\1\2\1\3\2\uffff\10\21\1\14\1\15\1\16\1\17\1\20\1\13\3\uffff\4\5\21\uffff\1\4\1\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4188:2: (this_RoundBracketExp_0= ruleRoundBracketExp | this_SquareBracketExp_1= ruleSquareBracketExp | this_SelfExp_2= ruleSelfExp | this_PrimitiveLiteralExp_3= rulePrimitiveLiteralExp | this_TupleLiteralExp_4= ruleTupleLiteralExp | this_CollectionLiteralExp_5= ruleCollectionLiteralExp | this_PreExp_6= rulePreExp | this_TypeExp_7= ruleTypeExp | this_IfExp_8= ruleIfExp | (otherlv_9= '(' () ( (lv_source_11_0= ruleExpression ) ) otherlv_12= ')' ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA86_1 = input.LA(1);

                         
                        int index86_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_InternalBacktrackingContentAssistTestLanguage()) ) {s = 27;}

                        else if ( (synpred111_InternalBacktrackingContentAssistTestLanguage()) ) {s = 28;}

                        else if ( (synpred116_InternalBacktrackingContentAssistTestLanguage()) ) {s = 29;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA86_2 = input.LA(1);

                         
                        int index86_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_InternalBacktrackingContentAssistTestLanguage()) ) {s = 27;}

                        else if ( (synpred111_InternalBacktrackingContentAssistTestLanguage()) ) {s = 28;}

                        else if ( (synpred116_InternalBacktrackingContentAssistTestLanguage()) ) {s = 29;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA86_3 = input.LA(1);

                         
                        int index86_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_InternalBacktrackingContentAssistTestLanguage()) ) {s = 27;}

                        else if ( (synpred111_InternalBacktrackingContentAssistTestLanguage()) ) {s = 28;}

                        else if ( (synpred116_InternalBacktrackingContentAssistTestLanguage()) ) {s = 29;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA86_11 = input.LA(1);

                         
                        int index86_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalBacktrackingContentAssistTestLanguage()) ) {s = 30;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA86_12 = input.LA(1);

                         
                        int index86_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalBacktrackingContentAssistTestLanguage()) ) {s = 31;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA86_13 = input.LA(1);

                         
                        int index86_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalBacktrackingContentAssistTestLanguage()) ) {s = 31;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_13);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA86_14 = input.LA(1);

                         
                        int index86_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalBacktrackingContentAssistTestLanguage()) ) {s = 31;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA86_15 = input.LA(1);

                         
                        int index86_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalBacktrackingContentAssistTestLanguage()) ) {s = 31;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA86_16 = input.LA(1);

                         
                        int index86_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalBacktrackingContentAssistTestLanguage()) ) {s = 31;}

                        else if ( (synpred117_InternalBacktrackingContentAssistTestLanguage()) ) {s = 17;}

                         
                        input.seek(index86_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 86, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\1\4\3\14\2\uffff\1\4\3\14";
    static final String dfa_9s = "\1\120\3\111\2\uffff\1\120\3\111";
    static final String dfa_10s = "\4\uffff\1\2\1\1\4\uffff";
    static final String dfa_11s = "\12\uffff}>";
    static final String[] dfa_12s = {
            "\1\4\1\1\1\4\11\uffff\1\4\1\uffff\1\4\16\uffff\1\2\1\3\1\uffff\17\4\3\uffff\4\4\13\uffff\1\4\5\uffff\2\4\3\uffff\1\4",
            "\1\5\3\uffff\1\4\1\6\2\4\7\uffff\5\4\3\uffff\2\4\25\uffff\13\4\1\uffff\1\4\2\5\1\4",
            "\1\5\3\uffff\1\4\1\6\2\4\7\uffff\5\4\3\uffff\2\4\25\uffff\13\4\1\uffff\1\4\2\5\1\4",
            "\1\5\3\uffff\1\4\1\6\2\4\7\uffff\5\4\3\uffff\2\4\25\uffff\13\4\1\uffff\1\4\2\5\1\4",
            "",
            "",
            "\1\4\1\7\1\4\11\uffff\1\4\20\uffff\1\10\1\11\1\uffff\17\4\3\uffff\4\4\13\uffff\1\4\5\uffff\2\4\3\uffff\1\4",
            "\1\5\3\uffff\4\4\7\uffff\5\4\3\uffff\2\4\25\uffff\13\4\1\uffff\1\4\1\uffff\1\5\1\4",
            "\1\5\3\uffff\4\4\7\uffff\5\4\3\uffff\2\4\25\uffff\13\4\1\uffff\1\4\1\uffff\1\5\1\4",
            "\1\5\3\uffff\4\4\7\uffff\5\4\3\uffff\2\4\25\uffff\13\4\1\uffff\1\4\1\uffff\1\5\1\4"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "4591:3: ( ( (lv_variable1_4_0= ruleiteratorVariable ) ) ( (otherlv_5= ',' ( (lv_variable2_6_0= ruleiteratorVariable ) ) ) | (otherlv_7= ';' ( (lv_variable2_8_0= ruleiteratorAccumulator ) ) ) )? otherlv_9= '|' )?";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000802002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000600001020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x03C7FFF600010070L,0x0000000000011820L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000040C002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000011000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0007FFE600040020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0007FFE600000020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0007FFE600080020L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0007FFE606000822L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000802L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001802000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000F0000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x03C7FFF700050070L,0x0000000000011820L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x03C7FFF700010070L,0x0000000000011820L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000610000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000010L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000600040020L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x03D7FFF600010070L,0x0000000000011820L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000020000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000081000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x4000000000080002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x03C7FFF600010070L,0x0000000000001820L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000040L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x03C7FFF600050070L,0x0000000000011820L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000180L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000400L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000020000L,0x0000000000020000L});
    }


}