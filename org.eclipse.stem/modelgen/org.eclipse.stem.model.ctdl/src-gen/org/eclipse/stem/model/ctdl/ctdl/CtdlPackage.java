/**
 */
package org.eclipse.stem.model.ctdl.ctdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.stem.model.ctdl.ctdl.CtdlFactory
 * @model kind="package"
 * @generated
 */
public interface CtdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ctdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http:///org/eclipse/stem/model/ctdl.ecore";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ctdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CtdlPackage eINSTANCE = org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentTransitionDefinitionsImpl <em>Compartment Transition Definitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentTransitionDefinitionsImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getCompartmentTransitionDefinitions()
   * @generated
   */
  int COMPARTMENT_TRANSITION_DEFINITIONS = 0;

  /**
   * The feature id for the '<em><b>Metamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Compartment Transition Definitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_TRANSITION_DEFINITIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.MetamodelResourceImpl <em>Metamodel Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.MetamodelResourceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getMetamodelResource()
   * @generated
   */
  int METAMODEL_RESOURCE = 1;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_RESOURCE__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_RESOURCE__MODEL = 1;

  /**
   * The feature id for the '<em><b>Transition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_RESOURCE__TRANSITION = 2;

  /**
   * The number of structural features of the '<em>Metamodel Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_RESOURCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.TransitionBlockImpl <em>Transition Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.TransitionBlockImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getTransitionBlock()
   * @generated
   */
  int TRANSITION_BLOCK = 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK__BLOCK = 0;

  /**
   * The number of structural features of the '<em>Transition Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.BlockImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 3;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = 0;

  /**
   * The feature id for the '<em><b>Ret</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__RET = 1;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementImpl <em>Def Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getDefStatement()
   * @generated
   */
  int DEF_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Varname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_STATEMENT__VARNAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_STATEMENT__EXPR = 1;

  /**
   * The number of structural features of the '<em>Def Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.ReturnStatementImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.EvaluationImpl <em>Evaluation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.EvaluationImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getEvaluation()
   * @generated
   */
  int EVALUATION = 6;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION__EXPRESSION = RETURN_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Evaluation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVALUATION_FEATURE_COUNT = RETURN_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.ExpressionImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 7;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXP = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.FunctionReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getFunctionReference()
   * @generated
   */
  int FUNCTION_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Function Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ScopedVariableReferenceImpl <em>Scoped Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.ScopedVariableReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getScopedVariableReference()
   * @generated
   */
  int SCOPED_VARIABLE_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPED_VARIABLE_REFERENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Scoped Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPED_VARIABLE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.LocalVariableReferenceImpl <em>Local Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.LocalVariableReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getLocalVariableReference()
   * @generated
   */
  int LOCAL_VARIABLE_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_REFERENCE__NAME = SCOPED_VARIABLE_REFERENCE__NAME;

  /**
   * The number of structural features of the '<em>Local Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_REFERENCE_FEATURE_COUNT = SCOPED_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentReferenceImpl <em>Compartment Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getCompartmentReference()
   * @generated
   */
  int COMPARTMENT_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_REFERENCE__NAME = SCOPED_VARIABLE_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_REFERENCE__OBJ = SCOPED_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Compartment Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARTMENT_REFERENCE_FEATURE_COUNT = SCOPED_VARIABLE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ModelParamReferenceImpl <em>Model Param Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.ModelParamReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getModelParamReference()
   * @generated
   */
  int MODEL_PARAM_REFERENCE = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PARAM_REFERENCE__NAME = SCOPED_VARIABLE_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PARAM_REFERENCE__OBJ = SCOPED_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model Param Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PARAM_REFERENCE_FEATURE_COUNT = SCOPED_VARIABLE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getGlobalVariable()
   * @generated
   */
  int GLOBAL_VARIABLE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Global Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.PlusImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 14;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.MinusImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 15;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.MultiImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 16;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.DivImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getDiv()
   * @generated
   */
  int DIV = 17;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.PrimaryExpressionImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getPrimaryExpression()
   * @generated
   */
  int PRIMARY_EXPRESSION = 18;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Negate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION__NEGATE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.NumberLiteralImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.FunctionCallImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 20;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.VariableReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 21;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__REF = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.BooleanLiteralImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.StringLiteralImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__EXP = EXPRESSION__EXP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ExternalFunctionReferenceImpl <em>External Function Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.ExternalFunctionReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getExternalFunctionReference()
   * @generated
   */
  int EXTERNAL_FUNCTION_REFERENCE = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_FUNCTION_REFERENCE__NAME = FUNCTION_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Func</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_FUNCTION_REFERENCE__FUNC = FUNCTION_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Function Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_FUNCTION_REFERENCE_FEATURE_COUNT = FUNCTION_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableReferenceImpl <em>Global Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getGlobalVariableReference()
   * @generated
   */
  int GLOBAL_VARIABLE_REFERENCE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE_REFERENCE__NAME = SCOPED_VARIABLE_REFERENCE__NAME;

  /**
   * The number of structural features of the '<em>Global Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_VARIABLE_REFERENCE_FEATURE_COUNT = SCOPED_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementReferenceImpl <em>Def Statement Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getDefStatementReference()
   * @generated
   */
  int DEF_STATEMENT_REFERENCE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_STATEMENT_REFERENCE__NAME = LOCAL_VARIABLE_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_STATEMENT_REFERENCE__OBJ = LOCAL_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Def Statement Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_STATEMENT_REFERENCE_FEATURE_COUNT = LOCAL_VARIABLE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.AbsoluteCompartmentValueReferenceImpl <em>Absolute Compartment Value Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.AbsoluteCompartmentValueReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getAbsoluteCompartmentValueReference()
   * @generated
   */
  int ABSOLUTE_COMPARTMENT_VALUE_REFERENCE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_COMPARTMENT_VALUE_REFERENCE__NAME = COMPARTMENT_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_COMPARTMENT_VALUE_REFERENCE__OBJ = COMPARTMENT_REFERENCE__OBJ;

  /**
   * The number of structural features of the '<em>Absolute Compartment Value Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSOLUTE_COMPARTMENT_VALUE_REFERENCE_FEATURE_COUNT = COMPARTMENT_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.RelativeCompartmentValueReferenceImpl <em>Relative Compartment Value Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.RelativeCompartmentValueReferenceImpl
   * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getRelativeCompartmentValueReference()
   * @generated
   */
  int RELATIVE_COMPARTMENT_VALUE_REFERENCE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_COMPARTMENT_VALUE_REFERENCE__NAME = COMPARTMENT_REFERENCE__NAME;

  /**
   * The feature id for the '<em><b>Obj</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_COMPARTMENT_VALUE_REFERENCE__OBJ = COMPARTMENT_REFERENCE__OBJ;

  /**
   * The number of structural features of the '<em>Relative Compartment Value Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIVE_COMPARTMENT_VALUE_REFERENCE_FEATURE_COUNT = COMPARTMENT_REFERENCE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions <em>Compartment Transition Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Transition Definitions</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions
   * @generated
   */
  EClass getCompartmentTransitionDefinitions();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getMetamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metamodel</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getMetamodel()
   * @see #getCompartmentTransitionDefinitions()
   * @generated
   */
  EReference getCompartmentTransitionDefinitions_Metamodel();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions#getExpression()
   * @see #getCompartmentTransitionDefinitions()
   * @generated
   */
  EReference getCompartmentTransitionDefinitions_Expression();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource <em>Metamodel Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel Resource</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.MetamodelResource
   * @generated
   */
  EClass getMetamodelResource();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Package</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getPackage()
   * @see #getMetamodelResource()
   * @generated
   */
  EReference getMetamodelResource_Package();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getModel()
   * @see #getMetamodelResource()
   * @generated
   */
  EReference getMetamodelResource_Model();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transition</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.MetamodelResource#getTransition()
   * @see #getMetamodelResource()
   * @generated
   */
  EReference getMetamodelResource_Transition();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.TransitionBlock <em>Transition Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Block</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.TransitionBlock
   * @generated
   */
  EClass getTransitionBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.TransitionBlock#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.TransitionBlock#getBlock()
   * @see #getTransitionBlock()
   * @generated
   */
  EReference getTransitionBlock_Block();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.ctdl.ctdl.Block#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Block#getStatements()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Statements();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Block#getRet <em>Ret</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ret</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Block#getRet()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Ret();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.DefStatement <em>Def Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Statement</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.DefStatement
   * @generated
   */
  EClass getDefStatement();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.DefStatement#getVarname <em>Varname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Varname</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.DefStatement#getVarname()
   * @see #getDefStatement()
   * @generated
   */
  EAttribute getDefStatement_Varname();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.DefStatement#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.DefStatement#getExpr()
   * @see #getDefStatement()
   * @generated
   */
  EReference getDefStatement_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.Evaluation <em>Evaluation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Evaluation</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Evaluation
   * @generated
   */
  EClass getEvaluation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Evaluation#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Evaluation#getExpression()
   * @see #getEvaluation()
   * @generated
   */
  EReference getEvaluation_Expression();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Expression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Expression#getExp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Exp();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.FunctionReference <em>Function Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.FunctionReference
   * @generated
   */
  EClass getFunctionReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.FunctionReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.FunctionReference#getName()
   * @see #getFunctionReference()
   * @generated
   */
  EAttribute getFunctionReference_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.ScopedVariableReference <em>Scoped Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scoped Variable Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.ScopedVariableReference
   * @generated
   */
  EClass getScopedVariableReference();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.ScopedVariableReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.ScopedVariableReference#getName()
   * @see #getScopedVariableReference()
   * @generated
   */
  EAttribute getScopedVariableReference_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.LocalVariableReference <em>Local Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.LocalVariableReference
   * @generated
   */
  EClass getLocalVariableReference();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentReference <em>Compartment Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compartment Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.CompartmentReference
   * @generated
   */
  EClass getCompartmentReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.CompartmentReference#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.CompartmentReference#getObj()
   * @see #getCompartmentReference()
   * @generated
   */
  EReference getCompartmentReference_Obj();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.ModelParamReference <em>Model Param Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Param Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.ModelParamReference
   * @generated
   */
  EClass getModelParamReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.ModelParamReference#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.ModelParamReference#getObj()
   * @see #getModelParamReference()
   * @generated
   */
  EReference getModelParamReference_Obj();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.GlobalVariable <em>Global Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Variable</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.GlobalVariable
   * @generated
   */
  EClass getGlobalVariable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.GlobalVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.GlobalVariable#getName()
   * @see #getGlobalVariable()
   * @generated
   */
  EAttribute getGlobalVariable_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.stem.model.ctdl.ctdl.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Expression</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression
   * @generated
   */
  EClass getPrimaryExpression();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression#isNegate <em>Negate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Negate</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.PrimaryExpression#isNegate()
   * @see #getPrimaryExpression()
   * @generated
   */
  EAttribute getPrimaryExpression_Negate();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.FunctionCall#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.FunctionCall#getRef()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Ref();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.stem.model.ctdl.ctdl.FunctionCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.FunctionCall#getArgs()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Args();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.VariableReference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.VariableReference#getRef()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Ref();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.stem.model.ctdl.ctdl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference <em>External Function Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Function Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference
   * @generated
   */
  EClass getExternalFunctionReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference#getFunc <em>Func</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Func</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference#getFunc()
   * @see #getExternalFunctionReference()
   * @generated
   */
  EReference getExternalFunctionReference_Func();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.GlobalVariableReference <em>Global Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Variable Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.GlobalVariableReference
   * @generated
   */
  EClass getGlobalVariableReference();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.DefStatementReference <em>Def Statement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Statement Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.DefStatementReference
   * @generated
   */
  EClass getDefStatementReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.stem.model.ctdl.ctdl.DefStatementReference#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obj</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.DefStatementReference#getObj()
   * @see #getDefStatementReference()
   * @generated
   */
  EReference getDefStatementReference_Obj();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.AbsoluteCompartmentValueReference <em>Absolute Compartment Value Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Absolute Compartment Value Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.AbsoluteCompartmentValueReference
   * @generated
   */
  EClass getAbsoluteCompartmentValueReference();

  /**
   * Returns the meta object for class '{@link org.eclipse.stem.model.ctdl.ctdl.RelativeCompartmentValueReference <em>Relative Compartment Value Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relative Compartment Value Reference</em>'.
   * @see org.eclipse.stem.model.ctdl.ctdl.RelativeCompartmentValueReference
   * @generated
   */
  EClass getRelativeCompartmentValueReference();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CtdlFactory getCtdlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentTransitionDefinitionsImpl <em>Compartment Transition Definitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentTransitionDefinitionsImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getCompartmentTransitionDefinitions()
     * @generated
     */
    EClass COMPARTMENT_TRANSITION_DEFINITIONS = eINSTANCE.getCompartmentTransitionDefinitions();

    /**
     * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_TRANSITION_DEFINITIONS__METAMODEL = eINSTANCE.getCompartmentTransitionDefinitions_Metamodel();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_TRANSITION_DEFINITIONS__EXPRESSION = eINSTANCE.getCompartmentTransitionDefinitions_Expression();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.MetamodelResourceImpl <em>Metamodel Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.MetamodelResourceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getMetamodelResource()
     * @generated
     */
    EClass METAMODEL_RESOURCE = eINSTANCE.getMetamodelResource();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL_RESOURCE__PACKAGE = eINSTANCE.getMetamodelResource_Package();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL_RESOURCE__MODEL = eINSTANCE.getMetamodelResource_Model();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL_RESOURCE__TRANSITION = eINSTANCE.getMetamodelResource_Transition();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.TransitionBlockImpl <em>Transition Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.TransitionBlockImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getTransitionBlock()
     * @generated
     */
    EClass TRANSITION_BLOCK = eINSTANCE.getTransitionBlock();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BLOCK__BLOCK = eINSTANCE.getTransitionBlock_Block();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.BlockImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

    /**
     * The meta object literal for the '<em><b>Ret</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__RET = eINSTANCE.getBlock_Ret();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementImpl <em>Def Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getDefStatement()
     * @generated
     */
    EClass DEF_STATEMENT = eINSTANCE.getDefStatement();

    /**
     * The meta object literal for the '<em><b>Varname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEF_STATEMENT__VARNAME = eINSTANCE.getDefStatement_Varname();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_STATEMENT__EXPR = eINSTANCE.getDefStatement_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.ReturnStatementImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.EvaluationImpl <em>Evaluation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.EvaluationImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getEvaluation()
     * @generated
     */
    EClass EVALUATION = eINSTANCE.getEvaluation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVALUATION__EXPRESSION = eINSTANCE.getEvaluation_Expression();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.ExpressionImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXP = eINSTANCE.getExpression_Exp();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.FunctionReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getFunctionReference()
     * @generated
     */
    EClass FUNCTION_REFERENCE = eINSTANCE.getFunctionReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_REFERENCE__NAME = eINSTANCE.getFunctionReference_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ScopedVariableReferenceImpl <em>Scoped Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.ScopedVariableReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getScopedVariableReference()
     * @generated
     */
    EClass SCOPED_VARIABLE_REFERENCE = eINSTANCE.getScopedVariableReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPED_VARIABLE_REFERENCE__NAME = eINSTANCE.getScopedVariableReference_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.LocalVariableReferenceImpl <em>Local Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.LocalVariableReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getLocalVariableReference()
     * @generated
     */
    EClass LOCAL_VARIABLE_REFERENCE = eINSTANCE.getLocalVariableReference();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentReferenceImpl <em>Compartment Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CompartmentReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getCompartmentReference()
     * @generated
     */
    EClass COMPARTMENT_REFERENCE = eINSTANCE.getCompartmentReference();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARTMENT_REFERENCE__OBJ = eINSTANCE.getCompartmentReference_Obj();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ModelParamReferenceImpl <em>Model Param Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.ModelParamReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getModelParamReference()
     * @generated
     */
    EClass MODEL_PARAM_REFERENCE = eINSTANCE.getModelParamReference();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_PARAM_REFERENCE__OBJ = eINSTANCE.getModelParamReference_Obj();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableImpl <em>Global Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getGlobalVariable()
     * @generated
     */
    EClass GLOBAL_VARIABLE = eINSTANCE.getGlobalVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_VARIABLE__NAME = eINSTANCE.getGlobalVariable_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.PlusImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.MinusImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.MultiImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.DivImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.PrimaryExpressionImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getPrimaryExpression()
     * @generated
     */
    EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

    /**
     * The meta object literal for the '<em><b>Negate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_EXPRESSION__NEGATE = eINSTANCE.getPrimaryExpression_Negate();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.NumberLiteralImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.FunctionCallImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__REF = eINSTANCE.getFunctionCall_Ref();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.VariableReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__REF = eINSTANCE.getVariableReference_Ref();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.BooleanLiteralImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.StringLiteralImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.ExternalFunctionReferenceImpl <em>External Function Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.ExternalFunctionReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getExternalFunctionReference()
     * @generated
     */
    EClass EXTERNAL_FUNCTION_REFERENCE = eINSTANCE.getExternalFunctionReference();

    /**
     * The meta object literal for the '<em><b>Func</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_FUNCTION_REFERENCE__FUNC = eINSTANCE.getExternalFunctionReference_Func();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableReferenceImpl <em>Global Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.GlobalVariableReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getGlobalVariableReference()
     * @generated
     */
    EClass GLOBAL_VARIABLE_REFERENCE = eINSTANCE.getGlobalVariableReference();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementReferenceImpl <em>Def Statement Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.DefStatementReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getDefStatementReference()
     * @generated
     */
    EClass DEF_STATEMENT_REFERENCE = eINSTANCE.getDefStatementReference();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_STATEMENT_REFERENCE__OBJ = eINSTANCE.getDefStatementReference_Obj();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.AbsoluteCompartmentValueReferenceImpl <em>Absolute Compartment Value Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.AbsoluteCompartmentValueReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getAbsoluteCompartmentValueReference()
     * @generated
     */
    EClass ABSOLUTE_COMPARTMENT_VALUE_REFERENCE = eINSTANCE.getAbsoluteCompartmentValueReference();

    /**
     * The meta object literal for the '{@link org.eclipse.stem.model.ctdl.ctdl.impl.RelativeCompartmentValueReferenceImpl <em>Relative Compartment Value Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.RelativeCompartmentValueReferenceImpl
     * @see org.eclipse.stem.model.ctdl.ctdl.impl.CtdlPackageImpl#getRelativeCompartmentValueReference()
     * @generated
     */
    EClass RELATIVE_COMPARTMENT_VALUE_REFERENCE = eINSTANCE.getRelativeCompartmentValueReference();

  }

} //CtdlPackage
