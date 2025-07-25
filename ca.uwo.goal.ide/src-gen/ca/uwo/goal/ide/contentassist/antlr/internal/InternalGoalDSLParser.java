package ca.uwo.goal.ide.contentassist.antlr.internal;

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
import ca.uwo.goal.services.GoalDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGoalDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'and'", "'or'", "'++S'", "'--S'", "'++D'", "'--D'", "'goal'", "'{'", "'}'", "'actor'", "'decomposesTo'", "'('", "')'", "'task'", "'resource'", "'neededBy'", "','", "'contributesTo'", "'dependsOn'", "'.'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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

    	public void setGrammarAccess(GoalDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGoalSpecification"
    // InternalGoalDSL.g:53:1: entryRuleGoalSpecification : ruleGoalSpecification EOF ;
    public final void entryRuleGoalSpecification() throws RecognitionException {
        try {
            // InternalGoalDSL.g:54:1: ( ruleGoalSpecification EOF )
            // InternalGoalDSL.g:55:1: ruleGoalSpecification EOF
            {
             before(grammarAccess.getGoalSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleGoalSpecification();

            state._fsp--;

             after(grammarAccess.getGoalSpecificationRule()); 
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
    // $ANTLR end "entryRuleGoalSpecification"


    // $ANTLR start "ruleGoalSpecification"
    // InternalGoalDSL.g:62:1: ruleGoalSpecification : ( ( rule__GoalSpecification__Group__0 ) ) ;
    public final void ruleGoalSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:66:2: ( ( ( rule__GoalSpecification__Group__0 ) ) )
            // InternalGoalDSL.g:67:2: ( ( rule__GoalSpecification__Group__0 ) )
            {
            // InternalGoalDSL.g:67:2: ( ( rule__GoalSpecification__Group__0 ) )
            // InternalGoalDSL.g:68:3: ( rule__GoalSpecification__Group__0 )
            {
             before(grammarAccess.getGoalSpecificationAccess().getGroup()); 
            // InternalGoalDSL.g:69:3: ( rule__GoalSpecification__Group__0 )
            // InternalGoalDSL.g:69:4: rule__GoalSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoalSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleGoalSpecification"


    // $ANTLR start "entryRuleRoot"
    // InternalGoalDSL.g:78:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalGoalDSL.g:79:1: ( ruleRoot EOF )
            // InternalGoalDSL.g:80:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalGoalDSL.g:87:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:91:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalGoalDSL.g:92:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalGoalDSL.g:92:2: ( ( rule__Root__Group__0 ) )
            // InternalGoalDSL.g:93:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalGoalDSL.g:94:3: ( rule__Root__Group__0 )
            // InternalGoalDSL.g:94:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleIntentionalElement"
    // InternalGoalDSL.g:103:1: entryRuleIntentionalElement : ruleIntentionalElement EOF ;
    public final void entryRuleIntentionalElement() throws RecognitionException {
        try {
            // InternalGoalDSL.g:104:1: ( ruleIntentionalElement EOF )
            // InternalGoalDSL.g:105:1: ruleIntentionalElement EOF
            {
             before(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_1);
            ruleIntentionalElement();

            state._fsp--;

             after(grammarAccess.getIntentionalElementRule()); 
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
    // $ANTLR end "entryRuleIntentionalElement"


    // $ANTLR start "ruleIntentionalElement"
    // InternalGoalDSL.g:112:1: ruleIntentionalElement : ( ( rule__IntentionalElement__Alternatives ) ) ;
    public final void ruleIntentionalElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:116:2: ( ( ( rule__IntentionalElement__Alternatives ) ) )
            // InternalGoalDSL.g:117:2: ( ( rule__IntentionalElement__Alternatives ) )
            {
            // InternalGoalDSL.g:117:2: ( ( rule__IntentionalElement__Alternatives ) )
            // InternalGoalDSL.g:118:3: ( rule__IntentionalElement__Alternatives )
            {
             before(grammarAccess.getIntentionalElementAccess().getAlternatives()); 
            // InternalGoalDSL.g:119:3: ( rule__IntentionalElement__Alternatives )
            // InternalGoalDSL.g:119:4: rule__IntentionalElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntentionalElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntentionalElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIntentionalElement"


    // $ANTLR start "entryRuleGoalTaskElement"
    // InternalGoalDSL.g:128:1: entryRuleGoalTaskElement : ruleGoalTaskElement EOF ;
    public final void entryRuleGoalTaskElement() throws RecognitionException {
        try {
            // InternalGoalDSL.g:129:1: ( ruleGoalTaskElement EOF )
            // InternalGoalDSL.g:130:1: ruleGoalTaskElement EOF
            {
             before(grammarAccess.getGoalTaskElementRule()); 
            pushFollow(FOLLOW_1);
            ruleGoalTaskElement();

            state._fsp--;

             after(grammarAccess.getGoalTaskElementRule()); 
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
    // $ANTLR end "entryRuleGoalTaskElement"


    // $ANTLR start "ruleGoalTaskElement"
    // InternalGoalDSL.g:137:1: ruleGoalTaskElement : ( ( rule__GoalTaskElement__Alternatives ) ) ;
    public final void ruleGoalTaskElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:141:2: ( ( ( rule__GoalTaskElement__Alternatives ) ) )
            // InternalGoalDSL.g:142:2: ( ( rule__GoalTaskElement__Alternatives ) )
            {
            // InternalGoalDSL.g:142:2: ( ( rule__GoalTaskElement__Alternatives ) )
            // InternalGoalDSL.g:143:3: ( rule__GoalTaskElement__Alternatives )
            {
             before(grammarAccess.getGoalTaskElementAccess().getAlternatives()); 
            // InternalGoalDSL.g:144:3: ( rule__GoalTaskElement__Alternatives )
            // InternalGoalDSL.g:144:4: rule__GoalTaskElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GoalTaskElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGoalTaskElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGoalTaskElement"


    // $ANTLR start "entryRuleActor"
    // InternalGoalDSL.g:153:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalGoalDSL.g:154:1: ( ruleActor EOF )
            // InternalGoalDSL.g:155:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalGoalDSL.g:162:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:166:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalGoalDSL.g:167:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalGoalDSL.g:167:2: ( ( rule__Actor__Group__0 ) )
            // InternalGoalDSL.g:168:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalGoalDSL.g:169:3: ( rule__Actor__Group__0 )
            // InternalGoalDSL.g:169:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleGoal"
    // InternalGoalDSL.g:178:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // InternalGoalDSL.g:179:1: ( ruleGoal EOF )
            // InternalGoalDSL.g:180:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_1);
            ruleGoal();

            state._fsp--;

             after(grammarAccess.getGoalRule()); 
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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // InternalGoalDSL.g:187:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:191:2: ( ( ( rule__Goal__Group__0 ) ) )
            // InternalGoalDSL.g:192:2: ( ( rule__Goal__Group__0 ) )
            {
            // InternalGoalDSL.g:192:2: ( ( rule__Goal__Group__0 ) )
            // InternalGoalDSL.g:193:3: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // InternalGoalDSL.g:194:3: ( rule__Goal__Group__0 )
            // InternalGoalDSL.g:194:4: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleTask"
    // InternalGoalDSL.g:203:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalGoalDSL.g:204:1: ( ruleTask EOF )
            // InternalGoalDSL.g:205:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalGoalDSL.g:212:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:216:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalGoalDSL.g:217:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalGoalDSL.g:217:2: ( ( rule__Task__Group__0 ) )
            // InternalGoalDSL.g:218:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalGoalDSL.g:219:3: ( rule__Task__Group__0 )
            // InternalGoalDSL.g:219:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleResource"
    // InternalGoalDSL.g:228:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalGoalDSL.g:229:1: ( ruleResource EOF )
            // InternalGoalDSL.g:230:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalGoalDSL.g:237:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:241:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalGoalDSL.g:242:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalGoalDSL.g:242:2: ( ( rule__Resource__Group__0 ) )
            // InternalGoalDSL.g:243:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalGoalDSL.g:244:3: ( rule__Resource__Group__0 )
            // InternalGoalDSL.g:244:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleContribution"
    // InternalGoalDSL.g:253:1: entryRuleContribution : ruleContribution EOF ;
    public final void entryRuleContribution() throws RecognitionException {
        try {
            // InternalGoalDSL.g:254:1: ( ruleContribution EOF )
            // InternalGoalDSL.g:255:1: ruleContribution EOF
            {
             before(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_1);
            ruleContribution();

            state._fsp--;

             after(grammarAccess.getContributionRule()); 
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
    // $ANTLR end "entryRuleContribution"


    // $ANTLR start "ruleContribution"
    // InternalGoalDSL.g:262:1: ruleContribution : ( ( rule__Contribution__Group__0 ) ) ;
    public final void ruleContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:266:2: ( ( ( rule__Contribution__Group__0 ) ) )
            // InternalGoalDSL.g:267:2: ( ( rule__Contribution__Group__0 ) )
            {
            // InternalGoalDSL.g:267:2: ( ( rule__Contribution__Group__0 ) )
            // InternalGoalDSL.g:268:3: ( rule__Contribution__Group__0 )
            {
             before(grammarAccess.getContributionAccess().getGroup()); 
            // InternalGoalDSL.g:269:3: ( rule__Contribution__Group__0 )
            // InternalGoalDSL.g:269:4: rule__Contribution__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contribution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContributionAccess().getGroup()); 

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
    // $ANTLR end "ruleContribution"


    // $ANTLR start "entryRuleDependency"
    // InternalGoalDSL.g:278:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalGoalDSL.g:279:1: ( ruleDependency EOF )
            // InternalGoalDSL.g:280:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalGoalDSL.g:287:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:291:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // InternalGoalDSL.g:292:2: ( ( rule__Dependency__Group__0 ) )
            {
            // InternalGoalDSL.g:292:2: ( ( rule__Dependency__Group__0 ) )
            // InternalGoalDSL.g:293:3: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // InternalGoalDSL.g:294:3: ( rule__Dependency__Group__0 )
            // InternalGoalDSL.g:294:4: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalGoalDSL.g:303:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalGoalDSL.g:304:1: ( ruleQualifiedName EOF )
            // InternalGoalDSL.g:305:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalGoalDSL.g:312:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:316:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalGoalDSL.g:317:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalGoalDSL.g:317:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalGoalDSL.g:318:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalGoalDSL.g:319:3: ( rule__QualifiedName__Group__0 )
            // InternalGoalDSL.g:319:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleDecompositionType"
    // InternalGoalDSL.g:328:1: ruleDecompositionType : ( ( rule__DecompositionType__Alternatives ) ) ;
    public final void ruleDecompositionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:332:1: ( ( ( rule__DecompositionType__Alternatives ) ) )
            // InternalGoalDSL.g:333:2: ( ( rule__DecompositionType__Alternatives ) )
            {
            // InternalGoalDSL.g:333:2: ( ( rule__DecompositionType__Alternatives ) )
            // InternalGoalDSL.g:334:3: ( rule__DecompositionType__Alternatives )
            {
             before(grammarAccess.getDecompositionTypeAccess().getAlternatives()); 
            // InternalGoalDSL.g:335:3: ( rule__DecompositionType__Alternatives )
            // InternalGoalDSL.g:335:4: rule__DecompositionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DecompositionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDecompositionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDecompositionType"


    // $ANTLR start "ruleContributionType"
    // InternalGoalDSL.g:344:1: ruleContributionType : ( ( rule__ContributionType__Alternatives ) ) ;
    public final void ruleContributionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:348:1: ( ( ( rule__ContributionType__Alternatives ) ) )
            // InternalGoalDSL.g:349:2: ( ( rule__ContributionType__Alternatives ) )
            {
            // InternalGoalDSL.g:349:2: ( ( rule__ContributionType__Alternatives ) )
            // InternalGoalDSL.g:350:3: ( rule__ContributionType__Alternatives )
            {
             before(grammarAccess.getContributionTypeAccess().getAlternatives()); 
            // InternalGoalDSL.g:351:3: ( rule__ContributionType__Alternatives )
            // InternalGoalDSL.g:351:4: rule__ContributionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContributionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContributionTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContributionType"


    // $ANTLR start "rule__IntentionalElement__Alternatives"
    // InternalGoalDSL.g:359:1: rule__IntentionalElement__Alternatives : ( ( ruleGoalTaskElement ) | ( ruleResource ) );
    public final void rule__IntentionalElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:363:1: ( ( ruleGoalTaskElement ) | ( ruleResource ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18||LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGoalDSL.g:364:2: ( ruleGoalTaskElement )
                    {
                    // InternalGoalDSL.g:364:2: ( ruleGoalTaskElement )
                    // InternalGoalDSL.g:365:3: ruleGoalTaskElement
                    {
                     before(grammarAccess.getIntentionalElementAccess().getGoalTaskElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGoalTaskElement();

                    state._fsp--;

                     after(grammarAccess.getIntentionalElementAccess().getGoalTaskElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:370:2: ( ruleResource )
                    {
                    // InternalGoalDSL.g:370:2: ( ruleResource )
                    // InternalGoalDSL.g:371:3: ruleResource
                    {
                     before(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_1()); 

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
    // $ANTLR end "rule__IntentionalElement__Alternatives"


    // $ANTLR start "rule__GoalTaskElement__Alternatives"
    // InternalGoalDSL.g:380:1: rule__GoalTaskElement__Alternatives : ( ( ruleGoal ) | ( ruleTask ) );
    public final void rule__GoalTaskElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:384:1: ( ( ruleGoal ) | ( ruleTask ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGoalDSL.g:385:2: ( ruleGoal )
                    {
                    // InternalGoalDSL.g:385:2: ( ruleGoal )
                    // InternalGoalDSL.g:386:3: ruleGoal
                    {
                     before(grammarAccess.getGoalTaskElementAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGoal();

                    state._fsp--;

                     after(grammarAccess.getGoalTaskElementAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:391:2: ( ruleTask )
                    {
                    // InternalGoalDSL.g:391:2: ( ruleTask )
                    // InternalGoalDSL.g:392:3: ruleTask
                    {
                     before(grammarAccess.getGoalTaskElementAccess().getTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTask();

                    state._fsp--;

                     after(grammarAccess.getGoalTaskElementAccess().getTaskParserRuleCall_1()); 

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
    // $ANTLR end "rule__GoalTaskElement__Alternatives"


    // $ANTLR start "rule__Actor__Alternatives_2"
    // InternalGoalDSL.g:401:1: rule__Actor__Alternatives_2 : ( ( ';' ) | ( ( rule__Actor__Group_2_1__0 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:405:1: ( ( ';' ) | ( ( rule__Actor__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGoalDSL.g:406:2: ( ';' )
                    {
                    // InternalGoalDSL.g:406:2: ( ';' )
                    // InternalGoalDSL.g:407:3: ';'
                    {
                     before(grammarAccess.getActorAccess().getSemicolonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getActorAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:412:2: ( ( rule__Actor__Group_2_1__0 ) )
                    {
                    // InternalGoalDSL.g:412:2: ( ( rule__Actor__Group_2_1__0 ) )
                    // InternalGoalDSL.g:413:3: ( rule__Actor__Group_2_1__0 )
                    {
                     before(grammarAccess.getActorAccess().getGroup_2_1()); 
                    // InternalGoalDSL.g:414:3: ( rule__Actor__Group_2_1__0 )
                    // InternalGoalDSL.g:414:4: rule__Actor__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActorAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Actor__Alternatives_2"


    // $ANTLR start "rule__Goal__Alternatives_2"
    // InternalGoalDSL.g:422:1: rule__Goal__Alternatives_2 : ( ( ';' ) | ( ( rule__Goal__Group_2_1__0 ) ) );
    public final void rule__Goal__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:426:1: ( ( ';' ) | ( ( rule__Goal__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGoalDSL.g:427:2: ( ';' )
                    {
                    // InternalGoalDSL.g:427:2: ( ';' )
                    // InternalGoalDSL.g:428:3: ';'
                    {
                     before(grammarAccess.getGoalAccess().getSemicolonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getGoalAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:433:2: ( ( rule__Goal__Group_2_1__0 ) )
                    {
                    // InternalGoalDSL.g:433:2: ( ( rule__Goal__Group_2_1__0 ) )
                    // InternalGoalDSL.g:434:3: ( rule__Goal__Group_2_1__0 )
                    {
                     before(grammarAccess.getGoalAccess().getGroup_2_1()); 
                    // InternalGoalDSL.g:435:3: ( rule__Goal__Group_2_1__0 )
                    // InternalGoalDSL.g:435:4: rule__Goal__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goal__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGoalAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Goal__Alternatives_2"


    // $ANTLR start "rule__Task__Alternatives_2"
    // InternalGoalDSL.g:443:1: rule__Task__Alternatives_2 : ( ( ';' ) | ( ( rule__Task__Group_2_1__0 ) ) );
    public final void rule__Task__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:447:1: ( ( ';' ) | ( ( rule__Task__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGoalDSL.g:448:2: ( ';' )
                    {
                    // InternalGoalDSL.g:448:2: ( ';' )
                    // InternalGoalDSL.g:449:3: ';'
                    {
                     before(grammarAccess.getTaskAccess().getSemicolonKeyword_2_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTaskAccess().getSemicolonKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:454:2: ( ( rule__Task__Group_2_1__0 ) )
                    {
                    // InternalGoalDSL.g:454:2: ( ( rule__Task__Group_2_1__0 ) )
                    // InternalGoalDSL.g:455:3: ( rule__Task__Group_2_1__0 )
                    {
                     before(grammarAccess.getTaskAccess().getGroup_2_1()); 
                    // InternalGoalDSL.g:456:3: ( rule__Task__Group_2_1__0 )
                    // InternalGoalDSL.g:456:4: rule__Task__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Task__Alternatives_2"


    // $ANTLR start "rule__DecompositionType__Alternatives"
    // InternalGoalDSL.g:464:1: rule__DecompositionType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__DecompositionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:468:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalGoalDSL.g:469:2: ( ( 'and' ) )
                    {
                    // InternalGoalDSL.g:469:2: ( ( 'and' ) )
                    // InternalGoalDSL.g:470:3: ( 'and' )
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalGoalDSL.g:471:3: ( 'and' )
                    // InternalGoalDSL.g:471:4: 'and'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecompositionTypeAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:475:2: ( ( 'or' ) )
                    {
                    // InternalGoalDSL.g:475:2: ( ( 'or' ) )
                    // InternalGoalDSL.g:476:3: ( 'or' )
                    {
                     before(grammarAccess.getDecompositionTypeAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalGoalDSL.g:477:3: ( 'or' )
                    // InternalGoalDSL.g:477:4: 'or'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDecompositionTypeAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DecompositionType__Alternatives"


    // $ANTLR start "rule__ContributionType__Alternatives"
    // InternalGoalDSL.g:485:1: rule__ContributionType__Alternatives : ( ( ( '++S' ) ) | ( ( '--S' ) ) | ( ( '++D' ) ) | ( ( '--D' ) ) );
    public final void rule__ContributionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:489:1: ( ( ( '++S' ) ) | ( ( '--S' ) ) | ( ( '++D' ) ) | ( ( '--D' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGoalDSL.g:490:2: ( ( '++S' ) )
                    {
                    // InternalGoalDSL.g:490:2: ( ( '++S' ) )
                    // InternalGoalDSL.g:491:3: ( '++S' )
                    {
                     before(grammarAccess.getContributionTypeAccess().getMAKEEnumLiteralDeclaration_0()); 
                    // InternalGoalDSL.g:492:3: ( '++S' )
                    // InternalGoalDSL.g:492:4: '++S'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getContributionTypeAccess().getMAKEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGoalDSL.g:496:2: ( ( '--S' ) )
                    {
                    // InternalGoalDSL.g:496:2: ( ( '--S' ) )
                    // InternalGoalDSL.g:497:3: ( '--S' )
                    {
                     before(grammarAccess.getContributionTypeAccess().getBREAKEnumLiteralDeclaration_1()); 
                    // InternalGoalDSL.g:498:3: ( '--S' )
                    // InternalGoalDSL.g:498:4: '--S'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getContributionTypeAccess().getBREAKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGoalDSL.g:502:2: ( ( '++D' ) )
                    {
                    // InternalGoalDSL.g:502:2: ( ( '++D' ) )
                    // InternalGoalDSL.g:503:3: ( '++D' )
                    {
                     before(grammarAccess.getContributionTypeAccess().getNEGATION_MAKEEnumLiteralDeclaration_2()); 
                    // InternalGoalDSL.g:504:3: ( '++D' )
                    // InternalGoalDSL.g:504:4: '++D'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getContributionTypeAccess().getNEGATION_MAKEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGoalDSL.g:508:2: ( ( '--D' ) )
                    {
                    // InternalGoalDSL.g:508:2: ( ( '--D' ) )
                    // InternalGoalDSL.g:509:3: ( '--D' )
                    {
                     before(grammarAccess.getContributionTypeAccess().getNEGATION_BREAKEnumLiteralDeclaration_3()); 
                    // InternalGoalDSL.g:510:3: ( '--D' )
                    // InternalGoalDSL.g:510:4: '--D'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getContributionTypeAccess().getNEGATION_BREAKEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ContributionType__Alternatives"


    // $ANTLR start "rule__GoalSpecification__Group__0"
    // InternalGoalDSL.g:518:1: rule__GoalSpecification__Group__0 : rule__GoalSpecification__Group__0__Impl rule__GoalSpecification__Group__1 ;
    public final void rule__GoalSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:522:1: ( rule__GoalSpecification__Group__0__Impl rule__GoalSpecification__Group__1 )
            // InternalGoalDSL.g:523:2: rule__GoalSpecification__Group__0__Impl rule__GoalSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__GoalSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalSpecification__Group__1();

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
    // $ANTLR end "rule__GoalSpecification__Group__0"


    // $ANTLR start "rule__GoalSpecification__Group__0__Impl"
    // InternalGoalDSL.g:530:1: rule__GoalSpecification__Group__0__Impl : ( 'goal' ) ;
    public final void rule__GoalSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:534:1: ( ( 'goal' ) )
            // InternalGoalDSL.g:535:1: ( 'goal' )
            {
            // InternalGoalDSL.g:535:1: ( 'goal' )
            // InternalGoalDSL.g:536:2: 'goal'
            {
             before(grammarAccess.getGoalSpecificationAccess().getGoalKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGoalSpecificationAccess().getGoalKeyword_0()); 

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
    // $ANTLR end "rule__GoalSpecification__Group__0__Impl"


    // $ANTLR start "rule__GoalSpecification__Group__1"
    // InternalGoalDSL.g:545:1: rule__GoalSpecification__Group__1 : rule__GoalSpecification__Group__1__Impl rule__GoalSpecification__Group__2 ;
    public final void rule__GoalSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:549:1: ( rule__GoalSpecification__Group__1__Impl rule__GoalSpecification__Group__2 )
            // InternalGoalDSL.g:550:2: rule__GoalSpecification__Group__1__Impl rule__GoalSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__GoalSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalSpecification__Group__2();

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
    // $ANTLR end "rule__GoalSpecification__Group__1"


    // $ANTLR start "rule__GoalSpecification__Group__1__Impl"
    // InternalGoalDSL.g:557:1: rule__GoalSpecification__Group__1__Impl : ( ( rule__GoalSpecification__NameAssignment_1 ) ) ;
    public final void rule__GoalSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:561:1: ( ( ( rule__GoalSpecification__NameAssignment_1 ) ) )
            // InternalGoalDSL.g:562:1: ( ( rule__GoalSpecification__NameAssignment_1 ) )
            {
            // InternalGoalDSL.g:562:1: ( ( rule__GoalSpecification__NameAssignment_1 ) )
            // InternalGoalDSL.g:563:2: ( rule__GoalSpecification__NameAssignment_1 )
            {
             before(grammarAccess.getGoalSpecificationAccess().getNameAssignment_1()); 
            // InternalGoalDSL.g:564:2: ( rule__GoalSpecification__NameAssignment_1 )
            // InternalGoalDSL.g:564:3: rule__GoalSpecification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GoalSpecification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalSpecificationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__GoalSpecification__Group__1__Impl"


    // $ANTLR start "rule__GoalSpecification__Group__2"
    // InternalGoalDSL.g:572:1: rule__GoalSpecification__Group__2 : rule__GoalSpecification__Group__2__Impl rule__GoalSpecification__Group__3 ;
    public final void rule__GoalSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:576:1: ( rule__GoalSpecification__Group__2__Impl rule__GoalSpecification__Group__3 )
            // InternalGoalDSL.g:577:2: rule__GoalSpecification__Group__2__Impl rule__GoalSpecification__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GoalSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalSpecification__Group__3();

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
    // $ANTLR end "rule__GoalSpecification__Group__2"


    // $ANTLR start "rule__GoalSpecification__Group__2__Impl"
    // InternalGoalDSL.g:584:1: rule__GoalSpecification__Group__2__Impl : ( '{' ) ;
    public final void rule__GoalSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:588:1: ( ( '{' ) )
            // InternalGoalDSL.g:589:1: ( '{' )
            {
            // InternalGoalDSL.g:589:1: ( '{' )
            // InternalGoalDSL.g:590:2: '{'
            {
             before(grammarAccess.getGoalSpecificationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGoalSpecificationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__GoalSpecification__Group__2__Impl"


    // $ANTLR start "rule__GoalSpecification__Group__3"
    // InternalGoalDSL.g:599:1: rule__GoalSpecification__Group__3 : rule__GoalSpecification__Group__3__Impl rule__GoalSpecification__Group__4 ;
    public final void rule__GoalSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:603:1: ( rule__GoalSpecification__Group__3__Impl rule__GoalSpecification__Group__4 )
            // InternalGoalDSL.g:604:2: rule__GoalSpecification__Group__3__Impl rule__GoalSpecification__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__GoalSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoalSpecification__Group__4();

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
    // $ANTLR end "rule__GoalSpecification__Group__3"


    // $ANTLR start "rule__GoalSpecification__Group__3__Impl"
    // InternalGoalDSL.g:611:1: rule__GoalSpecification__Group__3__Impl : ( ( rule__GoalSpecification__RootAssignment_3 ) ) ;
    public final void rule__GoalSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:615:1: ( ( ( rule__GoalSpecification__RootAssignment_3 ) ) )
            // InternalGoalDSL.g:616:1: ( ( rule__GoalSpecification__RootAssignment_3 ) )
            {
            // InternalGoalDSL.g:616:1: ( ( rule__GoalSpecification__RootAssignment_3 ) )
            // InternalGoalDSL.g:617:2: ( rule__GoalSpecification__RootAssignment_3 )
            {
             before(grammarAccess.getGoalSpecificationAccess().getRootAssignment_3()); 
            // InternalGoalDSL.g:618:2: ( rule__GoalSpecification__RootAssignment_3 )
            // InternalGoalDSL.g:618:3: rule__GoalSpecification__RootAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GoalSpecification__RootAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGoalSpecificationAccess().getRootAssignment_3()); 

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
    // $ANTLR end "rule__GoalSpecification__Group__3__Impl"


    // $ANTLR start "rule__GoalSpecification__Group__4"
    // InternalGoalDSL.g:626:1: rule__GoalSpecification__Group__4 : rule__GoalSpecification__Group__4__Impl ;
    public final void rule__GoalSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:630:1: ( rule__GoalSpecification__Group__4__Impl )
            // InternalGoalDSL.g:631:2: rule__GoalSpecification__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoalSpecification__Group__4__Impl();

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
    // $ANTLR end "rule__GoalSpecification__Group__4"


    // $ANTLR start "rule__GoalSpecification__Group__4__Impl"
    // InternalGoalDSL.g:637:1: rule__GoalSpecification__Group__4__Impl : ( '}' ) ;
    public final void rule__GoalSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:641:1: ( ( '}' ) )
            // InternalGoalDSL.g:642:1: ( '}' )
            {
            // InternalGoalDSL.g:642:1: ( '}' )
            // InternalGoalDSL.g:643:2: '}'
            {
             before(grammarAccess.getGoalSpecificationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGoalSpecificationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__GoalSpecification__Group__4__Impl"


    // $ANTLR start "rule__Root__Group__0"
    // InternalGoalDSL.g:653:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:657:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalGoalDSL.g:658:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalGoalDSL.g:665:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:669:1: ( ( () ) )
            // InternalGoalDSL.g:670:1: ( () )
            {
            // InternalGoalDSL.g:670:1: ( () )
            // InternalGoalDSL.g:671:2: ()
            {
             before(grammarAccess.getRootAccess().getRootAction_0()); 
            // InternalGoalDSL.g:672:2: ()
            // InternalGoalDSL.g:672:3: 
            {
            }

             after(grammarAccess.getRootAccess().getRootAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalGoalDSL.g:680:1: rule__Root__Group__1 : rule__Root__Group__1__Impl rule__Root__Group__2 ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:684:1: ( rule__Root__Group__1__Impl rule__Root__Group__2 )
            // InternalGoalDSL.g:685:2: rule__Root__Group__1__Impl rule__Root__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Root__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__2();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalGoalDSL.g:692:1: rule__Root__Group__1__Impl : ( ( rule__Root__ActorsAssignment_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:696:1: ( ( ( rule__Root__ActorsAssignment_1 )* ) )
            // InternalGoalDSL.g:697:1: ( ( rule__Root__ActorsAssignment_1 )* )
            {
            // InternalGoalDSL.g:697:1: ( ( rule__Root__ActorsAssignment_1 )* )
            // InternalGoalDSL.g:698:2: ( rule__Root__ActorsAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getActorsAssignment_1()); 
            // InternalGoalDSL.g:699:2: ( rule__Root__ActorsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGoalDSL.g:699:3: rule__Root__ActorsAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Root__ActorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getActorsAssignment_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Root__Group__2"
    // InternalGoalDSL.g:707:1: rule__Root__Group__2 : rule__Root__Group__2__Impl ;
    public final void rule__Root__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:711:1: ( rule__Root__Group__2__Impl )
            // InternalGoalDSL.g:712:2: rule__Root__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__2__Impl();

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
    // $ANTLR end "rule__Root__Group__2"


    // $ANTLR start "rule__Root__Group__2__Impl"
    // InternalGoalDSL.g:718:1: rule__Root__Group__2__Impl : ( ( rule__Root__DependenciesAssignment_2 )* ) ;
    public final void rule__Root__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:722:1: ( ( ( rule__Root__DependenciesAssignment_2 )* ) )
            // InternalGoalDSL.g:723:1: ( ( rule__Root__DependenciesAssignment_2 )* )
            {
            // InternalGoalDSL.g:723:1: ( ( rule__Root__DependenciesAssignment_2 )* )
            // InternalGoalDSL.g:724:2: ( rule__Root__DependenciesAssignment_2 )*
            {
             before(grammarAccess.getRootAccess().getDependenciesAssignment_2()); 
            // InternalGoalDSL.g:725:2: ( rule__Root__DependenciesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGoalDSL.g:725:3: rule__Root__DependenciesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Root__DependenciesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getDependenciesAssignment_2()); 

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
    // $ANTLR end "rule__Root__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalGoalDSL.g:734:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:738:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalGoalDSL.g:739:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

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
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalGoalDSL.g:746:1: rule__Actor__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:750:1: ( ( 'actor' ) )
            // InternalGoalDSL.g:751:1: ( 'actor' )
            {
            // InternalGoalDSL.g:751:1: ( 'actor' )
            // InternalGoalDSL.g:752:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

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
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalGoalDSL.g:761:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:765:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalGoalDSL.g:766:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

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
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalGoalDSL.g:773:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:777:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // InternalGoalDSL.g:778:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // InternalGoalDSL.g:778:1: ( ( rule__Actor__NameAssignment_1 ) )
            // InternalGoalDSL.g:779:2: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // InternalGoalDSL.g:780:2: ( rule__Actor__NameAssignment_1 )
            // InternalGoalDSL.g:780:3: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalGoalDSL.g:788:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:792:1: ( rule__Actor__Group__2__Impl )
            // InternalGoalDSL.g:793:2: rule__Actor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__2__Impl();

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
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalGoalDSL.g:799:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Alternatives_2 ) ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:803:1: ( ( ( rule__Actor__Alternatives_2 ) ) )
            // InternalGoalDSL.g:804:1: ( ( rule__Actor__Alternatives_2 ) )
            {
            // InternalGoalDSL.g:804:1: ( ( rule__Actor__Alternatives_2 ) )
            // InternalGoalDSL.g:805:2: ( rule__Actor__Alternatives_2 )
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // InternalGoalDSL.g:806:2: ( rule__Actor__Alternatives_2 )
            // InternalGoalDSL.g:806:3: rule__Actor__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__0"
    // InternalGoalDSL.g:815:1: rule__Actor__Group_2_1__0 : rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 ;
    public final void rule__Actor__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:819:1: ( rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1 )
            // InternalGoalDSL.g:820:2: rule__Actor__Group_2_1__0__Impl rule__Actor__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__1();

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
    // $ANTLR end "rule__Actor__Group_2_1__0"


    // $ANTLR start "rule__Actor__Group_2_1__0__Impl"
    // InternalGoalDSL.g:827:1: rule__Actor__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Actor__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:831:1: ( ( '{' ) )
            // InternalGoalDSL.g:832:1: ( '{' )
            {
            // InternalGoalDSL.g:832:1: ( '{' )
            // InternalGoalDSL.g:833:2: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Actor__Group_2_1__0__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__1"
    // InternalGoalDSL.g:842:1: rule__Actor__Group_2_1__1 : rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 ;
    public final void rule__Actor__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:846:1: ( rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2 )
            // InternalGoalDSL.g:847:2: rule__Actor__Group_2_1__1__Impl rule__Actor__Group_2_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__2();

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
    // $ANTLR end "rule__Actor__Group_2_1__1"


    // $ANTLR start "rule__Actor__Group_2_1__1__Impl"
    // InternalGoalDSL.g:854:1: rule__Actor__Group_2_1__1__Impl : ( ( rule__Actor__IntentionalElementsAssignment_2_1_1 )* ) ;
    public final void rule__Actor__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:858:1: ( ( ( rule__Actor__IntentionalElementsAssignment_2_1_1 )* ) )
            // InternalGoalDSL.g:859:1: ( ( rule__Actor__IntentionalElementsAssignment_2_1_1 )* )
            {
            // InternalGoalDSL.g:859:1: ( ( rule__Actor__IntentionalElementsAssignment_2_1_1 )* )
            // InternalGoalDSL.g:860:2: ( rule__Actor__IntentionalElementsAssignment_2_1_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionalElementsAssignment_2_1_1()); 
            // InternalGoalDSL.g:861:2: ( rule__Actor__IntentionalElementsAssignment_2_1_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18||(LA10_0>=25 && LA10_0<=26)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGoalDSL.g:861:3: rule__Actor__IntentionalElementsAssignment_2_1_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Actor__IntentionalElementsAssignment_2_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getIntentionalElementsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Actor__Group_2_1__1__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__2"
    // InternalGoalDSL.g:869:1: rule__Actor__Group_2_1__2 : rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3 ;
    public final void rule__Actor__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:873:1: ( rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3 )
            // InternalGoalDSL.g:874:2: rule__Actor__Group_2_1__2__Impl rule__Actor__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
            rule__Actor__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__3();

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
    // $ANTLR end "rule__Actor__Group_2_1__2"


    // $ANTLR start "rule__Actor__Group_2_1__2__Impl"
    // InternalGoalDSL.g:881:1: rule__Actor__Group_2_1__2__Impl : ( ( rule__Actor__ContributionAssignment_2_1_2 )* ) ;
    public final void rule__Actor__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:885:1: ( ( ( rule__Actor__ContributionAssignment_2_1_2 )* ) )
            // InternalGoalDSL.g:886:1: ( ( rule__Actor__ContributionAssignment_2_1_2 )* )
            {
            // InternalGoalDSL.g:886:1: ( ( rule__Actor__ContributionAssignment_2_1_2 )* )
            // InternalGoalDSL.g:887:2: ( rule__Actor__ContributionAssignment_2_1_2 )*
            {
             before(grammarAccess.getActorAccess().getContributionAssignment_2_1_2()); 
            // InternalGoalDSL.g:888:2: ( rule__Actor__ContributionAssignment_2_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGoalDSL.g:888:3: rule__Actor__ContributionAssignment_2_1_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Actor__ContributionAssignment_2_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getContributionAssignment_2_1_2()); 

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
    // $ANTLR end "rule__Actor__Group_2_1__2__Impl"


    // $ANTLR start "rule__Actor__Group_2_1__3"
    // InternalGoalDSL.g:896:1: rule__Actor__Group_2_1__3 : rule__Actor__Group_2_1__3__Impl ;
    public final void rule__Actor__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:900:1: ( rule__Actor__Group_2_1__3__Impl )
            // InternalGoalDSL.g:901:2: rule__Actor__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__Actor__Group_2_1__3"


    // $ANTLR start "rule__Actor__Group_2_1__3__Impl"
    // InternalGoalDSL.g:907:1: rule__Actor__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__Actor__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:911:1: ( ( '}' ) )
            // InternalGoalDSL.g:912:1: ( '}' )
            {
            // InternalGoalDSL.g:912:1: ( '}' )
            // InternalGoalDSL.g:913:2: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_2_1_3()); 

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
    // $ANTLR end "rule__Actor__Group_2_1__3__Impl"


    // $ANTLR start "rule__Goal__Group__0"
    // InternalGoalDSL.g:923:1: rule__Goal__Group__0 : rule__Goal__Group__0__Impl rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:927:1: ( rule__Goal__Group__0__Impl rule__Goal__Group__1 )
            // InternalGoalDSL.g:928:2: rule__Goal__Group__0__Impl rule__Goal__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Goal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__1();

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
    // $ANTLR end "rule__Goal__Group__0"


    // $ANTLR start "rule__Goal__Group__0__Impl"
    // InternalGoalDSL.g:935:1: rule__Goal__Group__0__Impl : ( 'goal' ) ;
    public final void rule__Goal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:939:1: ( ( 'goal' ) )
            // InternalGoalDSL.g:940:1: ( 'goal' )
            {
            // InternalGoalDSL.g:940:1: ( 'goal' )
            // InternalGoalDSL.g:941:2: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

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
    // $ANTLR end "rule__Goal__Group__0__Impl"


    // $ANTLR start "rule__Goal__Group__1"
    // InternalGoalDSL.g:950:1: rule__Goal__Group__1 : rule__Goal__Group__1__Impl rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:954:1: ( rule__Goal__Group__1__Impl rule__Goal__Group__2 )
            // InternalGoalDSL.g:955:2: rule__Goal__Group__1__Impl rule__Goal__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Goal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group__2();

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
    // $ANTLR end "rule__Goal__Group__1"


    // $ANTLR start "rule__Goal__Group__1__Impl"
    // InternalGoalDSL.g:962:1: rule__Goal__Group__1__Impl : ( ( rule__Goal__NameAssignment_1 ) ) ;
    public final void rule__Goal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:966:1: ( ( ( rule__Goal__NameAssignment_1 ) ) )
            // InternalGoalDSL.g:967:1: ( ( rule__Goal__NameAssignment_1 ) )
            {
            // InternalGoalDSL.g:967:1: ( ( rule__Goal__NameAssignment_1 ) )
            // InternalGoalDSL.g:968:2: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // InternalGoalDSL.g:969:2: ( rule__Goal__NameAssignment_1 )
            // InternalGoalDSL.g:969:3: rule__Goal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Goal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Goal__Group__1__Impl"


    // $ANTLR start "rule__Goal__Group__2"
    // InternalGoalDSL.g:977:1: rule__Goal__Group__2 : rule__Goal__Group__2__Impl ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:981:1: ( rule__Goal__Group__2__Impl )
            // InternalGoalDSL.g:982:2: rule__Goal__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group__2__Impl();

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
    // $ANTLR end "rule__Goal__Group__2"


    // $ANTLR start "rule__Goal__Group__2__Impl"
    // InternalGoalDSL.g:988:1: rule__Goal__Group__2__Impl : ( ( rule__Goal__Alternatives_2 ) ) ;
    public final void rule__Goal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:992:1: ( ( ( rule__Goal__Alternatives_2 ) ) )
            // InternalGoalDSL.g:993:1: ( ( rule__Goal__Alternatives_2 ) )
            {
            // InternalGoalDSL.g:993:1: ( ( rule__Goal__Alternatives_2 ) )
            // InternalGoalDSL.g:994:2: ( rule__Goal__Alternatives_2 )
            {
             before(grammarAccess.getGoalAccess().getAlternatives_2()); 
            // InternalGoalDSL.g:995:2: ( rule__Goal__Alternatives_2 )
            // InternalGoalDSL.g:995:3: rule__Goal__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Goal__Group__2__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__0"
    // InternalGoalDSL.g:1004:1: rule__Goal__Group_2_1__0 : rule__Goal__Group_2_1__0__Impl rule__Goal__Group_2_1__1 ;
    public final void rule__Goal__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1008:1: ( rule__Goal__Group_2_1__0__Impl rule__Goal__Group_2_1__1 )
            // InternalGoalDSL.g:1009:2: rule__Goal__Group_2_1__0__Impl rule__Goal__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Goal__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__1();

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
    // $ANTLR end "rule__Goal__Group_2_1__0"


    // $ANTLR start "rule__Goal__Group_2_1__0__Impl"
    // InternalGoalDSL.g:1016:1: rule__Goal__Group_2_1__0__Impl : ( 'decomposesTo' ) ;
    public final void rule__Goal__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1020:1: ( ( 'decomposesTo' ) )
            // InternalGoalDSL.g:1021:1: ( 'decomposesTo' )
            {
            // InternalGoalDSL.g:1021:1: ( 'decomposesTo' )
            // InternalGoalDSL.g:1022:2: 'decomposesTo'
            {
             before(grammarAccess.getGoalAccess().getDecomposesToKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getDecomposesToKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__0__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__1"
    // InternalGoalDSL.g:1031:1: rule__Goal__Group_2_1__1 : rule__Goal__Group_2_1__1__Impl rule__Goal__Group_2_1__2 ;
    public final void rule__Goal__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1035:1: ( rule__Goal__Group_2_1__1__Impl rule__Goal__Group_2_1__2 )
            // InternalGoalDSL.g:1036:2: rule__Goal__Group_2_1__1__Impl rule__Goal__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Goal__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__2();

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
    // $ANTLR end "rule__Goal__Group_2_1__1"


    // $ANTLR start "rule__Goal__Group_2_1__1__Impl"
    // InternalGoalDSL.g:1043:1: rule__Goal__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__Goal__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1047:1: ( ( '(' ) )
            // InternalGoalDSL.g:1048:1: ( '(' )
            {
            // InternalGoalDSL.g:1048:1: ( '(' )
            // InternalGoalDSL.g:1049:2: '('
            {
             before(grammarAccess.getGoalAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__1__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__2"
    // InternalGoalDSL.g:1058:1: rule__Goal__Group_2_1__2 : rule__Goal__Group_2_1__2__Impl rule__Goal__Group_2_1__3 ;
    public final void rule__Goal__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1062:1: ( rule__Goal__Group_2_1__2__Impl rule__Goal__Group_2_1__3 )
            // InternalGoalDSL.g:1063:2: rule__Goal__Group_2_1__2__Impl rule__Goal__Group_2_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Goal__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__3();

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
    // $ANTLR end "rule__Goal__Group_2_1__2"


    // $ANTLR start "rule__Goal__Group_2_1__2__Impl"
    // InternalGoalDSL.g:1070:1: rule__Goal__Group_2_1__2__Impl : ( ( rule__Goal__DecompositionTypeAssignment_2_1_2 ) ) ;
    public final void rule__Goal__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1074:1: ( ( ( rule__Goal__DecompositionTypeAssignment_2_1_2 ) ) )
            // InternalGoalDSL.g:1075:1: ( ( rule__Goal__DecompositionTypeAssignment_2_1_2 ) )
            {
            // InternalGoalDSL.g:1075:1: ( ( rule__Goal__DecompositionTypeAssignment_2_1_2 ) )
            // InternalGoalDSL.g:1076:2: ( rule__Goal__DecompositionTypeAssignment_2_1_2 )
            {
             before(grammarAccess.getGoalAccess().getDecompositionTypeAssignment_2_1_2()); 
            // InternalGoalDSL.g:1077:2: ( rule__Goal__DecompositionTypeAssignment_2_1_2 )
            // InternalGoalDSL.g:1077:3: rule__Goal__DecompositionTypeAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Goal__DecompositionTypeAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getGoalAccess().getDecompositionTypeAssignment_2_1_2()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__2__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__3"
    // InternalGoalDSL.g:1085:1: rule__Goal__Group_2_1__3 : rule__Goal__Group_2_1__3__Impl rule__Goal__Group_2_1__4 ;
    public final void rule__Goal__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1089:1: ( rule__Goal__Group_2_1__3__Impl rule__Goal__Group_2_1__4 )
            // InternalGoalDSL.g:1090:2: rule__Goal__Group_2_1__3__Impl rule__Goal__Group_2_1__4
            {
            pushFollow(FOLLOW_4);
            rule__Goal__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__4();

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
    // $ANTLR end "rule__Goal__Group_2_1__3"


    // $ANTLR start "rule__Goal__Group_2_1__3__Impl"
    // InternalGoalDSL.g:1097:1: rule__Goal__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__Goal__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1101:1: ( ( ')' ) )
            // InternalGoalDSL.g:1102:1: ( ')' )
            {
            // InternalGoalDSL.g:1102:1: ( ')' )
            // InternalGoalDSL.g:1103:2: ')'
            {
             before(grammarAccess.getGoalAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__3__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__4"
    // InternalGoalDSL.g:1112:1: rule__Goal__Group_2_1__4 : rule__Goal__Group_2_1__4__Impl rule__Goal__Group_2_1__5 ;
    public final void rule__Goal__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1116:1: ( rule__Goal__Group_2_1__4__Impl rule__Goal__Group_2_1__5 )
            // InternalGoalDSL.g:1117:2: rule__Goal__Group_2_1__4__Impl rule__Goal__Group_2_1__5
            {
            pushFollow(FOLLOW_17);
            rule__Goal__Group_2_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__5();

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
    // $ANTLR end "rule__Goal__Group_2_1__4"


    // $ANTLR start "rule__Goal__Group_2_1__4__Impl"
    // InternalGoalDSL.g:1124:1: rule__Goal__Group_2_1__4__Impl : ( '{' ) ;
    public final void rule__Goal__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1128:1: ( ( '{' ) )
            // InternalGoalDSL.g:1129:1: ( '{' )
            {
            // InternalGoalDSL.g:1129:1: ( '{' )
            // InternalGoalDSL.g:1130:2: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_1_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_1_4()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__4__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__5"
    // InternalGoalDSL.g:1139:1: rule__Goal__Group_2_1__5 : rule__Goal__Group_2_1__5__Impl rule__Goal__Group_2_1__6 ;
    public final void rule__Goal__Group_2_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1143:1: ( rule__Goal__Group_2_1__5__Impl rule__Goal__Group_2_1__6 )
            // InternalGoalDSL.g:1144:2: rule__Goal__Group_2_1__5__Impl rule__Goal__Group_2_1__6
            {
            pushFollow(FOLLOW_17);
            rule__Goal__Group_2_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__6();

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
    // $ANTLR end "rule__Goal__Group_2_1__5"


    // $ANTLR start "rule__Goal__Group_2_1__5__Impl"
    // InternalGoalDSL.g:1151:1: rule__Goal__Group_2_1__5__Impl : ( ( rule__Goal__ChilldrenAssignment_2_1_5 )* ) ;
    public final void rule__Goal__Group_2_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1155:1: ( ( ( rule__Goal__ChilldrenAssignment_2_1_5 )* ) )
            // InternalGoalDSL.g:1156:1: ( ( rule__Goal__ChilldrenAssignment_2_1_5 )* )
            {
            // InternalGoalDSL.g:1156:1: ( ( rule__Goal__ChilldrenAssignment_2_1_5 )* )
            // InternalGoalDSL.g:1157:2: ( rule__Goal__ChilldrenAssignment_2_1_5 )*
            {
             before(grammarAccess.getGoalAccess().getChilldrenAssignment_2_1_5()); 
            // InternalGoalDSL.g:1158:2: ( rule__Goal__ChilldrenAssignment_2_1_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalGoalDSL.g:1158:3: rule__Goal__ChilldrenAssignment_2_1_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Goal__ChilldrenAssignment_2_1_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getChilldrenAssignment_2_1_5()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__5__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__6"
    // InternalGoalDSL.g:1166:1: rule__Goal__Group_2_1__6 : rule__Goal__Group_2_1__6__Impl rule__Goal__Group_2_1__7 ;
    public final void rule__Goal__Group_2_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1170:1: ( rule__Goal__Group_2_1__6__Impl rule__Goal__Group_2_1__7 )
            // InternalGoalDSL.g:1171:2: rule__Goal__Group_2_1__6__Impl rule__Goal__Group_2_1__7
            {
            pushFollow(FOLLOW_19);
            rule__Goal__Group_2_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__7();

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
    // $ANTLR end "rule__Goal__Group_2_1__6"


    // $ANTLR start "rule__Goal__Group_2_1__6__Impl"
    // InternalGoalDSL.g:1178:1: rule__Goal__Group_2_1__6__Impl : ( '}' ) ;
    public final void rule__Goal__Group_2_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1182:1: ( ( '}' ) )
            // InternalGoalDSL.g:1183:1: ( '}' )
            {
            // InternalGoalDSL.g:1183:1: ( '}' )
            // InternalGoalDSL.g:1184:2: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_1_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_1_6()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__6__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__7"
    // InternalGoalDSL.g:1193:1: rule__Goal__Group_2_1__7 : rule__Goal__Group_2_1__7__Impl rule__Goal__Group_2_1__8 ;
    public final void rule__Goal__Group_2_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1197:1: ( rule__Goal__Group_2_1__7__Impl rule__Goal__Group_2_1__8 )
            // InternalGoalDSL.g:1198:2: rule__Goal__Group_2_1__7__Impl rule__Goal__Group_2_1__8
            {
            pushFollow(FOLLOW_9);
            rule__Goal__Group_2_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__8();

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
    // $ANTLR end "rule__Goal__Group_2_1__7"


    // $ANTLR start "rule__Goal__Group_2_1__7__Impl"
    // InternalGoalDSL.g:1205:1: rule__Goal__Group_2_1__7__Impl : ( ';' ) ;
    public final void rule__Goal__Group_2_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1209:1: ( ( ';' ) )
            // InternalGoalDSL.g:1210:1: ( ';' )
            {
            // InternalGoalDSL.g:1210:1: ( ';' )
            // InternalGoalDSL.g:1211:2: ';'
            {
             before(grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_7()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__7__Impl"


    // $ANTLR start "rule__Goal__Group_2_1__8"
    // InternalGoalDSL.g:1220:1: rule__Goal__Group_2_1__8 : rule__Goal__Group_2_1__8__Impl ;
    public final void rule__Goal__Group_2_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1224:1: ( rule__Goal__Group_2_1__8__Impl )
            // InternalGoalDSL.g:1225:2: rule__Goal__Group_2_1__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Goal__Group_2_1__8__Impl();

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
    // $ANTLR end "rule__Goal__Group_2_1__8"


    // $ANTLR start "rule__Goal__Group_2_1__8__Impl"
    // InternalGoalDSL.g:1231:1: rule__Goal__Group_2_1__8__Impl : ( ( rule__Goal__ParentAssignment_2_1_8 )? ) ;
    public final void rule__Goal__Group_2_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1235:1: ( ( ( rule__Goal__ParentAssignment_2_1_8 )? ) )
            // InternalGoalDSL.g:1236:1: ( ( rule__Goal__ParentAssignment_2_1_8 )? )
            {
            // InternalGoalDSL.g:1236:1: ( ( rule__Goal__ParentAssignment_2_1_8 )? )
            // InternalGoalDSL.g:1237:2: ( rule__Goal__ParentAssignment_2_1_8 )?
            {
             before(grammarAccess.getGoalAccess().getParentAssignment_2_1_8()); 
            // InternalGoalDSL.g:1238:2: ( rule__Goal__ParentAssignment_2_1_8 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==EOF||LA13_1==RULE_ID||LA13_1==18||LA13_1==20||(LA13_1>=25 && LA13_1<=26)) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalGoalDSL.g:1238:3: rule__Goal__ParentAssignment_2_1_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Goal__ParentAssignment_2_1_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalAccess().getParentAssignment_2_1_8()); 

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
    // $ANTLR end "rule__Goal__Group_2_1__8__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalGoalDSL.g:1247:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1251:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalGoalDSL.g:1252:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

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
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalGoalDSL.g:1259:1: rule__Task__Group__0__Impl : ( 'task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1263:1: ( ( 'task' ) )
            // InternalGoalDSL.g:1264:1: ( 'task' )
            {
            // InternalGoalDSL.g:1264:1: ( 'task' )
            // InternalGoalDSL.g:1265:2: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

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
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalGoalDSL.g:1274:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1278:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalGoalDSL.g:1279:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

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
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalGoalDSL.g:1286:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1290:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalGoalDSL.g:1291:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalGoalDSL.g:1291:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalGoalDSL.g:1292:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalGoalDSL.g:1293:2: ( rule__Task__NameAssignment_1 )
            // InternalGoalDSL.g:1293:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalGoalDSL.g:1301:1: rule__Task__Group__2 : rule__Task__Group__2__Impl ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1305:1: ( rule__Task__Group__2__Impl )
            // InternalGoalDSL.g:1306:2: rule__Task__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__2__Impl();

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
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalGoalDSL.g:1312:1: rule__Task__Group__2__Impl : ( ( rule__Task__Alternatives_2 ) ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1316:1: ( ( ( rule__Task__Alternatives_2 ) ) )
            // InternalGoalDSL.g:1317:1: ( ( rule__Task__Alternatives_2 ) )
            {
            // InternalGoalDSL.g:1317:1: ( ( rule__Task__Alternatives_2 ) )
            // InternalGoalDSL.g:1318:2: ( rule__Task__Alternatives_2 )
            {
             before(grammarAccess.getTaskAccess().getAlternatives_2()); 
            // InternalGoalDSL.g:1319:2: ( rule__Task__Alternatives_2 )
            // InternalGoalDSL.g:1319:3: rule__Task__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group_2_1__0"
    // InternalGoalDSL.g:1328:1: rule__Task__Group_2_1__0 : rule__Task__Group_2_1__0__Impl rule__Task__Group_2_1__1 ;
    public final void rule__Task__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1332:1: ( rule__Task__Group_2_1__0__Impl rule__Task__Group_2_1__1 )
            // InternalGoalDSL.g:1333:2: rule__Task__Group_2_1__0__Impl rule__Task__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__1();

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
    // $ANTLR end "rule__Task__Group_2_1__0"


    // $ANTLR start "rule__Task__Group_2_1__0__Impl"
    // InternalGoalDSL.g:1340:1: rule__Task__Group_2_1__0__Impl : ( 'decomposesTo' ) ;
    public final void rule__Task__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1344:1: ( ( 'decomposesTo' ) )
            // InternalGoalDSL.g:1345:1: ( 'decomposesTo' )
            {
            // InternalGoalDSL.g:1345:1: ( 'decomposesTo' )
            // InternalGoalDSL.g:1346:2: 'decomposesTo'
            {
             before(grammarAccess.getTaskAccess().getDecomposesToKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDecomposesToKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Task__Group_2_1__0__Impl"


    // $ANTLR start "rule__Task__Group_2_1__1"
    // InternalGoalDSL.g:1355:1: rule__Task__Group_2_1__1 : rule__Task__Group_2_1__1__Impl rule__Task__Group_2_1__2 ;
    public final void rule__Task__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1359:1: ( rule__Task__Group_2_1__1__Impl rule__Task__Group_2_1__2 )
            // InternalGoalDSL.g:1360:2: rule__Task__Group_2_1__1__Impl rule__Task__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Task__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__2();

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
    // $ANTLR end "rule__Task__Group_2_1__1"


    // $ANTLR start "rule__Task__Group_2_1__1__Impl"
    // InternalGoalDSL.g:1367:1: rule__Task__Group_2_1__1__Impl : ( '(' ) ;
    public final void rule__Task__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1371:1: ( ( '(' ) )
            // InternalGoalDSL.g:1372:1: ( '(' )
            {
            // InternalGoalDSL.g:1372:1: ( '(' )
            // InternalGoalDSL.g:1373:2: '('
            {
             before(grammarAccess.getTaskAccess().getLeftParenthesisKeyword_2_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftParenthesisKeyword_2_1_1()); 

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
    // $ANTLR end "rule__Task__Group_2_1__1__Impl"


    // $ANTLR start "rule__Task__Group_2_1__2"
    // InternalGoalDSL.g:1382:1: rule__Task__Group_2_1__2 : rule__Task__Group_2_1__2__Impl rule__Task__Group_2_1__3 ;
    public final void rule__Task__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1386:1: ( rule__Task__Group_2_1__2__Impl rule__Task__Group_2_1__3 )
            // InternalGoalDSL.g:1387:2: rule__Task__Group_2_1__2__Impl rule__Task__Group_2_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Task__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__3();

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
    // $ANTLR end "rule__Task__Group_2_1__2"


    // $ANTLR start "rule__Task__Group_2_1__2__Impl"
    // InternalGoalDSL.g:1394:1: rule__Task__Group_2_1__2__Impl : ( ( rule__Task__DecompositionTypeAssignment_2_1_2 ) ) ;
    public final void rule__Task__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1398:1: ( ( ( rule__Task__DecompositionTypeAssignment_2_1_2 ) ) )
            // InternalGoalDSL.g:1399:1: ( ( rule__Task__DecompositionTypeAssignment_2_1_2 ) )
            {
            // InternalGoalDSL.g:1399:1: ( ( rule__Task__DecompositionTypeAssignment_2_1_2 ) )
            // InternalGoalDSL.g:1400:2: ( rule__Task__DecompositionTypeAssignment_2_1_2 )
            {
             before(grammarAccess.getTaskAccess().getDecompositionTypeAssignment_2_1_2()); 
            // InternalGoalDSL.g:1401:2: ( rule__Task__DecompositionTypeAssignment_2_1_2 )
            // InternalGoalDSL.g:1401:3: rule__Task__DecompositionTypeAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__DecompositionTypeAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDecompositionTypeAssignment_2_1_2()); 

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
    // $ANTLR end "rule__Task__Group_2_1__2__Impl"


    // $ANTLR start "rule__Task__Group_2_1__3"
    // InternalGoalDSL.g:1409:1: rule__Task__Group_2_1__3 : rule__Task__Group_2_1__3__Impl rule__Task__Group_2_1__4 ;
    public final void rule__Task__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1413:1: ( rule__Task__Group_2_1__3__Impl rule__Task__Group_2_1__4 )
            // InternalGoalDSL.g:1414:2: rule__Task__Group_2_1__3__Impl rule__Task__Group_2_1__4
            {
            pushFollow(FOLLOW_4);
            rule__Task__Group_2_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__4();

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
    // $ANTLR end "rule__Task__Group_2_1__3"


    // $ANTLR start "rule__Task__Group_2_1__3__Impl"
    // InternalGoalDSL.g:1421:1: rule__Task__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__Task__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1425:1: ( ( ')' ) )
            // InternalGoalDSL.g:1426:1: ( ')' )
            {
            // InternalGoalDSL.g:1426:1: ( ')' )
            // InternalGoalDSL.g:1427:2: ')'
            {
             before(grammarAccess.getTaskAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightParenthesisKeyword_2_1_3()); 

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
    // $ANTLR end "rule__Task__Group_2_1__3__Impl"


    // $ANTLR start "rule__Task__Group_2_1__4"
    // InternalGoalDSL.g:1436:1: rule__Task__Group_2_1__4 : rule__Task__Group_2_1__4__Impl rule__Task__Group_2_1__5 ;
    public final void rule__Task__Group_2_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1440:1: ( rule__Task__Group_2_1__4__Impl rule__Task__Group_2_1__5 )
            // InternalGoalDSL.g:1441:2: rule__Task__Group_2_1__4__Impl rule__Task__Group_2_1__5
            {
            pushFollow(FOLLOW_17);
            rule__Task__Group_2_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__5();

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
    // $ANTLR end "rule__Task__Group_2_1__4"


    // $ANTLR start "rule__Task__Group_2_1__4__Impl"
    // InternalGoalDSL.g:1448:1: rule__Task__Group_2_1__4__Impl : ( '{' ) ;
    public final void rule__Task__Group_2_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1452:1: ( ( '{' ) )
            // InternalGoalDSL.g:1453:1: ( '{' )
            {
            // InternalGoalDSL.g:1453:1: ( '{' )
            // InternalGoalDSL.g:1454:2: '{'
            {
             before(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2_1_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2_1_4()); 

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
    // $ANTLR end "rule__Task__Group_2_1__4__Impl"


    // $ANTLR start "rule__Task__Group_2_1__5"
    // InternalGoalDSL.g:1463:1: rule__Task__Group_2_1__5 : rule__Task__Group_2_1__5__Impl rule__Task__Group_2_1__6 ;
    public final void rule__Task__Group_2_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1467:1: ( rule__Task__Group_2_1__5__Impl rule__Task__Group_2_1__6 )
            // InternalGoalDSL.g:1468:2: rule__Task__Group_2_1__5__Impl rule__Task__Group_2_1__6
            {
            pushFollow(FOLLOW_17);
            rule__Task__Group_2_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__6();

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
    // $ANTLR end "rule__Task__Group_2_1__5"


    // $ANTLR start "rule__Task__Group_2_1__5__Impl"
    // InternalGoalDSL.g:1475:1: rule__Task__Group_2_1__5__Impl : ( ( rule__Task__ChilldrenAssignment_2_1_5 )* ) ;
    public final void rule__Task__Group_2_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1479:1: ( ( ( rule__Task__ChilldrenAssignment_2_1_5 )* ) )
            // InternalGoalDSL.g:1480:1: ( ( rule__Task__ChilldrenAssignment_2_1_5 )* )
            {
            // InternalGoalDSL.g:1480:1: ( ( rule__Task__ChilldrenAssignment_2_1_5 )* )
            // InternalGoalDSL.g:1481:2: ( rule__Task__ChilldrenAssignment_2_1_5 )*
            {
             before(grammarAccess.getTaskAccess().getChilldrenAssignment_2_1_5()); 
            // InternalGoalDSL.g:1482:2: ( rule__Task__ChilldrenAssignment_2_1_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18||LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGoalDSL.g:1482:3: rule__Task__ChilldrenAssignment_2_1_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Task__ChilldrenAssignment_2_1_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getChilldrenAssignment_2_1_5()); 

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
    // $ANTLR end "rule__Task__Group_2_1__5__Impl"


    // $ANTLR start "rule__Task__Group_2_1__6"
    // InternalGoalDSL.g:1490:1: rule__Task__Group_2_1__6 : rule__Task__Group_2_1__6__Impl rule__Task__Group_2_1__7 ;
    public final void rule__Task__Group_2_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1494:1: ( rule__Task__Group_2_1__6__Impl rule__Task__Group_2_1__7 )
            // InternalGoalDSL.g:1495:2: rule__Task__Group_2_1__6__Impl rule__Task__Group_2_1__7
            {
            pushFollow(FOLLOW_19);
            rule__Task__Group_2_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__7();

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
    // $ANTLR end "rule__Task__Group_2_1__6"


    // $ANTLR start "rule__Task__Group_2_1__6__Impl"
    // InternalGoalDSL.g:1502:1: rule__Task__Group_2_1__6__Impl : ( '}' ) ;
    public final void rule__Task__Group_2_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1506:1: ( ( '}' ) )
            // InternalGoalDSL.g:1507:1: ( '}' )
            {
            // InternalGoalDSL.g:1507:1: ( '}' )
            // InternalGoalDSL.g:1508:2: '}'
            {
             before(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_6()); 

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
    // $ANTLR end "rule__Task__Group_2_1__6__Impl"


    // $ANTLR start "rule__Task__Group_2_1__7"
    // InternalGoalDSL.g:1517:1: rule__Task__Group_2_1__7 : rule__Task__Group_2_1__7__Impl rule__Task__Group_2_1__8 ;
    public final void rule__Task__Group_2_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1521:1: ( rule__Task__Group_2_1__7__Impl rule__Task__Group_2_1__8 )
            // InternalGoalDSL.g:1522:2: rule__Task__Group_2_1__7__Impl rule__Task__Group_2_1__8
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group_2_1__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__8();

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
    // $ANTLR end "rule__Task__Group_2_1__7"


    // $ANTLR start "rule__Task__Group_2_1__7__Impl"
    // InternalGoalDSL.g:1529:1: rule__Task__Group_2_1__7__Impl : ( ';' ) ;
    public final void rule__Task__Group_2_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1533:1: ( ( ';' ) )
            // InternalGoalDSL.g:1534:1: ( ';' )
            {
            // InternalGoalDSL.g:1534:1: ( ';' )
            // InternalGoalDSL.g:1535:2: ';'
            {
             before(grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_7()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_7()); 

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
    // $ANTLR end "rule__Task__Group_2_1__7__Impl"


    // $ANTLR start "rule__Task__Group_2_1__8"
    // InternalGoalDSL.g:1544:1: rule__Task__Group_2_1__8 : rule__Task__Group_2_1__8__Impl ;
    public final void rule__Task__Group_2_1__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1548:1: ( rule__Task__Group_2_1__8__Impl )
            // InternalGoalDSL.g:1549:2: rule__Task__Group_2_1__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_2_1__8__Impl();

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
    // $ANTLR end "rule__Task__Group_2_1__8"


    // $ANTLR start "rule__Task__Group_2_1__8__Impl"
    // InternalGoalDSL.g:1555:1: rule__Task__Group_2_1__8__Impl : ( ( rule__Task__ParentAssignment_2_1_8 )? ) ;
    public final void rule__Task__Group_2_1__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1559:1: ( ( ( rule__Task__ParentAssignment_2_1_8 )? ) )
            // InternalGoalDSL.g:1560:1: ( ( rule__Task__ParentAssignment_2_1_8 )? )
            {
            // InternalGoalDSL.g:1560:1: ( ( rule__Task__ParentAssignment_2_1_8 )? )
            // InternalGoalDSL.g:1561:2: ( rule__Task__ParentAssignment_2_1_8 )?
            {
             before(grammarAccess.getTaskAccess().getParentAssignment_2_1_8()); 
            // InternalGoalDSL.g:1562:2: ( rule__Task__ParentAssignment_2_1_8 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||LA15_1==RULE_ID||LA15_1==18||LA15_1==20||(LA15_1>=25 && LA15_1<=26)) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalGoalDSL.g:1562:3: rule__Task__ParentAssignment_2_1_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__ParentAssignment_2_1_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getParentAssignment_2_1_8()); 

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
    // $ANTLR end "rule__Task__Group_2_1__8__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalGoalDSL.g:1571:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1575:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalGoalDSL.g:1576:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalGoalDSL.g:1583:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1587:1: ( ( 'resource' ) )
            // InternalGoalDSL.g:1588:1: ( 'resource' )
            {
            // InternalGoalDSL.g:1588:1: ( 'resource' )
            // InternalGoalDSL.g:1589:2: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalGoalDSL.g:1598:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1602:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalGoalDSL.g:1603:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalGoalDSL.g:1610:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1614:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // InternalGoalDSL.g:1615:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // InternalGoalDSL.g:1615:1: ( ( rule__Resource__NameAssignment_1 ) )
            // InternalGoalDSL.g:1616:2: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // InternalGoalDSL.g:1617:2: ( rule__Resource__NameAssignment_1 )
            // InternalGoalDSL.g:1617:3: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalGoalDSL.g:1625:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1629:1: ( rule__Resource__Group__2__Impl )
            // InternalGoalDSL.g:1630:2: rule__Resource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__2__Impl();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalGoalDSL.g:1636:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__Group_2__0 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1640:1: ( ( ( rule__Resource__Group_2__0 ) ) )
            // InternalGoalDSL.g:1641:1: ( ( rule__Resource__Group_2__0 ) )
            {
            // InternalGoalDSL.g:1641:1: ( ( rule__Resource__Group_2__0 ) )
            // InternalGoalDSL.g:1642:2: ( rule__Resource__Group_2__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup_2()); 
            // InternalGoalDSL.g:1643:2: ( rule__Resource__Group_2__0 )
            // InternalGoalDSL.g:1643:3: rule__Resource__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group_2__0"
    // InternalGoalDSL.g:1652:1: rule__Resource__Group_2__0 : rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1 ;
    public final void rule__Resource__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1656:1: ( rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1 )
            // InternalGoalDSL.g:1657:2: rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Resource__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__1();

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
    // $ANTLR end "rule__Resource__Group_2__0"


    // $ANTLR start "rule__Resource__Group_2__0__Impl"
    // InternalGoalDSL.g:1664:1: rule__Resource__Group_2__0__Impl : ( 'neededBy' ) ;
    public final void rule__Resource__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1668:1: ( ( 'neededBy' ) )
            // InternalGoalDSL.g:1669:1: ( 'neededBy' )
            {
            // InternalGoalDSL.g:1669:1: ( 'neededBy' )
            // InternalGoalDSL.g:1670:2: 'neededBy'
            {
             before(grammarAccess.getResourceAccess().getNeededByKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNeededByKeyword_2_0()); 

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
    // $ANTLR end "rule__Resource__Group_2__0__Impl"


    // $ANTLR start "rule__Resource__Group_2__1"
    // InternalGoalDSL.g:1679:1: rule__Resource__Group_2__1 : rule__Resource__Group_2__1__Impl rule__Resource__Group_2__2 ;
    public final void rule__Resource__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1683:1: ( rule__Resource__Group_2__1__Impl rule__Resource__Group_2__2 )
            // InternalGoalDSL.g:1684:2: rule__Resource__Group_2__1__Impl rule__Resource__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__Resource__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__2();

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
    // $ANTLR end "rule__Resource__Group_2__1"


    // $ANTLR start "rule__Resource__Group_2__1__Impl"
    // InternalGoalDSL.g:1691:1: rule__Resource__Group_2__1__Impl : ( ( rule__Resource__DestAssignment_2_1 ) ) ;
    public final void rule__Resource__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1695:1: ( ( ( rule__Resource__DestAssignment_2_1 ) ) )
            // InternalGoalDSL.g:1696:1: ( ( rule__Resource__DestAssignment_2_1 ) )
            {
            // InternalGoalDSL.g:1696:1: ( ( rule__Resource__DestAssignment_2_1 ) )
            // InternalGoalDSL.g:1697:2: ( rule__Resource__DestAssignment_2_1 )
            {
             before(grammarAccess.getResourceAccess().getDestAssignment_2_1()); 
            // InternalGoalDSL.g:1698:2: ( rule__Resource__DestAssignment_2_1 )
            // InternalGoalDSL.g:1698:3: rule__Resource__DestAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__DestAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getDestAssignment_2_1()); 

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
    // $ANTLR end "rule__Resource__Group_2__1__Impl"


    // $ANTLR start "rule__Resource__Group_2__2"
    // InternalGoalDSL.g:1706:1: rule__Resource__Group_2__2 : rule__Resource__Group_2__2__Impl ;
    public final void rule__Resource__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1710:1: ( rule__Resource__Group_2__2__Impl )
            // InternalGoalDSL.g:1711:2: rule__Resource__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_2__2__Impl();

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
    // $ANTLR end "rule__Resource__Group_2__2"


    // $ANTLR start "rule__Resource__Group_2__2__Impl"
    // InternalGoalDSL.g:1717:1: rule__Resource__Group_2__2__Impl : ( ( rule__Resource__Group_2_2__0 )* ) ;
    public final void rule__Resource__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1721:1: ( ( ( rule__Resource__Group_2_2__0 )* ) )
            // InternalGoalDSL.g:1722:1: ( ( rule__Resource__Group_2_2__0 )* )
            {
            // InternalGoalDSL.g:1722:1: ( ( rule__Resource__Group_2_2__0 )* )
            // InternalGoalDSL.g:1723:2: ( rule__Resource__Group_2_2__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_2_2()); 
            // InternalGoalDSL.g:1724:2: ( rule__Resource__Group_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGoalDSL.g:1724:3: rule__Resource__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Resource__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Resource__Group_2__2__Impl"


    // $ANTLR start "rule__Resource__Group_2_2__0"
    // InternalGoalDSL.g:1733:1: rule__Resource__Group_2_2__0 : rule__Resource__Group_2_2__0__Impl rule__Resource__Group_2_2__1 ;
    public final void rule__Resource__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1737:1: ( rule__Resource__Group_2_2__0__Impl rule__Resource__Group_2_2__1 )
            // InternalGoalDSL.g:1738:2: rule__Resource__Group_2_2__0__Impl rule__Resource__Group_2_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Resource__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_2_2__1();

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
    // $ANTLR end "rule__Resource__Group_2_2__0"


    // $ANTLR start "rule__Resource__Group_2_2__0__Impl"
    // InternalGoalDSL.g:1745:1: rule__Resource__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1749:1: ( ( ',' ) )
            // InternalGoalDSL.g:1750:1: ( ',' )
            {
            // InternalGoalDSL.g:1750:1: ( ',' )
            // InternalGoalDSL.g:1751:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_2_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Resource__Group_2_2__0__Impl"


    // $ANTLR start "rule__Resource__Group_2_2__1"
    // InternalGoalDSL.g:1760:1: rule__Resource__Group_2_2__1 : rule__Resource__Group_2_2__1__Impl ;
    public final void rule__Resource__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1764:1: ( rule__Resource__Group_2_2__1__Impl )
            // InternalGoalDSL.g:1765:2: rule__Resource__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_2_2__1"


    // $ANTLR start "rule__Resource__Group_2_2__1__Impl"
    // InternalGoalDSL.g:1771:1: rule__Resource__Group_2_2__1__Impl : ( ( rule__Resource__DestAssignment_2_2_1 ) ) ;
    public final void rule__Resource__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1775:1: ( ( ( rule__Resource__DestAssignment_2_2_1 ) ) )
            // InternalGoalDSL.g:1776:1: ( ( rule__Resource__DestAssignment_2_2_1 ) )
            {
            // InternalGoalDSL.g:1776:1: ( ( rule__Resource__DestAssignment_2_2_1 ) )
            // InternalGoalDSL.g:1777:2: ( rule__Resource__DestAssignment_2_2_1 )
            {
             before(grammarAccess.getResourceAccess().getDestAssignment_2_2_1()); 
            // InternalGoalDSL.g:1778:2: ( rule__Resource__DestAssignment_2_2_1 )
            // InternalGoalDSL.g:1778:3: rule__Resource__DestAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__DestAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getDestAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Resource__Group_2_2__1__Impl"


    // $ANTLR start "rule__Contribution__Group__0"
    // InternalGoalDSL.g:1787:1: rule__Contribution__Group__0 : rule__Contribution__Group__0__Impl rule__Contribution__Group__1 ;
    public final void rule__Contribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1791:1: ( rule__Contribution__Group__0__Impl rule__Contribution__Group__1 )
            // InternalGoalDSL.g:1792:2: rule__Contribution__Group__0__Impl rule__Contribution__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Contribution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contribution__Group__1();

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
    // $ANTLR end "rule__Contribution__Group__0"


    // $ANTLR start "rule__Contribution__Group__0__Impl"
    // InternalGoalDSL.g:1799:1: rule__Contribution__Group__0__Impl : ( ( rule__Contribution__SrcAssignment_0 ) ) ;
    public final void rule__Contribution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1803:1: ( ( ( rule__Contribution__SrcAssignment_0 ) ) )
            // InternalGoalDSL.g:1804:1: ( ( rule__Contribution__SrcAssignment_0 ) )
            {
            // InternalGoalDSL.g:1804:1: ( ( rule__Contribution__SrcAssignment_0 ) )
            // InternalGoalDSL.g:1805:2: ( rule__Contribution__SrcAssignment_0 )
            {
             before(grammarAccess.getContributionAccess().getSrcAssignment_0()); 
            // InternalGoalDSL.g:1806:2: ( rule__Contribution__SrcAssignment_0 )
            // InternalGoalDSL.g:1806:3: rule__Contribution__SrcAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Contribution__SrcAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContributionAccess().getSrcAssignment_0()); 

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
    // $ANTLR end "rule__Contribution__Group__0__Impl"


    // $ANTLR start "rule__Contribution__Group__1"
    // InternalGoalDSL.g:1814:1: rule__Contribution__Group__1 : rule__Contribution__Group__1__Impl rule__Contribution__Group__2 ;
    public final void rule__Contribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1818:1: ( rule__Contribution__Group__1__Impl rule__Contribution__Group__2 )
            // InternalGoalDSL.g:1819:2: rule__Contribution__Group__1__Impl rule__Contribution__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Contribution__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contribution__Group__2();

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
    // $ANTLR end "rule__Contribution__Group__1"


    // $ANTLR start "rule__Contribution__Group__1__Impl"
    // InternalGoalDSL.g:1826:1: rule__Contribution__Group__1__Impl : ( 'contributesTo' ) ;
    public final void rule__Contribution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1830:1: ( ( 'contributesTo' ) )
            // InternalGoalDSL.g:1831:1: ( 'contributesTo' )
            {
            // InternalGoalDSL.g:1831:1: ( 'contributesTo' )
            // InternalGoalDSL.g:1832:2: 'contributesTo'
            {
             before(grammarAccess.getContributionAccess().getContributesToKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getContributionAccess().getContributesToKeyword_1()); 

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
    // $ANTLR end "rule__Contribution__Group__1__Impl"


    // $ANTLR start "rule__Contribution__Group__2"
    // InternalGoalDSL.g:1841:1: rule__Contribution__Group__2 : rule__Contribution__Group__2__Impl rule__Contribution__Group__3 ;
    public final void rule__Contribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1845:1: ( rule__Contribution__Group__2__Impl rule__Contribution__Group__3 )
            // InternalGoalDSL.g:1846:2: rule__Contribution__Group__2__Impl rule__Contribution__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Contribution__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contribution__Group__3();

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
    // $ANTLR end "rule__Contribution__Group__2"


    // $ANTLR start "rule__Contribution__Group__2__Impl"
    // InternalGoalDSL.g:1853:1: rule__Contribution__Group__2__Impl : ( '(' ) ;
    public final void rule__Contribution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1857:1: ( ( '(' ) )
            // InternalGoalDSL.g:1858:1: ( '(' )
            {
            // InternalGoalDSL.g:1858:1: ( '(' )
            // InternalGoalDSL.g:1859:2: '('
            {
             before(grammarAccess.getContributionAccess().getLeftParenthesisKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getContributionAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Contribution__Group__2__Impl"


    // $ANTLR start "rule__Contribution__Group__3"
    // InternalGoalDSL.g:1868:1: rule__Contribution__Group__3 : rule__Contribution__Group__3__Impl rule__Contribution__Group__4 ;
    public final void rule__Contribution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1872:1: ( rule__Contribution__Group__3__Impl rule__Contribution__Group__4 )
            // InternalGoalDSL.g:1873:2: rule__Contribution__Group__3__Impl rule__Contribution__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Contribution__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contribution__Group__4();

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
    // $ANTLR end "rule__Contribution__Group__3"


    // $ANTLR start "rule__Contribution__Group__3__Impl"
    // InternalGoalDSL.g:1880:1: rule__Contribution__Group__3__Impl : ( ( rule__Contribution__ContributionTypeAssignment_3 ) ) ;
    public final void rule__Contribution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1884:1: ( ( ( rule__Contribution__ContributionTypeAssignment_3 ) ) )
            // InternalGoalDSL.g:1885:1: ( ( rule__Contribution__ContributionTypeAssignment_3 ) )
            {
            // InternalGoalDSL.g:1885:1: ( ( rule__Contribution__ContributionTypeAssignment_3 ) )
            // InternalGoalDSL.g:1886:2: ( rule__Contribution__ContributionTypeAssignment_3 )
            {
             before(grammarAccess.getContributionAccess().getContributionTypeAssignment_3()); 
            // InternalGoalDSL.g:1887:2: ( rule__Contribution__ContributionTypeAssignment_3 )
            // InternalGoalDSL.g:1887:3: rule__Contribution__ContributionTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Contribution__ContributionTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContributionAccess().getContributionTypeAssignment_3()); 

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
    // $ANTLR end "rule__Contribution__Group__3__Impl"


    // $ANTLR start "rule__Contribution__Group__4"
    // InternalGoalDSL.g:1895:1: rule__Contribution__Group__4 : rule__Contribution__Group__4__Impl rule__Contribution__Group__5 ;
    public final void rule__Contribution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1899:1: ( rule__Contribution__Group__4__Impl rule__Contribution__Group__5 )
            // InternalGoalDSL.g:1900:2: rule__Contribution__Group__4__Impl rule__Contribution__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Contribution__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contribution__Group__5();

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
    // $ANTLR end "rule__Contribution__Group__4"


    // $ANTLR start "rule__Contribution__Group__4__Impl"
    // InternalGoalDSL.g:1907:1: rule__Contribution__Group__4__Impl : ( ')' ) ;
    public final void rule__Contribution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1911:1: ( ( ')' ) )
            // InternalGoalDSL.g:1912:1: ( ')' )
            {
            // InternalGoalDSL.g:1912:1: ( ')' )
            // InternalGoalDSL.g:1913:2: ')'
            {
             before(grammarAccess.getContributionAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContributionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Contribution__Group__4__Impl"


    // $ANTLR start "rule__Contribution__Group__5"
    // InternalGoalDSL.g:1922:1: rule__Contribution__Group__5 : rule__Contribution__Group__5__Impl rule__Contribution__Group__6 ;
    public final void rule__Contribution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1926:1: ( rule__Contribution__Group__5__Impl rule__Contribution__Group__6 )
            // InternalGoalDSL.g:1927:2: rule__Contribution__Group__5__Impl rule__Contribution__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Contribution__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contribution__Group__6();

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
    // $ANTLR end "rule__Contribution__Group__5"


    // $ANTLR start "rule__Contribution__Group__5__Impl"
    // InternalGoalDSL.g:1934:1: rule__Contribution__Group__5__Impl : ( ( rule__Contribution__DestAssignment_5 ) ) ;
    public final void rule__Contribution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1938:1: ( ( ( rule__Contribution__DestAssignment_5 ) ) )
            // InternalGoalDSL.g:1939:1: ( ( rule__Contribution__DestAssignment_5 ) )
            {
            // InternalGoalDSL.g:1939:1: ( ( rule__Contribution__DestAssignment_5 ) )
            // InternalGoalDSL.g:1940:2: ( rule__Contribution__DestAssignment_5 )
            {
             before(grammarAccess.getContributionAccess().getDestAssignment_5()); 
            // InternalGoalDSL.g:1941:2: ( rule__Contribution__DestAssignment_5 )
            // InternalGoalDSL.g:1941:3: rule__Contribution__DestAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Contribution__DestAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContributionAccess().getDestAssignment_5()); 

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
    // $ANTLR end "rule__Contribution__Group__5__Impl"


    // $ANTLR start "rule__Contribution__Group__6"
    // InternalGoalDSL.g:1949:1: rule__Contribution__Group__6 : rule__Contribution__Group__6__Impl ;
    public final void rule__Contribution__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1953:1: ( rule__Contribution__Group__6__Impl )
            // InternalGoalDSL.g:1954:2: rule__Contribution__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contribution__Group__6__Impl();

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
    // $ANTLR end "rule__Contribution__Group__6"


    // $ANTLR start "rule__Contribution__Group__6__Impl"
    // InternalGoalDSL.g:1960:1: rule__Contribution__Group__6__Impl : ( ( rule__Contribution__Group_6__0 )* ) ;
    public final void rule__Contribution__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1964:1: ( ( ( rule__Contribution__Group_6__0 )* ) )
            // InternalGoalDSL.g:1965:1: ( ( rule__Contribution__Group_6__0 )* )
            {
            // InternalGoalDSL.g:1965:1: ( ( rule__Contribution__Group_6__0 )* )
            // InternalGoalDSL.g:1966:2: ( rule__Contribution__Group_6__0 )*
            {
             before(grammarAccess.getContributionAccess().getGroup_6()); 
            // InternalGoalDSL.g:1967:2: ( rule__Contribution__Group_6__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGoalDSL.g:1967:3: rule__Contribution__Group_6__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Contribution__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getContributionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Contribution__Group__6__Impl"


    // $ANTLR start "rule__Contribution__Group_6__0"
    // InternalGoalDSL.g:1976:1: rule__Contribution__Group_6__0 : rule__Contribution__Group_6__0__Impl rule__Contribution__Group_6__1 ;
    public final void rule__Contribution__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1980:1: ( rule__Contribution__Group_6__0__Impl rule__Contribution__Group_6__1 )
            // InternalGoalDSL.g:1981:2: rule__Contribution__Group_6__0__Impl rule__Contribution__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Contribution__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contribution__Group_6__1();

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
    // $ANTLR end "rule__Contribution__Group_6__0"


    // $ANTLR start "rule__Contribution__Group_6__0__Impl"
    // InternalGoalDSL.g:1988:1: rule__Contribution__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Contribution__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:1992:1: ( ( ',' ) )
            // InternalGoalDSL.g:1993:1: ( ',' )
            {
            // InternalGoalDSL.g:1993:1: ( ',' )
            // InternalGoalDSL.g:1994:2: ','
            {
             before(grammarAccess.getContributionAccess().getCommaKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContributionAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Contribution__Group_6__0__Impl"


    // $ANTLR start "rule__Contribution__Group_6__1"
    // InternalGoalDSL.g:2003:1: rule__Contribution__Group_6__1 : rule__Contribution__Group_6__1__Impl ;
    public final void rule__Contribution__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2007:1: ( rule__Contribution__Group_6__1__Impl )
            // InternalGoalDSL.g:2008:2: rule__Contribution__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contribution__Group_6__1__Impl();

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
    // $ANTLR end "rule__Contribution__Group_6__1"


    // $ANTLR start "rule__Contribution__Group_6__1__Impl"
    // InternalGoalDSL.g:2014:1: rule__Contribution__Group_6__1__Impl : ( ( rule__Contribution__DestAssignment_6_1 ) ) ;
    public final void rule__Contribution__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2018:1: ( ( ( rule__Contribution__DestAssignment_6_1 ) ) )
            // InternalGoalDSL.g:2019:1: ( ( rule__Contribution__DestAssignment_6_1 ) )
            {
            // InternalGoalDSL.g:2019:1: ( ( rule__Contribution__DestAssignment_6_1 ) )
            // InternalGoalDSL.g:2020:2: ( rule__Contribution__DestAssignment_6_1 )
            {
             before(grammarAccess.getContributionAccess().getDestAssignment_6_1()); 
            // InternalGoalDSL.g:2021:2: ( rule__Contribution__DestAssignment_6_1 )
            // InternalGoalDSL.g:2021:3: rule__Contribution__DestAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Contribution__DestAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContributionAccess().getDestAssignment_6_1()); 

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
    // $ANTLR end "rule__Contribution__Group_6__1__Impl"


    // $ANTLR start "rule__Dependency__Group__0"
    // InternalGoalDSL.g:2030:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2034:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // InternalGoalDSL.g:2035:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__1();

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
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // InternalGoalDSL.g:2042:1: rule__Dependency__Group__0__Impl : ( ( rule__Dependency__SrcAssignment_0 ) ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2046:1: ( ( ( rule__Dependency__SrcAssignment_0 ) ) )
            // InternalGoalDSL.g:2047:1: ( ( rule__Dependency__SrcAssignment_0 ) )
            {
            // InternalGoalDSL.g:2047:1: ( ( rule__Dependency__SrcAssignment_0 ) )
            // InternalGoalDSL.g:2048:2: ( rule__Dependency__SrcAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getSrcAssignment_0()); 
            // InternalGoalDSL.g:2049:2: ( rule__Dependency__SrcAssignment_0 )
            // InternalGoalDSL.g:2049:3: rule__Dependency__SrcAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__SrcAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getSrcAssignment_0()); 

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
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // InternalGoalDSL.g:2057:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2061:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // InternalGoalDSL.g:2062:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__2();

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
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // InternalGoalDSL.g:2069:1: rule__Dependency__Group__1__Impl : ( 'dependsOn' ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2073:1: ( ( 'dependsOn' ) )
            // InternalGoalDSL.g:2074:1: ( 'dependsOn' )
            {
            // InternalGoalDSL.g:2074:1: ( 'dependsOn' )
            // InternalGoalDSL.g:2075:2: 'dependsOn'
            {
             before(grammarAccess.getDependencyAccess().getDependsOnKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getDependsOnKeyword_1()); 

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
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Dependency__Group__2"
    // InternalGoalDSL.g:2084:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl rule__Dependency__Group__3 ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2088:1: ( rule__Dependency__Group__2__Impl rule__Dependency__Group__3 )
            // InternalGoalDSL.g:2089:2: rule__Dependency__Group__2__Impl rule__Dependency__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Dependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group__3();

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
    // $ANTLR end "rule__Dependency__Group__2"


    // $ANTLR start "rule__Dependency__Group__2__Impl"
    // InternalGoalDSL.g:2096:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__DestAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2100:1: ( ( ( rule__Dependency__DestAssignment_2 ) ) )
            // InternalGoalDSL.g:2101:1: ( ( rule__Dependency__DestAssignment_2 ) )
            {
            // InternalGoalDSL.g:2101:1: ( ( rule__Dependency__DestAssignment_2 ) )
            // InternalGoalDSL.g:2102:2: ( rule__Dependency__DestAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDestAssignment_2()); 
            // InternalGoalDSL.g:2103:2: ( rule__Dependency__DestAssignment_2 )
            // InternalGoalDSL.g:2103:3: rule__Dependency__DestAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__DestAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDestAssignment_2()); 

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
    // $ANTLR end "rule__Dependency__Group__2__Impl"


    // $ANTLR start "rule__Dependency__Group__3"
    // InternalGoalDSL.g:2111:1: rule__Dependency__Group__3 : rule__Dependency__Group__3__Impl ;
    public final void rule__Dependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2115:1: ( rule__Dependency__Group__3__Impl )
            // InternalGoalDSL.g:2116:2: rule__Dependency__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group__3__Impl();

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
    // $ANTLR end "rule__Dependency__Group__3"


    // $ANTLR start "rule__Dependency__Group__3__Impl"
    // InternalGoalDSL.g:2122:1: rule__Dependency__Group__3__Impl : ( ( rule__Dependency__Group_3__0 )* ) ;
    public final void rule__Dependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2126:1: ( ( ( rule__Dependency__Group_3__0 )* ) )
            // InternalGoalDSL.g:2127:1: ( ( rule__Dependency__Group_3__0 )* )
            {
            // InternalGoalDSL.g:2127:1: ( ( rule__Dependency__Group_3__0 )* )
            // InternalGoalDSL.g:2128:2: ( rule__Dependency__Group_3__0 )*
            {
             before(grammarAccess.getDependencyAccess().getGroup_3()); 
            // InternalGoalDSL.g:2129:2: ( rule__Dependency__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGoalDSL.g:2129:3: rule__Dependency__Group_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Dependency__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDependencyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Dependency__Group__3__Impl"


    // $ANTLR start "rule__Dependency__Group_3__0"
    // InternalGoalDSL.g:2138:1: rule__Dependency__Group_3__0 : rule__Dependency__Group_3__0__Impl rule__Dependency__Group_3__1 ;
    public final void rule__Dependency__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2142:1: ( rule__Dependency__Group_3__0__Impl rule__Dependency__Group_3__1 )
            // InternalGoalDSL.g:2143:2: rule__Dependency__Group_3__0__Impl rule__Dependency__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Dependency__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dependency__Group_3__1();

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
    // $ANTLR end "rule__Dependency__Group_3__0"


    // $ANTLR start "rule__Dependency__Group_3__0__Impl"
    // InternalGoalDSL.g:2150:1: rule__Dependency__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Dependency__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2154:1: ( ( ',' ) )
            // InternalGoalDSL.g:2155:1: ( ',' )
            {
            // InternalGoalDSL.g:2155:1: ( ',' )
            // InternalGoalDSL.g:2156:2: ','
            {
             before(grammarAccess.getDependencyAccess().getCommaKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDependencyAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Dependency__Group_3__0__Impl"


    // $ANTLR start "rule__Dependency__Group_3__1"
    // InternalGoalDSL.g:2165:1: rule__Dependency__Group_3__1 : rule__Dependency__Group_3__1__Impl ;
    public final void rule__Dependency__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2169:1: ( rule__Dependency__Group_3__1__Impl )
            // InternalGoalDSL.g:2170:2: rule__Dependency__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Group_3__1__Impl();

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
    // $ANTLR end "rule__Dependency__Group_3__1"


    // $ANTLR start "rule__Dependency__Group_3__1__Impl"
    // InternalGoalDSL.g:2176:1: rule__Dependency__Group_3__1__Impl : ( ( rule__Dependency__DestAssignment_3_1 ) ) ;
    public final void rule__Dependency__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2180:1: ( ( ( rule__Dependency__DestAssignment_3_1 ) ) )
            // InternalGoalDSL.g:2181:1: ( ( rule__Dependency__DestAssignment_3_1 ) )
            {
            // InternalGoalDSL.g:2181:1: ( ( rule__Dependency__DestAssignment_3_1 ) )
            // InternalGoalDSL.g:2182:2: ( rule__Dependency__DestAssignment_3_1 )
            {
             before(grammarAccess.getDependencyAccess().getDestAssignment_3_1()); 
            // InternalGoalDSL.g:2183:2: ( rule__Dependency__DestAssignment_3_1 )
            // InternalGoalDSL.g:2183:3: rule__Dependency__DestAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__DestAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDestAssignment_3_1()); 

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
    // $ANTLR end "rule__Dependency__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalGoalDSL.g:2192:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2196:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalGoalDSL.g:2197:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalGoalDSL.g:2204:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2208:1: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2209:1: ( RULE_ID )
            {
            // InternalGoalDSL.g:2209:1: ( RULE_ID )
            // InternalGoalDSL.g:2210:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalGoalDSL.g:2219:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2223:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalGoalDSL.g:2224:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalGoalDSL.g:2230:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2234:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalGoalDSL.g:2235:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalGoalDSL.g:2235:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalGoalDSL.g:2236:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalGoalDSL.g:2237:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGoalDSL.g:2237:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalGoalDSL.g:2246:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2250:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalGoalDSL.g:2251:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalGoalDSL.g:2258:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2262:1: ( ( '.' ) )
            // InternalGoalDSL.g:2263:1: ( '.' )
            {
            // InternalGoalDSL.g:2263:1: ( '.' )
            // InternalGoalDSL.g:2264:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalGoalDSL.g:2273:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2277:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalGoalDSL.g:2278:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalGoalDSL.g:2284:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2288:1: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2289:1: ( RULE_ID )
            {
            // InternalGoalDSL.g:2289:1: ( RULE_ID )
            // InternalGoalDSL.g:2290:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__GoalSpecification__NameAssignment_1"
    // InternalGoalDSL.g:2300:1: rule__GoalSpecification__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__GoalSpecification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2304:1: ( ( RULE_STRING ) )
            // InternalGoalDSL.g:2305:2: ( RULE_STRING )
            {
            // InternalGoalDSL.g:2305:2: ( RULE_STRING )
            // InternalGoalDSL.g:2306:3: RULE_STRING
            {
             before(grammarAccess.getGoalSpecificationAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoalSpecificationAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GoalSpecification__NameAssignment_1"


    // $ANTLR start "rule__GoalSpecification__RootAssignment_3"
    // InternalGoalDSL.g:2315:1: rule__GoalSpecification__RootAssignment_3 : ( ruleRoot ) ;
    public final void rule__GoalSpecification__RootAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2319:1: ( ( ruleRoot ) )
            // InternalGoalDSL.g:2320:2: ( ruleRoot )
            {
            // InternalGoalDSL.g:2320:2: ( ruleRoot )
            // InternalGoalDSL.g:2321:3: ruleRoot
            {
             before(grammarAccess.getGoalSpecificationAccess().getRootRootParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getGoalSpecificationAccess().getRootRootParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GoalSpecification__RootAssignment_3"


    // $ANTLR start "rule__Root__ActorsAssignment_1"
    // InternalGoalDSL.g:2330:1: rule__Root__ActorsAssignment_1 : ( ruleActor ) ;
    public final void rule__Root__ActorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2334:1: ( ( ruleActor ) )
            // InternalGoalDSL.g:2335:2: ( ruleActor )
            {
            // InternalGoalDSL.g:2335:2: ( ruleActor )
            // InternalGoalDSL.g:2336:3: ruleActor
            {
             before(grammarAccess.getRootAccess().getActorsActorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getRootAccess().getActorsActorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Root__ActorsAssignment_1"


    // $ANTLR start "rule__Root__DependenciesAssignment_2"
    // InternalGoalDSL.g:2345:1: rule__Root__DependenciesAssignment_2 : ( ruleDependency ) ;
    public final void rule__Root__DependenciesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2349:1: ( ( ruleDependency ) )
            // InternalGoalDSL.g:2350:2: ( ruleDependency )
            {
            // InternalGoalDSL.g:2350:2: ( ruleDependency )
            // InternalGoalDSL.g:2351:3: ruleDependency
            {
             before(grammarAccess.getRootAccess().getDependenciesDependencyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getRootAccess().getDependenciesDependencyParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Root__DependenciesAssignment_2"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // InternalGoalDSL.g:2360:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2364:1: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2365:2: ( RULE_ID )
            {
            // InternalGoalDSL.g:2365:2: ( RULE_ID )
            // InternalGoalDSL.g:2366:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__IntentionalElementsAssignment_2_1_1"
    // InternalGoalDSL.g:2375:1: rule__Actor__IntentionalElementsAssignment_2_1_1 : ( ruleIntentionalElement ) ;
    public final void rule__Actor__IntentionalElementsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2379:1: ( ( ruleIntentionalElement ) )
            // InternalGoalDSL.g:2380:2: ( ruleIntentionalElement )
            {
            // InternalGoalDSL.g:2380:2: ( ruleIntentionalElement )
            // InternalGoalDSL.g:2381:3: ruleIntentionalElement
            {
             before(grammarAccess.getActorAccess().getIntentionalElementsIntentionalElementParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntentionalElement();

            state._fsp--;

             after(grammarAccess.getActorAccess().getIntentionalElementsIntentionalElementParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Actor__IntentionalElementsAssignment_2_1_1"


    // $ANTLR start "rule__Actor__ContributionAssignment_2_1_2"
    // InternalGoalDSL.g:2390:1: rule__Actor__ContributionAssignment_2_1_2 : ( ruleContribution ) ;
    public final void rule__Actor__ContributionAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2394:1: ( ( ruleContribution ) )
            // InternalGoalDSL.g:2395:2: ( ruleContribution )
            {
            // InternalGoalDSL.g:2395:2: ( ruleContribution )
            // InternalGoalDSL.g:2396:3: ruleContribution
            {
             before(grammarAccess.getActorAccess().getContributionContributionParserRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContribution();

            state._fsp--;

             after(grammarAccess.getActorAccess().getContributionContributionParserRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__Actor__ContributionAssignment_2_1_2"


    // $ANTLR start "rule__Goal__NameAssignment_1"
    // InternalGoalDSL.g:2405:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2409:1: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2410:2: ( RULE_ID )
            {
            // InternalGoalDSL.g:2410:2: ( RULE_ID )
            // InternalGoalDSL.g:2411:3: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Goal__NameAssignment_1"


    // $ANTLR start "rule__Goal__DecompositionTypeAssignment_2_1_2"
    // InternalGoalDSL.g:2420:1: rule__Goal__DecompositionTypeAssignment_2_1_2 : ( ruleDecompositionType ) ;
    public final void rule__Goal__DecompositionTypeAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2424:1: ( ( ruleDecompositionType ) )
            // InternalGoalDSL.g:2425:2: ( ruleDecompositionType )
            {
            // InternalGoalDSL.g:2425:2: ( ruleDecompositionType )
            // InternalGoalDSL.g:2426:3: ruleDecompositionType
            {
             before(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecompositionType();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__Goal__DecompositionTypeAssignment_2_1_2"


    // $ANTLR start "rule__Goal__ChilldrenAssignment_2_1_5"
    // InternalGoalDSL.g:2435:1: rule__Goal__ChilldrenAssignment_2_1_5 : ( ruleGoalTaskElement ) ;
    public final void rule__Goal__ChilldrenAssignment_2_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2439:1: ( ( ruleGoalTaskElement ) )
            // InternalGoalDSL.g:2440:2: ( ruleGoalTaskElement )
            {
            // InternalGoalDSL.g:2440:2: ( ruleGoalTaskElement )
            // InternalGoalDSL.g:2441:3: ruleGoalTaskElement
            {
             before(grammarAccess.getGoalAccess().getChilldrenGoalTaskElementParserRuleCall_2_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGoalTaskElement();

            state._fsp--;

             after(grammarAccess.getGoalAccess().getChilldrenGoalTaskElementParserRuleCall_2_1_5_0()); 

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
    // $ANTLR end "rule__Goal__ChilldrenAssignment_2_1_5"


    // $ANTLR start "rule__Goal__ParentAssignment_2_1_8"
    // InternalGoalDSL.g:2450:1: rule__Goal__ParentAssignment_2_1_8 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__ParentAssignment_2_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2454:1: ( ( ( RULE_ID ) ) )
            // InternalGoalDSL.g:2455:2: ( ( RULE_ID ) )
            {
            // InternalGoalDSL.g:2455:2: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2456:3: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getParentGoalTaskElementCrossReference_2_1_8_0()); 
            // InternalGoalDSL.g:2457:3: ( RULE_ID )
            // InternalGoalDSL.g:2458:4: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getParentGoalTaskElementIDTerminalRuleCall_2_1_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGoalAccess().getParentGoalTaskElementIDTerminalRuleCall_2_1_8_0_1()); 

            }

             after(grammarAccess.getGoalAccess().getParentGoalTaskElementCrossReference_2_1_8_0()); 

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
    // $ANTLR end "rule__Goal__ParentAssignment_2_1_8"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalGoalDSL.g:2469:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2473:1: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2474:2: ( RULE_ID )
            {
            // InternalGoalDSL.g:2474:2: ( RULE_ID )
            // InternalGoalDSL.g:2475:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__DecompositionTypeAssignment_2_1_2"
    // InternalGoalDSL.g:2484:1: rule__Task__DecompositionTypeAssignment_2_1_2 : ( ruleDecompositionType ) ;
    public final void rule__Task__DecompositionTypeAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2488:1: ( ( ruleDecompositionType ) )
            // InternalGoalDSL.g:2489:2: ( ruleDecompositionType )
            {
            // InternalGoalDSL.g:2489:2: ( ruleDecompositionType )
            // InternalGoalDSL.g:2490:3: ruleDecompositionType
            {
             before(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDecompositionType();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_2_0()); 

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
    // $ANTLR end "rule__Task__DecompositionTypeAssignment_2_1_2"


    // $ANTLR start "rule__Task__ChilldrenAssignment_2_1_5"
    // InternalGoalDSL.g:2499:1: rule__Task__ChilldrenAssignment_2_1_5 : ( ruleGoalTaskElement ) ;
    public final void rule__Task__ChilldrenAssignment_2_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2503:1: ( ( ruleGoalTaskElement ) )
            // InternalGoalDSL.g:2504:2: ( ruleGoalTaskElement )
            {
            // InternalGoalDSL.g:2504:2: ( ruleGoalTaskElement )
            // InternalGoalDSL.g:2505:3: ruleGoalTaskElement
            {
             before(grammarAccess.getTaskAccess().getChilldrenGoalTaskElementParserRuleCall_2_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGoalTaskElement();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getChilldrenGoalTaskElementParserRuleCall_2_1_5_0()); 

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
    // $ANTLR end "rule__Task__ChilldrenAssignment_2_1_5"


    // $ANTLR start "rule__Task__ParentAssignment_2_1_8"
    // InternalGoalDSL.g:2514:1: rule__Task__ParentAssignment_2_1_8 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ParentAssignment_2_1_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2518:1: ( ( ( RULE_ID ) ) )
            // InternalGoalDSL.g:2519:2: ( ( RULE_ID ) )
            {
            // InternalGoalDSL.g:2519:2: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2520:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getParentGoalTaskElementCrossReference_2_1_8_0()); 
            // InternalGoalDSL.g:2521:3: ( RULE_ID )
            // InternalGoalDSL.g:2522:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getParentGoalTaskElementIDTerminalRuleCall_2_1_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getParentGoalTaskElementIDTerminalRuleCall_2_1_8_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getParentGoalTaskElementCrossReference_2_1_8_0()); 

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
    // $ANTLR end "rule__Task__ParentAssignment_2_1_8"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // InternalGoalDSL.g:2533:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2537:1: ( ( RULE_ID ) )
            // InternalGoalDSL.g:2538:2: ( RULE_ID )
            {
            // InternalGoalDSL.g:2538:2: ( RULE_ID )
            // InternalGoalDSL.g:2539:3: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__DestAssignment_2_1"
    // InternalGoalDSL.g:2548:1: rule__Resource__DestAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Resource__DestAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2552:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2553:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2553:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2554:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getResourceAccess().getDestTaskCrossReference_2_1_0()); 
            // InternalGoalDSL.g:2555:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2556:4: ruleQualifiedName
            {
             before(grammarAccess.getResourceAccess().getDestTaskQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getDestTaskQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getDestTaskCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Resource__DestAssignment_2_1"


    // $ANTLR start "rule__Resource__DestAssignment_2_2_1"
    // InternalGoalDSL.g:2567:1: rule__Resource__DestAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Resource__DestAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2571:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2572:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2572:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2573:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getResourceAccess().getDestTaskCrossReference_2_2_1_0()); 
            // InternalGoalDSL.g:2574:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2575:4: ruleQualifiedName
            {
             before(grammarAccess.getResourceAccess().getDestTaskQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getDestTaskQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getDestTaskCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__Resource__DestAssignment_2_2_1"


    // $ANTLR start "rule__Contribution__SrcAssignment_0"
    // InternalGoalDSL.g:2586:1: rule__Contribution__SrcAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Contribution__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2590:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2591:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2591:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2592:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            // InternalGoalDSL.g:2593:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2594:4: ruleQualifiedName
            {
             before(grammarAccess.getContributionAccess().getSrcIntentionalElementQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getContributionAccess().getSrcIntentionalElementQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0()); 

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
    // $ANTLR end "rule__Contribution__SrcAssignment_0"


    // $ANTLR start "rule__Contribution__ContributionTypeAssignment_3"
    // InternalGoalDSL.g:2605:1: rule__Contribution__ContributionTypeAssignment_3 : ( ruleContributionType ) ;
    public final void rule__Contribution__ContributionTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2609:1: ( ( ruleContributionType ) )
            // InternalGoalDSL.g:2610:2: ( ruleContributionType )
            {
            // InternalGoalDSL.g:2610:2: ( ruleContributionType )
            // InternalGoalDSL.g:2611:3: ruleContributionType
            {
             before(grammarAccess.getContributionAccess().getContributionTypeContributionTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContributionType();

            state._fsp--;

             after(grammarAccess.getContributionAccess().getContributionTypeContributionTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Contribution__ContributionTypeAssignment_3"


    // $ANTLR start "rule__Contribution__DestAssignment_5"
    // InternalGoalDSL.g:2620:1: rule__Contribution__DestAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Contribution__DestAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2624:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2625:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2625:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2626:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getContributionAccess().getDestGoalTaskElementCrossReference_5_0()); 
            // InternalGoalDSL.g:2627:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2628:4: ruleQualifiedName
            {
             before(grammarAccess.getContributionAccess().getDestGoalTaskElementQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getContributionAccess().getDestGoalTaskElementQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getContributionAccess().getDestGoalTaskElementCrossReference_5_0()); 

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
    // $ANTLR end "rule__Contribution__DestAssignment_5"


    // $ANTLR start "rule__Contribution__DestAssignment_6_1"
    // InternalGoalDSL.g:2639:1: rule__Contribution__DestAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Contribution__DestAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2643:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2644:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2644:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2645:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getContributionAccess().getDestGoalTaskElementCrossReference_6_1_0()); 
            // InternalGoalDSL.g:2646:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2647:4: ruleQualifiedName
            {
             before(grammarAccess.getContributionAccess().getDestGoalTaskElementQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getContributionAccess().getDestGoalTaskElementQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getContributionAccess().getDestGoalTaskElementCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Contribution__DestAssignment_6_1"


    // $ANTLR start "rule__Dependency__SrcAssignment_0"
    // InternalGoalDSL.g:2658:1: rule__Dependency__SrcAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Dependency__SrcAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2662:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2663:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2663:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2664:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0()); 
            // InternalGoalDSL.g:2665:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2666:4: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getSrcIntentionalElementQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getSrcIntentionalElementQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0()); 

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
    // $ANTLR end "rule__Dependency__SrcAssignment_0"


    // $ANTLR start "rule__Dependency__DestAssignment_2"
    // InternalGoalDSL.g:2677:1: rule__Dependency__DestAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Dependency__DestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2681:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2682:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2682:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2683:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependencyAccess().getDestIntentionalElementCrossReference_2_0()); 
            // InternalGoalDSL.g:2684:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2685:4: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getDestIntentionalElementQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getDestIntentionalElementQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getDestIntentionalElementCrossReference_2_0()); 

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
    // $ANTLR end "rule__Dependency__DestAssignment_2"


    // $ANTLR start "rule__Dependency__DestAssignment_3_1"
    // InternalGoalDSL.g:2696:1: rule__Dependency__DestAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Dependency__DestAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGoalDSL.g:2700:1: ( ( ( ruleQualifiedName ) ) )
            // InternalGoalDSL.g:2701:2: ( ( ruleQualifiedName ) )
            {
            // InternalGoalDSL.g:2701:2: ( ( ruleQualifiedName ) )
            // InternalGoalDSL.g:2702:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependencyAccess().getDestIntentionalElementCrossReference_3_1_0()); 
            // InternalGoalDSL.g:2703:3: ( ruleQualifiedName )
            // InternalGoalDSL.g:2704:4: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getDestIntentionalElementQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getDestIntentionalElementQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getDestIntentionalElementCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Dependency__DestAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006140010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000006040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002140000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000002L});

}