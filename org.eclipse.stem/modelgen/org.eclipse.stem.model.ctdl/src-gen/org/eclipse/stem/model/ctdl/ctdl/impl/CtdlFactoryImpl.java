/**
 */
package org.eclipse.stem.model.ctdl.ctdl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.stem.model.ctdl.ctdl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtdlFactoryImpl extends EFactoryImpl implements CtdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CtdlFactory init()
  {
    try
    {
      CtdlFactory theCtdlFactory = (CtdlFactory)EPackage.Registry.INSTANCE.getEFactory(CtdlPackage.eNS_URI);
      if (theCtdlFactory != null)
      {
        return theCtdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CtdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CtdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CtdlPackage.COMPARTMENT_TRANSITION_DEFINITIONS: return createCompartmentTransitionDefinitions();
      case CtdlPackage.METAMODEL_RESOURCE: return createMetamodelResource();
      case CtdlPackage.TRANSITION_BLOCK: return createTransitionBlock();
      case CtdlPackage.BLOCK: return createBlock();
      case CtdlPackage.DEF_STATEMENT: return createDefStatement();
      case CtdlPackage.RETURN_STATEMENT: return createReturnStatement();
      case CtdlPackage.EVALUATION: return createEvaluation();
      case CtdlPackage.EXPRESSION: return createExpression();
      case CtdlPackage.FUNCTION_REFERENCE: return createFunctionReference();
      case CtdlPackage.SCOPED_VARIABLE_REFERENCE: return createScopedVariableReference();
      case CtdlPackage.LOCAL_VARIABLE_REFERENCE: return createLocalVariableReference();
      case CtdlPackage.COMPARTMENT_REFERENCE: return createCompartmentReference();
      case CtdlPackage.MODEL_PARAM_REFERENCE: return createModelParamReference();
      case CtdlPackage.GLOBAL_VARIABLE: return createGlobalVariable();
      case CtdlPackage.PLUS: return createPlus();
      case CtdlPackage.MINUS: return createMinus();
      case CtdlPackage.MULTI: return createMulti();
      case CtdlPackage.DIV: return createDiv();
      case CtdlPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case CtdlPackage.NUMBER_LITERAL: return createNumberLiteral();
      case CtdlPackage.FUNCTION_CALL: return createFunctionCall();
      case CtdlPackage.VARIABLE_REFERENCE: return createVariableReference();
      case CtdlPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case CtdlPackage.STRING_LITERAL: return createStringLiteral();
      case CtdlPackage.EXTERNAL_FUNCTION_REFERENCE: return createExternalFunctionReference();
      case CtdlPackage.GLOBAL_VARIABLE_REFERENCE: return createGlobalVariableReference();
      case CtdlPackage.DEF_STATEMENT_REFERENCE: return createDefStatementReference();
      case CtdlPackage.ABSOLUTE_COMPARTMENT_VALUE_REFERENCE: return createAbsoluteCompartmentValueReference();
      case CtdlPackage.RELATIVE_COMPARTMENT_VALUE_REFERENCE: return createRelativeCompartmentValueReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentTransitionDefinitions createCompartmentTransitionDefinitions()
  {
    CompartmentTransitionDefinitionsImpl compartmentTransitionDefinitions = new CompartmentTransitionDefinitionsImpl();
    return compartmentTransitionDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetamodelResource createMetamodelResource()
  {
    MetamodelResourceImpl metamodelResource = new MetamodelResourceImpl();
    return metamodelResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionBlock createTransitionBlock()
  {
    TransitionBlockImpl transitionBlock = new TransitionBlockImpl();
    return transitionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefStatement createDefStatement()
  {
    DefStatementImpl defStatement = new DefStatementImpl();
    return defStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Evaluation createEvaluation()
  {
    EvaluationImpl evaluation = new EvaluationImpl();
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionReference createFunctionReference()
  {
    FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
    return functionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopedVariableReference createScopedVariableReference()
  {
    ScopedVariableReferenceImpl scopedVariableReference = new ScopedVariableReferenceImpl();
    return scopedVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariableReference createLocalVariableReference()
  {
    LocalVariableReferenceImpl localVariableReference = new LocalVariableReferenceImpl();
    return localVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompartmentReference createCompartmentReference()
  {
    CompartmentReferenceImpl compartmentReference = new CompartmentReferenceImpl();
    return compartmentReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelParamReference createModelParamReference()
  {
    ModelParamReferenceImpl modelParamReference = new ModelParamReferenceImpl();
    return modelParamReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalVariable createGlobalVariable()
  {
    GlobalVariableImpl globalVariable = new GlobalVariableImpl();
    return globalVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalFunctionReference createExternalFunctionReference()
  {
    ExternalFunctionReferenceImpl externalFunctionReference = new ExternalFunctionReferenceImpl();
    return externalFunctionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalVariableReference createGlobalVariableReference()
  {
    GlobalVariableReferenceImpl globalVariableReference = new GlobalVariableReferenceImpl();
    return globalVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefStatementReference createDefStatementReference()
  {
    DefStatementReferenceImpl defStatementReference = new DefStatementReferenceImpl();
    return defStatementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbsoluteCompartmentValueReference createAbsoluteCompartmentValueReference()
  {
    AbsoluteCompartmentValueReferenceImpl absoluteCompartmentValueReference = new AbsoluteCompartmentValueReferenceImpl();
    return absoluteCompartmentValueReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelativeCompartmentValueReference createRelativeCompartmentValueReference()
  {
    RelativeCompartmentValueReferenceImpl relativeCompartmentValueReference = new RelativeCompartmentValueReferenceImpl();
    return relativeCompartmentValueReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CtdlPackage getCtdlPackage()
  {
    return (CtdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CtdlPackage getPackage()
  {
    return CtdlPackage.eINSTANCE;
  }

} //CtdlFactoryImpl
