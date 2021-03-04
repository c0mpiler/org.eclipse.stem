/*
* generated by Xtext
*/
grammar InternalCTDL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.eclipse.stem.model.ctdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleCompartmentTransitionDefinitions
entryRuleCompartmentTransitionDefinitions returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCompartmentTransitionDefinitionsRule()); }
	 iv_ruleCompartmentTransitionDefinitions=ruleCompartmentTransitionDefinitions 
	 { $current=$iv_ruleCompartmentTransitionDefinitions.current; } 
	 EOF 
;

// Rule CompartmentTransitionDefinitions
ruleCompartmentTransitionDefinitions returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getCompartmentTransitionDefinitionsRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getCompartmentTransitionDefinitionsAccess().getMetamodelMetamodelResourceCrossReference_0_0()); 
	}

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getCompartmentTransitionDefinitionsAccess().getExpressionTransitionBlockParserRuleCall_1_0()); 
	    }
		lv_expression_1_0=ruleTransitionBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCompartmentTransitionDefinitionsRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_1_0, 
        		"TransitionBlock");
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleTransitionBlock
entryRuleTransitionBlock returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransitionBlockRule()); }
	 iv_ruleTransitionBlock=ruleTransitionBlock 
	 { $current=$iv_ruleTransitionBlock.current; } 
	 EOF 
;

// Rule TransitionBlock
ruleTransitionBlock returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getTransitionBlockAccess().getBlockBlockParserRuleCall_0()); 
	    }
		lv_block_0_0=ruleBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTransitionBlockRule());
	        }
       		set(
       			$current, 
       			"block",
        		lv_block_0_0, 
        		"Block");
	        afterParserOrEnumRuleCall();
	    }

)
)
;









// Entry rule entryRuleBlock
entryRuleBlock returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBlockRule()); }
	 iv_ruleBlock=ruleBlock 
	 { $current=$iv_ruleBlock.current; } 
	 EOF 
;

// Rule Block
ruleBlock returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getBlockAccess().getBlockAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getBlockAccess().getStatementsDefStatementParserRuleCall_1_0()); 
	    }
		lv_statements_1_0=ruleDefStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBlockRule());
	        }
       		add(
       			$current, 
       			"statements",
        		lv_statements_1_0, 
        		"DefStatement");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getBlockAccess().getRetReturnStatementParserRuleCall_2_0()); 
	    }
		lv_ret_2_0=ruleReturnStatement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBlockRule());
	        }
       		set(
       			$current, 
       			"ret",
        		lv_ret_2_0, 
        		"ReturnStatement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleDefStatement
entryRuleDefStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefStatementRule()); }
	 iv_ruleDefStatement=ruleDefStatement 
	 { $current=$iv_ruleDefStatement.current; } 
	 EOF 
;

// Rule DefStatement
ruleDefStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_varname_0_0=RULE_ID
		{
			newLeafNode(lv_varname_0_0, grammarAccess.getDefStatementAccess().getVarnameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefStatementRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"varname",
        		lv_varname_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getDefStatementAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefStatementAccess().getExprEvaluationParserRuleCall_2_0()); 
	    }
		lv_expr_2_0=ruleEvaluation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefStatementRule());
	        }
       		set(
       			$current, 
       			"expr",
        		lv_expr_2_0, 
        		"Evaluation");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleReturnStatement
entryRuleReturnStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReturnStatementRule()); }
	 iv_ruleReturnStatement=ruleReturnStatement 
	 { $current=$iv_ruleReturnStatement.current; } 
	 EOF 
;

// Rule ReturnStatement
ruleReturnStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='delta' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getDeltaKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getReturnStatementAccess().getEvaluationParserRuleCall_1()); 
    }
    this_Evaluation_1=ruleEvaluation
    { 
        $current = $this_Evaluation_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEvaluation
entryRuleEvaluation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEvaluationRule()); }
	 iv_ruleEvaluation=ruleEvaluation 
	 { $current=$iv_ruleEvaluation.current; } 
	 EOF 
;

// Rule Evaluation
ruleEvaluation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0()); 
	    }
		lv_expression_0_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEvaluationRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_0_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=';' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getSemicolonKeyword_1());
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
    }
    this_Addition_0=ruleAddition
    { 
        $current = $this_Addition_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	 iv_ruleAddition=ruleAddition 
	 { $current=$iv_ruleAddition.current; } 
	 EOF 
;

// Rule Addition
ruleAddition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
    }
    this_Multiplication_0=ruleMultiplication
    { 
        $current = $this_Multiplication_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
    }
)
    |((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='-' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
	    }
		lv_right_5_0=ruleMultiplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAdditionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"Multiplication");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	 iv_ruleMultiplication=ruleMultiplication 
	 { $current=$iv_ruleMultiplication.current; } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMultiplicationAccess().getNegatedExpressionParserRuleCall_0()); 
    }
    this_NegatedExpression_0=ruleNegatedExpression
    { 
        $current = $this_NegatedExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='*' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
    }
)
    |((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='/' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNegatedExpressionParserRuleCall_1_1_0()); 
	    }
		lv_right_5_0=ruleNegatedExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"NegatedExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleNegatedExpression
entryRuleNegatedExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNegatedExpressionRule()); }
	 iv_ruleNegatedExpression=ruleNegatedExpression 
	 { $current=$iv_ruleNegatedExpression.current; } 
	 EOF 
;

// Rule NegatedExpression
ruleNegatedExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getNegatedExpressionAccess().getPrimaryExpressionAction_0(),
            $current);
    }
)(
(
		lv_negate_1_0=	'-' 
    {
        newLeafNode(lv_negate_1_0, grammarAccess.getNegatedExpressionAccess().getNegateHyphenMinusKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNegatedExpressionRule());
	        }
       		setWithLastConsumed($current, "negate", true, "-");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNegatedExpressionAccess().getExpPrimaryExpressionParserRuleCall_2_0()); 
	    }
		lv_exp_2_0=rulePrimaryExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNegatedExpressionRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_2_0, 
        		"PrimaryExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	 iv_rulePrimaryExpression=rulePrimaryExpression 
	 { $current=$iv_rulePrimaryExpression.current; } 
	 EOF 
;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_0_0(),
            $current);
    }
)(
(
		lv_value_1_0=RULE_NUMBER
		{
			newLeafNode(lv_value_1_0, grammarAccess.getPrimaryExpressionAccess().getValueNUMBERTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryExpressionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"NUMBER");
	    }

)
))
    |(	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpExpressionParserRuleCall_1_1_0()); 
	    }
		lv_exp_3_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
	        }
       		set(
       			$current, 
       			"exp",
        		lv_exp_3_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
    }
)
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryExpressionAccess().getFunctionCallAction_2_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryExpressionRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRefFunctionReferenceCrossReference_2_1_0()); 
	}

)
)(	otherlv_7='(' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_1_0()); 
	    }
		lv_args_8_0=ruleFunctionArgument		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_8_0, 
        		"FunctionArgument");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getCommaKeyword_2_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsFunctionArgumentParserRuleCall_2_2_2_1_0()); 
	    }
		lv_args_10_0=ruleFunctionArgument		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
	        }
       		add(
       			$current, 
       			"args",
        		lv_args_10_0, 
        		"FunctionArgument");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_11=')' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2_3());
    }
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_3_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getPrimaryExpressionRule());
	        }
        }
	otherlv_13=RULE_ID
	{
		newLeafNode(otherlv_13, grammarAccess.getPrimaryExpressionAccess().getRefScopedVariableReferenceCrossReference_3_1_0()); 
	}

)
)))
;





// Entry rule entryRuleFunctionArgument
entryRuleFunctionArgument returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionArgumentRule()); }
	 iv_ruleFunctionArgument=ruleFunctionArgument 
	 { $current=$iv_ruleFunctionArgument.current; } 
	 EOF 
;

// Rule FunctionArgument
ruleFunctionArgument returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFunctionArgumentAccess().getBooleanLiteralAction_0_0(),
            $current);
    }
)(
(
		lv_value_1_0=RULE_BOOLEAN
		{
			newLeafNode(lv_value_1_0, grammarAccess.getFunctionArgumentAccess().getValueBOOLEANTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionArgumentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"BOOLEAN");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFunctionArgumentAccess().getStringLiteralAction_1_0(),
            $current);
    }
)(
(
		lv_value_3_0=RULE_STRING
		{
			newLeafNode(lv_value_3_0, grammarAccess.getFunctionArgumentAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionArgumentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"STRING");
	    }

)
))
    |
    { 
        newCompositeNode(grammarAccess.getFunctionArgumentAccess().getExpressionParserRuleCall_2()); 
    }
    this_Expression_4=ruleExpression
    { 
        $current = $this_Expression_4.current; 
        afterParserOrEnumRuleCall();
    }
)
;

















RULE_BOOLEAN : ('true'|'false');

RULE_NUMBER : (('0'..'9')+ ('.' ('0'..'9')*)?|'.' ('0'..'9')+) (('e'|'E') ('+'|'-')? ('0'..'9')+)?;

RULE_INT : 'this one has been deactivated';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

