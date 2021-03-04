package org.eclipse.stem.model.ctdl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.stem.model.ctdl.services.CTDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCTDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'delta'", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "','"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=5;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCTDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCTDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCTDLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g"; }



     	private CTDLGrammarAccess grammarAccess;
     	
        public InternalCTDLParser(TokenStream input, CTDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "CompartmentTransitionDefinitions";	
       	}
       	
       	@Override
       	protected CTDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCompartmentTransitionDefinitions"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:67:1: entryRuleCompartmentTransitionDefinitions returns [EObject current=null] : iv_ruleCompartmentTransitionDefinitions= ruleCompartmentTransitionDefinitions EOF ;
    public final EObject entryRuleCompartmentTransitionDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompartmentTransitionDefinitions = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:68:2: (iv_ruleCompartmentTransitionDefinitions= ruleCompartmentTransitionDefinitions EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:69:2: iv_ruleCompartmentTransitionDefinitions= ruleCompartmentTransitionDefinitions EOF
            {
             newCompositeNode(grammarAccess.getCompartmentTransitionDefinitionsRule()); 
            pushFollow(FOLLOW_ruleCompartmentTransitionDefinitions_in_entryRuleCompartmentTransitionDefinitions75);
            iv_ruleCompartmentTransitionDefinitions=ruleCompartmentTransitionDefinitions();

            state._fsp--;

             current =iv_ruleCompartmentTransitionDefinitions; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompartmentTransitionDefinitions85); 

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
    // $ANTLR end "entryRuleCompartmentTransitionDefinitions"


    // $ANTLR start "ruleCompartmentTransitionDefinitions"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:76:1: ruleCompartmentTransitionDefinitions returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) )? ( (lv_expression_1_0= ruleTransitionBlock ) ) ) ;
    public final EObject ruleCompartmentTransitionDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:79:28: ( ( ( (otherlv_0= RULE_ID ) )? ( (lv_expression_1_0= ruleTransitionBlock ) ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:80:1: ( ( (otherlv_0= RULE_ID ) )? ( (lv_expression_1_0= ruleTransitionBlock ) ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:80:1: ( ( (otherlv_0= RULE_ID ) )? ( (lv_expression_1_0= ruleTransitionBlock ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:80:2: ( (otherlv_0= RULE_ID ) )? ( (lv_expression_1_0= ruleTransitionBlock ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:80:2: ( (otherlv_0= RULE_ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID||LA1_1==14) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:81:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:81:1: (otherlv_0= RULE_ID )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:82:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompartmentTransitionDefinitionsRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompartmentTransitionDefinitions130); 

                    		newLeafNode(otherlv_0, grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelMetamodelResourceCrossReference_0_0()); 
                    	

                    }


                    }
                    break;

            }

            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:93:3: ( (lv_expression_1_0= ruleTransitionBlock ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:94:1: (lv_expression_1_0= ruleTransitionBlock )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:94:1: (lv_expression_1_0= ruleTransitionBlock )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:95:3: lv_expression_1_0= ruleTransitionBlock
            {
             
            	        newCompositeNode(grammarAccess.getCompartmentTransitionDefinitionsAccess().getExpressionTransitionBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTransitionBlock_in_ruleCompartmentTransitionDefinitions152);
            lv_expression_1_0=ruleTransitionBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompartmentTransitionDefinitionsRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_1_0, 
                    		"TransitionBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleCompartmentTransitionDefinitions"


    // $ANTLR start "entryRuleTransitionBlock"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:121:1: entryRuleTransitionBlock returns [EObject current=null] : iv_ruleTransitionBlock= ruleTransitionBlock EOF ;
    public final EObject entryRuleTransitionBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionBlock = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:122:2: (iv_ruleTransitionBlock= ruleTransitionBlock EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:123:2: iv_ruleTransitionBlock= ruleTransitionBlock EOF
            {
             newCompositeNode(grammarAccess.getTransitionBlockRule()); 
            pushFollow(FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock190);
            iv_ruleTransitionBlock=ruleTransitionBlock();

            state._fsp--;

             current =iv_ruleTransitionBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionBlock200); 

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
    // $ANTLR end "entryRuleTransitionBlock"


    // $ANTLR start "ruleTransitionBlock"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:130:1: ruleTransitionBlock returns [EObject current=null] : ( (lv_block_0_0= ruleBlock ) ) ;
    public final EObject ruleTransitionBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_block_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:133:28: ( ( (lv_block_0_0= ruleBlock ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:134:1: ( (lv_block_0_0= ruleBlock ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:134:1: ( (lv_block_0_0= ruleBlock ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:135:1: (lv_block_0_0= ruleBlock )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:135:1: (lv_block_0_0= ruleBlock )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:136:3: lv_block_0_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getTransitionBlockAccess().getBlockBlockParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleTransitionBlock245);
            lv_block_0_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionBlockRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_0_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleTransitionBlock"


    // $ANTLR start "entryRuleBlock"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:164:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:165:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:166:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock284);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock294); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:173:1: ruleBlock returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleDefStatement ) )* ( (lv_ret_2_0= ruleReturnStatement ) ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;

        EObject lv_ret_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:176:28: ( ( () ( (lv_statements_1_0= ruleDefStatement ) )* ( (lv_ret_2_0= ruleReturnStatement ) ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:177:1: ( () ( (lv_statements_1_0= ruleDefStatement ) )* ( (lv_ret_2_0= ruleReturnStatement ) ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:177:1: ( () ( (lv_statements_1_0= ruleDefStatement ) )* ( (lv_ret_2_0= ruleReturnStatement ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:177:2: () ( (lv_statements_1_0= ruleDefStatement ) )* ( (lv_ret_2_0= ruleReturnStatement ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:177:2: ()
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:178:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBlockAccess().getBlockAction_0(),
                        current);
                

            }

            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:183:2: ( (lv_statements_1_0= ruleDefStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:184:1: (lv_statements_1_0= ruleDefStatement )
            	    {
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:184:1: (lv_statements_1_0= ruleDefStatement )
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:185:3: lv_statements_1_0= ruleDefStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getStatementsDefStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefStatement_in_ruleBlock349);
            	    lv_statements_1_0=ruleDefStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_1_0, 
            	            		"DefStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:201:3: ( (lv_ret_2_0= ruleReturnStatement ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:202:1: (lv_ret_2_0= ruleReturnStatement )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:202:1: (lv_ret_2_0= ruleReturnStatement )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:203:3: lv_ret_2_0= ruleReturnStatement
            {
             
            	        newCompositeNode(grammarAccess.getBlockAccess().getRetReturnStatementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleReturnStatement_in_ruleBlock371);
            lv_ret_2_0=ruleReturnStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	        }
                   		set(
                   			current, 
                   			"ret",
                    		lv_ret_2_0, 
                    		"ReturnStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleDefStatement"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:227:1: entryRuleDefStatement returns [EObject current=null] : iv_ruleDefStatement= ruleDefStatement EOF ;
    public final EObject entryRuleDefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefStatement = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:228:2: (iv_ruleDefStatement= ruleDefStatement EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:229:2: iv_ruleDefStatement= ruleDefStatement EOF
            {
             newCompositeNode(grammarAccess.getDefStatementRule()); 
            pushFollow(FOLLOW_ruleDefStatement_in_entryRuleDefStatement407);
            iv_ruleDefStatement=ruleDefStatement();

            state._fsp--;

             current =iv_ruleDefStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefStatement417); 

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
    // $ANTLR end "entryRuleDefStatement"


    // $ANTLR start "ruleDefStatement"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:236:1: ruleDefStatement returns [EObject current=null] : ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleEvaluation ) ) ) ;
    public final EObject ruleDefStatement() throws RecognitionException {
        EObject current = null;

        Token lv_varname_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:239:28: ( ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleEvaluation ) ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:240:1: ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleEvaluation ) ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:240:1: ( ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleEvaluation ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:240:2: ( (lv_varname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleEvaluation ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:240:2: ( (lv_varname_0_0= RULE_ID ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:241:1: (lv_varname_0_0= RULE_ID )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:241:1: (lv_varname_0_0= RULE_ID )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:242:3: lv_varname_0_0= RULE_ID
            {
            lv_varname_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefStatement459); 

            			newLeafNode(lv_varname_0_0, grammarAccess.getDefStatementAccess().getVarnameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"varname",
                    		lv_varname_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDefStatement476); 

                	newLeafNode(otherlv_1, grammarAccess.getDefStatementAccess().getEqualsSignKeyword_1());
                
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:262:1: ( (lv_expr_2_0= ruleEvaluation ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:263:1: (lv_expr_2_0= ruleEvaluation )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:263:1: (lv_expr_2_0= ruleEvaluation )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:264:3: lv_expr_2_0= ruleEvaluation
            {
             
            	        newCompositeNode(grammarAccess.getDefStatementAccess().getExprEvaluationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEvaluation_in_ruleDefStatement497);
            lv_expr_2_0=ruleEvaluation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefStatementRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Evaluation");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleDefStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:288:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:289:2: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:290:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement533);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStatement543); 

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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:297:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'delta' this_Evaluation_1= ruleEvaluation ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Evaluation_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:300:28: ( (otherlv_0= 'delta' this_Evaluation_1= ruleEvaluation ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:301:1: (otherlv_0= 'delta' this_Evaluation_1= ruleEvaluation )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:301:1: (otherlv_0= 'delta' this_Evaluation_1= ruleEvaluation )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:301:3: otherlv_0= 'delta' this_Evaluation_1= ruleEvaluation
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleReturnStatement580); 

                	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getDeltaKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getReturnStatementAccess().getEvaluationParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleEvaluation_in_ruleReturnStatement602);
            this_Evaluation_1=ruleEvaluation();

            state._fsp--;

             
                    current = this_Evaluation_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleEvaluation"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:322:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:323:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:324:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation637);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation647); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:331:1: ruleEvaluation returns [EObject current=null] : ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:334:28: ( ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:335:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:335:1: ( ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';' )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:335:2: ( (lv_expression_0_0= ruleExpression ) ) otherlv_1= ';'
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:335:2: ( (lv_expression_0_0= ruleExpression ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:336:1: (lv_expression_0_0= ruleExpression )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:336:1: (lv_expression_0_0= ruleExpression )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:337:3: lv_expression_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleEvaluation693);
            lv_expression_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation705); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleExpression"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:365:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:366:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:367:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression741);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression751); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:374:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:377:28: (this_Addition_0= ruleAddition )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:379:5: this_Addition_0= ruleAddition
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression797);
            this_Addition_0=ruleAddition();

            state._fsp--;

             
                    current = this_Addition_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:395:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:396:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:397:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition831);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition841); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:404:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:407:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:408:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:408:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:409:5: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition888);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:417:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:417:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:417:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==17) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:417:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:417:3: ( () otherlv_2= '+' )
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:417:4: () otherlv_2= '+'
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:417:4: ()
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:418:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAddition911); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:428:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:428:6: ( () otherlv_4= '-' )
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:428:7: () otherlv_4= '-'
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:428:7: ()
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:429:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleAddition940); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:438:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:439:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:439:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:440:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition963);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:464:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:465:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:466:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1001);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1011); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:473:1: ruleMultiplication returns [EObject current=null] : (this_NegatedExpression_0= ruleNegatedExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleNegatedExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_NegatedExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:476:28: ( (this_NegatedExpression_0= ruleNegatedExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleNegatedExpression ) ) )* ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:477:1: (this_NegatedExpression_0= ruleNegatedExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleNegatedExpression ) ) )* )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:477:1: (this_NegatedExpression_0= ruleNegatedExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleNegatedExpression ) ) )* )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:478:5: this_NegatedExpression_0= ruleNegatedExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleNegatedExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getNegatedExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNegatedExpression_in_ruleMultiplication1058);
            this_NegatedExpression_0=ruleNegatedExpression();

            state._fsp--;

             
                    current = this_NegatedExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:486:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleNegatedExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:486:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleNegatedExpression ) )
            	    {
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:486:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==18) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==19) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:486:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:486:3: ( () otherlv_2= '*' )
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:486:4: () otherlv_2= '*'
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:486:4: ()
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:487:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMultiplication1081); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:497:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:497:6: ( () otherlv_4= '/' )
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:497:7: () otherlv_4= '/'
            	            {
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:497:7: ()
            	            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:498:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMultiplication1110); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:507:3: ( (lv_right_5_0= ruleNegatedExpression ) )
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:508:1: (lv_right_5_0= ruleNegatedExpression )
            	    {
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:508:1: (lv_right_5_0= ruleNegatedExpression )
            	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:509:3: lv_right_5_0= ruleNegatedExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNegatedExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNegatedExpression_in_ruleMultiplication1133);
            	    lv_right_5_0=ruleNegatedExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
            	            		"NegatedExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleNegatedExpression"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:533:1: entryRuleNegatedExpression returns [EObject current=null] : iv_ruleNegatedExpression= ruleNegatedExpression EOF ;
    public final EObject entryRuleNegatedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegatedExpression = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:534:2: (iv_ruleNegatedExpression= ruleNegatedExpression EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:535:2: iv_ruleNegatedExpression= ruleNegatedExpression EOF
            {
             newCompositeNode(grammarAccess.getNegatedExpressionRule()); 
            pushFollow(FOLLOW_ruleNegatedExpression_in_entryRuleNegatedExpression1171);
            iv_ruleNegatedExpression=ruleNegatedExpression();

            state._fsp--;

             current =iv_ruleNegatedExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegatedExpression1181); 

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
    // $ANTLR end "entryRuleNegatedExpression"


    // $ANTLR start "ruleNegatedExpression"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:542:1: ruleNegatedExpression returns [EObject current=null] : ( () ( (lv_negate_1_0= '-' ) )? ( (lv_exp_2_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleNegatedExpression() throws RecognitionException {
        EObject current = null;

        Token lv_negate_1_0=null;
        EObject lv_exp_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:545:28: ( ( () ( (lv_negate_1_0= '-' ) )? ( (lv_exp_2_0= rulePrimaryExpression ) ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:546:1: ( () ( (lv_negate_1_0= '-' ) )? ( (lv_exp_2_0= rulePrimaryExpression ) ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:546:1: ( () ( (lv_negate_1_0= '-' ) )? ( (lv_exp_2_0= rulePrimaryExpression ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:546:2: () ( (lv_negate_1_0= '-' ) )? ( (lv_exp_2_0= rulePrimaryExpression ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:546:2: ()
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:547:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNegatedExpressionAccess().getPrimaryExpressionAction_0(),
                        current);
                

            }

            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:552:2: ( (lv_negate_1_0= '-' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:553:1: (lv_negate_1_0= '-' )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:553:1: (lv_negate_1_0= '-' )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:554:3: lv_negate_1_0= '-'
                    {
                    lv_negate_1_0=(Token)match(input,17,FOLLOW_17_in_ruleNegatedExpression1233); 

                            newLeafNode(lv_negate_1_0, grammarAccess.getNegatedExpressionAccess().getNegateHyphenMinusKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNegatedExpressionRule());
                    	        }
                           		setWithLastConsumed(current, "negate", true, "-");
                    	    

                    }


                    }
                    break;

            }

            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:567:3: ( (lv_exp_2_0= rulePrimaryExpression ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:568:1: (lv_exp_2_0= rulePrimaryExpression )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:568:1: (lv_exp_2_0= rulePrimaryExpression )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:569:3: lv_exp_2_0= rulePrimaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getNegatedExpressionAccess().getExpPrimaryExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleNegatedExpression1268);
            lv_exp_2_0=rulePrimaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNegatedExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_2_0, 
                    		"PrimaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleNegatedExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:593:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:594:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:595:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1304);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression1314); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:602:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_exp_3_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_args_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:605:28: ( ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:606:1: ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:606:1: ( ( () ( (lv_value_1_0= RULE_NUMBER ) ) ) | (otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' ) | ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt10=1;
                }
                break;
            case 20:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==20) ) {
                    alt10=3;
                }
                else if ( (LA10_3==EOF||(LA10_3>=15 && LA10_3<=19)||(LA10_3>=21 && LA10_3<=22)) ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:606:2: ( () ( (lv_value_1_0= RULE_NUMBER ) ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:606:2: ( () ( (lv_value_1_0= RULE_NUMBER ) ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:606:3: () ( (lv_value_1_0= RULE_NUMBER ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:606:3: ()
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:607:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:612:2: ( (lv_value_1_0= RULE_NUMBER ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:613:1: (lv_value_1_0= RULE_NUMBER )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:613:1: (lv_value_1_0= RULE_NUMBER )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:614:3: lv_value_1_0= RULE_NUMBER
                    {
                    lv_value_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rulePrimaryExpression1366); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"NUMBER");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:631:6: (otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:631:6: (otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')' )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:631:8: otherlv_2= '(' ( (lv_exp_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_rulePrimaryExpression1391); 

                        	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:635:1: ( (lv_exp_3_0= ruleExpression ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:636:1: (lv_exp_3_0= ruleExpression )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:636:1: (lv_exp_3_0= ruleExpression )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:637:3: lv_exp_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression1412);
                    lv_exp_3_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"exp",
                            		lv_exp_3_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression1424); 

                        	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:658:6: ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:658:6: ( () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:658:7: () ( (otherlv_6= RULE_ID ) ) (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:658:7: ()
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:659:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0(),
                                current);
                        

                    }

                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:664:2: ( (otherlv_6= RULE_ID ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:665:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:665:1: (otherlv_6= RULE_ID )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:666:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression1461); 

                    		newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRefFunctionReferenceCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:677:2: (otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')' )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:677:4: otherlv_7= '(' ( (lv_args_8_0= ruleFunctionArgument ) )? (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_rulePrimaryExpression1474); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0());
                        
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:681:1: ( (lv_args_8_0= ruleFunctionArgument ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)||LA8_0==17||LA8_0==20) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:682:1: (lv_args_8_0= ruleFunctionArgument )
                            {
                            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:682:1: (lv_args_8_0= ruleFunctionArgument )
                            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:683:3: lv_args_8_0= ruleFunctionArgument
                            {
                             
                            	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFunctionArgument_in_rulePrimaryExpression1495);
                            lv_args_8_0=ruleFunctionArgument();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"args",
                                    		lv_args_8_0, 
                                    		"FunctionArgument");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:699:3: (otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:699:5: otherlv_9= ',' ( (lv_args_10_0= ruleFunctionArgument ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_rulePrimaryExpression1509); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0());
                    	        
                    	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:703:1: ( (lv_args_10_0= ruleFunctionArgument ) )
                    	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:704:1: (lv_args_10_0= ruleFunctionArgument )
                    	    {
                    	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:704:1: (lv_args_10_0= ruleFunctionArgument )
                    	    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:705:3: lv_args_10_0= ruleFunctionArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionArgument_in_rulePrimaryExpression1530);
                    	    lv_args_10_0=ruleFunctionArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"args",
                    	            		lv_args_10_0, 
                    	            		"FunctionArgument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_rulePrimaryExpression1544); 

                        	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3());
                        

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:726:6: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:726:6: ( () ( (otherlv_13= RULE_ID ) ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:726:7: () ( (otherlv_13= RULE_ID ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:726:7: ()
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:727:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_3_0(),
                                current);
                        

                    }

                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:732:2: ( (otherlv_13= RULE_ID ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:733:1: (otherlv_13= RULE_ID )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:733:1: (otherlv_13= RULE_ID )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:734:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression1582); 

                    		newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getRefScopedVariableReferenceCrossReference_3_1_0()); 
                    	

                    }


                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionArgument"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:753:1: entryRuleFunctionArgument returns [EObject current=null] : iv_ruleFunctionArgument= ruleFunctionArgument EOF ;
    public final EObject entryRuleFunctionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionArgument = null;


        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:754:2: (iv_ruleFunctionArgument= ruleFunctionArgument EOF )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:755:2: iv_ruleFunctionArgument= ruleFunctionArgument EOF
            {
             newCompositeNode(grammarAccess.getFunctionArgumentRule()); 
            pushFollow(FOLLOW_ruleFunctionArgument_in_entryRuleFunctionArgument1619);
            iv_ruleFunctionArgument=ruleFunctionArgument();

            state._fsp--;

             current =iv_ruleFunctionArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionArgument1629); 

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
    // $ANTLR end "entryRuleFunctionArgument"


    // $ANTLR start "ruleFunctionArgument"
    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:762:1: ruleFunctionArgument returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_Expression_4= ruleExpression ) ;
    public final EObject ruleFunctionArgument() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        EObject this_Expression_4 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:765:28: ( ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_Expression_4= ruleExpression ) )
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:766:1: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_Expression_4= ruleExpression )
            {
            // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:766:1: ( ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | this_Expression_4= ruleExpression )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case RULE_NUMBER:
            case 17:
            case 20:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:766:2: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:766:2: ( () ( (lv_value_1_0= RULE_BOOLEAN ) ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:766:3: () ( (lv_value_1_0= RULE_BOOLEAN ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:766:3: ()
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:767:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFunctionArgumentAccess().getBooleanLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:772:2: ( (lv_value_1_0= RULE_BOOLEAN ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:773:1: (lv_value_1_0= RULE_BOOLEAN )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:773:1: (lv_value_1_0= RULE_BOOLEAN )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:774:3: lv_value_1_0= RULE_BOOLEAN
                    {
                    lv_value_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleFunctionArgument1681); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getFunctionArgumentAccess().getValueBOOLEANTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:791:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:791:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:791:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:791:7: ()
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:792:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getFunctionArgumentAccess().getStringLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:797:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:798:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:798:1: (lv_value_3_0= RULE_STRING )
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:799:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionArgument1720); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getFunctionArgumentAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.stem.model.ctdl/src-gen/org/eclipse/stem/model/ctdl/parser/antlr/internal/InternalCTDL.g:817:5: this_Expression_4= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionArgument1754);
                    this_Expression_4=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_4; 
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
    // $ANTLR end "ruleFunctionArgument"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleCompartmentTransitionDefinitions_in_entryRuleCompartmentTransitionDefinitions75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompartmentTransitionDefinitions85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompartmentTransitionDefinitions130 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_ruleCompartmentTransitionDefinitions152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionBlock200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTransitionBlock245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefStatement_in_ruleBlock349 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_ruleBlock371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefStatement_in_entryRuleDefStatement407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefStatement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefStatement459 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDefStatement476 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleDefStatement497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStatement_in_entryRuleReturnStatement533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStatement543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleReturnStatement580 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleReturnStatement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleEvaluation693 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition888 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleAddition911 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_17_in_ruleAddition940 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition963 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegatedExpression_in_ruleMultiplication1058 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_18_in_ruleMultiplication1081 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_19_in_ruleMultiplication1110 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_ruleNegatedExpression_in_ruleMultiplication1133 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleNegatedExpression_in_entryRuleNegatedExpression1171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegatedExpression1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNegatedExpression1233 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleNegatedExpression1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rulePrimaryExpression1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePrimaryExpression1391 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression1412 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression1461 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePrimaryExpression1474 = new BitSet(new long[]{0x00000000007200F0L});
    public static final BitSet FOLLOW_ruleFunctionArgument_in_rulePrimaryExpression1495 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_rulePrimaryExpression1509 = new BitSet(new long[]{0x00000000001200F0L});
    public static final BitSet FOLLOW_ruleFunctionArgument_in_rulePrimaryExpression1530 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionArgument_in_entryRuleFunctionArgument1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionArgument1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleFunctionArgument1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionArgument1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionArgument1754 = new BitSet(new long[]{0x0000000000000002L});

}