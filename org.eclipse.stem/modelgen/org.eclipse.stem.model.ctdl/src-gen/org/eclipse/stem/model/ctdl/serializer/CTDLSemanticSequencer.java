package org.eclipse.stem.model.ctdl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.model.ctdl.ctdl.AbsoluteCompartmentValueReference;
import org.eclipse.stem.model.ctdl.ctdl.Block;
import org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentReference;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions;
import org.eclipse.stem.model.ctdl.ctdl.CtdlPackage;
import org.eclipse.stem.model.ctdl.ctdl.DefStatement;
import org.eclipse.stem.model.ctdl.ctdl.DefStatementReference;
import org.eclipse.stem.model.ctdl.ctdl.Div;
import org.eclipse.stem.model.ctdl.ctdl.Evaluation;
import org.eclipse.stem.model.ctdl.ctdl.Expression;
import org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference;
import org.eclipse.stem.model.ctdl.ctdl.FunctionCall;
import org.eclipse.stem.model.ctdl.ctdl.FunctionReference;
import org.eclipse.stem.model.ctdl.ctdl.GlobalVariable;
import org.eclipse.stem.model.ctdl.ctdl.GlobalVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.LocalVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.MetamodelResource;
import org.eclipse.stem.model.ctdl.ctdl.Minus;
import org.eclipse.stem.model.ctdl.ctdl.ModelParamReference;
import org.eclipse.stem.model.ctdl.ctdl.Multi;
import org.eclipse.stem.model.ctdl.ctdl.NumberLiteral;
import org.eclipse.stem.model.ctdl.ctdl.Plus;
import org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression;
import org.eclipse.stem.model.ctdl.ctdl.RelativeCompartmentValueReference;
import org.eclipse.stem.model.ctdl.ctdl.ScopedVariableReference;
import org.eclipse.stem.model.ctdl.ctdl.StringLiteral;
import org.eclipse.stem.model.ctdl.ctdl.TransitionBlock;
import org.eclipse.stem.model.ctdl.ctdl.VariableReference;
import org.eclipse.stem.model.ctdl.services.CTDLGrammarAccess;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.MetamodelPackage;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CTDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CTDLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CtdlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CtdlPackage.ABSOLUTE_COMPARTMENT_VALUE_REFERENCE:
				if(context == grammarAccess.getCompartmentReferenceRule()) {
					sequence_CompartmentReference(context, (AbsoluteCompartmentValueReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.BLOCK:
				if(context == grammarAccess.getBlockRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getFunctionArgumentRule()) {
					sequence_FunctionArgument(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.COMPARTMENT_REFERENCE:
				if(context == grammarAccess.getCompartmentReferenceRule()) {
					sequence_CompartmentReference(context, (CompartmentReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScopedVariableReferenceRule()) {
					sequence_ScopedVariableReference(context, (CompartmentReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS:
				if(context == grammarAccess.getCompartmentTransitionDefinitionsRule()) {
					sequence_CompartmentTransitionDefinitions(context, (CompartmentTransitionDefinitions) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.DEF_STATEMENT:
				if(context == grammarAccess.getDefStatementRule()) {
					sequence_DefStatement(context, (DefStatement) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.DEF_STATEMENT_REFERENCE:
				if(context == grammarAccess.getLocalVariableReferenceRule()) {
					sequence_LocalVariableReference(context, (DefStatementReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.DIV:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionArgumentRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.EVALUATION:
				if(context == grammarAccess.getEvaluationRule() ||
				   context == grammarAccess.getReturnStatementRule()) {
					sequence_Evaluation(context, (Evaluation) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.EXPRESSION:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.EXTERNAL_FUNCTION_REFERENCE:
				if(context == grammarAccess.getFunctionReferenceRule()) {
					sequence_FunctionReference(context, (ExternalFunctionReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.FUNCTION_CALL:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (FunctionCall) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.FUNCTION_REFERENCE:
				if(context == grammarAccess.getFunctionReferenceRule()) {
					sequence_FunctionReference(context, (FunctionReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.GLOBAL_VARIABLE:
				if(context == grammarAccess.getGlobalVariableRule()) {
					sequence_GlobalVariable(context, (GlobalVariable) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.GLOBAL_VARIABLE_REFERENCE:
				if(context == grammarAccess.getScopedVariableReferenceRule()) {
					sequence_ScopedVariableReference(context, (GlobalVariableReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.LOCAL_VARIABLE_REFERENCE:
				if(context == grammarAccess.getScopedVariableReferenceRule()) {
					sequence_ScopedVariableReference(context, (LocalVariableReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.METAMODEL_RESOURCE:
				if(context == grammarAccess.getMetamodelResourceRule()) {
					sequence_MetamodelResource(context, (MetamodelResource) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.MINUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionArgumentRule()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.MODEL_PARAM_REFERENCE:
				if(context == grammarAccess.getModelParamReferenceRule()) {
					sequence_ModelParamReference(context, (ModelParamReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getScopedVariableReferenceRule()) {
					sequence_ScopedVariableReference(context, (ModelParamReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.MULTI:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionArgumentRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.PLUS:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionArgumentRule()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.PRIMARY_EXPRESSION:
				if(context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionArgumentRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNegatedExpressionRule()) {
					sequence_NegatedExpression(context, (PrimaryExpression) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.RELATIVE_COMPARTMENT_VALUE_REFERENCE:
				if(context == grammarAccess.getCompartmentReferenceRule()) {
					sequence_CompartmentReference(context, (RelativeCompartmentValueReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.SCOPED_VARIABLE_REFERENCE:
				if(context == grammarAccess.getScopedVariableReferenceRule()) {
					sequence_ScopedVariableReference(context, (ScopedVariableReference) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.STRING_LITERAL:
				if(context == grammarAccess.getFunctionArgumentRule()) {
					sequence_FunctionArgument(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.TRANSITION_BLOCK:
				if(context == grammarAccess.getTransitionBlockRule()) {
					sequence_TransitionBlock(context, (TransitionBlock) semanticObject); 
					return; 
				}
				else break;
			case CtdlPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PrimaryExpression(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == MetamodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MetamodelPackage.COMPARTMENT:
				if(context == grammarAccess.getCompartmentRule()) {
					sequence_Compartment(context, (Compartment) semanticObject); 
					return; 
				}
				else break;
			case MetamodelPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statements+=DefStatement* ret=ReturnStatement)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AbsoluteCompartmentValueReference}
	 */
	protected void sequence_CompartmentReference(EObject context, AbsoluteCompartmentValueReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     obj=[Compartment|ID]
	 */
	protected void sequence_CompartmentReference(EObject context, CompartmentReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RelativeCompartmentValueReference}
	 */
	protected void sequence_CompartmentReference(EObject context, RelativeCompartmentValueReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (metamodel=[MetamodelResource|ID]? expression=TransitionBlock)
	 */
	protected void sequence_CompartmentTransitionDefinitions(EObject context, CompartmentTransitionDefinitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Compartment(EObject context, Compartment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varname=ID expr=Evaluation)
	 */
	protected void sequence_DefStatement(EObject context, DefStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.DEF_STATEMENT__VARNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.DEF_STATEMENT__VARNAME));
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.DEF_STATEMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.DEF_STATEMENT__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefStatementAccess().getVarnameIDTerminalRuleCall_0_0(), semanticObject.getVarname());
		feeder.accept(grammarAccess.getDefStatementAccess().getExprEvaluationParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Evaluation(EObject context, Evaluation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.EVALUATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.EVALUATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEvaluationAccess().getExpressionExpressionParserRuleCall_0_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_FunctionArgument(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_FunctionArgument(EObject context, StringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     func=[ExternalFunctionDefinition|ID]
	 */
	protected void sequence_FunctionReference(EObject context, ExternalFunctionReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_FunctionReference(EObject context, FunctionReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.FUNCTION_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.FUNCTION_REFERENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionReferenceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_GlobalVariable(EObject context, GlobalVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.GLOBAL_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.GLOBAL_VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGlobalVariableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     obj=[DefStatement|ID]
	 */
	protected void sequence_LocalVariableReference(EObject context, DefStatementReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (package=[Package|STRING] model=[Model|ID] transition=[Transition|ID])
	 */
	protected void sequence_MetamodelResource(EObject context, MetamodelResource semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.METAMODEL_RESOURCE__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.METAMODEL_RESOURCE__PACKAGE));
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.METAMODEL_RESOURCE__MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.METAMODEL_RESOURCE__MODEL));
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.METAMODEL_RESOURCE__TRANSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.METAMODEL_RESOURCE__TRANSITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMetamodelResourceAccess().getPackagePackageSTRINGTerminalRuleCall_1_0_1(), semanticObject.getPackage());
		feeder.accept(grammarAccess.getMetamodelResourceAccess().getModelModelIDTerminalRuleCall_3_0_1(), semanticObject.getModel());
		feeder.accept(grammarAccess.getMetamodelResourceAccess().getTransitionTransitionIDTerminalRuleCall_5_0_1(), semanticObject.getTransition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     obj=[ModelParam|ID]
	 */
	protected void sequence_ModelParamReference(EObject context, ModelParamReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=NegatedExpression)
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=NegatedExpression)
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (negate?='-'? exp=PrimaryExpression)
	 */
	protected void sequence_NegatedExpression(EObject context, PrimaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_PrimaryExpression(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.EXPRESSION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.EXPRESSION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryExpressionAccess().getExpExpressionParserRuleCall_1_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[FunctionReference|ID] args+=FunctionArgument? args+=FunctionArgument*)
	 */
	protected void sequence_PrimaryExpression(EObject context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_PrimaryExpression(EObject context, NumberLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[ScopedVariableReference|ID]
	 */
	protected void sequence_PrimaryExpression(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {CompartmentReference}
	 */
	protected void sequence_ScopedVariableReference(EObject context, CompartmentReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {GlobalVariableReference}
	 */
	protected void sequence_ScopedVariableReference(EObject context, GlobalVariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LocalVariableReference}
	 */
	protected void sequence_ScopedVariableReference(EObject context, LocalVariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ModelParamReference}
	 */
	protected void sequence_ScopedVariableReference(EObject context, ModelParamReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ScopedVariableReference(EObject context, ScopedVariableReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.SCOPED_VARIABLE_REFERENCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.SCOPED_VARIABLE_REFERENCE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScopedVariableReferenceAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_TransitionBlock(EObject context, TransitionBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CtdlPackage.Literals.TRANSITION_BLOCK__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CtdlPackage.Literals.TRANSITION_BLOCK__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionBlockAccess().getBlockBlockParserRuleCall_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (source=[Compartment|ID] target=[Compartment|ID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
