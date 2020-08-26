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
import org.eclipse.xtext.ui.tests.editor.contentassist.services.ContentAssistContextTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContentAssistContextTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A1'", "'A2'", "'B1'", "'B2'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalContentAssistContextTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContentAssistContextTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContentAssistContextTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalContentAssistContextTestLanguage.g"; }



     	private ContentAssistContextTestLanguageGrammarAccess grammarAccess;

        public InternalContentAssistContextTestLanguageParser(TokenStream input, ContentAssistContextTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FirstLevel";
       	}

       	@Override
       	protected ContentAssistContextTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFirstLevel"
    // InternalContentAssistContextTestLanguage.g:64:1: entryRuleFirstLevel returns [EObject current=null] : iv_ruleFirstLevel= ruleFirstLevel EOF ;
    public final EObject entryRuleFirstLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirstLevel = null;


        try {
            // InternalContentAssistContextTestLanguage.g:64:51: (iv_ruleFirstLevel= ruleFirstLevel EOF )
            // InternalContentAssistContextTestLanguage.g:65:2: iv_ruleFirstLevel= ruleFirstLevel EOF
            {
             newCompositeNode(grammarAccess.getFirstLevelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFirstLevel=ruleFirstLevel();

            state._fsp--;

             current =iv_ruleFirstLevel; 
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
    // $ANTLR end "entryRuleFirstLevel"


    // $ANTLR start "ruleFirstLevel"
    // InternalContentAssistContextTestLanguage.g:71:1: ruleFirstLevel returns [EObject current=null] : ( ( (lv_secondLevelA_0_0= ruleSecondLevelA ) )* ( (lv_secondLevelB_1_0= ruleSecondLevelB ) )* ) ;
    public final EObject ruleFirstLevel() throws RecognitionException {
        EObject current = null;

        EObject lv_secondLevelA_0_0 = null;

        EObject lv_secondLevelB_1_0 = null;


        try {
            // InternalContentAssistContextTestLanguage.g:72:1: ( ( ( (lv_secondLevelA_0_0= ruleSecondLevelA ) )* ( (lv_secondLevelB_1_0= ruleSecondLevelB ) )* ) )
            // InternalContentAssistContextTestLanguage.g:73:2: ( ( (lv_secondLevelA_0_0= ruleSecondLevelA ) )* ( (lv_secondLevelB_1_0= ruleSecondLevelB ) )* )
            {
            // InternalContentAssistContextTestLanguage.g:73:2: ( ( (lv_secondLevelA_0_0= ruleSecondLevelA ) )* ( (lv_secondLevelB_1_0= ruleSecondLevelB ) )* )
            // InternalContentAssistContextTestLanguage.g:74:3: ( (lv_secondLevelA_0_0= ruleSecondLevelA ) )* ( (lv_secondLevelB_1_0= ruleSecondLevelB ) )*
            {
            // InternalContentAssistContextTestLanguage.g:74:3: ( (lv_secondLevelA_0_0= ruleSecondLevelA ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalContentAssistContextTestLanguage.g:75:4: (lv_secondLevelA_0_0= ruleSecondLevelA )
            	    {
            	    // InternalContentAssistContextTestLanguage.g:75:4: (lv_secondLevelA_0_0= ruleSecondLevelA )
            	    // InternalContentAssistContextTestLanguage.g:76:5: lv_secondLevelA_0_0= ruleSecondLevelA
            	    {

            	    					newCompositeNode(grammarAccess.getFirstLevelAccess().getSecondLevelASecondLevelAParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_secondLevelA_0_0=ruleSecondLevelA();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFirstLevelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"secondLevelA",
            	    						lv_secondLevelA_0_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.SecondLevelA");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalContentAssistContextTestLanguage.g:93:3: ( (lv_secondLevelB_1_0= ruleSecondLevelB ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalContentAssistContextTestLanguage.g:94:4: (lv_secondLevelB_1_0= ruleSecondLevelB )
            	    {
            	    // InternalContentAssistContextTestLanguage.g:94:4: (lv_secondLevelB_1_0= ruleSecondLevelB )
            	    // InternalContentAssistContextTestLanguage.g:95:5: lv_secondLevelB_1_0= ruleSecondLevelB
            	    {

            	    					newCompositeNode(grammarAccess.getFirstLevelAccess().getSecondLevelBSecondLevelBParserRuleCall_1_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_secondLevelB_1_0=ruleSecondLevelB();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFirstLevelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"secondLevelB",
            	    						lv_secondLevelB_1_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.SecondLevelB");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleFirstLevel"


    // $ANTLR start "entryRuleSecondLevelA"
    // InternalContentAssistContextTestLanguage.g:116:1: entryRuleSecondLevelA returns [EObject current=null] : iv_ruleSecondLevelA= ruleSecondLevelA EOF ;
    public final EObject entryRuleSecondLevelA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondLevelA = null;


        try {
            // InternalContentAssistContextTestLanguage.g:116:53: (iv_ruleSecondLevelA= ruleSecondLevelA EOF )
            // InternalContentAssistContextTestLanguage.g:117:2: iv_ruleSecondLevelA= ruleSecondLevelA EOF
            {
             newCompositeNode(grammarAccess.getSecondLevelARule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSecondLevelA=ruleSecondLevelA();

            state._fsp--;

             current =iv_ruleSecondLevelA; 
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
    // $ANTLR end "entryRuleSecondLevelA"


    // $ANTLR start "ruleSecondLevelA"
    // InternalContentAssistContextTestLanguage.g:123:1: ruleSecondLevelA returns [EObject current=null] : ( ( (lv_thirdLevelA1_0_0= ruleThirdLevelA1 ) )+ ( (lv_thirdLevelA2_1_0= ruleThirdLevelA2 ) )+ ) ;
    public final EObject ruleSecondLevelA() throws RecognitionException {
        EObject current = null;

        EObject lv_thirdLevelA1_0_0 = null;

        EObject lv_thirdLevelA2_1_0 = null;


        try {
            // InternalContentAssistContextTestLanguage.g:124:1: ( ( ( (lv_thirdLevelA1_0_0= ruleThirdLevelA1 ) )+ ( (lv_thirdLevelA2_1_0= ruleThirdLevelA2 ) )+ ) )
            // InternalContentAssistContextTestLanguage.g:125:2: ( ( (lv_thirdLevelA1_0_0= ruleThirdLevelA1 ) )+ ( (lv_thirdLevelA2_1_0= ruleThirdLevelA2 ) )+ )
            {
            // InternalContentAssistContextTestLanguage.g:125:2: ( ( (lv_thirdLevelA1_0_0= ruleThirdLevelA1 ) )+ ( (lv_thirdLevelA2_1_0= ruleThirdLevelA2 ) )+ )
            // InternalContentAssistContextTestLanguage.g:126:3: ( (lv_thirdLevelA1_0_0= ruleThirdLevelA1 ) )+ ( (lv_thirdLevelA2_1_0= ruleThirdLevelA2 ) )+
            {
            // InternalContentAssistContextTestLanguage.g:126:3: ( (lv_thirdLevelA1_0_0= ruleThirdLevelA1 ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalContentAssistContextTestLanguage.g:127:4: (lv_thirdLevelA1_0_0= ruleThirdLevelA1 )
            	    {
            	    // InternalContentAssistContextTestLanguage.g:127:4: (lv_thirdLevelA1_0_0= ruleThirdLevelA1 )
            	    // InternalContentAssistContextTestLanguage.g:128:5: lv_thirdLevelA1_0_0= ruleThirdLevelA1
            	    {

            	    					newCompositeNode(grammarAccess.getSecondLevelAAccess().getThirdLevelA1ThirdLevelA1ParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_thirdLevelA1_0_0=ruleThirdLevelA1();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSecondLevelARule());
            	    					}
            	    					add(
            	    						current,
            	    						"thirdLevelA1",
            	    						lv_thirdLevelA1_0_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelA1");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalContentAssistContextTestLanguage.g:145:3: ( (lv_thirdLevelA2_1_0= ruleThirdLevelA2 ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalContentAssistContextTestLanguage.g:146:4: (lv_thirdLevelA2_1_0= ruleThirdLevelA2 )
            	    {
            	    // InternalContentAssistContextTestLanguage.g:146:4: (lv_thirdLevelA2_1_0= ruleThirdLevelA2 )
            	    // InternalContentAssistContextTestLanguage.g:147:5: lv_thirdLevelA2_1_0= ruleThirdLevelA2
            	    {

            	    					newCompositeNode(grammarAccess.getSecondLevelAAccess().getThirdLevelA2ThirdLevelA2ParserRuleCall_1_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_thirdLevelA2_1_0=ruleThirdLevelA2();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSecondLevelARule());
            	    					}
            	    					add(
            	    						current,
            	    						"thirdLevelA2",
            	    						lv_thirdLevelA2_1_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelA2");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleSecondLevelA"


    // $ANTLR start "entryRuleSecondLevelB"
    // InternalContentAssistContextTestLanguage.g:168:1: entryRuleSecondLevelB returns [EObject current=null] : iv_ruleSecondLevelB= ruleSecondLevelB EOF ;
    public final EObject entryRuleSecondLevelB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecondLevelB = null;


        try {
            // InternalContentAssistContextTestLanguage.g:168:53: (iv_ruleSecondLevelB= ruleSecondLevelB EOF )
            // InternalContentAssistContextTestLanguage.g:169:2: iv_ruleSecondLevelB= ruleSecondLevelB EOF
            {
             newCompositeNode(grammarAccess.getSecondLevelBRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSecondLevelB=ruleSecondLevelB();

            state._fsp--;

             current =iv_ruleSecondLevelB; 
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
    // $ANTLR end "entryRuleSecondLevelB"


    // $ANTLR start "ruleSecondLevelB"
    // InternalContentAssistContextTestLanguage.g:175:1: ruleSecondLevelB returns [EObject current=null] : ( ( (lv_thirdLevelB1_0_0= ruleThirdLevelB1 ) )+ ( (lv_thirdLevelB2_1_0= ruleThirdLevelB2 ) )+ ) ;
    public final EObject ruleSecondLevelB() throws RecognitionException {
        EObject current = null;

        EObject lv_thirdLevelB1_0_0 = null;

        EObject lv_thirdLevelB2_1_0 = null;


        try {
            // InternalContentAssistContextTestLanguage.g:176:1: ( ( ( (lv_thirdLevelB1_0_0= ruleThirdLevelB1 ) )+ ( (lv_thirdLevelB2_1_0= ruleThirdLevelB2 ) )+ ) )
            // InternalContentAssistContextTestLanguage.g:177:2: ( ( (lv_thirdLevelB1_0_0= ruleThirdLevelB1 ) )+ ( (lv_thirdLevelB2_1_0= ruleThirdLevelB2 ) )+ )
            {
            // InternalContentAssistContextTestLanguage.g:177:2: ( ( (lv_thirdLevelB1_0_0= ruleThirdLevelB1 ) )+ ( (lv_thirdLevelB2_1_0= ruleThirdLevelB2 ) )+ )
            // InternalContentAssistContextTestLanguage.g:178:3: ( (lv_thirdLevelB1_0_0= ruleThirdLevelB1 ) )+ ( (lv_thirdLevelB2_1_0= ruleThirdLevelB2 ) )+
            {
            // InternalContentAssistContextTestLanguage.g:178:3: ( (lv_thirdLevelB1_0_0= ruleThirdLevelB1 ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalContentAssistContextTestLanguage.g:179:4: (lv_thirdLevelB1_0_0= ruleThirdLevelB1 )
            	    {
            	    // InternalContentAssistContextTestLanguage.g:179:4: (lv_thirdLevelB1_0_0= ruleThirdLevelB1 )
            	    // InternalContentAssistContextTestLanguage.g:180:5: lv_thirdLevelB1_0_0= ruleThirdLevelB1
            	    {

            	    					newCompositeNode(grammarAccess.getSecondLevelBAccess().getThirdLevelB1ThirdLevelB1ParserRuleCall_0_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_thirdLevelB1_0_0=ruleThirdLevelB1();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSecondLevelBRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thirdLevelB1",
            	    						lv_thirdLevelB1_0_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelB1");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalContentAssistContextTestLanguage.g:197:3: ( (lv_thirdLevelB2_1_0= ruleThirdLevelB2 ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalContentAssistContextTestLanguage.g:198:4: (lv_thirdLevelB2_1_0= ruleThirdLevelB2 )
            	    {
            	    // InternalContentAssistContextTestLanguage.g:198:4: (lv_thirdLevelB2_1_0= ruleThirdLevelB2 )
            	    // InternalContentAssistContextTestLanguage.g:199:5: lv_thirdLevelB2_1_0= ruleThirdLevelB2
            	    {

            	    					newCompositeNode(grammarAccess.getSecondLevelBAccess().getThirdLevelB2ThirdLevelB2ParserRuleCall_1_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    lv_thirdLevelB2_1_0=ruleThirdLevelB2();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSecondLevelBRule());
            	    					}
            	    					add(
            	    						current,
            	    						"thirdLevelB2",
            	    						lv_thirdLevelB2_1_0,
            	    						"org.eclipse.xtext.ui.tests.editor.contentassist.ContentAssistContextTestLanguage.ThirdLevelB2");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "ruleSecondLevelB"


    // $ANTLR start "entryRuleThirdLevelA1"
    // InternalContentAssistContextTestLanguage.g:220:1: entryRuleThirdLevelA1 returns [EObject current=null] : iv_ruleThirdLevelA1= ruleThirdLevelA1 EOF ;
    public final EObject entryRuleThirdLevelA1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThirdLevelA1 = null;


        try {
            // InternalContentAssistContextTestLanguage.g:220:53: (iv_ruleThirdLevelA1= ruleThirdLevelA1 EOF )
            // InternalContentAssistContextTestLanguage.g:221:2: iv_ruleThirdLevelA1= ruleThirdLevelA1 EOF
            {
             newCompositeNode(grammarAccess.getThirdLevelA1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleThirdLevelA1=ruleThirdLevelA1();

            state._fsp--;

             current =iv_ruleThirdLevelA1; 
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
    // $ANTLR end "entryRuleThirdLevelA1"


    // $ANTLR start "ruleThirdLevelA1"
    // InternalContentAssistContextTestLanguage.g:227:1: ruleThirdLevelA1 returns [EObject current=null] : (otherlv_0= 'A1' () ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleThirdLevelA1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

        try {
            // InternalContentAssistContextTestLanguage.g:228:1: ( (otherlv_0= 'A1' () ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalContentAssistContextTestLanguage.g:229:2: (otherlv_0= 'A1' () ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalContentAssistContextTestLanguage.g:229:2: (otherlv_0= 'A1' () ( (lv_name_2_0= RULE_ID ) )? )
            // InternalContentAssistContextTestLanguage.g:230:3: otherlv_0= 'A1' () ( (lv_name_2_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getThirdLevelA1Access().getA1Keyword_0());
            		
            // InternalContentAssistContextTestLanguage.g:234:3: ()
            // InternalContentAssistContextTestLanguage.g:235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThirdLevelA1Access().getThirdLevelA1Action_1(),
            					current);
            			

            }

            // InternalContentAssistContextTestLanguage.g:241:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalContentAssistContextTestLanguage.g:242:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalContentAssistContextTestLanguage.g:242:4: (lv_name_2_0= RULE_ID )
                    // InternalContentAssistContextTestLanguage.g:243:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getThirdLevelA1Access().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThirdLevelA1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleThirdLevelA1"


    // $ANTLR start "entryRuleThirdLevelA2"
    // InternalContentAssistContextTestLanguage.g:263:1: entryRuleThirdLevelA2 returns [EObject current=null] : iv_ruleThirdLevelA2= ruleThirdLevelA2 EOF ;
    public final EObject entryRuleThirdLevelA2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThirdLevelA2 = null;


        try {
            // InternalContentAssistContextTestLanguage.g:263:53: (iv_ruleThirdLevelA2= ruleThirdLevelA2 EOF )
            // InternalContentAssistContextTestLanguage.g:264:2: iv_ruleThirdLevelA2= ruleThirdLevelA2 EOF
            {
             newCompositeNode(grammarAccess.getThirdLevelA2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleThirdLevelA2=ruleThirdLevelA2();

            state._fsp--;

             current =iv_ruleThirdLevelA2; 
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
    // $ANTLR end "entryRuleThirdLevelA2"


    // $ANTLR start "ruleThirdLevelA2"
    // InternalContentAssistContextTestLanguage.g:270:1: ruleThirdLevelA2 returns [EObject current=null] : (otherlv_0= 'A2' () ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleThirdLevelA2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

        try {
            // InternalContentAssistContextTestLanguage.g:271:1: ( (otherlv_0= 'A2' () ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalContentAssistContextTestLanguage.g:272:2: (otherlv_0= 'A2' () ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalContentAssistContextTestLanguage.g:272:2: (otherlv_0= 'A2' () ( (lv_name_2_0= RULE_ID ) )? )
            // InternalContentAssistContextTestLanguage.g:273:3: otherlv_0= 'A2' () ( (lv_name_2_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getThirdLevelA2Access().getA2Keyword_0());
            		
            // InternalContentAssistContextTestLanguage.g:277:3: ()
            // InternalContentAssistContextTestLanguage.g:278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThirdLevelA2Access().getThirdLevelA2Action_1(),
            					current);
            			

            }

            // InternalContentAssistContextTestLanguage.g:284:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalContentAssistContextTestLanguage.g:285:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalContentAssistContextTestLanguage.g:285:4: (lv_name_2_0= RULE_ID )
                    // InternalContentAssistContextTestLanguage.g:286:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getThirdLevelA2Access().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThirdLevelA2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleThirdLevelA2"


    // $ANTLR start "entryRuleThirdLevelB1"
    // InternalContentAssistContextTestLanguage.g:306:1: entryRuleThirdLevelB1 returns [EObject current=null] : iv_ruleThirdLevelB1= ruleThirdLevelB1 EOF ;
    public final EObject entryRuleThirdLevelB1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThirdLevelB1 = null;


        try {
            // InternalContentAssistContextTestLanguage.g:306:53: (iv_ruleThirdLevelB1= ruleThirdLevelB1 EOF )
            // InternalContentAssistContextTestLanguage.g:307:2: iv_ruleThirdLevelB1= ruleThirdLevelB1 EOF
            {
             newCompositeNode(grammarAccess.getThirdLevelB1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleThirdLevelB1=ruleThirdLevelB1();

            state._fsp--;

             current =iv_ruleThirdLevelB1; 
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
    // $ANTLR end "entryRuleThirdLevelB1"


    // $ANTLR start "ruleThirdLevelB1"
    // InternalContentAssistContextTestLanguage.g:313:1: ruleThirdLevelB1 returns [EObject current=null] : (otherlv_0= 'B1' () ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleThirdLevelB1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

        try {
            // InternalContentAssistContextTestLanguage.g:314:1: ( (otherlv_0= 'B1' () ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalContentAssistContextTestLanguage.g:315:2: (otherlv_0= 'B1' () ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalContentAssistContextTestLanguage.g:315:2: (otherlv_0= 'B1' () ( (lv_name_2_0= RULE_ID ) )? )
            // InternalContentAssistContextTestLanguage.g:316:3: otherlv_0= 'B1' () ( (lv_name_2_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getThirdLevelB1Access().getB1Keyword_0());
            		
            // InternalContentAssistContextTestLanguage.g:320:3: ()
            // InternalContentAssistContextTestLanguage.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThirdLevelB1Access().getThirdLevelB1Action_1(),
            					current);
            			

            }

            // InternalContentAssistContextTestLanguage.g:327:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalContentAssistContextTestLanguage.g:328:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalContentAssistContextTestLanguage.g:328:4: (lv_name_2_0= RULE_ID )
                    // InternalContentAssistContextTestLanguage.g:329:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getThirdLevelB1Access().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThirdLevelB1Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleThirdLevelB1"


    // $ANTLR start "entryRuleThirdLevelB2"
    // InternalContentAssistContextTestLanguage.g:349:1: entryRuleThirdLevelB2 returns [EObject current=null] : iv_ruleThirdLevelB2= ruleThirdLevelB2 EOF ;
    public final EObject entryRuleThirdLevelB2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThirdLevelB2 = null;


        try {
            // InternalContentAssistContextTestLanguage.g:349:53: (iv_ruleThirdLevelB2= ruleThirdLevelB2 EOF )
            // InternalContentAssistContextTestLanguage.g:350:2: iv_ruleThirdLevelB2= ruleThirdLevelB2 EOF
            {
             newCompositeNode(grammarAccess.getThirdLevelB2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleThirdLevelB2=ruleThirdLevelB2();

            state._fsp--;

             current =iv_ruleThirdLevelB2; 
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
    // $ANTLR end "entryRuleThirdLevelB2"


    // $ANTLR start "ruleThirdLevelB2"
    // InternalContentAssistContextTestLanguage.g:356:1: ruleThirdLevelB2 returns [EObject current=null] : (otherlv_0= 'B2' () ( (lv_name_2_0= RULE_ID ) )? ) ;
    public final EObject ruleThirdLevelB2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;

        try {
            // InternalContentAssistContextTestLanguage.g:357:1: ( (otherlv_0= 'B2' () ( (lv_name_2_0= RULE_ID ) )? ) )
            // InternalContentAssistContextTestLanguage.g:358:2: (otherlv_0= 'B2' () ( (lv_name_2_0= RULE_ID ) )? )
            {
            // InternalContentAssistContextTestLanguage.g:358:2: (otherlv_0= 'B2' () ( (lv_name_2_0= RULE_ID ) )? )
            // InternalContentAssistContextTestLanguage.g:359:3: otherlv_0= 'B2' () ( (lv_name_2_0= RULE_ID ) )?
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getThirdLevelB2Access().getB2Keyword_0());
            		
            // InternalContentAssistContextTestLanguage.g:363:3: ()
            // InternalContentAssistContextTestLanguage.g:364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThirdLevelB2Access().getThirdLevelB2Action_1(),
            					current);
            			

            }

            // InternalContentAssistContextTestLanguage.g:370:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalContentAssistContextTestLanguage.g:371:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalContentAssistContextTestLanguage.g:371:4: (lv_name_2_0= RULE_ID )
                    // InternalContentAssistContextTestLanguage.g:372:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getThirdLevelB2Access().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getThirdLevelB2Rule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleThirdLevelB2"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003800L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    }


}