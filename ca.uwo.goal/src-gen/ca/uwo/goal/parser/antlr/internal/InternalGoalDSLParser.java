package ca.uwo.goal.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ca.uwo.goal.services.GoalDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoalDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'goal'", "'{'", "'}'", "'actor'", "';'", "'decomposesTo'", "'('", "')'", "'task'", "'resource'", "'neededBy'", "','", "'contributesTo'", "'dependsOn'", "'.'", "'and'", "'or'", "'++S'", "'--S'", "'++D'", "'--D'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
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


        public InternalGoalDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGoalDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGoalDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGoalDSL.g"; }



     	private GoalDSLGrammarAccess grammarAccess;

        public InternalGoalDSLParser(TokenStream input, GoalDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GoalSpecification";
       	}

       	@Override
       	protected GoalDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGoalSpecification"
    // InternalGoalDSL.g:65:1: entryRuleGoalSpecification returns [EObject current=null] : iv_ruleGoalSpecification= ruleGoalSpecification EOF ;
    public final EObject entryRuleGoalSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalSpecification = null;


        try {
            // InternalGoalDSL.g:65:58: (iv_ruleGoalSpecification= ruleGoalSpecification EOF )
            // InternalGoalDSL.g:66:2: iv_ruleGoalSpecification= ruleGoalSpecification EOF
            {
             newCompositeNode(grammarAccess.getGoalSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoalSpecification=ruleGoalSpecification();

            state._fsp--;

             current =iv_ruleGoalSpecification; 
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
    // $ANTLR end "entryRuleGoalSpecification"


    // $ANTLR start "ruleGoalSpecification"
    // InternalGoalDSL.g:72:1: ruleGoalSpecification returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_root_3_0= ruleRoot ) ) otherlv_4= '}' ) ;
    public final EObject ruleGoalSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_root_3_0 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:78:2: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_root_3_0= ruleRoot ) ) otherlv_4= '}' ) )
            // InternalGoalDSL.g:79:2: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_root_3_0= ruleRoot ) ) otherlv_4= '}' )
            {
            // InternalGoalDSL.g:79:2: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_root_3_0= ruleRoot ) ) otherlv_4= '}' )
            // InternalGoalDSL.g:80:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_root_3_0= ruleRoot ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalSpecificationAccess().getGoalKeyword_0());
            		
            // InternalGoalDSL.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalGoalDSL.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalGoalDSL.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalGoalDSL.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGoalSpecificationAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getGoalSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGoalDSL.g:106:3: ( (lv_root_3_0= ruleRoot ) )
            // InternalGoalDSL.g:107:4: (lv_root_3_0= ruleRoot )
            {
            // InternalGoalDSL.g:107:4: (lv_root_3_0= ruleRoot )
            // InternalGoalDSL.g:108:5: lv_root_3_0= ruleRoot
            {

            					newCompositeNode(grammarAccess.getGoalSpecificationAccess().getRootRootParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_root_3_0=ruleRoot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoalSpecificationRule());
            					}
            					set(
            						current,
            						"root",
            						lv_root_3_0,
            						"ca.uwo.goal.GoalDSL.Root");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGoalSpecificationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGoalSpecification"


    // $ANTLR start "entryRuleRoot"
    // InternalGoalDSL.g:133:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalGoalDSL.g:133:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalGoalDSL.g:134:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalGoalDSL.g:140:1: ruleRoot returns [EObject current=null] : ( () ( (lv_actors_1_0= ruleActor ) )* ( (lv_dependencies_2_0= ruleDependency ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_actors_1_0 = null;

        EObject lv_dependencies_2_0 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:146:2: ( ( () ( (lv_actors_1_0= ruleActor ) )* ( (lv_dependencies_2_0= ruleDependency ) )* ) )
            // InternalGoalDSL.g:147:2: ( () ( (lv_actors_1_0= ruleActor ) )* ( (lv_dependencies_2_0= ruleDependency ) )* )
            {
            // InternalGoalDSL.g:147:2: ( () ( (lv_actors_1_0= ruleActor ) )* ( (lv_dependencies_2_0= ruleDependency ) )* )
            // InternalGoalDSL.g:148:3: () ( (lv_actors_1_0= ruleActor ) )* ( (lv_dependencies_2_0= ruleDependency ) )*
            {
            // InternalGoalDSL.g:148:3: ()
            // InternalGoalDSL.g:149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootAccess().getRootAction_0(),
            					current);
            			

            }

            // InternalGoalDSL.g:155:3: ( (lv_actors_1_0= ruleActor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGoalDSL.g:156:4: (lv_actors_1_0= ruleActor )
            	    {
            	    // InternalGoalDSL.g:156:4: (lv_actors_1_0= ruleActor )
            	    // InternalGoalDSL.g:157:5: lv_actors_1_0= ruleActor
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getActorsActorParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_actors_1_0=ruleActor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actors",
            	    						lv_actors_1_0,
            	    						"ca.uwo.goal.GoalDSL.Actor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalGoalDSL.g:174:3: ( (lv_dependencies_2_0= ruleDependency ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGoalDSL.g:175:4: (lv_dependencies_2_0= ruleDependency )
            	    {
            	    // InternalGoalDSL.g:175:4: (lv_dependencies_2_0= ruleDependency )
            	    // InternalGoalDSL.g:176:5: lv_dependencies_2_0= ruleDependency
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getDependenciesDependencyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_dependencies_2_0=ruleDependency();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_2_0,
            	    						"ca.uwo.goal.GoalDSL.Dependency");
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleIntentionalElement"
    // InternalGoalDSL.g:197:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // InternalGoalDSL.g:197:59: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // InternalGoalDSL.g:198:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
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
    // $ANTLR end "entryRuleIntentionalElement"


    // $ANTLR start "ruleIntentionalElement"
    // InternalGoalDSL.g:204:1: ruleIntentionalElement returns [EObject current=null] : (this_GoalTaskElement_0= ruleGoalTaskElement | this_Resource_1= ruleResource ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_GoalTaskElement_0 = null;

        EObject this_Resource_1 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:210:2: ( (this_GoalTaskElement_0= ruleGoalTaskElement | this_Resource_1= ruleResource ) )
            // InternalGoalDSL.g:211:2: (this_GoalTaskElement_0= ruleGoalTaskElement | this_Resource_1= ruleResource )
            {
            // InternalGoalDSL.g:211:2: (this_GoalTaskElement_0= ruleGoalTaskElement | this_Resource_1= ruleResource )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11||LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGoalDSL.g:212:3: this_GoalTaskElement_0= ruleGoalTaskElement
                    {

                    			newCompositeNode(grammarAccess.getIntentionalElementAccess().getGoalTaskElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoalTaskElement_0=ruleGoalTaskElement();

                    state._fsp--;


                    			current = this_GoalTaskElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:221:3: this_Resource_1= ruleResource
                    {

                    			newCompositeNode(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resource_1=ruleResource();

                    state._fsp--;


                    			current = this_Resource_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleIntentionalElement"


    // $ANTLR start "entryRuleGoalTaskElement"
    // InternalGoalDSL.g:233:1: entryRuleGoalTaskElement returns [EObject current=null] : iv_ruleGoalTaskElement= ruleGoalTaskElement EOF ;
    public final EObject entryRuleGoalTaskElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalTaskElement = null;


        try {
            // InternalGoalDSL.g:233:56: (iv_ruleGoalTaskElement= ruleGoalTaskElement EOF )
            // InternalGoalDSL.g:234:2: iv_ruleGoalTaskElement= ruleGoalTaskElement EOF
            {
             newCompositeNode(grammarAccess.getGoalTaskElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoalTaskElement=ruleGoalTaskElement();

            state._fsp--;

             current =iv_ruleGoalTaskElement; 
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
    // $ANTLR end "entryRuleGoalTaskElement"


    // $ANTLR start "ruleGoalTaskElement"
    // InternalGoalDSL.g:240:1: ruleGoalTaskElement returns [EObject current=null] : (this_Goal_0= ruleGoal | this_Task_1= ruleTask ) ;
    public final EObject ruleGoalTaskElement() throws RecognitionException {
        EObject current = null;

        EObject this_Goal_0 = null;

        EObject this_Task_1 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:246:2: ( (this_Goal_0= ruleGoal | this_Task_1= ruleTask ) )
            // InternalGoalDSL.g:247:2: (this_Goal_0= ruleGoal | this_Task_1= ruleTask )
            {
            // InternalGoalDSL.g:247:2: (this_Goal_0= ruleGoal | this_Task_1= ruleTask )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGoalDSL.g:248:3: this_Goal_0= ruleGoal
                    {

                    			newCompositeNode(grammarAccess.getGoalTaskElementAccess().getGoalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Goal_0=ruleGoal();

                    state._fsp--;


                    			current = this_Goal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:257:3: this_Task_1= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getGoalTaskElementAccess().getTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_1=ruleTask();

                    state._fsp--;


                    			current = this_Task_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleGoalTaskElement"


    // $ANTLR start "entryRuleActor"
    // InternalGoalDSL.g:269:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalGoalDSL.g:269:46: (iv_ruleActor= ruleActor EOF )
            // InternalGoalDSL.g:270:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalGoalDSL.g:276:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_intentionalElements_4_0 = null;

        EObject lv_contribution_5_0 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:282:2: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' ) ) ) )
            // InternalGoalDSL.g:283:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' ) ) )
            {
            // InternalGoalDSL.g:283:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' ) ) )
            // InternalGoalDSL.g:284:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalGoalDSL.g:288:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoalDSL.g:289:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoalDSL.g:289:4: (lv_name_1_0= RULE_ID )
            // InternalGoalDSL.g:290:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGoalDSL.g:306:3: (otherlv_2= ';' | (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==12) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGoalDSL.g:307:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getActorAccess().getSemicolonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:312:4: (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' )
                    {
                    // InternalGoalDSL.g:312:4: (otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}' )
                    // InternalGoalDSL.g:313:5: otherlv_3= '{' ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )* ( (lv_contribution_5_0= ruleContribution ) )* otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalGoalDSL.g:317:5: ( (lv_intentionalElements_4_0= ruleIntentionalElement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11||(LA5_0>=19 && LA5_0<=20)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGoalDSL.g:318:6: (lv_intentionalElements_4_0= ruleIntentionalElement )
                    	    {
                    	    // InternalGoalDSL.g:318:6: (lv_intentionalElements_4_0= ruleIntentionalElement )
                    	    // InternalGoalDSL.g:319:7: lv_intentionalElements_4_0= ruleIntentionalElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getActorAccess().getIntentionalElementsIntentionalElementParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_intentionalElements_4_0=ruleIntentionalElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"intentionalElements",
                    	    								lv_intentionalElements_4_0,
                    	    								"ca.uwo.goal.GoalDSL.IntentionalElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // InternalGoalDSL.g:336:5: ( (lv_contribution_5_0= ruleContribution ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGoalDSL.g:337:6: (lv_contribution_5_0= ruleContribution )
                    	    {
                    	    // InternalGoalDSL.g:337:6: (lv_contribution_5_0= ruleContribution )
                    	    // InternalGoalDSL.g:338:7: lv_contribution_5_0= ruleContribution
                    	    {

                    	    							newCompositeNode(grammarAccess.getActorAccess().getContributionContributionParserRuleCall_2_1_2_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_contribution_5_0=ruleContribution();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActorRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"contribution",
                    	    								lv_contribution_5_0,
                    	    								"ca.uwo.goal.GoalDSL.Contribution");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_2_1_3());
                    				

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleGoal"
    // InternalGoalDSL.g:365:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // InternalGoalDSL.g:365:45: (iv_ruleGoal= ruleGoal EOF )
            // InternalGoalDSL.g:366:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalGoalDSL.g:372:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_decompositionType_5_0 = null;

        EObject lv_chilldren_8_0 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:378:2: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) ) )
            // InternalGoalDSL.g:379:2: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) )
            {
            // InternalGoalDSL.g:379:2: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) )
            // InternalGoalDSL.g:380:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
            		
            // InternalGoalDSL.g:384:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoalDSL.g:385:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoalDSL.g:385:4: (lv_name_1_0= RULE_ID )
            // InternalGoalDSL.g:386:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGoalDSL.g:402:3: (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalGoalDSL.g:403:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getSemicolonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:408:4: (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? )
                    {
                    // InternalGoalDSL.g:408:4: (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? )
                    // InternalGoalDSL.g:409:5: otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )?
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_14); 

                    					newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getDecomposesToKeyword_2_1_0());
                    				
                    otherlv_4=(Token)match(input,17,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getLeftParenthesisKeyword_2_1_1());
                    				
                    // InternalGoalDSL.g:417:5: ( (lv_decompositionType_5_0= ruleDecompositionType ) )
                    // InternalGoalDSL.g:418:6: (lv_decompositionType_5_0= ruleDecompositionType )
                    {
                    // InternalGoalDSL.g:418:6: (lv_decompositionType_5_0= ruleDecompositionType )
                    // InternalGoalDSL.g:419:7: lv_decompositionType_5_0= ruleDecompositionType
                    {

                    							newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_decompositionType_5_0=ruleDecompositionType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGoalRule());
                    							}
                    							set(
                    								current,
                    								"decompositionType",
                    								lv_decompositionType_5_0,
                    								"ca.uwo.goal.GoalDSL.DecompositionType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getGoalAccess().getRightParenthesisKeyword_2_1_3());
                    				
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    					newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_1_4());
                    				
                    // InternalGoalDSL.g:444:5: ( (lv_chilldren_8_0= ruleGoalTaskElement ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==11||LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalGoalDSL.g:445:6: (lv_chilldren_8_0= ruleGoalTaskElement )
                    	    {
                    	    // InternalGoalDSL.g:445:6: (lv_chilldren_8_0= ruleGoalTaskElement )
                    	    // InternalGoalDSL.g:446:7: lv_chilldren_8_0= ruleGoalTaskElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getGoalAccess().getChilldrenGoalTaskElementParserRuleCall_2_1_5_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_chilldren_8_0=ruleGoalTaskElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"chilldren",
                    	    								lv_chilldren_8_0,
                    	    								"ca.uwo.goal.GoalDSL.GoalTaskElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,13,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_1_6());
                    				
                    otherlv_10=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(otherlv_10, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_7());
                    				
                    // InternalGoalDSL.g:471:5: ( (otherlv_11= RULE_ID ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==EOF||LA9_1==RULE_ID||LA9_1==11||LA9_1==13||(LA9_1>=19 && LA9_1<=20)) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalGoalDSL.g:472:6: (otherlv_11= RULE_ID )
                            {
                            // InternalGoalDSL.g:472:6: (otherlv_11= RULE_ID )
                            // InternalGoalDSL.g:473:7: otherlv_11= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getGoalRule());
                            							}
                            						
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getParentGoalTaskElementCrossReference_2_1_8_0());
                            						

                            }


                            }
                            break;

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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleTask"
    // InternalGoalDSL.g:490:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalGoalDSL.g:490:45: (iv_ruleTask= ruleTask EOF )
            // InternalGoalDSL.g:491:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalGoalDSL.g:497:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_decompositionType_5_0 = null;

        EObject lv_chilldren_8_0 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:503:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) ) )
            // InternalGoalDSL.g:504:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) )
            {
            // InternalGoalDSL.g:504:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) ) )
            // InternalGoalDSL.g:505:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalGoalDSL.g:509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoalDSL.g:510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoalDSL.g:510:4: (lv_name_1_0= RULE_ID )
            // InternalGoalDSL.g:511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGoalDSL.g:527:3: (otherlv_2= ';' | (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==16) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGoalDSL.g:528:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getSemicolonKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:533:4: (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? )
                    {
                    // InternalGoalDSL.g:533:4: (otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )? )
                    // InternalGoalDSL.g:534:5: otherlv_3= 'decomposesTo' otherlv_4= '(' ( (lv_decompositionType_5_0= ruleDecompositionType ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_chilldren_8_0= ruleGoalTaskElement ) )* otherlv_9= '}' otherlv_10= ';' ( (otherlv_11= RULE_ID ) )?
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_14); 

                    					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getDecomposesToKeyword_2_1_0());
                    				
                    otherlv_4=(Token)match(input,17,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getLeftParenthesisKeyword_2_1_1());
                    				
                    // InternalGoalDSL.g:542:5: ( (lv_decompositionType_5_0= ruleDecompositionType ) )
                    // InternalGoalDSL.g:543:6: (lv_decompositionType_5_0= ruleDecompositionType )
                    {
                    // InternalGoalDSL.g:543:6: (lv_decompositionType_5_0= ruleDecompositionType )
                    // InternalGoalDSL.g:544:7: lv_decompositionType_5_0= ruleDecompositionType
                    {

                    							newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_2_0());
                    						
                    pushFollow(FOLLOW_16);
                    lv_decompositionType_5_0=ruleDecompositionType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    							}
                    							set(
                    								current,
                    								"decompositionType",
                    								lv_decompositionType_5_0,
                    								"ca.uwo.goal.GoalDSL.DecompositionType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    					newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRightParenthesisKeyword_2_1_3());
                    				
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    					newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2_1_4());
                    				
                    // InternalGoalDSL.g:569:5: ( (lv_chilldren_8_0= ruleGoalTaskElement ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==11||LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGoalDSL.g:570:6: (lv_chilldren_8_0= ruleGoalTaskElement )
                    	    {
                    	    // InternalGoalDSL.g:570:6: (lv_chilldren_8_0= ruleGoalTaskElement )
                    	    // InternalGoalDSL.g:571:7: lv_chilldren_8_0= ruleGoalTaskElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getChilldrenGoalTaskElementParserRuleCall_2_1_5_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_chilldren_8_0=ruleGoalTaskElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"chilldren",
                    	    								lv_chilldren_8_0,
                    	    								"ca.uwo.goal.GoalDSL.GoalTaskElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,13,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_6());
                    				
                    otherlv_10=(Token)match(input,15,FOLLOW_8); 

                    					newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_7());
                    				
                    // InternalGoalDSL.g:596:5: ( (otherlv_11= RULE_ID ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==EOF||LA12_1==RULE_ID||LA12_1==11||LA12_1==13||(LA12_1>=19 && LA12_1<=20)) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalGoalDSL.g:597:6: (otherlv_11= RULE_ID )
                            {
                            // InternalGoalDSL.g:597:6: (otherlv_11= RULE_ID )
                            // InternalGoalDSL.g:598:7: otherlv_11= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTaskRule());
                            							}
                            						
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getParentGoalTaskElementCrossReference_2_1_8_0());
                            						

                            }


                            }
                            break;

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleResource"
    // InternalGoalDSL.g:615:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalGoalDSL.g:615:49: (iv_ruleResource= ruleResource EOF )
            // InternalGoalDSL.g:616:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalGoalDSL.g:622:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'neededBy' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGoalDSL.g:628:2: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'neededBy' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* ) ) )
            // InternalGoalDSL.g:629:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'neededBy' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* ) )
            {
            // InternalGoalDSL.g:629:2: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'neededBy' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalGoalDSL.g:630:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'neededBy' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
            		
            // InternalGoalDSL.g:634:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGoalDSL.g:635:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGoalDSL.g:635:4: (lv_name_1_0= RULE_ID )
            // InternalGoalDSL.g:636:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGoalDSL.g:652:3: (otherlv_2= 'neededBy' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalGoalDSL.g:653:4: otherlv_2= 'neededBy' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            				newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getNeededByKeyword_2_0());
            			
            // InternalGoalDSL.g:657:4: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:658:5: ( ruleQualifiedName )
            {
            // InternalGoalDSL.g:658:5: ( ruleQualifiedName )
            // InternalGoalDSL.g:659:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getResourceRule());
            						}
            					

            						newCompositeNode(grammarAccess.getResourceAccess().getDestTaskCrossReference_2_1_0());
            					
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGoalDSL.g:673:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGoalDSL.g:674:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_9); 

            	    					newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getCommaKeyword_2_2_0());
            	    				
            	    // InternalGoalDSL.g:678:5: ( ( ruleQualifiedName ) )
            	    // InternalGoalDSL.g:679:6: ( ruleQualifiedName )
            	    {
            	    // InternalGoalDSL.g:679:6: ( ruleQualifiedName )
            	    // InternalGoalDSL.g:680:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getResourceRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getResourceAccess().getDestTaskCrossReference_2_2_1_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleContribution"
    // InternalGoalDSL.g:700:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // InternalGoalDSL.g:700:53: (iv_ruleContribution= ruleContribution EOF )
            // InternalGoalDSL.g:701:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
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
    // $ANTLR end "entryRuleContribution"


    // $ANTLR start "ruleContribution"
    // InternalGoalDSL.g:707:1: ruleContribution returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' otherlv_2= '(' ( (lv_contributionType_3_0= ruleContributionType ) ) otherlv_4= ')' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_contributionType_3_0 = null;



        	enterRule();

        try {
            // InternalGoalDSL.g:713:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' otherlv_2= '(' ( (lv_contributionType_3_0= ruleContributionType ) ) otherlv_4= ')' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalGoalDSL.g:714:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' otherlv_2= '(' ( (lv_contributionType_3_0= ruleContributionType ) ) otherlv_4= ')' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalGoalDSL.g:714:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' otherlv_2= '(' ( (lv_contributionType_3_0= ruleContributionType ) ) otherlv_4= ')' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalGoalDSL.g:715:3: ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' otherlv_2= '(' ( (lv_contributionType_3_0= ruleContributionType ) ) otherlv_4= ')' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            {
            // InternalGoalDSL.g:715:3: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:716:4: ( ruleQualifiedName )
            {
            // InternalGoalDSL.g:716:4: ( ruleQualifiedName )
            // InternalGoalDSL.g:717:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContributionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getContributionAccess().getContributesToKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getContributionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalGoalDSL.g:739:3: ( (lv_contributionType_3_0= ruleContributionType ) )
            // InternalGoalDSL.g:740:4: (lv_contributionType_3_0= ruleContributionType )
            {
            // InternalGoalDSL.g:740:4: (lv_contributionType_3_0= ruleContributionType )
            // InternalGoalDSL.g:741:5: lv_contributionType_3_0= ruleContributionType
            {

            					newCompositeNode(grammarAccess.getContributionAccess().getContributionTypeContributionTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_contributionType_3_0=ruleContributionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContributionRule());
            					}
            					set(
            						current,
            						"contributionType",
            						lv_contributionType_3_0,
            						"ca.uwo.goal.GoalDSL.ContributionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getContributionAccess().getRightParenthesisKeyword_4());
            		
            // InternalGoalDSL.g:762:3: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:763:4: ( ruleQualifiedName )
            {
            // InternalGoalDSL.g:763:4: ( ruleQualifiedName )
            // InternalGoalDSL.g:764:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContributionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContributionAccess().getDestGoalTaskElementCrossReference_5_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoalDSL.g:778:3: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGoalDSL.g:779:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,22,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getContributionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalGoalDSL.g:783:4: ( ( ruleQualifiedName ) )
            	    // InternalGoalDSL.g:784:5: ( ruleQualifiedName )
            	    {
            	    // InternalGoalDSL.g:784:5: ( ruleQualifiedName )
            	    // InternalGoalDSL.g:785:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getContributionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getContributionAccess().getDestGoalTaskElementCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleContribution"


    // $ANTLR start "entryRuleDependency"
    // InternalGoalDSL.g:804:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalGoalDSL.g:804:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalGoalDSL.g:805:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalGoalDSL.g:811:1: ruleDependency returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGoalDSL.g:817:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* ) )
            // InternalGoalDSL.g:818:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalGoalDSL.g:818:2: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalGoalDSL.g:819:3: ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            {
            // InternalGoalDSL.g:819:3: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:820:4: ( ruleQualifiedName )
            {
            // InternalGoalDSL.g:820:4: ( ruleQualifiedName )
            // InternalGoalDSL.g:821:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0());
            				
            pushFollow(FOLLOW_23);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getDependsOnKeyword_1());
            		
            // InternalGoalDSL.g:839:3: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:840:4: ( ruleQualifiedName )
            {
            // InternalGoalDSL.g:840:4: ( ruleQualifiedName )
            // InternalGoalDSL.g:841:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDependencyAccess().getDestIntentionalElementCrossReference_2_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGoalDSL.g:855:3: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGoalDSL.g:856:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalGoalDSL.g:860:4: ( ( ruleQualifiedName ) )
            	    // InternalGoalDSL.g:861:5: ( ruleQualifiedName )
            	    {
            	    // InternalGoalDSL.g:861:5: ( ruleQualifiedName )
            	    // InternalGoalDSL.g:862:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getDependencyRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getDependencyAccess().getDestIntentionalElementCrossReference_3_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalGoalDSL.g:881:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalGoalDSL.g:881:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalGoalDSL.g:882:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalGoalDSL.g:888:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalGoalDSL.g:894:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalGoalDSL.g:895:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalGoalDSL.g:895:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalGoalDSL.g:896:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalGoalDSL.g:903:3: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGoalDSL.g:904:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDecompositionType"
    // InternalGoalDSL.g:921:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalGoalDSL.g:927:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalGoalDSL.g:928:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalGoalDSL.g:928:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            else if ( (LA18_0==27) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalGoalDSL.g:929:3: (enumLiteral_0= 'and' )
                    {
                    // InternalGoalDSL.g:929:3: (enumLiteral_0= 'and' )
                    // InternalGoalDSL.g:930:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDecompositionTypeAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getANDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:937:3: (enumLiteral_1= 'or' )
                    {
                    // InternalGoalDSL.g:937:3: (enumLiteral_1= 'or' )
                    // InternalGoalDSL.g:938:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDecompositionTypeAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOREnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleDecompositionType"


    // $ANTLR start "ruleContributionType"
    // InternalGoalDSL.g:948:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= '++S' ) | (enumLiteral_1= '--S' ) | (enumLiteral_2= '++D' ) | (enumLiteral_3= '--D' ) ) ;
    public final Enumerator ruleContributionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGoalDSL.g:954:2: ( ( (enumLiteral_0= '++S' ) | (enumLiteral_1= '--S' ) | (enumLiteral_2= '++D' ) | (enumLiteral_3= '--D' ) ) )
            // InternalGoalDSL.g:955:2: ( (enumLiteral_0= '++S' ) | (enumLiteral_1= '--S' ) | (enumLiteral_2= '++D' ) | (enumLiteral_3= '--D' ) )
            {
            // InternalGoalDSL.g:955:2: ( (enumLiteral_0= '++S' ) | (enumLiteral_1= '--S' ) | (enumLiteral_2= '++D' ) | (enumLiteral_3= '--D' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            case 31:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalGoalDSL.g:956:3: (enumLiteral_0= '++S' )
                    {
                    // InternalGoalDSL.g:956:3: (enumLiteral_0= '++S' )
                    // InternalGoalDSL.g:957:4: enumLiteral_0= '++S'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getContributionTypeAccess().getMAKEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getMAKEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:964:3: (enumLiteral_1= '--S' )
                    {
                    // InternalGoalDSL.g:964:3: (enumLiteral_1= '--S' )
                    // InternalGoalDSL.g:965:4: enumLiteral_1= '--S'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getContributionTypeAccess().getBREAKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getBREAKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGoalDSL.g:972:3: (enumLiteral_2= '++D' )
                    {
                    // InternalGoalDSL.g:972:3: (enumLiteral_2= '++D' )
                    // InternalGoalDSL.g:973:4: enumLiteral_2= '++D'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getContributionTypeAccess().getNEGATION_MAKEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getNEGATION_MAKEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGoalDSL.g:980:3: (enumLiteral_3= '--D' )
                    {
                    // InternalGoalDSL.g:980:3: (enumLiteral_3= '--D' )
                    // InternalGoalDSL.g:981:4: enumLiteral_3= '--D'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getContributionTypeAccess().getNEGATION_BREAKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getNEGATION_BREAKEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleContributionType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000182820L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000082800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});

}