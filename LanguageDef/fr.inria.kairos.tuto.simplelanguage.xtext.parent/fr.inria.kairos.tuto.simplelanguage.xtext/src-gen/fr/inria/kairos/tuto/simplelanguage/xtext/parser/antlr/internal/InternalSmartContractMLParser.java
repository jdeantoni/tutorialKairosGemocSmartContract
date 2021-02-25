package fr.inria.kairos.tuto.simplelanguage.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.kairos.tuto.simplelanguage.xtext.services.SmartContractMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartContractMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SmartContract'", "'->'", "'Event'", "'from'", "'to'", "'State'", "'var'", "':'", "'Function'", "'('", "')'", "'int'", "'='", "'-'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmartContractMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmartContractMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmartContractMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmartContractML.g"; }



     	private SmartContractMLGrammarAccess grammarAccess;

        public InternalSmartContractMLParser(TokenStream input, SmartContractMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SmartContract";
       	}

       	@Override
       	protected SmartContractMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSmartContract"
    // InternalSmartContractML.g:64:1: entryRuleSmartContract returns [EObject current=null] : iv_ruleSmartContract= ruleSmartContract EOF ;
    public final EObject entryRuleSmartContract() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartContract = null;


        try {
            // InternalSmartContractML.g:64:54: (iv_ruleSmartContract= ruleSmartContract EOF )
            // InternalSmartContractML.g:65:2: iv_ruleSmartContract= ruleSmartContract EOF
            {
             newCompositeNode(grammarAccess.getSmartContractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmartContract=ruleSmartContract();

            state._fsp--;

             current =iv_ruleSmartContract; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartContract"


    // $ANTLR start "ruleSmartContract"
    // InternalSmartContractML.g:71:1: ruleSmartContract returns [EObject current=null] : ( () otherlv_1= 'SmartContract' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) )? ( (lv_ownedEvents_5_0= ruleEvent ) )* ( (lv_ownedStates_6_0= ruleState ) )* ( (lv_ownedFunctions_7_0= ruleFunction ) )* ) ;
    public final EObject ruleSmartContract() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedEvents_5_0 = null;

        EObject lv_ownedStates_6_0 = null;

        EObject lv_ownedFunctions_7_0 = null;



        	enterRule();

        try {
            // InternalSmartContractML.g:77:2: ( ( () otherlv_1= 'SmartContract' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) )? ( (lv_ownedEvents_5_0= ruleEvent ) )* ( (lv_ownedStates_6_0= ruleState ) )* ( (lv_ownedFunctions_7_0= ruleFunction ) )* ) )
            // InternalSmartContractML.g:78:2: ( () otherlv_1= 'SmartContract' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) )? ( (lv_ownedEvents_5_0= ruleEvent ) )* ( (lv_ownedStates_6_0= ruleState ) )* ( (lv_ownedFunctions_7_0= ruleFunction ) )* )
            {
            // InternalSmartContractML.g:78:2: ( () otherlv_1= 'SmartContract' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) )? ( (lv_ownedEvents_5_0= ruleEvent ) )* ( (lv_ownedStates_6_0= ruleState ) )* ( (lv_ownedFunctions_7_0= ruleFunction ) )* )
            // InternalSmartContractML.g:79:3: () otherlv_1= 'SmartContract' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '->' ( ( ruleEString ) ) )? ( (lv_ownedEvents_5_0= ruleEvent ) )* ( (lv_ownedStates_6_0= ruleState ) )* ( (lv_ownedFunctions_7_0= ruleFunction ) )*
            {
            // InternalSmartContractML.g:79:3: ()
            // InternalSmartContractML.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSmartContractAccess().getSmartContractAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSmartContractAccess().getSmartContractKeyword_1());
            		
            // InternalSmartContractML.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartContractML.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartContractML.g:91:4: (lv_name_2_0= ruleEString )
            // InternalSmartContractML.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmartContractRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartContractML.g:109:3: (otherlv_3= '->' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmartContractML.g:110:4: otherlv_3= '->' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSmartContractAccess().getHyphenMinusGreaterThanSignKeyword_3_0());
                    			
                    // InternalSmartContractML.g:114:4: ( ( ruleEString ) )
                    // InternalSmartContractML.g:115:5: ( ruleEString )
                    {
                    // InternalSmartContractML.g:115:5: ( ruleEString )
                    // InternalSmartContractML.g:116:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSmartContractRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSmartContractAccess().getInitialStateStateCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartContractML.g:131:3: ( (lv_ownedEvents_5_0= ruleEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSmartContractML.g:132:4: (lv_ownedEvents_5_0= ruleEvent )
            	    {
            	    // InternalSmartContractML.g:132:4: (lv_ownedEvents_5_0= ruleEvent )
            	    // InternalSmartContractML.g:133:5: lv_ownedEvents_5_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getSmartContractAccess().getOwnedEventsEventParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ownedEvents_5_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedEvents",
            	    						lv_ownedEvents_5_0,
            	    						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSmartContractML.g:150:3: ( (lv_ownedStates_6_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartContractML.g:151:4: (lv_ownedStates_6_0= ruleState )
            	    {
            	    // InternalSmartContractML.g:151:4: (lv_ownedStates_6_0= ruleState )
            	    // InternalSmartContractML.g:152:5: lv_ownedStates_6_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getSmartContractAccess().getOwnedStatesStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_ownedStates_6_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedStates",
            	    						lv_ownedStates_6_0,
            	    						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSmartContractML.g:169:3: ( (lv_ownedFunctions_7_0= ruleFunction ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartContractML.g:170:4: (lv_ownedFunctions_7_0= ruleFunction )
            	    {
            	    // InternalSmartContractML.g:170:4: (lv_ownedFunctions_7_0= ruleFunction )
            	    // InternalSmartContractML.g:171:5: lv_ownedFunctions_7_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getSmartContractAccess().getOwnedFunctionsFunctionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_ownedFunctions_7_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSmartContractRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedFunctions",
            	    						lv_ownedFunctions_7_0,
            	    						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartContract"


    // $ANTLR start "entryRuleVariable"
    // InternalSmartContractML.g:192:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalSmartContractML.g:192:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalSmartContractML.g:193:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSmartContractML.g:199:1: ruleVariable returns [EObject current=null] : this_IntegerVariable_0= ruleIntegerVariable ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerVariable_0 = null;



        	enterRule();

        try {
            // InternalSmartContractML.g:205:2: (this_IntegerVariable_0= ruleIntegerVariable )
            // InternalSmartContractML.g:206:2: this_IntegerVariable_0= ruleIntegerVariable
            {

            		newCompositeNode(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_IntegerVariable_0=ruleIntegerVariable();

            state._fsp--;


            		current = this_IntegerVariable_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEString"
    // InternalSmartContractML.g:217:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmartContractML.g:217:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmartContractML.g:218:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmartContractML.g:224:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmartContractML.g:230:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmartContractML.g:231:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmartContractML.g:231:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmartContractML.g:232:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmartContractML.g:240:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEvent"
    // InternalSmartContractML.g:251:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalSmartContractML.g:251:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalSmartContractML.g:252:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSmartContractML.g:258:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmartContractML.g:264:2: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) ) )
            // InternalSmartContractML.g:265:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) )
            {
            // InternalSmartContractML.g:265:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) ) )
            // InternalSmartContractML.g:266:3: () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'from' ( ( ruleEString ) ) otherlv_5= 'to' ( ( ruleEString ) )
            {
            // InternalSmartContractML.g:266:3: ()
            // InternalSmartContractML.g:267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalSmartContractML.g:277:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartContractML.g:278:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartContractML.g:278:4: (lv_name_2_0= ruleEString )
            // InternalSmartContractML.g:279:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEventAccess().getFromKeyword_3());
            		
            // InternalSmartContractML.g:300:3: ( ( ruleEString ) )
            // InternalSmartContractML.g:301:4: ( ruleEString )
            {
            // InternalSmartContractML.g:301:4: ( ruleEString )
            // InternalSmartContractML.g:302:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventAccess().getSourceStateStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getToKeyword_5());
            		
            // InternalSmartContractML.g:320:3: ( ( ruleEString ) )
            // InternalSmartContractML.g:321:4: ( ruleEString )
            {
            // InternalSmartContractML.g:321:4: ( ruleEString )
            // InternalSmartContractML.g:322:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEventAccess().getTargetStateStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // InternalSmartContractML.g:340:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalSmartContractML.g:340:46: (iv_ruleState= ruleState EOF )
            // InternalSmartContractML.g:341:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSmartContractML.g:347:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'var' otherlv_4= ':' ( (lv_ownedVariables_5_0= ruleVariable ) ) )? ( (lv_ownedVariables_6_0= ruleVariable ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ownedVariables_5_0 = null;

        EObject lv_ownedVariables_6_0 = null;



        	enterRule();

        try {
            // InternalSmartContractML.g:353:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'var' otherlv_4= ':' ( (lv_ownedVariables_5_0= ruleVariable ) ) )? ( (lv_ownedVariables_6_0= ruleVariable ) )* ) )
            // InternalSmartContractML.g:354:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'var' otherlv_4= ':' ( (lv_ownedVariables_5_0= ruleVariable ) ) )? ( (lv_ownedVariables_6_0= ruleVariable ) )* )
            {
            // InternalSmartContractML.g:354:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'var' otherlv_4= ':' ( (lv_ownedVariables_5_0= ruleVariable ) ) )? ( (lv_ownedVariables_6_0= ruleVariable ) )* )
            // InternalSmartContractML.g:355:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'var' otherlv_4= ':' ( (lv_ownedVariables_5_0= ruleVariable ) ) )? ( (lv_ownedVariables_6_0= ruleVariable ) )*
            {
            // InternalSmartContractML.g:355:3: ()
            // InternalSmartContractML.g:356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalSmartContractML.g:366:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartContractML.g:367:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartContractML.g:367:4: (lv_name_2_0= ruleEString )
            // InternalSmartContractML.g:368:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartContractML.g:385:3: (otherlv_3= 'var' otherlv_4= ':' ( (lv_ownedVariables_5_0= ruleVariable ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartContractML.g:386:4: otherlv_3= 'var' otherlv_4= ':' ( (lv_ownedVariables_5_0= ruleVariable ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getVarKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateAccess().getColonKeyword_3_1());
                    			
                    // InternalSmartContractML.g:394:4: ( (lv_ownedVariables_5_0= ruleVariable ) )
                    // InternalSmartContractML.g:395:5: (lv_ownedVariables_5_0= ruleVariable )
                    {
                    // InternalSmartContractML.g:395:5: (lv_ownedVariables_5_0= ruleVariable )
                    // InternalSmartContractML.g:396:6: lv_ownedVariables_5_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ownedVariables_5_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateRule());
                    						}
                    						add(
                    							current,
                    							"ownedVariables",
                    							lv_ownedVariables_5_0,
                    							"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmartContractML.g:414:3: ( (lv_ownedVariables_6_0= ruleVariable ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartContractML.g:415:4: (lv_ownedVariables_6_0= ruleVariable )
            	    {
            	    // InternalSmartContractML.g:415:4: (lv_ownedVariables_6_0= ruleVariable )
            	    // InternalSmartContractML.g:416:5: lv_ownedVariables_6_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_ownedVariables_6_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedVariables",
            	    						lv_ownedVariables_6_0,
            	    						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFunction"
    // InternalSmartContractML.g:437:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalSmartContractML.g:437:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalSmartContractML.g:438:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalSmartContractML.g:444:1: ruleFunction returns [EObject current=null] : ( () otherlv_1= 'Function' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= ':' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmartContractML.g:450:2: ( ( () otherlv_1= 'Function' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= ':' ( ( ruleEString ) ) )? ) )
            // InternalSmartContractML.g:451:2: ( () otherlv_1= 'Function' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= ':' ( ( ruleEString ) ) )? )
            {
            // InternalSmartContractML.g:451:2: ( () otherlv_1= 'Function' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= ':' ( ( ruleEString ) ) )? )
            // InternalSmartContractML.g:452:3: () otherlv_1= 'Function' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' otherlv_4= ')' (otherlv_5= ':' ( ( ruleEString ) ) )?
            {
            // InternalSmartContractML.g:452:3: ()
            // InternalSmartContractML.g:453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFunctionAccess().getFunctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
            		
            // InternalSmartContractML.g:463:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartContractML.g:464:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartContractML.g:464:4: (lv_name_2_0= ruleEString )
            // InternalSmartContractML.g:465:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            // InternalSmartContractML.g:490:3: (otherlv_5= ':' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartContractML.g:491:4: otherlv_5= ':' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getColonKeyword_5_0());
                    			
                    // InternalSmartContractML.g:495:4: ( ( ruleEString ) )
                    // InternalSmartContractML.g:496:5: ( ruleEString )
                    {
                    // InternalSmartContractML.g:496:5: ( ruleEString )
                    // InternalSmartContractML.g:497:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFunctionAccess().getEventEventCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleIntegerVariable"
    // InternalSmartContractML.g:516:1: entryRuleIntegerVariable returns [EObject current=null] : iv_ruleIntegerVariable= ruleIntegerVariable EOF ;
    public final EObject entryRuleIntegerVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerVariable = null;


        try {
            // InternalSmartContractML.g:516:56: (iv_ruleIntegerVariable= ruleIntegerVariable EOF )
            // InternalSmartContractML.g:517:2: iv_ruleIntegerVariable= ruleIntegerVariable EOF
            {
             newCompositeNode(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerVariable=ruleIntegerVariable();

            state._fsp--;

             current =iv_ruleIntegerVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // InternalSmartContractML.g:523:1: ruleIntegerVariable returns [EObject current=null] : ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? ) ;
    public final EObject ruleIntegerVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_4_0 = null;



        	enterRule();

        try {
            // InternalSmartContractML.g:529:2: ( ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? ) )
            // InternalSmartContractML.g:530:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? )
            {
            // InternalSmartContractML.g:530:2: ( () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )? )
            // InternalSmartContractML.g:531:3: () otherlv_1= 'int' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )?
            {
            // InternalSmartContractML.g:531:3: ()
            // InternalSmartContractML.g:532:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerVariableAccess().getIntKeyword_1());
            		
            // InternalSmartContractML.g:542:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmartContractML.g:543:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmartContractML.g:543:4: (lv_name_2_0= ruleEString )
            // InternalSmartContractML.g:544:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmartContractML.g:561:3: (otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmartContractML.g:562:4: otherlv_3= '=' ( (lv_initialValue_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3_0());
                    			
                    // InternalSmartContractML.g:566:4: ( (lv_initialValue_4_0= ruleEInt ) )
                    // InternalSmartContractML.g:567:5: (lv_initialValue_4_0= ruleEInt )
                    {
                    // InternalSmartContractML.g:567:5: (lv_initialValue_4_0= ruleEInt )
                    // InternalSmartContractML.g:568:6: lv_initialValue_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getIntegerVariableAccess().getInitialValueEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_initialValue_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerVariableRule());
                    						}
                    						set(
                    							current,
                    							"initialValue",
                    							lv_initialValue_4_0,
                    							"fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "entryRuleEInt"
    // InternalSmartContractML.g:590:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmartContractML.g:590:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmartContractML.g:591:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmartContractML.g:597:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmartContractML.g:603:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmartContractML.g:604:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmartContractML.g:604:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmartContractML.g:605:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmartContractML.g:605:3: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmartContractML.g:606:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000093002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000092002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}