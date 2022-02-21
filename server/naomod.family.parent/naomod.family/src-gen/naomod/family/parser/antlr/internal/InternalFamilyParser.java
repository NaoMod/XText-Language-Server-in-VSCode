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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFamilyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Person'", "'id='", "';'", "'isChildOf'", "'and'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFamilyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFamilyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFamilyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFamily.g"; }



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




    // $ANTLR start "entryRuleFamily"
    // InternalFamily.g:64:1: entryRuleFamily returns [EObject current=null] : iv_ruleFamily= ruleFamily EOF ;
    public final EObject entryRuleFamily() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFamily = null;


        try {
            // InternalFamily.g:64:47: (iv_ruleFamily= ruleFamily EOF )
            // InternalFamily.g:65:2: iv_ruleFamily= ruleFamily EOF
            {
             newCompositeNode(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFamily=ruleFamily();

            state._fsp--;

             current =iv_ruleFamily; 
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
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalFamily.g:71:1: ruleFamily returns [EObject current=null] : ( ( (lv_members_0_0= rulePerson ) )* ( (lv_relations_1_0= ruleRelation ) )* ) ;
    public final EObject ruleFamily() throws RecognitionException {
        EObject current = null;

        EObject lv_members_0_0 = null;

        EObject lv_relations_1_0 = null;



        	enterRule();

        try {
            // InternalFamily.g:77:2: ( ( ( (lv_members_0_0= rulePerson ) )* ( (lv_relations_1_0= ruleRelation ) )* ) )
            // InternalFamily.g:78:2: ( ( (lv_members_0_0= rulePerson ) )* ( (lv_relations_1_0= ruleRelation ) )* )
            {
            // InternalFamily.g:78:2: ( ( (lv_members_0_0= rulePerson ) )* ( (lv_relations_1_0= ruleRelation ) )* )
            // InternalFamily.g:79:3: ( (lv_members_0_0= rulePerson ) )* ( (lv_relations_1_0= ruleRelation ) )*
            {
            // InternalFamily.g:79:3: ( (lv_members_0_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFamily.g:80:4: (lv_members_0_0= rulePerson )
            	    {
            	    // InternalFamily.g:80:4: (lv_members_0_0= rulePerson )
            	    // InternalFamily.g:81:5: lv_members_0_0= rulePerson
            	    {

            	    					newCompositeNode(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_members_0_0=rulePerson();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFamilyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_0_0,
            	    						"naomod.family.Family.Person");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFamily.g:98:3: ( (lv_relations_1_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFamily.g:99:4: (lv_relations_1_0= ruleRelation )
            	    {
            	    // InternalFamily.g:99:4: (lv_relations_1_0= ruleRelation )
            	    // InternalFamily.g:100:5: lv_relations_1_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getFamilyAccess().getRelationsRelationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_relations_1_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFamilyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_1_0,
            	    						"naomod.family.Family.Relation");
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
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRulePerson"
    // InternalFamily.g:121:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalFamily.g:121:47: (iv_rulePerson= rulePerson EOF )
            // InternalFamily.g:122:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalFamily.g:128:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person' ( (lv_firstName_1_0= RULE_NAME ) ) ( (lv_lastName_2_0= RULE_NAME ) ) otherlv_3= 'id=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_firstName_1_0=null;
        Token lv_lastName_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFamily.g:134:2: ( (otherlv_0= 'Person' ( (lv_firstName_1_0= RULE_NAME ) ) ( (lv_lastName_2_0= RULE_NAME ) ) otherlv_3= 'id=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalFamily.g:135:2: (otherlv_0= 'Person' ( (lv_firstName_1_0= RULE_NAME ) ) ( (lv_lastName_2_0= RULE_NAME ) ) otherlv_3= 'id=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalFamily.g:135:2: (otherlv_0= 'Person' ( (lv_firstName_1_0= RULE_NAME ) ) ( (lv_lastName_2_0= RULE_NAME ) ) otherlv_3= 'id=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalFamily.g:136:3: otherlv_0= 'Person' ( (lv_firstName_1_0= RULE_NAME ) ) ( (lv_lastName_2_0= RULE_NAME ) ) otherlv_3= 'id=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalFamily.g:140:3: ( (lv_firstName_1_0= RULE_NAME ) )
            // InternalFamily.g:141:4: (lv_firstName_1_0= RULE_NAME )
            {
            // InternalFamily.g:141:4: (lv_firstName_1_0= RULE_NAME )
            // InternalFamily.g:142:5: lv_firstName_1_0= RULE_NAME
            {
            lv_firstName_1_0=(Token)match(input,RULE_NAME,FOLLOW_5); 

            					newLeafNode(lv_firstName_1_0, grammarAccess.getPersonAccess().getFirstNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"firstName",
            						lv_firstName_1_0,
            						"naomod.family.Family.NAME");
            				

            }


            }

            // InternalFamily.g:158:3: ( (lv_lastName_2_0= RULE_NAME ) )
            // InternalFamily.g:159:4: (lv_lastName_2_0= RULE_NAME )
            {
            // InternalFamily.g:159:4: (lv_lastName_2_0= RULE_NAME )
            // InternalFamily.g:160:5: lv_lastName_2_0= RULE_NAME
            {
            lv_lastName_2_0=(Token)match(input,RULE_NAME,FOLLOW_6); 

            					newLeafNode(lv_lastName_2_0, grammarAccess.getPersonAccess().getLastNameNAMETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lastName",
            						lv_lastName_2_0,
            						"naomod.family.Family.NAME");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPersonAccess().getIdKeyword_3());
            		
            // InternalFamily.g:180:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFamily.g:181:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFamily.g:181:4: (lv_name_4_0= RULE_ID )
            // InternalFamily.g:182:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPersonAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleRelation"
    // InternalFamily.g:206:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalFamily.g:206:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalFamily.g:207:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalFamily.g:213:1: ruleRelation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'isChildOf' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFamily.g:219:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'isChildOf' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalFamily.g:220:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'isChildOf' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalFamily.g:220:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'isChildOf' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalFamily.g:221:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'isChildOf' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalFamily.g:221:3: ( (otherlv_0= RULE_ID ) )
            // InternalFamily.g:222:4: (otherlv_0= RULE_ID )
            {
            // InternalFamily.g:222:4: (otherlv_0= RULE_ID )
            // InternalFamily.g:223:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getPersonPersonCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getIsChildOfKeyword_1());
            		
            // InternalFamily.g:238:3: ( (otherlv_2= RULE_ID ) )
            // InternalFamily.g:239:4: (otherlv_2= RULE_ID )
            {
            // InternalFamily.g:239:4: (otherlv_2= RULE_ID )
            // InternalFamily.g:240:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getParentOnePersonCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getAndKeyword_3());
            		
            // InternalFamily.g:255:3: ( (otherlv_4= RULE_ID ) )
            // InternalFamily.g:256:4: (otherlv_4= RULE_ID )
            {
            // InternalFamily.g:256:4: (otherlv_4= RULE_ID )
            // InternalFamily.g:257:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getParentTwoPersonCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}