/*
 * generated by Xtext 2.24.0
 */
package fr.inria.kairos.tuto.simplelanguage.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SmartContractMLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SmartContractElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.SmartContract");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSmartContractAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSmartContractKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInitialStateAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInitialStateStateCrossReference_3_1_0 = (CrossReference)cInitialStateAssignment_3_1.eContents().get(0);
		private final RuleCall cInitialStateStateEStringParserRuleCall_3_1_0_1 = (RuleCall)cInitialStateStateCrossReference_3_1_0.eContents().get(1);
		private final Assignment cOwnedEventsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedEventsEventParserRuleCall_4_0 = (RuleCall)cOwnedEventsAssignment_4.eContents().get(0);
		private final Assignment cOwnedStatesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOwnedStatesStateParserRuleCall_5_0 = (RuleCall)cOwnedStatesAssignment_5.eContents().get(0);
		private final Assignment cOwnedFunctionsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cOwnedFunctionsFunctionParserRuleCall_6_0 = (RuleCall)cOwnedFunctionsAssignment_6.eContents().get(0);
		
		//SmartContract:
		//	{SmartContract}
		//	'SmartContract'
		//	name=EString ('->' initialState=[State|EString])?
		//	ownedEvents+=Event*
		//	ownedStates+=State*
		//	ownedFunctions+=Function*;
		@Override public ParserRule getRule() { return rule; }
		
		//{SmartContract}
		//'SmartContract'
		//name=EString ('->' initialState=[State|EString])?
		//ownedEvents+=Event*
		//ownedStates+=State*
		//ownedFunctions+=Function*
		public Group getGroup() { return cGroup; }
		
		//{SmartContract}
		public Action getSmartContractAction_0() { return cSmartContractAction_0; }
		
		//'SmartContract'
		public Keyword getSmartContractKeyword_1() { return cSmartContractKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//('->' initialState=[State|EString])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_3_0() { return cHyphenMinusGreaterThanSignKeyword_3_0; }
		
		//initialState=[State|EString]
		public Assignment getInitialStateAssignment_3_1() { return cInitialStateAssignment_3_1; }
		
		//[State|EString]
		public CrossReference getInitialStateStateCrossReference_3_1_0() { return cInitialStateStateCrossReference_3_1_0; }
		
		//EString
		public RuleCall getInitialStateStateEStringParserRuleCall_3_1_0_1() { return cInitialStateStateEStringParserRuleCall_3_1_0_1; }
		
		//ownedEvents+=Event*
		public Assignment getOwnedEventsAssignment_4() { return cOwnedEventsAssignment_4; }
		
		//Event
		public RuleCall getOwnedEventsEventParserRuleCall_4_0() { return cOwnedEventsEventParserRuleCall_4_0; }
		
		//ownedStates+=State*
		public Assignment getOwnedStatesAssignment_5() { return cOwnedStatesAssignment_5; }
		
		//State
		public RuleCall getOwnedStatesStateParserRuleCall_5_0() { return cOwnedStatesStateParserRuleCall_5_0; }
		
		//ownedFunctions+=Function*
		public Assignment getOwnedFunctionsAssignment_6() { return cOwnedFunctionsAssignment_6; }
		
		//Function
		public RuleCall getOwnedFunctionsFunctionParserRuleCall_6_0() { return cOwnedFunctionsFunctionParserRuleCall_6_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.Variable");
		private final RuleCall cIntegerVariableParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Variable:
		//	IntegerVariable;
		@Override public ParserRule getRule() { return rule; }
		
		//IntegerVariable
		public RuleCall getIntegerVariableParserRuleCall() { return cIntegerVariableParserRuleCall; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEventAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEventKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cFromKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cSourceStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cSourceStateStateCrossReference_4_0 = (CrossReference)cSourceStateAssignment_4.eContents().get(0);
		private final RuleCall cSourceStateStateEStringParserRuleCall_4_0_1 = (RuleCall)cSourceStateStateCrossReference_4_0.eContents().get(1);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cTargetStateAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cTargetStateStateCrossReference_6_0 = (CrossReference)cTargetStateAssignment_6.eContents().get(0);
		private final RuleCall cTargetStateStateEStringParserRuleCall_6_0_1 = (RuleCall)cTargetStateStateCrossReference_6_0.eContents().get(1);
		
		//Event:
		//	{Event}
		//	'Event'
		//	name=EString
		//	'from' sourceState=[State|EString]
		//	'to' targetState=[State|EString];
		@Override public ParserRule getRule() { return rule; }
		
		//{Event}
		//'Event'
		//name=EString
		//'from' sourceState=[State|EString]
		//'to' targetState=[State|EString]
		public Group getGroup() { return cGroup; }
		
		//{Event}
		public Action getEventAction_0() { return cEventAction_0; }
		
		//'Event'
		public Keyword getEventKeyword_1() { return cEventKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'from'
		public Keyword getFromKeyword_3() { return cFromKeyword_3; }
		
		//sourceState=[State|EString]
		public Assignment getSourceStateAssignment_4() { return cSourceStateAssignment_4; }
		
		//[State|EString]
		public CrossReference getSourceStateStateCrossReference_4_0() { return cSourceStateStateCrossReference_4_0; }
		
		//EString
		public RuleCall getSourceStateStateEStringParserRuleCall_4_0_1() { return cSourceStateStateEStringParserRuleCall_4_0_1; }
		
		//'to'
		public Keyword getToKeyword_5() { return cToKeyword_5; }
		
		//targetState=[State|EString]
		public Assignment getTargetStateAssignment_6() { return cTargetStateAssignment_6; }
		
		//[State|EString]
		public CrossReference getTargetStateStateCrossReference_6_0() { return cTargetStateStateCrossReference_6_0; }
		
		//EString
		public RuleCall getTargetStateStateEStringParserRuleCall_6_0_1() { return cTargetStateStateEStringParserRuleCall_6_0_1; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cVarKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cColonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cOwnedVariablesAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cOwnedVariablesVariableParserRuleCall_3_2_0 = (RuleCall)cOwnedVariablesAssignment_3_2.eContents().get(0);
		private final Assignment cOwnedVariablesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cOwnedVariablesVariableParserRuleCall_4_0 = (RuleCall)cOwnedVariablesAssignment_4.eContents().get(0);
		
		//State:
		//	{State}
		//	'State'
		//	name=EString ('var' ':' ownedVariables+=Variable)? ownedVariables+=Variable*;
		@Override public ParserRule getRule() { return rule; }
		
		//{State}
		//'State'
		//name=EString ('var' ':' ownedVariables+=Variable)? ownedVariables+=Variable*
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//'State'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//('var' ':' ownedVariables+=Variable)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'var'
		public Keyword getVarKeyword_3_0() { return cVarKeyword_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_1() { return cColonKeyword_3_1; }
		
		//ownedVariables+=Variable
		public Assignment getOwnedVariablesAssignment_3_2() { return cOwnedVariablesAssignment_3_2; }
		
		//Variable
		public RuleCall getOwnedVariablesVariableParserRuleCall_3_2_0() { return cOwnedVariablesVariableParserRuleCall_3_2_0; }
		
		//ownedVariables+=Variable*
		public Assignment getOwnedVariablesAssignment_4() { return cOwnedVariablesAssignment_4; }
		
		//Variable
		public RuleCall getOwnedVariablesVariableParserRuleCall_4_0() { return cOwnedVariablesVariableParserRuleCall_4_0; }
	}
	public class FunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.Function");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFunctionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFunctionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEventAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cEventEventCrossReference_5_1_0 = (CrossReference)cEventAssignment_5_1.eContents().get(0);
		private final RuleCall cEventEventEStringParserRuleCall_5_1_0_1 = (RuleCall)cEventEventCrossReference_5_1_0.eContents().get(1);
		
		//Function:
		//	{Function}
		//	'Function'
		//	name=EString
		//	'(' ')' (':' event=[Event|EString])?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Function}
		//'Function'
		//name=EString
		//'(' ')' (':' event=[Event|EString])?
		public Group getGroup() { return cGroup; }
		
		//{Function}
		public Action getFunctionAction_0() { return cFunctionAction_0; }
		
		//'Function'
		public Keyword getFunctionKeyword_1() { return cFunctionKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//(':' event=[Event|EString])?
		public Group getGroup_5() { return cGroup_5; }
		
		//':'
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }
		
		//event=[Event|EString]
		public Assignment getEventAssignment_5_1() { return cEventAssignment_5_1; }
		
		//[Event|EString]
		public CrossReference getEventEventCrossReference_5_1_0() { return cEventEventCrossReference_5_1_0; }
		
		//EString
		public RuleCall getEventEventEStringParserRuleCall_5_1_0_1() { return cEventEventEStringParserRuleCall_5_1_0_1; }
	}
	public class IntegerVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.IntegerVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cIntegerVariableAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cIntKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cEqualsSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInitialValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cInitialValueEIntParserRuleCall_3_1_0 = (RuleCall)cInitialValueAssignment_3_1.eContents().get(0);
		
		//IntegerVariable:
		//	{IntegerVariable}
		//	'int'
		//	name=EString ('=' initialValue=EInt)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{IntegerVariable}
		//'int'
		//name=EString ('=' initialValue=EInt)?
		public Group getGroup() { return cGroup; }
		
		//{IntegerVariable}
		public Action getIntegerVariableAction_0() { return cIntegerVariableAction_0; }
		
		//'int'
		public Keyword getIntKeyword_1() { return cIntKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//('=' initialValue=EInt)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_0() { return cEqualsSignKeyword_3_0; }
		
		//initialValue=EInt
		public Assignment getInitialValueAssignment_3_1() { return cInitialValueAssignment_3_1; }
		
		//EInt
		public RuleCall getInitialValueEIntParserRuleCall_3_1_0() { return cInitialValueEIntParserRuleCall_3_1_0; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML.EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt ecore::EInt:
		//	'-'? INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}
	
	
	private final SmartContractElements pSmartContract;
	private final VariableElements pVariable;
	private final EStringElements pEString;
	private final EventElements pEvent;
	private final StateElements pState;
	private final FunctionElements pFunction;
	private final IntegerVariableElements pIntegerVariable;
	private final EIntElements pEInt;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SmartContractMLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSmartContract = new SmartContractElements();
		this.pVariable = new VariableElements();
		this.pEString = new EStringElements();
		this.pEvent = new EventElements();
		this.pState = new StateElements();
		this.pFunction = new FunctionElements();
		this.pIntegerVariable = new IntegerVariableElements();
		this.pEInt = new EIntElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.inria.kairos.tuto.simplelanguage.xtext.SmartContractML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//SmartContract:
	//	{SmartContract}
	//	'SmartContract'
	//	name=EString ('->' initialState=[State|EString])?
	//	ownedEvents+=Event*
	//	ownedStates+=State*
	//	ownedFunctions+=Function*;
	public SmartContractElements getSmartContractAccess() {
		return pSmartContract;
	}
	
	public ParserRule getSmartContractRule() {
		return getSmartContractAccess().getRule();
	}
	
	//Variable:
	//	IntegerVariable;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Event:
	//	{Event}
	//	'Event'
	//	name=EString
	//	'from' sourceState=[State|EString]
	//	'to' targetState=[State|EString];
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//State:
	//	{State}
	//	'State'
	//	name=EString ('var' ':' ownedVariables+=Variable)? ownedVariables+=Variable*;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Function:
	//	{Function}
	//	'Function'
	//	name=EString
	//	'(' ')' (':' event=[Event|EString])?;
	public FunctionElements getFunctionAccess() {
		return pFunction;
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}
	
	//IntegerVariable:
	//	{IntegerVariable}
	//	'int'
	//	name=EString ('=' initialValue=EInt)?;
	public IntegerVariableElements getIntegerVariableAccess() {
		return pIntegerVariable;
	}
	
	public ParserRule getIntegerVariableRule() {
		return getIntegerVariableAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	'-'? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
