/*
 * generated by Xtext 2.24.0
 */
grammar InternalFamily;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package naomod.family.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package naomod.family.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import naomod.family.services.FamilyGrammarAccess;

}

@parser::members {

 	private FamilyGrammarAccess grammarAccess;

    public InternalFamilyParser(TokenStream input, FamilyGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Family";
   	}

   	@Override
   	protected FamilyGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFamily
entryRuleFamily returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFamilyRule()); }
	iv_ruleFamily=ruleFamily
	{ $current=$iv_ruleFamily.current; }
	EOF;

// Rule Family
ruleFamily returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_0_0());
				}
				lv_members_0_0=rulePerson
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFamilyRule());
					}
					add(
						$current,
						"members",
						lv_members_0_0,
						"naomod.family.Family.Person");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getFamilyAccess().getRelationsRelationParserRuleCall_1_0());
				}
				lv_relations_1_0=ruleRelation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFamilyRule());
					}
					add(
						$current,
						"relations",
						lv_relations_1_0,
						"naomod.family.Family.Relation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePerson
entryRulePerson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonRule()); }
	iv_rulePerson=rulePerson
	{ $current=$iv_rulePerson.current; }
	EOF;

// Rule Person
rulePerson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Person'
		{
			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
		}
		(
			(
				lv_firstName_1_0=RULE_NAME
				{
					newLeafNode(lv_firstName_1_0, grammarAccess.getPersonAccess().getFirstNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPersonRule());
					}
					setWithLastConsumed(
						$current,
						"firstName",
						lv_firstName_1_0,
						"naomod.family.Family.NAME");
				}
			)
		)
		(
			(
				lv_lastName_2_0=RULE_NAME
				{
					newLeafNode(lv_lastName_2_0, grammarAccess.getPersonAccess().getLastNameNAMETerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPersonRule());
					}
					setWithLastConsumed(
						$current,
						"lastName",
						lv_lastName_2_0,
						"naomod.family.Family.NAME");
				}
			)
		)
		otherlv_3='id='
		{
			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getIdKeyword_3());
		}
		(
			(
				lv_name_4_0=RULE_ID
				{
					newLeafNode(lv_name_4_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPersonRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	iv_ruleRelation=ruleRelation
	{ $current=$iv_ruleRelation.current; }
	EOF;

// Rule Relation
ruleRelation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getPersonPersonCrossReference_0_0());
				}
			)
		)
		otherlv_1='isChildOf'
		{
			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getIsChildOfKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getParentOnePersonCrossReference_2_0());
				}
			)
		)
		otherlv_3='and'
		{
			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getAndKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRelationRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getParentTwoPersonCrossReference_4_0());
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getSemicolonKeyword_5());
		}
	)
;

RULE_NAME : 'A'..'Z' ('a'..'z')* ('-' 'A'..'Z' ('a'..'z')*)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
