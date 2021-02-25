package fr.inria.kairos.tuto.simplelanguage.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.inria.kairos.tuto.simplelanguage.xtext.services.SmartContractMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmartContractMLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(SmartContractMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSmartContract"
    // InternalSmartContractML.g:53:1: entryRuleSmartContract : ruleSmartContract EOF ;
    public final void entryRuleSmartContract() throws RecognitionException {
        try {
            // InternalSmartContractML.g:54:1: ( ruleSmartContract EOF )
            // InternalSmartContractML.g:55:1: ruleSmartContract EOF
            {
             before(grammarAccess.getSmartContractRule()); 
            pushFollow(FOLLOW_1);
            ruleSmartContract();

            state._fsp--;

             after(grammarAccess.getSmartContractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSmartContract"


    // $ANTLR start "ruleSmartContract"
    // InternalSmartContractML.g:62:1: ruleSmartContract : ( ( rule__SmartContract__Group__0 ) ) ;
    public final void ruleSmartContract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:66:2: ( ( ( rule__SmartContract__Group__0 ) ) )
            // InternalSmartContractML.g:67:2: ( ( rule__SmartContract__Group__0 ) )
            {
            // InternalSmartContractML.g:67:2: ( ( rule__SmartContract__Group__0 ) )
            // InternalSmartContractML.g:68:3: ( rule__SmartContract__Group__0 )
            {
             before(grammarAccess.getSmartContractAccess().getGroup()); 
            // InternalSmartContractML.g:69:3: ( rule__SmartContract__Group__0 )
            // InternalSmartContractML.g:69:4: rule__SmartContract__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartContract"


    // $ANTLR start "entryRuleVariable"
    // InternalSmartContractML.g:78:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalSmartContractML.g:79:1: ( ruleVariable EOF )
            // InternalSmartContractML.g:80:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalSmartContractML.g:87:1: ruleVariable : ( ruleIntegerVariable ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:91:2: ( ( ruleIntegerVariable ) )
            // InternalSmartContractML.g:92:2: ( ruleIntegerVariable )
            {
            // InternalSmartContractML.g:92:2: ( ruleIntegerVariable )
            // InternalSmartContractML.g:93:3: ruleIntegerVariable
            {
             before(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleIntegerVariable();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleEString"
    // InternalSmartContractML.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmartContractML.g:104:1: ( ruleEString EOF )
            // InternalSmartContractML.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmartContractML.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmartContractML.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmartContractML.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalSmartContractML.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmartContractML.g:119:3: ( rule__EString__Alternatives )
            // InternalSmartContractML.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEvent"
    // InternalSmartContractML.g:128:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalSmartContractML.g:129:1: ( ruleEvent EOF )
            // InternalSmartContractML.g:130:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalSmartContractML.g:137:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:141:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalSmartContractML.g:142:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalSmartContractML.g:142:2: ( ( rule__Event__Group__0 ) )
            // InternalSmartContractML.g:143:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalSmartContractML.g:144:3: ( rule__Event__Group__0 )
            // InternalSmartContractML.g:144:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleState"
    // InternalSmartContractML.g:153:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalSmartContractML.g:154:1: ( ruleState EOF )
            // InternalSmartContractML.g:155:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalSmartContractML.g:162:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:166:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalSmartContractML.g:167:2: ( ( rule__State__Group__0 ) )
            {
            // InternalSmartContractML.g:167:2: ( ( rule__State__Group__0 ) )
            // InternalSmartContractML.g:168:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalSmartContractML.g:169:3: ( rule__State__Group__0 )
            // InternalSmartContractML.g:169:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFunction"
    // InternalSmartContractML.g:178:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalSmartContractML.g:179:1: ( ruleFunction EOF )
            // InternalSmartContractML.g:180:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalSmartContractML.g:187:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:191:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalSmartContractML.g:192:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalSmartContractML.g:192:2: ( ( rule__Function__Group__0 ) )
            // InternalSmartContractML.g:193:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalSmartContractML.g:194:3: ( rule__Function__Group__0 )
            // InternalSmartContractML.g:194:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleIntegerVariable"
    // InternalSmartContractML.g:203:1: entryRuleIntegerVariable : ruleIntegerVariable EOF ;
    public final void entryRuleIntegerVariable() throws RecognitionException {
        try {
            // InternalSmartContractML.g:204:1: ( ruleIntegerVariable EOF )
            // InternalSmartContractML.g:205:1: ruleIntegerVariable EOF
            {
             before(grammarAccess.getIntegerVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerVariable();

            state._fsp--;

             after(grammarAccess.getIntegerVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerVariable"


    // $ANTLR start "ruleIntegerVariable"
    // InternalSmartContractML.g:212:1: ruleIntegerVariable : ( ( rule__IntegerVariable__Group__0 ) ) ;
    public final void ruleIntegerVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:216:2: ( ( ( rule__IntegerVariable__Group__0 ) ) )
            // InternalSmartContractML.g:217:2: ( ( rule__IntegerVariable__Group__0 ) )
            {
            // InternalSmartContractML.g:217:2: ( ( rule__IntegerVariable__Group__0 ) )
            // InternalSmartContractML.g:218:3: ( rule__IntegerVariable__Group__0 )
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup()); 
            // InternalSmartContractML.g:219:3: ( rule__IntegerVariable__Group__0 )
            // InternalSmartContractML.g:219:4: rule__IntegerVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerVariable"


    // $ANTLR start "entryRuleEInt"
    // InternalSmartContractML.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmartContractML.g:229:1: ( ruleEInt EOF )
            // InternalSmartContractML.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmartContractML.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmartContractML.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmartContractML.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmartContractML.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmartContractML.g:244:3: ( rule__EInt__Group__0 )
            // InternalSmartContractML.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmartContractML.g:252:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:256:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSmartContractML.g:257:2: ( RULE_STRING )
                    {
                    // InternalSmartContractML.g:257:2: ( RULE_STRING )
                    // InternalSmartContractML.g:258:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmartContractML.g:263:2: ( RULE_ID )
                    {
                    // InternalSmartContractML.g:263:2: ( RULE_ID )
                    // InternalSmartContractML.g:264:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__SmartContract__Group__0"
    // InternalSmartContractML.g:273:1: rule__SmartContract__Group__0 : rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 ;
    public final void rule__SmartContract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:277:1: ( rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1 )
            // InternalSmartContractML.g:278:2: rule__SmartContract__Group__0__Impl rule__SmartContract__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SmartContract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0"


    // $ANTLR start "rule__SmartContract__Group__0__Impl"
    // InternalSmartContractML.g:285:1: rule__SmartContract__Group__0__Impl : ( () ) ;
    public final void rule__SmartContract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:289:1: ( ( () ) )
            // InternalSmartContractML.g:290:1: ( () )
            {
            // InternalSmartContractML.g:290:1: ( () )
            // InternalSmartContractML.g:291:2: ()
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractAction_0()); 
            // InternalSmartContractML.g:292:2: ()
            // InternalSmartContractML.g:292:3: 
            {
            }

             after(grammarAccess.getSmartContractAccess().getSmartContractAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__0__Impl"


    // $ANTLR start "rule__SmartContract__Group__1"
    // InternalSmartContractML.g:300:1: rule__SmartContract__Group__1 : rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 ;
    public final void rule__SmartContract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:304:1: ( rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2 )
            // InternalSmartContractML.g:305:2: rule__SmartContract__Group__1__Impl rule__SmartContract__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SmartContract__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1"


    // $ANTLR start "rule__SmartContract__Group__1__Impl"
    // InternalSmartContractML.g:312:1: rule__SmartContract__Group__1__Impl : ( 'SmartContract' ) ;
    public final void rule__SmartContract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:316:1: ( ( 'SmartContract' ) )
            // InternalSmartContractML.g:317:1: ( 'SmartContract' )
            {
            // InternalSmartContractML.g:317:1: ( 'SmartContract' )
            // InternalSmartContractML.g:318:2: 'SmartContract'
            {
             before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getSmartContractKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__1__Impl"


    // $ANTLR start "rule__SmartContract__Group__2"
    // InternalSmartContractML.g:327:1: rule__SmartContract__Group__2 : rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 ;
    public final void rule__SmartContract__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:331:1: ( rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3 )
            // InternalSmartContractML.g:332:2: rule__SmartContract__Group__2__Impl rule__SmartContract__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SmartContract__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2"


    // $ANTLR start "rule__SmartContract__Group__2__Impl"
    // InternalSmartContractML.g:339:1: rule__SmartContract__Group__2__Impl : ( ( rule__SmartContract__NameAssignment_2 ) ) ;
    public final void rule__SmartContract__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:343:1: ( ( ( rule__SmartContract__NameAssignment_2 ) ) )
            // InternalSmartContractML.g:344:1: ( ( rule__SmartContract__NameAssignment_2 ) )
            {
            // InternalSmartContractML.g:344:1: ( ( rule__SmartContract__NameAssignment_2 ) )
            // InternalSmartContractML.g:345:2: ( rule__SmartContract__NameAssignment_2 )
            {
             before(grammarAccess.getSmartContractAccess().getNameAssignment_2()); 
            // InternalSmartContractML.g:346:2: ( rule__SmartContract__NameAssignment_2 )
            // InternalSmartContractML.g:346:3: rule__SmartContract__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__2__Impl"


    // $ANTLR start "rule__SmartContract__Group__3"
    // InternalSmartContractML.g:354:1: rule__SmartContract__Group__3 : rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 ;
    public final void rule__SmartContract__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:358:1: ( rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4 )
            // InternalSmartContractML.g:359:2: rule__SmartContract__Group__3__Impl rule__SmartContract__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SmartContract__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3"


    // $ANTLR start "rule__SmartContract__Group__3__Impl"
    // InternalSmartContractML.g:366:1: rule__SmartContract__Group__3__Impl : ( ( rule__SmartContract__Group_3__0 )? ) ;
    public final void rule__SmartContract__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:370:1: ( ( ( rule__SmartContract__Group_3__0 )? ) )
            // InternalSmartContractML.g:371:1: ( ( rule__SmartContract__Group_3__0 )? )
            {
            // InternalSmartContractML.g:371:1: ( ( rule__SmartContract__Group_3__0 )? )
            // InternalSmartContractML.g:372:2: ( rule__SmartContract__Group_3__0 )?
            {
             before(grammarAccess.getSmartContractAccess().getGroup_3()); 
            // InternalSmartContractML.g:373:2: ( rule__SmartContract__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmartContractML.g:373:3: rule__SmartContract__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SmartContract__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartContractAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__3__Impl"


    // $ANTLR start "rule__SmartContract__Group__4"
    // InternalSmartContractML.g:381:1: rule__SmartContract__Group__4 : rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 ;
    public final void rule__SmartContract__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:385:1: ( rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5 )
            // InternalSmartContractML.g:386:2: rule__SmartContract__Group__4__Impl rule__SmartContract__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__SmartContract__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4"


    // $ANTLR start "rule__SmartContract__Group__4__Impl"
    // InternalSmartContractML.g:393:1: rule__SmartContract__Group__4__Impl : ( ( rule__SmartContract__OwnedEventsAssignment_4 )* ) ;
    public final void rule__SmartContract__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:397:1: ( ( ( rule__SmartContract__OwnedEventsAssignment_4 )* ) )
            // InternalSmartContractML.g:398:1: ( ( rule__SmartContract__OwnedEventsAssignment_4 )* )
            {
            // InternalSmartContractML.g:398:1: ( ( rule__SmartContract__OwnedEventsAssignment_4 )* )
            // InternalSmartContractML.g:399:2: ( rule__SmartContract__OwnedEventsAssignment_4 )*
            {
             before(grammarAccess.getSmartContractAccess().getOwnedEventsAssignment_4()); 
            // InternalSmartContractML.g:400:2: ( rule__SmartContract__OwnedEventsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSmartContractML.g:400:3: rule__SmartContract__OwnedEventsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SmartContract__OwnedEventsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getOwnedEventsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__4__Impl"


    // $ANTLR start "rule__SmartContract__Group__5"
    // InternalSmartContractML.g:408:1: rule__SmartContract__Group__5 : rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 ;
    public final void rule__SmartContract__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:412:1: ( rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6 )
            // InternalSmartContractML.g:413:2: rule__SmartContract__Group__5__Impl rule__SmartContract__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__SmartContract__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5"


    // $ANTLR start "rule__SmartContract__Group__5__Impl"
    // InternalSmartContractML.g:420:1: rule__SmartContract__Group__5__Impl : ( ( rule__SmartContract__OwnedStatesAssignment_5 )* ) ;
    public final void rule__SmartContract__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:424:1: ( ( ( rule__SmartContract__OwnedStatesAssignment_5 )* ) )
            // InternalSmartContractML.g:425:1: ( ( rule__SmartContract__OwnedStatesAssignment_5 )* )
            {
            // InternalSmartContractML.g:425:1: ( ( rule__SmartContract__OwnedStatesAssignment_5 )* )
            // InternalSmartContractML.g:426:2: ( rule__SmartContract__OwnedStatesAssignment_5 )*
            {
             before(grammarAccess.getSmartContractAccess().getOwnedStatesAssignment_5()); 
            // InternalSmartContractML.g:427:2: ( rule__SmartContract__OwnedStatesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSmartContractML.g:427:3: rule__SmartContract__OwnedStatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SmartContract__OwnedStatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getOwnedStatesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__5__Impl"


    // $ANTLR start "rule__SmartContract__Group__6"
    // InternalSmartContractML.g:435:1: rule__SmartContract__Group__6 : rule__SmartContract__Group__6__Impl ;
    public final void rule__SmartContract__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:439:1: ( rule__SmartContract__Group__6__Impl )
            // InternalSmartContractML.g:440:2: rule__SmartContract__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6"


    // $ANTLR start "rule__SmartContract__Group__6__Impl"
    // InternalSmartContractML.g:446:1: rule__SmartContract__Group__6__Impl : ( ( rule__SmartContract__OwnedFunctionsAssignment_6 )* ) ;
    public final void rule__SmartContract__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:450:1: ( ( ( rule__SmartContract__OwnedFunctionsAssignment_6 )* ) )
            // InternalSmartContractML.g:451:1: ( ( rule__SmartContract__OwnedFunctionsAssignment_6 )* )
            {
            // InternalSmartContractML.g:451:1: ( ( rule__SmartContract__OwnedFunctionsAssignment_6 )* )
            // InternalSmartContractML.g:452:2: ( rule__SmartContract__OwnedFunctionsAssignment_6 )*
            {
             before(grammarAccess.getSmartContractAccess().getOwnedFunctionsAssignment_6()); 
            // InternalSmartContractML.g:453:2: ( rule__SmartContract__OwnedFunctionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmartContractML.g:453:3: rule__SmartContract__OwnedFunctionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SmartContract__OwnedFunctionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSmartContractAccess().getOwnedFunctionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group__6__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__0"
    // InternalSmartContractML.g:462:1: rule__SmartContract__Group_3__0 : rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 ;
    public final void rule__SmartContract__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:466:1: ( rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1 )
            // InternalSmartContractML.g:467:2: rule__SmartContract__Group_3__0__Impl rule__SmartContract__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SmartContract__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0"


    // $ANTLR start "rule__SmartContract__Group_3__0__Impl"
    // InternalSmartContractML.g:474:1: rule__SmartContract__Group_3__0__Impl : ( '->' ) ;
    public final void rule__SmartContract__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:478:1: ( ( '->' ) )
            // InternalSmartContractML.g:479:1: ( '->' )
            {
            // InternalSmartContractML.g:479:1: ( '->' )
            // InternalSmartContractML.g:480:2: '->'
            {
             before(grammarAccess.getSmartContractAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSmartContractAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__0__Impl"


    // $ANTLR start "rule__SmartContract__Group_3__1"
    // InternalSmartContractML.g:489:1: rule__SmartContract__Group_3__1 : rule__SmartContract__Group_3__1__Impl ;
    public final void rule__SmartContract__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:493:1: ( rule__SmartContract__Group_3__1__Impl )
            // InternalSmartContractML.g:494:2: rule__SmartContract__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1"


    // $ANTLR start "rule__SmartContract__Group_3__1__Impl"
    // InternalSmartContractML.g:500:1: rule__SmartContract__Group_3__1__Impl : ( ( rule__SmartContract__InitialStateAssignment_3_1 ) ) ;
    public final void rule__SmartContract__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:504:1: ( ( ( rule__SmartContract__InitialStateAssignment_3_1 ) ) )
            // InternalSmartContractML.g:505:1: ( ( rule__SmartContract__InitialStateAssignment_3_1 ) )
            {
            // InternalSmartContractML.g:505:1: ( ( rule__SmartContract__InitialStateAssignment_3_1 ) )
            // InternalSmartContractML.g:506:2: ( rule__SmartContract__InitialStateAssignment_3_1 )
            {
             before(grammarAccess.getSmartContractAccess().getInitialStateAssignment_3_1()); 
            // InternalSmartContractML.g:507:2: ( rule__SmartContract__InitialStateAssignment_3_1 )
            // InternalSmartContractML.g:507:3: rule__SmartContract__InitialStateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SmartContract__InitialStateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartContractAccess().getInitialStateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__Group_3__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalSmartContractML.g:516:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:520:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalSmartContractML.g:521:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalSmartContractML.g:528:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:532:1: ( ( () ) )
            // InternalSmartContractML.g:533:1: ( () )
            {
            // InternalSmartContractML.g:533:1: ( () )
            // InternalSmartContractML.g:534:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalSmartContractML.g:535:2: ()
            // InternalSmartContractML.g:535:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalSmartContractML.g:543:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:547:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalSmartContractML.g:548:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalSmartContractML.g:555:1: rule__Event__Group__1__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:559:1: ( ( 'Event' ) )
            // InternalSmartContractML.g:560:1: ( 'Event' )
            {
            // InternalSmartContractML.g:560:1: ( 'Event' )
            // InternalSmartContractML.g:561:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalSmartContractML.g:570:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:574:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalSmartContractML.g:575:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalSmartContractML.g:582:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:586:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // InternalSmartContractML.g:587:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // InternalSmartContractML.g:587:1: ( ( rule__Event__NameAssignment_2 ) )
            // InternalSmartContractML.g:588:2: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // InternalSmartContractML.g:589:2: ( rule__Event__NameAssignment_2 )
            // InternalSmartContractML.g:589:3: rule__Event__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalSmartContractML.g:597:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:601:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalSmartContractML.g:602:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalSmartContractML.g:609:1: rule__Event__Group__3__Impl : ( 'from' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:613:1: ( ( 'from' ) )
            // InternalSmartContractML.g:614:1: ( 'from' )
            {
            // InternalSmartContractML.g:614:1: ( 'from' )
            // InternalSmartContractML.g:615:2: 'from'
            {
             before(grammarAccess.getEventAccess().getFromKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalSmartContractML.g:624:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:628:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // InternalSmartContractML.g:629:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalSmartContractML.g:636:1: rule__Event__Group__4__Impl : ( ( rule__Event__SourceStateAssignment_4 ) ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:640:1: ( ( ( rule__Event__SourceStateAssignment_4 ) ) )
            // InternalSmartContractML.g:641:1: ( ( rule__Event__SourceStateAssignment_4 ) )
            {
            // InternalSmartContractML.g:641:1: ( ( rule__Event__SourceStateAssignment_4 ) )
            // InternalSmartContractML.g:642:2: ( rule__Event__SourceStateAssignment_4 )
            {
             before(grammarAccess.getEventAccess().getSourceStateAssignment_4()); 
            // InternalSmartContractML.g:643:2: ( rule__Event__SourceStateAssignment_4 )
            // InternalSmartContractML.g:643:3: rule__Event__SourceStateAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Event__SourceStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getSourceStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // InternalSmartContractML.g:651:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:655:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // InternalSmartContractML.g:656:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // InternalSmartContractML.g:663:1: rule__Event__Group__5__Impl : ( 'to' ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:667:1: ( ( 'to' ) )
            // InternalSmartContractML.g:668:1: ( 'to' )
            {
            // InternalSmartContractML.g:668:1: ( 'to' )
            // InternalSmartContractML.g:669:2: 'to'
            {
             before(grammarAccess.getEventAccess().getToKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__6"
    // InternalSmartContractML.g:678:1: rule__Event__Group__6 : rule__Event__Group__6__Impl ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:682:1: ( rule__Event__Group__6__Impl )
            // InternalSmartContractML.g:683:2: rule__Event__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6"


    // $ANTLR start "rule__Event__Group__6__Impl"
    // InternalSmartContractML.g:689:1: rule__Event__Group__6__Impl : ( ( rule__Event__TargetStateAssignment_6 ) ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:693:1: ( ( ( rule__Event__TargetStateAssignment_6 ) ) )
            // InternalSmartContractML.g:694:1: ( ( rule__Event__TargetStateAssignment_6 ) )
            {
            // InternalSmartContractML.g:694:1: ( ( rule__Event__TargetStateAssignment_6 ) )
            // InternalSmartContractML.g:695:2: ( rule__Event__TargetStateAssignment_6 )
            {
             before(grammarAccess.getEventAccess().getTargetStateAssignment_6()); 
            // InternalSmartContractML.g:696:2: ( rule__Event__TargetStateAssignment_6 )
            // InternalSmartContractML.g:696:3: rule__Event__TargetStateAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Event__TargetStateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTargetStateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalSmartContractML.g:705:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:709:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalSmartContractML.g:710:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalSmartContractML.g:717:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:721:1: ( ( () ) )
            // InternalSmartContractML.g:722:1: ( () )
            {
            // InternalSmartContractML.g:722:1: ( () )
            // InternalSmartContractML.g:723:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalSmartContractML.g:724:2: ()
            // InternalSmartContractML.g:724:3: 
            {
            }

             after(grammarAccess.getStateAccess().getStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalSmartContractML.g:732:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:736:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalSmartContractML.g:737:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalSmartContractML.g:744:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:748:1: ( ( 'State' ) )
            // InternalSmartContractML.g:749:1: ( 'State' )
            {
            // InternalSmartContractML.g:749:1: ( 'State' )
            // InternalSmartContractML.g:750:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalSmartContractML.g:759:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:763:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalSmartContractML.g:764:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalSmartContractML.g:771:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:775:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalSmartContractML.g:776:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalSmartContractML.g:776:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalSmartContractML.g:777:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalSmartContractML.g:778:2: ( rule__State__NameAssignment_2 )
            // InternalSmartContractML.g:778:3: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalSmartContractML.g:786:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:790:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // InternalSmartContractML.g:791:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalSmartContractML.g:798:1: rule__State__Group__3__Impl : ( ( rule__State__Group_3__0 )? ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:802:1: ( ( ( rule__State__Group_3__0 )? ) )
            // InternalSmartContractML.g:803:1: ( ( rule__State__Group_3__0 )? )
            {
            // InternalSmartContractML.g:803:1: ( ( rule__State__Group_3__0 )? )
            // InternalSmartContractML.g:804:2: ( rule__State__Group_3__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_3()); 
            // InternalSmartContractML.g:805:2: ( rule__State__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmartContractML.g:805:3: rule__State__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__State__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // InternalSmartContractML.g:813:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:817:1: ( rule__State__Group__4__Impl )
            // InternalSmartContractML.g:818:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // InternalSmartContractML.g:824:1: rule__State__Group__4__Impl : ( ( rule__State__OwnedVariablesAssignment_4 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:828:1: ( ( ( rule__State__OwnedVariablesAssignment_4 )* ) )
            // InternalSmartContractML.g:829:1: ( ( rule__State__OwnedVariablesAssignment_4 )* )
            {
            // InternalSmartContractML.g:829:1: ( ( rule__State__OwnedVariablesAssignment_4 )* )
            // InternalSmartContractML.g:830:2: ( rule__State__OwnedVariablesAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getOwnedVariablesAssignment_4()); 
            // InternalSmartContractML.g:831:2: ( rule__State__OwnedVariablesAssignment_4 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmartContractML.g:831:3: rule__State__OwnedVariablesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__State__OwnedVariablesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getOwnedVariablesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group_3__0"
    // InternalSmartContractML.g:840:1: rule__State__Group_3__0 : rule__State__Group_3__0__Impl rule__State__Group_3__1 ;
    public final void rule__State__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:844:1: ( rule__State__Group_3__0__Impl rule__State__Group_3__1 )
            // InternalSmartContractML.g:845:2: rule__State__Group_3__0__Impl rule__State__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__State__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0"


    // $ANTLR start "rule__State__Group_3__0__Impl"
    // InternalSmartContractML.g:852:1: rule__State__Group_3__0__Impl : ( 'var' ) ;
    public final void rule__State__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:856:1: ( ( 'var' ) )
            // InternalSmartContractML.g:857:1: ( 'var' )
            {
            // InternalSmartContractML.g:857:1: ( 'var' )
            // InternalSmartContractML.g:858:2: 'var'
            {
             before(grammarAccess.getStateAccess().getVarKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getVarKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__0__Impl"


    // $ANTLR start "rule__State__Group_3__1"
    // InternalSmartContractML.g:867:1: rule__State__Group_3__1 : rule__State__Group_3__1__Impl rule__State__Group_3__2 ;
    public final void rule__State__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:871:1: ( rule__State__Group_3__1__Impl rule__State__Group_3__2 )
            // InternalSmartContractML.g:872:2: rule__State__Group_3__1__Impl rule__State__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__State__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1"


    // $ANTLR start "rule__State__Group_3__1__Impl"
    // InternalSmartContractML.g:879:1: rule__State__Group_3__1__Impl : ( ':' ) ;
    public final void rule__State__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:883:1: ( ( ':' ) )
            // InternalSmartContractML.g:884:1: ( ':' )
            {
            // InternalSmartContractML.g:884:1: ( ':' )
            // InternalSmartContractML.g:885:2: ':'
            {
             before(grammarAccess.getStateAccess().getColonKeyword_3_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__1__Impl"


    // $ANTLR start "rule__State__Group_3__2"
    // InternalSmartContractML.g:894:1: rule__State__Group_3__2 : rule__State__Group_3__2__Impl ;
    public final void rule__State__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:898:1: ( rule__State__Group_3__2__Impl )
            // InternalSmartContractML.g:899:2: rule__State__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2"


    // $ANTLR start "rule__State__Group_3__2__Impl"
    // InternalSmartContractML.g:905:1: rule__State__Group_3__2__Impl : ( ( rule__State__OwnedVariablesAssignment_3_2 ) ) ;
    public final void rule__State__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:909:1: ( ( ( rule__State__OwnedVariablesAssignment_3_2 ) ) )
            // InternalSmartContractML.g:910:1: ( ( rule__State__OwnedVariablesAssignment_3_2 ) )
            {
            // InternalSmartContractML.g:910:1: ( ( rule__State__OwnedVariablesAssignment_3_2 ) )
            // InternalSmartContractML.g:911:2: ( rule__State__OwnedVariablesAssignment_3_2 )
            {
             before(grammarAccess.getStateAccess().getOwnedVariablesAssignment_3_2()); 
            // InternalSmartContractML.g:912:2: ( rule__State__OwnedVariablesAssignment_3_2 )
            // InternalSmartContractML.g:912:3: rule__State__OwnedVariablesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__State__OwnedVariablesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getOwnedVariablesAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_3__2__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalSmartContractML.g:921:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:925:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalSmartContractML.g:926:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalSmartContractML.g:933:1: rule__Function__Group__0__Impl : ( () ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:937:1: ( ( () ) )
            // InternalSmartContractML.g:938:1: ( () )
            {
            // InternalSmartContractML.g:938:1: ( () )
            // InternalSmartContractML.g:939:2: ()
            {
             before(grammarAccess.getFunctionAccess().getFunctionAction_0()); 
            // InternalSmartContractML.g:940:2: ()
            // InternalSmartContractML.g:940:3: 
            {
            }

             after(grammarAccess.getFunctionAccess().getFunctionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalSmartContractML.g:948:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:952:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalSmartContractML.g:953:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalSmartContractML.g:960:1: rule__Function__Group__1__Impl : ( 'Function' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:964:1: ( ( 'Function' ) )
            // InternalSmartContractML.g:965:1: ( 'Function' )
            {
            // InternalSmartContractML.g:965:1: ( 'Function' )
            // InternalSmartContractML.g:966:2: 'Function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalSmartContractML.g:975:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:979:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalSmartContractML.g:980:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalSmartContractML.g:987:1: rule__Function__Group__2__Impl : ( ( rule__Function__NameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:991:1: ( ( ( rule__Function__NameAssignment_2 ) ) )
            // InternalSmartContractML.g:992:1: ( ( rule__Function__NameAssignment_2 ) )
            {
            // InternalSmartContractML.g:992:1: ( ( rule__Function__NameAssignment_2 ) )
            // InternalSmartContractML.g:993:2: ( rule__Function__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_2()); 
            // InternalSmartContractML.g:994:2: ( rule__Function__NameAssignment_2 )
            // InternalSmartContractML.g:994:3: rule__Function__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalSmartContractML.g:1002:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1006:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalSmartContractML.g:1007:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalSmartContractML.g:1014:1: rule__Function__Group__3__Impl : ( '(' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1018:1: ( ( '(' ) )
            // InternalSmartContractML.g:1019:1: ( '(' )
            {
            // InternalSmartContractML.g:1019:1: ( '(' )
            // InternalSmartContractML.g:1020:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalSmartContractML.g:1029:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1033:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalSmartContractML.g:1034:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalSmartContractML.g:1041:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1045:1: ( ( ')' ) )
            // InternalSmartContractML.g:1046:1: ( ')' )
            {
            // InternalSmartContractML.g:1046:1: ( ')' )
            // InternalSmartContractML.g:1047:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalSmartContractML.g:1056:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1060:1: ( rule__Function__Group__5__Impl )
            // InternalSmartContractML.g:1061:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalSmartContractML.g:1067:1: rule__Function__Group__5__Impl : ( ( rule__Function__Group_5__0 )? ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1071:1: ( ( ( rule__Function__Group_5__0 )? ) )
            // InternalSmartContractML.g:1072:1: ( ( rule__Function__Group_5__0 )? )
            {
            // InternalSmartContractML.g:1072:1: ( ( rule__Function__Group_5__0 )? )
            // InternalSmartContractML.g:1073:2: ( rule__Function__Group_5__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_5()); 
            // InternalSmartContractML.g:1074:2: ( rule__Function__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmartContractML.g:1074:3: rule__Function__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group_5__0"
    // InternalSmartContractML.g:1083:1: rule__Function__Group_5__0 : rule__Function__Group_5__0__Impl rule__Function__Group_5__1 ;
    public final void rule__Function__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1087:1: ( rule__Function__Group_5__0__Impl rule__Function__Group_5__1 )
            // InternalSmartContractML.g:1088:2: rule__Function__Group_5__0__Impl rule__Function__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__0"


    // $ANTLR start "rule__Function__Group_5__0__Impl"
    // InternalSmartContractML.g:1095:1: rule__Function__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Function__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1099:1: ( ( ':' ) )
            // InternalSmartContractML.g:1100:1: ( ':' )
            {
            // InternalSmartContractML.g:1100:1: ( ':' )
            // InternalSmartContractML.g:1101:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__0__Impl"


    // $ANTLR start "rule__Function__Group_5__1"
    // InternalSmartContractML.g:1110:1: rule__Function__Group_5__1 : rule__Function__Group_5__1__Impl ;
    public final void rule__Function__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1114:1: ( rule__Function__Group_5__1__Impl )
            // InternalSmartContractML.g:1115:2: rule__Function__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__1"


    // $ANTLR start "rule__Function__Group_5__1__Impl"
    // InternalSmartContractML.g:1121:1: rule__Function__Group_5__1__Impl : ( ( rule__Function__EventAssignment_5_1 ) ) ;
    public final void rule__Function__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1125:1: ( ( ( rule__Function__EventAssignment_5_1 ) ) )
            // InternalSmartContractML.g:1126:1: ( ( rule__Function__EventAssignment_5_1 ) )
            {
            // InternalSmartContractML.g:1126:1: ( ( rule__Function__EventAssignment_5_1 ) )
            // InternalSmartContractML.g:1127:2: ( rule__Function__EventAssignment_5_1 )
            {
             before(grammarAccess.getFunctionAccess().getEventAssignment_5_1()); 
            // InternalSmartContractML.g:1128:2: ( rule__Function__EventAssignment_5_1 )
            // InternalSmartContractML.g:1128:3: rule__Function__EventAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__EventAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getEventAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__0"
    // InternalSmartContractML.g:1137:1: rule__IntegerVariable__Group__0 : rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 ;
    public final void rule__IntegerVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1141:1: ( rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1 )
            // InternalSmartContractML.g:1142:2: rule__IntegerVariable__Group__0__Impl rule__IntegerVariable__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__IntegerVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__0"


    // $ANTLR start "rule__IntegerVariable__Group__0__Impl"
    // InternalSmartContractML.g:1149:1: rule__IntegerVariable__Group__0__Impl : ( () ) ;
    public final void rule__IntegerVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1153:1: ( ( () ) )
            // InternalSmartContractML.g:1154:1: ( () )
            {
            // InternalSmartContractML.g:1154:1: ( () )
            // InternalSmartContractML.g:1155:2: ()
            {
             before(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 
            // InternalSmartContractML.g:1156:2: ()
            // InternalSmartContractML.g:1156:3: 
            {
            }

             after(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__0__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__1"
    // InternalSmartContractML.g:1164:1: rule__IntegerVariable__Group__1 : rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 ;
    public final void rule__IntegerVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1168:1: ( rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2 )
            // InternalSmartContractML.g:1169:2: rule__IntegerVariable__Group__1__Impl rule__IntegerVariable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__IntegerVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__1"


    // $ANTLR start "rule__IntegerVariable__Group__1__Impl"
    // InternalSmartContractML.g:1176:1: rule__IntegerVariable__Group__1__Impl : ( 'int' ) ;
    public final void rule__IntegerVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1180:1: ( ( 'int' ) )
            // InternalSmartContractML.g:1181:1: ( 'int' )
            {
            // InternalSmartContractML.g:1181:1: ( 'int' )
            // InternalSmartContractML.g:1182:2: 'int'
            {
             before(grammarAccess.getIntegerVariableAccess().getIntKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIntegerVariableAccess().getIntKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__1__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__2"
    // InternalSmartContractML.g:1191:1: rule__IntegerVariable__Group__2 : rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 ;
    public final void rule__IntegerVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1195:1: ( rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3 )
            // InternalSmartContractML.g:1196:2: rule__IntegerVariable__Group__2__Impl rule__IntegerVariable__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__IntegerVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__2"


    // $ANTLR start "rule__IntegerVariable__Group__2__Impl"
    // InternalSmartContractML.g:1203:1: rule__IntegerVariable__Group__2__Impl : ( ( rule__IntegerVariable__NameAssignment_2 ) ) ;
    public final void rule__IntegerVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1207:1: ( ( ( rule__IntegerVariable__NameAssignment_2 ) ) )
            // InternalSmartContractML.g:1208:1: ( ( rule__IntegerVariable__NameAssignment_2 ) )
            {
            // InternalSmartContractML.g:1208:1: ( ( rule__IntegerVariable__NameAssignment_2 ) )
            // InternalSmartContractML.g:1209:2: ( rule__IntegerVariable__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); 
            // InternalSmartContractML.g:1210:2: ( rule__IntegerVariable__NameAssignment_2 )
            // InternalSmartContractML.g:1210:3: rule__IntegerVariable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__2__Impl"


    // $ANTLR start "rule__IntegerVariable__Group__3"
    // InternalSmartContractML.g:1218:1: rule__IntegerVariable__Group__3 : rule__IntegerVariable__Group__3__Impl ;
    public final void rule__IntegerVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1222:1: ( rule__IntegerVariable__Group__3__Impl )
            // InternalSmartContractML.g:1223:2: rule__IntegerVariable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__3"


    // $ANTLR start "rule__IntegerVariable__Group__3__Impl"
    // InternalSmartContractML.g:1229:1: rule__IntegerVariable__Group__3__Impl : ( ( rule__IntegerVariable__Group_3__0 )? ) ;
    public final void rule__IntegerVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1233:1: ( ( ( rule__IntegerVariable__Group_3__0 )? ) )
            // InternalSmartContractML.g:1234:1: ( ( rule__IntegerVariable__Group_3__0 )? )
            {
            // InternalSmartContractML.g:1234:1: ( ( rule__IntegerVariable__Group_3__0 )? )
            // InternalSmartContractML.g:1235:2: ( rule__IntegerVariable__Group_3__0 )?
            {
             before(grammarAccess.getIntegerVariableAccess().getGroup_3()); 
            // InternalSmartContractML.g:1236:2: ( rule__IntegerVariable__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmartContractML.g:1236:3: rule__IntegerVariable__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerVariable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerVariableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group__3__Impl"


    // $ANTLR start "rule__IntegerVariable__Group_3__0"
    // InternalSmartContractML.g:1245:1: rule__IntegerVariable__Group_3__0 : rule__IntegerVariable__Group_3__0__Impl rule__IntegerVariable__Group_3__1 ;
    public final void rule__IntegerVariable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1249:1: ( rule__IntegerVariable__Group_3__0__Impl rule__IntegerVariable__Group_3__1 )
            // InternalSmartContractML.g:1250:2: rule__IntegerVariable__Group_3__0__Impl rule__IntegerVariable__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__IntegerVariable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_3__0"


    // $ANTLR start "rule__IntegerVariable__Group_3__0__Impl"
    // InternalSmartContractML.g:1257:1: rule__IntegerVariable__Group_3__0__Impl : ( '=' ) ;
    public final void rule__IntegerVariable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1261:1: ( ( '=' ) )
            // InternalSmartContractML.g:1262:1: ( '=' )
            {
            // InternalSmartContractML.g:1262:1: ( '=' )
            // InternalSmartContractML.g:1263:2: '='
            {
             before(grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_3__0__Impl"


    // $ANTLR start "rule__IntegerVariable__Group_3__1"
    // InternalSmartContractML.g:1272:1: rule__IntegerVariable__Group_3__1 : rule__IntegerVariable__Group_3__1__Impl ;
    public final void rule__IntegerVariable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1276:1: ( rule__IntegerVariable__Group_3__1__Impl )
            // InternalSmartContractML.g:1277:2: rule__IntegerVariable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_3__1"


    // $ANTLR start "rule__IntegerVariable__Group_3__1__Impl"
    // InternalSmartContractML.g:1283:1: rule__IntegerVariable__Group_3__1__Impl : ( ( rule__IntegerVariable__InitialValueAssignment_3_1 ) ) ;
    public final void rule__IntegerVariable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1287:1: ( ( ( rule__IntegerVariable__InitialValueAssignment_3_1 ) ) )
            // InternalSmartContractML.g:1288:1: ( ( rule__IntegerVariable__InitialValueAssignment_3_1 ) )
            {
            // InternalSmartContractML.g:1288:1: ( ( rule__IntegerVariable__InitialValueAssignment_3_1 ) )
            // InternalSmartContractML.g:1289:2: ( rule__IntegerVariable__InitialValueAssignment_3_1 )
            {
             before(grammarAccess.getIntegerVariableAccess().getInitialValueAssignment_3_1()); 
            // InternalSmartContractML.g:1290:2: ( rule__IntegerVariable__InitialValueAssignment_3_1 )
            // InternalSmartContractML.g:1290:3: rule__IntegerVariable__InitialValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerVariable__InitialValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerVariableAccess().getInitialValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__Group_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSmartContractML.g:1299:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1303:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmartContractML.g:1304:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSmartContractML.g:1311:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1315:1: ( ( ( '-' )? ) )
            // InternalSmartContractML.g:1316:1: ( ( '-' )? )
            {
            // InternalSmartContractML.g:1316:1: ( ( '-' )? )
            // InternalSmartContractML.g:1317:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmartContractML.g:1318:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmartContractML.g:1318:3: '-'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSmartContractML.g:1326:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1330:1: ( rule__EInt__Group__1__Impl )
            // InternalSmartContractML.g:1331:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSmartContractML.g:1337:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1341:1: ( ( RULE_INT ) )
            // InternalSmartContractML.g:1342:1: ( RULE_INT )
            {
            // InternalSmartContractML.g:1342:1: ( RULE_INT )
            // InternalSmartContractML.g:1343:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__SmartContract__NameAssignment_2"
    // InternalSmartContractML.g:1353:1: rule__SmartContract__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SmartContract__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1357:1: ( ( ruleEString ) )
            // InternalSmartContractML.g:1358:2: ( ruleEString )
            {
            // InternalSmartContractML.g:1358:2: ( ruleEString )
            // InternalSmartContractML.g:1359:3: ruleEString
            {
             before(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__NameAssignment_2"


    // $ANTLR start "rule__SmartContract__InitialStateAssignment_3_1"
    // InternalSmartContractML.g:1368:1: rule__SmartContract__InitialStateAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SmartContract__InitialStateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1372:1: ( ( ( ruleEString ) ) )
            // InternalSmartContractML.g:1373:2: ( ( ruleEString ) )
            {
            // InternalSmartContractML.g:1373:2: ( ( ruleEString ) )
            // InternalSmartContractML.g:1374:3: ( ruleEString )
            {
             before(grammarAccess.getSmartContractAccess().getInitialStateStateCrossReference_3_1_0()); 
            // InternalSmartContractML.g:1375:3: ( ruleEString )
            // InternalSmartContractML.g:1376:4: ruleEString
            {
             before(grammarAccess.getSmartContractAccess().getInitialStateStateEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getInitialStateStateEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSmartContractAccess().getInitialStateStateCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__InitialStateAssignment_3_1"


    // $ANTLR start "rule__SmartContract__OwnedEventsAssignment_4"
    // InternalSmartContractML.g:1387:1: rule__SmartContract__OwnedEventsAssignment_4 : ( ruleEvent ) ;
    public final void rule__SmartContract__OwnedEventsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1391:1: ( ( ruleEvent ) )
            // InternalSmartContractML.g:1392:2: ( ruleEvent )
            {
            // InternalSmartContractML.g:1392:2: ( ruleEvent )
            // InternalSmartContractML.g:1393:3: ruleEvent
            {
             before(grammarAccess.getSmartContractAccess().getOwnedEventsEventParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOwnedEventsEventParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OwnedEventsAssignment_4"


    // $ANTLR start "rule__SmartContract__OwnedStatesAssignment_5"
    // InternalSmartContractML.g:1402:1: rule__SmartContract__OwnedStatesAssignment_5 : ( ruleState ) ;
    public final void rule__SmartContract__OwnedStatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1406:1: ( ( ruleState ) )
            // InternalSmartContractML.g:1407:2: ( ruleState )
            {
            // InternalSmartContractML.g:1407:2: ( ruleState )
            // InternalSmartContractML.g:1408:3: ruleState
            {
             before(grammarAccess.getSmartContractAccess().getOwnedStatesStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOwnedStatesStateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OwnedStatesAssignment_5"


    // $ANTLR start "rule__SmartContract__OwnedFunctionsAssignment_6"
    // InternalSmartContractML.g:1417:1: rule__SmartContract__OwnedFunctionsAssignment_6 : ( ruleFunction ) ;
    public final void rule__SmartContract__OwnedFunctionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1421:1: ( ( ruleFunction ) )
            // InternalSmartContractML.g:1422:2: ( ruleFunction )
            {
            // InternalSmartContractML.g:1422:2: ( ruleFunction )
            // InternalSmartContractML.g:1423:3: ruleFunction
            {
             before(grammarAccess.getSmartContractAccess().getOwnedFunctionsFunctionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getSmartContractAccess().getOwnedFunctionsFunctionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartContract__OwnedFunctionsAssignment_6"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // InternalSmartContractML.g:1432:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1436:1: ( ( ruleEString ) )
            // InternalSmartContractML.g:1437:2: ( ruleEString )
            {
            // InternalSmartContractML.g:1437:2: ( ruleEString )
            // InternalSmartContractML.g:1438:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_2"


    // $ANTLR start "rule__Event__SourceStateAssignment_4"
    // InternalSmartContractML.g:1447:1: rule__Event__SourceStateAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Event__SourceStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1451:1: ( ( ( ruleEString ) ) )
            // InternalSmartContractML.g:1452:2: ( ( ruleEString ) )
            {
            // InternalSmartContractML.g:1452:2: ( ( ruleEString ) )
            // InternalSmartContractML.g:1453:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getSourceStateStateCrossReference_4_0()); 
            // InternalSmartContractML.g:1454:3: ( ruleEString )
            // InternalSmartContractML.g:1455:4: ruleEString
            {
             before(grammarAccess.getEventAccess().getSourceStateStateEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getSourceStateStateEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getEventAccess().getSourceStateStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__SourceStateAssignment_4"


    // $ANTLR start "rule__Event__TargetStateAssignment_6"
    // InternalSmartContractML.g:1466:1: rule__Event__TargetStateAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Event__TargetStateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1470:1: ( ( ( ruleEString ) ) )
            // InternalSmartContractML.g:1471:2: ( ( ruleEString ) )
            {
            // InternalSmartContractML.g:1471:2: ( ( ruleEString ) )
            // InternalSmartContractML.g:1472:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getTargetStateStateCrossReference_6_0()); 
            // InternalSmartContractML.g:1473:3: ( ruleEString )
            // InternalSmartContractML.g:1474:4: ruleEString
            {
             before(grammarAccess.getEventAccess().getTargetStateStateEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTargetStateStateEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getEventAccess().getTargetStateStateCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TargetStateAssignment_6"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalSmartContractML.g:1485:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1489:1: ( ( ruleEString ) )
            // InternalSmartContractML.g:1490:2: ( ruleEString )
            {
            // InternalSmartContractML.g:1490:2: ( ruleEString )
            // InternalSmartContractML.g:1491:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__OwnedVariablesAssignment_3_2"
    // InternalSmartContractML.g:1500:1: rule__State__OwnedVariablesAssignment_3_2 : ( ruleVariable ) ;
    public final void rule__State__OwnedVariablesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1504:1: ( ( ruleVariable ) )
            // InternalSmartContractML.g:1505:2: ( ruleVariable )
            {
            // InternalSmartContractML.g:1505:2: ( ruleVariable )
            // InternalSmartContractML.g:1506:3: ruleVariable
            {
             before(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OwnedVariablesAssignment_3_2"


    // $ANTLR start "rule__State__OwnedVariablesAssignment_4"
    // InternalSmartContractML.g:1515:1: rule__State__OwnedVariablesAssignment_4 : ( ruleVariable ) ;
    public final void rule__State__OwnedVariablesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1519:1: ( ( ruleVariable ) )
            // InternalSmartContractML.g:1520:2: ( ruleVariable )
            {
            // InternalSmartContractML.g:1520:2: ( ruleVariable )
            // InternalSmartContractML.g:1521:3: ruleVariable
            {
             before(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__OwnedVariablesAssignment_4"


    // $ANTLR start "rule__Function__NameAssignment_2"
    // InternalSmartContractML.g:1530:1: rule__Function__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Function__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1534:1: ( ( ruleEString ) )
            // InternalSmartContractML.g:1535:2: ( ruleEString )
            {
            // InternalSmartContractML.g:1535:2: ( ruleEString )
            // InternalSmartContractML.g:1536:3: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_2"


    // $ANTLR start "rule__Function__EventAssignment_5_1"
    // InternalSmartContractML.g:1545:1: rule__Function__EventAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Function__EventAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1549:1: ( ( ( ruleEString ) ) )
            // InternalSmartContractML.g:1550:2: ( ( ruleEString ) )
            {
            // InternalSmartContractML.g:1550:2: ( ( ruleEString ) )
            // InternalSmartContractML.g:1551:3: ( ruleEString )
            {
             before(grammarAccess.getFunctionAccess().getEventEventCrossReference_5_1_0()); 
            // InternalSmartContractML.g:1552:3: ( ruleEString )
            // InternalSmartContractML.g:1553:4: ruleEString
            {
             before(grammarAccess.getFunctionAccess().getEventEventEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getEventEventEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getEventEventCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__EventAssignment_5_1"


    // $ANTLR start "rule__IntegerVariable__NameAssignment_2"
    // InternalSmartContractML.g:1564:1: rule__IntegerVariable__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IntegerVariable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1568:1: ( ( ruleEString ) )
            // InternalSmartContractML.g:1569:2: ( ruleEString )
            {
            // InternalSmartContractML.g:1569:2: ( ruleEString )
            // InternalSmartContractML.g:1570:3: ruleEString
            {
             before(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__NameAssignment_2"


    // $ANTLR start "rule__IntegerVariable__InitialValueAssignment_3_1"
    // InternalSmartContractML.g:1579:1: rule__IntegerVariable__InitialValueAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__IntegerVariable__InitialValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmartContractML.g:1583:1: ( ( ruleEInt ) )
            // InternalSmartContractML.g:1584:2: ( ruleEInt )
            {
            // InternalSmartContractML.g:1584:2: ( ruleEInt )
            // InternalSmartContractML.g:1585:3: ruleEInt
            {
             before(grammarAccess.getIntegerVariableAccess().getInitialValueEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntegerVariableAccess().getInitialValueEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerVariable__InitialValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000093000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000040L});

}