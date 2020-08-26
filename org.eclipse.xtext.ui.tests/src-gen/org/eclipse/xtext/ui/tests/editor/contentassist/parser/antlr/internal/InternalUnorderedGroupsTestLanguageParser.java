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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.UnorderedGroupsTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnorderedGroupsTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'2'", "'3'", "'4'", "'5'", "'bug304681'", "'public'", "'private'", "'protected'", "'static'", "'synchronized'", "'abstract'", "'final'", "'class'", "'{'", "'}'", "'before'", "'after'", "'short'", "';'", "'long'", "'uid'", "'flag'", "'attr'", "'ref'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
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
    public static final int RULE_INT=6;
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


        public InternalUnorderedGroupsTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnorderedGroupsTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnorderedGroupsTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUnorderedGroupsTestLanguage.g"; }



     	private UnorderedGroupsTestLanguageGrammarAccess grammarAccess;

        public InternalUnorderedGroupsTestLanguageParser(TokenStream input, UnorderedGroupsTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UnorderedGroupsTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUnorderedGroupsTestLanguage.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUnorderedGroupsTestLanguage.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalUnorderedGroupsTestLanguage.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= '1' ( (lv_first_1_0= ruleSimpleModel ) ) ) | (otherlv_2= '2' ( (lv_second_3_0= ruleMandatoryModel ) ) ) | (otherlv_4= '3' ( (lv_thrird_5_0= ruleLoopedModel ) ) ) | (otherlv_6= '4' ( (lv_forth_7_0= ruleGroupLoopedModel ) ) ) | (otherlv_8= '5' ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) ) ) | (otherlv_10= 'bug304681' ( (lv_model_11_0= ruleBug304681Model ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_first_1_0 = null;

        EObject lv_second_3_0 = null;

        EObject lv_thrird_5_0 = null;

        EObject lv_forth_7_0 = null;

        EObject lv_fifth_9_0 = null;

        EObject lv_model_11_0 = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:72:1: ( ( (otherlv_0= '1' ( (lv_first_1_0= ruleSimpleModel ) ) ) | (otherlv_2= '2' ( (lv_second_3_0= ruleMandatoryModel ) ) ) | (otherlv_4= '3' ( (lv_thrird_5_0= ruleLoopedModel ) ) ) | (otherlv_6= '4' ( (lv_forth_7_0= ruleGroupLoopedModel ) ) ) | (otherlv_8= '5' ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) ) ) | (otherlv_10= 'bug304681' ( (lv_model_11_0= ruleBug304681Model ) ) ) ) )
            // InternalUnorderedGroupsTestLanguage.g:73:2: ( (otherlv_0= '1' ( (lv_first_1_0= ruleSimpleModel ) ) ) | (otherlv_2= '2' ( (lv_second_3_0= ruleMandatoryModel ) ) ) | (otherlv_4= '3' ( (lv_thrird_5_0= ruleLoopedModel ) ) ) | (otherlv_6= '4' ( (lv_forth_7_0= ruleGroupLoopedModel ) ) ) | (otherlv_8= '5' ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) ) ) | (otherlv_10= 'bug304681' ( (lv_model_11_0= ruleBug304681Model ) ) ) )
            {
            // InternalUnorderedGroupsTestLanguage.g:73:2: ( (otherlv_0= '1' ( (lv_first_1_0= ruleSimpleModel ) ) ) | (otherlv_2= '2' ( (lv_second_3_0= ruleMandatoryModel ) ) ) | (otherlv_4= '3' ( (lv_thrird_5_0= ruleLoopedModel ) ) ) | (otherlv_6= '4' ( (lv_forth_7_0= ruleGroupLoopedModel ) ) ) | (otherlv_8= '5' ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) ) ) | (otherlv_10= 'bug304681' ( (lv_model_11_0= ruleBug304681Model ) ) ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUnorderedGroupsTestLanguage.g:74:3: (otherlv_0= '1' ( (lv_first_1_0= ruleSimpleModel ) ) )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:74:3: (otherlv_0= '1' ( (lv_first_1_0= ruleSimpleModel ) ) )
                    // InternalUnorderedGroupsTestLanguage.g:75:4: otherlv_0= '1' ( (lv_first_1_0= ruleSimpleModel ) )
                    {
                    otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDigitOneKeyword_0_0());
                    			
                    // InternalUnorderedGroupsTestLanguage.g:79:4: ( (lv_first_1_0= ruleSimpleModel ) )
                    // InternalUnorderedGroupsTestLanguage.g:80:5: (lv_first_1_0= ruleSimpleModel )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:80:5: (lv_first_1_0= ruleSimpleModel )
                    // InternalUnorderedGroupsTestLanguage.g:81:6: lv_first_1_0= ruleSimpleModel
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getFirstSimpleModelParserRuleCall_0_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_first_1_0=ruleSimpleModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"first",
                    							lv_first_1_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.SimpleModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnorderedGroupsTestLanguage.g:100:3: (otherlv_2= '2' ( (lv_second_3_0= ruleMandatoryModel ) ) )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:100:3: (otherlv_2= '2' ( (lv_second_3_0= ruleMandatoryModel ) ) )
                    // InternalUnorderedGroupsTestLanguage.g:101:4: otherlv_2= '2' ( (lv_second_3_0= ruleMandatoryModel ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDigitTwoKeyword_1_0());
                    			
                    // InternalUnorderedGroupsTestLanguage.g:105:4: ( (lv_second_3_0= ruleMandatoryModel ) )
                    // InternalUnorderedGroupsTestLanguage.g:106:5: (lv_second_3_0= ruleMandatoryModel )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:106:5: (lv_second_3_0= ruleMandatoryModel )
                    // InternalUnorderedGroupsTestLanguage.g:107:6: lv_second_3_0= ruleMandatoryModel
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getSecondMandatoryModelParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_second_3_0=ruleMandatoryModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"second",
                    							lv_second_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.MandatoryModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUnorderedGroupsTestLanguage.g:126:3: (otherlv_4= '3' ( (lv_thrird_5_0= ruleLoopedModel ) ) )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:126:3: (otherlv_4= '3' ( (lv_thrird_5_0= ruleLoopedModel ) ) )
                    // InternalUnorderedGroupsTestLanguage.g:127:4: otherlv_4= '3' ( (lv_thrird_5_0= ruleLoopedModel ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getDigitThreeKeyword_2_0());
                    			
                    // InternalUnorderedGroupsTestLanguage.g:131:4: ( (lv_thrird_5_0= ruleLoopedModel ) )
                    // InternalUnorderedGroupsTestLanguage.g:132:5: (lv_thrird_5_0= ruleLoopedModel )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:132:5: (lv_thrird_5_0= ruleLoopedModel )
                    // InternalUnorderedGroupsTestLanguage.g:133:6: lv_thrird_5_0= ruleLoopedModel
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getThrirdLoopedModelParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_thrird_5_0=ruleLoopedModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"thrird",
                    							lv_thrird_5_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.LoopedModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUnorderedGroupsTestLanguage.g:152:3: (otherlv_6= '4' ( (lv_forth_7_0= ruleGroupLoopedModel ) ) )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:152:3: (otherlv_6= '4' ( (lv_forth_7_0= ruleGroupLoopedModel ) ) )
                    // InternalUnorderedGroupsTestLanguage.g:153:4: otherlv_6= '4' ( (lv_forth_7_0= ruleGroupLoopedModel ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getDigitFourKeyword_3_0());
                    			
                    // InternalUnorderedGroupsTestLanguage.g:157:4: ( (lv_forth_7_0= ruleGroupLoopedModel ) )
                    // InternalUnorderedGroupsTestLanguage.g:158:5: (lv_forth_7_0= ruleGroupLoopedModel )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:158:5: (lv_forth_7_0= ruleGroupLoopedModel )
                    // InternalUnorderedGroupsTestLanguage.g:159:6: lv_forth_7_0= ruleGroupLoopedModel
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getForthGroupLoopedModelParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_forth_7_0=ruleGroupLoopedModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"forth",
                    							lv_forth_7_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.GroupLoopedModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalUnorderedGroupsTestLanguage.g:178:3: (otherlv_8= '5' ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) ) )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:178:3: (otherlv_8= '5' ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) ) )
                    // InternalUnorderedGroupsTestLanguage.g:179:4: otherlv_8= '5' ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getDigitFiveKeyword_4_0());
                    			
                    // InternalUnorderedGroupsTestLanguage.g:183:4: ( (lv_fifth_9_0= ruleLoopedAlternativeModel ) )
                    // InternalUnorderedGroupsTestLanguage.g:184:5: (lv_fifth_9_0= ruleLoopedAlternativeModel )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:184:5: (lv_fifth_9_0= ruleLoopedAlternativeModel )
                    // InternalUnorderedGroupsTestLanguage.g:185:6: lv_fifth_9_0= ruleLoopedAlternativeModel
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getFifthLoopedAlternativeModelParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_fifth_9_0=ruleLoopedAlternativeModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"fifth",
                    							lv_fifth_9_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.LoopedAlternativeModel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalUnorderedGroupsTestLanguage.g:204:3: (otherlv_10= 'bug304681' ( (lv_model_11_0= ruleBug304681Model ) ) )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:204:3: (otherlv_10= 'bug304681' ( (lv_model_11_0= ruleBug304681Model ) ) )
                    // InternalUnorderedGroupsTestLanguage.g:205:4: otherlv_10= 'bug304681' ( (lv_model_11_0= ruleBug304681Model ) )
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getBug304681Keyword_5_0());
                    			
                    // InternalUnorderedGroupsTestLanguage.g:209:4: ( (lv_model_11_0= ruleBug304681Model ) )
                    // InternalUnorderedGroupsTestLanguage.g:210:5: (lv_model_11_0= ruleBug304681Model )
                    {
                    // InternalUnorderedGroupsTestLanguage.g:210:5: (lv_model_11_0= ruleBug304681Model )
                    // InternalUnorderedGroupsTestLanguage.g:211:6: lv_model_11_0= ruleBug304681Model
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getModelBug304681ModelParserRuleCall_5_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_model_11_0=ruleBug304681Model();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_11_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.Bug304681Model");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSimpleModel"
    // InternalUnorderedGroupsTestLanguage.g:233:1: entryRuleSimpleModel returns [EObject current=null] : iv_ruleSimpleModel= ruleSimpleModel EOF ;
    public final EObject entryRuleSimpleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleModel = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:233:52: (iv_ruleSimpleModel= ruleSimpleModel EOF )
            // InternalUnorderedGroupsTestLanguage.g:234:2: iv_ruleSimpleModel= ruleSimpleModel EOF
            {
             newCompositeNode(grammarAccess.getSimpleModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSimpleModel=ruleSimpleModel();

            state._fsp--;

             current =iv_ruleSimpleModel; 
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
    // $ANTLR end "entryRuleSimpleModel"


    // $ANTLR start "ruleSimpleModel"
    // InternalUnorderedGroupsTestLanguage.g:240:1: ruleSimpleModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) ;
    public final EObject ruleSimpleModel() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_1_1=null;
        Token lv_visibility_1_2=null;
        Token lv_visibility_1_3=null;
        Token lv_static_2_0=null;
        Token lv_synchronized_3_0=null;
        Token lv_abstract_4_0=null;
        Token lv_final_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

        try {
            // InternalUnorderedGroupsTestLanguage.g:241:1: ( ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) )
            // InternalUnorderedGroupsTestLanguage.g:242:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            {
            // InternalUnorderedGroupsTestLanguage.g:242:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            // InternalUnorderedGroupsTestLanguage.g:243:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}'
            {
            // InternalUnorderedGroupsTestLanguage.g:243:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) ) )
            // InternalUnorderedGroupsTestLanguage.g:244:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) )
            {
            // InternalUnorderedGroupsTestLanguage.g:244:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* ) )
            // InternalUnorderedGroupsTestLanguage.g:245:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0());
            				
            // InternalUnorderedGroupsTestLanguage.g:248:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )* )
            // InternalUnorderedGroupsTestLanguage.g:249:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )*
            {
            // InternalUnorderedGroupsTestLanguage.g:249:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )*
            loop4:
            do {
                int alt4=5;
                int LA4_0 = input.LA(1);

                if ( LA4_0 >= 17 && LA4_0 <= 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 2) ) {
                    alt4=3;
                }
                else if ( LA4_0 >= 22 && LA4_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 3) ) {
                    alt4=4;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUnorderedGroupsTestLanguage.g:250:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:250:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:251:5: {...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:251:108: ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:252:6: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:255:9: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:255:10: {...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:255:19: ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:255:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:255:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:256:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:256:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    int alt2=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // InternalUnorderedGroupsTestLanguage.g:257:11: lv_visibility_1_1= 'public'
            	            {
            	            lv_visibility_1_1=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_visibility_1_1, grammarAccess.getSimpleModelAccess().getVisibilityPublicKeyword_0_0_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getSimpleModelRule());
            	            											}
            	            											setWithLastConsumed(current, "visibility", lv_visibility_1_1, null);
            	            										

            	            }
            	            break;
            	        case 2 :
            	            // InternalUnorderedGroupsTestLanguage.g:268:11: lv_visibility_1_2= 'private'
            	            {
            	            lv_visibility_1_2=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_visibility_1_2, grammarAccess.getSimpleModelAccess().getVisibilityPrivateKeyword_0_0_0_1());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getSimpleModelRule());
            	            											}
            	            											setWithLastConsumed(current, "visibility", lv_visibility_1_2, null);
            	            										

            	            }
            	            break;
            	        case 3 :
            	            // InternalUnorderedGroupsTestLanguage.g:279:11: lv_visibility_1_3= 'protected'
            	            {
            	            lv_visibility_1_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_visibility_1_3, grammarAccess.getSimpleModelAccess().getVisibilityProtectedKeyword_0_0_0_2());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getSimpleModelRule());
            	            											}
            	            											setWithLastConsumed(current, "visibility", lv_visibility_1_3, null);
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnorderedGroupsTestLanguage.g:297:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:297:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:298:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:298:108: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:299:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:302:9: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:302:10: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:302:19: ( (lv_static_2_0= 'static' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:302:20: (lv_static_2_0= 'static' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:302:20: (lv_static_2_0= 'static' )
            	    // InternalUnorderedGroupsTestLanguage.g:303:10: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,20,FollowSets000.FOLLOW_3); 

            	    										newLeafNode(lv_static_2_0, grammarAccess.getSimpleModelAccess().getStaticStaticKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSimpleModelRule());
            	    										}
            	    										setWithLastConsumed(current, "static", lv_static_2_0 != null, "static");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnorderedGroupsTestLanguage.g:320:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:320:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:321:5: {...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:321:108: ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:322:6: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:325:9: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:325:10: {...}? => ( (lv_synchronized_3_0= 'synchronized' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:325:19: ( (lv_synchronized_3_0= 'synchronized' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:325:20: (lv_synchronized_3_0= 'synchronized' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:325:20: (lv_synchronized_3_0= 'synchronized' )
            	    // InternalUnorderedGroupsTestLanguage.g:326:10: lv_synchronized_3_0= 'synchronized'
            	    {
            	    lv_synchronized_3_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

            	    										newLeafNode(lv_synchronized_3_0, grammarAccess.getSimpleModelAccess().getSynchronizedSynchronizedKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getSimpleModelRule());
            	    										}
            	    										setWithLastConsumed(current, "synchronized", lv_synchronized_3_0 != null, "synchronized");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnorderedGroupsTestLanguage.g:343:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:343:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:344:5: {...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:344:108: ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:345:6: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:348:9: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:348:10: {...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSimpleModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:348:19: ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==22) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==23) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalUnorderedGroupsTestLanguage.g:348:20: ( (lv_abstract_4_0= 'abstract' ) )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:348:20: ( (lv_abstract_4_0= 'abstract' ) )
            	            // InternalUnorderedGroupsTestLanguage.g:349:10: (lv_abstract_4_0= 'abstract' )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:349:10: (lv_abstract_4_0= 'abstract' )
            	            // InternalUnorderedGroupsTestLanguage.g:350:11: lv_abstract_4_0= 'abstract'
            	            {
            	            lv_abstract_4_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_abstract_4_0, grammarAccess.getSimpleModelAccess().getAbstractAbstractKeyword_0_3_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getSimpleModelRule());
            	            											}
            	            											setWithLastConsumed(current, "abstract", lv_abstract_4_0 != null, "abstract");
            	            										

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnorderedGroupsTestLanguage.g:363:9: ( (lv_final_5_0= 'final' ) )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:363:9: ( (lv_final_5_0= 'final' ) )
            	            // InternalUnorderedGroupsTestLanguage.g:364:10: (lv_final_5_0= 'final' )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:364:10: (lv_final_5_0= 'final' )
            	            // InternalUnorderedGroupsTestLanguage.g:365:11: lv_final_5_0= 'final'
            	            {
            	            lv_final_5_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_final_5_0, grammarAccess.getSimpleModelAccess().getFinalFinalKeyword_0_3_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getSimpleModelRule());
            	            											}
            	            											setWithLastConsumed(current, "final", lv_final_5_0 != null, "final");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSimpleModelAccess().getUnorderedGroup_0());
            				

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getSimpleModelAccess().getClassKeyword_1());
            		
            // InternalUnorderedGroupsTestLanguage.g:394:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalUnorderedGroupsTestLanguage.g:395:4: (lv_name_7_0= RULE_ID )
            {
            // InternalUnorderedGroupsTestLanguage.g:395:4: (lv_name_7_0= RULE_ID )
            // InternalUnorderedGroupsTestLanguage.g:396:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_7_0, grammarAccess.getSimpleModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getSimpleModelAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSimpleModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSimpleModel"


    // $ANTLR start "entryRuleMandatoryModel"
    // InternalUnorderedGroupsTestLanguage.g:424:1: entryRuleMandatoryModel returns [EObject current=null] : iv_ruleMandatoryModel= ruleMandatoryModel EOF ;
    public final EObject entryRuleMandatoryModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryModel = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:424:55: (iv_ruleMandatoryModel= ruleMandatoryModel EOF )
            // InternalUnorderedGroupsTestLanguage.g:425:2: iv_ruleMandatoryModel= ruleMandatoryModel EOF
            {
             newCompositeNode(grammarAccess.getMandatoryModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMandatoryModel=ruleMandatoryModel();

            state._fsp--;

             current =iv_ruleMandatoryModel; 
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
    // $ANTLR end "entryRuleMandatoryModel"


    // $ANTLR start "ruleMandatoryModel"
    // InternalUnorderedGroupsTestLanguage.g:431:1: ruleMandatoryModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) ;
    public final EObject ruleMandatoryModel() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_1_1=null;
        Token lv_visibility_1_2=null;
        Token lv_visibility_1_3=null;
        Token lv_static_2_0=null;
        Token lv_synchronized_3_0=null;
        Token lv_abstract_4_0=null;
        Token lv_final_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

        try {
            // InternalUnorderedGroupsTestLanguage.g:432:1: ( ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) )
            // InternalUnorderedGroupsTestLanguage.g:433:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            {
            // InternalUnorderedGroupsTestLanguage.g:433:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            // InternalUnorderedGroupsTestLanguage.g:434:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}'
            {
            // InternalUnorderedGroupsTestLanguage.g:434:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) )
            // InternalUnorderedGroupsTestLanguage.g:435:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalUnorderedGroupsTestLanguage.g:435:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) )
            // InternalUnorderedGroupsTestLanguage.g:436:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0());
            				
            // InternalUnorderedGroupsTestLanguage.g:439:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?)
            // InternalUnorderedGroupsTestLanguage.g:440:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?
            {
            // InternalUnorderedGroupsTestLanguage.g:440:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( LA7_0 >= 17 && LA7_0 <= 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 >= 22 && LA7_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 3) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUnorderedGroupsTestLanguage.g:441:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:441:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:442:5: {...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:442:111: ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:443:6: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:446:9: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:446:10: {...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:446:19: ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:446:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:446:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:447:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:447:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 19:
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
            	            // InternalUnorderedGroupsTestLanguage.g:448:11: lv_visibility_1_1= 'public'
            	            {
            	            lv_visibility_1_1=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_visibility_1_1, grammarAccess.getMandatoryModelAccess().getVisibilityPublicKeyword_0_0_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getMandatoryModelRule());
            	            											}
            	            											setWithLastConsumed(current, "visibility", lv_visibility_1_1, null);
            	            										

            	            }
            	            break;
            	        case 2 :
            	            // InternalUnorderedGroupsTestLanguage.g:459:11: lv_visibility_1_2= 'private'
            	            {
            	            lv_visibility_1_2=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_visibility_1_2, grammarAccess.getMandatoryModelAccess().getVisibilityPrivateKeyword_0_0_0_1());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getMandatoryModelRule());
            	            											}
            	            											setWithLastConsumed(current, "visibility", lv_visibility_1_2, null);
            	            										

            	            }
            	            break;
            	        case 3 :
            	            // InternalUnorderedGroupsTestLanguage.g:470:11: lv_visibility_1_3= 'protected'
            	            {
            	            lv_visibility_1_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_visibility_1_3, grammarAccess.getMandatoryModelAccess().getVisibilityProtectedKeyword_0_0_0_2());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getMandatoryModelRule());
            	            											}
            	            											setWithLastConsumed(current, "visibility", lv_visibility_1_3, null);
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnorderedGroupsTestLanguage.g:488:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:488:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:489:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:489:111: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:490:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:493:9: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:493:10: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:493:19: ( (lv_static_2_0= 'static' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:493:20: (lv_static_2_0= 'static' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:493:20: (lv_static_2_0= 'static' )
            	    // InternalUnorderedGroupsTestLanguage.g:494:10: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,20,FollowSets000.FOLLOW_3); 

            	    										newLeafNode(lv_static_2_0, grammarAccess.getMandatoryModelAccess().getStaticStaticKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMandatoryModelRule());
            	    										}
            	    										setWithLastConsumed(current, "static", lv_static_2_0 != null, "static");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnorderedGroupsTestLanguage.g:511:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:511:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:512:5: {...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:512:111: ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:513:6: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:516:9: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:516:10: {...}? => ( (lv_synchronized_3_0= 'synchronized' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:516:19: ( (lv_synchronized_3_0= 'synchronized' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:516:20: (lv_synchronized_3_0= 'synchronized' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:516:20: (lv_synchronized_3_0= 'synchronized' )
            	    // InternalUnorderedGroupsTestLanguage.g:517:10: lv_synchronized_3_0= 'synchronized'
            	    {
            	    lv_synchronized_3_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

            	    										newLeafNode(lv_synchronized_3_0, grammarAccess.getMandatoryModelAccess().getSynchronizedSynchronizedKeyword_0_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMandatoryModelRule());
            	    										}
            	    										setWithLastConsumed(current, "synchronized", lv_synchronized_3_0 != null, "synchronized");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnorderedGroupsTestLanguage.g:534:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:534:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:535:5: {...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:535:111: ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:536:6: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:539:9: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:539:10: {...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMandatoryModel", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:539:19: ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==22) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==23) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalUnorderedGroupsTestLanguage.g:539:20: ( (lv_abstract_4_0= 'abstract' ) )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:539:20: ( (lv_abstract_4_0= 'abstract' ) )
            	            // InternalUnorderedGroupsTestLanguage.g:540:10: (lv_abstract_4_0= 'abstract' )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:540:10: (lv_abstract_4_0= 'abstract' )
            	            // InternalUnorderedGroupsTestLanguage.g:541:11: lv_abstract_4_0= 'abstract'
            	            {
            	            lv_abstract_4_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_abstract_4_0, grammarAccess.getMandatoryModelAccess().getAbstractAbstractKeyword_0_3_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getMandatoryModelRule());
            	            											}
            	            											setWithLastConsumed(current, "abstract", lv_abstract_4_0 != null, "abstract");
            	            										

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnorderedGroupsTestLanguage.g:554:9: ( (lv_final_5_0= 'final' ) )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:554:9: ( (lv_final_5_0= 'final' ) )
            	            // InternalUnorderedGroupsTestLanguage.g:555:10: (lv_final_5_0= 'final' )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:555:10: (lv_final_5_0= 'final' )
            	            // InternalUnorderedGroupsTestLanguage.g:556:11: lv_final_5_0= 'final'
            	            {
            	            lv_final_5_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            	            											newLeafNode(lv_final_5_0, grammarAccess.getMandatoryModelAccess().getFinalFinalKeyword_0_3_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getMandatoryModelRule());
            	            											}
            	            											setWithLastConsumed(current, "final", lv_final_5_0 != null, "final");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0());
            	    					

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0()) ) {
                throw new FailedPredicateException(input, "ruleMandatoryModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMandatoryModelAccess().getUnorderedGroup_0());
            				

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMandatoryModelAccess().getClassKeyword_1());
            		
            // InternalUnorderedGroupsTestLanguage.g:586:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalUnorderedGroupsTestLanguage.g:587:4: (lv_name_7_0= RULE_ID )
            {
            // InternalUnorderedGroupsTestLanguage.g:587:4: (lv_name_7_0= RULE_ID )
            // InternalUnorderedGroupsTestLanguage.g:588:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMandatoryModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMandatoryModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getMandatoryModelAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMandatoryModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMandatoryModel"


    // $ANTLR start "entryRuleLoopedModel"
    // InternalUnorderedGroupsTestLanguage.g:616:1: entryRuleLoopedModel returns [EObject current=null] : iv_ruleLoopedModel= ruleLoopedModel EOF ;
    public final EObject entryRuleLoopedModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopedModel = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:616:52: (iv_ruleLoopedModel= ruleLoopedModel EOF )
            // InternalUnorderedGroupsTestLanguage.g:617:2: iv_ruleLoopedModel= ruleLoopedModel EOF
            {
             newCompositeNode(grammarAccess.getLoopedModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLoopedModel=ruleLoopedModel();

            state._fsp--;

             current =iv_ruleLoopedModel; 
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
    // $ANTLR end "entryRuleLoopedModel"


    // $ANTLR start "ruleLoopedModel"
    // InternalUnorderedGroupsTestLanguage.g:623:1: ruleLoopedModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) ;
    public final EObject ruleLoopedModel() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_1_1=null;
        Token lv_visibility_1_2=null;
        Token lv_visibility_1_3=null;
        Token lv_static_2_0=null;
        Token lv_synchronized_3_0=null;
        Token lv_abstract_4_0=null;
        Token lv_final_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

        try {
            // InternalUnorderedGroupsTestLanguage.g:624:1: ( ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) )
            // InternalUnorderedGroupsTestLanguage.g:625:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            {
            // InternalUnorderedGroupsTestLanguage.g:625:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            // InternalUnorderedGroupsTestLanguage.g:626:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) ) ) otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}'
            {
            // InternalUnorderedGroupsTestLanguage.g:626:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) ) )
            // InternalUnorderedGroupsTestLanguage.g:627:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) )
            {
            // InternalUnorderedGroupsTestLanguage.g:627:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* ) )
            // InternalUnorderedGroupsTestLanguage.g:628:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0());
            				
            // InternalUnorderedGroupsTestLanguage.g:631:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )* )
            // InternalUnorderedGroupsTestLanguage.g:632:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )*
            {
            // InternalUnorderedGroupsTestLanguage.g:632:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) ) )*
            loop14:
            do {
                int alt14=5;
                int LA14_0 = input.LA(1);

                if ( LA14_0 >= 17 && LA14_0 <= 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 >= 22 && LA14_0 <= 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 3) ) {
                    alt14=4;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUnorderedGroupsTestLanguage.g:633:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:633:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ ) )
            	    // InternalUnorderedGroupsTestLanguage.g:634:5: {...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:634:108: ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+ )
            	    // InternalUnorderedGroupsTestLanguage.g:635:6: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 0);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:638:9: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        switch ( input.LA(1) ) {
            	        case 17:
            	            {
            	            int LA9_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	            }
            	            break;
            	        case 18:
            	            {
            	            int LA9_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	            }
            	            break;
            	        case 19:
            	            {
            	            int LA9_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:638:10: {...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:638:19: ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:638:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:638:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:639:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:639:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    	    int alt8=3;
            	    	    switch ( input.LA(1) ) {
            	    	    case 17:
            	    	        {
            	    	        alt8=1;
            	    	        }
            	    	        break;
            	    	    case 18:
            	    	        {
            	    	        alt8=2;
            	    	        }
            	    	        break;
            	    	    case 19:
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
            	    	            // InternalUnorderedGroupsTestLanguage.g:640:11: lv_visibility_1_1= 'public'
            	    	            {
            	    	            lv_visibility_1_1=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_visibility_1_1, grammarAccess.getLoopedModelAccess().getVisibilityPublicKeyword_0_0_0_0());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "visibility", lv_visibility_1_1, null);
            	    	            										

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:651:11: lv_visibility_1_2= 'private'
            	    	            {
            	    	            lv_visibility_1_2=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_visibility_1_2, grammarAccess.getLoopedModelAccess().getVisibilityPrivateKeyword_0_0_0_1());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "visibility", lv_visibility_1_2, null);
            	    	            										

            	    	            }
            	    	            break;
            	    	        case 3 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:662:11: lv_visibility_1_3= 'protected'
            	    	            {
            	    	            lv_visibility_1_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_visibility_1_3, grammarAccess.getLoopedModelAccess().getVisibilityProtectedKeyword_0_0_0_2());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "visibility", lv_visibility_1_3, null);
            	    	            										

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnorderedGroupsTestLanguage.g:680:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:680:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ ) )
            	    // InternalUnorderedGroupsTestLanguage.g:681:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:681:108: ( ({...}? => ( (lv_static_2_0= 'static' ) ) )+ )
            	    // InternalUnorderedGroupsTestLanguage.g:682:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 1);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:685:9: ({...}? => ( (lv_static_2_0= 'static' ) ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==20) ) {
            	            int LA10_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt10=1;
            	            }


            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:685:10: {...}? => ( (lv_static_2_0= 'static' ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:685:19: ( (lv_static_2_0= 'static' ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:685:20: (lv_static_2_0= 'static' )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:685:20: (lv_static_2_0= 'static' )
            	    	    // InternalUnorderedGroupsTestLanguage.g:686:10: lv_static_2_0= 'static'
            	    	    {
            	    	    lv_static_2_0=(Token)match(input,20,FollowSets000.FOLLOW_3); 

            	    	    										newLeafNode(lv_static_2_0, grammarAccess.getLoopedModelAccess().getStaticStaticKeyword_0_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getLoopedModelRule());
            	    	    										}
            	    	    										addWithLastConsumed(current, "static", lv_static_2_0, "static");
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnorderedGroupsTestLanguage.g:703:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:703:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ ) )
            	    // InternalUnorderedGroupsTestLanguage.g:704:5: {...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:704:108: ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+ )
            	    // InternalUnorderedGroupsTestLanguage.g:705:6: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 2);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:708:9: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==21) ) {
            	            int LA11_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt11=1;
            	            }


            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:708:10: {...}? => ( (lv_synchronized_3_0= 'synchronized' ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:708:19: ( (lv_synchronized_3_0= 'synchronized' ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:708:20: (lv_synchronized_3_0= 'synchronized' )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:708:20: (lv_synchronized_3_0= 'synchronized' )
            	    	    // InternalUnorderedGroupsTestLanguage.g:709:10: lv_synchronized_3_0= 'synchronized'
            	    	    {
            	    	    lv_synchronized_3_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

            	    	    										newLeafNode(lv_synchronized_3_0, grammarAccess.getLoopedModelAccess().getSynchronizedSynchronizedKeyword_0_2_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getLoopedModelRule());
            	    	    										}
            	    	    										addWithLastConsumed(current, "synchronized", lv_synchronized_3_0, "synchronized");
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnorderedGroupsTestLanguage.g:726:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:726:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ ) )
            	    // InternalUnorderedGroupsTestLanguage.g:727:5: {...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 3)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:727:108: ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+ )
            	    // InternalUnorderedGroupsTestLanguage.g:728:6: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0(), 3);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:731:9: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=2;
            	        int LA13_0 = input.LA(1);

            	        if ( (LA13_0==22) ) {
            	            int LA13_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt13=1;
            	            }


            	        }
            	        else if ( (LA13_0==23) ) {
            	            int LA13_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt13=1;
            	            }


            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:731:10: {...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:731:19: ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    	    int alt12=2;
            	    	    int LA12_0 = input.LA(1);

            	    	    if ( (LA12_0==22) ) {
            	    	        alt12=1;
            	    	    }
            	    	    else if ( (LA12_0==23) ) {
            	    	        alt12=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 12, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt12) {
            	    	        case 1 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:731:20: ( (lv_abstract_4_0= 'abstract' ) )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:731:20: ( (lv_abstract_4_0= 'abstract' ) )
            	    	            // InternalUnorderedGroupsTestLanguage.g:732:10: (lv_abstract_4_0= 'abstract' )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:732:10: (lv_abstract_4_0= 'abstract' )
            	    	            // InternalUnorderedGroupsTestLanguage.g:733:11: lv_abstract_4_0= 'abstract'
            	    	            {
            	    	            lv_abstract_4_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_abstract_4_0, grammarAccess.getLoopedModelAccess().getAbstractAbstractKeyword_0_3_0_0());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "abstract", lv_abstract_4_0, "abstract");
            	    	            										

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:746:9: ( (lv_final_5_0= 'final' ) )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:746:9: ( (lv_final_5_0= 'final' ) )
            	    	            // InternalUnorderedGroupsTestLanguage.g:747:10: (lv_final_5_0= 'final' )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:747:10: (lv_final_5_0= 'final' )
            	    	            // InternalUnorderedGroupsTestLanguage.g:748:11: lv_final_5_0= 'final'
            	    	            {
            	    	            lv_final_5_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_final_5_0, grammarAccess.getLoopedModelAccess().getFinalFinalKeyword_0_3_1_0());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "final", lv_final_5_0, "final");
            	    	            										

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLoopedModelAccess().getUnorderedGroup_0());
            				

            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopedModelAccess().getClassKeyword_1());
            		
            // InternalUnorderedGroupsTestLanguage.g:777:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalUnorderedGroupsTestLanguage.g:778:4: (lv_name_7_0= RULE_ID )
            {
            // InternalUnorderedGroupsTestLanguage.g:778:4: (lv_name_7_0= RULE_ID )
            // InternalUnorderedGroupsTestLanguage.g:779:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_7_0, grammarAccess.getLoopedModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopedModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getLoopedModelAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopedModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLoopedModel"


    // $ANTLR start "entryRuleGroupLoopedModel"
    // InternalUnorderedGroupsTestLanguage.g:807:1: entryRuleGroupLoopedModel returns [EObject current=null] : iv_ruleGroupLoopedModel= ruleGroupLoopedModel EOF ;
    public final EObject entryRuleGroupLoopedModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupLoopedModel = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:807:57: (iv_ruleGroupLoopedModel= ruleGroupLoopedModel EOF )
            // InternalUnorderedGroupsTestLanguage.g:808:2: iv_ruleGroupLoopedModel= ruleGroupLoopedModel EOF
            {
             newCompositeNode(grammarAccess.getGroupLoopedModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGroupLoopedModel=ruleGroupLoopedModel();

            state._fsp--;

             current =iv_ruleGroupLoopedModel; 
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
    // $ANTLR end "entryRuleGroupLoopedModel"


    // $ANTLR start "ruleGroupLoopedModel"
    // InternalUnorderedGroupsTestLanguage.g:814:1: ruleGroupLoopedModel returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) )* otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) ;
    public final EObject ruleGroupLoopedModel() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_1_1=null;
        Token lv_visibility_1_2=null;
        Token lv_visibility_1_3=null;
        Token lv_static_2_0=null;
        Token lv_synchronized_3_0=null;
        Token lv_abstract_4_0=null;
        Token lv_final_5_0=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

        try {
            // InternalUnorderedGroupsTestLanguage.g:815:1: ( ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) )* otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' ) )
            // InternalUnorderedGroupsTestLanguage.g:816:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) )* otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            {
            // InternalUnorderedGroupsTestLanguage.g:816:2: ( ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) )* otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}' )
            // InternalUnorderedGroupsTestLanguage.g:817:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) )* otherlv_6= 'class' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= '{' otherlv_9= '}'
            {
            // InternalUnorderedGroupsTestLanguage.g:817:3: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=23)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUnorderedGroupsTestLanguage.g:818:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:818:4: ( ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?) )
            	    // InternalUnorderedGroupsTestLanguage.g:819:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?)
            	    {
            	     
            	    				  getUnorderedGroupHelper().enter(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0());
            	    				
            	    // InternalUnorderedGroupsTestLanguage.g:822:5: ( ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?)
            	    // InternalUnorderedGroupsTestLanguage.g:823:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+ {...}?
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:823:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=5;
            	        alt17 = dfa17.predict(input);
            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:824:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:824:4: ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:825:5: {...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 0) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 0)");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:825:113: ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:826:6: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )
            	    	    {

            	    	    						getUnorderedGroupHelper().select(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 0);
            	    	    					
            	    	    // InternalUnorderedGroupsTestLanguage.g:829:9: ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:829:10: {...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:829:19: ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:829:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:829:20: ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:830:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:830:10: (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' )
            	    	    int alt15=3;
            	    	    switch ( input.LA(1) ) {
            	    	    case 17:
            	    	        {
            	    	        alt15=1;
            	    	        }
            	    	        break;
            	    	    case 18:
            	    	        {
            	    	        alt15=2;
            	    	        }
            	    	        break;
            	    	    case 19:
            	    	        {
            	    	        alt15=3;
            	    	        }
            	    	        break;
            	    	    default:
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 15, 0, input);

            	    	        throw nvae;
            	    	    }

            	    	    switch (alt15) {
            	    	        case 1 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:831:11: lv_visibility_1_1= 'public'
            	    	            {
            	    	            lv_visibility_1_1=(Token)match(input,17,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_visibility_1_1, grammarAccess.getGroupLoopedModelAccess().getVisibilityPublicKeyword_0_0_0_0());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "visibility", lv_visibility_1_1, null);
            	    	            										

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:842:11: lv_visibility_1_2= 'private'
            	    	            {
            	    	            lv_visibility_1_2=(Token)match(input,18,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_visibility_1_2, grammarAccess.getGroupLoopedModelAccess().getVisibilityPrivateKeyword_0_0_0_1());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "visibility", lv_visibility_1_2, null);
            	    	            										

            	    	            }
            	    	            break;
            	    	        case 3 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:853:11: lv_visibility_1_3= 'protected'
            	    	            {
            	    	            lv_visibility_1_3=(Token)match(input,19,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_visibility_1_3, grammarAccess.getGroupLoopedModelAccess().getVisibilityProtectedKeyword_0_0_0_2());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "visibility", lv_visibility_1_3, null);
            	    	            										

            	    	            }
            	    	            break;

            	    	    }


            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0());
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:871:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:871:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:872:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 1) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 1)");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:872:113: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:873:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    	    {

            	    	    						getUnorderedGroupHelper().select(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 1);
            	    	    					
            	    	    // InternalUnorderedGroupsTestLanguage.g:876:9: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:876:10: {...}? => ( (lv_static_2_0= 'static' ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:876:19: ( (lv_static_2_0= 'static' ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:876:20: (lv_static_2_0= 'static' )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:876:20: (lv_static_2_0= 'static' )
            	    	    // InternalUnorderedGroupsTestLanguage.g:877:10: lv_static_2_0= 'static'
            	    	    {
            	    	    lv_static_2_0=(Token)match(input,20,FollowSets000.FOLLOW_3); 

            	    	    										newLeafNode(lv_static_2_0, grammarAccess.getGroupLoopedModelAccess().getStaticStaticKeyword_0_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            	    	    										}
            	    	    										addWithLastConsumed(current, "static", lv_static_2_0, "static");
            	    	    									

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0());
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:894:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:894:4: ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:895:5: {...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 2) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 2)");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:895:113: ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:896:6: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )
            	    	    {

            	    	    						getUnorderedGroupHelper().select(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 2);
            	    	    					
            	    	    // InternalUnorderedGroupsTestLanguage.g:899:9: ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:899:10: {...}? => ( (lv_synchronized_3_0= 'synchronized' ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:899:19: ( (lv_synchronized_3_0= 'synchronized' ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:899:20: (lv_synchronized_3_0= 'synchronized' )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:899:20: (lv_synchronized_3_0= 'synchronized' )
            	    	    // InternalUnorderedGroupsTestLanguage.g:900:10: lv_synchronized_3_0= 'synchronized'
            	    	    {
            	    	    lv_synchronized_3_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

            	    	    										newLeafNode(lv_synchronized_3_0, grammarAccess.getGroupLoopedModelAccess().getSynchronizedSynchronizedKeyword_0_2_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            	    	    										}
            	    	    										addWithLastConsumed(current, "synchronized", lv_synchronized_3_0, "synchronized");
            	    	    									

            	    	    }


            	    	    }


            	    	    }

            	    	     
            	    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0());
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:917:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:917:4: ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:918:5: {...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) )
            	    	    {
            	    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 3) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 3)");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:918:113: ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:919:6: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )
            	    	    {

            	    	    						getUnorderedGroupHelper().select(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 3);
            	    	    					
            	    	    // InternalUnorderedGroupsTestLanguage.g:922:9: ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:922:10: {...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:922:19: ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) )
            	    	    int alt16=2;
            	    	    int LA16_0 = input.LA(1);

            	    	    if ( (LA16_0==22) ) {
            	    	        alt16=1;
            	    	    }
            	    	    else if ( (LA16_0==23) ) {
            	    	        alt16=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 16, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt16) {
            	    	        case 1 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:922:20: ( (lv_abstract_4_0= 'abstract' ) )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:922:20: ( (lv_abstract_4_0= 'abstract' ) )
            	    	            // InternalUnorderedGroupsTestLanguage.g:923:10: (lv_abstract_4_0= 'abstract' )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:923:10: (lv_abstract_4_0= 'abstract' )
            	    	            // InternalUnorderedGroupsTestLanguage.g:924:11: lv_abstract_4_0= 'abstract'
            	    	            {
            	    	            lv_abstract_4_0=(Token)match(input,22,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_abstract_4_0, grammarAccess.getGroupLoopedModelAccess().getAbstractAbstractKeyword_0_3_0_0());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "abstract", lv_abstract_4_0, "abstract");
            	    	            										

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalUnorderedGroupsTestLanguage.g:937:9: ( (lv_final_5_0= 'final' ) )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:937:9: ( (lv_final_5_0= 'final' ) )
            	    	            // InternalUnorderedGroupsTestLanguage.g:938:10: (lv_final_5_0= 'final' )
            	    	            {
            	    	            // InternalUnorderedGroupsTestLanguage.g:938:10: (lv_final_5_0= 'final' )
            	    	            // InternalUnorderedGroupsTestLanguage.g:939:11: lv_final_5_0= 'final'
            	    	            {
            	    	            lv_final_5_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            	    	            											newLeafNode(lv_final_5_0, grammarAccess.getGroupLoopedModelAccess().getFinalFinalKeyword_0_3_1_0());
            	    	            										

            	    	            											if (current==null) {
            	    	            												current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            	    	            											}
            	    	            											addWithLastConsumed(current, "final", lv_final_5_0, "final");
            	    	            										

            	    	            }


            	    	            }


            	    	            }
            	    	            break;

            	    	    }


            	    	    }

            	    	     
            	    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0());
            	    	    					

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt17 >= 1 ) break loop17;
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {
            	        throw new FailedPredicateException(input, "ruleGroupLoopedModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0())");
            	    }

            	    }


            	    }

            	     
            	    				  getUnorderedGroupHelper().leave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0());
            	    				

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupLoopedModelAccess().getClassKeyword_1());
            		
            // InternalUnorderedGroupsTestLanguage.g:969:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalUnorderedGroupsTestLanguage.g:970:4: (lv_name_7_0= RULE_ID )
            {
            // InternalUnorderedGroupsTestLanguage.g:970:4: (lv_name_7_0= RULE_ID )
            // InternalUnorderedGroupsTestLanguage.g:971:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_7_0, grammarAccess.getGroupLoopedModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupLoopedModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getGroupLoopedModelAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_9=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGroupLoopedModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGroupLoopedModel"


    // $ANTLR start "entryRuleLoopedAlternativeModel"
    // InternalUnorderedGroupsTestLanguage.g:999:1: entryRuleLoopedAlternativeModel returns [EObject current=null] : iv_ruleLoopedAlternativeModel= ruleLoopedAlternativeModel EOF ;
    public final EObject entryRuleLoopedAlternativeModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopedAlternativeModel = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:999:63: (iv_ruleLoopedAlternativeModel= ruleLoopedAlternativeModel EOF )
            // InternalUnorderedGroupsTestLanguage.g:1000:2: iv_ruleLoopedAlternativeModel= ruleLoopedAlternativeModel EOF
            {
             newCompositeNode(grammarAccess.getLoopedAlternativeModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLoopedAlternativeModel=ruleLoopedAlternativeModel();

            state._fsp--;

             current =iv_ruleLoopedAlternativeModel; 
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
    // $ANTLR end "entryRuleLoopedAlternativeModel"


    // $ANTLR start "ruleLoopedAlternativeModel"
    // InternalUnorderedGroupsTestLanguage.g:1006:1: ruleLoopedAlternativeModel returns [EObject current=null] : ( ( ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) ) | ( (lv_static_1_0= 'static' ) ) | ( (lv_synchronized_2_0= 'synchronized' ) ) | ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) ) | (otherlv_5= 'before' (otherlv_6= 'after' )* ) )* otherlv_7= 'class' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '{' otherlv_10= '}' ) ;
    public final EObject ruleLoopedAlternativeModel() throws RecognitionException {
        EObject current = null;

        Token lv_visibility_0_1=null;
        Token lv_visibility_0_2=null;
        Token lv_visibility_0_3=null;
        Token lv_static_1_0=null;
        Token lv_synchronized_2_0=null;
        Token lv_abstract_3_0=null;
        Token lv_final_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

        try {
            // InternalUnorderedGroupsTestLanguage.g:1007:1: ( ( ( ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) ) | ( (lv_static_1_0= 'static' ) ) | ( (lv_synchronized_2_0= 'synchronized' ) ) | ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) ) | (otherlv_5= 'before' (otherlv_6= 'after' )* ) )* otherlv_7= 'class' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '{' otherlv_10= '}' ) )
            // InternalUnorderedGroupsTestLanguage.g:1008:2: ( ( ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) ) | ( (lv_static_1_0= 'static' ) ) | ( (lv_synchronized_2_0= 'synchronized' ) ) | ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) ) | (otherlv_5= 'before' (otherlv_6= 'after' )* ) )* otherlv_7= 'class' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '{' otherlv_10= '}' )
            {
            // InternalUnorderedGroupsTestLanguage.g:1008:2: ( ( ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) ) | ( (lv_static_1_0= 'static' ) ) | ( (lv_synchronized_2_0= 'synchronized' ) ) | ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) ) | (otherlv_5= 'before' (otherlv_6= 'after' )* ) )* otherlv_7= 'class' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '{' otherlv_10= '}' )
            // InternalUnorderedGroupsTestLanguage.g:1009:3: ( ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) ) | ( (lv_static_1_0= 'static' ) ) | ( (lv_synchronized_2_0= 'synchronized' ) ) | ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) ) | (otherlv_5= 'before' (otherlv_6= 'after' )* ) )* otherlv_7= 'class' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= '{' otherlv_10= '}'
            {
            // InternalUnorderedGroupsTestLanguage.g:1009:3: ( ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) ) | ( (lv_static_1_0= 'static' ) ) | ( (lv_synchronized_2_0= 'synchronized' ) ) | ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) ) | (otherlv_5= 'before' (otherlv_6= 'after' )* ) )*
            loop22:
            do {
                int alt22=6;
                switch ( input.LA(1) ) {
                case 17:
                case 18:
                case 19:
                    {
                    alt22=1;
                    }
                    break;
                case 20:
                    {
                    alt22=2;
                    }
                    break;
                case 21:
                    {
                    alt22=3;
                    }
                    break;
                case 22:
                case 23:
                    {
                    alt22=4;
                    }
                    break;
                case 27:
                    {
                    alt22=5;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalUnorderedGroupsTestLanguage.g:1010:4: ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1010:4: ( ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1011:5: ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1011:5: ( (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1012:6: (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1012:6: (lv_visibility_0_1= 'public' | lv_visibility_0_2= 'private' | lv_visibility_0_3= 'protected' )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // InternalUnorderedGroupsTestLanguage.g:1013:7: lv_visibility_0_1= 'public'
            	            {
            	            lv_visibility_0_1=(Token)match(input,17,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_visibility_0_1, grammarAccess.getLoopedAlternativeModelAccess().getVisibilityPublicKeyword_0_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            	            							}
            	            							addWithLastConsumed(current, "visibility", lv_visibility_0_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalUnorderedGroupsTestLanguage.g:1024:7: lv_visibility_0_2= 'private'
            	            {
            	            lv_visibility_0_2=(Token)match(input,18,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_visibility_0_2, grammarAccess.getLoopedAlternativeModelAccess().getVisibilityPrivateKeyword_0_0_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            	            							}
            	            							addWithLastConsumed(current, "visibility", lv_visibility_0_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalUnorderedGroupsTestLanguage.g:1035:7: lv_visibility_0_3= 'protected'
            	            {
            	            lv_visibility_0_3=(Token)match(input,19,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_visibility_0_3, grammarAccess.getLoopedAlternativeModelAccess().getVisibilityProtectedKeyword_0_0_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            	            							}
            	            							addWithLastConsumed(current, "visibility", lv_visibility_0_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnorderedGroupsTestLanguage.g:1049:4: ( (lv_static_1_0= 'static' ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1049:4: ( (lv_static_1_0= 'static' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1050:5: (lv_static_1_0= 'static' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1050:5: (lv_static_1_0= 'static' )
            	    // InternalUnorderedGroupsTestLanguage.g:1051:6: lv_static_1_0= 'static'
            	    {
            	    lv_static_1_0=(Token)match(input,20,FollowSets000.FOLLOW_5); 

            	    						newLeafNode(lv_static_1_0, grammarAccess.getLoopedAlternativeModelAccess().getStaticStaticKeyword_0_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            	    						}
            	    						addWithLastConsumed(current, "static", lv_static_1_0, "static");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnorderedGroupsTestLanguage.g:1064:4: ( (lv_synchronized_2_0= 'synchronized' ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1064:4: ( (lv_synchronized_2_0= 'synchronized' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1065:5: (lv_synchronized_2_0= 'synchronized' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1065:5: (lv_synchronized_2_0= 'synchronized' )
            	    // InternalUnorderedGroupsTestLanguage.g:1066:6: lv_synchronized_2_0= 'synchronized'
            	    {
            	    lv_synchronized_2_0=(Token)match(input,21,FollowSets000.FOLLOW_5); 

            	    						newLeafNode(lv_synchronized_2_0, grammarAccess.getLoopedAlternativeModelAccess().getSynchronizedSynchronizedKeyword_0_2_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            	    						}
            	    						addWithLastConsumed(current, "synchronized", lv_synchronized_2_0, "synchronized");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnorderedGroupsTestLanguage.g:1079:4: ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1079:4: ( ( (lv_abstract_3_0= 'abstract' ) ) | ( (lv_final_4_0= 'final' ) ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==22) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==23) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalUnorderedGroupsTestLanguage.g:1080:5: ( (lv_abstract_3_0= 'abstract' ) )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:1080:5: ( (lv_abstract_3_0= 'abstract' ) )
            	            // InternalUnorderedGroupsTestLanguage.g:1081:6: (lv_abstract_3_0= 'abstract' )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:1081:6: (lv_abstract_3_0= 'abstract' )
            	            // InternalUnorderedGroupsTestLanguage.g:1082:7: lv_abstract_3_0= 'abstract'
            	            {
            	            lv_abstract_3_0=(Token)match(input,22,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_abstract_3_0, grammarAccess.getLoopedAlternativeModelAccess().getAbstractAbstractKeyword_0_3_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            	            							}
            	            							addWithLastConsumed(current, "abstract", lv_abstract_3_0, "abstract");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalUnorderedGroupsTestLanguage.g:1095:5: ( (lv_final_4_0= 'final' ) )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:1095:5: ( (lv_final_4_0= 'final' ) )
            	            // InternalUnorderedGroupsTestLanguage.g:1096:6: (lv_final_4_0= 'final' )
            	            {
            	            // InternalUnorderedGroupsTestLanguage.g:1096:6: (lv_final_4_0= 'final' )
            	            // InternalUnorderedGroupsTestLanguage.g:1097:7: lv_final_4_0= 'final'
            	            {
            	            lv_final_4_0=(Token)match(input,23,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_final_4_0, grammarAccess.getLoopedAlternativeModelAccess().getFinalFinalKeyword_0_3_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            	            							}
            	            							addWithLastConsumed(current, "final", lv_final_4_0, "final");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalUnorderedGroupsTestLanguage.g:1111:4: (otherlv_5= 'before' (otherlv_6= 'after' )* )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1111:4: (otherlv_5= 'before' (otherlv_6= 'after' )* )
            	    // InternalUnorderedGroupsTestLanguage.g:1112:5: otherlv_5= 'before' (otherlv_6= 'after' )*
            	    {
            	    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_9); 

            	    					newLeafNode(otherlv_5, grammarAccess.getLoopedAlternativeModelAccess().getBeforeKeyword_0_4_0());
            	    				
            	    // InternalUnorderedGroupsTestLanguage.g:1116:5: (otherlv_6= 'after' )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==28) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:1117:6: otherlv_6= 'after'
            	    	    {
            	    	    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_9); 

            	    	    						newLeafNode(otherlv_6, grammarAccess.getLoopedAlternativeModelAccess().getAfterKeyword_0_4_1());
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getLoopedAlternativeModelAccess().getClassKeyword_1());
            		
            // InternalUnorderedGroupsTestLanguage.g:1128:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalUnorderedGroupsTestLanguage.g:1129:4: (lv_name_8_0= RULE_ID )
            {
            // InternalUnorderedGroupsTestLanguage.g:1129:4: (lv_name_8_0= RULE_ID )
            // InternalUnorderedGroupsTestLanguage.g:1130:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_8_0, grammarAccess.getLoopedAlternativeModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopedAlternativeModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_9=(Token)match(input,25,FollowSets000.FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getLoopedAlternativeModelAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoopedAlternativeModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLoopedAlternativeModel"


    // $ANTLR start "entryRuleBug304681Model"
    // InternalUnorderedGroupsTestLanguage.g:1158:1: entryRuleBug304681Model returns [EObject current=null] : iv_ruleBug304681Model= ruleBug304681Model EOF ;
    public final EObject entryRuleBug304681Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBug304681Model = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:1158:55: (iv_ruleBug304681Model= ruleBug304681Model EOF )
            // InternalUnorderedGroupsTestLanguage.g:1159:2: iv_ruleBug304681Model= ruleBug304681Model EOF
            {
             newCompositeNode(grammarAccess.getBug304681ModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBug304681Model=ruleBug304681Model();

            state._fsp--;

             current =iv_ruleBug304681Model; 
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
    // $ANTLR end "entryRuleBug304681Model"


    // $ANTLR start "ruleBug304681Model"
    // InternalUnorderedGroupsTestLanguage.g:1165:1: ruleBug304681Model returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleBug304681Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_shortDescription_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_longDescription_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_uid_10_0=null;
        Token otherlv_11=null;
        Token lv_flag_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_features_14_0 = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:1166:1: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalUnorderedGroupsTestLanguage.g:1167:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalUnorderedGroupsTestLanguage.g:1167:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) ) ) otherlv_15= '}' )
            // InternalUnorderedGroupsTestLanguage.g:1168:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalUnorderedGroupsTestLanguage.g:1168:3: ()
            // InternalUnorderedGroupsTestLanguage.g:1169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBug304681ModelAccess().getBug304681ModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBug304681ModelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUnorderedGroupsTestLanguage.g:1179:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) ) )
            // InternalUnorderedGroupsTestLanguage.g:1180:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) )
            {
            // InternalUnorderedGroupsTestLanguage.g:1180:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* ) )
            // InternalUnorderedGroupsTestLanguage.g:1181:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2());
            				
            // InternalUnorderedGroupsTestLanguage.g:1184:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )* )
            // InternalUnorderedGroupsTestLanguage.g:1185:6: ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )*
            {
            // InternalUnorderedGroupsTestLanguage.g:1185:6: ( ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) ) )*
            loop24:
            do {
                int alt24=6;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 2) ) {
                    alt24=3;
                }
                else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 3) ) {
                    alt24=4;
                }
                else if ( LA24_0 >= 34 && LA24_0 <= 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 4) ) {
                    alt24=5;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUnorderedGroupsTestLanguage.g:1186:4: ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1186:4: ({...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1187:5: {...}? => ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1187:111: ( ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1188:6: ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:1191:9: ({...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1191:10: {...}? => (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1191:19: (otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';' )
            	    // InternalUnorderedGroupsTestLanguage.g:1191:20: otherlv_3= 'short' ( (lv_shortDescription_4_0= RULE_STRING ) ) otherlv_5= ';'
            	    {
            	    otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_11); 

            	    									newLeafNode(otherlv_3, grammarAccess.getBug304681ModelAccess().getShortKeyword_2_0_0());
            	    								
            	    // InternalUnorderedGroupsTestLanguage.g:1195:9: ( (lv_shortDescription_4_0= RULE_STRING ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1196:10: (lv_shortDescription_4_0= RULE_STRING )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1196:10: (lv_shortDescription_4_0= RULE_STRING )
            	    // InternalUnorderedGroupsTestLanguage.g:1197:11: lv_shortDescription_4_0= RULE_STRING
            	    {
            	    lv_shortDescription_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            	    											newLeafNode(lv_shortDescription_4_0, grammarAccess.getBug304681ModelAccess().getShortDescriptionSTRINGTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBug304681ModelRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"shortDescription",
            	    												lv_shortDescription_4_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_5=(Token)match(input,30,FollowSets000.FOLLOW_10); 

            	    									newLeafNode(otherlv_5, grammarAccess.getBug304681ModelAccess().getSemicolonKeyword_2_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnorderedGroupsTestLanguage.g:1223:4: ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1223:4: ({...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1224:5: {...}? => ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1224:111: ( ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1225:6: ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:1228:9: ({...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1228:10: {...}? => (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1228:19: (otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';' )
            	    // InternalUnorderedGroupsTestLanguage.g:1228:20: otherlv_6= 'long' ( (lv_longDescription_7_0= RULE_STRING ) ) otherlv_8= ';'
            	    {
            	    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getBug304681ModelAccess().getLongKeyword_2_1_0());
            	    								
            	    // InternalUnorderedGroupsTestLanguage.g:1232:9: ( (lv_longDescription_7_0= RULE_STRING ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1233:10: (lv_longDescription_7_0= RULE_STRING )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1233:10: (lv_longDescription_7_0= RULE_STRING )
            	    // InternalUnorderedGroupsTestLanguage.g:1234:11: lv_longDescription_7_0= RULE_STRING
            	    {
            	    lv_longDescription_7_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            	    											newLeafNode(lv_longDescription_7_0, grammarAccess.getBug304681ModelAccess().getLongDescriptionSTRINGTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBug304681ModelRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"longDescription",
            	    												lv_longDescription_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getBug304681ModelAccess().getSemicolonKeyword_2_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnorderedGroupsTestLanguage.g:1260:4: ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1260:4: ({...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1261:5: {...}? => ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1261:111: ( ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1262:6: ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:1265:9: ({...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1265:10: {...}? => (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1265:19: (otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // InternalUnorderedGroupsTestLanguage.g:1265:20: otherlv_9= 'uid' ( (lv_uid_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_11); 

            	    									newLeafNode(otherlv_9, grammarAccess.getBug304681ModelAccess().getUidKeyword_2_2_0());
            	    								
            	    // InternalUnorderedGroupsTestLanguage.g:1269:9: ( (lv_uid_10_0= RULE_STRING ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1270:10: (lv_uid_10_0= RULE_STRING )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1270:10: (lv_uid_10_0= RULE_STRING )
            	    // InternalUnorderedGroupsTestLanguage.g:1271:11: lv_uid_10_0= RULE_STRING
            	    {
            	    lv_uid_10_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_12); 

            	    											newLeafNode(lv_uid_10_0, grammarAccess.getBug304681ModelAccess().getUidSTRINGTerminalRuleCall_2_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBug304681ModelRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"uid",
            	    												lv_uid_10_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_10); 

            	    									newLeafNode(otherlv_11, grammarAccess.getBug304681ModelAccess().getSemicolonKeyword_2_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnorderedGroupsTestLanguage.g:1297:4: ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1297:4: ({...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1298:5: {...}? => ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1298:111: ( ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1299:6: ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:1302:9: ({...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1302:10: {...}? => ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "true");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1302:19: ( ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';' )
            	    // InternalUnorderedGroupsTestLanguage.g:1302:20: ( (lv_flag_12_0= 'flag' ) ) otherlv_13= ';'
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1302:20: ( (lv_flag_12_0= 'flag' ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1303:10: (lv_flag_12_0= 'flag' )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1303:10: (lv_flag_12_0= 'flag' )
            	    // InternalUnorderedGroupsTestLanguage.g:1304:11: lv_flag_12_0= 'flag'
            	    {
            	    lv_flag_12_0=(Token)match(input,33,FollowSets000.FOLLOW_12); 

            	    											newLeafNode(lv_flag_12_0, grammarAccess.getBug304681ModelAccess().getFlagFlagKeyword_2_3_0_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBug304681ModelRule());
            	    											}
            	    											setWithLastConsumed(current, "flag", lv_flag_12_0 != null, "flag");
            	    										

            	    }


            	    }

            	    otherlv_13=(Token)match(input,30,FollowSets000.FOLLOW_10); 

            	    									newLeafNode(otherlv_13, grammarAccess.getBug304681ModelAccess().getSemicolonKeyword_2_3_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalUnorderedGroupsTestLanguage.g:1326:4: ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) )
            	    {
            	    // InternalUnorderedGroupsTestLanguage.g:1326:4: ({...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ ) )
            	    // InternalUnorderedGroupsTestLanguage.g:1327:5: {...}? => ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBug304681Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalUnorderedGroupsTestLanguage.g:1327:111: ( ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+ )
            	    // InternalUnorderedGroupsTestLanguage.g:1328:6: ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalUnorderedGroupsTestLanguage.g:1331:9: ({...}? => ( (lv_features_14_0= ruleBug304681Feature ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==34) ) {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }
            	        else if ( (LA23_0==35) ) {
            	            int LA23_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalUnorderedGroupsTestLanguage.g:1331:10: {...}? => ( (lv_features_14_0= ruleBug304681Feature ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleBug304681Model", "true");
            	    	    }
            	    	    // InternalUnorderedGroupsTestLanguage.g:1331:19: ( (lv_features_14_0= ruleBug304681Feature ) )
            	    	    // InternalUnorderedGroupsTestLanguage.g:1331:20: (lv_features_14_0= ruleBug304681Feature )
            	    	    {
            	    	    // InternalUnorderedGroupsTestLanguage.g:1331:20: (lv_features_14_0= ruleBug304681Feature )
            	    	    // InternalUnorderedGroupsTestLanguage.g:1332:10: lv_features_14_0= ruleBug304681Feature
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getBug304681ModelAccess().getFeaturesBug304681FeatureParserRuleCall_2_4_0());
            	    	    									
            	    	    pushFollow(FollowSets000.FOLLOW_10);
            	    	    lv_features_14_0=ruleBug304681Feature();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getBug304681ModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"features",
            	    	    											lv_features_14_0,
            	    	    											"org.eclipse.xtext.ui.tests.editor.contentassist.UnorderedGroupsTestLanguage.Bug304681Feature");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt23 >= 1 ) break loop23;
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBug304681ModelAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getBug304681ModelAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBug304681Model"


    // $ANTLR start "entryRuleBug304681Feature"
    // InternalUnorderedGroupsTestLanguage.g:1369:1: entryRuleBug304681Feature returns [EObject current=null] : iv_ruleBug304681Feature= ruleBug304681Feature EOF ;
    public final EObject entryRuleBug304681Feature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBug304681Feature = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:1369:57: (iv_ruleBug304681Feature= ruleBug304681Feature EOF )
            // InternalUnorderedGroupsTestLanguage.g:1370:2: iv_ruleBug304681Feature= ruleBug304681Feature EOF
            {
             newCompositeNode(grammarAccess.getBug304681FeatureRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBug304681Feature=ruleBug304681Feature();

            state._fsp--;

             current =iv_ruleBug304681Feature; 
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
    // $ANTLR end "entryRuleBug304681Feature"


    // $ANTLR start "ruleBug304681Feature"
    // InternalUnorderedGroupsTestLanguage.g:1376:1: ruleBug304681Feature returns [EObject current=null] : (this_Bug304681Attribute_0= ruleBug304681Attribute | this_Bug304681Reference_1= ruleBug304681Reference ) ;
    public final EObject ruleBug304681Feature() throws RecognitionException {
        EObject current = null;

        EObject this_Bug304681Attribute_0 = null;

        EObject this_Bug304681Reference_1 = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:1377:1: ( (this_Bug304681Attribute_0= ruleBug304681Attribute | this_Bug304681Reference_1= ruleBug304681Reference ) )
            // InternalUnorderedGroupsTestLanguage.g:1378:2: (this_Bug304681Attribute_0= ruleBug304681Attribute | this_Bug304681Reference_1= ruleBug304681Reference )
            {
            // InternalUnorderedGroupsTestLanguage.g:1378:2: (this_Bug304681Attribute_0= ruleBug304681Attribute | this_Bug304681Reference_1= ruleBug304681Reference )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            else if ( (LA25_0==35) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalUnorderedGroupsTestLanguage.g:1379:3: this_Bug304681Attribute_0= ruleBug304681Attribute
                    {

                    			newCompositeNode(grammarAccess.getBug304681FeatureAccess().getBug304681AttributeParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Bug304681Attribute_0=ruleBug304681Attribute();

                    state._fsp--;


                    			current = this_Bug304681Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUnorderedGroupsTestLanguage.g:1388:3: this_Bug304681Reference_1= ruleBug304681Reference
                    {

                    			newCompositeNode(grammarAccess.getBug304681FeatureAccess().getBug304681ReferenceParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Bug304681Reference_1=ruleBug304681Reference();

                    state._fsp--;


                    			current = this_Bug304681Reference_1;
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
    // $ANTLR end "ruleBug304681Feature"


    // $ANTLR start "entryRuleBug304681Attribute"
    // InternalUnorderedGroupsTestLanguage.g:1400:1: entryRuleBug304681Attribute returns [EObject current=null] : iv_ruleBug304681Attribute= ruleBug304681Attribute EOF ;
    public final EObject entryRuleBug304681Attribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBug304681Attribute = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:1400:59: (iv_ruleBug304681Attribute= ruleBug304681Attribute EOF )
            // InternalUnorderedGroupsTestLanguage.g:1401:2: iv_ruleBug304681Attribute= ruleBug304681Attribute EOF
            {
             newCompositeNode(grammarAccess.getBug304681AttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBug304681Attribute=ruleBug304681Attribute();

            state._fsp--;

             current =iv_ruleBug304681Attribute; 
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
    // $ANTLR end "entryRuleBug304681Attribute"


    // $ANTLR start "ruleBug304681Attribute"
    // InternalUnorderedGroupsTestLanguage.g:1407:1: ruleBug304681Attribute returns [EObject current=null] : (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleBug304681Attribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // InternalUnorderedGroupsTestLanguage.g:1408:1: ( (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalUnorderedGroupsTestLanguage.g:1409:2: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalUnorderedGroupsTestLanguage.g:1409:2: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalUnorderedGroupsTestLanguage.g:1410:3: otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBug304681AttributeAccess().getAttrKeyword_0());
            		
            // InternalUnorderedGroupsTestLanguage.g:1414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnorderedGroupsTestLanguage.g:1415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnorderedGroupsTestLanguage.g:1415:4: (lv_name_1_0= RULE_ID )
            // InternalUnorderedGroupsTestLanguage.g:1416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBug304681AttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBug304681AttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBug304681AttributeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleBug304681Attribute"


    // $ANTLR start "entryRuleBug304681Reference"
    // InternalUnorderedGroupsTestLanguage.g:1440:1: entryRuleBug304681Reference returns [EObject current=null] : iv_ruleBug304681Reference= ruleBug304681Reference EOF ;
    public final EObject entryRuleBug304681Reference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBug304681Reference = null;


        try {
            // InternalUnorderedGroupsTestLanguage.g:1440:59: (iv_ruleBug304681Reference= ruleBug304681Reference EOF )
            // InternalUnorderedGroupsTestLanguage.g:1441:2: iv_ruleBug304681Reference= ruleBug304681Reference EOF
            {
             newCompositeNode(grammarAccess.getBug304681ReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBug304681Reference=ruleBug304681Reference();

            state._fsp--;

             current =iv_ruleBug304681Reference; 
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
    // $ANTLR end "entryRuleBug304681Reference"


    // $ANTLR start "ruleBug304681Reference"
    // InternalUnorderedGroupsTestLanguage.g:1447:1: ruleBug304681Reference returns [EObject current=null] : (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleBug304681Reference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // InternalUnorderedGroupsTestLanguage.g:1448:1: ( (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalUnorderedGroupsTestLanguage.g:1449:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalUnorderedGroupsTestLanguage.g:1449:2: (otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // InternalUnorderedGroupsTestLanguage.g:1450:3: otherlv_0= 'ref' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBug304681ReferenceAccess().getRefKeyword_0());
            		
            // InternalUnorderedGroupsTestLanguage.g:1454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUnorderedGroupsTestLanguage.g:1455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUnorderedGroupsTestLanguage.g:1455:4: (lv_name_1_0= RULE_ID )
            // InternalUnorderedGroupsTestLanguage.g:1456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBug304681ReferenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBug304681ReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getBug304681ReferenceAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleBug304681Reference"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\21\1\uffff\7\0\4\uffff";
    static final String dfa_3s = "\1\30\1\uffff\7\0\4\uffff";
    static final String dfa_4s = "\1\uffff\1\5\7\uffff\1\1\1\2\1\3\1\4";
    static final String dfa_5s = "\2\uffff\1\4\1\5\1\6\1\1\1\2\1\0\1\3\4\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 823:6: ( ({...}? => ( ({...}? => ( ( (lv_visibility_1_1= 'public' | lv_visibility_1_2= 'private' | lv_visibility_1_3= 'protected' ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_synchronized_3_0= 'synchronized' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_abstract_4_0= 'abstract' ) ) | ( (lv_final_5_0= 'final' ) ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 3) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {s = 1;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_5 = input.LA(1);

                         
                        int index17_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 1) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {s = 1;}

                         
                        input.seek(index17_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 2) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {s = 1;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 3) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {s = 1;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_2 = input.LA(1);

                         
                        int index17_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {s = 1;}

                         
                        input.seek(index17_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_3 = input.LA(1);

                         
                        int index17_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {s = 1;}

                         
                        input.seek(index17_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0(), 0) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getGroupLoopedModelAccess().getUnorderedGroup_0()) ) {s = 1;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FE0000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000FE0000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000009FE0000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000019FE0000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000FA4000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    }


}