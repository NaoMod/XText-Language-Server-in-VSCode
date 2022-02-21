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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFamilyParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleFamily"
    // InternalFamily.g:53:1: entryRuleFamily : ruleFamily EOF ;
    public final void entryRuleFamily() throws RecognitionException {
        try {
            // InternalFamily.g:54:1: ( ruleFamily EOF )
            // InternalFamily.g:55:1: ruleFamily EOF
            {
             before(grammarAccess.getFamilyRule()); 
            pushFollow(FOLLOW_1);
            ruleFamily();

            state._fsp--;

             after(grammarAccess.getFamilyRule()); 
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
    // $ANTLR end "entryRuleFamily"


    // $ANTLR start "ruleFamily"
    // InternalFamily.g:62:1: ruleFamily : ( ( rule__Family__Group__0 ) ) ;
    public final void ruleFamily() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:66:2: ( ( ( rule__Family__Group__0 ) ) )
            // InternalFamily.g:67:2: ( ( rule__Family__Group__0 ) )
            {
            // InternalFamily.g:67:2: ( ( rule__Family__Group__0 ) )
            // InternalFamily.g:68:3: ( rule__Family__Group__0 )
            {
             before(grammarAccess.getFamilyAccess().getGroup()); 
            // InternalFamily.g:69:3: ( rule__Family__Group__0 )
            // InternalFamily.g:69:4: rule__Family__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFamilyAccess().getGroup()); 

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
    // $ANTLR end "ruleFamily"


    // $ANTLR start "entryRulePerson"
    // InternalFamily.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalFamily.g:79:1: ( rulePerson EOF )
            // InternalFamily.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalFamily.g:87:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:91:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalFamily.g:92:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalFamily.g:92:2: ( ( rule__Person__Group__0 ) )
            // InternalFamily.g:93:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalFamily.g:94:3: ( rule__Person__Group__0 )
            // InternalFamily.g:94:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleRelation"
    // InternalFamily.g:103:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalFamily.g:104:1: ( ruleRelation EOF )
            // InternalFamily.g:105:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalFamily.g:112:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:116:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalFamily.g:117:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalFamily.g:117:2: ( ( rule__Relation__Group__0 ) )
            // InternalFamily.g:118:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalFamily.g:119:3: ( rule__Relation__Group__0 )
            // InternalFamily.g:119:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "rule__Family__Group__0"
    // InternalFamily.g:127:1: rule__Family__Group__0 : rule__Family__Group__0__Impl rule__Family__Group__1 ;
    public final void rule__Family__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:131:1: ( rule__Family__Group__0__Impl rule__Family__Group__1 )
            // InternalFamily.g:132:2: rule__Family__Group__0__Impl rule__Family__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Family__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Family__Group__1();

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
    // $ANTLR end "rule__Family__Group__0"


    // $ANTLR start "rule__Family__Group__0__Impl"
    // InternalFamily.g:139:1: rule__Family__Group__0__Impl : ( ( rule__Family__MembersAssignment_0 )* ) ;
    public final void rule__Family__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:143:1: ( ( ( rule__Family__MembersAssignment_0 )* ) )
            // InternalFamily.g:144:1: ( ( rule__Family__MembersAssignment_0 )* )
            {
            // InternalFamily.g:144:1: ( ( rule__Family__MembersAssignment_0 )* )
            // InternalFamily.g:145:2: ( rule__Family__MembersAssignment_0 )*
            {
             before(grammarAccess.getFamilyAccess().getMembersAssignment_0()); 
            // InternalFamily.g:146:2: ( rule__Family__MembersAssignment_0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFamily.g:146:3: rule__Family__MembersAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Family__MembersAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getFamilyAccess().getMembersAssignment_0()); 

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
    // $ANTLR end "rule__Family__Group__0__Impl"


    // $ANTLR start "rule__Family__Group__1"
    // InternalFamily.g:154:1: rule__Family__Group__1 : rule__Family__Group__1__Impl ;
    public final void rule__Family__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:158:1: ( rule__Family__Group__1__Impl )
            // InternalFamily.g:159:2: rule__Family__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Family__Group__1__Impl();

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
    // $ANTLR end "rule__Family__Group__1"


    // $ANTLR start "rule__Family__Group__1__Impl"
    // InternalFamily.g:165:1: rule__Family__Group__1__Impl : ( ( rule__Family__RelationsAssignment_1 )* ) ;
    public final void rule__Family__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:169:1: ( ( ( rule__Family__RelationsAssignment_1 )* ) )
            // InternalFamily.g:170:1: ( ( rule__Family__RelationsAssignment_1 )* )
            {
            // InternalFamily.g:170:1: ( ( rule__Family__RelationsAssignment_1 )* )
            // InternalFamily.g:171:2: ( rule__Family__RelationsAssignment_1 )*
            {
             before(grammarAccess.getFamilyAccess().getRelationsAssignment_1()); 
            // InternalFamily.g:172:2: ( rule__Family__RelationsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFamily.g:172:3: rule__Family__RelationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Family__RelationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFamilyAccess().getRelationsAssignment_1()); 

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
    // $ANTLR end "rule__Family__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalFamily.g:181:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:185:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalFamily.g:186:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalFamily.g:193:1: rule__Person__Group__0__Impl : ( 'Person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:197:1: ( ( 'Person' ) )
            // InternalFamily.g:198:1: ( 'Person' )
            {
            // InternalFamily.g:198:1: ( 'Person' )
            // InternalFamily.g:199:2: 'Person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

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
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalFamily.g:208:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:212:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalFamily.g:213:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalFamily.g:220:1: rule__Person__Group__1__Impl : ( ( rule__Person__FirstNameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:224:1: ( ( ( rule__Person__FirstNameAssignment_1 ) ) )
            // InternalFamily.g:225:1: ( ( rule__Person__FirstNameAssignment_1 ) )
            {
            // InternalFamily.g:225:1: ( ( rule__Person__FirstNameAssignment_1 ) )
            // InternalFamily.g:226:2: ( rule__Person__FirstNameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getFirstNameAssignment_1()); 
            // InternalFamily.g:227:2: ( rule__Person__FirstNameAssignment_1 )
            // InternalFamily.g:227:3: rule__Person__FirstNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__FirstNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getFirstNameAssignment_1()); 

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
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalFamily.g:235:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:239:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalFamily.g:240:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalFamily.g:247:1: rule__Person__Group__2__Impl : ( ( rule__Person__LastNameAssignment_2 ) ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:251:1: ( ( ( rule__Person__LastNameAssignment_2 ) ) )
            // InternalFamily.g:252:1: ( ( rule__Person__LastNameAssignment_2 ) )
            {
            // InternalFamily.g:252:1: ( ( rule__Person__LastNameAssignment_2 ) )
            // InternalFamily.g:253:2: ( rule__Person__LastNameAssignment_2 )
            {
             before(grammarAccess.getPersonAccess().getLastNameAssignment_2()); 
            // InternalFamily.g:254:2: ( rule__Person__LastNameAssignment_2 )
            // InternalFamily.g:254:3: rule__Person__LastNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Person__LastNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getLastNameAssignment_2()); 

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
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalFamily.g:262:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:266:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalFamily.g:267:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalFamily.g:274:1: rule__Person__Group__3__Impl : ( 'id=' ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:278:1: ( ( 'id=' ) )
            // InternalFamily.g:279:1: ( 'id=' )
            {
            // InternalFamily.g:279:1: ( 'id=' )
            // InternalFamily.g:280:2: 'id='
            {
             before(grammarAccess.getPersonAccess().getIdKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getIdKeyword_3()); 

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
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalFamily.g:289:1: rule__Person__Group__4 : rule__Person__Group__4__Impl rule__Person__Group__5 ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:293:1: ( rule__Person__Group__4__Impl rule__Person__Group__5 )
            // InternalFamily.g:294:2: rule__Person__Group__4__Impl rule__Person__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Person__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__5();

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
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalFamily.g:301:1: rule__Person__Group__4__Impl : ( ( rule__Person__NameAssignment_4 ) ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:305:1: ( ( ( rule__Person__NameAssignment_4 ) ) )
            // InternalFamily.g:306:1: ( ( rule__Person__NameAssignment_4 ) )
            {
            // InternalFamily.g:306:1: ( ( rule__Person__NameAssignment_4 ) )
            // InternalFamily.g:307:2: ( rule__Person__NameAssignment_4 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_4()); 
            // InternalFamily.g:308:2: ( rule__Person__NameAssignment_4 )
            // InternalFamily.g:308:3: rule__Person__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group__5"
    // InternalFamily.g:316:1: rule__Person__Group__5 : rule__Person__Group__5__Impl ;
    public final void rule__Person__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:320:1: ( rule__Person__Group__5__Impl )
            // InternalFamily.g:321:2: rule__Person__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__5__Impl();

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
    // $ANTLR end "rule__Person__Group__5"


    // $ANTLR start "rule__Person__Group__5__Impl"
    // InternalFamily.g:327:1: rule__Person__Group__5__Impl : ( ';' ) ;
    public final void rule__Person__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:331:1: ( ( ';' ) )
            // InternalFamily.g:332:1: ( ';' )
            {
            // InternalFamily.g:332:1: ( ';' )
            // InternalFamily.g:333:2: ';'
            {
             before(grammarAccess.getPersonAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Person__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalFamily.g:343:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:347:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalFamily.g:348:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

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
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalFamily.g:355:1: rule__Relation__Group__0__Impl : ( ( rule__Relation__PersonAssignment_0 ) ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:359:1: ( ( ( rule__Relation__PersonAssignment_0 ) ) )
            // InternalFamily.g:360:1: ( ( rule__Relation__PersonAssignment_0 ) )
            {
            // InternalFamily.g:360:1: ( ( rule__Relation__PersonAssignment_0 ) )
            // InternalFamily.g:361:2: ( rule__Relation__PersonAssignment_0 )
            {
             before(grammarAccess.getRelationAccess().getPersonAssignment_0()); 
            // InternalFamily.g:362:2: ( rule__Relation__PersonAssignment_0 )
            // InternalFamily.g:362:3: rule__Relation__PersonAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__PersonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getPersonAssignment_0()); 

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
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalFamily.g:370:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:374:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalFamily.g:375:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

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
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalFamily.g:382:1: rule__Relation__Group__1__Impl : ( 'isChildOf' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:386:1: ( ( 'isChildOf' ) )
            // InternalFamily.g:387:1: ( 'isChildOf' )
            {
            // InternalFamily.g:387:1: ( 'isChildOf' )
            // InternalFamily.g:388:2: 'isChildOf'
            {
             before(grammarAccess.getRelationAccess().getIsChildOfKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsChildOfKeyword_1()); 

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
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalFamily.g:397:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:401:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalFamily.g:402:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

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
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalFamily.g:409:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__ParentOneAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:413:1: ( ( ( rule__Relation__ParentOneAssignment_2 ) ) )
            // InternalFamily.g:414:1: ( ( rule__Relation__ParentOneAssignment_2 ) )
            {
            // InternalFamily.g:414:1: ( ( rule__Relation__ParentOneAssignment_2 ) )
            // InternalFamily.g:415:2: ( rule__Relation__ParentOneAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getParentOneAssignment_2()); 
            // InternalFamily.g:416:2: ( rule__Relation__ParentOneAssignment_2 )
            // InternalFamily.g:416:3: rule__Relation__ParentOneAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ParentOneAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getParentOneAssignment_2()); 

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
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalFamily.g:424:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:428:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalFamily.g:429:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

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
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalFamily.g:436:1: rule__Relation__Group__3__Impl : ( 'and' ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:440:1: ( ( 'and' ) )
            // InternalFamily.g:441:1: ( 'and' )
            {
            // InternalFamily.g:441:1: ( 'and' )
            // InternalFamily.g:442:2: 'and'
            {
             before(grammarAccess.getRelationAccess().getAndKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getAndKeyword_3()); 

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
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalFamily.g:451:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:455:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalFamily.g:456:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

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
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalFamily.g:463:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__ParentTwoAssignment_4 ) ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:467:1: ( ( ( rule__Relation__ParentTwoAssignment_4 ) ) )
            // InternalFamily.g:468:1: ( ( rule__Relation__ParentTwoAssignment_4 ) )
            {
            // InternalFamily.g:468:1: ( ( rule__Relation__ParentTwoAssignment_4 ) )
            // InternalFamily.g:469:2: ( rule__Relation__ParentTwoAssignment_4 )
            {
             before(grammarAccess.getRelationAccess().getParentTwoAssignment_4()); 
            // InternalFamily.g:470:2: ( rule__Relation__ParentTwoAssignment_4 )
            // InternalFamily.g:470:3: rule__Relation__ParentTwoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ParentTwoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getParentTwoAssignment_4()); 

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
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalFamily.g:478:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:482:1: ( rule__Relation__Group__5__Impl )
            // InternalFamily.g:483:2: rule__Relation__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__5__Impl();

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
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalFamily.g:489:1: rule__Relation__Group__5__Impl : ( ';' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:493:1: ( ( ';' ) )
            // InternalFamily.g:494:1: ( ';' )
            {
            // InternalFamily.g:494:1: ( ';' )
            // InternalFamily.g:495:2: ';'
            {
             before(grammarAccess.getRelationAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Family__MembersAssignment_0"
    // InternalFamily.g:505:1: rule__Family__MembersAssignment_0 : ( rulePerson ) ;
    public final void rule__Family__MembersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:509:1: ( ( rulePerson ) )
            // InternalFamily.g:510:2: ( rulePerson )
            {
            // InternalFamily.g:510:2: ( rulePerson )
            // InternalFamily.g:511:3: rulePerson
            {
             before(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getFamilyAccess().getMembersPersonParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Family__MembersAssignment_0"


    // $ANTLR start "rule__Family__RelationsAssignment_1"
    // InternalFamily.g:520:1: rule__Family__RelationsAssignment_1 : ( ruleRelation ) ;
    public final void rule__Family__RelationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:524:1: ( ( ruleRelation ) )
            // InternalFamily.g:525:2: ( ruleRelation )
            {
            // InternalFamily.g:525:2: ( ruleRelation )
            // InternalFamily.g:526:3: ruleRelation
            {
             before(grammarAccess.getFamilyAccess().getRelationsRelationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getFamilyAccess().getRelationsRelationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Family__RelationsAssignment_1"


    // $ANTLR start "rule__Person__FirstNameAssignment_1"
    // InternalFamily.g:535:1: rule__Person__FirstNameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__Person__FirstNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:539:1: ( ( RULE_NAME ) )
            // InternalFamily.g:540:2: ( RULE_NAME )
            {
            // InternalFamily.g:540:2: ( RULE_NAME )
            // InternalFamily.g:541:3: RULE_NAME
            {
             before(grammarAccess.getPersonAccess().getFirstNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getFirstNameNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Person__FirstNameAssignment_1"


    // $ANTLR start "rule__Person__LastNameAssignment_2"
    // InternalFamily.g:550:1: rule__Person__LastNameAssignment_2 : ( RULE_NAME ) ;
    public final void rule__Person__LastNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:554:1: ( ( RULE_NAME ) )
            // InternalFamily.g:555:2: ( RULE_NAME )
            {
            // InternalFamily.g:555:2: ( RULE_NAME )
            // InternalFamily.g:556:3: RULE_NAME
            {
             before(grammarAccess.getPersonAccess().getLastNameNAMETerminalRuleCall_2_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLastNameNAMETerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Person__LastNameAssignment_2"


    // $ANTLR start "rule__Person__NameAssignment_4"
    // InternalFamily.g:565:1: rule__Person__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:569:1: ( ( RULE_ID ) )
            // InternalFamily.g:570:2: ( RULE_ID )
            {
            // InternalFamily.g:570:2: ( RULE_ID )
            // InternalFamily.g:571:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Person__NameAssignment_4"


    // $ANTLR start "rule__Relation__PersonAssignment_0"
    // InternalFamily.g:580:1: rule__Relation__PersonAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__PersonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:584:1: ( ( ( RULE_ID ) ) )
            // InternalFamily.g:585:2: ( ( RULE_ID ) )
            {
            // InternalFamily.g:585:2: ( ( RULE_ID ) )
            // InternalFamily.g:586:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getPersonPersonCrossReference_0_0()); 
            // InternalFamily.g:587:3: ( RULE_ID )
            // InternalFamily.g:588:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getPersonPersonIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getPersonPersonIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getPersonPersonCrossReference_0_0()); 

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
    // $ANTLR end "rule__Relation__PersonAssignment_0"


    // $ANTLR start "rule__Relation__ParentOneAssignment_2"
    // InternalFamily.g:599:1: rule__Relation__ParentOneAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ParentOneAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:603:1: ( ( ( RULE_ID ) ) )
            // InternalFamily.g:604:2: ( ( RULE_ID ) )
            {
            // InternalFamily.g:604:2: ( ( RULE_ID ) )
            // InternalFamily.g:605:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getParentOnePersonCrossReference_2_0()); 
            // InternalFamily.g:606:3: ( RULE_ID )
            // InternalFamily.g:607:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getParentOnePersonIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getParentOnePersonIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getParentOnePersonCrossReference_2_0()); 

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
    // $ANTLR end "rule__Relation__ParentOneAssignment_2"


    // $ANTLR start "rule__Relation__ParentTwoAssignment_4"
    // InternalFamily.g:618:1: rule__Relation__ParentTwoAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ParentTwoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFamily.g:622:1: ( ( ( RULE_ID ) ) )
            // InternalFamily.g:623:2: ( ( RULE_ID ) )
            {
            // InternalFamily.g:623:2: ( ( RULE_ID ) )
            // InternalFamily.g:624:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getParentTwoPersonCrossReference_4_0()); 
            // InternalFamily.g:625:3: ( RULE_ID )
            // InternalFamily.g:626:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getParentTwoPersonIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getParentTwoPersonIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getParentTwoPersonCrossReference_4_0()); 

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
    // $ANTLR end "rule__Relation__ParentTwoAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}