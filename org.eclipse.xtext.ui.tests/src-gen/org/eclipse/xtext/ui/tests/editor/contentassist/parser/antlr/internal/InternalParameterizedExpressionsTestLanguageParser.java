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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.ParameterizedExpressionsTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalParameterizedExpressionsTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'function'", "'*'", "'('", "')'", "'{'", "'}'", "':'", "'['", "']'", "'.'", "'>>'", "'<<'", "'<'", "'>'", "'<='", "'>='", "'instanceof'", "'in'", "'='", "'yield'", "','"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalParameterizedExpressionsTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParameterizedExpressionsTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParameterizedExpressionsTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalParameterizedExpressionsTestLanguage.g"; }



     	private ParameterizedExpressionsTestLanguageGrammarAccess grammarAccess;

        public InternalParameterizedExpressionsTestLanguageParser(TokenStream input, ParameterizedExpressionsTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RootStatement";
       	}

       	@Override
       	protected ParameterizedExpressionsTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRootStatement"
    // InternalParameterizedExpressionsTestLanguage.g:64:1: entryRuleRootStatement returns [EObject current=null] : iv_ruleRootStatement= ruleRootStatement EOF ;
    public final EObject entryRuleRootStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootStatement = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:64:54: (iv_ruleRootStatement= ruleRootStatement EOF )
            // InternalParameterizedExpressionsTestLanguage.g:65:2: iv_ruleRootStatement= ruleRootStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRootStatement=ruleRootStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootStatement; 
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
    // $ANTLR end "entryRuleRootStatement"


    // $ANTLR start "ruleRootStatement"
    // InternalParameterizedExpressionsTestLanguage.g:71:1: ruleRootStatement returns [EObject current=null] : ( ( ( ( () '{' ) )=>this_Block_0= ruleBlock ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= ruleFunctionDeclaration ) | ( ( ( ( ( ruleIdentifier ) ) ':' ) )=>this_LabelledStatement_2= ruleLabelledStatement ) | this_ExpressionStatement_3= ruleExpressionStatement ) ;
    public final EObject ruleRootStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_FunctionDeclaration_1 = null;

        EObject this_LabelledStatement_2 = null;

        EObject this_ExpressionStatement_3 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:72:1: ( ( ( ( ( () '{' ) )=>this_Block_0= ruleBlock ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= ruleFunctionDeclaration ) | ( ( ( ( ( ruleIdentifier ) ) ':' ) )=>this_LabelledStatement_2= ruleLabelledStatement ) | this_ExpressionStatement_3= ruleExpressionStatement ) )
            // InternalParameterizedExpressionsTestLanguage.g:73:2: ( ( ( ( () '{' ) )=>this_Block_0= ruleBlock ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= ruleFunctionDeclaration ) | ( ( ( ( ( ruleIdentifier ) ) ':' ) )=>this_LabelledStatement_2= ruleLabelledStatement ) | this_ExpressionStatement_3= ruleExpressionStatement )
            {
            // InternalParameterizedExpressionsTestLanguage.g:73:2: ( ( ( ( () '{' ) )=>this_Block_0= ruleBlock ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= ruleFunctionDeclaration ) | ( ( ( ( ( ruleIdentifier ) ) ':' ) )=>this_LabelledStatement_2= ruleLabelledStatement ) | this_ExpressionStatement_3= ruleExpressionStatement )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) && (synpred1_InternalParameterizedExpressionsTestLanguage())) {
                alt1=1;
            }
            else if ( (LA1_0==12) && (synpred2_InternalParameterizedExpressionsTestLanguage())) {
                alt1=2;
            }
            else if ( (LA1_0==RULE_ID) ) {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==11||LA1_3==19||(LA1_3>=21 && LA1_3<=30)||LA1_3==32) ) {
                    alt1=4;
                }
                else if ( (LA1_3==18) && (synpred3_InternalParameterizedExpressionsTestLanguage())) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==31) ) {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==18) && (synpred3_InternalParameterizedExpressionsTestLanguage())) {
                    alt1=3;
                }
                else if ( (LA1_4==11||LA1_4==19||(LA1_4>=21 && LA1_4<=30)||LA1_4==32) ) {
                    alt1=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:74:3: ( ( ( () '{' ) )=>this_Block_0= ruleBlock )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:74:3: ( ( ( () '{' ) )=>this_Block_0= ruleBlock )
                    // InternalParameterizedExpressionsTestLanguage.g:75:4: ( ( () '{' ) )=>this_Block_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRootStatementAccess().getBlockParserRuleCall_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Block_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Block_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:91:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= ruleFunctionDeclaration )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:91:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= ruleFunctionDeclaration )
                    // InternalParameterizedExpressionsTestLanguage.g:92:4: ( ( () 'function' ) )=>this_FunctionDeclaration_1= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRootStatementAccess().getFunctionDeclarationParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionDeclaration_1=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FunctionDeclaration_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalParameterizedExpressionsTestLanguage.g:108:3: ( ( ( ( ( ruleIdentifier ) ) ':' ) )=>this_LabelledStatement_2= ruleLabelledStatement )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:108:3: ( ( ( ( ( ruleIdentifier ) ) ':' ) )=>this_LabelledStatement_2= ruleLabelledStatement )
                    // InternalParameterizedExpressionsTestLanguage.g:109:4: ( ( ( ( ruleIdentifier ) ) ':' ) )=>this_LabelledStatement_2= ruleLabelledStatement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRootStatementAccess().getLabelledStatementParserRuleCall_2());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LabelledStatement_2=ruleLabelledStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_LabelledStatement_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalParameterizedExpressionsTestLanguage.g:128:3: this_ExpressionStatement_3= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRootStatementAccess().getExpressionStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExpressionStatement_3=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionStatement_3;
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
    // $ANTLR end "ruleRootStatement"


    // $ANTLR start "norm1_RootStatement"
    // InternalParameterizedExpressionsTestLanguage.g:141:1: norm1_RootStatement returns [EObject current=null] : ( ( ( ( () '{' ) )=>this_Block_0= norm1_Block ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= norm1_FunctionDeclaration ) | ( ( ( ( ( norm1_Identifier ) ) ':' ) )=>this_LabelledStatement_2= norm1_LabelledStatement ) | this_ExpressionStatement_3= norm1_ExpressionStatement ) ;
    public final EObject norm1_RootStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_FunctionDeclaration_1 = null;

        EObject this_LabelledStatement_2 = null;

        EObject this_ExpressionStatement_3 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:142:1: ( ( ( ( ( () '{' ) )=>this_Block_0= norm1_Block ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= norm1_FunctionDeclaration ) | ( ( ( ( ( norm1_Identifier ) ) ':' ) )=>this_LabelledStatement_2= norm1_LabelledStatement ) | this_ExpressionStatement_3= norm1_ExpressionStatement ) )
            // InternalParameterizedExpressionsTestLanguage.g:143:2: ( ( ( ( () '{' ) )=>this_Block_0= norm1_Block ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= norm1_FunctionDeclaration ) | ( ( ( ( ( norm1_Identifier ) ) ':' ) )=>this_LabelledStatement_2= norm1_LabelledStatement ) | this_ExpressionStatement_3= norm1_ExpressionStatement )
            {
            // InternalParameterizedExpressionsTestLanguage.g:143:2: ( ( ( ( () '{' ) )=>this_Block_0= norm1_Block ) | ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= norm1_FunctionDeclaration ) | ( ( ( ( ( norm1_Identifier ) ) ':' ) )=>this_LabelledStatement_2= norm1_LabelledStatement ) | this_ExpressionStatement_3= norm1_ExpressionStatement )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) && (synpred4_InternalParameterizedExpressionsTestLanguage())) {
                alt2=1;
            }
            else if ( (LA2_0==12) && (synpred5_InternalParameterizedExpressionsTestLanguage())) {
                alt2=2;
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==11||LA2_3==19||(LA2_3>=21 && LA2_3<=30)||LA2_3==32) ) {
                    alt2=4;
                }
                else if ( (LA2_3==18) && (synpred6_InternalParameterizedExpressionsTestLanguage())) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==31) ) {
                alt2=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:144:3: ( ( ( () '{' ) )=>this_Block_0= norm1_Block )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:144:3: ( ( ( () '{' ) )=>this_Block_0= norm1_Block )
                    // InternalParameterizedExpressionsTestLanguage.g:145:4: ( ( () '{' ) )=>this_Block_0= norm1_Block
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRootStatementAccess().getBlockParserRuleCall_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Block_0=norm1_Block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Block_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:161:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= norm1_FunctionDeclaration )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:161:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_1= norm1_FunctionDeclaration )
                    // InternalParameterizedExpressionsTestLanguage.g:162:4: ( ( () 'function' ) )=>this_FunctionDeclaration_1= norm1_FunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRootStatementAccess().getFunctionDeclarationParserRuleCall_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionDeclaration_1=norm1_FunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FunctionDeclaration_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalParameterizedExpressionsTestLanguage.g:178:3: ( ( ( ( ( norm1_Identifier ) ) ':' ) )=>this_LabelledStatement_2= norm1_LabelledStatement )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:178:3: ( ( ( ( ( norm1_Identifier ) ) ':' ) )=>this_LabelledStatement_2= norm1_LabelledStatement )
                    // InternalParameterizedExpressionsTestLanguage.g:179:4: ( ( ( ( norm1_Identifier ) ) ':' ) )=>this_LabelledStatement_2= norm1_LabelledStatement
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRootStatementAccess().getLabelledStatementParserRuleCall_2());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LabelledStatement_2=norm1_LabelledStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_LabelledStatement_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalParameterizedExpressionsTestLanguage.g:198:3: this_ExpressionStatement_3= norm1_ExpressionStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRootStatementAccess().getExpressionStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExpressionStatement_3=norm1_ExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionStatement_3;
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
    // $ANTLR end "norm1_RootStatement"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // InternalParameterizedExpressionsTestLanguage.g:210:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:210:60: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // InternalParameterizedExpressionsTestLanguage.g:211:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
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
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // InternalParameterizedExpressionsTestLanguage.g:217:1: ruleFunctionDeclaration returns [EObject current=null] : ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_FunctionImpl_1 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:218:1: ( ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:219:2: ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:219:2: ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? )
            // InternalParameterizedExpressionsTestLanguage.g:220:3: ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )?
            {
            // InternalParameterizedExpressionsTestLanguage.g:220:3: ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:221:4: ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:227:4: ( () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] ) )
            // InternalParameterizedExpressionsTestLanguage.g:228:5: () ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] )
            {
            // InternalParameterizedExpressionsTestLanguage.g:228:5: ()
            // InternalParameterizedExpressionsTestLanguage.g:229:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0_0_0(),
              							current);
              					
            }

            }

            // InternalParameterizedExpressionsTestLanguage.g:235:5: ( ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current] )
            // InternalParameterizedExpressionsTestLanguage.g:236:6: ( 'function' )=>this_FunctionImpl_1= ruleFunctionImpl[$current]
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              						}
              						newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getFunctionImplParserRuleCall_0_0_1());
              					
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_FunctionImpl_1=ruleFunctionImpl(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						current = this_FunctionImpl_1;
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            // InternalParameterizedExpressionsTestLanguage.g:251:3: ( ( ';' )=>otherlv_2= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) && (synpred9_InternalParameterizedExpressionsTestLanguage())) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:252:4: ( ';' )=>otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_1());
                      			
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
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "norm1_FunctionDeclaration"
    // InternalParameterizedExpressionsTestLanguage.g:263:1: norm1_FunctionDeclaration returns [EObject current=null] : ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? ) ;
    public final EObject norm1_FunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_FunctionImpl_1 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:264:1: ( ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:265:2: ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:265:2: ( ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )? )
            // InternalParameterizedExpressionsTestLanguage.g:266:3: ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) ) ) ( ( ';' )=>otherlv_2= ';' )?
            {
            // InternalParameterizedExpressionsTestLanguage.g:266:3: ( ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:267:4: ( ( () 'function' ) )=> ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:273:4: ( () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] ) )
            // InternalParameterizedExpressionsTestLanguage.g:274:5: () ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] )
            {
            // InternalParameterizedExpressionsTestLanguage.g:274:5: ()
            // InternalParameterizedExpressionsTestLanguage.g:275:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getFunctionDeclarationAccess().getFunctionDeclarationAction_0_0_0(),
              							current);
              					
            }

            }

            // InternalParameterizedExpressionsTestLanguage.g:281:5: ( ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current] )
            // InternalParameterizedExpressionsTestLanguage.g:282:6: ( 'function' )=>this_FunctionImpl_1= norm3_FunctionImpl[$current]
            {
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              						}
              						newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getFunctionImplParserRuleCall_0_0_1());
              					
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_FunctionImpl_1=norm3_FunctionImpl(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						current = this_FunctionImpl_1;
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }


            }

            // InternalParameterizedExpressionsTestLanguage.g:297:3: ( ( ';' )=>otherlv_2= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) && (synpred12_InternalParameterizedExpressionsTestLanguage())) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:298:4: ( ';' )=>otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getSemicolonKeyword_1());
                      			
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
    // $ANTLR end "norm1_FunctionDeclaration"


    // $ANTLR start "ruleFunctionImpl"
    // InternalParameterizedExpressionsTestLanguage.g:309:1: ruleFunctionImpl[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) ) ;
    public final EObject ruleFunctionImpl(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_generator_1_0=null;
        EObject this_FunctionHeader_2 = null;

        EObject this_FunctionBody_3 = null;

        EObject this_FunctionHeader_4 = null;

        EObject this_FunctionBody_5 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:310:1: ( (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:311:2: (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:311:2: (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:312:3: otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionImplAccess().getFunctionKeyword_0());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:316:3: ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID||LA5_0==14||LA5_0==31) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:317:4: ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:317:4: ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] )
                    // InternalParameterizedExpressionsTestLanguage.g:318:5: ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm2_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current]
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:318:5: ( (lv_generator_1_0= '*' ) )
                    // InternalParameterizedExpressionsTestLanguage.g:319:6: (lv_generator_1_0= '*' )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:319:6: (lv_generator_1_0= '*' )
                    // InternalParameterizedExpressionsTestLanguage.g:320:7: lv_generator_1_0= '*'
                    {
                    lv_generator_1_0=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_generator_1_0, grammarAccess.getFunctionImplAccess().getGeneratorAsteriskKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFunctionImplRule());
                      							}
                      							setWithLastConsumed(current, "generator", lv_generator_1_0 != null, "*");
                      						
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionHeaderParserRuleCall_1_0_1());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    this_FunctionHeader_2=norm2_FunctionHeader(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionHeader_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionBodyParserRuleCall_1_0_2());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionBody_3=norm1_FunctionBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionBody_3;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:356:4: (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:356:4: (this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] )
                    // InternalParameterizedExpressionsTestLanguage.g:357:5: this_FunctionHeader_4= ruleFunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionHeaderParserRuleCall_1_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    this_FunctionHeader_4=ruleFunctionHeader(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionHeader_4;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionBodyParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionBody_5=ruleFunctionBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionBody_5;
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleFunctionImpl"


    // $ANTLR start "norm3_FunctionImpl"
    // InternalParameterizedExpressionsTestLanguage.g:386:1: norm3_FunctionImpl[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) ) ;
    public final EObject norm3_FunctionImpl(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token lv_generator_1_0=null;
        EObject this_FunctionHeader_2 = null;

        EObject this_FunctionBody_3 = null;

        EObject this_FunctionHeader_4 = null;

        EObject this_FunctionBody_5 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:387:1: ( (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:388:2: (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:388:2: (otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:389:3: otherlv_0= 'function' ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionImplAccess().getFunctionKeyword_0());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:393:3: ( ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] ) | (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:394:4: ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:394:4: ( ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current] )
                    // InternalParameterizedExpressionsTestLanguage.g:395:5: ( (lv_generator_1_0= '*' ) ) this_FunctionHeader_2= norm3_FunctionHeader[$current] this_FunctionBody_3= norm1_FunctionBody[$current]
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:395:5: ( (lv_generator_1_0= '*' ) )
                    // InternalParameterizedExpressionsTestLanguage.g:396:6: (lv_generator_1_0= '*' )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:396:6: (lv_generator_1_0= '*' )
                    // InternalParameterizedExpressionsTestLanguage.g:397:7: lv_generator_1_0= '*'
                    {
                    lv_generator_1_0=(Token)match(input,13,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_generator_1_0, grammarAccess.getFunctionImplAccess().getGeneratorAsteriskKeyword_1_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getFunctionImplRule());
                      							}
                      							setWithLastConsumed(current, "generator", lv_generator_1_0 != null, "*");
                      						
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionHeaderParserRuleCall_1_0_1());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    this_FunctionHeader_2=norm3_FunctionHeader(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionHeader_2;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionBodyParserRuleCall_1_0_2());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionBody_3=norm1_FunctionBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionBody_3;
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:433:4: (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:433:4: (this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current] )
                    // InternalParameterizedExpressionsTestLanguage.g:434:5: this_FunctionHeader_4= norm1_FunctionHeader[$current] this_FunctionBody_5= ruleFunctionBody[$current]
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionHeaderParserRuleCall_1_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    this_FunctionHeader_4=norm1_FunctionHeader(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionHeader_4;
                      					afterParserOrEnumRuleCall();
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFunctionImplRule());
                      					}
                      					newCompositeNode(grammarAccess.getFunctionImplAccess().getFunctionBodyParserRuleCall_1_1_1());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionBody_5=ruleFunctionBody(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current = this_FunctionBody_5;
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "norm3_FunctionImpl"


    // $ANTLR start "ruleFunctionHeader"
    // InternalParameterizedExpressionsTestLanguage.g:463:1: ruleFunctionHeader[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleFunctionHeader(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:464:1: ( ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' ) )
            // InternalParameterizedExpressionsTestLanguage.g:465:2: ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:465:2: ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' )
            // InternalParameterizedExpressionsTestLanguage.g:466:3: ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')'
            {
            // InternalParameterizedExpressionsTestLanguage.g:466:3: ( (lv_name_0_0= ruleIdentifier ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:467:4: (lv_name_0_0= ruleIdentifier )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:467:4: (lv_name_0_0= ruleIdentifier )
                    // InternalParameterizedExpressionsTestLanguage.g:468:5: lv_name_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionHeaderAccess().getNameIdentifierParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_name_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_0_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionHeaderAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionHeaderAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleFunctionHeader"


    // $ANTLR start "norm1_FunctionHeader"
    // InternalParameterizedExpressionsTestLanguage.g:498:1: norm1_FunctionHeader[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject norm1_FunctionHeader(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:499:1: ( ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' ) )
            // InternalParameterizedExpressionsTestLanguage.g:500:2: ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:500:2: ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' )
            // InternalParameterizedExpressionsTestLanguage.g:501:3: ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')'
            {
            // InternalParameterizedExpressionsTestLanguage.g:501:3: ( (lv_name_0_0= norm1_Identifier ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:502:4: (lv_name_0_0= norm1_Identifier )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:502:4: (lv_name_0_0= norm1_Identifier )
                    // InternalParameterizedExpressionsTestLanguage.g:503:5: lv_name_0_0= norm1_Identifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionHeaderAccess().getNameIdentifierParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_name_0_0=norm1_Identifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_0_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionHeaderAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionHeaderAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "norm1_FunctionHeader"


    // $ANTLR start "norm2_FunctionHeader"
    // InternalParameterizedExpressionsTestLanguage.g:533:1: norm2_FunctionHeader[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject norm2_FunctionHeader(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:534:1: ( ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' ) )
            // InternalParameterizedExpressionsTestLanguage.g:535:2: ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:535:2: ( ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')' )
            // InternalParameterizedExpressionsTestLanguage.g:536:3: ( (lv_name_0_0= ruleIdentifier ) )? otherlv_1= '(' otherlv_2= ')'
            {
            // InternalParameterizedExpressionsTestLanguage.g:536:3: ( (lv_name_0_0= ruleIdentifier ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:537:4: (lv_name_0_0= ruleIdentifier )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:537:4: (lv_name_0_0= ruleIdentifier )
                    // InternalParameterizedExpressionsTestLanguage.g:538:5: lv_name_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionHeaderAccess().getNameIdentifierParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_name_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_0_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionHeaderAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionHeaderAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "norm2_FunctionHeader"


    // $ANTLR start "norm3_FunctionHeader"
    // InternalParameterizedExpressionsTestLanguage.g:568:1: norm3_FunctionHeader[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject norm3_FunctionHeader(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:569:1: ( ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' ) )
            // InternalParameterizedExpressionsTestLanguage.g:570:2: ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:570:2: ( ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')' )
            // InternalParameterizedExpressionsTestLanguage.g:571:3: ( (lv_name_0_0= norm1_Identifier ) )? otherlv_1= '(' otherlv_2= ')'
            {
            // InternalParameterizedExpressionsTestLanguage.g:571:3: ( (lv_name_0_0= norm1_Identifier ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:572:4: (lv_name_0_0= norm1_Identifier )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:572:4: (lv_name_0_0= norm1_Identifier )
                    // InternalParameterizedExpressionsTestLanguage.g:573:5: lv_name_0_0= norm1_Identifier
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionHeaderAccess().getNameIdentifierParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_name_0_0=norm1_Identifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
                      					}
                      					set(
                      						current,
                      						"name",
                      						lv_name_0_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionHeaderAccess().getLeftParenthesisKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionHeaderAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "norm3_FunctionHeader"


    // $ANTLR start "ruleFunctionBody"
    // InternalParameterizedExpressionsTestLanguage.g:603:1: ruleFunctionBody[EObject in_current] returns [EObject current=in_current] : ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) )? ;
    public final EObject ruleFunctionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_body_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:604:1: ( ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) )? )
            // InternalParameterizedExpressionsTestLanguage.g:605:2: ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) )?
            {
            // InternalParameterizedExpressionsTestLanguage.g:605:2: ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred13_InternalParameterizedExpressionsTestLanguage()) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:606:3: ( ( () '{' ) )=> (lv_body_0_0= ruleBlock )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:612:3: (lv_body_0_0= ruleBlock )
                    // InternalParameterizedExpressionsTestLanguage.g:613:4: lv_body_0_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionBodyAccess().getBodyBlockParserRuleCall_1_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_body_0_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                      				}
                      				set(
                      					current,
                      					"body",
                      					lv_body_0_0,
                      					"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Block");
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "norm1_FunctionBody"
    // InternalParameterizedExpressionsTestLanguage.g:634:1: norm1_FunctionBody[EObject in_current] returns [EObject current=in_current] : ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) )? ;
    public final EObject norm1_FunctionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_body_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:635:1: ( ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) )? )
            // InternalParameterizedExpressionsTestLanguage.g:636:2: ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) )?
            {
            // InternalParameterizedExpressionsTestLanguage.g:636:2: ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred14_InternalParameterizedExpressionsTestLanguage()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:637:3: ( ( () '{' ) )=> (lv_body_0_0= norm1_Block )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:643:3: (lv_body_0_0= norm1_Block )
                    // InternalParameterizedExpressionsTestLanguage.g:644:4: lv_body_0_0= norm1_Block
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getFunctionBodyAccess().getBodyBlockParserRuleCall_1_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_body_0_0=norm1_Block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
                      				}
                      				set(
                      					current,
                      					"body",
                      					lv_body_0_0,
                      					"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Block");
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "norm1_FunctionBody"


    // $ANTLR start "norm2_FunctionBody"
    // InternalParameterizedExpressionsTestLanguage.g:665:1: norm2_FunctionBody[EObject in_current] returns [EObject current=in_current] : ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) ) ;
    public final EObject norm2_FunctionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_body_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:666:1: ( ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:667:2: ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:667:2: ( ( ( () '{' ) )=> (lv_body_0_0= ruleBlock ) )
            // InternalParameterizedExpressionsTestLanguage.g:668:3: ( ( () '{' ) )=> (lv_body_0_0= ruleBlock )
            {
            // InternalParameterizedExpressionsTestLanguage.g:674:3: (lv_body_0_0= ruleBlock )
            // InternalParameterizedExpressionsTestLanguage.g:675:4: lv_body_0_0= ruleBlock
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunctionBodyAccess().getBodyBlockParserRuleCall_0_0_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_body_0_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
              				}
              				set(
              					current,
              					"body",
              					lv_body_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Block");
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
    // $ANTLR end "norm2_FunctionBody"


    // $ANTLR start "norm3_FunctionBody"
    // InternalParameterizedExpressionsTestLanguage.g:696:1: norm3_FunctionBody[EObject in_current] returns [EObject current=in_current] : ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) ) ;
    public final EObject norm3_FunctionBody(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_body_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:697:1: ( ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:698:2: ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:698:2: ( ( ( () '{' ) )=> (lv_body_0_0= norm1_Block ) )
            // InternalParameterizedExpressionsTestLanguage.g:699:3: ( ( () '{' ) )=> (lv_body_0_0= norm1_Block )
            {
            // InternalParameterizedExpressionsTestLanguage.g:705:3: (lv_body_0_0= norm1_Block )
            // InternalParameterizedExpressionsTestLanguage.g:706:4: lv_body_0_0= norm1_Block
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getFunctionBodyAccess().getBodyBlockParserRuleCall_0_0_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_body_0_0=norm1_Block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
              				}
              				set(
              					current,
              					"body",
              					lv_body_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Block");
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
    // $ANTLR end "norm3_FunctionBody"


    // $ANTLR start "entryRuleBlock"
    // InternalParameterizedExpressionsTestLanguage.g:726:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:726:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalParameterizedExpressionsTestLanguage.g:727:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalParameterizedExpressionsTestLanguage.g:733:1: ruleBlock returns [EObject current=null] : ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:734:1: ( ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalParameterizedExpressionsTestLanguage.g:735:2: ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:735:2: ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalParameterizedExpressionsTestLanguage.g:736:3: ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalParameterizedExpressionsTestLanguage.g:736:3: ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) )
            // InternalParameterizedExpressionsTestLanguage.g:737:4: ( ( () '{' ) )=> ( () otherlv_1= '{' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:743:4: ( () otherlv_1= '{' )
            // InternalParameterizedExpressionsTestLanguage.g:744:5: () otherlv_1= '{'
            {
            // InternalParameterizedExpressionsTestLanguage.g:744:5: ()
            // InternalParameterizedExpressionsTestLanguage.g:745:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getBlockAccess().getBlockAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0_0_1());
              				
            }

            }


            }

            // InternalParameterizedExpressionsTestLanguage.g:757:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==12||LA13_0==16||LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:758:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:758:4: (lv_statements_2_0= ruleStatement )
            	    // InternalParameterizedExpressionsTestLanguage.g:759:5: lv_statements_2_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
              		
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "norm1_Block"
    // InternalParameterizedExpressionsTestLanguage.g:785:1: norm1_Block returns [EObject current=null] : ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= norm1_Statement ) )* otherlv_3= '}' ) ;
    public final EObject norm1_Block() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:786:1: ( ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= norm1_Statement ) )* otherlv_3= '}' ) )
            // InternalParameterizedExpressionsTestLanguage.g:787:2: ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= norm1_Statement ) )* otherlv_3= '}' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:787:2: ( ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= norm1_Statement ) )* otherlv_3= '}' )
            // InternalParameterizedExpressionsTestLanguage.g:788:3: ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) ) ( (lv_statements_2_0= norm1_Statement ) )* otherlv_3= '}'
            {
            // InternalParameterizedExpressionsTestLanguage.g:788:3: ( ( ( () '{' ) )=> ( () otherlv_1= '{' ) )
            // InternalParameterizedExpressionsTestLanguage.g:789:4: ( ( () '{' ) )=> ( () otherlv_1= '{' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:795:4: ( () otherlv_1= '{' )
            // InternalParameterizedExpressionsTestLanguage.g:796:5: () otherlv_1= '{'
            {
            // InternalParameterizedExpressionsTestLanguage.g:796:5: ()
            // InternalParameterizedExpressionsTestLanguage.g:797:6: 
            {
            if ( state.backtracking==0 ) {

              						current = forceCreateModelElement(
              							grammarAccess.getBlockAccess().getBlockAction_0_0_0(),
              							current);
              					
            }

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0_0_1());
              				
            }

            }


            }

            // InternalParameterizedExpressionsTestLanguage.g:809:3: ( (lv_statements_2_0= norm1_Statement ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==12||LA14_0==16||LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:810:4: (lv_statements_2_0= norm1_Statement )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:810:4: (lv_statements_2_0= norm1_Statement )
            	    // InternalParameterizedExpressionsTestLanguage.g:811:5: lv_statements_2_0= norm1_Statement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_statements_2_0=norm1_Statement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Statement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_2());
              		
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
    // $ANTLR end "norm1_Block"


    // $ANTLR start "entryRuleStatement"
    // InternalParameterizedExpressionsTestLanguage.g:836:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:836:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalParameterizedExpressionsTestLanguage.g:837:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalParameterizedExpressionsTestLanguage.g:843:1: ruleStatement returns [EObject current=null] : ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration ) | this_RootStatement_1= ruleRootStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_RootStatement_1 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:844:1: ( ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration ) | this_RootStatement_1= ruleRootStatement ) )
            // InternalParameterizedExpressionsTestLanguage.g:845:2: ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration ) | this_RootStatement_1= ruleRootStatement )
            {
            // InternalParameterizedExpressionsTestLanguage.g:845:2: ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration ) | this_RootStatement_1= ruleRootStatement )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:846:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:846:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration )
                    // InternalParameterizedExpressionsTestLanguage.g:847:4: ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionDeclaration_0=ruleFunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FunctionDeclaration_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:863:3: this_RootStatement_1= ruleRootStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getRootStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RootStatement_1=ruleRootStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RootStatement_1;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "norm1_Statement"
    // InternalParameterizedExpressionsTestLanguage.g:876:1: norm1_Statement returns [EObject current=null] : ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration ) | this_RootStatement_1= norm1_RootStatement ) ;
    public final EObject norm1_Statement() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionDeclaration_0 = null;

        EObject this_RootStatement_1 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:877:1: ( ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration ) | this_RootStatement_1= norm1_RootStatement ) )
            // InternalParameterizedExpressionsTestLanguage.g:878:2: ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration ) | this_RootStatement_1= norm1_RootStatement )
            {
            // InternalParameterizedExpressionsTestLanguage.g:878:2: ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration ) | this_RootStatement_1= norm1_RootStatement )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:879:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:879:3: ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration )
                    // InternalParameterizedExpressionsTestLanguage.g:880:4: ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementAccess().getFunctionDeclarationParserRuleCall_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FunctionDeclaration_0=norm1_FunctionDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_FunctionDeclaration_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:896:3: this_RootStatement_1= norm1_RootStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementAccess().getRootStatementParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RootStatement_1=norm1_RootStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RootStatement_1;
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
    // $ANTLR end "norm1_Statement"


    // $ANTLR start "entryRuleExpressionStatement"
    // InternalParameterizedExpressionsTestLanguage.g:908:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:908:60: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalParameterizedExpressionsTestLanguage.g:909:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
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
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // InternalParameterizedExpressionsTestLanguage.g:915:1: ruleExpressionStatement returns [EObject current=null] : ( ( (lv_expression_0_0= norm1_Expression ) ) otherlv_1= ';' ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:916:1: ( ( ( (lv_expression_0_0= norm1_Expression ) ) otherlv_1= ';' ) )
            // InternalParameterizedExpressionsTestLanguage.g:917:2: ( ( (lv_expression_0_0= norm1_Expression ) ) otherlv_1= ';' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:917:2: ( ( (lv_expression_0_0= norm1_Expression ) ) otherlv_1= ';' )
            // InternalParameterizedExpressionsTestLanguage.g:918:3: ( (lv_expression_0_0= norm1_Expression ) ) otherlv_1= ';'
            {
            // InternalParameterizedExpressionsTestLanguage.g:918:3: ( (lv_expression_0_0= norm1_Expression ) )
            // InternalParameterizedExpressionsTestLanguage.g:919:4: (lv_expression_0_0= norm1_Expression )
            {
            // InternalParameterizedExpressionsTestLanguage.g:919:4: (lv_expression_0_0= norm1_Expression )
            // InternalParameterizedExpressionsTestLanguage.g:920:5: lv_expression_0_0= norm1_Expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expression_0_0=norm1_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1());
              		
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
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "norm1_ExpressionStatement"
    // InternalParameterizedExpressionsTestLanguage.g:946:1: norm1_ExpressionStatement returns [EObject current=null] : ( ( (lv_expression_0_0= norm3_Expression ) ) otherlv_1= ';' ) ;
    public final EObject norm1_ExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:947:1: ( ( ( (lv_expression_0_0= norm3_Expression ) ) otherlv_1= ';' ) )
            // InternalParameterizedExpressionsTestLanguage.g:948:2: ( ( (lv_expression_0_0= norm3_Expression ) ) otherlv_1= ';' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:948:2: ( ( (lv_expression_0_0= norm3_Expression ) ) otherlv_1= ';' )
            // InternalParameterizedExpressionsTestLanguage.g:949:3: ( (lv_expression_0_0= norm3_Expression ) ) otherlv_1= ';'
            {
            // InternalParameterizedExpressionsTestLanguage.g:949:3: ( (lv_expression_0_0= norm3_Expression ) )
            // InternalParameterizedExpressionsTestLanguage.g:950:4: (lv_expression_0_0= norm3_Expression )
            {
            // InternalParameterizedExpressionsTestLanguage.g:950:4: (lv_expression_0_0= norm3_Expression )
            // InternalParameterizedExpressionsTestLanguage.g:951:5: lv_expression_0_0= norm3_Expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionStatementAccess().getExpressionExpressionParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_expression_0_0=norm3_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1());
              		
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
    // $ANTLR end "norm1_ExpressionStatement"


    // $ANTLR start "entryRuleLabelledStatement"
    // InternalParameterizedExpressionsTestLanguage.g:976:1: entryRuleLabelledStatement returns [EObject current=null] : iv_ruleLabelledStatement= ruleLabelledStatement EOF ;
    public final EObject entryRuleLabelledStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelledStatement = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:976:58: (iv_ruleLabelledStatement= ruleLabelledStatement EOF )
            // InternalParameterizedExpressionsTestLanguage.g:977:2: iv_ruleLabelledStatement= ruleLabelledStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabelledStatementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLabelledStatement=ruleLabelledStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabelledStatement; 
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
    // $ANTLR end "entryRuleLabelledStatement"


    // $ANTLR start "ruleLabelledStatement"
    // InternalParameterizedExpressionsTestLanguage.g:983:1: ruleLabelledStatement returns [EObject current=null] : ( ( ( ( ( ( ruleIdentifier ) ) ':' ) )=> ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= ruleStatement ) ) ) ;
    public final EObject ruleLabelledStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_statement_2_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:984:1: ( ( ( ( ( ( ( ruleIdentifier ) ) ':' ) )=> ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= ruleStatement ) ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:985:2: ( ( ( ( ( ( ruleIdentifier ) ) ':' ) )=> ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= ruleStatement ) ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:985:2: ( ( ( ( ( ( ruleIdentifier ) ) ':' ) )=> ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= ruleStatement ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:986:3: ( ( ( ( ( ruleIdentifier ) ) ':' ) )=> ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= ruleStatement ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:986:3: ( ( ( ( ( ruleIdentifier ) ) ':' ) )=> ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' ) )
            // InternalParameterizedExpressionsTestLanguage.g:987:4: ( ( ( ( ruleIdentifier ) ) ':' ) )=> ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:996:4: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':' )
            // InternalParameterizedExpressionsTestLanguage.g:997:5: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= ':'
            {
            // InternalParameterizedExpressionsTestLanguage.g:997:5: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalParameterizedExpressionsTestLanguage.g:998:6: (lv_name_0_0= ruleIdentifier )
            {
            // InternalParameterizedExpressionsTestLanguage.g:998:6: (lv_name_0_0= ruleIdentifier )
            // InternalParameterizedExpressionsTestLanguage.g:999:7: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getLabelledStatementAccess().getNameIdentifierParserRuleCall_0_0_0_0());
              						
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getLabelledStatementRule());
              							}
              							set(
              								current,
              								"name",
              								lv_name_0_0,
              								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
              							afterParserOrEnumRuleCall();
              						
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getLabelledStatementAccess().getColonKeyword_0_0_1());
              				
            }

            }


            }

            // InternalParameterizedExpressionsTestLanguage.g:1022:3: ( (lv_statement_2_0= ruleStatement ) )
            // InternalParameterizedExpressionsTestLanguage.g:1023:4: (lv_statement_2_0= ruleStatement )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1023:4: (lv_statement_2_0= ruleStatement )
            // InternalParameterizedExpressionsTestLanguage.g:1024:5: lv_statement_2_0= ruleStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabelledStatementAccess().getStatementStatementParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_statement_2_0=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLabelledStatementRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Statement");
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
    // $ANTLR end "ruleLabelledStatement"


    // $ANTLR start "norm1_LabelledStatement"
    // InternalParameterizedExpressionsTestLanguage.g:1046:1: norm1_LabelledStatement returns [EObject current=null] : ( ( ( ( ( ( norm1_Identifier ) ) ':' ) )=> ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= norm1_Statement ) ) ) ;
    public final EObject norm1_LabelledStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_statement_2_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1047:1: ( ( ( ( ( ( ( norm1_Identifier ) ) ':' ) )=> ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= norm1_Statement ) ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1048:2: ( ( ( ( ( ( norm1_Identifier ) ) ':' ) )=> ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= norm1_Statement ) ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1048:2: ( ( ( ( ( ( norm1_Identifier ) ) ':' ) )=> ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= norm1_Statement ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1049:3: ( ( ( ( ( norm1_Identifier ) ) ':' ) )=> ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' ) ) ( (lv_statement_2_0= norm1_Statement ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1049:3: ( ( ( ( ( norm1_Identifier ) ) ':' ) )=> ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' ) )
            // InternalParameterizedExpressionsTestLanguage.g:1050:4: ( ( ( ( norm1_Identifier ) ) ':' ) )=> ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1059:4: ( ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':' )
            // InternalParameterizedExpressionsTestLanguage.g:1060:5: ( (lv_name_0_0= norm1_Identifier ) ) otherlv_1= ':'
            {
            // InternalParameterizedExpressionsTestLanguage.g:1060:5: ( (lv_name_0_0= norm1_Identifier ) )
            // InternalParameterizedExpressionsTestLanguage.g:1061:6: (lv_name_0_0= norm1_Identifier )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1061:6: (lv_name_0_0= norm1_Identifier )
            // InternalParameterizedExpressionsTestLanguage.g:1062:7: lv_name_0_0= norm1_Identifier
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getLabelledStatementAccess().getNameIdentifierParserRuleCall_0_0_0_0());
              						
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_name_0_0=norm1_Identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getLabelledStatementRule());
              							}
              							set(
              								current,
              								"name",
              								lv_name_0_0,
              								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
              							afterParserOrEnumRuleCall();
              						
            }

            }


            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getLabelledStatementAccess().getColonKeyword_0_0_1());
              				
            }

            }


            }

            // InternalParameterizedExpressionsTestLanguage.g:1085:3: ( (lv_statement_2_0= norm1_Statement ) )
            // InternalParameterizedExpressionsTestLanguage.g:1086:4: (lv_statement_2_0= norm1_Statement )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1086:4: (lv_statement_2_0= norm1_Statement )
            // InternalParameterizedExpressionsTestLanguage.g:1087:5: lv_statement_2_0= norm1_Statement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLabelledStatementAccess().getStatementStatementParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_statement_2_0=norm1_Statement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLabelledStatementRule());
              					}
              					set(
              						current,
              						"statement",
              						lv_statement_2_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Statement");
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
    // $ANTLR end "norm1_LabelledStatement"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1108:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1108:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalParameterizedExpressionsTestLanguage.g:1109:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1115:1: rulePrimaryExpression returns [EObject current=null] : this_IdentifierRef_0= ruleIdentifierRef ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IdentifierRef_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1116:1: (this_IdentifierRef_0= ruleIdentifierRef )
            // InternalParameterizedExpressionsTestLanguage.g:1117:2: this_IdentifierRef_0= ruleIdentifierRef
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIdentifierRefParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_IdentifierRef_0=ruleIdentifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_IdentifierRef_0;
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "norm1_PrimaryExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1129:1: norm1_PrimaryExpression returns [EObject current=null] : this_IdentifierRef_0= norm1_IdentifierRef ;
    public final EObject norm1_PrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IdentifierRef_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1130:1: (this_IdentifierRef_0= norm1_IdentifierRef )
            // InternalParameterizedExpressionsTestLanguage.g:1131:2: this_IdentifierRef_0= norm1_IdentifierRef
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIdentifierRefParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_IdentifierRef_0=norm1_IdentifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_IdentifierRef_0;
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
    // $ANTLR end "norm1_PrimaryExpression"


    // $ANTLR start "entryRuleIdentifierRef"
    // InternalParameterizedExpressionsTestLanguage.g:1142:1: entryRuleIdentifierRef returns [EObject current=null] : iv_ruleIdentifierRef= ruleIdentifierRef EOF ;
    public final EObject entryRuleIdentifierRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentifierRef = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1142:54: (iv_ruleIdentifierRef= ruleIdentifierRef EOF )
            // InternalParameterizedExpressionsTestLanguage.g:1143:2: iv_ruleIdentifierRef= ruleIdentifierRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifierRef=ruleIdentifierRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifierRef; 
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
    // $ANTLR end "entryRuleIdentifierRef"


    // $ANTLR start "ruleIdentifierRef"
    // InternalParameterizedExpressionsTestLanguage.g:1149:1: ruleIdentifierRef returns [EObject current=null] : ( (lv_id_0_0= ruleIdentifier ) ) ;
    public final EObject ruleIdentifierRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1150:1: ( ( (lv_id_0_0= ruleIdentifier ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1151:2: ( (lv_id_0_0= ruleIdentifier ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1151:2: ( (lv_id_0_0= ruleIdentifier ) )
            // InternalParameterizedExpressionsTestLanguage.g:1152:3: (lv_id_0_0= ruleIdentifier )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1152:3: (lv_id_0_0= ruleIdentifier )
            // InternalParameterizedExpressionsTestLanguage.g:1153:4: lv_id_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIdentifierRefAccess().getIdIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_id_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getIdentifierRefRule());
              				}
              				set(
              					current,
              					"id",
              					lv_id_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
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
    // $ANTLR end "ruleIdentifierRef"


    // $ANTLR start "norm1_IdentifierRef"
    // InternalParameterizedExpressionsTestLanguage.g:1174:1: norm1_IdentifierRef returns [EObject current=null] : ( (lv_id_0_0= norm1_Identifier ) ) ;
    public final EObject norm1_IdentifierRef() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_0_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1175:1: ( ( (lv_id_0_0= norm1_Identifier ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1176:2: ( (lv_id_0_0= norm1_Identifier ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1176:2: ( (lv_id_0_0= norm1_Identifier ) )
            // InternalParameterizedExpressionsTestLanguage.g:1177:3: (lv_id_0_0= norm1_Identifier )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1177:3: (lv_id_0_0= norm1_Identifier )
            // InternalParameterizedExpressionsTestLanguage.g:1178:4: lv_id_0_0= norm1_Identifier
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getIdentifierRefAccess().getIdIdentifierParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_id_0_0=norm1_Identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getIdentifierRefRule());
              				}
              				set(
              					current,
              					"id",
              					lv_id_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
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
    // $ANTLR end "norm1_IdentifierRef"


    // $ANTLR start "entryRuleMemberExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1198:1: entryRuleMemberExpression returns [EObject current=null] : iv_ruleMemberExpression= ruleMemberExpression EOF ;
    public final EObject entryRuleMemberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberExpression = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1198:57: (iv_ruleMemberExpression= ruleMemberExpression EOF )
            // InternalParameterizedExpressionsTestLanguage.g:1199:2: iv_ruleMemberExpression= ruleMemberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMemberExpression=ruleMemberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberExpression; 
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
    // $ANTLR end "entryRuleMemberExpression"


    // $ANTLR start "ruleMemberExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1205:1: ruleMemberExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] ) )* ) ;
    public final EObject ruleMemberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_IndexedAccessExpressionTail_2 = null;

        EObject this_ParameterizedPropertyAccessExpressionTail_4 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1206:1: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1207:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1207:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1208:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMemberExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_15);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1216:3: ( ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }
                else if ( (LA17_0==21) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1217:4: ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1217:4: ( () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current] )
            	    // InternalParameterizedExpressionsTestLanguage.g:1218:5: () this_IndexedAccessExpressionTail_2= ruleIndexedAccessExpressionTail[$current]
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1218:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1219:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMemberExpressionAccess().getIndexedAccessExpressionTargetAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getMemberExpressionRule());
            	      					}
            	      					newCompositeNode(grammarAccess.getMemberExpressionAccess().getIndexedAccessExpressionTailParserRuleCall_1_0_1());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    this_IndexedAccessExpressionTail_2=ruleIndexedAccessExpressionTail(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current = this_IndexedAccessExpressionTail_2;
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1238:4: ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1238:4: ( () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current] )
            	    // InternalParameterizedExpressionsTestLanguage.g:1239:5: () this_ParameterizedPropertyAccessExpressionTail_4= ruleParameterizedPropertyAccessExpressionTail[$current]
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1239:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1240:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMemberExpressionAccess().getParameterizedPropertyAccessExpressionTargetAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getMemberExpressionRule());
            	      					}
            	      					newCompositeNode(grammarAccess.getMemberExpressionAccess().getParameterizedPropertyAccessExpressionTailParserRuleCall_1_1_1());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    this_ParameterizedPropertyAccessExpressionTail_4=ruleParameterizedPropertyAccessExpressionTail(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current = this_ParameterizedPropertyAccessExpressionTail_4;
            	      					afterParserOrEnumRuleCall();
            	      				
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
    // $ANTLR end "ruleMemberExpression"


    // $ANTLR start "norm1_MemberExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1264:1: norm1_MemberExpression returns [EObject current=null] : (this_PrimaryExpression_0= norm1_PrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] ) )* ) ;
    public final EObject norm1_MemberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject this_IndexedAccessExpressionTail_2 = null;

        EObject this_ParameterizedPropertyAccessExpressionTail_4 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1265:1: ( (this_PrimaryExpression_0= norm1_PrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1266:2: (this_PrimaryExpression_0= norm1_PrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1266:2: (this_PrimaryExpression_0= norm1_PrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1267:3: this_PrimaryExpression_0= norm1_PrimaryExpression ( ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMemberExpressionAccess().getPrimaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_15);
            this_PrimaryExpression_0=norm1_PrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1275:3: ( ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] ) | ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }
                else if ( (LA18_0==21) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1276:4: ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1276:4: ( () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current] )
            	    // InternalParameterizedExpressionsTestLanguage.g:1277:5: () this_IndexedAccessExpressionTail_2= norm1_IndexedAccessExpressionTail[$current]
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1277:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1278:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMemberExpressionAccess().getIndexedAccessExpressionTargetAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getMemberExpressionRule());
            	      					}
            	      					newCompositeNode(grammarAccess.getMemberExpressionAccess().getIndexedAccessExpressionTailParserRuleCall_1_0_1());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    this_IndexedAccessExpressionTail_2=norm1_IndexedAccessExpressionTail(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current = this_IndexedAccessExpressionTail_2;
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1297:4: ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1297:4: ( () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current] )
            	    // InternalParameterizedExpressionsTestLanguage.g:1298:5: () this_ParameterizedPropertyAccessExpressionTail_4= norm1_ParameterizedPropertyAccessExpressionTail[$current]
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1298:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1299:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMemberExpressionAccess().getParameterizedPropertyAccessExpressionTargetAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getMemberExpressionRule());
            	      					}
            	      					newCompositeNode(grammarAccess.getMemberExpressionAccess().getParameterizedPropertyAccessExpressionTailParserRuleCall_1_1_1());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    this_ParameterizedPropertyAccessExpressionTail_4=norm1_ParameterizedPropertyAccessExpressionTail(current);

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current = this_ParameterizedPropertyAccessExpressionTail_4;
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "norm1_MemberExpression"


    // $ANTLR start "ruleIndexedAccessExpressionTail"
    // InternalParameterizedExpressionsTestLanguage.g:1323:1: ruleIndexedAccessExpressionTail[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_index_1_0= norm1_Expression ) ) otherlv_2= ']' ) ;
    public final EObject ruleIndexedAccessExpressionTail(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_index_1_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1324:1: ( (otherlv_0= '[' ( (lv_index_1_0= norm1_Expression ) ) otherlv_2= ']' ) )
            // InternalParameterizedExpressionsTestLanguage.g:1325:2: (otherlv_0= '[' ( (lv_index_1_0= norm1_Expression ) ) otherlv_2= ']' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1325:2: (otherlv_0= '[' ( (lv_index_1_0= norm1_Expression ) ) otherlv_2= ']' )
            // InternalParameterizedExpressionsTestLanguage.g:1326:3: otherlv_0= '[' ( (lv_index_1_0= norm1_Expression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedAccessExpressionTailAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1330:3: ( (lv_index_1_0= norm1_Expression ) )
            // InternalParameterizedExpressionsTestLanguage.g:1331:4: (lv_index_1_0= norm1_Expression )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1331:4: (lv_index_1_0= norm1_Expression )
            // InternalParameterizedExpressionsTestLanguage.g:1332:5: lv_index_1_0= norm1_Expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIndexedAccessExpressionTailAccess().getIndexExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_index_1_0=norm1_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIndexedAccessExpressionTailRule());
              					}
              					set(
              						current,
              						"index",
              						lv_index_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIndexedAccessExpressionTailAccess().getRightSquareBracketKeyword_2());
              		
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
    // $ANTLR end "ruleIndexedAccessExpressionTail"


    // $ANTLR start "norm1_IndexedAccessExpressionTail"
    // InternalParameterizedExpressionsTestLanguage.g:1358:1: norm1_IndexedAccessExpressionTail[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_index_1_0= norm3_Expression ) ) otherlv_2= ']' ) ;
    public final EObject norm1_IndexedAccessExpressionTail(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_index_1_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1359:1: ( (otherlv_0= '[' ( (lv_index_1_0= norm3_Expression ) ) otherlv_2= ']' ) )
            // InternalParameterizedExpressionsTestLanguage.g:1360:2: (otherlv_0= '[' ( (lv_index_1_0= norm3_Expression ) ) otherlv_2= ']' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1360:2: (otherlv_0= '[' ( (lv_index_1_0= norm3_Expression ) ) otherlv_2= ']' )
            // InternalParameterizedExpressionsTestLanguage.g:1361:3: otherlv_0= '[' ( (lv_index_1_0= norm3_Expression ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIndexedAccessExpressionTailAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1365:3: ( (lv_index_1_0= norm3_Expression ) )
            // InternalParameterizedExpressionsTestLanguage.g:1366:4: (lv_index_1_0= norm3_Expression )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1366:4: (lv_index_1_0= norm3_Expression )
            // InternalParameterizedExpressionsTestLanguage.g:1367:5: lv_index_1_0= norm3_Expression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIndexedAccessExpressionTailAccess().getIndexExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_index_1_0=norm3_Expression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIndexedAccessExpressionTailRule());
              					}
              					set(
              						current,
              						"index",
              						lv_index_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Expression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIndexedAccessExpressionTailAccess().getRightSquareBracketKeyword_2());
              		
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
    // $ANTLR end "norm1_IndexedAccessExpressionTail"


    // $ANTLR start "ruleParameterizedPropertyAccessExpressionTail"
    // InternalParameterizedExpressionsTestLanguage.g:1393:1: ruleParameterizedPropertyAccessExpressionTail[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '.' ( (lv_property_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleParameterizedPropertyAccessExpressionTail(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_property_1_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1394:1: ( (otherlv_0= '.' ( (lv_property_1_0= ruleIdentifier ) ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1395:2: (otherlv_0= '.' ( (lv_property_1_0= ruleIdentifier ) ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1395:2: (otherlv_0= '.' ( (lv_property_1_0= ruleIdentifier ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1396:3: otherlv_0= '.' ( (lv_property_1_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterizedPropertyAccessExpressionTailAccess().getFullStopKeyword_0());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1400:3: ( (lv_property_1_0= ruleIdentifier ) )
            // InternalParameterizedExpressionsTestLanguage.g:1401:4: (lv_property_1_0= ruleIdentifier )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1401:4: (lv_property_1_0= ruleIdentifier )
            // InternalParameterizedExpressionsTestLanguage.g:1402:5: lv_property_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterizedPropertyAccessExpressionTailAccess().getPropertyIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_property_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterizedPropertyAccessExpressionTailRule());
              					}
              					set(
              						current,
              						"property",
              						lv_property_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
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
    // $ANTLR end "ruleParameterizedPropertyAccessExpressionTail"


    // $ANTLR start "norm1_ParameterizedPropertyAccessExpressionTail"
    // InternalParameterizedExpressionsTestLanguage.g:1424:1: norm1_ParameterizedPropertyAccessExpressionTail[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '.' ( (lv_property_1_0= norm1_Identifier ) ) ) ;
    public final EObject norm1_ParameterizedPropertyAccessExpressionTail(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_property_1_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1425:1: ( (otherlv_0= '.' ( (lv_property_1_0= norm1_Identifier ) ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1426:2: (otherlv_0= '.' ( (lv_property_1_0= norm1_Identifier ) ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1426:2: (otherlv_0= '.' ( (lv_property_1_0= norm1_Identifier ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:1427:3: otherlv_0= '.' ( (lv_property_1_0= norm1_Identifier ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterizedPropertyAccessExpressionTailAccess().getFullStopKeyword_0());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1431:3: ( (lv_property_1_0= norm1_Identifier ) )
            // InternalParameterizedExpressionsTestLanguage.g:1432:4: (lv_property_1_0= norm1_Identifier )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1432:4: (lv_property_1_0= norm1_Identifier )
            // InternalParameterizedExpressionsTestLanguage.g:1433:5: lv_property_1_0= norm1_Identifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterizedPropertyAccessExpressionTailAccess().getPropertyIdentifierParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_property_1_0=norm1_Identifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterizedPropertyAccessExpressionTailRule());
              					}
              					set(
              						current,
              						"property",
              						lv_property_1_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.Identifier");
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
    // $ANTLR end "norm1_ParameterizedPropertyAccessExpressionTail"


    // $ANTLR start "entryRuleShiftExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1454:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1454:56: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // InternalParameterizedExpressionsTestLanguage.g:1455:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
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
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1461:1: ruleShiftExpression returns [EObject current=null] : (this_MemberExpression_0= ruleMemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) ) )* ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MemberExpression_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1462:1: ( (this_MemberExpression_0= ruleMemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1463:2: (this_MemberExpression_0= ruleMemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1463:2: (this_MemberExpression_0= ruleMemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1464:3: this_MemberExpression_0= ruleMemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftExpressionAccess().getMemberExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_19);
            this_MemberExpression_0=ruleMemberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1472:3: ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) && (synpred23_InternalParameterizedExpressionsTestLanguage())) {
                    alt20=1;
                }
                else if ( (LA20_0==23) && (synpred23_InternalParameterizedExpressionsTestLanguage())) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1473:4: ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1492:4: ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1493:5: () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= ruleMemberExpression ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1493:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1494:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getShiftExpressionAccess().getShiftExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1500:5: ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1501:6: ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1501:6: ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1502:7: (lv_op_2_1= '>>' | lv_op_2_2= '<<' )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1502:7: (lv_op_2_1= '>>' | lv_op_2_2= '<<' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==22) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==23) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalParameterizedExpressionsTestLanguage.g:1503:8: lv_op_2_1= '>>'
            	            {
            	            lv_op_2_1=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getShiftExpressionAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getShiftExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalParameterizedExpressionsTestLanguage.g:1514:8: lv_op_2_2= '<<'
            	            {
            	            lv_op_2_2=(Token)match(input,23,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getShiftExpressionAccess().getOpLessThanSignLessThanSignKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getShiftExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1527:5: ( (lv_rhs_3_0= ruleMemberExpression ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1528:6: (lv_rhs_3_0= ruleMemberExpression )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1528:6: (lv_rhs_3_0= ruleMemberExpression )
            	    // InternalParameterizedExpressionsTestLanguage.g:1529:7: lv_rhs_3_0= ruleMemberExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionAccess().getRhsMemberExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_rhs_3_0=ruleMemberExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.MemberExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "norm1_ShiftExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1553:1: norm1_ShiftExpression returns [EObject current=null] : (this_MemberExpression_0= norm1_MemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) ) )* ) ;
    public final EObject norm1_ShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MemberExpression_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1554:1: ( (this_MemberExpression_0= norm1_MemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1555:2: (this_MemberExpression_0= norm1_MemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1555:2: (this_MemberExpression_0= norm1_MemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1556:3: this_MemberExpression_0= norm1_MemberExpression ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShiftExpressionAccess().getMemberExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_19);
            this_MemberExpression_0=norm1_MemberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MemberExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1564:3: ( ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) && (synpred24_InternalParameterizedExpressionsTestLanguage())) {
                    alt22=1;
                }
                else if ( (LA22_0==23) && (synpred24_InternalParameterizedExpressionsTestLanguage())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1565:4: ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )=> ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1584:4: ( () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1585:5: () ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) ) ( (lv_rhs_3_0= norm1_MemberExpression ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1585:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1586:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getShiftExpressionAccess().getShiftExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1592:5: ( ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1593:6: ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1593:6: ( (lv_op_2_1= '>>' | lv_op_2_2= '<<' ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1594:7: (lv_op_2_1= '>>' | lv_op_2_2= '<<' )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1594:7: (lv_op_2_1= '>>' | lv_op_2_2= '<<' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==22) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==23) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalParameterizedExpressionsTestLanguage.g:1595:8: lv_op_2_1= '>>'
            	            {
            	            lv_op_2_1=(Token)match(input,22,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_1, grammarAccess.getShiftExpressionAccess().getOpGreaterThanSignGreaterThanSignKeyword_1_0_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getShiftExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalParameterizedExpressionsTestLanguage.g:1606:8: lv_op_2_2= '<<'
            	            {
            	            lv_op_2_2=(Token)match(input,23,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_2, grammarAccess.getShiftExpressionAccess().getOpLessThanSignLessThanSignKeyword_1_0_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getShiftExpressionRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1619:5: ( (lv_rhs_3_0= norm1_MemberExpression ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1620:6: (lv_rhs_3_0= norm1_MemberExpression )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1620:6: (lv_rhs_3_0= norm1_MemberExpression )
            	    // InternalParameterizedExpressionsTestLanguage.g:1621:7: lv_rhs_3_0= norm1_MemberExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getShiftExpressionAccess().getRhsMemberExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_rhs_3_0=norm1_MemberExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.MemberExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "norm1_ShiftExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1644:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1644:61: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalParameterizedExpressionsTestLanguage.g:1645:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1651:1: ruleRelationalExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1652:1: ( (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1653:2: (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1653:2: (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1654:3: this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getShiftExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShiftExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1662:3: ( ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==24) && (synpred25_InternalParameterizedExpressionsTestLanguage())) {
                    alt23=1;
                }
                else if ( (LA23_0==25) && (synpred25_InternalParameterizedExpressionsTestLanguage())) {
                    alt23=1;
                }
                else if ( (LA23_0==26) && (synpred25_InternalParameterizedExpressionsTestLanguage())) {
                    alt23=1;
                }
                else if ( (LA23_0==27) && (synpred25_InternalParameterizedExpressionsTestLanguage())) {
                    alt23=1;
                }
                else if ( (LA23_0==28) && (synpred25_InternalParameterizedExpressionsTestLanguage())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1663:4: ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1678:4: ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1679:5: () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1679:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1680:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1686:5: ( (lv_op_2_0= ruleRelationalOperator ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1687:6: (lv_op_2_0= ruleRelationalOperator )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1687:6: (lv_op_2_0= ruleRelationalOperator )
            	    // InternalParameterizedExpressionsTestLanguage.g:1688:7: lv_op_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpRelationalOperatorParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_op_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"op",
            	      								lv_op_2_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.RelationalOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1705:5: ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1706:6: ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1707:6: (lv_rhs_3_0= ruleShiftExpression )
            	    // InternalParameterizedExpressionsTestLanguage.g:1708:7: lv_rhs_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRhsShiftExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_rhs_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.ShiftExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "norm1_RelationalExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1732:1: norm1_RelationalExpression returns [EObject current=null] : (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* ) ;
    public final EObject norm1_RelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1733:1: ( (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1734:2: (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1734:2: (this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1735:3: this_ShiftExpression_0= ruleShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getShiftExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_ShiftExpression_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShiftExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1743:3: ( ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) && (synpred27_InternalParameterizedExpressionsTestLanguage())) {
                    alt24=1;
                }
                else if ( (LA24_0==25) && (synpred27_InternalParameterizedExpressionsTestLanguage())) {
                    alt24=1;
                }
                else if ( (LA24_0==26) && (synpred27_InternalParameterizedExpressionsTestLanguage())) {
                    alt24=1;
                }
                else if ( (LA24_0==27) && (synpred27_InternalParameterizedExpressionsTestLanguage())) {
                    alt24=1;
                }
                else if ( (LA24_0==28) && (synpred27_InternalParameterizedExpressionsTestLanguage())) {
                    alt24=1;
                }
                else if ( (LA24_0==29) && (synpred27_InternalParameterizedExpressionsTestLanguage())) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1744:4: ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1759:4: ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1760:5: () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1760:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1761:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1767:5: ( (lv_op_2_0= norm1_RelationalOperator ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1768:6: (lv_op_2_0= norm1_RelationalOperator )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1768:6: (lv_op_2_0= norm1_RelationalOperator )
            	    // InternalParameterizedExpressionsTestLanguage.g:1769:7: lv_op_2_0= norm1_RelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpRelationalOperatorParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_op_2_0=norm1_RelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"op",
            	      								lv_op_2_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.RelationalOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1786:5: ( ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1787:6: ( 'yield' | RULE_ID )=> (lv_rhs_3_0= ruleShiftExpression )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1788:6: (lv_rhs_3_0= ruleShiftExpression )
            	    // InternalParameterizedExpressionsTestLanguage.g:1789:7: lv_rhs_3_0= ruleShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRhsShiftExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_rhs_3_0=ruleShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.ShiftExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "norm1_RelationalExpression"


    // $ANTLR start "norm2_RelationalExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1813:1: norm2_RelationalExpression returns [EObject current=null] : (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* ) ;
    public final EObject norm2_RelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1814:1: ( (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1815:2: (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1815:2: (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1816:3: this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getShiftExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_ShiftExpression_0=norm1_ShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShiftExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1824:3: ( ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) && (synpred29_InternalParameterizedExpressionsTestLanguage())) {
                    alt25=1;
                }
                else if ( (LA25_0==25) && (synpred29_InternalParameterizedExpressionsTestLanguage())) {
                    alt25=1;
                }
                else if ( (LA25_0==26) && (synpred29_InternalParameterizedExpressionsTestLanguage())) {
                    alt25=1;
                }
                else if ( (LA25_0==27) && (synpred29_InternalParameterizedExpressionsTestLanguage())) {
                    alt25=1;
                }
                else if ( (LA25_0==28) && (synpred29_InternalParameterizedExpressionsTestLanguage())) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1825:4: ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1836:4: ( () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1837:5: () ( (lv_op_2_0= ruleRelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1837:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1838:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1844:5: ( (lv_op_2_0= ruleRelationalOperator ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1845:6: (lv_op_2_0= ruleRelationalOperator )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1845:6: (lv_op_2_0= ruleRelationalOperator )
            	    // InternalParameterizedExpressionsTestLanguage.g:1846:7: lv_op_2_0= ruleRelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpRelationalOperatorParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_op_2_0=ruleRelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"op",
            	      								lv_op_2_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.RelationalOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1863:5: ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1864:6: ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1865:6: (lv_rhs_3_0= norm1_ShiftExpression )
            	    // InternalParameterizedExpressionsTestLanguage.g:1866:7: lv_rhs_3_0= norm1_ShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRhsShiftExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_rhs_3_0=norm1_ShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.ShiftExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "norm2_RelationalExpression"


    // $ANTLR start "norm3_RelationalExpression"
    // InternalParameterizedExpressionsTestLanguage.g:1890:1: norm3_RelationalExpression returns [EObject current=null] : (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* ) ;
    public final EObject norm3_RelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ShiftExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1891:1: ( (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* ) )
            // InternalParameterizedExpressionsTestLanguage.g:1892:2: (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1892:2: (this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )* )
            // InternalParameterizedExpressionsTestLanguage.g:1893:3: this_ShiftExpression_0= norm1_ShiftExpression ( ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRelationalExpressionAccess().getShiftExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_ShiftExpression_0=norm1_ShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShiftExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:1901:3: ( ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==24) && (synpred31_InternalParameterizedExpressionsTestLanguage())) {
                    alt26=1;
                }
                else if ( (LA26_0==25) && (synpred31_InternalParameterizedExpressionsTestLanguage())) {
                    alt26=1;
                }
                else if ( (LA26_0==26) && (synpred31_InternalParameterizedExpressionsTestLanguage())) {
                    alt26=1;
                }
                else if ( (LA26_0==27) && (synpred31_InternalParameterizedExpressionsTestLanguage())) {
                    alt26=1;
                }
                else if ( (LA26_0==28) && (synpred31_InternalParameterizedExpressionsTestLanguage())) {
                    alt26=1;
                }
                else if ( (LA26_0==29) && (synpred31_InternalParameterizedExpressionsTestLanguage())) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalParameterizedExpressionsTestLanguage.g:1902:4: ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )=> ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1913:4: ( () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1914:5: () ( (lv_op_2_0= norm1_RelationalOperator ) ) ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1914:5: ()
            	    // InternalParameterizedExpressionsTestLanguage.g:1915:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLhsAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1921:5: ( (lv_op_2_0= norm1_RelationalOperator ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1922:6: (lv_op_2_0= norm1_RelationalOperator )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1922:6: (lv_op_2_0= norm1_RelationalOperator )
            	    // InternalParameterizedExpressionsTestLanguage.g:1923:7: lv_op_2_0= norm1_RelationalOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOpRelationalOperatorParserRuleCall_1_0_1_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_op_2_0=norm1_RelationalOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"op",
            	      								lv_op_2_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.RelationalOperator");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalParameterizedExpressionsTestLanguage.g:1940:5: ( ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression ) )
            	    // InternalParameterizedExpressionsTestLanguage.g:1941:6: ( RULE_ID )=> (lv_rhs_3_0= norm1_ShiftExpression )
            	    {
            	    // InternalParameterizedExpressionsTestLanguage.g:1942:6: (lv_rhs_3_0= norm1_ShiftExpression )
            	    // InternalParameterizedExpressionsTestLanguage.g:1943:7: lv_rhs_3_0= norm1_ShiftExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRhsShiftExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_rhs_3_0=norm1_ShiftExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      							}
            	      							set(
            	      								current,
            	      								"rhs",
            	      								lv_rhs_3_0,
            	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.ShiftExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "norm3_RelationalExpression"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalParameterizedExpressionsTestLanguage.g:1966:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:1966:58: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalParameterizedExpressionsTestLanguage.g:1967:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOperator.getText(); 
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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalParameterizedExpressionsTestLanguage.g:1973:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

        try {
            // InternalParameterizedExpressionsTestLanguage.g:1974:1: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' ) )
            // InternalParameterizedExpressionsTestLanguage.g:1975:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:1975:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt27=1;
                }
                break;
            case 25:
                {
                alt27=2;
                }
                break;
            case 26:
                {
                alt27=3;
                }
                break;
            case 27:
                {
                alt27=4;
                }
                break;
            case 28:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:1976:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:1982:3: kw= '>'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalParameterizedExpressionsTestLanguage.g:1988:3: kw= '<='
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalParameterizedExpressionsTestLanguage.g:1994:3: kw= '>='
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalParameterizedExpressionsTestLanguage.g:2000:3: kw= 'instanceof'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getInstanceofKeyword_4());
                      		
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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "norm1_RelationalOperator"
    // InternalParameterizedExpressionsTestLanguage.g:2010:1: norm1_RelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' | kw= 'in' ) ;
    public final AntlrDatatypeRuleToken norm1_RelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

        try {
            // InternalParameterizedExpressionsTestLanguage.g:2011:1: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' | kw= 'in' ) )
            // InternalParameterizedExpressionsTestLanguage.g:2012:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' | kw= 'in' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2012:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= 'instanceof' | kw= 'in' )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt28=1;
                }
                break;
            case 25:
                {
                alt28=2;
                }
                break;
            case 26:
                {
                alt28=3;
                }
                break;
            case 27:
                {
                alt28=4;
                }
                break;
            case 28:
                {
                alt28=5;
                }
                break;
            case 29:
                {
                alt28=6;
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
                    // InternalParameterizedExpressionsTestLanguage.g:2013:3: kw= '<'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:2019:3: kw= '>'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalParameterizedExpressionsTestLanguage.g:2025:3: kw= '<='
                    {
                    kw=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalParameterizedExpressionsTestLanguage.g:2031:3: kw= '>='
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalParameterizedExpressionsTestLanguage.g:2037:3: kw= 'instanceof'
                    {
                    kw=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getInstanceofKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalParameterizedExpressionsTestLanguage.g:2043:3: kw= 'in'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getInKeyword_5_0());
                      		
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
    // $ANTLR end "norm1_RelationalOperator"


    // $ANTLR start "entryRuleAssignmentExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2052:1: entryRuleAssignmentExpression returns [EObject current=null] : iv_ruleAssignmentExpression= ruleAssignmentExpression EOF ;
    public final EObject entryRuleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpression = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2052:61: (iv_ruleAssignmentExpression= ruleAssignmentExpression EOF )
            // InternalParameterizedExpressionsTestLanguage.g:2053:2: iv_ruleAssignmentExpression= ruleAssignmentExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssignmentExpression=ruleAssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpression; 
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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2059:1: ruleAssignmentExpression returns [EObject current=null] : (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= ruleAssignmentExpression ) ) )? ) ;
    public final EObject ruleAssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2060:1: ( (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= ruleAssignmentExpression ) ) )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:2061:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= ruleAssignmentExpression ) ) )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2061:2: (this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= ruleAssignmentExpression ) ) )? )
            // InternalParameterizedExpressionsTestLanguage.g:2062:3: this_RelationalExpression_0= ruleRelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= ruleAssignmentExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRelationalExpressionParserRuleCall_1_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_RelationalExpression_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:2070:3: ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= ruleAssignmentExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) && (synpred33_InternalParameterizedExpressionsTestLanguage())) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2071:4: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= ruleAssignmentExpression ) )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2071:4: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2072:5: ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2082:5: ( () ( (lv_op_2_0= '=' ) ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2083:6: () ( (lv_op_2_0= '=' ) )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2083:6: ()
                    // InternalParameterizedExpressionsTestLanguage.g:2084:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLhsAction_1_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalParameterizedExpressionsTestLanguage.g:2090:6: ( (lv_op_2_0= '=' ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2091:7: (lv_op_2_0= '=' )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2091:7: (lv_op_2_0= '=' )
                    // InternalParameterizedExpressionsTestLanguage.g:2092:8: lv_op_2_0= '='
                    {
                    lv_op_2_0=(Token)match(input,30,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(lv_op_2_0, grammarAccess.getAssignmentExpressionAccess().getOpEqualsSignKeyword_1_1_0_0_1_0());
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getAssignmentExpressionRule());
                      								}
                      								setWithLastConsumed(current, "op", lv_op_2_0, "=");
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalParameterizedExpressionsTestLanguage.g:2106:4: ( (lv_rhs_3_0= ruleAssignmentExpression ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2107:5: (lv_rhs_3_0= ruleAssignmentExpression )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2107:5: (lv_rhs_3_0= ruleAssignmentExpression )
                    // InternalParameterizedExpressionsTestLanguage.g:2108:6: lv_rhs_3_0= ruleAssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRhsAssignmentExpressionParserRuleCall_1_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rhs_3_0=ruleAssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "norm1_AssignmentExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2131:1: norm1_AssignmentExpression returns [EObject current=null] : (this_RelationalExpression_0= norm1_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= norm1_AssignmentExpression ) ) )? ) ;
    public final EObject norm1_AssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_RelationalExpression_0 = null;

        EObject lv_rhs_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2132:1: ( (this_RelationalExpression_0= norm1_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= norm1_AssignmentExpression ) ) )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:2133:2: (this_RelationalExpression_0= norm1_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= norm1_AssignmentExpression ) ) )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2133:2: (this_RelationalExpression_0= norm1_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= norm1_AssignmentExpression ) ) )? )
            // InternalParameterizedExpressionsTestLanguage.g:2134:3: this_RelationalExpression_0= norm1_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= norm1_AssignmentExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRelationalExpressionParserRuleCall_1_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_RelationalExpression_0=norm1_RelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RelationalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:2142:3: ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= norm1_AssignmentExpression ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) && (synpred34_InternalParameterizedExpressionsTestLanguage())) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2143:4: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) ) ( (lv_rhs_3_0= norm1_AssignmentExpression ) )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2143:4: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2144:5: ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_2_0= '=' ) ) )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2154:5: ( () ( (lv_op_2_0= '=' ) ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2155:6: () ( (lv_op_2_0= '=' ) )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2155:6: ()
                    // InternalParameterizedExpressionsTestLanguage.g:2156:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLhsAction_1_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    // InternalParameterizedExpressionsTestLanguage.g:2162:6: ( (lv_op_2_0= '=' ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2163:7: (lv_op_2_0= '=' )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2163:7: (lv_op_2_0= '=' )
                    // InternalParameterizedExpressionsTestLanguage.g:2164:8: lv_op_2_0= '='
                    {
                    lv_op_2_0=(Token)match(input,30,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								newLeafNode(lv_op_2_0, grammarAccess.getAssignmentExpressionAccess().getOpEqualsSignKeyword_1_1_0_0_1_0());
                      							
                    }
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElement(grammarAccess.getAssignmentExpressionRule());
                      								}
                      								setWithLastConsumed(current, "op", lv_op_2_0, "=");
                      							
                    }

                    }


                    }


                    }


                    }

                    // InternalParameterizedExpressionsTestLanguage.g:2178:4: ( (lv_rhs_3_0= norm1_AssignmentExpression ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2179:5: (lv_rhs_3_0= norm1_AssignmentExpression )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2179:5: (lv_rhs_3_0= norm1_AssignmentExpression )
                    // InternalParameterizedExpressionsTestLanguage.g:2180:6: lv_rhs_3_0= norm1_AssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRhsAssignmentExpressionParserRuleCall_1_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_rhs_3_0=norm1_AssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
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
    // $ANTLR end "norm1_AssignmentExpression"


    // $ANTLR start "norm2_AssignmentExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2203:1: norm2_AssignmentExpression returns [EObject current=null] : (this_YieldExpression_0= ruleYieldExpression | (this_RelationalExpression_1= norm2_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )? ) ) ;
    public final EObject norm2_AssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_0=null;
        EObject this_YieldExpression_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject lv_rhs_4_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2204:1: ( (this_YieldExpression_0= ruleYieldExpression | (this_RelationalExpression_1= norm2_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )? ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:2205:2: (this_YieldExpression_0= ruleYieldExpression | (this_RelationalExpression_1= norm2_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )? ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2205:2: (this_YieldExpression_0= ruleYieldExpression | (this_RelationalExpression_1= norm2_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )? ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2206:3: this_YieldExpression_0= ruleYieldExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getYieldExpressionParserRuleCall_0_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_YieldExpression_0=ruleYieldExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YieldExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:2215:3: (this_RelationalExpression_1= norm2_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )? )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2215:3: (this_RelationalExpression_1= norm2_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )? )
                    // InternalParameterizedExpressionsTestLanguage.g:2216:4: this_RelationalExpression_1= norm2_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRelationalExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_RelationalExpression_1=norm2_RelationalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RelationalExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalParameterizedExpressionsTestLanguage.g:2224:4: ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==30) && (synpred35_InternalParameterizedExpressionsTestLanguage())) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalParameterizedExpressionsTestLanguage.g:2225:5: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm2_AssignmentExpression ) )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2225:5: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2226:6: ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2236:6: ( () ( (lv_op_3_0= '=' ) ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2237:7: () ( (lv_op_3_0= '=' ) )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2237:7: ()
                            // InternalParameterizedExpressionsTestLanguage.g:2238:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElementAndSet(
                              									grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLhsAction_1_1_0_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalParameterizedExpressionsTestLanguage.g:2244:7: ( (lv_op_3_0= '=' ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2245:8: (lv_op_3_0= '=' )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2245:8: (lv_op_3_0= '=' )
                            // InternalParameterizedExpressionsTestLanguage.g:2246:9: lv_op_3_0= '='
                            {
                            lv_op_3_0=(Token)match(input,30,FollowSets000.FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									newLeafNode(lv_op_3_0, grammarAccess.getAssignmentExpressionAccess().getOpEqualsSignKeyword_1_1_0_0_1_0());
                              								
                            }
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElement(grammarAccess.getAssignmentExpressionRule());
                              									}
                              									setWithLastConsumed(current, "op", lv_op_3_0, "=");
                              								
                            }

                            }


                            }


                            }


                            }

                            // InternalParameterizedExpressionsTestLanguage.g:2260:5: ( (lv_rhs_4_0= norm2_AssignmentExpression ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2261:6: (lv_rhs_4_0= norm2_AssignmentExpression )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2261:6: (lv_rhs_4_0= norm2_AssignmentExpression )
                            // InternalParameterizedExpressionsTestLanguage.g:2262:7: lv_rhs_4_0= norm2_AssignmentExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRhsAssignmentExpressionParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_rhs_4_0=norm2_AssignmentExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                              							}
                              							set(
                              								current,
                              								"rhs",
                              								lv_rhs_4_0,
                              								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
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
    // $ANTLR end "norm2_AssignmentExpression"


    // $ANTLR start "norm3_AssignmentExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2286:1: norm3_AssignmentExpression returns [EObject current=null] : (this_YieldExpression_0= norm1_YieldExpression | (this_RelationalExpression_1= norm3_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )? ) ) ;
    public final EObject norm3_AssignmentExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_3_0=null;
        EObject this_YieldExpression_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject lv_rhs_4_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2287:1: ( (this_YieldExpression_0= norm1_YieldExpression | (this_RelationalExpression_1= norm3_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )? ) ) )
            // InternalParameterizedExpressionsTestLanguage.g:2288:2: (this_YieldExpression_0= norm1_YieldExpression | (this_RelationalExpression_1= norm3_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )? ) )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2288:2: (this_YieldExpression_0= norm1_YieldExpression | (this_RelationalExpression_1= norm3_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
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
                    // InternalParameterizedExpressionsTestLanguage.g:2289:3: this_YieldExpression_0= norm1_YieldExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getYieldExpressionParserRuleCall_0_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_YieldExpression_0=norm1_YieldExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YieldExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalParameterizedExpressionsTestLanguage.g:2298:3: (this_RelationalExpression_1= norm3_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )? )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2298:3: (this_RelationalExpression_1= norm3_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )? )
                    // InternalParameterizedExpressionsTestLanguage.g:2299:4: this_RelationalExpression_1= norm3_RelationalExpression ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRelationalExpressionParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_22);
                    this_RelationalExpression_1=norm3_RelationalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RelationalExpression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalParameterizedExpressionsTestLanguage.g:2307:4: ( ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==30) && (synpred36_InternalParameterizedExpressionsTestLanguage())) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalParameterizedExpressionsTestLanguage.g:2308:5: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) ) ( (lv_rhs_4_0= norm3_AssignmentExpression ) )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2308:5: ( ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2309:6: ( ( () ( ( '=' ) ) ) )=> ( () ( (lv_op_3_0= '=' ) ) )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2319:6: ( () ( (lv_op_3_0= '=' ) ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2320:7: () ( (lv_op_3_0= '=' ) )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2320:7: ()
                            // InternalParameterizedExpressionsTestLanguage.g:2321:8: 
                            {
                            if ( state.backtracking==0 ) {

                              								current = forceCreateModelElementAndSet(
                              									grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionLhsAction_1_1_0_0_0(),
                              									current);
                              							
                            }

                            }

                            // InternalParameterizedExpressionsTestLanguage.g:2327:7: ( (lv_op_3_0= '=' ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2328:8: (lv_op_3_0= '=' )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2328:8: (lv_op_3_0= '=' )
                            // InternalParameterizedExpressionsTestLanguage.g:2329:9: lv_op_3_0= '='
                            {
                            lv_op_3_0=(Token)match(input,30,FollowSets000.FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									newLeafNode(lv_op_3_0, grammarAccess.getAssignmentExpressionAccess().getOpEqualsSignKeyword_1_1_0_0_1_0());
                              								
                            }
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElement(grammarAccess.getAssignmentExpressionRule());
                              									}
                              									setWithLastConsumed(current, "op", lv_op_3_0, "=");
                              								
                            }

                            }


                            }


                            }


                            }

                            // InternalParameterizedExpressionsTestLanguage.g:2343:5: ( (lv_rhs_4_0= norm3_AssignmentExpression ) )
                            // InternalParameterizedExpressionsTestLanguage.g:2344:6: (lv_rhs_4_0= norm3_AssignmentExpression )
                            {
                            // InternalParameterizedExpressionsTestLanguage.g:2344:6: (lv_rhs_4_0= norm3_AssignmentExpression )
                            // InternalParameterizedExpressionsTestLanguage.g:2345:7: lv_rhs_4_0= norm3_AssignmentExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getAssignmentExpressionAccess().getRhsAssignmentExpressionParserRuleCall_1_1_1_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_rhs_4_0=norm3_AssignmentExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getAssignmentExpressionRule());
                              							}
                              							set(
                              								current,
                              								"rhs",
                              								lv_rhs_4_0,
                              								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
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
    // $ANTLR end "norm3_AssignmentExpression"


    // $ANTLR start "entryRuleYieldExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2368:1: entryRuleYieldExpression returns [EObject current=null] : iv_ruleYieldExpression= ruleYieldExpression EOF ;
    public final EObject entryRuleYieldExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYieldExpression = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2368:56: (iv_ruleYieldExpression= ruleYieldExpression EOF )
            // InternalParameterizedExpressionsTestLanguage.g:2369:2: iv_ruleYieldExpression= ruleYieldExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYieldExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleYieldExpression=ruleYieldExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYieldExpression; 
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
    // $ANTLR end "entryRuleYieldExpression"


    // $ANTLR start "ruleYieldExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2375:1: ruleYieldExpression returns [EObject current=null] : ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm2_AssignmentExpression ) )? ) ;
    public final EObject ruleYieldExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_many_2_0=null;
        EObject lv_expression_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2376:1: ( ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm2_AssignmentExpression ) )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:2377:2: ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm2_AssignmentExpression ) )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2377:2: ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm2_AssignmentExpression ) )? )
            // InternalParameterizedExpressionsTestLanguage.g:2378:3: () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm2_AssignmentExpression ) )?
            {
            // InternalParameterizedExpressionsTestLanguage.g:2378:3: ()
            // InternalParameterizedExpressionsTestLanguage.g:2379:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYieldExpressionAccess().getYieldExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYieldExpressionAccess().getYieldKeyword_1());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:2389:3: ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==13) && (synpred37_InternalParameterizedExpressionsTestLanguage())) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2390:4: ( ( '*' ) )=> (lv_many_2_0= '*' )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2394:4: (lv_many_2_0= '*' )
                    // InternalParameterizedExpressionsTestLanguage.g:2395:5: lv_many_2_0= '*'
                    {
                    lv_many_2_0=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_many_2_0, grammarAccess.getYieldExpressionAccess().getManyAsteriskKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYieldExpressionRule());
                      					}
                      					setWithLastConsumed(current, "many", lv_many_2_0 != null, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalParameterizedExpressionsTestLanguage.g:2407:3: ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm2_AssignmentExpression ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==31) && (synpred38_InternalParameterizedExpressionsTestLanguage())) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) && (synpred38_InternalParameterizedExpressionsTestLanguage())) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2408:4: ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm2_AssignmentExpression )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2409:4: (lv_expression_3_0= norm2_AssignmentExpression )
                    // InternalParameterizedExpressionsTestLanguage.g:2410:5: lv_expression_3_0= norm2_AssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYieldExpressionAccess().getExpressionAssignmentExpressionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_3_0=norm2_AssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYieldExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_3_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "ruleYieldExpression"


    // $ANTLR start "norm1_YieldExpression"
    // InternalParameterizedExpressionsTestLanguage.g:2432:1: norm1_YieldExpression returns [EObject current=null] : ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm3_AssignmentExpression ) )? ) ;
    public final EObject norm1_YieldExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_many_2_0=null;
        EObject lv_expression_3_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2433:1: ( ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm3_AssignmentExpression ) )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:2434:2: ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm3_AssignmentExpression ) )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2434:2: ( () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm3_AssignmentExpression ) )? )
            // InternalParameterizedExpressionsTestLanguage.g:2435:3: () otherlv_1= 'yield' ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )? ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm3_AssignmentExpression ) )?
            {
            // InternalParameterizedExpressionsTestLanguage.g:2435:3: ()
            // InternalParameterizedExpressionsTestLanguage.g:2436:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYieldExpressionAccess().getYieldExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYieldExpressionAccess().getYieldKeyword_1());
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:2446:3: ( ( ( '*' ) )=> (lv_many_2_0= '*' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==13) && (synpred39_InternalParameterizedExpressionsTestLanguage())) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2447:4: ( ( '*' ) )=> (lv_many_2_0= '*' )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2451:4: (lv_many_2_0= '*' )
                    // InternalParameterizedExpressionsTestLanguage.g:2452:5: lv_many_2_0= '*'
                    {
                    lv_many_2_0=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_many_2_0, grammarAccess.getYieldExpressionAccess().getManyAsteriskKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYieldExpressionRule());
                      					}
                      					setWithLastConsumed(current, "many", lv_many_2_0 != null, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalParameterizedExpressionsTestLanguage.g:2464:3: ( ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm3_AssignmentExpression ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==31) && (synpred40_InternalParameterizedExpressionsTestLanguage())) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) && (synpred40_InternalParameterizedExpressionsTestLanguage())) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2465:4: ( 'yield' | RULE_ID )=> (lv_expression_3_0= norm3_AssignmentExpression )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2466:4: (lv_expression_3_0= norm3_AssignmentExpression )
                    // InternalParameterizedExpressionsTestLanguage.g:2467:5: lv_expression_3_0= norm3_AssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYieldExpressionAccess().getExpressionAssignmentExpressionParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_expression_3_0=norm3_AssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYieldExpressionRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_3_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
                      					afterParserOrEnumRuleCall();
                      				
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
    // $ANTLR end "norm1_YieldExpression"


    // $ANTLR start "norm1_Expression"
    // InternalParameterizedExpressionsTestLanguage.g:2489:1: norm1_Expression returns [EObject current=null] : (this_AssignmentExpression_0= norm1_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm1_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )* )? ) ;
    public final EObject norm1_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AssignmentExpression_0 = null;

        EObject lv_exprs_3_0 = null;

        EObject lv_exprs_5_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2490:1: ( (this_AssignmentExpression_0= norm1_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm1_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )* )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:2491:2: (this_AssignmentExpression_0= norm1_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm1_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )* )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2491:2: (this_AssignmentExpression_0= norm1_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm1_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )* )? )
            // InternalParameterizedExpressionsTestLanguage.g:2492:3: this_AssignmentExpression_0= norm1_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm1_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_AssignmentExpression_0=norm1_AssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AssignmentExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:2500:3: ( () otherlv_2= ',' ( (lv_exprs_3_0= norm1_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2501:4: () otherlv_2= ',' ( (lv_exprs_3_0= norm1_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )*
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2501:4: ()
                    // InternalParameterizedExpressionsTestLanguage.g:2502:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getExpressionAccess().getCommaExpressionExprsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getCommaKeyword_1_1());
                      			
                    }
                    // InternalParameterizedExpressionsTestLanguage.g:2512:4: ( (lv_exprs_3_0= norm1_AssignmentExpression ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2513:5: (lv_exprs_3_0= norm1_AssignmentExpression )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2513:5: (lv_exprs_3_0= norm1_AssignmentExpression )
                    // InternalParameterizedExpressionsTestLanguage.g:2514:6: lv_exprs_3_0= norm1_AssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getExprsAssignmentExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_exprs_3_0=norm1_AssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						add(
                      							current,
                      							"exprs",
                      							lv_exprs_3_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalParameterizedExpressionsTestLanguage.g:2531:4: (otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==32) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalParameterizedExpressionsTestLanguage.g:2532:5: otherlv_4= ',' ( (lv_exprs_5_0= norm1_AssignmentExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalParameterizedExpressionsTestLanguage.g:2536:5: ( (lv_exprs_5_0= norm1_AssignmentExpression ) )
                    	    // InternalParameterizedExpressionsTestLanguage.g:2537:6: (lv_exprs_5_0= norm1_AssignmentExpression )
                    	    {
                    	    // InternalParameterizedExpressionsTestLanguage.g:2537:6: (lv_exprs_5_0= norm1_AssignmentExpression )
                    	    // InternalParameterizedExpressionsTestLanguage.g:2538:7: lv_exprs_5_0= norm1_AssignmentExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getExprsAssignmentExpressionParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_exprs_5_0=norm1_AssignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_5_0,
                    	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


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
    // $ANTLR end "norm1_Expression"


    // $ANTLR start "norm3_Expression"
    // InternalParameterizedExpressionsTestLanguage.g:2562:1: norm3_Expression returns [EObject current=null] : (this_AssignmentExpression_0= norm3_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm3_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )* )? ) ;
    public final EObject norm3_Expression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_AssignmentExpression_0 = null;

        EObject lv_exprs_3_0 = null;

        EObject lv_exprs_5_0 = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2563:1: ( (this_AssignmentExpression_0= norm3_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm3_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )* )? ) )
            // InternalParameterizedExpressionsTestLanguage.g:2564:2: (this_AssignmentExpression_0= norm3_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm3_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )* )? )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2564:2: (this_AssignmentExpression_0= norm3_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm3_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )* )? )
            // InternalParameterizedExpressionsTestLanguage.g:2565:3: this_AssignmentExpression_0= norm3_AssignmentExpression ( () otherlv_2= ',' ( (lv_exprs_3_0= norm3_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )* )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentExpressionParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_AssignmentExpression_0=norm3_AssignmentExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AssignmentExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalParameterizedExpressionsTestLanguage.g:2573:3: ( () otherlv_2= ',' ( (lv_exprs_3_0= norm3_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2574:4: () otherlv_2= ',' ( (lv_exprs_3_0= norm3_AssignmentExpression ) ) (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )*
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2574:4: ()
                    // InternalParameterizedExpressionsTestLanguage.g:2575:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndAdd(
                      						grammarAccess.getExpressionAccess().getCommaExpressionExprsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getCommaKeyword_1_1());
                      			
                    }
                    // InternalParameterizedExpressionsTestLanguage.g:2585:4: ( (lv_exprs_3_0= norm3_AssignmentExpression ) )
                    // InternalParameterizedExpressionsTestLanguage.g:2586:5: (lv_exprs_3_0= norm3_AssignmentExpression )
                    {
                    // InternalParameterizedExpressionsTestLanguage.g:2586:5: (lv_exprs_3_0= norm3_AssignmentExpression )
                    // InternalParameterizedExpressionsTestLanguage.g:2587:6: lv_exprs_3_0= norm3_AssignmentExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionAccess().getExprsAssignmentExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_exprs_3_0=norm3_AssignmentExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionRule());
                      						}
                      						add(
                      							current,
                      							"exprs",
                      							lv_exprs_3_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalParameterizedExpressionsTestLanguage.g:2604:4: (otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==32) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalParameterizedExpressionsTestLanguage.g:2605:5: otherlv_4= ',' ( (lv_exprs_5_0= norm3_AssignmentExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getCommaKeyword_1_3_0());
                    	      				
                    	    }
                    	    // InternalParameterizedExpressionsTestLanguage.g:2609:5: ( (lv_exprs_5_0= norm3_AssignmentExpression ) )
                    	    // InternalParameterizedExpressionsTestLanguage.g:2610:6: (lv_exprs_5_0= norm3_AssignmentExpression )
                    	    {
                    	    // InternalParameterizedExpressionsTestLanguage.g:2610:6: (lv_exprs_5_0= norm3_AssignmentExpression )
                    	    // InternalParameterizedExpressionsTestLanguage.g:2611:7: lv_exprs_5_0= norm3_AssignmentExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getExpressionAccess().getExprsAssignmentExpressionParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_exprs_5_0=norm3_AssignmentExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_5_0,
                    	      								"org.eclipse.xtext.ui.tests.editor.contentassist.ParameterizedExpressionsTestLanguage.AssignmentExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


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
    // $ANTLR end "norm3_Expression"


    // $ANTLR start "entryRuleIdentifier"
    // InternalParameterizedExpressionsTestLanguage.g:2634:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalParameterizedExpressionsTestLanguage.g:2634:50: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalParameterizedExpressionsTestLanguage.g:2635:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalParameterizedExpressionsTestLanguage.g:2641:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'yield' ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

        try {
            // InternalParameterizedExpressionsTestLanguage.g:2642:1: ( (this_ID_0= RULE_ID | kw= 'yield' ) )
            // InternalParameterizedExpressionsTestLanguage.g:2643:2: (this_ID_0= RULE_ID | kw= 'yield' )
            {
            // InternalParameterizedExpressionsTestLanguage.g:2643:2: (this_ID_0= RULE_ID | kw= 'yield' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            else if ( (LA43_0==31) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalParameterizedExpressionsTestLanguage.g:2644:3: this_ID_0= RULE_ID
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
                    // InternalParameterizedExpressionsTestLanguage.g:2652:3: kw= 'yield'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdentifierAccess().getYieldKeyword_1_0());
                      		
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


    // $ANTLR start "norm1_Identifier"
    // InternalParameterizedExpressionsTestLanguage.g:2662:1: norm1_Identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken norm1_Identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

        try {
            // InternalParameterizedExpressionsTestLanguage.g:2663:1: (this_ID_0= RULE_ID )
            // InternalParameterizedExpressionsTestLanguage.g:2664:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0());
              	
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
    // $ANTLR end "norm1_Identifier"

    // $ANTLR start synpred1_InternalParameterizedExpressionsTestLanguage
    public final void synpred1_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:75:4: ( ( () '{' ) )
        // InternalParameterizedExpressionsTestLanguage.g:75:5: ( () '{' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:75:5: ( () '{' )
        // InternalParameterizedExpressionsTestLanguage.g:76:5: () '{'
        {
        // InternalParameterizedExpressionsTestLanguage.g:76:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:77:5: 
        {
        }

        match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred2_InternalParameterizedExpressionsTestLanguage
    public final void synpred2_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:92:4: ( ( () 'function' ) )
        // InternalParameterizedExpressionsTestLanguage.g:92:5: ( () 'function' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:92:5: ( () 'function' )
        // InternalParameterizedExpressionsTestLanguage.g:93:5: () 'function'
        {
        // InternalParameterizedExpressionsTestLanguage.g:93:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:94:5: 
        {
        }

        match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred3_InternalParameterizedExpressionsTestLanguage
    public final void synpred3_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:109:4: ( ( ( ( ruleIdentifier ) ) ':' ) )
        // InternalParameterizedExpressionsTestLanguage.g:109:5: ( ( ( ruleIdentifier ) ) ':' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:109:5: ( ( ( ruleIdentifier ) ) ':' )
        // InternalParameterizedExpressionsTestLanguage.g:110:5: ( ( ruleIdentifier ) ) ':'
        {
        // InternalParameterizedExpressionsTestLanguage.g:110:5: ( ( ruleIdentifier ) )
        // InternalParameterizedExpressionsTestLanguage.g:111:6: ( ruleIdentifier )
        {
        // InternalParameterizedExpressionsTestLanguage.g:111:6: ( ruleIdentifier )
        // InternalParameterizedExpressionsTestLanguage.g:112:7: ruleIdentifier
        {
        pushFollow(FollowSets000.FOLLOW_13);
        ruleIdentifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred4_InternalParameterizedExpressionsTestLanguage
    public final void synpred4_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:145:4: ( ( () '{' ) )
        // InternalParameterizedExpressionsTestLanguage.g:145:5: ( () '{' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:145:5: ( () '{' )
        // InternalParameterizedExpressionsTestLanguage.g:146:5: () '{'
        {
        // InternalParameterizedExpressionsTestLanguage.g:146:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:147:5: 
        {
        }

        match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred5_InternalParameterizedExpressionsTestLanguage
    public final void synpred5_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:162:4: ( ( () 'function' ) )
        // InternalParameterizedExpressionsTestLanguage.g:162:5: ( () 'function' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:162:5: ( () 'function' )
        // InternalParameterizedExpressionsTestLanguage.g:163:5: () 'function'
        {
        // InternalParameterizedExpressionsTestLanguage.g:163:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:164:5: 
        {
        }

        match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred6_InternalParameterizedExpressionsTestLanguage
    public final void synpred6_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:179:4: ( ( ( ( norm1_Identifier ) ) ':' ) )
        // InternalParameterizedExpressionsTestLanguage.g:179:5: ( ( ( norm1_Identifier ) ) ':' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:179:5: ( ( ( norm1_Identifier ) ) ':' )
        // InternalParameterizedExpressionsTestLanguage.g:180:5: ( ( norm1_Identifier ) ) ':'
        {
        // InternalParameterizedExpressionsTestLanguage.g:180:5: ( ( norm1_Identifier ) )
        // InternalParameterizedExpressionsTestLanguage.g:181:6: ( norm1_Identifier )
        {
        // InternalParameterizedExpressionsTestLanguage.g:181:6: ( norm1_Identifier )
        // InternalParameterizedExpressionsTestLanguage.g:182:7: norm1_Identifier
        {
        pushFollow(FollowSets000.FOLLOW_13);
        norm1_Identifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,18,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred9_InternalParameterizedExpressionsTestLanguage
    public final void synpred9_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:252:4: ( ';' )
        // InternalParameterizedExpressionsTestLanguage.g:252:5: ';'
        {
        match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred12_InternalParameterizedExpressionsTestLanguage
    public final void synpred12_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:298:4: ( ';' )
        // InternalParameterizedExpressionsTestLanguage.g:298:5: ';'
        {
        match(input,11,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred13_InternalParameterizedExpressionsTestLanguage
    public final void synpred13_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:606:3: ( ( () '{' ) )
        // InternalParameterizedExpressionsTestLanguage.g:606:4: ( () '{' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:606:4: ( () '{' )
        // InternalParameterizedExpressionsTestLanguage.g:607:4: () '{'
        {
        // InternalParameterizedExpressionsTestLanguage.g:607:4: ()
        // InternalParameterizedExpressionsTestLanguage.g:608:4: 
        {
        }

        match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred14_InternalParameterizedExpressionsTestLanguage
    public final void synpred14_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:637:3: ( ( () '{' ) )
        // InternalParameterizedExpressionsTestLanguage.g:637:4: ( () '{' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:637:4: ( () '{' )
        // InternalParameterizedExpressionsTestLanguage.g:638:4: () '{'
        {
        // InternalParameterizedExpressionsTestLanguage.g:638:4: ()
        // InternalParameterizedExpressionsTestLanguage.g:639:4: 
        {
        }

        match(input,16,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred19_InternalParameterizedExpressionsTestLanguage
    public final void synpred19_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:847:4: ( ( () 'function' ) )
        // InternalParameterizedExpressionsTestLanguage.g:847:5: ( () 'function' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:847:5: ( () 'function' )
        // InternalParameterizedExpressionsTestLanguage.g:848:5: () 'function'
        {
        // InternalParameterizedExpressionsTestLanguage.g:848:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:849:5: 
        {
        }

        match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred20_InternalParameterizedExpressionsTestLanguage
    public final void synpred20_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:880:4: ( ( () 'function' ) )
        // InternalParameterizedExpressionsTestLanguage.g:880:5: ( () 'function' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:880:5: ( () 'function' )
        // InternalParameterizedExpressionsTestLanguage.g:881:5: () 'function'
        {
        // InternalParameterizedExpressionsTestLanguage.g:881:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:882:5: 
        {
        }

        match(input,12,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred23_InternalParameterizedExpressionsTestLanguage
    public final void synpred23_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:1473:4: ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1473:5: ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1473:5: ( () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1474:5: () ( ( ( '>>' | '<<' ) ) ) ( ( ruleMemberExpression ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1474:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:1475:5: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:1476:5: ( ( ( '>>' | '<<' ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1477:6: ( ( '>>' | '<<' ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1477:6: ( ( '>>' | '<<' ) )
        // InternalParameterizedExpressionsTestLanguage.g:1478:7: ( '>>' | '<<' )
        {
        if ( (input.LA(1)>=22 && input.LA(1)<=23) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }

        // InternalParameterizedExpressionsTestLanguage.g:1485:5: ( ( ruleMemberExpression ) )
        // InternalParameterizedExpressionsTestLanguage.g:1486:6: ( ruleMemberExpression )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1486:6: ( ruleMemberExpression )
        // InternalParameterizedExpressionsTestLanguage.g:1487:7: ruleMemberExpression
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleMemberExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred24_InternalParameterizedExpressionsTestLanguage
    public final void synpred24_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:1565:4: ( ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1565:5: ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1565:5: ( () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1566:5: () ( ( ( '>>' | '<<' ) ) ) ( ( norm1_MemberExpression ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1566:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:1567:5: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:1568:5: ( ( ( '>>' | '<<' ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1569:6: ( ( '>>' | '<<' ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1569:6: ( ( '>>' | '<<' ) )
        // InternalParameterizedExpressionsTestLanguage.g:1570:7: ( '>>' | '<<' )
        {
        if ( (input.LA(1)>=22 && input.LA(1)<=23) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }

        // InternalParameterizedExpressionsTestLanguage.g:1577:5: ( ( norm1_MemberExpression ) )
        // InternalParameterizedExpressionsTestLanguage.g:1578:6: ( norm1_MemberExpression )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1578:6: ( norm1_MemberExpression )
        // InternalParameterizedExpressionsTestLanguage.g:1579:7: norm1_MemberExpression
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm1_MemberExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred25_InternalParameterizedExpressionsTestLanguage
    public final void synpred25_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:1663:4: ( ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1663:5: ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1663:5: ( () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID ) )
        // InternalParameterizedExpressionsTestLanguage.g:1664:5: () ( ( ruleRelationalOperator ) ) ( 'yield' | RULE_ID )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1664:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:1665:5: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:1666:5: ( ( ruleRelationalOperator ) )
        // InternalParameterizedExpressionsTestLanguage.g:1667:6: ( ruleRelationalOperator )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1667:6: ( ruleRelationalOperator )
        // InternalParameterizedExpressionsTestLanguage.g:1668:7: ruleRelationalOperator
        {
        pushFollow(FollowSets000.FOLLOW_17);
        ruleRelationalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        if ( input.LA(1)==RULE_ID||input.LA(1)==31 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred25_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred27_InternalParameterizedExpressionsTestLanguage
    public final void synpred27_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:1744:4: ( ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:1744:5: ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1744:5: ( () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID ) )
        // InternalParameterizedExpressionsTestLanguage.g:1745:5: () ( ( norm1_RelationalOperator ) ) ( 'yield' | RULE_ID )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1745:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:1746:5: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:1747:5: ( ( norm1_RelationalOperator ) )
        // InternalParameterizedExpressionsTestLanguage.g:1748:6: ( norm1_RelationalOperator )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1748:6: ( norm1_RelationalOperator )
        // InternalParameterizedExpressionsTestLanguage.g:1749:7: norm1_RelationalOperator
        {
        pushFollow(FollowSets000.FOLLOW_17);
        norm1_RelationalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        if ( input.LA(1)==RULE_ID||input.LA(1)==31 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred27_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred29_InternalParameterizedExpressionsTestLanguage
    public final void synpred29_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:1825:4: ( ( () ( ( ruleRelationalOperator ) ) RULE_ID ) )
        // InternalParameterizedExpressionsTestLanguage.g:1825:5: ( () ( ( ruleRelationalOperator ) ) RULE_ID )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1825:5: ( () ( ( ruleRelationalOperator ) ) RULE_ID )
        // InternalParameterizedExpressionsTestLanguage.g:1826:5: () ( ( ruleRelationalOperator ) ) RULE_ID
        {
        // InternalParameterizedExpressionsTestLanguage.g:1826:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:1827:5: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:1828:5: ( ( ruleRelationalOperator ) )
        // InternalParameterizedExpressionsTestLanguage.g:1829:6: ( ruleRelationalOperator )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1829:6: ( ruleRelationalOperator )
        // InternalParameterizedExpressionsTestLanguage.g:1830:7: ruleRelationalOperator
        {
        pushFollow(FollowSets000.FOLLOW_18);
        ruleRelationalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred31_InternalParameterizedExpressionsTestLanguage
    public final void synpred31_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:1902:4: ( ( () ( ( norm1_RelationalOperator ) ) RULE_ID ) )
        // InternalParameterizedExpressionsTestLanguage.g:1902:5: ( () ( ( norm1_RelationalOperator ) ) RULE_ID )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1902:5: ( () ( ( norm1_RelationalOperator ) ) RULE_ID )
        // InternalParameterizedExpressionsTestLanguage.g:1903:5: () ( ( norm1_RelationalOperator ) ) RULE_ID
        {
        // InternalParameterizedExpressionsTestLanguage.g:1903:5: ()
        // InternalParameterizedExpressionsTestLanguage.g:1904:5: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:1905:5: ( ( norm1_RelationalOperator ) )
        // InternalParameterizedExpressionsTestLanguage.g:1906:6: ( norm1_RelationalOperator )
        {
        // InternalParameterizedExpressionsTestLanguage.g:1906:6: ( norm1_RelationalOperator )
        // InternalParameterizedExpressionsTestLanguage.g:1907:7: norm1_RelationalOperator
        {
        pushFollow(FollowSets000.FOLLOW_18);
        norm1_RelationalOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred31_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred33_InternalParameterizedExpressionsTestLanguage
    public final void synpred33_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2072:5: ( ( () ( ( '=' ) ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2072:6: ( () ( ( '=' ) ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2072:6: ( () ( ( '=' ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2073:6: () ( ( '=' ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2073:6: ()
        // InternalParameterizedExpressionsTestLanguage.g:2074:6: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:2075:6: ( ( '=' ) )
        // InternalParameterizedExpressionsTestLanguage.g:2076:7: ( '=' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2076:7: ( '=' )
        // InternalParameterizedExpressionsTestLanguage.g:2077:8: '='
        {
        match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred33_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred34_InternalParameterizedExpressionsTestLanguage
    public final void synpred34_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2144:5: ( ( () ( ( '=' ) ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2144:6: ( () ( ( '=' ) ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2144:6: ( () ( ( '=' ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2145:6: () ( ( '=' ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2145:6: ()
        // InternalParameterizedExpressionsTestLanguage.g:2146:6: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:2147:6: ( ( '=' ) )
        // InternalParameterizedExpressionsTestLanguage.g:2148:7: ( '=' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2148:7: ( '=' )
        // InternalParameterizedExpressionsTestLanguage.g:2149:8: '='
        {
        match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred34_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred35_InternalParameterizedExpressionsTestLanguage
    public final void synpred35_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2226:6: ( ( () ( ( '=' ) ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2226:7: ( () ( ( '=' ) ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2226:7: ( () ( ( '=' ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2227:7: () ( ( '=' ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2227:7: ()
        // InternalParameterizedExpressionsTestLanguage.g:2228:7: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:2229:7: ( ( '=' ) )
        // InternalParameterizedExpressionsTestLanguage.g:2230:8: ( '=' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2230:8: ( '=' )
        // InternalParameterizedExpressionsTestLanguage.g:2231:9: '='
        {
        match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred35_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred36_InternalParameterizedExpressionsTestLanguage
    public final void synpred36_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2309:6: ( ( () ( ( '=' ) ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2309:7: ( () ( ( '=' ) ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2309:7: ( () ( ( '=' ) ) )
        // InternalParameterizedExpressionsTestLanguage.g:2310:7: () ( ( '=' ) )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2310:7: ()
        // InternalParameterizedExpressionsTestLanguage.g:2311:7: 
        {
        }

        // InternalParameterizedExpressionsTestLanguage.g:2312:7: ( ( '=' ) )
        // InternalParameterizedExpressionsTestLanguage.g:2313:8: ( '=' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2313:8: ( '=' )
        // InternalParameterizedExpressionsTestLanguage.g:2314:9: '='
        {
        match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred36_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred37_InternalParameterizedExpressionsTestLanguage
    public final void synpred37_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2390:4: ( ( '*' ) )
        // InternalParameterizedExpressionsTestLanguage.g:2390:5: ( '*' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2390:5: ( '*' )
        // InternalParameterizedExpressionsTestLanguage.g:2391:5: '*'
        {
        match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred37_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred38_InternalParameterizedExpressionsTestLanguage
    public final void synpred38_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2408:4: ( 'yield' | RULE_ID )
        // InternalParameterizedExpressionsTestLanguage.g:
        {
        if ( input.LA(1)==RULE_ID||input.LA(1)==31 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred38_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred39_InternalParameterizedExpressionsTestLanguage
    public final void synpred39_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2447:4: ( ( '*' ) )
        // InternalParameterizedExpressionsTestLanguage.g:2447:5: ( '*' )
        {
        // InternalParameterizedExpressionsTestLanguage.g:2447:5: ( '*' )
        // InternalParameterizedExpressionsTestLanguage.g:2448:5: '*'
        {
        match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred39_InternalParameterizedExpressionsTestLanguage

    // $ANTLR start synpred40_InternalParameterizedExpressionsTestLanguage
    public final void synpred40_InternalParameterizedExpressionsTestLanguage_fragment() throws RecognitionException {   
        // InternalParameterizedExpressionsTestLanguage.g:2465:4: ( 'yield' | RULE_ID )
        // InternalParameterizedExpressionsTestLanguage.g:
        {
        if ( input.LA(1)==RULE_ID||input.LA(1)==31 ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred40_InternalParameterizedExpressionsTestLanguage

    // Delegated rules

    public final boolean synpred3_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalParameterizedExpressionsTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalParameterizedExpressionsTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\2\4\1\uffff\1\4\2\16\1\17\2\16\1\17\2\0\1\uffff";
    static final String dfa_3s = "\2\37\1\uffff\1\37\2\16\1\17\2\16\1\17\2\0\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\11\uffff\1\1";
    static final String dfa_5s = "\12\uffff\1\1\1\0\1\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\7\uffff\1\1\3\uffff\1\2\16\uffff\1\2",
            "\1\4\10\uffff\1\3\1\6\20\uffff\1\5",
            "",
            "\1\7\11\uffff\1\11\20\uffff\1\10",
            "\1\6",
            "\1\6",
            "\1\12",
            "\1\11",
            "\1\11",
            "\1\13",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "845:2: ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= ruleFunctionDeclaration ) | this_RootStatement_1= ruleRootStatement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_11 = input.LA(1);

                         
                        int index15_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalParameterizedExpressionsTestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_10 = input.LA(1);

                         
                        int index15_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalParameterizedExpressionsTestLanguage()) ) {s = 12;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index15_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\2\4\1\uffff\1\4\1\16\1\17\1\16\1\17\2\0\1\uffff";
    static final String dfa_9s = "\1\37\1\16\1\uffff\2\16\1\17\1\16\1\17\2\0\1\uffff";
    static final String dfa_10s = "\2\uffff\1\2\7\uffff\1\1";
    static final String dfa_11s = "\10\uffff\1\0\1\1\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\7\uffff\1\1\3\uffff\1\2\16\uffff\1\2",
            "\1\4\10\uffff\1\3\1\5",
            "",
            "\1\6\11\uffff\1\7",
            "\1\5",
            "\1\10",
            "\1\7",
            "\1\11",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "878:2: ( ( ( ( () 'function' ) )=>this_FunctionDeclaration_0= norm1_FunctionDeclaration ) | this_RootStatement_1= norm1_RootStatement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_8 = input.LA(1);

                         
                        int index16_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalParameterizedExpressionsTestLanguage()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_9 = input.LA(1);

                         
                        int index16_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalParameterizedExpressionsTestLanguage()) ) {s = 10;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index16_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080006010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080004010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080031010L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080011010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000280002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001F000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003F000002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080013012L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080011012L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    }


}