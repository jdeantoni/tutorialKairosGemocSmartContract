/*
 * generated by Xtext 2.24.0
 */
grammar InternalSmartContractML;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.inria.kairos.tuto.simplelanguage.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleSmartContract
entryRuleSmartContract
:
{ before(grammarAccess.getSmartContractRule()); }
	 ruleSmartContract
{ after(grammarAccess.getSmartContractRule()); } 
	 EOF 
;

// Rule SmartContract
ruleSmartContract 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSmartContractAccess().getGroup()); }
		(rule__SmartContract__Group__0)
		{ after(grammarAccess.getSmartContractAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall()); }
		ruleIntegerVariable
		{ after(grammarAccess.getVariableAccess().getIntegerVariableParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvent
entryRuleEvent
:
{ before(grammarAccess.getEventRule()); }
	 ruleEvent
{ after(grammarAccess.getEventRule()); } 
	 EOF 
;

// Rule Event
ruleEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventAccess().getGroup()); }
		(rule__Event__Group__0)
		{ after(grammarAccess.getEventAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction
entryRuleFunction
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup()); }
		(rule__Function__Group__0)
		{ after(grammarAccess.getFunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerVariable
entryRuleIntegerVariable
:
{ before(grammarAccess.getIntegerVariableRule()); }
	 ruleIntegerVariable
{ after(grammarAccess.getIntegerVariableRule()); } 
	 EOF 
;

// Rule IntegerVariable
ruleIntegerVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerVariableAccess().getGroup()); }
		(rule__IntegerVariable__Group__0)
		{ after(grammarAccess.getIntegerVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEInt
entryRuleEInt
:
{ before(grammarAccess.getEIntRule()); }
	 ruleEInt
{ after(grammarAccess.getEIntRule()); } 
	 EOF 
;

// Rule EInt
ruleEInt 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEIntAccess().getGroup()); }
		(rule__EInt__Group__0)
		{ after(grammarAccess.getEIntAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group__0__Impl
	rule__SmartContract__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getSmartContractAction_0()); }
	()
	{ after(grammarAccess.getSmartContractAccess().getSmartContractAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group__1__Impl
	rule__SmartContract__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getSmartContractKeyword_1()); }
	'SmartContract'
	{ after(grammarAccess.getSmartContractAccess().getSmartContractKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group__2__Impl
	rule__SmartContract__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getNameAssignment_2()); }
	(rule__SmartContract__NameAssignment_2)
	{ after(grammarAccess.getSmartContractAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group__3__Impl
	rule__SmartContract__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getGroup_3()); }
	(rule__SmartContract__Group_3__0)?
	{ after(grammarAccess.getSmartContractAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group__4__Impl
	rule__SmartContract__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getOwnedEventsAssignment_4()); }
	(rule__SmartContract__OwnedEventsAssignment_4)*
	{ after(grammarAccess.getSmartContractAccess().getOwnedEventsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group__5__Impl
	rule__SmartContract__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getOwnedStatesAssignment_5()); }
	(rule__SmartContract__OwnedStatesAssignment_5)*
	{ after(grammarAccess.getSmartContractAccess().getOwnedStatesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getOwnedFunctionsAssignment_6()); }
	(rule__SmartContract__OwnedFunctionsAssignment_6)*
	{ after(grammarAccess.getSmartContractAccess().getOwnedFunctionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SmartContract__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group_3__0__Impl
	rule__SmartContract__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); }
	'->'
	{ after(grammarAccess.getSmartContractAccess().getHyphenMinusGreaterThanSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SmartContract__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSmartContractAccess().getInitialStateAssignment_3_1()); }
	(rule__SmartContract__InitialStateAssignment_3_1)
	{ after(grammarAccess.getSmartContractAccess().getInitialStateAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Event__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__0__Impl
	rule__Event__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getEventAction_0()); }
	()
	{ after(grammarAccess.getEventAccess().getEventAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__1__Impl
	rule__Event__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getEventKeyword_1()); }
	'Event'
	{ after(grammarAccess.getEventAccess().getEventKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__2__Impl
	rule__Event__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getNameAssignment_2()); }
	(rule__Event__NameAssignment_2)
	{ after(grammarAccess.getEventAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__3__Impl
	rule__Event__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getFromKeyword_3()); }
	'from'
	{ after(grammarAccess.getEventAccess().getFromKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__4__Impl
	rule__Event__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getSourceStateAssignment_4()); }
	(rule__Event__SourceStateAssignment_4)
	{ after(grammarAccess.getEventAccess().getSourceStateAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__5__Impl
	rule__Event__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getToKeyword_5()); }
	'to'
	{ after(grammarAccess.getEventAccess().getToKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Event__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventAccess().getTargetStateAssignment_6()); }
	(rule__Event__TargetStateAssignment_6)
	{ after(grammarAccess.getEventAccess().getTargetStateAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateAction_0()); }
	()
	{ after(grammarAccess.getStateAccess().getStateAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_1()); }
	'State'
	{ after(grammarAccess.getStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_2()); }
	(rule__State__NameAssignment_2)
	{ after(grammarAccess.getStateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getGroup_3()); }
	(rule__State__Group_3__0)?
	{ after(grammarAccess.getStateAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__4__Impl
	rule__State__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getVarKeyword_4()); }
	'var'
	{ after(grammarAccess.getStateAccess().getVarKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__5__Impl
	rule__State__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getColonKeyword_5()); }
	':'
	{ after(grammarAccess.getStateAccess().getColonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOwnedVariablesAssignment_6()); }
	(rule__State__OwnedVariablesAssignment_6)*
	{ after(grammarAccess.getStateAccess().getOwnedVariablesAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__0__Impl
	rule__State__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutputEventKeyword_3_0()); }
	'outputEvent'
	{ after(grammarAccess.getStateAccess().getOutputEventKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOutputEventAssignment_3_1()); }
	(rule__State__OutputEventAssignment_3_1)
	{ after(grammarAccess.getStateAccess().getOutputEventAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__0__Impl
	rule__Function__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFunctionAction_0()); }
	()
	{ after(grammarAccess.getFunctionAccess().getFunctionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__1__Impl
	rule__Function__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); }
	'Function'
	{ after(grammarAccess.getFunctionAccess().getFunctionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__2__Impl
	rule__Function__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getNameAssignment_2()); }
	(rule__Function__NameAssignment_2)
	{ after(grammarAccess.getFunctionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__3__Impl
	rule__Function__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__4__Impl
	rule__Function__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_5()); }
	(rule__Function__Group_5__0)?
	{ after(grammarAccess.getFunctionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_5__0__Impl
	rule__Function__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getColonKeyword_5_0()); }
	':'
	{ after(grammarAccess.getFunctionAccess().getColonKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getEventAssignment_5_1()); }
	(rule__Function__EventAssignment_5_1)
	{ after(grammarAccess.getFunctionAccess().getEventAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerVariable__Group__0__Impl
	rule__IntegerVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); }
	()
	{ after(grammarAccess.getIntegerVariableAccess().getIntegerVariableAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerVariable__Group__1__Impl
	rule__IntegerVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerVariableAccess().getIntKeyword_1()); }
	'int'
	{ after(grammarAccess.getIntegerVariableAccess().getIntKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerVariable__Group__2__Impl
	rule__IntegerVariable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); }
	(rule__IntegerVariable__NameAssignment_2)
	{ after(grammarAccess.getIntegerVariableAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerVariable__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerVariableAccess().getGroup_3()); }
	(rule__IntegerVariable__Group_3__0)?
	{ after(grammarAccess.getIntegerVariableAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerVariable__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerVariable__Group_3__0__Impl
	rule__IntegerVariable__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3_0()); }
	'='
	{ after(grammarAccess.getIntegerVariableAccess().getEqualsSignKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerVariable__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerVariableAccess().getInitialValueAssignment_3_1()); }
	(rule__IntegerVariable__InitialValueAssignment_3_1)
	{ after(grammarAccess.getIntegerVariableAccess().getInitialValueAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EInt__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__0__Impl
	rule__EInt__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
	('-')?
	{ after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EInt__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EInt__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
	{ after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SmartContract__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getSmartContractAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__InitialStateAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSmartContractAccess().getInitialStateStateCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getSmartContractAccess().getInitialStateStateEStringParserRuleCall_3_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getSmartContractAccess().getInitialStateStateEStringParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getSmartContractAccess().getInitialStateStateCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__OwnedEventsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSmartContractAccess().getOwnedEventsEventParserRuleCall_4_0()); }
		ruleEvent
		{ after(grammarAccess.getSmartContractAccess().getOwnedEventsEventParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__OwnedStatesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSmartContractAccess().getOwnedStatesStateParserRuleCall_5_0()); }
		ruleState
		{ after(grammarAccess.getSmartContractAccess().getOwnedStatesStateParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SmartContract__OwnedFunctionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSmartContractAccess().getOwnedFunctionsFunctionParserRuleCall_6_0()); }
		ruleFunction
		{ after(grammarAccess.getSmartContractAccess().getOwnedFunctionsFunctionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__SourceStateAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getSourceStateStateCrossReference_4_0()); }
		(
			{ before(grammarAccess.getEventAccess().getSourceStateStateEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getEventAccess().getSourceStateStateEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getEventAccess().getSourceStateStateCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__TargetStateAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getTargetStateStateCrossReference_6_0()); }
		(
			{ before(grammarAccess.getEventAccess().getTargetStateStateEStringParserRuleCall_6_0_1()); }
			ruleEString
			{ after(grammarAccess.getEventAccess().getTargetStateStateEStringParserRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getEventAccess().getTargetStateStateCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OutputEventAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOutputEventEventCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getStateAccess().getOutputEventEventEStringParserRuleCall_3_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getStateAccess().getOutputEventEventEStringParserRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getStateAccess().getOutputEventEventCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OwnedVariablesAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_6_0()); }
		ruleVariable
		{ after(grammarAccess.getStateAccess().getOwnedVariablesVariableParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__EventAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getEventEventCrossReference_5_1_0()); }
		(
			{ before(grammarAccess.getFunctionAccess().getEventEventEStringParserRuleCall_5_1_0_1()); }
			ruleEString
			{ after(grammarAccess.getFunctionAccess().getEventEventEStringParserRuleCall_5_1_0_1()); }
		)
		{ after(grammarAccess.getFunctionAccess().getEventEventCrossReference_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getIntegerVariableAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerVariable__InitialValueAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerVariableAccess().getInitialValueEIntParserRuleCall_3_1_0()); }
		ruleEInt
		{ after(grammarAccess.getIntegerVariableAccess().getInitialValueEIntParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
