/*
 * generated by Xtext 2.24.0
 */
grammar InternalFamily;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package naomod.family.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package naomod.family.ide.contentassist.antlr.internal;

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
import naomod.family.services.FamilyGrammarAccess;

}
@parser::members {
	private FamilyGrammarAccess grammarAccess;

	public void setGrammarAccess(FamilyGrammarAccess grammarAccess) {
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

// Entry rule entryRuleFamily
entryRuleFamily
:
{ before(grammarAccess.getFamilyRule()); }
	 ruleFamily
{ after(grammarAccess.getFamilyRule()); } 
	 EOF 
;

// Rule Family
ruleFamily 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFamilyAccess().getGroup()); }
		(rule__Family__Group__0)
		{ after(grammarAccess.getFamilyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePerson
entryRulePerson
:
{ before(grammarAccess.getPersonRule()); }
	 rulePerson
{ after(grammarAccess.getPersonRule()); } 
	 EOF 
;

// Rule Person
rulePerson 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPersonAccess().getGroup()); }
		(rule__Person__Group__0)
		{ after(grammarAccess.getPersonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRelation
entryRuleRelation
:
{ before(grammarAccess.getRelationRule()); }
	 ruleRelation
{ after(grammarAccess.getRelationRule()); } 
	 EOF 
;

// Rule Relation
ruleRelation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRelationAccess().getGroup()); }
		(rule__Relation__Group__0)
		{ after(grammarAccess.getRelationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__0__Impl
	rule__Family__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getMembersAssignment_0()); }
	(rule__Family__MembersAssignment_0)*
	{ after(grammarAccess.getFamilyAccess().getMembersAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Family__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFamilyAccess().getRelationsAssignment_1()); }
	(rule__Family__RelationsAssignment_1)*
	{ after(grammarAccess.getFamilyAccess().getRelationsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Person__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__0__Impl
	rule__Person__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getPersonKeyword_0()); }
	'Person'
	{ after(grammarAccess.getPersonAccess().getPersonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__1__Impl
	rule__Person__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getFirstNameAssignment_1()); }
	(rule__Person__FirstNameAssignment_1)
	{ after(grammarAccess.getPersonAccess().getFirstNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__2__Impl
	rule__Person__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getLastNameAssignment_2()); }
	(rule__Person__LastNameAssignment_2)
	{ after(grammarAccess.getPersonAccess().getLastNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__3__Impl
	rule__Person__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getIdKeyword_3()); }
	'id='
	{ after(grammarAccess.getPersonAccess().getIdKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__4__Impl
	rule__Person__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getNameAssignment_4()); }
	(rule__Person__NameAssignment_4)
	{ after(grammarAccess.getPersonAccess().getNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getPersonAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Relation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__0__Impl
	rule__Relation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getPersonAssignment_0()); }
	(rule__Relation__PersonAssignment_0)
	{ after(grammarAccess.getRelationAccess().getPersonAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__1__Impl
	rule__Relation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getIsChildOfKeyword_1()); }
	'isChildOf'
	{ after(grammarAccess.getRelationAccess().getIsChildOfKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__2__Impl
	rule__Relation__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getParentOneAssignment_2()); }
	(rule__Relation__ParentOneAssignment_2)
	{ after(grammarAccess.getRelationAccess().getParentOneAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__3__Impl
	rule__Relation__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getAndKeyword_3()); }
	'and'
	{ after(grammarAccess.getRelationAccess().getAndKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__4__Impl
	rule__Relation__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getParentTwoAssignment_4()); }
	(rule__Relation__ParentTwoAssignment_4)
	{ after(grammarAccess.getRelationAccess().getParentTwoAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Relation__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRelationAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getRelationAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Family__MembersAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_0_0()); }
		rulePerson
		{ after(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Family__RelationsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFamilyAccess().getRelationsRelationParserRuleCall_1_0()); }
		ruleRelation
		{ after(grammarAccess.getFamilyAccess().getRelationsRelationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__FirstNameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getFirstNameNAMETerminalRuleCall_1_0()); }
		RULE_NAME
		{ after(grammarAccess.getPersonAccess().getFirstNameNAMETerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__LastNameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getLastNameNAMETerminalRuleCall_2_0()); }
		RULE_NAME
		{ after(grammarAccess.getPersonAccess().getLastNameNAMETerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__NameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_4_0()); }
		RULE_ID
		{ after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__PersonAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getPersonPersonCrossReference_0_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getPersonPersonIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getPersonPersonIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getPersonPersonCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__ParentOneAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getParentOnePersonCrossReference_2_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getParentOnePersonIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getParentOnePersonIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getParentOnePersonCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Relation__ParentTwoAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRelationAccess().getParentTwoPersonCrossReference_4_0()); }
		(
			{ before(grammarAccess.getRelationAccess().getParentTwoPersonIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRelationAccess().getParentTwoPersonIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getRelationAccess().getParentTwoPersonCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NAME : 'A'..'Z' ('a'..'z')* ('-' 'A'..'Z' ('a'..'z')*)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
