package org.eclipse.stem.model.ctdl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.stem.model.ctdl.services.CTDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCTDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'delta'", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "','"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_NUMBER=5;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalCTDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCTDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCTDLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g"; }


     
     	private CTDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CTDLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleCompartmentTransitionDefinitions"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:60:1: entryRuleCompartmentTransitionDefinitions : ruleCompartmentTransitionDefinitions EOF ;
    public final void entryRuleCompartmentTransitionDefinitions() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:61:1: ( ruleCompartmentTransitionDefinitions EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:62:1: ruleCompartmentTransitionDefinitions EOF
            {
             before(grammarAccess.getCompartmentTransitionDefinitionsRule()); 
            pushFollow(FOLLOW_ruleCompartmentTransitionDefinitions_in_entryRuleCompartmentTransitionDefinitions61);
            ruleCompartmentTransitionDefinitions();

            state._fsp--;

             after(grammarAccess.getCompartmentTransitionDefinitionsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentTransitionDefinitions68); 

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
    // $ANTLR end "entryRuleCompartmentTransitionDefinitions"


    // $ANTLR start "ruleCompartmentTransitionDefinitions"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:69:1: ruleCompartmentTransitionDefinitions : ( ( rule__CompartmentTransitionDefinitions__Group__0 ) ) ;
    public final void ruleCompartmentTransitionDefinitions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:73:2: ( ( ( rule__CompartmentTransitionDefinitions__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:74:1: ( ( rule__CompartmentTransitionDefinitions__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:74:1: ( ( rule__CompartmentTransitionDefinitions__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:75:1: ( rule__CompartmentTransitionDefinitions__Group__0 )
            {
             before(grammarAccess.getCompartmentTransitionDefinitionsAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:76:1: ( rule__CompartmentTransitionDefinitions__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:76:2: rule__CompartmentTransitionDefinitions__Group__0
            {
            pushFollow(FOLLOW_rule__CompartmentTransitionDefinitions__Group__0_in_ruleCompartmentTransitionDefinitions94);
            rule__CompartmentTransitionDefinitions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentTransitionDefinitionsAccess().getGroup()); 

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
    // $ANTLR end "ruleCompartmentTransitionDefinitions"


    // $ANTLR start "entryRuleTransitionBlock"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:90:1: entryRuleTransitionBlock : ruleTransitionBlock EOF ;
    public final void entryRuleTransitionBlock() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:91:1: ( ruleTransitionBlock EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:92:1: ruleTransitionBlock EOF
            {
             before(grammarAccess.getTransitionBlockRule()); 
            pushFollow(FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock123);
            ruleTransitionBlock();

            state._fsp--;

             after(grammarAccess.getTransitionBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionBlock130); 

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
    // $ANTLR end "entryRuleTransitionBlock"


    // $ANTLR start "ruleTransitionBlock"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:99:1: ruleTransitionBlock : ( ( rule__TransitionBlock__BlockAssignment ) ) ;
    public final void ruleTransitionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:103:2: ( ( ( rule__TransitionBlock__BlockAssignment ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:104:1: ( ( rule__TransitionBlock__BlockAssignment ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:104:1: ( ( rule__TransitionBlock__BlockAssignment ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:105:1: ( rule__TransitionBlock__BlockAssignment )
            {
             before(grammarAccess.getTransitionBlockAccess().getBlockAssignment()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:106:1: ( rule__TransitionBlock__BlockAssignment )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:106:2: rule__TransitionBlock__BlockAssignment
            {
            pushFollow(FOLLOW_rule__TransitionBlock__BlockAssignment_in_ruleTransitionBlock156);
            rule__TransitionBlock__BlockAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTransitionBlockAccess().getBlockAssignment()); 

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
    // $ANTLR end "ruleTransitionBlock"


    // $ANTLR start "entryRuleBlock"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:122:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:123:1: ( ruleBlock EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:124:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock187);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock194); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:131:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:135:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:136:1: ( ( rule__Block__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:136:1: ( ( rule__Block__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:137:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:138:1: ( rule__Block__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:138:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock220);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleDefStatement"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:150:1: entryRuleDefStatement : ruleDefStatement EOF ;
    public final void entryRuleDefStatement() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:151:1: ( ruleDefStatement EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:152:1: ruleDefStatement EOF
            {
             before(grammarAccess.getDefStatementRule()); 
            pushFollow(FOLLOW_ruleDefStatement_in_entryRuleDefStatement247);
            ruleDefStatement();

            state._fsp--;

             after(grammarAccess.getDefStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefStatement254); 

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
    // $ANTLR end "entryRuleDefStatement"


    // $ANTLR start "ruleDefStatement"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:159:1: ruleDefStatement : ( ( rule__DefStatement__Group__0 ) ) ;
    public final void ruleDefStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:163:2: ( ( ( rule__DefStatement__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:164:1: ( ( rule__DefStatement__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:164:1: ( ( rule__DefStatement__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:165:1: ( rule__DefStatement__Group__0 )
            {
             before(grammarAccess.getDefStatementAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:166:1: ( rule__DefStatement__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:166:2: rule__DefStatement__Group__0
            {
            pushFollow(FOLLOW_rule__DefStatement__Group__0_in_ruleDefStatement280);
            rule__DefStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleDefStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:178:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:179:1: ( ruleReturnStatement EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:180:1: ruleReturnStatement EOF
            {
             before(grammarAccess.getReturnStatementRule()); 
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement307);
            ruleReturnStatement();

            state._fsp--;

             after(grammarAccess.getReturnStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement314); 

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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:187:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:191:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:192:1: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:192:1: ( ( rule__ReturnStatement__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:193:1: ( rule__ReturnStatement__Group__0 )
            {
             before(grammarAccess.getReturnStatementAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:194:1: ( rule__ReturnStatement__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:194:2: rule__ReturnStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ReturnStatement__Group__0_in_ruleReturnStatement340);
            rule__ReturnStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleEvaluation"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:206:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:207:1: ( ruleEvaluation EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:208:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation367);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation374); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:215:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:219:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:220:1: ( ( rule__Evaluation__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:220:1: ( ( rule__Evaluation__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:221:1: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:222:1: ( rule__Evaluation__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:222:2: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation400);
            rule__Evaluation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGroup()); 

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
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:234:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:235:1: ( ruleExpression EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:236:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression427);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression434); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:243:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:247:2: ( ( ruleAddition ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:248:1: ( ruleAddition )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:248:1: ( ruleAddition )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:249:1: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression460);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:262:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:263:1: ( ruleAddition EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:264:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition486);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition493); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:271:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:275:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:276:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:276:1: ( ( rule__Addition__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:277:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:278:1: ( rule__Addition__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:278:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition519);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:290:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:291:1: ( ruleMultiplication EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:292:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication546);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication553); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:299:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:303:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:304:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:304:1: ( ( rule__Multiplication__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:305:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:306:1: ( rule__Multiplication__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:306:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication579);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNegatedExpression"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:318:1: entryRuleNegatedExpression : ruleNegatedExpression EOF ;
    public final void entryRuleNegatedExpression() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:319:1: ( ruleNegatedExpression EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:320:1: ruleNegatedExpression EOF
            {
             before(grammarAccess.getNegatedExpressionRule()); 
            pushFollow(FOLLOW_ruleNegatedExpression_in_entryRuleNegatedExpression606);
            ruleNegatedExpression();

            state._fsp--;

             after(grammarAccess.getNegatedExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegatedExpression613); 

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
    // $ANTLR end "entryRuleNegatedExpression"


    // $ANTLR start "ruleNegatedExpression"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:327:1: ruleNegatedExpression : ( ( rule__NegatedExpression__Group__0 ) ) ;
    public final void ruleNegatedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:331:2: ( ( ( rule__NegatedExpression__Group__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:332:1: ( ( rule__NegatedExpression__Group__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:332:1: ( ( rule__NegatedExpression__Group__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:333:1: ( rule__NegatedExpression__Group__0 )
            {
             before(grammarAccess.getNegatedExpressionAccess().getGroup()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:334:1: ( rule__NegatedExpression__Group__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:334:2: rule__NegatedExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NegatedExpression__Group__0_in_ruleNegatedExpression639);
            rule__NegatedExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegatedExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNegatedExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:346:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:347:1: ( rulePrimaryExpression EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:348:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression666);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression673); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:355:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:359:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:360:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:360:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:361:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:362:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:362:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression699);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionArgument"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:374:1: entryRuleFunctionArgument : ruleFunctionArgument EOF ;
    public final void entryRuleFunctionArgument() throws RecognitionException {
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:375:1: ( ruleFunctionArgument EOF )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:376:1: ruleFunctionArgument EOF
            {
             before(grammarAccess.getFunctionArgumentRule()); 
            pushFollow(FOLLOW_ruleFunctionArgument_in_entryRuleFunctionArgument726);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getFunctionArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArgument733); 

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
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:383:1: ruleFunctionArgument : ( ( rule__FunctionArgument__Alternatives ) ) ;
    public final void ruleFunctionArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:387:2: ( ( ( rule__FunctionArgument__Alternatives ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:388:1: ( ( rule__FunctionArgument__Alternatives ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:388:1: ( ( rule__FunctionArgument__Alternatives ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:389:1: ( rule__FunctionArgument__Alternatives )
            {
             before(grammarAccess.getFunctionArgumentAccess().getAlternatives()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:390:1: ( rule__FunctionArgument__Alternatives )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:390:2: rule__FunctionArgument__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionArgument__Alternatives_in_ruleFunctionArgument759);
            rule__FunctionArgument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionArgumentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunctionArgument"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:414:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:418:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:419:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:419:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:420:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:421:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:421:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_0807);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:425:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:425:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:426:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:427:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:427:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_0825);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:436:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:440:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:441:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:441:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:442:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:443:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:443:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_0858);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:447:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:447:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:448:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:449:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:449:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_0876);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:458:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:462:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) | ( ( rule__PrimaryExpression__Group_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==EOF||(LA3_3>=15 && LA3_3<=19)||(LA3_3>=21 && LA3_3<=22)) ) {
                    alt3=4;
                }
                else if ( (LA3_3==20) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:463:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:463:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:464:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:465:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:465:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives909);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:469:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:469:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:470:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:471:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:471:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives927);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:475:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:475:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:476:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:477:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:477:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives945);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:481:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:481:6: ( ( rule__PrimaryExpression__Group_3__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:482:1: ( rule__PrimaryExpression__Group_3__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:483:1: ( rule__PrimaryExpression__Group_3__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:483:2: rule__PrimaryExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives963);
                    rule__PrimaryExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__FunctionArgument__Alternatives"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:492:1: rule__FunctionArgument__Alternatives : ( ( ( rule__FunctionArgument__Group_0__0 ) ) | ( ( rule__FunctionArgument__Group_1__0 ) ) | ( ruleExpression ) );
    public final void rule__FunctionArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:496:1: ( ( ( rule__FunctionArgument__Group_0__0 ) ) | ( ( rule__FunctionArgument__Group_1__0 ) ) | ( ruleExpression ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt4=1;
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_NUMBER:
            case 17:
            case 20:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:497:1: ( ( rule__FunctionArgument__Group_0__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:497:1: ( ( rule__FunctionArgument__Group_0__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:498:1: ( rule__FunctionArgument__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionArgumentAccess().getGroup_0()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:499:1: ( rule__FunctionArgument__Group_0__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:499:2: rule__FunctionArgument__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionArgument__Group_0__0_in_rule__FunctionArgument__Alternatives996);
                    rule__FunctionArgument__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionArgumentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:503:6: ( ( rule__FunctionArgument__Group_1__0 ) )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:503:6: ( ( rule__FunctionArgument__Group_1__0 ) )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:504:1: ( rule__FunctionArgument__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionArgumentAccess().getGroup_1()); 
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:505:1: ( rule__FunctionArgument__Group_1__0 )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:505:2: rule__FunctionArgument__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionArgument__Group_1__0_in_rule__FunctionArgument__Alternatives1014);
                    rule__FunctionArgument__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionArgumentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:509:6: ( ruleExpression )
                    {
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:509:6: ( ruleExpression )
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:510:1: ruleExpression
                    {
                     before(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__FunctionArgument__Alternatives1032);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__FunctionArgument__Alternatives"


    // $ANTLR start "rule__CompartmentTransitionDefinitions__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:525:1: rule__CompartmentTransitionDefinitions__Group__0 : rule__CompartmentTransitionDefinitions__Group__0__Impl rule__CompartmentTransitionDefinitions__Group__1 ;
    public final void rule__CompartmentTransitionDefinitions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:529:1: ( rule__CompartmentTransitionDefinitions__Group__0__Impl rule__CompartmentTransitionDefinitions__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:530:2: rule__CompartmentTransitionDefinitions__Group__0__Impl rule__CompartmentTransitionDefinitions__Group__1
            {
            pushFollow(FOLLOW_rule__CompartmentTransitionDefinitions__Group__0__Impl_in_rule__CompartmentTransitionDefinitions__Group__01065);
            rule__CompartmentTransitionDefinitions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompartmentTransitionDefinitions__Group__1_in_rule__CompartmentTransitionDefinitions__Group__01068);
            rule__CompartmentTransitionDefinitions__Group__1();

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
    // $ANTLR end "rule__CompartmentTransitionDefinitions__Group__0"


    // $ANTLR start "rule__CompartmentTransitionDefinitions__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:537:1: rule__CompartmentTransitionDefinitions__Group__0__Impl : ( ( rule__CompartmentTransitionDefinitions__MetamodelAssignment_0 )? ) ;
    public final void rule__CompartmentTransitionDefinitions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:541:1: ( ( ( rule__CompartmentTransitionDefinitions__MetamodelAssignment_0 )? ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:542:1: ( ( rule__CompartmentTransitionDefinitions__MetamodelAssignment_0 )? )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:542:1: ( ( rule__CompartmentTransitionDefinitions__MetamodelAssignment_0 )? )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:543:1: ( rule__CompartmentTransitionDefinitions__MetamodelAssignment_0 )?
            {
             before(grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelAssignment_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:544:1: ( rule__CompartmentTransitionDefinitions__MetamodelAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID||LA5_1==14) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:544:2: rule__CompartmentTransitionDefinitions__MetamodelAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CompartmentTransitionDefinitions__MetamodelAssignment_0_in_rule__CompartmentTransitionDefinitions__Group__0__Impl1095);
                    rule__CompartmentTransitionDefinitions__MetamodelAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelAssignment_0()); 

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
    // $ANTLR end "rule__CompartmentTransitionDefinitions__Group__0__Impl"


    // $ANTLR start "rule__CompartmentTransitionDefinitions__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:554:1: rule__CompartmentTransitionDefinitions__Group__1 : rule__CompartmentTransitionDefinitions__Group__1__Impl ;
    public final void rule__CompartmentTransitionDefinitions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:558:1: ( rule__CompartmentTransitionDefinitions__Group__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:559:2: rule__CompartmentTransitionDefinitions__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompartmentTransitionDefinitions__Group__1__Impl_in_rule__CompartmentTransitionDefinitions__Group__11126);
            rule__CompartmentTransitionDefinitions__Group__1__Impl();

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
    // $ANTLR end "rule__CompartmentTransitionDefinitions__Group__1"


    // $ANTLR start "rule__CompartmentTransitionDefinitions__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:565:1: rule__CompartmentTransitionDefinitions__Group__1__Impl : ( ( rule__CompartmentTransitionDefinitions__ExpressionAssignment_1 ) ) ;
    public final void rule__CompartmentTransitionDefinitions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:569:1: ( ( ( rule__CompartmentTransitionDefinitions__ExpressionAssignment_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:570:1: ( ( rule__CompartmentTransitionDefinitions__ExpressionAssignment_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:570:1: ( ( rule__CompartmentTransitionDefinitions__ExpressionAssignment_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:571:1: ( rule__CompartmentTransitionDefinitions__ExpressionAssignment_1 )
            {
             before(grammarAccess.getCompartmentTransitionDefinitionsAccess().getExpressionAssignment_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:572:1: ( rule__CompartmentTransitionDefinitions__ExpressionAssignment_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:572:2: rule__CompartmentTransitionDefinitions__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_rule__CompartmentTransitionDefinitions__ExpressionAssignment_1_in_rule__CompartmentTransitionDefinitions__Group__1__Impl1153);
            rule__CompartmentTransitionDefinitions__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompartmentTransitionDefinitionsAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__CompartmentTransitionDefinitions__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:588:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:592:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:593:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__01189);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__01192);
            rule__Block__Group__1();

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
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:600:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:604:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:605:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:605:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:606:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:607:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:609:1: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:619:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:623:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:624:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__11250);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__11253);
            rule__Block__Group__2();

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
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:631:1: rule__Block__Group__1__Impl : ( ( rule__Block__StatementsAssignment_1 )* ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:635:1: ( ( ( rule__Block__StatementsAssignment_1 )* ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:636:1: ( ( rule__Block__StatementsAssignment_1 )* )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:636:1: ( ( rule__Block__StatementsAssignment_1 )* )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:637:1: ( rule__Block__StatementsAssignment_1 )*
            {
             before(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:638:1: ( rule__Block__StatementsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:638:2: rule__Block__StatementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Block__StatementsAssignment_1_in_rule__Block__Group__1__Impl1280);
            	    rule__Block__StatementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getStatementsAssignment_1()); 

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
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:648:1: rule__Block__Group__2 : rule__Block__Group__2__Impl ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:652:1: ( rule__Block__Group__2__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:653:2: rule__Block__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__21311);
            rule__Block__Group__2__Impl();

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
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:659:1: rule__Block__Group__2__Impl : ( ( rule__Block__RetAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:663:1: ( ( ( rule__Block__RetAssignment_2 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:664:1: ( ( rule__Block__RetAssignment_2 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:664:1: ( ( rule__Block__RetAssignment_2 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:665:1: ( rule__Block__RetAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getRetAssignment_2()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:666:1: ( rule__Block__RetAssignment_2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:666:2: rule__Block__RetAssignment_2
            {
            pushFollow(FOLLOW_rule__Block__RetAssignment_2_in_rule__Block__Group__2__Impl1338);
            rule__Block__RetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getRetAssignment_2()); 

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
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__DefStatement__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:682:1: rule__DefStatement__Group__0 : rule__DefStatement__Group__0__Impl rule__DefStatement__Group__1 ;
    public final void rule__DefStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:686:1: ( rule__DefStatement__Group__0__Impl rule__DefStatement__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:687:2: rule__DefStatement__Group__0__Impl rule__DefStatement__Group__1
            {
            pushFollow(FOLLOW_rule__DefStatement__Group__0__Impl_in_rule__DefStatement__Group__01374);
            rule__DefStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefStatement__Group__1_in_rule__DefStatement__Group__01377);
            rule__DefStatement__Group__1();

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
    // $ANTLR end "rule__DefStatement__Group__0"


    // $ANTLR start "rule__DefStatement__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:694:1: rule__DefStatement__Group__0__Impl : ( ( rule__DefStatement__VarnameAssignment_0 ) ) ;
    public final void rule__DefStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:698:1: ( ( ( rule__DefStatement__VarnameAssignment_0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:699:1: ( ( rule__DefStatement__VarnameAssignment_0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:699:1: ( ( rule__DefStatement__VarnameAssignment_0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:700:1: ( rule__DefStatement__VarnameAssignment_0 )
            {
             before(grammarAccess.getDefStatementAccess().getVarnameAssignment_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:701:1: ( rule__DefStatement__VarnameAssignment_0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:701:2: rule__DefStatement__VarnameAssignment_0
            {
            pushFollow(FOLLOW_rule__DefStatement__VarnameAssignment_0_in_rule__DefStatement__Group__0__Impl1404);
            rule__DefStatement__VarnameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDefStatementAccess().getVarnameAssignment_0()); 

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
    // $ANTLR end "rule__DefStatement__Group__0__Impl"


    // $ANTLR start "rule__DefStatement__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:711:1: rule__DefStatement__Group__1 : rule__DefStatement__Group__1__Impl rule__DefStatement__Group__2 ;
    public final void rule__DefStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:715:1: ( rule__DefStatement__Group__1__Impl rule__DefStatement__Group__2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:716:2: rule__DefStatement__Group__1__Impl rule__DefStatement__Group__2
            {
            pushFollow(FOLLOW_rule__DefStatement__Group__1__Impl_in_rule__DefStatement__Group__11434);
            rule__DefStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefStatement__Group__2_in_rule__DefStatement__Group__11437);
            rule__DefStatement__Group__2();

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
    // $ANTLR end "rule__DefStatement__Group__1"


    // $ANTLR start "rule__DefStatement__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:723:1: rule__DefStatement__Group__1__Impl : ( '=' ) ;
    public final void rule__DefStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:727:1: ( ( '=' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:728:1: ( '=' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:728:1: ( '=' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:729:1: '='
            {
             before(grammarAccess.getDefStatementAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__DefStatement__Group__1__Impl1465); 
             after(grammarAccess.getDefStatementAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__DefStatement__Group__1__Impl"


    // $ANTLR start "rule__DefStatement__Group__2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:742:1: rule__DefStatement__Group__2 : rule__DefStatement__Group__2__Impl ;
    public final void rule__DefStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:746:1: ( rule__DefStatement__Group__2__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:747:2: rule__DefStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefStatement__Group__2__Impl_in_rule__DefStatement__Group__21496);
            rule__DefStatement__Group__2__Impl();

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
    // $ANTLR end "rule__DefStatement__Group__2"


    // $ANTLR start "rule__DefStatement__Group__2__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:753:1: rule__DefStatement__Group__2__Impl : ( ( rule__DefStatement__ExprAssignment_2 ) ) ;
    public final void rule__DefStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:757:1: ( ( ( rule__DefStatement__ExprAssignment_2 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:758:1: ( ( rule__DefStatement__ExprAssignment_2 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:758:1: ( ( rule__DefStatement__ExprAssignment_2 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:759:1: ( rule__DefStatement__ExprAssignment_2 )
            {
             before(grammarAccess.getDefStatementAccess().getExprAssignment_2()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:760:1: ( rule__DefStatement__ExprAssignment_2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:760:2: rule__DefStatement__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__DefStatement__ExprAssignment_2_in_rule__DefStatement__Group__2__Impl1523);
            rule__DefStatement__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefStatementAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__DefStatement__Group__2__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:776:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:780:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:781:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ReturnStatement__Group__0__Impl_in_rule__ReturnStatement__Group__01559);
            rule__ReturnStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ReturnStatement__Group__1_in_rule__ReturnStatement__Group__01562);
            rule__ReturnStatement__Group__1();

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
    // $ANTLR end "rule__ReturnStatement__Group__0"


    // $ANTLR start "rule__ReturnStatement__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:788:1: rule__ReturnStatement__Group__0__Impl : ( 'delta' ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:792:1: ( ( 'delta' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:793:1: ( 'delta' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:793:1: ( 'delta' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:794:1: 'delta'
            {
             before(grammarAccess.getReturnStatementAccess().getDeltaKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__ReturnStatement__Group__0__Impl1590); 
             after(grammarAccess.getReturnStatementAccess().getDeltaKeyword_0()); 

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
    // $ANTLR end "rule__ReturnStatement__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:807:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:811:1: ( rule__ReturnStatement__Group__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:812:2: rule__ReturnStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReturnStatement__Group__1__Impl_in_rule__ReturnStatement__Group__11621);
            rule__ReturnStatement__Group__1__Impl();

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
    // $ANTLR end "rule__ReturnStatement__Group__1"


    // $ANTLR start "rule__ReturnStatement__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:818:1: rule__ReturnStatement__Group__1__Impl : ( ruleEvaluation ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:822:1: ( ( ruleEvaluation ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:823:1: ( ruleEvaluation )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:823:1: ( ruleEvaluation )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:824:1: ruleEvaluation
            {
             before(grammarAccess.getReturnStatementAccess().getEvaluationParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleEvaluation_in_rule__ReturnStatement__Group__1__Impl1648);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getReturnStatementAccess().getEvaluationParserRuleCall_1()); 

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
    // $ANTLR end "rule__ReturnStatement__Group__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:839:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:843:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:844:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__01681);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__01684);
            rule__Evaluation__Group__1();

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
    // $ANTLR end "rule__Evaluation__Group__0"


    // $ANTLR start "rule__Evaluation__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:851:1: rule__Evaluation__Group__0__Impl : ( ( rule__Evaluation__ExpressionAssignment_0 ) ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:855:1: ( ( ( rule__Evaluation__ExpressionAssignment_0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:856:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:856:1: ( ( rule__Evaluation__ExpressionAssignment_0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:857:1: ( rule__Evaluation__ExpressionAssignment_0 )
            {
             before(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:858:1: ( rule__Evaluation__ExpressionAssignment_0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:858:2: rule__Evaluation__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl1711);
            rule__Evaluation__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getExpressionAssignment_0()); 

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
    // $ANTLR end "rule__Evaluation__Group__0__Impl"


    // $ANTLR start "rule__Evaluation__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:868:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:872:1: ( rule__Evaluation__Group__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:873:2: rule__Evaluation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__11741);
            rule__Evaluation__Group__1__Impl();

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
    // $ANTLR end "rule__Evaluation__Group__1"


    // $ANTLR start "rule__Evaluation__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:879:1: rule__Evaluation__Group__1__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:883:1: ( ( ';' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:884:1: ( ';' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:884:1: ( ';' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:885:1: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Evaluation__Group__1__Impl1769); 
             after(grammarAccess.getEvaluationAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Evaluation__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:902:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:906:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:907:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__01804);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__01807);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:914:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:918:1: ( ( ruleMultiplication ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:919:1: ( ruleMultiplication )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:919:1: ( ruleMultiplication )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:920:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl1834);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:931:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:935:1: ( rule__Addition__Group__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:936:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__11863);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:942:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:946:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:947:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:947:1: ( ( rule__Addition__Group_1__0 )* )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:948:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:949:1: ( rule__Addition__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=16 && LA7_0<=17)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:949:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl1890);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:963:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:967:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:968:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__01925);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__01928);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:975:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:979:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:980:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:980:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:981:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:982:1: ( rule__Addition__Alternatives_1_0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:982:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl1955);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:992:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:996:1: ( rule__Addition__Group_1__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:997:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__11985);
            rule__Addition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1003:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1007:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1008:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1008:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1009:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1010:1: ( rule__Addition__RightAssignment_1_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1010:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl2012);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1024:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1028:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1029:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__02046);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__02049);
            rule__Addition__Group_1_0_0__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1036:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1040:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1041:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1041:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1042:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1043:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1045:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1055:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1059:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1060:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__12107);
            rule__Addition__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1066:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1070:1: ( ( '+' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1071:1: ( '+' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1071:1: ( '+' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1072:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,16,FOLLOW_16_in_rule__Addition__Group_1_0_0__1__Impl2135); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1089:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1093:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1094:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__02170);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__02173);
            rule__Addition__Group_1_0_1__1();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1101:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1105:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1106:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1106:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1107:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1108:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1110:1: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1120:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1124:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1125:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__12231);
            rule__Addition__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1131:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1135:1: ( ( '-' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1136:1: ( '-' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1136:1: ( '-' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1137:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Addition__Group_1_0_1__1__Impl2259); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1154:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1158:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1159:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__02294);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__02297);
            rule__Multiplication__Group__1();

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
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1166:1: rule__Multiplication__Group__0__Impl : ( ruleNegatedExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1170:1: ( ( ruleNegatedExpression ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1171:1: ( ruleNegatedExpression )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1171:1: ( ruleNegatedExpression )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1172:1: ruleNegatedExpression
            {
             before(grammarAccess.getMultiplicationAccess().getNegatedExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNegatedExpression_in_rule__Multiplication__Group__0__Impl2324);
            ruleNegatedExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getNegatedExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1183:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1187:1: ( rule__Multiplication__Group__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1188:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__12353);
            rule__Multiplication__Group__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1194:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1198:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1199:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1199:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1200:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1201:1: ( rule__Multiplication__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1201:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl2380);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1215:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1219:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1220:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__02415);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__02418);
            rule__Multiplication__Group_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1227:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1231:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1232:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1232:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1233:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1234:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1234:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl2445);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1244:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1248:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1249:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__12475);
            rule__Multiplication__Group_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1255:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1259:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1260:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1260:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1261:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1262:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1262:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl2502);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1276:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1280:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1281:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__02536);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__02539);
            rule__Multiplication__Group_1_0_0__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1288:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1292:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1293:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1293:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1294:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1295:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1297:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1307:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1311:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1312:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__12597);
            rule__Multiplication__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1318:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1322:1: ( ( '*' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1323:1: ( '*' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1323:1: ( '*' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1324:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,18,FOLLOW_18_in_rule__Multiplication__Group_1_0_0__1__Impl2625); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1341:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1345:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1346:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__02660);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__02663);
            rule__Multiplication__Group_1_0_1__1();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1353:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1357:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1358:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1358:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1359:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1360:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1362:1: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1372:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1376:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1377:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__12721);
            rule__Multiplication__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1383:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1387:1: ( ( '/' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1388:1: ( '/' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1388:1: ( '/' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1389:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,19,FOLLOW_19_in_rule__Multiplication__Group_1_0_1__1__Impl2749); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__NegatedExpression__Group__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1406:1: rule__NegatedExpression__Group__0 : rule__NegatedExpression__Group__0__Impl rule__NegatedExpression__Group__1 ;
    public final void rule__NegatedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1410:1: ( rule__NegatedExpression__Group__0__Impl rule__NegatedExpression__Group__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1411:2: rule__NegatedExpression__Group__0__Impl rule__NegatedExpression__Group__1
            {
            pushFollow(FOLLOW_rule__NegatedExpression__Group__0__Impl_in_rule__NegatedExpression__Group__02784);
            rule__NegatedExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegatedExpression__Group__1_in_rule__NegatedExpression__Group__02787);
            rule__NegatedExpression__Group__1();

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
    // $ANTLR end "rule__NegatedExpression__Group__0"


    // $ANTLR start "rule__NegatedExpression__Group__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1418:1: rule__NegatedExpression__Group__0__Impl : ( () ) ;
    public final void rule__NegatedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1422:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1423:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1423:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1424:1: ()
            {
             before(grammarAccess.getNegatedExpressionAccess().getPrimaryExpressionAction_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1425:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1427:1: 
            {
            }

             after(grammarAccess.getNegatedExpressionAccess().getPrimaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegatedExpression__Group__0__Impl"


    // $ANTLR start "rule__NegatedExpression__Group__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1437:1: rule__NegatedExpression__Group__1 : rule__NegatedExpression__Group__1__Impl rule__NegatedExpression__Group__2 ;
    public final void rule__NegatedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1441:1: ( rule__NegatedExpression__Group__1__Impl rule__NegatedExpression__Group__2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1442:2: rule__NegatedExpression__Group__1__Impl rule__NegatedExpression__Group__2
            {
            pushFollow(FOLLOW_rule__NegatedExpression__Group__1__Impl_in_rule__NegatedExpression__Group__12845);
            rule__NegatedExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NegatedExpression__Group__2_in_rule__NegatedExpression__Group__12848);
            rule__NegatedExpression__Group__2();

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
    // $ANTLR end "rule__NegatedExpression__Group__1"


    // $ANTLR start "rule__NegatedExpression__Group__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1449:1: rule__NegatedExpression__Group__1__Impl : ( ( rule__NegatedExpression__NegateAssignment_1 )? ) ;
    public final void rule__NegatedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1453:1: ( ( ( rule__NegatedExpression__NegateAssignment_1 )? ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1454:1: ( ( rule__NegatedExpression__NegateAssignment_1 )? )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1454:1: ( ( rule__NegatedExpression__NegateAssignment_1 )? )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1455:1: ( rule__NegatedExpression__NegateAssignment_1 )?
            {
             before(grammarAccess.getNegatedExpressionAccess().getNegateAssignment_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1456:1: ( rule__NegatedExpression__NegateAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1456:2: rule__NegatedExpression__NegateAssignment_1
                    {
                    pushFollow(FOLLOW_rule__NegatedExpression__NegateAssignment_1_in_rule__NegatedExpression__Group__1__Impl2875);
                    rule__NegatedExpression__NegateAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNegatedExpressionAccess().getNegateAssignment_1()); 

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
    // $ANTLR end "rule__NegatedExpression__Group__1__Impl"


    // $ANTLR start "rule__NegatedExpression__Group__2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1466:1: rule__NegatedExpression__Group__2 : rule__NegatedExpression__Group__2__Impl ;
    public final void rule__NegatedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1470:1: ( rule__NegatedExpression__Group__2__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1471:2: rule__NegatedExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NegatedExpression__Group__2__Impl_in_rule__NegatedExpression__Group__22906);
            rule__NegatedExpression__Group__2__Impl();

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
    // $ANTLR end "rule__NegatedExpression__Group__2"


    // $ANTLR start "rule__NegatedExpression__Group__2__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1477:1: rule__NegatedExpression__Group__2__Impl : ( ( rule__NegatedExpression__ExpAssignment_2 ) ) ;
    public final void rule__NegatedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1481:1: ( ( ( rule__NegatedExpression__ExpAssignment_2 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1482:1: ( ( rule__NegatedExpression__ExpAssignment_2 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1482:1: ( ( rule__NegatedExpression__ExpAssignment_2 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1483:1: ( rule__NegatedExpression__ExpAssignment_2 )
            {
             before(grammarAccess.getNegatedExpressionAccess().getExpAssignment_2()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1484:1: ( rule__NegatedExpression__ExpAssignment_2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1484:2: rule__NegatedExpression__ExpAssignment_2
            {
            pushFollow(FOLLOW_rule__NegatedExpression__ExpAssignment_2_in_rule__NegatedExpression__Group__2__Impl2933);
            rule__NegatedExpression__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNegatedExpressionAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__NegatedExpression__Group__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1500:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1504:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1505:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__02969);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__02972);
            rule__PrimaryExpression__Group_0__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1512:1: rule__PrimaryExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1516:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1517:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1517:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1518:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_0_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1519:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1521:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1531:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1535:1: ( rule__PrimaryExpression__Group_0__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1536:2: rule__PrimaryExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__13030);
            rule__PrimaryExpression__Group_0__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1542:1: rule__PrimaryExpression__Group_0__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1546:1: ( ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1547:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1547:1: ( ( rule__PrimaryExpression__ValueAssignment_0_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1548:1: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1549:1: ( rule__PrimaryExpression__ValueAssignment_0_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1549:2: rule__PrimaryExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ValueAssignment_0_1_in_rule__PrimaryExpression__Group_0__1__Impl3057);
            rule__PrimaryExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1563:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1567:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1568:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__03091);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__03094);
            rule__PrimaryExpression__Group_1__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1575:1: rule__PrimaryExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1579:1: ( ( '(' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1580:1: ( '(' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1580:1: ( '(' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1581:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__PrimaryExpression__Group_1__0__Impl3122); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1594:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1598:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1599:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__13153);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__13156);
            rule__PrimaryExpression__Group_1__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1606:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ExpAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1610:1: ( ( ( rule__PrimaryExpression__ExpAssignment_1_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1611:1: ( ( rule__PrimaryExpression__ExpAssignment_1_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1611:1: ( ( rule__PrimaryExpression__ExpAssignment_1_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1612:1: ( rule__PrimaryExpression__ExpAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpAssignment_1_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1613:1: ( rule__PrimaryExpression__ExpAssignment_1_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1613:2: rule__PrimaryExpression__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ExpAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl3183);
            rule__PrimaryExpression__ExpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getExpAssignment_1_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1623:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1627:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1628:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__23213);
            rule__PrimaryExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1634:1: rule__PrimaryExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1638:1: ( ( ')' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1639:1: ( ')' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1639:1: ( ')' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1640:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_21_in_rule__PrimaryExpression__Group_1__2__Impl3241); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1659:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1663:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1664:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__03278);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__03281);
            rule__PrimaryExpression__Group_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1671:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1675:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1676:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1676:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1677:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1678:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1680:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1690:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1694:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1695:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__13339);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__13342);
            rule__PrimaryExpression__Group_2__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1702:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__RefAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1706:1: ( ( ( rule__PrimaryExpression__RefAssignment_2_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1707:1: ( ( rule__PrimaryExpression__RefAssignment_2_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1707:1: ( ( rule__PrimaryExpression__RefAssignment_2_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1708:1: ( rule__PrimaryExpression__RefAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRefAssignment_2_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1709:1: ( rule__PrimaryExpression__RefAssignment_2_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1709:2: rule__PrimaryExpression__RefAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__RefAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl3369);
            rule__PrimaryExpression__RefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getRefAssignment_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1719:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1723:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1724:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__23399);
            rule__PrimaryExpression__Group_2__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1730:1: rule__PrimaryExpression__Group_2__2__Impl : ( ( rule__PrimaryExpression__Group_2_2__0 ) ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1734:1: ( ( ( rule__PrimaryExpression__Group_2_2__0 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1735:1: ( ( rule__PrimaryExpression__Group_2_2__0 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1735:1: ( ( rule__PrimaryExpression__Group_2_2__0 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1736:1: ( rule__PrimaryExpression__Group_2_2__0 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1737:1: ( rule__PrimaryExpression__Group_2_2__0 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1737:2: rule__PrimaryExpression__Group_2_2__0
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__0_in_rule__PrimaryExpression__Group_2__2__Impl3426);
            rule__PrimaryExpression__Group_2_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1753:1: rule__PrimaryExpression__Group_2_2__0 : rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1 ;
    public final void rule__PrimaryExpression__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1757:1: ( rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1758:2: rule__PrimaryExpression__Group_2_2__0__Impl rule__PrimaryExpression__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2__03462);
            rule__PrimaryExpression__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__1_in_rule__PrimaryExpression__Group_2_2__03465);
            rule__PrimaryExpression__Group_2_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1765:1: rule__PrimaryExpression__Group_2_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1769:1: ( ( '(' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1770:1: ( '(' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1770:1: ( '(' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1771:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); 
            match(input,20,FOLLOW_20_in_rule__PrimaryExpression__Group_2_2__0__Impl3493); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1784:1: rule__PrimaryExpression__Group_2_2__1 : rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2 ;
    public final void rule__PrimaryExpression__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1788:1: ( rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1789:2: rule__PrimaryExpression__Group_2_2__1__Impl rule__PrimaryExpression__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2__13524);
            rule__PrimaryExpression__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__2_in_rule__PrimaryExpression__Group_2_2__13527);
            rule__PrimaryExpression__Group_2_2__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1796:1: rule__PrimaryExpression__Group_2_2__1__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )? ) ;
    public final void rule__PrimaryExpression__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1800:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )? ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1801:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )? )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1801:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )? )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1802:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )?
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1803:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==17||LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1803:2: rule__PrimaryExpression__ArgsAssignment_2_2_1
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_1_in_rule__PrimaryExpression__Group_2_2__1__Impl3554);
                    rule__PrimaryExpression__ArgsAssignment_2_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1813:1: rule__PrimaryExpression__Group_2_2__2 : rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3 ;
    public final void rule__PrimaryExpression__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1817:1: ( rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1818:2: rule__PrimaryExpression__Group_2_2__2__Impl rule__PrimaryExpression__Group_2_2__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__2__Impl_in_rule__PrimaryExpression__Group_2_2__23585);
            rule__PrimaryExpression__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__3_in_rule__PrimaryExpression__Group_2_2__23588);
            rule__PrimaryExpression__Group_2_2__3();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__2__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1825:1: rule__PrimaryExpression__Group_2_2__2__Impl : ( ( rule__PrimaryExpression__Group_2_2_2__0 )* ) ;
    public final void rule__PrimaryExpression__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1829:1: ( ( ( rule__PrimaryExpression__Group_2_2_2__0 )* ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1830:1: ( ( rule__PrimaryExpression__Group_2_2_2__0 )* )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1830:1: ( ( rule__PrimaryExpression__Group_2_2_2__0 )* )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1831:1: ( rule__PrimaryExpression__Group_2_2_2__0 )*
            {
             before(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1832:1: ( rule__PrimaryExpression__Group_2_2_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1832:2: rule__PrimaryExpression__Group_2_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__0_in_rule__PrimaryExpression__Group_2_2__2__Impl3615);
            	    rule__PrimaryExpression__Group_2_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPrimaryExpressionAccess().getGroup_2_2_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__3"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1842:1: rule__PrimaryExpression__Group_2_2__3 : rule__PrimaryExpression__Group_2_2__3__Impl ;
    public final void rule__PrimaryExpression__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1846:1: ( rule__PrimaryExpression__Group_2_2__3__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1847:2: rule__PrimaryExpression__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2__3__Impl_in_rule__PrimaryExpression__Group_2_2__33646);
            rule__PrimaryExpression__Group_2_2__3__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__3"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2__3__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1853:1: rule__PrimaryExpression__Group_2_2__3__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1857:1: ( ( ')' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1858:1: ( ')' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1858:1: ( ')' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1859:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); 
            match(input,21,FOLLOW_21_in_rule__PrimaryExpression__Group_2_2__3__Impl3674); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2__3__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1880:1: rule__PrimaryExpression__Group_2_2_2__0 : rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1 ;
    public final void rule__PrimaryExpression__Group_2_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1884:1: ( rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1885:2: rule__PrimaryExpression__Group_2_2_2__0__Impl rule__PrimaryExpression__Group_2_2_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2_2__03713);
            rule__PrimaryExpression__Group_2_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__1_in_rule__PrimaryExpression__Group_2_2_2__03716);
            rule__PrimaryExpression__Group_2_2_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1892:1: rule__PrimaryExpression__Group_2_2_2__0__Impl : ( ',' ) ;
    public final void rule__PrimaryExpression__Group_2_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1896:1: ( ( ',' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1897:1: ( ',' )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1897:1: ( ',' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1898:1: ','
            {
             before(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); 
            match(input,22,FOLLOW_22_in_rule__PrimaryExpression__Group_2_2_2__0__Impl3744); 
             after(grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1911:1: rule__PrimaryExpression__Group_2_2_2__1 : rule__PrimaryExpression__Group_2_2_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1915:1: ( rule__PrimaryExpression__Group_2_2_2__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1916:2: rule__PrimaryExpression__Group_2_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2_2__13775);
            rule__PrimaryExpression__Group_2_2_2__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2_2_2__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1922:1: rule__PrimaryExpression__Group_2_2_2__1__Impl : ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1926:1: ( ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1927:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1927:1: ( ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1928:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1929:1: ( rule__PrimaryExpression__ArgsAssignment_2_2_2_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1929:2: rule__PrimaryExpression__ArgsAssignment_2_2_2_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_2_1_in_rule__PrimaryExpression__Group_2_2_2__1__Impl3802);
            rule__PrimaryExpression__ArgsAssignment_2_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getArgsAssignment_2_2_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2_2_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1943:1: rule__PrimaryExpression__Group_3__0 : rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 ;
    public final void rule__PrimaryExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1947:1: ( rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1948:2: rule__PrimaryExpression__Group_3__0__Impl rule__PrimaryExpression__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__03836);
            rule__PrimaryExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__03839);
            rule__PrimaryExpression__Group_3__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__0"


    // $ANTLR start "rule__PrimaryExpression__Group_3__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1955:1: rule__PrimaryExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1959:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1960:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1960:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1961:1: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_3_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1962:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1964:1: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_3__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1974:1: rule__PrimaryExpression__Group_3__1 : rule__PrimaryExpression__Group_3__1__Impl ;
    public final void rule__PrimaryExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1978:1: ( rule__PrimaryExpression__Group_3__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1979:2: rule__PrimaryExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__13897);
            rule__PrimaryExpression__Group_3__1__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1"


    // $ANTLR start "rule__PrimaryExpression__Group_3__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1985:1: rule__PrimaryExpression__Group_3__1__Impl : ( ( rule__PrimaryExpression__RefAssignment_3_1 ) ) ;
    public final void rule__PrimaryExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1989:1: ( ( ( rule__PrimaryExpression__RefAssignment_3_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1990:1: ( ( rule__PrimaryExpression__RefAssignment_3_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1990:1: ( ( rule__PrimaryExpression__RefAssignment_3_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1991:1: ( rule__PrimaryExpression__RefAssignment_3_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRefAssignment_3_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1992:1: ( rule__PrimaryExpression__RefAssignment_3_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:1992:2: rule__PrimaryExpression__RefAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__RefAssignment_3_1_in_rule__PrimaryExpression__Group_3__1__Impl3924);
            rule__PrimaryExpression__RefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getRefAssignment_3_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_3__1__Impl"


    // $ANTLR start "rule__FunctionArgument__Group_0__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2006:1: rule__FunctionArgument__Group_0__0 : rule__FunctionArgument__Group_0__0__Impl rule__FunctionArgument__Group_0__1 ;
    public final void rule__FunctionArgument__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2010:1: ( rule__FunctionArgument__Group_0__0__Impl rule__FunctionArgument__Group_0__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2011:2: rule__FunctionArgument__Group_0__0__Impl rule__FunctionArgument__Group_0__1
            {
            pushFollow(FOLLOW_rule__FunctionArgument__Group_0__0__Impl_in_rule__FunctionArgument__Group_0__03958);
            rule__FunctionArgument__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionArgument__Group_0__1_in_rule__FunctionArgument__Group_0__03961);
            rule__FunctionArgument__Group_0__1();

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
    // $ANTLR end "rule__FunctionArgument__Group_0__0"


    // $ANTLR start "rule__FunctionArgument__Group_0__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2018:1: rule__FunctionArgument__Group_0__0__Impl : ( () ) ;
    public final void rule__FunctionArgument__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2022:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2023:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2023:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2024:1: ()
            {
             before(grammarAccess.getFunctionArgumentAccess().getBooleanLiteralAction_0_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2025:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2027:1: 
            {
            }

             after(grammarAccess.getFunctionArgumentAccess().getBooleanLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArgument__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionArgument__Group_0__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2037:1: rule__FunctionArgument__Group_0__1 : rule__FunctionArgument__Group_0__1__Impl ;
    public final void rule__FunctionArgument__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2041:1: ( rule__FunctionArgument__Group_0__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2042:2: rule__FunctionArgument__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionArgument__Group_0__1__Impl_in_rule__FunctionArgument__Group_0__14019);
            rule__FunctionArgument__Group_0__1__Impl();

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
    // $ANTLR end "rule__FunctionArgument__Group_0__1"


    // $ANTLR start "rule__FunctionArgument__Group_0__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2048:1: rule__FunctionArgument__Group_0__1__Impl : ( ( rule__FunctionArgument__ValueAssignment_0_1 ) ) ;
    public final void rule__FunctionArgument__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2052:1: ( ( ( rule__FunctionArgument__ValueAssignment_0_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2053:1: ( ( rule__FunctionArgument__ValueAssignment_0_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2053:1: ( ( rule__FunctionArgument__ValueAssignment_0_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2054:1: ( rule__FunctionArgument__ValueAssignment_0_1 )
            {
             before(grammarAccess.getFunctionArgumentAccess().getValueAssignment_0_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2055:1: ( rule__FunctionArgument__ValueAssignment_0_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2055:2: rule__FunctionArgument__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__FunctionArgument__ValueAssignment_0_1_in_rule__FunctionArgument__Group_0__1__Impl4046);
            rule__FunctionArgument__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionArgumentAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__FunctionArgument__Group_0__1__Impl"


    // $ANTLR start "rule__FunctionArgument__Group_1__0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2069:1: rule__FunctionArgument__Group_1__0 : rule__FunctionArgument__Group_1__0__Impl rule__FunctionArgument__Group_1__1 ;
    public final void rule__FunctionArgument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2073:1: ( rule__FunctionArgument__Group_1__0__Impl rule__FunctionArgument__Group_1__1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2074:2: rule__FunctionArgument__Group_1__0__Impl rule__FunctionArgument__Group_1__1
            {
            pushFollow(FOLLOW_rule__FunctionArgument__Group_1__0__Impl_in_rule__FunctionArgument__Group_1__04080);
            rule__FunctionArgument__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionArgument__Group_1__1_in_rule__FunctionArgument__Group_1__04083);
            rule__FunctionArgument__Group_1__1();

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
    // $ANTLR end "rule__FunctionArgument__Group_1__0"


    // $ANTLR start "rule__FunctionArgument__Group_1__0__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2081:1: rule__FunctionArgument__Group_1__0__Impl : ( () ) ;
    public final void rule__FunctionArgument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2085:1: ( ( () ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2086:1: ( () )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2086:1: ( () )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2087:1: ()
            {
             before(grammarAccess.getFunctionArgumentAccess().getStringLiteralAction_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2088:1: ()
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2090:1: 
            {
            }

             after(grammarAccess.getFunctionArgumentAccess().getStringLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionArgument__Group_1__0__Impl"


    // $ANTLR start "rule__FunctionArgument__Group_1__1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2100:1: rule__FunctionArgument__Group_1__1 : rule__FunctionArgument__Group_1__1__Impl ;
    public final void rule__FunctionArgument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2104:1: ( rule__FunctionArgument__Group_1__1__Impl )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2105:2: rule__FunctionArgument__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionArgument__Group_1__1__Impl_in_rule__FunctionArgument__Group_1__14141);
            rule__FunctionArgument__Group_1__1__Impl();

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
    // $ANTLR end "rule__FunctionArgument__Group_1__1"


    // $ANTLR start "rule__FunctionArgument__Group_1__1__Impl"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2111:1: rule__FunctionArgument__Group_1__1__Impl : ( ( rule__FunctionArgument__ValueAssignment_1_1 ) ) ;
    public final void rule__FunctionArgument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2115:1: ( ( ( rule__FunctionArgument__ValueAssignment_1_1 ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2116:1: ( ( rule__FunctionArgument__ValueAssignment_1_1 ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2116:1: ( ( rule__FunctionArgument__ValueAssignment_1_1 ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2117:1: ( rule__FunctionArgument__ValueAssignment_1_1 )
            {
             before(grammarAccess.getFunctionArgumentAccess().getValueAssignment_1_1()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2118:1: ( rule__FunctionArgument__ValueAssignment_1_1 )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2118:2: rule__FunctionArgument__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FunctionArgument__ValueAssignment_1_1_in_rule__FunctionArgument__Group_1__1__Impl4168);
            rule__FunctionArgument__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionArgumentAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__FunctionArgument__Group_1__1__Impl"


    // $ANTLR start "rule__CompartmentTransitionDefinitions__MetamodelAssignment_0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2135:1: rule__CompartmentTransitionDefinitions__MetamodelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__CompartmentTransitionDefinitions__MetamodelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2139:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2140:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2140:1: ( ( RULE_ID ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2141:1: ( RULE_ID )
            {
             before(grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelMetamodelResourceCrossReference_0_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2142:1: ( RULE_ID )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2143:1: RULE_ID
            {
             before(grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelMetamodelResourceIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompartmentTransitionDefinitions__MetamodelAssignment_04213); 
             after(grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelMetamodelResourceIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelMetamodelResourceCrossReference_0_0()); 

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
    // $ANTLR end "rule__CompartmentTransitionDefinitions__MetamodelAssignment_0"


    // $ANTLR start "rule__CompartmentTransitionDefinitions__ExpressionAssignment_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2154:1: rule__CompartmentTransitionDefinitions__ExpressionAssignment_1 : ( ruleTransitionBlock ) ;
    public final void rule__CompartmentTransitionDefinitions__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2158:1: ( ( ruleTransitionBlock ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2159:1: ( ruleTransitionBlock )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2159:1: ( ruleTransitionBlock )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2160:1: ruleTransitionBlock
            {
             before(grammarAccess.getCompartmentTransitionDefinitionsAccess().getExpressionTransitionBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTransitionBlock_in_rule__CompartmentTransitionDefinitions__ExpressionAssignment_14248);
            ruleTransitionBlock();

            state._fsp--;

             after(grammarAccess.getCompartmentTransitionDefinitionsAccess().getExpressionTransitionBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompartmentTransitionDefinitions__ExpressionAssignment_1"


    // $ANTLR start "rule__TransitionBlock__BlockAssignment"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2172:1: rule__TransitionBlock__BlockAssignment : ( ruleBlock ) ;
    public final void rule__TransitionBlock__BlockAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2176:1: ( ( ruleBlock ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2177:1: ( ruleBlock )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2177:1: ( ruleBlock )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2178:1: ruleBlock
            {
             before(grammarAccess.getTransitionBlockAccess().getBlockBlockParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__TransitionBlock__BlockAssignment4282);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getTransitionBlockAccess().getBlockBlockParserRuleCall_0()); 

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
    // $ANTLR end "rule__TransitionBlock__BlockAssignment"


    // $ANTLR start "rule__Block__StatementsAssignment_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2190:1: rule__Block__StatementsAssignment_1 : ( ruleDefStatement ) ;
    public final void rule__Block__StatementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2194:1: ( ( ruleDefStatement ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2195:1: ( ruleDefStatement )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2195:1: ( ruleDefStatement )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2196:1: ruleDefStatement
            {
             before(grammarAccess.getBlockAccess().getStatementsDefStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefStatement_in_rule__Block__StatementsAssignment_14316);
            ruleDefStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getStatementsDefStatementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Block__StatementsAssignment_1"


    // $ANTLR start "rule__Block__RetAssignment_2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2205:1: rule__Block__RetAssignment_2 : ( ruleReturnStatement ) ;
    public final void rule__Block__RetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2209:1: ( ( ruleReturnStatement ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2210:1: ( ruleReturnStatement )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2210:1: ( ruleReturnStatement )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2211:1: ruleReturnStatement
            {
             before(grammarAccess.getBlockAccess().getRetReturnStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleReturnStatement_in_rule__Block__RetAssignment_24347);
            ruleReturnStatement();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getRetReturnStatementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Block__RetAssignment_2"


    // $ANTLR start "rule__DefStatement__VarnameAssignment_0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2220:1: rule__DefStatement__VarnameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DefStatement__VarnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2224:1: ( ( RULE_ID ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2225:1: ( RULE_ID )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2225:1: ( RULE_ID )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2226:1: RULE_ID
            {
             before(grammarAccess.getDefStatementAccess().getVarnameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefStatement__VarnameAssignment_04378); 
             after(grammarAccess.getDefStatementAccess().getVarnameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__DefStatement__VarnameAssignment_0"


    // $ANTLR start "rule__DefStatement__ExprAssignment_2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2235:1: rule__DefStatement__ExprAssignment_2 : ( ruleEvaluation ) ;
    public final void rule__DefStatement__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2239:1: ( ( ruleEvaluation ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2240:1: ( ruleEvaluation )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2240:1: ( ruleEvaluation )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2241:1: ruleEvaluation
            {
             before(grammarAccess.getDefStatementAccess().getExprEvaluationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEvaluation_in_rule__DefStatement__ExprAssignment_24409);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getDefStatementAccess().getExprEvaluationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DefStatement__ExprAssignment_2"


    // $ANTLR start "rule__Evaluation__ExpressionAssignment_0"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2250:1: rule__Evaluation__ExpressionAssignment_0 : ( ruleExpression ) ;
    public final void rule__Evaluation__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2254:1: ( ( ruleExpression ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2255:1: ( ruleExpression )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2255:1: ( ruleExpression )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2256:1: ruleExpression
            {
             before(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_04440);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Evaluation__ExpressionAssignment_0"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2265:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2269:1: ( ( ruleMultiplication ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2270:1: ( ruleMultiplication )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2270:1: ( ruleMultiplication )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2271:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_14471);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2280:1: rule__Multiplication__RightAssignment_1_1 : ( ruleNegatedExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2284:1: ( ( ruleNegatedExpression ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2285:1: ( ruleNegatedExpression )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2285:1: ( ruleNegatedExpression )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2286:1: ruleNegatedExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightNegatedExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNegatedExpression_in_rule__Multiplication__RightAssignment_1_14502);
            ruleNegatedExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightNegatedExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__NegatedExpression__NegateAssignment_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2295:1: rule__NegatedExpression__NegateAssignment_1 : ( ( '-' ) ) ;
    public final void rule__NegatedExpression__NegateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2299:1: ( ( ( '-' ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2300:1: ( ( '-' ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2300:1: ( ( '-' ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2301:1: ( '-' )
            {
             before(grammarAccess.getNegatedExpressionAccess().getNegateHyphenMinusKeyword_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2302:1: ( '-' )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2303:1: '-'
            {
             before(grammarAccess.getNegatedExpressionAccess().getNegateHyphenMinusKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__NegatedExpression__NegateAssignment_14538); 
             after(grammarAccess.getNegatedExpressionAccess().getNegateHyphenMinusKeyword_1_0()); 

            }

             after(grammarAccess.getNegatedExpressionAccess().getNegateHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__NegatedExpression__NegateAssignment_1"


    // $ANTLR start "rule__NegatedExpression__ExpAssignment_2"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2318:1: rule__NegatedExpression__ExpAssignment_2 : ( rulePrimaryExpression ) ;
    public final void rule__NegatedExpression__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2322:1: ( ( rulePrimaryExpression ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2323:1: ( rulePrimaryExpression )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2323:1: ( rulePrimaryExpression )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2324:1: rulePrimaryExpression
            {
             before(grammarAccess.getNegatedExpressionAccess().getExpPrimaryExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__NegatedExpression__ExpAssignment_24577);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getNegatedExpressionAccess().getExpPrimaryExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__NegatedExpression__ExpAssignment_2"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_0_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2333:1: rule__PrimaryExpression__ValueAssignment_0_1 : ( RULE_NUMBER ) ;
    public final void rule__PrimaryExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2337:1: ( ( RULE_NUMBER ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2338:1: ( RULE_NUMBER )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2338:1: ( RULE_NUMBER )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2339:1: RULE_NUMBER
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_0_14608); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__PrimaryExpression__ExpAssignment_1_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2348:1: rule__PrimaryExpression__ExpAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2352:1: ( ( ruleExpression ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2353:1: ( ruleExpression )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2353:1: ( ruleExpression )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2354:1: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrimaryExpression__ExpAssignment_1_14639);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpExpressionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ExpAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__RefAssignment_2_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2363:1: rule__PrimaryExpression__RefAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__RefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2367:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2368:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2368:1: ( ( RULE_ID ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2369:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRefFunctionReferenceCrossReference_2_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2370:1: ( RULE_ID )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2371:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRefFunctionReferenceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__RefAssignment_2_14674); 
             after(grammarAccess.getPrimaryExpressionAccess().getRefFunctionReferenceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getRefFunctionReferenceCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__RefAssignment_2_1"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_2_2_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2382:1: rule__PrimaryExpression__ArgsAssignment_2_2_1 : ( ruleFunctionArgument ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2386:1: ( ( ruleFunctionArgument ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2387:1: ( ruleFunctionArgument )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2387:1: ( ruleFunctionArgument )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2388:1: ruleFunctionArgument
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleFunctionArgument_in_rule__PrimaryExpression__ArgsAssignment_2_2_14709);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_2_2_1"


    // $ANTLR start "rule__PrimaryExpression__ArgsAssignment_2_2_2_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2397:1: rule__PrimaryExpression__ArgsAssignment_2_2_2_1 : ( ruleFunctionArgument ) ;
    public final void rule__PrimaryExpression__ArgsAssignment_2_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2401:1: ( ( ruleFunctionArgument ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2402:1: ( ruleFunctionArgument )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2402:1: ( ruleFunctionArgument )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2403:1: ruleFunctionArgument
            {
             before(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_2_1_0()); 
            pushFollow(FOLLOW_ruleFunctionArgument_in_rule__PrimaryExpression__ArgsAssignment_2_2_2_14740);
            ruleFunctionArgument();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_2_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__ArgsAssignment_2_2_2_1"


    // $ANTLR start "rule__PrimaryExpression__RefAssignment_3_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2412:1: rule__PrimaryExpression__RefAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__RefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2416:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2417:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2417:1: ( ( RULE_ID ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2418:1: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRefScopedVariableReferenceCrossReference_3_1_0()); 
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2419:1: ( RULE_ID )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2420:1: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRefScopedVariableReferenceIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimaryExpression__RefAssignment_3_14775); 
             after(grammarAccess.getPrimaryExpressionAccess().getRefScopedVariableReferenceIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getRefScopedVariableReferenceCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__RefAssignment_3_1"


    // $ANTLR start "rule__FunctionArgument__ValueAssignment_0_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2431:1: rule__FunctionArgument__ValueAssignment_0_1 : ( RULE_BOOLEAN ) ;
    public final void rule__FunctionArgument__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2435:1: ( ( RULE_BOOLEAN ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2436:1: ( RULE_BOOLEAN )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2436:1: ( RULE_BOOLEAN )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2437:1: RULE_BOOLEAN
            {
             before(grammarAccess.getFunctionArgumentAccess().getValueBOOLEANTerminalRuleCall_0_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__FunctionArgument__ValueAssignment_0_14810); 
             after(grammarAccess.getFunctionArgumentAccess().getValueBOOLEANTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__FunctionArgument__ValueAssignment_0_1"


    // $ANTLR start "rule__FunctionArgument__ValueAssignment_1_1"
    // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2446:1: rule__FunctionArgument__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__FunctionArgument__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2450:1: ( ( RULE_STRING ) )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2451:1: ( RULE_STRING )
            {
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2451:1: ( RULE_STRING )
            // ../org.eclipse.stem.model.ctdl.ui/src-gen/org/eclipse/stem/model/ctdl/ui/contentassist/antlr/internal/InternalCTDL.g:2452:1: RULE_STRING
            {
             before(grammarAccess.getFunctionArgumentAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionArgument__ValueAssignment_1_14841); 
             after(grammarAccess.getFunctionArgumentAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FunctionArgument__ValueAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCompartmentTransitionDefinitions_in_entryRuleCompartmentTransitionDefinitions61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentTransitionDefinitions68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompartmentTransitionDefinitions__Group__0_in_ruleCompartmentTransitionDefinitions94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionBlock130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__BlockAssignment_in_ruleTransitionBlock156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefStatement_in_entryRuleDefStatement247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefStatement254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefStatement__Group__0_in_ruleDefStatement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnStatement__Group__0_in_ruleReturnStatement340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0_in_ruleEvaluation400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegatedExpression_in_entryRuleNegatedExpression606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegatedExpression613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegatedExpression__Group__0_in_ruleNegatedExpression639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgument_in_entryRuleFunctionArgument726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArgument733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Alternatives_in_ruleFunctionArgument759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_0807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_0825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_0858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_0876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0_in_rule__PrimaryExpression__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_0__0_in_rule__FunctionArgument__Alternatives996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_1__0_in_rule__FunctionArgument__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__FunctionArgument__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompartmentTransitionDefinitions__Group__0__Impl_in_rule__CompartmentTransitionDefinitions__Group__01065 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__CompartmentTransitionDefinitions__Group__1_in_rule__CompartmentTransitionDefinitions__Group__01068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompartmentTransitionDefinitions__MetamodelAssignment_0_in_rule__CompartmentTransitionDefinitions__Group__0__Impl1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompartmentTransitionDefinitions__Group__1__Impl_in_rule__CompartmentTransitionDefinitions__Group__11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompartmentTransitionDefinitions__ExpressionAssignment_1_in_rule__CompartmentTransitionDefinitions__Group__1__Impl1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__01189 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__01192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__11250 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StatementsAssignment_1_in_rule__Block__Group__1__Impl1280 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__21311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__RetAssignment_2_in_rule__Block__Group__2__Impl1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefStatement__Group__0__Impl_in_rule__DefStatement__Group__01374 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__DefStatement__Group__1_in_rule__DefStatement__Group__01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefStatement__VarnameAssignment_0_in_rule__DefStatement__Group__0__Impl1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefStatement__Group__1__Impl_in_rule__DefStatement__Group__11434 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__DefStatement__Group__2_in_rule__DefStatement__Group__11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DefStatement__Group__1__Impl1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefStatement__Group__2__Impl_in_rule__DefStatement__Group__21496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefStatement__ExprAssignment_2_in_rule__DefStatement__Group__2__Impl1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnStatement__Group__0__Impl_in_rule__ReturnStatement__Group__01559 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__ReturnStatement__Group__1_in_rule__ReturnStatement__Group__01562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ReturnStatement__Group__0__Impl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnStatement__Group__1__Impl_in_rule__ReturnStatement__Group__11621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__ReturnStatement__Group__1__Impl1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__0__Impl_in_rule__Evaluation__Group__01681 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1_in_rule__Evaluation__Group__01684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__ExpressionAssignment_0_in_rule__Evaluation__Group__0__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Evaluation__Group__1__Impl_in_rule__Evaluation__Group__11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Evaluation__Group__1__Impl1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__01804 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__01807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl1890 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__01925 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__01928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__02046 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__02049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Addition__Group_1_0_0__1__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__02170 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__02173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__12231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Addition__Group_1_0_1__1__Impl2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__02294 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__02297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegatedExpression_in_rule__Multiplication__Group__0__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl2380 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__02415 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__02536 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__02539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Multiplication__Group_1_0_0__1__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__02660 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__02663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__12721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Multiplication__Group_1_0_1__1__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegatedExpression__Group__0__Impl_in_rule__NegatedExpression__Group__02784 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__NegatedExpression__Group__1_in_rule__NegatedExpression__Group__02787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegatedExpression__Group__1__Impl_in_rule__NegatedExpression__Group__12845 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__NegatedExpression__Group__2_in_rule__NegatedExpression__Group__12848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegatedExpression__NegateAssignment_1_in_rule__NegatedExpression__Group__1__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegatedExpression__Group__2__Impl_in_rule__NegatedExpression__Group__22906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NegatedExpression__ExpAssignment_2_in_rule__NegatedExpression__Group__2__Impl2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__02969 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__02972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__13030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ValueAssignment_0_1_in_rule__PrimaryExpression__Group_0__1__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__03091 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__03094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimaryExpression__Group_1__0__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__13153 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__13156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ExpAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__23213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimaryExpression__Group_1__2__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__03278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__03281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__13339 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__13342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__RefAssignment_2_1_in_rule__PrimaryExpression__Group_2__1__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__23399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__0_in_rule__PrimaryExpression__Group_2__2__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2__03462 = new BitSet(new long[]{0x00000000007200F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__1_in_rule__PrimaryExpression__Group_2_2__03465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PrimaryExpression__Group_2_2__0__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2__13524 = new BitSet(new long[]{0x00000000007200F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__2_in_rule__PrimaryExpression__Group_2_2__13527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_1_in_rule__PrimaryExpression__Group_2_2__1__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__2__Impl_in_rule__PrimaryExpression__Group_2_2__23585 = new BitSet(new long[]{0x00000000007200F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__3_in_rule__PrimaryExpression__Group_2_2__23588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__0_in_rule__PrimaryExpression__Group_2_2__2__Impl3615 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2__3__Impl_in_rule__PrimaryExpression__Group_2_2__33646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PrimaryExpression__Group_2_2__3__Impl3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__0__Impl_in_rule__PrimaryExpression__Group_2_2_2__03713 = new BitSet(new long[]{0x00000000001200F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__1_in_rule__PrimaryExpression__Group_2_2_2__03716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrimaryExpression__Group_2_2_2__0__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2_2_2__1__Impl_in_rule__PrimaryExpression__Group_2_2_2__13775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ArgsAssignment_2_2_2_1_in_rule__PrimaryExpression__Group_2_2_2__1__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__0__Impl_in_rule__PrimaryExpression__Group_3__03836 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1_in_rule__PrimaryExpression__Group_3__03839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_3__1__Impl_in_rule__PrimaryExpression__Group_3__13897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__RefAssignment_3_1_in_rule__PrimaryExpression__Group_3__1__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_0__0__Impl_in_rule__FunctionArgument__Group_0__03958 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_0__1_in_rule__FunctionArgument__Group_0__03961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_0__1__Impl_in_rule__FunctionArgument__Group_0__14019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__ValueAssignment_0_1_in_rule__FunctionArgument__Group_0__1__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_1__0__Impl_in_rule__FunctionArgument__Group_1__04080 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_1__1_in_rule__FunctionArgument__Group_1__04083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__Group_1__1__Impl_in_rule__FunctionArgument__Group_1__14141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionArgument__ValueAssignment_1_1_in_rule__FunctionArgument__Group_1__1__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompartmentTransitionDefinitions__MetamodelAssignment_04213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_rule__CompartmentTransitionDefinitions__ExpressionAssignment_14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__TransitionBlock__BlockAssignment4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefStatement_in_rule__Block__StatementsAssignment_14316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_rule__Block__RetAssignment_24347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefStatement__VarnameAssignment_04378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_rule__DefStatement__ExprAssignment_24409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Evaluation__ExpressionAssignment_04440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_14471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegatedExpression_in_rule__Multiplication__RightAssignment_1_14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NegatedExpression__NegateAssignment_14538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__NegatedExpression__ExpAssignment_24577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__PrimaryExpression__ValueAssignment_0_14608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrimaryExpression__ExpAssignment_1_14639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__RefAssignment_2_14674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgument_in_rule__PrimaryExpression__ArgsAssignment_2_2_14709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgument_in_rule__PrimaryExpression__ArgsAssignment_2_2_2_14740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimaryExpression__RefAssignment_3_14775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__FunctionArgument__ValueAssignment_0_14810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionArgument__ValueAssignment_1_14841 = new BitSet(new long[]{0x0000000000000002L});

}