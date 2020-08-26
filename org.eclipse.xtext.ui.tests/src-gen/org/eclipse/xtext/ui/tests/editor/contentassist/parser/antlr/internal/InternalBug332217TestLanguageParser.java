package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug332217TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBug332217TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[]'", "'.'", "'('", "')'", "'replace('", "','", "'urlconform('", "'['", "']'", "'split('", "'tableview'", "'{'", "'title:'", "'titleImage:'", "'style:'", "'}'", "'section'", "'cell'", "'text:'", "'details:'", "'image:'", "'action:'", "'accessory:'", "'for'", "'in'", "':'", "'@selector'", "'Plain'", "'Grouped'", "'Default'", "'Value1'", "'Value2'", "'Subtitle'", "'None'", "'Link'", "'Detail'", "'Check'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalBug332217TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug332217TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug332217TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug332217TestLanguage.g"; }



     	private Bug332217TestLanguageGrammarAccess grammarAccess;

        public InternalBug332217TestLanguageParser(TokenStream input, Bug332217TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Bug332217TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBug332217TestLanguage.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBug332217TestLanguage.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalBug332217TestLanguage.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBug332217TestLanguage.g:72:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleTableView ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


        try {
            // InternalBug332217TestLanguage.g:73:1: ( ( (lv_elements_0_0= ruleTableView ) )* )
            // InternalBug332217TestLanguage.g:74:2: ( (lv_elements_0_0= ruleTableView ) )*
            {
            // InternalBug332217TestLanguage.g:74:2: ( (lv_elements_0_0= ruleTableView ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBug332217TestLanguage.g:75:3: (lv_elements_0_0= ruleTableView )
            	    {
            	    // InternalBug332217TestLanguage.g:75:3: (lv_elements_0_0= ruleTableView )
            	    // InternalBug332217TestLanguage.g:76:4: lv_elements_0_0= ruleTableView
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsTableViewParserRuleCall_0());
            	    			
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_elements_0_0=ruleTableView();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.TableView");
            	    				afterParserOrEnumRuleCall();
            	    			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDescription"
    // InternalBug332217TestLanguage.g:96:1: entryRuleTypeDescription returns [EObject current=null] : iv_ruleTypeDescription= ruleTypeDescription EOF ;
    public final EObject entryRuleTypeDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDescription = null;


        try {
            // InternalBug332217TestLanguage.g:96:56: (iv_ruleTypeDescription= ruleTypeDescription EOF )
            // InternalBug332217TestLanguage.g:97:2: iv_ruleTypeDescription= ruleTypeDescription EOF
            {
             newCompositeNode(grammarAccess.getTypeDescriptionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeDescription=ruleTypeDescription();

            state._fsp--;

             current =iv_ruleTypeDescription; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeDescription"


    // $ANTLR start "ruleTypeDescription"
    // InternalBug332217TestLanguage.g:103:1: ruleTypeDescription returns [EObject current=null] : ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) ;
    public final EObject ruleTypeDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_many_1_0=null;

        try {
            // InternalBug332217TestLanguage.g:104:1: ( ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? ) )
            // InternalBug332217TestLanguage.g:105:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            {
            // InternalBug332217TestLanguage.g:105:2: ( ( (lv_type_0_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )? )
            // InternalBug332217TestLanguage.g:106:3: ( (lv_type_0_0= RULE_ID ) ) ( (lv_many_1_0= '[]' ) )?
            {
            // InternalBug332217TestLanguage.g:106:3: ( (lv_type_0_0= RULE_ID ) )
            // InternalBug332217TestLanguage.g:107:4: (lv_type_0_0= RULE_ID )
            {
            // InternalBug332217TestLanguage.g:107:4: (lv_type_0_0= RULE_ID )
            // InternalBug332217TestLanguage.g:108:5: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_4); 

            					newLeafNode(lv_type_0_0, grammarAccess.getTypeDescriptionAccess().getTypeIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBug332217TestLanguage.g:124:3: ( (lv_many_1_0= '[]' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBug332217TestLanguage.g:125:4: (lv_many_1_0= '[]' )
                    {
                    // InternalBug332217TestLanguage.g:125:4: (lv_many_1_0= '[]' )
                    // InternalBug332217TestLanguage.g:126:5: lv_many_1_0= '[]'
                    {
                    lv_many_1_0=(Token)match(input,11,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_many_1_0, grammarAccess.getTypeDescriptionAccess().getManyLeftSquareBracketRightSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTypeDescriptionRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_1_0 != null, "[]");
                    				

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
    // $ANTLR end "ruleTypeDescription"


    // $ANTLR start "entryRuleParameter"
    // InternalBug332217TestLanguage.g:142:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalBug332217TestLanguage.g:142:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalBug332217TestLanguage.g:143:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalBug332217TestLanguage.g:149:1: ruleParameter returns [EObject current=null] : ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_description_0_0 = null;


        try {
            // InternalBug332217TestLanguage.g:150:1: ( ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBug332217TestLanguage.g:151:2: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBug332217TestLanguage.g:151:2: ( ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBug332217TestLanguage.g:152:3: ( (lv_description_0_0= ruleTypeDescription ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBug332217TestLanguage.g:152:3: ( (lv_description_0_0= ruleTypeDescription ) )
            // InternalBug332217TestLanguage.g:153:4: (lv_description_0_0= ruleTypeDescription )
            {
            // InternalBug332217TestLanguage.g:153:4: (lv_description_0_0= ruleTypeDescription )
            // InternalBug332217TestLanguage.g:154:5: lv_description_0_0= ruleTypeDescription
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getDescriptionTypeDescriptionParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
            lv_description_0_0=ruleTypeDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_0_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.TypeDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBug332217TestLanguage.g:171:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBug332217TestLanguage.g:172:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBug332217TestLanguage.g:172:4: (lv_name_1_0= RULE_ID )
            // InternalBug332217TestLanguage.g:173:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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


    // $ANTLR start "entryRuleObjectReference"
    // InternalBug332217TestLanguage.g:193:1: entryRuleObjectReference returns [EObject current=null] : iv_ruleObjectReference= ruleObjectReference EOF ;
    public final EObject entryRuleObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectReference = null;


        try {
            // InternalBug332217TestLanguage.g:193:56: (iv_ruleObjectReference= ruleObjectReference EOF )
            // InternalBug332217TestLanguage.g:194:2: iv_ruleObjectReference= ruleObjectReference EOF
            {
             newCompositeNode(grammarAccess.getObjectReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleObjectReference=ruleObjectReference();

            state._fsp--;

             current =iv_ruleObjectReference; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleObjectReference"


    // $ANTLR start "ruleObjectReference"
    // InternalBug332217TestLanguage.g:200:1: ruleObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tail_1_0 = null;


        try {
            // InternalBug332217TestLanguage.g:201:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? ) )
            // InternalBug332217TestLanguage.g:202:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            {
            // InternalBug332217TestLanguage.g:202:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )? )
            // InternalBug332217TestLanguage.g:203:3: ( (otherlv_0= RULE_ID ) ) ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            {
            // InternalBug332217TestLanguage.g:203:3: ( (otherlv_0= RULE_ID ) )
            // InternalBug332217TestLanguage.g:204:4: (otherlv_0= RULE_ID )
            {
            // InternalBug332217TestLanguage.g:204:4: (otherlv_0= RULE_ID )
            // InternalBug332217TestLanguage.g:205:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getObjectReferenceAccess().getObjectPropertyPathPartCrossReference_0_0());
            				

            }


            }

            // InternalBug332217TestLanguage.g:216:3: ( (lv_tail_1_0= ruleNestedObjectReference ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBug332217TestLanguage.g:217:4: (lv_tail_1_0= ruleNestedObjectReference )
                    {
                    // InternalBug332217TestLanguage.g:217:4: (lv_tail_1_0= ruleNestedObjectReference )
                    // InternalBug332217TestLanguage.g:218:5: lv_tail_1_0= ruleNestedObjectReference
                    {

                    					newCompositeNode(grammarAccess.getObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_1_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_tail_1_0=ruleNestedObjectReference();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectReferenceRule());
                    					}
                    					set(
                    						current,
                    						"tail",
                    						lv_tail_1_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.NestedObjectReference");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleObjectReference"


    // $ANTLR start "entryRuleNestedObjectReference"
    // InternalBug332217TestLanguage.g:239:1: entryRuleNestedObjectReference returns [EObject current=null] : iv_ruleNestedObjectReference= ruleNestedObjectReference EOF ;
    public final EObject entryRuleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedObjectReference = null;


        try {
            // InternalBug332217TestLanguage.g:239:62: (iv_ruleNestedObjectReference= ruleNestedObjectReference EOF )
            // InternalBug332217TestLanguage.g:240:2: iv_ruleNestedObjectReference= ruleNestedObjectReference EOF
            {
             newCompositeNode(grammarAccess.getNestedObjectReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedObjectReference=ruleNestedObjectReference();

            state._fsp--;

             current =iv_ruleNestedObjectReference; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleNestedObjectReference"


    // $ANTLR start "ruleNestedObjectReference"
    // InternalBug332217TestLanguage.g:246:1: ruleNestedObjectReference returns [EObject current=null] : (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) ;
    public final EObject ruleNestedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_tail_2_0 = null;


        try {
            // InternalBug332217TestLanguage.g:247:1: ( (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? ) )
            // InternalBug332217TestLanguage.g:248:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            {
            // InternalBug332217TestLanguage.g:248:2: (otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )? )
            // InternalBug332217TestLanguage.g:249:3: otherlv_0= '.' ( (otherlv_1= RULE_ID ) ) ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNestedObjectReferenceAccess().getFullStopKeyword_0());
            		
            // InternalBug332217TestLanguage.g:253:3: ( (otherlv_1= RULE_ID ) )
            // InternalBug332217TestLanguage.g:254:4: (otherlv_1= RULE_ID )
            {
            // InternalBug332217TestLanguage.g:254:4: (otherlv_1= RULE_ID )
            // InternalBug332217TestLanguage.g:255:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedObjectReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getNestedObjectReferenceAccess().getObjectPropertyPathPartCrossReference_1_0());
            				

            }


            }

            // InternalBug332217TestLanguage.g:266:3: ( (lv_tail_2_0= ruleNestedObjectReference ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBug332217TestLanguage.g:267:4: (lv_tail_2_0= ruleNestedObjectReference )
                    {
                    // InternalBug332217TestLanguage.g:267:4: (lv_tail_2_0= ruleNestedObjectReference )
                    // InternalBug332217TestLanguage.g:268:5: lv_tail_2_0= ruleNestedObjectReference
                    {

                    					newCompositeNode(grammarAccess.getNestedObjectReferenceAccess().getTailNestedObjectReferenceParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_tail_2_0=ruleNestedObjectReference();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNestedObjectReferenceRule());
                    					}
                    					set(
                    						current,
                    						"tail",
                    						lv_tail_2_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.NestedObjectReference");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleNestedObjectReference"


    // $ANTLR start "entryRuleImageExpression"
    // InternalBug332217TestLanguage.g:289:1: entryRuleImageExpression returns [EObject current=null] : iv_ruleImageExpression= ruleImageExpression EOF ;
    public final EObject entryRuleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageExpression = null;


        try {
            // InternalBug332217TestLanguage.g:289:56: (iv_ruleImageExpression= ruleImageExpression EOF )
            // InternalBug332217TestLanguage.g:290:2: iv_ruleImageExpression= ruleImageExpression EOF
            {
             newCompositeNode(grammarAccess.getImageExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImageExpression=ruleImageExpression();

            state._fsp--;

             current =iv_ruleImageExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleImageExpression"


    // $ANTLR start "ruleImageExpression"
    // InternalBug332217TestLanguage.g:296:1: ruleImageExpression returns [EObject current=null] : this_ScalarExpression_0= ruleScalarExpression ;
    public final EObject ruleImageExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ScalarExpression_0 = null;


        try {
            // InternalBug332217TestLanguage.g:297:1: (this_ScalarExpression_0= ruleScalarExpression )
            // InternalBug332217TestLanguage.g:298:2: this_ScalarExpression_0= ruleScalarExpression
            {

            		newCompositeNode(grammarAccess.getImageExpressionAccess().getScalarExpressionParserRuleCall());
            	
            pushFollow(FollowSets000.FOLLOW_2);
            this_ScalarExpression_0=ruleScalarExpression();

            state._fsp--;


            		current = this_ScalarExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleImageExpression"


    // $ANTLR start "entryRuleScalarExpression"
    // InternalBug332217TestLanguage.g:309:1: entryRuleScalarExpression returns [EObject current=null] : iv_ruleScalarExpression= ruleScalarExpression EOF ;
    public final EObject entryRuleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScalarExpression = null;


        try {
            // InternalBug332217TestLanguage.g:309:57: (iv_ruleScalarExpression= ruleScalarExpression EOF )
            // InternalBug332217TestLanguage.g:310:2: iv_ruleScalarExpression= ruleScalarExpression EOF
            {
             newCompositeNode(grammarAccess.getScalarExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScalarExpression=ruleScalarExpression();

            state._fsp--;

             current =iv_ruleScalarExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScalarExpression"


    // $ANTLR start "ruleScalarExpression"
    // InternalBug332217TestLanguage.g:316:1: ruleScalarExpression returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleScalarExpression() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_StringFunction_1 = null;

        EObject this_ObjectReference_2 = null;


        try {
            // InternalBug332217TestLanguage.g:317:1: ( (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference ) )
            // InternalBug332217TestLanguage.g:318:2: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // InternalBug332217TestLanguage.g:318:2: (this_StringLiteral_0= ruleStringLiteral | this_StringFunction_1= ruleStringFunction | this_ObjectReference_2= ruleObjectReference )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case 13:
            case 15:
            case 17:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalBug332217TestLanguage.g:319:3: this_StringLiteral_0= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getScalarExpressionAccess().getStringLiteralParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBug332217TestLanguage.g:328:3: this_StringFunction_1= ruleStringFunction
                    {

                    			newCompositeNode(grammarAccess.getScalarExpressionAccess().getStringFunctionParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringFunction_1=ruleStringFunction();

                    state._fsp--;


                    			current = this_StringFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBug332217TestLanguage.g:337:3: this_ObjectReference_2= ruleObjectReference
                    {

                    			newCompositeNode(grammarAccess.getScalarExpressionAccess().getObjectReferenceParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ObjectReference_2=ruleObjectReference();

                    state._fsp--;


                    			current = this_ObjectReference_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleScalarExpression"


    // $ANTLR start "entryRuleCollectionExpression"
    // InternalBug332217TestLanguage.g:349:1: entryRuleCollectionExpression returns [EObject current=null] : iv_ruleCollectionExpression= ruleCollectionExpression EOF ;
    public final EObject entryRuleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionExpression = null;


        try {
            // InternalBug332217TestLanguage.g:349:61: (iv_ruleCollectionExpression= ruleCollectionExpression EOF )
            // InternalBug332217TestLanguage.g:350:2: iv_ruleCollectionExpression= ruleCollectionExpression EOF
            {
             newCompositeNode(grammarAccess.getCollectionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionExpression=ruleCollectionExpression();

            state._fsp--;

             current =iv_ruleCollectionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCollectionExpression"


    // $ANTLR start "ruleCollectionExpression"
    // InternalBug332217TestLanguage.g:356:1: ruleCollectionExpression returns [EObject current=null] : (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) ;
    public final EObject ruleCollectionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CollectionLiteral_0 = null;

        EObject this_CollectionFunction_1 = null;

        EObject this_ObjectReference_2 = null;


        try {
            // InternalBug332217TestLanguage.g:357:1: ( (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference ) )
            // InternalBug332217TestLanguage.g:358:2: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            {
            // InternalBug332217TestLanguage.g:358:2: (this_CollectionLiteral_0= ruleCollectionLiteral | this_CollectionFunction_1= ruleCollectionFunction | this_ObjectReference_2= ruleObjectReference )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalBug332217TestLanguage.g:359:3: this_CollectionLiteral_0= ruleCollectionLiteral
                    {

                    			newCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionLiteralParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionLiteral_0=ruleCollectionLiteral();

                    state._fsp--;


                    			current = this_CollectionLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBug332217TestLanguage.g:368:3: this_CollectionFunction_1= ruleCollectionFunction
                    {

                    			newCompositeNode(grammarAccess.getCollectionExpressionAccess().getCollectionFunctionParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CollectionFunction_1=ruleCollectionFunction();

                    state._fsp--;


                    			current = this_CollectionFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBug332217TestLanguage.g:377:3: this_ObjectReference_2= ruleObjectReference
                    {

                    			newCompositeNode(grammarAccess.getCollectionExpressionAccess().getObjectReferenceParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ObjectReference_2=ruleObjectReference();

                    state._fsp--;


                    			current = this_ObjectReference_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCollectionExpression"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalBug332217TestLanguage.g:389:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalBug332217TestLanguage.g:389:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalBug332217TestLanguage.g:390:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalBug332217TestLanguage.g:396:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

        try {
            // InternalBug332217TestLanguage.g:397:1: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalBug332217TestLanguage.g:398:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalBug332217TestLanguage.g:398:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalBug332217TestLanguage.g:399:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalBug332217TestLanguage.g:399:3: (lv_value_0_0= RULE_STRING )
            // InternalBug332217TestLanguage.g:400:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleStringFunction"
    // InternalBug332217TestLanguage.g:419:1: entryRuleStringFunction returns [EObject current=null] : iv_ruleStringFunction= ruleStringFunction EOF ;
    public final EObject entryRuleStringFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringFunction = null;


        try {
            // InternalBug332217TestLanguage.g:419:55: (iv_ruleStringFunction= ruleStringFunction EOF )
            // InternalBug332217TestLanguage.g:420:2: iv_ruleStringFunction= ruleStringFunction EOF
            {
             newCompositeNode(grammarAccess.getStringFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringFunction=ruleStringFunction();

            state._fsp--;

             current =iv_ruleStringFunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringFunction"


    // $ANTLR start "ruleStringFunction"
    // InternalBug332217TestLanguage.g:426:1: ruleStringFunction returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) ) ;
    public final EObject ruleStringFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_values_2_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_match_8_0 = null;

        EObject lv_replacement_10_0 = null;

        EObject lv_value_14_0 = null;


        try {
            // InternalBug332217TestLanguage.g:427:1: ( ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) ) )
            // InternalBug332217TestLanguage.g:428:2: ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) )
            {
            // InternalBug332217TestLanguage.g:428:2: ( ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' ) | ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' ) | ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalBug332217TestLanguage.g:429:3: ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' )
                    {
                    // InternalBug332217TestLanguage.g:429:3: ( () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')' )
                    // InternalBug332217TestLanguage.g:430:4: () otherlv_1= '(' ( (lv_values_2_0= ruleScalarExpression ) )+ otherlv_3= ')'
                    {
                    // InternalBug332217TestLanguage.g:430:4: ()
                    // InternalBug332217TestLanguage.g:431:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStringFunctionAccess().getStringConcatAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getStringFunctionAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalBug332217TestLanguage.g:441:4: ( (lv_values_2_0= ruleScalarExpression ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)||LA7_0==13||LA7_0==15||LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBug332217TestLanguage.g:442:5: (lv_values_2_0= ruleScalarExpression )
                    	    {
                    	    // InternalBug332217TestLanguage.g:442:5: (lv_values_2_0= ruleScalarExpression )
                    	    // InternalBug332217TestLanguage.g:443:6: lv_values_2_0= ruleScalarExpression
                    	    {

                    	    						newCompositeNode(grammarAccess.getStringFunctionAccess().getValuesScalarExpressionParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_8);
                    	    lv_values_2_0=ruleScalarExpression();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"values",
                    	    							lv_values_2_0,
                    	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBug332217TestLanguage.g:466:3: ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' )
                    {
                    // InternalBug332217TestLanguage.g:466:3: ( () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')' )
                    // InternalBug332217TestLanguage.g:467:4: () otherlv_5= 'replace(' ( (lv_value_6_0= ruleScalarExpression ) ) otherlv_7= ',' ( (lv_match_8_0= ruleScalarExpression ) ) otherlv_9= ',' ( (lv_replacement_10_0= ruleScalarExpression ) ) otherlv_11= ')'
                    {
                    // InternalBug332217TestLanguage.g:467:4: ()
                    // InternalBug332217TestLanguage.g:468:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStringFunctionAccess().getStringReplaceAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getStringFunctionAccess().getReplaceKeyword_1_1());
                    			
                    // InternalBug332217TestLanguage.g:478:4: ( (lv_value_6_0= ruleScalarExpression ) )
                    // InternalBug332217TestLanguage.g:479:5: (lv_value_6_0= ruleScalarExpression )
                    {
                    // InternalBug332217TestLanguage.g:479:5: (lv_value_6_0= ruleScalarExpression )
                    // InternalBug332217TestLanguage.g:480:6: lv_value_6_0= ruleScalarExpression
                    {

                    						newCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_value_6_0=ruleScalarExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getStringFunctionAccess().getCommaKeyword_1_3());
                    			
                    // InternalBug332217TestLanguage.g:501:4: ( (lv_match_8_0= ruleScalarExpression ) )
                    // InternalBug332217TestLanguage.g:502:5: (lv_match_8_0= ruleScalarExpression )
                    {
                    // InternalBug332217TestLanguage.g:502:5: (lv_match_8_0= ruleScalarExpression )
                    // InternalBug332217TestLanguage.g:503:6: lv_match_8_0= ruleScalarExpression
                    {

                    						newCompositeNode(grammarAccess.getStringFunctionAccess().getMatchScalarExpressionParserRuleCall_1_4_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_9);
                    lv_match_8_0=ruleScalarExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    						}
                    						set(
                    							current,
                    							"match",
                    							lv_match_8_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getStringFunctionAccess().getCommaKeyword_1_5());
                    			
                    // InternalBug332217TestLanguage.g:524:4: ( (lv_replacement_10_0= ruleScalarExpression ) )
                    // InternalBug332217TestLanguage.g:525:5: (lv_replacement_10_0= ruleScalarExpression )
                    {
                    // InternalBug332217TestLanguage.g:525:5: (lv_replacement_10_0= ruleScalarExpression )
                    // InternalBug332217TestLanguage.g:526:6: lv_replacement_10_0= ruleScalarExpression
                    {

                    						newCompositeNode(grammarAccess.getStringFunctionAccess().getReplacementScalarExpressionParserRuleCall_1_6_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_replacement_10_0=ruleScalarExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    						}
                    						set(
                    							current,
                    							"replacement",
                    							lv_replacement_10_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBug332217TestLanguage.g:549:3: ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' )
                    {
                    // InternalBug332217TestLanguage.g:549:3: ( () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')' )
                    // InternalBug332217TestLanguage.g:550:4: () otherlv_13= 'urlconform(' ( (lv_value_14_0= ruleScalarExpression ) ) otherlv_15= ')'
                    {
                    // InternalBug332217TestLanguage.g:550:4: ()
                    // InternalBug332217TestLanguage.g:551:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStringFunctionAccess().getStringUrlConformAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getStringFunctionAccess().getUrlconformKeyword_2_1());
                    			
                    // InternalBug332217TestLanguage.g:561:4: ( (lv_value_14_0= ruleScalarExpression ) )
                    // InternalBug332217TestLanguage.g:562:5: (lv_value_14_0= ruleScalarExpression )
                    {
                    // InternalBug332217TestLanguage.g:562:5: (lv_value_14_0= ruleScalarExpression )
                    // InternalBug332217TestLanguage.g:563:6: lv_value_14_0= ruleScalarExpression
                    {

                    						newCompositeNode(grammarAccess.getStringFunctionAccess().getValueScalarExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_value_14_0=ruleScalarExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringFunctionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_14_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getStringFunctionAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleStringFunction"


    // $ANTLR start "entryRuleCollectionLiteral"
    // InternalBug332217TestLanguage.g:589:1: entryRuleCollectionLiteral returns [EObject current=null] : iv_ruleCollectionLiteral= ruleCollectionLiteral EOF ;
    public final EObject entryRuleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionLiteral = null;


        try {
            // InternalBug332217TestLanguage.g:589:58: (iv_ruleCollectionLiteral= ruleCollectionLiteral EOF )
            // InternalBug332217TestLanguage.g:590:2: iv_ruleCollectionLiteral= ruleCollectionLiteral EOF
            {
             newCompositeNode(grammarAccess.getCollectionLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionLiteral=ruleCollectionLiteral();

            state._fsp--;

             current =iv_ruleCollectionLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCollectionLiteral"


    // $ANTLR start "ruleCollectionLiteral"
    // InternalBug332217TestLanguage.g:596:1: ruleCollectionLiteral returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollectionLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


        try {
            // InternalBug332217TestLanguage.g:597:1: ( (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' ) )
            // InternalBug332217TestLanguage.g:598:2: (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' )
            {
            // InternalBug332217TestLanguage.g:598:2: (otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']' )
            // InternalBug332217TestLanguage.g:599:3: otherlv_0= '[' ( (lv_items_1_0= ruleScalarExpression ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionLiteralAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalBug332217TestLanguage.g:603:3: ( (lv_items_1_0= ruleScalarExpression ) )
            // InternalBug332217TestLanguage.g:604:4: (lv_items_1_0= ruleScalarExpression )
            {
            // InternalBug332217TestLanguage.g:604:4: (lv_items_1_0= ruleScalarExpression )
            // InternalBug332217TestLanguage.g:605:5: lv_items_1_0= ruleScalarExpression
            {

            					newCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_11);
            lv_items_1_0=ruleScalarExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_1_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBug332217TestLanguage.g:622:3: (otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBug332217TestLanguage.g:623:4: otherlv_2= ',' ( (lv_items_3_0= ruleScalarExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getCollectionLiteralAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalBug332217TestLanguage.g:627:4: ( (lv_items_3_0= ruleScalarExpression ) )
            	    // InternalBug332217TestLanguage.g:628:5: (lv_items_3_0= ruleScalarExpression )
            	    {
            	    // InternalBug332217TestLanguage.g:628:5: (lv_items_3_0= ruleScalarExpression )
            	    // InternalBug332217TestLanguage.g:629:6: lv_items_3_0= ruleScalarExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCollectionLiteralAccess().getItemsScalarExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    lv_items_3_0=ruleScalarExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCollectionLiteralRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCollectionLiteralAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleCollectionLiteral"


    // $ANTLR start "entryRuleCollectionFunction"
    // InternalBug332217TestLanguage.g:655:1: entryRuleCollectionFunction returns [EObject current=null] : iv_ruleCollectionFunction= ruleCollectionFunction EOF ;
    public final EObject entryRuleCollectionFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionFunction = null;


        try {
            // InternalBug332217TestLanguage.g:655:59: (iv_ruleCollectionFunction= ruleCollectionFunction EOF )
            // InternalBug332217TestLanguage.g:656:2: iv_ruleCollectionFunction= ruleCollectionFunction EOF
            {
             newCompositeNode(grammarAccess.getCollectionFunctionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionFunction=ruleCollectionFunction();

            state._fsp--;

             current =iv_ruleCollectionFunction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCollectionFunction"


    // $ANTLR start "ruleCollectionFunction"
    // InternalBug332217TestLanguage.g:662:1: ruleCollectionFunction returns [EObject current=null] : ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleCollectionFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_delimiter_4_0 = null;


        try {
            // InternalBug332217TestLanguage.g:663:1: ( ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' ) )
            // InternalBug332217TestLanguage.g:664:2: ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' )
            {
            // InternalBug332217TestLanguage.g:664:2: ( () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')' )
            // InternalBug332217TestLanguage.g:665:3: () otherlv_1= 'split(' ( (lv_value_2_0= ruleScalarExpression ) ) otherlv_3= ',' ( (lv_delimiter_4_0= ruleScalarExpression ) ) otherlv_5= ')'
            {
            // InternalBug332217TestLanguage.g:665:3: ()
            // InternalBug332217TestLanguage.g:666:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCollectionFunctionAccess().getStringSplitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCollectionFunctionAccess().getSplitKeyword_1());
            		
            // InternalBug332217TestLanguage.g:676:3: ( (lv_value_2_0= ruleScalarExpression ) )
            // InternalBug332217TestLanguage.g:677:4: (lv_value_2_0= ruleScalarExpression )
            {
            // InternalBug332217TestLanguage.g:677:4: (lv_value_2_0= ruleScalarExpression )
            // InternalBug332217TestLanguage.g:678:5: lv_value_2_0= ruleScalarExpression
            {

            					newCompositeNode(grammarAccess.getCollectionFunctionAccess().getValueScalarExpressionParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_value_2_0=ruleScalarExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionFunctionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCollectionFunctionAccess().getCommaKeyword_3());
            		
            // InternalBug332217TestLanguage.g:699:3: ( (lv_delimiter_4_0= ruleScalarExpression ) )
            // InternalBug332217TestLanguage.g:700:4: (lv_delimiter_4_0= ruleScalarExpression )
            {
            // InternalBug332217TestLanguage.g:700:4: (lv_delimiter_4_0= ruleScalarExpression )
            // InternalBug332217TestLanguage.g:701:5: lv_delimiter_4_0= ruleScalarExpression
            {

            					newCompositeNode(grammarAccess.getCollectionFunctionAccess().getDelimiterScalarExpressionParserRuleCall_4_0());
            				
            pushFollow(FollowSets000.FOLLOW_10);
            lv_delimiter_4_0=ruleScalarExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionFunctionRule());
            					}
            					set(
            						current,
            						"delimiter",
            						lv_delimiter_4_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCollectionFunctionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleCollectionFunction"


    // $ANTLR start "entryRuleTableView"
    // InternalBug332217TestLanguage.g:726:1: entryRuleTableView returns [EObject current=null] : iv_ruleTableView= ruleTableView EOF ;
    public final EObject entryRuleTableView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableView = null;


        try {
            // InternalBug332217TestLanguage.g:726:50: (iv_ruleTableView= ruleTableView EOF )
            // InternalBug332217TestLanguage.g:727:2: iv_ruleTableView= ruleTableView EOF
            {
             newCompositeNode(grammarAccess.getTableViewRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTableView=ruleTableView();

            state._fsp--;

             current =iv_ruleTableView; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleTableView"


    // $ANTLR start "ruleTableView"
    // InternalBug332217TestLanguage.g:733:1: ruleTableView returns [EObject current=null] : (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) ) ) ( (lv_sections_13_0= ruleSection ) )* otherlv_14= '}' ) ;
    public final EObject ruleTableView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_content_3_0 = null;

        EObject lv_title_8_0 = null;

        EObject lv_titleImage_10_0 = null;

        Enumerator lv_style_12_0 = null;

        EObject lv_sections_13_0 = null;


        try {
            // InternalBug332217TestLanguage.g:734:1: ( (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) ) ) ( (lv_sections_13_0= ruleSection ) )* otherlv_14= '}' ) )
            // InternalBug332217TestLanguage.g:735:2: (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) ) ) ( (lv_sections_13_0= ruleSection ) )* otherlv_14= '}' )
            {
            // InternalBug332217TestLanguage.g:735:2: (otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) ) ) ( (lv_sections_13_0= ruleSection ) )* otherlv_14= '}' )
            // InternalBug332217TestLanguage.g:736:3: otherlv_0= 'tableview' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )? otherlv_5= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) ) ) ( (lv_sections_13_0= ruleSection ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTableViewAccess().getTableviewKeyword_0());
            		
            // InternalBug332217TestLanguage.g:740:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBug332217TestLanguage.g:741:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBug332217TestLanguage.g:741:4: (lv_name_1_0= RULE_ID )
            // InternalBug332217TestLanguage.g:742:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableViewAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableViewRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBug332217TestLanguage.g:758:3: (otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBug332217TestLanguage.g:759:4: otherlv_2= '(' ( (lv_content_3_0= ruleParameter ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getTableViewAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalBug332217TestLanguage.g:763:4: ( (lv_content_3_0= ruleParameter ) )
                    // InternalBug332217TestLanguage.g:764:5: (lv_content_3_0= ruleParameter )
                    {
                    // InternalBug332217TestLanguage.g:764:5: (lv_content_3_0= ruleParameter )
                    // InternalBug332217TestLanguage.g:765:6: lv_content_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getTableViewAccess().getContentParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_10);
                    lv_content_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableViewRule());
                    						}
                    						set(
                    							current,
                    							"content",
                    							lv_content_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableViewAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getTableViewAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBug332217TestLanguage.g:791:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) ) )
            // InternalBug332217TestLanguage.g:792:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) )
            {
            // InternalBug332217TestLanguage.g:792:4: ( ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* ) )
            // InternalBug332217TestLanguage.g:793:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
            				
            // InternalBug332217TestLanguage.g:796:5: ( ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )* )
            // InternalBug332217TestLanguage.g:797:6: ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )*
            {
            // InternalBug332217TestLanguage.g:797:6: ( ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) ) )*
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBug332217TestLanguage.g:798:4: ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:798:4: ({...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:799:5: {...}? => ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalBug332217TestLanguage.g:799:106: ( ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:800:6: ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalBug332217TestLanguage.g:803:9: ({...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) ) )
            	    // InternalBug332217TestLanguage.g:803:10: {...}? => (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:803:19: (otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) ) )
            	    // InternalBug332217TestLanguage.g:803:20: otherlv_7= 'title:' ( (lv_title_8_0= ruleScalarExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTableViewAccess().getTitleKeyword_4_0_0());
            	    								
            	    // InternalBug332217TestLanguage.g:807:9: ( (lv_title_8_0= ruleScalarExpression ) )
            	    // InternalBug332217TestLanguage.g:808:10: (lv_title_8_0= ruleScalarExpression )
            	    {
            	    // InternalBug332217TestLanguage.g:808:10: (lv_title_8_0= ruleScalarExpression )
            	    // InternalBug332217TestLanguage.g:809:11: lv_title_8_0= ruleScalarExpression
            	    {

            	    											newCompositeNode(grammarAccess.getTableViewAccess().getTitleScalarExpressionParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_title_8_0=ruleScalarExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTableViewRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_8_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug332217TestLanguage.g:832:4: ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:832:4: ({...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:833:5: {...}? => ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalBug332217TestLanguage.g:833:106: ( ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:834:6: ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalBug332217TestLanguage.g:837:9: ({...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) ) )
            	    // InternalBug332217TestLanguage.g:837:10: {...}? => (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:837:19: (otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) ) )
            	    // InternalBug332217TestLanguage.g:837:20: otherlv_9= 'titleImage:' ( (lv_titleImage_10_0= ruleImageExpression ) )
            	    {
            	    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            	    									newLeafNode(otherlv_9, grammarAccess.getTableViewAccess().getTitleImageKeyword_4_1_0());
            	    								
            	    // InternalBug332217TestLanguage.g:841:9: ( (lv_titleImage_10_0= ruleImageExpression ) )
            	    // InternalBug332217TestLanguage.g:842:10: (lv_titleImage_10_0= ruleImageExpression )
            	    {
            	    // InternalBug332217TestLanguage.g:842:10: (lv_titleImage_10_0= ruleImageExpression )
            	    // InternalBug332217TestLanguage.g:843:11: lv_titleImage_10_0= ruleImageExpression
            	    {

            	    											newCompositeNode(grammarAccess.getTableViewAccess().getTitleImageImageExpressionParserRuleCall_4_1_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_titleImage_10_0=ruleImageExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTableViewRule());
            	    											}
            	    											set(
            	    												current,
            	    												"titleImage",
            	    												lv_titleImage_10_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ImageExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug332217TestLanguage.g:866:4: ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:866:4: ({...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:867:5: {...}? => ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "getUnorderedGroupHelper().canSelect(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalBug332217TestLanguage.g:867:106: ( ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:868:6: ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTableViewAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalBug332217TestLanguage.g:871:9: ({...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) ) )
            	    // InternalBug332217TestLanguage.g:871:10: {...}? => (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTableView", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:871:19: (otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) ) )
            	    // InternalBug332217TestLanguage.g:871:20: otherlv_11= 'style:' ( (lv_style_12_0= ruleTableViewStyle ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_15); 

            	    									newLeafNode(otherlv_11, grammarAccess.getTableViewAccess().getStyleKeyword_4_2_0());
            	    								
            	    // InternalBug332217TestLanguage.g:875:9: ( (lv_style_12_0= ruleTableViewStyle ) )
            	    // InternalBug332217TestLanguage.g:876:10: (lv_style_12_0= ruleTableViewStyle )
            	    {
            	    // InternalBug332217TestLanguage.g:876:10: (lv_style_12_0= ruleTableViewStyle )
            	    // InternalBug332217TestLanguage.g:877:11: lv_style_12_0= ruleTableViewStyle
            	    {

            	    											newCompositeNode(grammarAccess.getTableViewAccess().getStyleTableViewStyleEnumRuleCall_4_2_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_style_12_0=ruleTableViewStyle();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTableViewRule());
            	    											}
            	    											set(
            	    												current,
            	    												"style",
            	    												lv_style_12_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.TableViewStyle");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTableViewAccess().getUnorderedGroup_4());
            				

            }

            // InternalBug332217TestLanguage.g:907:3: ( (lv_sections_13_0= ruleSection ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBug332217TestLanguage.g:908:4: (lv_sections_13_0= ruleSection )
            	    {
            	    // InternalBug332217TestLanguage.g:908:4: (lv_sections_13_0= ruleSection )
            	    // InternalBug332217TestLanguage.g:909:5: lv_sections_13_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getTableViewAccess().getSectionsSectionParserRuleCall_5_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_sections_13_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTableViewRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_13_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTableViewAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTableView"


    // $ANTLR start "entryRuleSection"
    // InternalBug332217TestLanguage.g:934:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalBug332217TestLanguage.g:934:48: (iv_ruleSection= ruleSection EOF )
            // InternalBug332217TestLanguage.g:935:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalBug332217TestLanguage.g:941:1: ruleSection returns [EObject current=null] : (otherlv_0= 'section' ( (lv_iterator_1_0= ruleCollectionIterator ) )? otherlv_2= '{' (otherlv_3= 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( (lv_cells_5_0= ruleCell ) )+ otherlv_6= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_iterator_1_0 = null;

        EObject lv_title_4_0 = null;

        EObject lv_cells_5_0 = null;


        try {
            // InternalBug332217TestLanguage.g:942:1: ( (otherlv_0= 'section' ( (lv_iterator_1_0= ruleCollectionIterator ) )? otherlv_2= '{' (otherlv_3= 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( (lv_cells_5_0= ruleCell ) )+ otherlv_6= '}' ) )
            // InternalBug332217TestLanguage.g:943:2: (otherlv_0= 'section' ( (lv_iterator_1_0= ruleCollectionIterator ) )? otherlv_2= '{' (otherlv_3= 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( (lv_cells_5_0= ruleCell ) )+ otherlv_6= '}' )
            {
            // InternalBug332217TestLanguage.g:943:2: (otherlv_0= 'section' ( (lv_iterator_1_0= ruleCollectionIterator ) )? otherlv_2= '{' (otherlv_3= 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( (lv_cells_5_0= ruleCell ) )+ otherlv_6= '}' )
            // InternalBug332217TestLanguage.g:944:3: otherlv_0= 'section' ( (lv_iterator_1_0= ruleCollectionIterator ) )? otherlv_2= '{' (otherlv_3= 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )? ( (lv_cells_5_0= ruleCell ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalBug332217TestLanguage.g:948:3: ( (lv_iterator_1_0= ruleCollectionIterator ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBug332217TestLanguage.g:949:4: (lv_iterator_1_0= ruleCollectionIterator )
                    {
                    // InternalBug332217TestLanguage.g:949:4: (lv_iterator_1_0= ruleCollectionIterator )
                    // InternalBug332217TestLanguage.g:950:5: lv_iterator_1_0= ruleCollectionIterator
                    {

                    					newCompositeNode(grammarAccess.getSectionAccess().getIteratorCollectionIteratorParserRuleCall_1_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_iterator_1_0=ruleCollectionIterator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSectionRule());
                    					}
                    					set(
                    						current,
                    						"iterator",
                    						lv_iterator_1_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.CollectionIterator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalBug332217TestLanguage.g:971:3: (otherlv_3= 'title:' ( (lv_title_4_0= ruleScalarExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalBug332217TestLanguage.g:972:4: otherlv_3= 'title:' ( (lv_title_4_0= ruleScalarExpression ) )
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getTitleKeyword_3_0());
                    			
                    // InternalBug332217TestLanguage.g:976:4: ( (lv_title_4_0= ruleScalarExpression ) )
                    // InternalBug332217TestLanguage.g:977:5: (lv_title_4_0= ruleScalarExpression )
                    {
                    // InternalBug332217TestLanguage.g:977:5: (lv_title_4_0= ruleScalarExpression )
                    // InternalBug332217TestLanguage.g:978:6: lv_title_4_0= ruleScalarExpression
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTitleScalarExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_title_4_0=ruleScalarExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBug332217TestLanguage.g:996:3: ( (lv_cells_5_0= ruleCell ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBug332217TestLanguage.g:997:4: (lv_cells_5_0= ruleCell )
            	    {
            	    // InternalBug332217TestLanguage.g:997:4: (lv_cells_5_0= ruleCell )
            	    // InternalBug332217TestLanguage.g:998:5: lv_cells_5_0= ruleCell
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getCellsCellParserRuleCall_4_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_cells_5_0=ruleCell();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cells",
            	    						lv_cells_5_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.Cell");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleCell"
    // InternalBug332217TestLanguage.g:1023:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // InternalBug332217TestLanguage.g:1023:45: (iv_ruleCell= ruleCell EOF )
            // InternalBug332217TestLanguage.g:1024:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalBug332217TestLanguage.g:1030:1: ruleCell returns [EObject current=null] : (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_type_1_0 = null;

        EObject lv_iterator_2_0 = null;

        EObject lv_text_6_0 = null;

        EObject lv_details_8_0 = null;

        EObject lv_image_10_0 = null;

        EObject lv_action_12_0 = null;

        Enumerator lv_accessory_14_0 = null;


        try {
            // InternalBug332217TestLanguage.g:1031:1: ( (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalBug332217TestLanguage.g:1032:2: (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalBug332217TestLanguage.g:1032:2: (otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalBug332217TestLanguage.g:1033:3: otherlv_0= 'cell' ( (lv_type_1_0= ruleCellType ) ) ( (lv_iterator_2_0= ruleCollectionIterator ) )? otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getCellKeyword_0());
            		
            // InternalBug332217TestLanguage.g:1037:3: ( (lv_type_1_0= ruleCellType ) )
            // InternalBug332217TestLanguage.g:1038:4: (lv_type_1_0= ruleCellType )
            {
            // InternalBug332217TestLanguage.g:1038:4: (lv_type_1_0= ruleCellType )
            // InternalBug332217TestLanguage.g:1039:5: lv_type_1_0= ruleCellType
            {

            					newCompositeNode(grammarAccess.getCellAccess().getTypeCellTypeEnumRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_17);
            lv_type_1_0=ruleCellType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCellRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.CellType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBug332217TestLanguage.g:1056:3: ( (lv_iterator_2_0= ruleCollectionIterator ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalBug332217TestLanguage.g:1057:4: (lv_iterator_2_0= ruleCollectionIterator )
                    {
                    // InternalBug332217TestLanguage.g:1057:4: (lv_iterator_2_0= ruleCollectionIterator )
                    // InternalBug332217TestLanguage.g:1058:5: lv_iterator_2_0= ruleCollectionIterator
                    {

                    					newCompositeNode(grammarAccess.getCellAccess().getIteratorCollectionIteratorParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_iterator_2_0=ruleCollectionIterator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCellRule());
                    					}
                    					set(
                    						current,
                    						"iterator",
                    						lv_iterator_2_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.CollectionIterator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FollowSets000.FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getCellAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBug332217TestLanguage.g:1079:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) ) )
            // InternalBug332217TestLanguage.g:1080:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) )
            {
            // InternalBug332217TestLanguage.g:1080:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* ) )
            // InternalBug332217TestLanguage.g:1081:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getCellAccess().getUnorderedGroup_4());
            				
            // InternalBug332217TestLanguage.g:1084:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )* )
            // InternalBug332217TestLanguage.g:1085:6: ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )*
            {
            // InternalBug332217TestLanguage.g:1085:6: ( ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) ) )*
            loop17:
            do {
                int alt17=6;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3) ) {
                    alt17=4;
                }
                else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4) ) {
                    alt17=5;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalBug332217TestLanguage.g:1086:4: ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:1086:4: ({...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1087:5: {...}? => ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalBug332217TestLanguage.g:1087:101: ( ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1088:6: ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalBug332217TestLanguage.g:1091:9: ({...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) ) )
            	    // InternalBug332217TestLanguage.g:1091:10: {...}? => (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:1091:19: (otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) ) )
            	    // InternalBug332217TestLanguage.g:1091:20: otherlv_5= 'text:' ( (lv_text_6_0= ruleScalarExpression ) )
            	    {
            	    otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getCellAccess().getTextKeyword_4_0_0());
            	    								
            	    // InternalBug332217TestLanguage.g:1095:9: ( (lv_text_6_0= ruleScalarExpression ) )
            	    // InternalBug332217TestLanguage.g:1096:10: (lv_text_6_0= ruleScalarExpression )
            	    {
            	    // InternalBug332217TestLanguage.g:1096:10: (lv_text_6_0= ruleScalarExpression )
            	    // InternalBug332217TestLanguage.g:1097:11: lv_text_6_0= ruleScalarExpression
            	    {

            	    											newCompositeNode(grammarAccess.getCellAccess().getTextScalarExpressionParserRuleCall_4_0_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_text_6_0=ruleScalarExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCellRule());
            	    											}
            	    											set(
            	    												current,
            	    												"text",
            	    												lv_text_6_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug332217TestLanguage.g:1120:4: ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:1120:4: ({...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1121:5: {...}? => ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalBug332217TestLanguage.g:1121:101: ( ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1122:6: ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalBug332217TestLanguage.g:1125:9: ({...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) ) )
            	    // InternalBug332217TestLanguage.g:1125:10: {...}? => (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:1125:19: (otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) ) )
            	    // InternalBug332217TestLanguage.g:1125:20: otherlv_7= 'details:' ( (lv_details_8_0= ruleScalarExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getCellAccess().getDetailsKeyword_4_1_0());
            	    								
            	    // InternalBug332217TestLanguage.g:1129:9: ( (lv_details_8_0= ruleScalarExpression ) )
            	    // InternalBug332217TestLanguage.g:1130:10: (lv_details_8_0= ruleScalarExpression )
            	    {
            	    // InternalBug332217TestLanguage.g:1130:10: (lv_details_8_0= ruleScalarExpression )
            	    // InternalBug332217TestLanguage.g:1131:11: lv_details_8_0= ruleScalarExpression
            	    {

            	    											newCompositeNode(grammarAccess.getCellAccess().getDetailsScalarExpressionParserRuleCall_4_1_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_details_8_0=ruleScalarExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCellRule());
            	    											}
            	    											set(
            	    												current,
            	    												"details",
            	    												lv_details_8_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug332217TestLanguage.g:1154:4: ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:1154:4: ({...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1155:5: {...}? => ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalBug332217TestLanguage.g:1155:101: ( ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1156:6: ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalBug332217TestLanguage.g:1159:9: ({...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) ) )
            	    // InternalBug332217TestLanguage.g:1159:10: {...}? => (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:1159:19: (otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) ) )
            	    // InternalBug332217TestLanguage.g:1159:20: otherlv_9= 'image:' ( (lv_image_10_0= ruleScalarExpression ) )
            	    {
            	    otherlv_9=(Token)match(input,31,FollowSets000.FOLLOW_7); 

            	    									newLeafNode(otherlv_9, grammarAccess.getCellAccess().getImageKeyword_4_2_0());
            	    								
            	    // InternalBug332217TestLanguage.g:1163:9: ( (lv_image_10_0= ruleScalarExpression ) )
            	    // InternalBug332217TestLanguage.g:1164:10: (lv_image_10_0= ruleScalarExpression )
            	    {
            	    // InternalBug332217TestLanguage.g:1164:10: (lv_image_10_0= ruleScalarExpression )
            	    // InternalBug332217TestLanguage.g:1165:11: lv_image_10_0= ruleScalarExpression
            	    {

            	    											newCompositeNode(grammarAccess.getCellAccess().getImageScalarExpressionParserRuleCall_4_2_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_image_10_0=ruleScalarExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCellRule());
            	    											}
            	    											set(
            	    												current,
            	    												"image",
            	    												lv_image_10_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBug332217TestLanguage.g:1188:4: ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:1188:4: ({...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1189:5: {...}? => ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalBug332217TestLanguage.g:1189:101: ( ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1190:6: ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalBug332217TestLanguage.g:1193:9: ({...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) ) )
            	    // InternalBug332217TestLanguage.g:1193:10: {...}? => (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:1193:19: (otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) ) )
            	    // InternalBug332217TestLanguage.g:1193:20: otherlv_11= 'action:' ( (lv_action_12_0= ruleViewAction ) )
            	    {
            	    otherlv_11=(Token)match(input,32,FollowSets000.FOLLOW_22); 

            	    									newLeafNode(otherlv_11, grammarAccess.getCellAccess().getActionKeyword_4_3_0());
            	    								
            	    // InternalBug332217TestLanguage.g:1197:9: ( (lv_action_12_0= ruleViewAction ) )
            	    // InternalBug332217TestLanguage.g:1198:10: (lv_action_12_0= ruleViewAction )
            	    {
            	    // InternalBug332217TestLanguage.g:1198:10: (lv_action_12_0= ruleViewAction )
            	    // InternalBug332217TestLanguage.g:1199:11: lv_action_12_0= ruleViewAction
            	    {

            	    											newCompositeNode(grammarAccess.getCellAccess().getActionViewActionParserRuleCall_4_3_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_action_12_0=ruleViewAction();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCellRule());
            	    											}
            	    											set(
            	    												current,
            	    												"action",
            	    												lv_action_12_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ViewAction");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalBug332217TestLanguage.g:1222:4: ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )
            	    {
            	    // InternalBug332217TestLanguage.g:1222:4: ({...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1223:5: {...}? => ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "getUnorderedGroupHelper().canSelect(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalBug332217TestLanguage.g:1223:101: ( ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) ) )
            	    // InternalBug332217TestLanguage.g:1224:6: ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getCellAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalBug332217TestLanguage.g:1227:9: ({...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) ) )
            	    // InternalBug332217TestLanguage.g:1227:10: {...}? => (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCell", "true");
            	    }
            	    // InternalBug332217TestLanguage.g:1227:19: (otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) ) )
            	    // InternalBug332217TestLanguage.g:1227:20: otherlv_13= 'accessory:' ( (lv_accessory_14_0= ruleCellAccessory ) )
            	    {
            	    otherlv_13=(Token)match(input,33,FollowSets000.FOLLOW_23); 

            	    									newLeafNode(otherlv_13, grammarAccess.getCellAccess().getAccessoryKeyword_4_4_0());
            	    								
            	    // InternalBug332217TestLanguage.g:1231:9: ( (lv_accessory_14_0= ruleCellAccessory ) )
            	    // InternalBug332217TestLanguage.g:1232:10: (lv_accessory_14_0= ruleCellAccessory )
            	    {
            	    // InternalBug332217TestLanguage.g:1232:10: (lv_accessory_14_0= ruleCellAccessory )
            	    // InternalBug332217TestLanguage.g:1233:11: lv_accessory_14_0= ruleCellAccessory
            	    {

            	    											newCompositeNode(grammarAccess.getCellAccess().getAccessoryCellAccessoryEnumRuleCall_4_4_1_0());
            	    										
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_accessory_14_0=ruleCellAccessory();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getCellRule());
            	    											}
            	    											set(
            	    												current,
            	    												"accessory",
            	    												lv_accessory_14_0,
            	    												"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.CellAccessory");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCellAccess().getUnorderedGroup_4());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getCellAccess().getUnorderedGroup_4());
            				

            }

            otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getCellAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleCollectionIterator"
    // InternalBug332217TestLanguage.g:1271:1: entryRuleCollectionIterator returns [EObject current=null] : iv_ruleCollectionIterator= ruleCollectionIterator EOF ;
    public final EObject entryRuleCollectionIterator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionIterator = null;


        try {
            // InternalBug332217TestLanguage.g:1271:59: (iv_ruleCollectionIterator= ruleCollectionIterator EOF )
            // InternalBug332217TestLanguage.g:1272:2: iv_ruleCollectionIterator= ruleCollectionIterator EOF
            {
             newCompositeNode(grammarAccess.getCollectionIteratorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCollectionIterator=ruleCollectionIterator();

            state._fsp--;

             current =iv_ruleCollectionIterator; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleCollectionIterator"


    // $ANTLR start "ruleCollectionIterator"
    // InternalBug332217TestLanguage.g:1278:1: ruleCollectionIterator returns [EObject current=null] : (otherlv_0= 'for' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) ) ;
    public final EObject ruleCollectionIterator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_collection_3_0 = null;


        try {
            // InternalBug332217TestLanguage.g:1279:1: ( (otherlv_0= 'for' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) ) )
            // InternalBug332217TestLanguage.g:1280:2: (otherlv_0= 'for' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) )
            {
            // InternalBug332217TestLanguage.g:1280:2: (otherlv_0= 'for' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleCollectionExpression ) ) )
            // InternalBug332217TestLanguage.g:1281:3: otherlv_0= 'for' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'in' ( (lv_collection_3_0= ruleCollectionExpression ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCollectionIteratorAccess().getForKeyword_0());
            		
            // InternalBug332217TestLanguage.g:1285:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBug332217TestLanguage.g:1286:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBug332217TestLanguage.g:1286:4: (lv_name_1_0= RULE_ID )
            // InternalBug332217TestLanguage.g:1287:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCollectionIteratorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCollectionIteratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getCollectionIteratorAccess().getInKeyword_2());
            		
            // InternalBug332217TestLanguage.g:1307:3: ( (lv_collection_3_0= ruleCollectionExpression ) )
            // InternalBug332217TestLanguage.g:1308:4: (lv_collection_3_0= ruleCollectionExpression )
            {
            // InternalBug332217TestLanguage.g:1308:4: (lv_collection_3_0= ruleCollectionExpression )
            // InternalBug332217TestLanguage.g:1309:5: lv_collection_3_0= ruleCollectionExpression
            {

            					newCompositeNode(grammarAccess.getCollectionIteratorAccess().getCollectionCollectionExpressionParserRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
            lv_collection_3_0=ruleCollectionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCollectionIteratorRule());
            					}
            					set(
            						current,
            						"collection",
            						lv_collection_3_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.CollectionExpression");
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
    // $ANTLR end "ruleCollectionIterator"


    // $ANTLR start "entryRuleViewAction"
    // InternalBug332217TestLanguage.g:1330:1: entryRuleViewAction returns [EObject current=null] : iv_ruleViewAction= ruleViewAction EOF ;
    public final EObject entryRuleViewAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewAction = null;


        try {
            // InternalBug332217TestLanguage.g:1330:51: (iv_ruleViewAction= ruleViewAction EOF )
            // InternalBug332217TestLanguage.g:1331:2: iv_ruleViewAction= ruleViewAction EOF
            {
             newCompositeNode(grammarAccess.getViewActionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleViewAction=ruleViewAction();

            state._fsp--;

             current =iv_ruleViewAction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleViewAction"


    // $ANTLR start "ruleViewAction"
    // InternalBug332217TestLanguage.g:1337:1: ruleViewAction returns [EObject current=null] : (this_ExternalOpen_0= ruleExternalOpen | this_Selector_1= ruleSelector ) ;
    public final EObject ruleViewAction() throws RecognitionException {
        EObject current = null;

        EObject this_ExternalOpen_0 = null;

        EObject this_Selector_1 = null;


        try {
            // InternalBug332217TestLanguage.g:1338:1: ( (this_ExternalOpen_0= ruleExternalOpen | this_Selector_1= ruleSelector ) )
            // InternalBug332217TestLanguage.g:1339:2: (this_ExternalOpen_0= ruleExternalOpen | this_Selector_1= ruleSelector )
            {
            // InternalBug332217TestLanguage.g:1339:2: (this_ExternalOpen_0= ruleExternalOpen | this_Selector_1= ruleSelector )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||LA18_0==13||LA18_0==15||LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBug332217TestLanguage.g:1340:3: this_ExternalOpen_0= ruleExternalOpen
                    {

                    			newCompositeNode(grammarAccess.getViewActionAccess().getExternalOpenParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ExternalOpen_0=ruleExternalOpen();

                    state._fsp--;


                    			current = this_ExternalOpen_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBug332217TestLanguage.g:1349:3: this_Selector_1= ruleSelector
                    {

                    			newCompositeNode(grammarAccess.getViewActionAccess().getSelectorParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Selector_1=ruleSelector();

                    state._fsp--;


                    			current = this_Selector_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleViewAction"


    // $ANTLR start "entryRuleSelectorName"
    // InternalBug332217TestLanguage.g:1361:1: entryRuleSelectorName returns [String current=null] : iv_ruleSelectorName= ruleSelectorName EOF ;
    public final String entryRuleSelectorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSelectorName = null;


        try {
            // InternalBug332217TestLanguage.g:1361:52: (iv_ruleSelectorName= ruleSelectorName EOF )
            // InternalBug332217TestLanguage.g:1362:2: iv_ruleSelectorName= ruleSelectorName EOF
            {
             newCompositeNode(grammarAccess.getSelectorNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelectorName=ruleSelectorName();

            state._fsp--;

             current =iv_ruleSelectorName.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelectorName"


    // $ANTLR start "ruleSelectorName"
    // InternalBug332217TestLanguage.g:1368:1: ruleSelectorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? ) ;
    public final AntlrDatatypeRuleToken ruleSelectorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // InternalBug332217TestLanguage.g:1369:1: ( (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? ) )
            // InternalBug332217TestLanguage.g:1370:2: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? )
            {
            // InternalBug332217TestLanguage.g:1370:2: (this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )? )
            // InternalBug332217TestLanguage.g:1371:3: this_ID_0= RULE_ID (kw= ':' this_ID_2= RULE_ID )* (kw= ':' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalBug332217TestLanguage.g:1378:3: (kw= ':' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalBug332217TestLanguage.g:1379:4: kw= ':' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getSelectorNameAccess().getColonKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_26); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getSelectorNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalBug332217TestLanguage.g:1392:3: (kw= ':' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBug332217TestLanguage.g:1393:4: kw= ':'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSelectorNameAccess().getColonKeyword_2());
                    			

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
    // $ANTLR end "ruleSelectorName"


    // $ANTLR start "entryRuleSelector"
    // InternalBug332217TestLanguage.g:1403:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalBug332217TestLanguage.g:1403:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalBug332217TestLanguage.g:1404:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalBug332217TestLanguage.g:1410:1: ruleSelector returns [EObject current=null] : (otherlv_0= '@selector' otherlv_1= '(' ( (lv_name_2_0= ruleSelectorName ) ) otherlv_3= ')' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


        try {
            // InternalBug332217TestLanguage.g:1411:1: ( (otherlv_0= '@selector' otherlv_1= '(' ( (lv_name_2_0= ruleSelectorName ) ) otherlv_3= ')' ) )
            // InternalBug332217TestLanguage.g:1412:2: (otherlv_0= '@selector' otherlv_1= '(' ( (lv_name_2_0= ruleSelectorName ) ) otherlv_3= ')' )
            {
            // InternalBug332217TestLanguage.g:1412:2: (otherlv_0= '@selector' otherlv_1= '(' ( (lv_name_2_0= ruleSelectorName ) ) otherlv_3= ')' )
            // InternalBug332217TestLanguage.g:1413:3: otherlv_0= '@selector' otherlv_1= '(' ( (lv_name_2_0= ruleSelectorName ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectorKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalBug332217TestLanguage.g:1421:3: ( (lv_name_2_0= ruleSelectorName ) )
            // InternalBug332217TestLanguage.g:1422:4: (lv_name_2_0= ruleSelectorName )
            {
            // InternalBug332217TestLanguage.g:1422:4: (lv_name_2_0= ruleSelectorName )
            // InternalBug332217TestLanguage.g:1423:5: lv_name_2_0= ruleSelectorName
            {

            					newCompositeNode(grammarAccess.getSelectorAccess().getNameSelectorNameParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_10);
            lv_name_2_0=ruleSelectorName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.SelectorName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectorAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleExternalOpen"
    // InternalBug332217TestLanguage.g:1448:1: entryRuleExternalOpen returns [EObject current=null] : iv_ruleExternalOpen= ruleExternalOpen EOF ;
    public final EObject entryRuleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalOpen = null;


        try {
            // InternalBug332217TestLanguage.g:1448:53: (iv_ruleExternalOpen= ruleExternalOpen EOF )
            // InternalBug332217TestLanguage.g:1449:2: iv_ruleExternalOpen= ruleExternalOpen EOF
            {
             newCompositeNode(grammarAccess.getExternalOpenRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExternalOpen=ruleExternalOpen();

            state._fsp--;

             current =iv_ruleExternalOpen; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalOpen"


    // $ANTLR start "ruleExternalOpen"
    // InternalBug332217TestLanguage.g:1455:1: ruleExternalOpen returns [EObject current=null] : ( (lv_url_0_0= ruleScalarExpression ) ) ;
    public final EObject ruleExternalOpen() throws RecognitionException {
        EObject current = null;

        EObject lv_url_0_0 = null;


        try {
            // InternalBug332217TestLanguage.g:1456:1: ( ( (lv_url_0_0= ruleScalarExpression ) ) )
            // InternalBug332217TestLanguage.g:1457:2: ( (lv_url_0_0= ruleScalarExpression ) )
            {
            // InternalBug332217TestLanguage.g:1457:2: ( (lv_url_0_0= ruleScalarExpression ) )
            // InternalBug332217TestLanguage.g:1458:3: (lv_url_0_0= ruleScalarExpression )
            {
            // InternalBug332217TestLanguage.g:1458:3: (lv_url_0_0= ruleScalarExpression )
            // InternalBug332217TestLanguage.g:1459:4: lv_url_0_0= ruleScalarExpression
            {

            				newCompositeNode(grammarAccess.getExternalOpenAccess().getUrlScalarExpressionParserRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
            lv_url_0_0=ruleScalarExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExternalOpenRule());
            				}
            				set(
            					current,
            					"url",
            					lv_url_0_0,
            					"org.eclipse.xtext.ui.tests.editor.contentassist.Bug332217TestLanguage.ScalarExpression");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleExternalOpen"


    // $ANTLR start "ruleTableViewStyle"
    // InternalBug332217TestLanguage.g:1479:1: ruleTableViewStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'Plain' ) | (enumLiteral_1= 'Grouped' ) ) ;
    public final Enumerator ruleTableViewStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // InternalBug332217TestLanguage.g:1480:1: ( ( (enumLiteral_0= 'Plain' ) | (enumLiteral_1= 'Grouped' ) ) )
            // InternalBug332217TestLanguage.g:1481:2: ( (enumLiteral_0= 'Plain' ) | (enumLiteral_1= 'Grouped' ) )
            {
            // InternalBug332217TestLanguage.g:1481:2: ( (enumLiteral_0= 'Plain' ) | (enumLiteral_1= 'Grouped' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalBug332217TestLanguage.g:1482:3: (enumLiteral_0= 'Plain' )
                    {
                    // InternalBug332217TestLanguage.g:1482:3: (enumLiteral_0= 'Plain' )
                    // InternalBug332217TestLanguage.g:1483:4: enumLiteral_0= 'Plain'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTableViewStyleAccess().getPlainEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBug332217TestLanguage.g:1490:3: (enumLiteral_1= 'Grouped' )
                    {
                    // InternalBug332217TestLanguage.g:1490:3: (enumLiteral_1= 'Grouped' )
                    // InternalBug332217TestLanguage.g:1491:4: enumLiteral_1= 'Grouped'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getTableViewStyleAccess().getGroupedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTableViewStyleAccess().getGroupedEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTableViewStyle"


    // $ANTLR start "ruleCellType"
    // InternalBug332217TestLanguage.g:1501:1: ruleCellType returns [Enumerator current=null] : ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Value1' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Subtitle' ) ) ;
    public final Enumerator ruleCellType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

        try {
            // InternalBug332217TestLanguage.g:1502:1: ( ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Value1' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Subtitle' ) ) )
            // InternalBug332217TestLanguage.g:1503:2: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Value1' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Subtitle' ) )
            {
            // InternalBug332217TestLanguage.g:1503:2: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Value1' ) | (enumLiteral_2= 'Value2' ) | (enumLiteral_3= 'Subtitle' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 42:
                {
                alt22=3;
                }
                break;
            case 43:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalBug332217TestLanguage.g:1504:3: (enumLiteral_0= 'Default' )
                    {
                    // InternalBug332217TestLanguage.g:1504:3: (enumLiteral_0= 'Default' )
                    // InternalBug332217TestLanguage.g:1505:4: enumLiteral_0= 'Default'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCellTypeAccess().getDefaultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBug332217TestLanguage.g:1512:3: (enumLiteral_1= 'Value1' )
                    {
                    // InternalBug332217TestLanguage.g:1512:3: (enumLiteral_1= 'Value1' )
                    // InternalBug332217TestLanguage.g:1513:4: enumLiteral_1= 'Value1'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCellTypeAccess().getValue1EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBug332217TestLanguage.g:1520:3: (enumLiteral_2= 'Value2' )
                    {
                    // InternalBug332217TestLanguage.g:1520:3: (enumLiteral_2= 'Value2' )
                    // InternalBug332217TestLanguage.g:1521:4: enumLiteral_2= 'Value2'
                    {
                    enumLiteral_2=(Token)match(input,42,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCellTypeAccess().getValue2EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBug332217TestLanguage.g:1528:3: (enumLiteral_3= 'Subtitle' )
                    {
                    // InternalBug332217TestLanguage.g:1528:3: (enumLiteral_3= 'Subtitle' )
                    // InternalBug332217TestLanguage.g:1529:4: enumLiteral_3= 'Subtitle'
                    {
                    enumLiteral_3=(Token)match(input,43,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCellTypeAccess().getSubtitleEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCellType"


    // $ANTLR start "ruleCellAccessory"
    // InternalBug332217TestLanguage.g:1539:1: ruleCellAccessory returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Detail' ) | (enumLiteral_3= 'Check' ) ) ;
    public final Enumerator ruleCellAccessory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

        try {
            // InternalBug332217TestLanguage.g:1540:1: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Detail' ) | (enumLiteral_3= 'Check' ) ) )
            // InternalBug332217TestLanguage.g:1541:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Detail' ) | (enumLiteral_3= 'Check' ) )
            {
            // InternalBug332217TestLanguage.g:1541:2: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'Link' ) | (enumLiteral_2= 'Detail' ) | (enumLiteral_3= 'Check' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt23=1;
                }
                break;
            case 45:
                {
                alt23=2;
                }
                break;
            case 46:
                {
                alt23=3;
                }
                break;
            case 47:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalBug332217TestLanguage.g:1542:3: (enumLiteral_0= 'None' )
                    {
                    // InternalBug332217TestLanguage.g:1542:3: (enumLiteral_0= 'None' )
                    // InternalBug332217TestLanguage.g:1543:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCellAccessoryAccess().getNoneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBug332217TestLanguage.g:1550:3: (enumLiteral_1= 'Link' )
                    {
                    // InternalBug332217TestLanguage.g:1550:3: (enumLiteral_1= 'Link' )
                    // InternalBug332217TestLanguage.g:1551:4: enumLiteral_1= 'Link'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCellAccessoryAccess().getLinkEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBug332217TestLanguage.g:1558:3: (enumLiteral_2= 'Detail' )
                    {
                    // InternalBug332217TestLanguage.g:1558:3: (enumLiteral_2= 'Detail' )
                    // InternalBug332217TestLanguage.g:1559:4: enumLiteral_2= 'Detail'
                    {
                    enumLiteral_2=(Token)match(input,46,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCellAccessoryAccess().getDetailEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBug332217TestLanguage.g:1566:3: (enumLiteral_3= 'Check' )
                    {
                    // InternalBug332217TestLanguage.g:1566:3: (enumLiteral_3= 'Check' )
                    // InternalBug332217TestLanguage.g:1567:4: enumLiteral_3= 'Check'
                    {
                    enumLiteral_3=(Token)match(input,47,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getCellAccessoryAccess().getCheckEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCellAccessoryAccess().getCheckEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleCellAccessory"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000002A030L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000002E030L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000402000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000F800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400400000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000014800000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000F0000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000003E4000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000200002A030L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000F00000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000016A030L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    }


}