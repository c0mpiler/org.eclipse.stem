/**
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation and new features
 *     Bundesinstitut für Risikobewertung - Pajek Graph interface, new Veterinary Models
 */
package org.eclipse.stem.model.codegen.xtext;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.stem.model.codegen.xtext.ModelExpressionGenerator;
import org.eclipse.stem.model.ctdl.ContextSensitiveResourceWrapper;
import org.eclipse.stem.model.ctdl.ctdl.AbsoluteCompartmentValueReference;
import org.eclipse.stem.model.ctdl.ctdl.BooleanLiteral;
import org.eclipse.stem.model.ctdl.ctdl.CompartmentTransitionDefinitions;
import org.eclipse.stem.model.ctdl.ctdl.DefStatement;
import org.eclipse.stem.model.ctdl.ctdl.Div;
import org.eclipse.stem.model.ctdl.ctdl.Evaluation;
import org.eclipse.stem.model.ctdl.ctdl.Expression;
import org.eclipse.stem.model.ctdl.ctdl.ExternalFunctionReference;
import org.eclipse.stem.model.ctdl.ctdl.FunctionCall;
import org.eclipse.stem.model.ctdl.ctdl.FunctionReference;
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
import org.eclipse.stem.model.ctdl.functions.FunctionArgumentReference;
import org.eclipse.stem.model.ctdl.functions.JavaMethodArgument;
import org.eclipse.stem.model.ctdl.functions.SystemArgumentReference;
import org.eclipse.stem.model.ctdl.serializer.ITypeSerializer;
import org.eclipse.stem.model.ctdl.serializer.TypeSerializerFactory;
import org.eclipse.stem.model.metamodel.Compartment;
import org.eclipse.stem.model.metamodel.Transition;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ExpressionsClassGenerator extends ModelExpressionGenerator {
  @Override
  public void doGenerate(final List<XtextResource> resources, final IFileSystemAccess fsa) {
    String _name = this.modelGenClass.getName();
    String fileName = (_name + "Expressions.java");
    fsa.generateFile(fileName, this.build(resources));
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    CompartmentTransitionDefinitions ctd = IterableExtensions.<CompartmentTransitionDefinitions>head(Iterables.<CompartmentTransitionDefinitions>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), CompartmentTransitionDefinitions.class));
    MetamodelResource mm = ctd.getMetamodel();
    Transition trans = mm.getTransition();
    String _name = trans.getSource().getName();
    String _plus = (_name + "_");
    String _name_1 = trans.getTarget().getName();
    String fname = (_plus + _name_1);
    fsa.generateFile(fname, this.compile(resource));
  }
  
  public CharSequence build(final List<XtextResource> r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _classPackageName = this.modelGenClass.getGenPackage().getClassPackageName();
    _builder.append(_classPackageName);
    _builder.append(";");
    String pkg = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\t\t");
    _builder_1.append("/**");
    _builder_1.newLine();
    _builder_1.append("\t\t ");
    _builder_1.append("* Generated expressions class for  ");
    String _name = this.modelGenClass.getName();
    _builder_1.append(_name, "\t\t ");
    _builder_1.append(".");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t\t ");
    _builder_1.append("* DO NOT EDIT DIRECTLY.  Use extended class and override methods for transitions as desired.");
    _builder_1.newLine();
    _builder_1.append("\t\t ");
    _builder_1.append("* @generated");
    _builder_1.newLine();
    _builder_1.append("\t\t ");
    _builder_1.append("*/");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("public class ");
    String _name_1 = this.modelGenClass.getName();
    _builder_1.append(_name_1, "\t\t");
    _builder_1.append("Expressions {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t");
    _builder_1.append("public void calculate(double t, long timeDelta, ");
    String _importedName = this.getImportedName("org.eclipse.stem.core.model.STEMTime");
    _builder_1.append(_importedName, "\t");
    _builder_1.append(" time, ");
    String _importGenClassInterface = this.importGenClassInterface(this.modelGenClass);
    _builder_1.append(_importGenClassInterface, "\t");
    _builder_1.append(" model, ");
    String _importGenClassInterface_1 = this.importGenClassInterface(this.labelGenClass);
    _builder_1.append(_importGenClassInterface_1, "\t");
    _builder_1.append(" label, ");
    String _importGenClassInterface_2 = this.importGenClassInterface(this.labelValueGenClass);
    _builder_1.append(_importGenClassInterface_2, "\t");
    _builder_1.append(" labelValue, ");
    String _importedName_1 = this.getImportedName("org.eclipse.stem.core.graph.Node");
    _builder_1.append(_importedName_1, "\t");
    _builder_1.append(" node, ");
    String _importGenClassInterface_3 = this.importGenClassInterface(this.labelValueGenClass);
    _builder_1.append(_importGenClassInterface_3, "\t");
    _builder_1.append(" deltaValue) {");
    _builder_1.newLineIfNotEmpty();
    {
      Set<Compartment> _affectedCompartments = this.getAffectedCompartments(r);
      for(final Compartment s : _affectedCompartments) {
        _builder_1.append("\t\t");
        _builder_1.append("double delta");
        String _accessorName = this.getAccessorName(s);
        _builder_1.append(_accessorName, "\t\t");
        _builder_1.append(" = 0.0;");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("\t\t");
    _builder_1.newLine();
    {
      Iterable<ContextSensitiveResourceWrapper> _filter = Iterables.<ContextSensitiveResourceWrapper>filter(r, ContextSensitiveResourceWrapper.class);
      for(final ContextSensitiveResourceWrapper s_1 : _filter) {
        _builder_1.append("\t\t");
        _builder_1.append("// Calculate delta for transition ");
        String _formattedName = this.getFormattedName(s_1.getTransition());
        _builder_1.append(_formattedName, "\t\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("double generated_");
        String _methodName = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName, "\t\t");
        _builder_1.append(" = ");
        String _methodName_1 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_1, "\t\t");
        _builder_1.append("(t,timeDelta,time,model,label,labelValue,label.getNode());");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("delta");
        String _accessorName_1 = this.getAccessorName(s_1.getTransition().getSource());
        _builder_1.append(_accessorName_1, "\t\t");
        _builder_1.append(" -= generated_");
        String _methodName_2 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_2, "\t\t");
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("delta");
        String _accessorName_2 = this.getAccessorName(s_1.getTransition().getTarget());
        _builder_1.append(_accessorName_2, "\t\t");
        _builder_1.append(" += generated_");
        String _methodName_3 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_3, "\t\t");
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        {
          EList<Compartment> _forIncidence = s_1.getTransition().getForIncidence();
          for(final Compartment c : _forIncidence) {
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("delta");
            String _accessorName_3 = this.getAccessorName(c);
            _builder_1.append(_accessorName_3, "\t\t\t");
            _builder_1.append(" += generated_");
            String _methodName_4 = this.getMethodName(s_1.getTransition());
            _builder_1.append(_methodName_4, "\t\t\t");
            _builder_1.append(";");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("\t\t");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("\t");
        _builder_1.append("// Stochastic exchange for ");
        String _formattedName_1 = this.getFormattedName(s_1.getTransition());
        _builder_1.append(_formattedName_1, "\t\t\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("\t");
        String _importedName_2 = this.getImportedName("org.eclipse.stem.core.graph.Exchange");
        _builder_1.append(_importedName_2, "\t\t\t");
        _builder_1.append(" exchange_");
        String _methodName_5 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_5, "\t\t\t");
        _builder_1.append(" = (");
        String _importedName_3 = this.getImportedName("org.eclipse.stem.core.graph.Exchange");
        _builder_1.append(_importedName_3, "\t\t\t");
        _builder_1.append(")");
        String _importedName_4 = this.getImportedName("org.eclipse.stem.core.graph.ExchangePool");
        _builder_1.append(_importedName_4, "\t\t\t");
        _builder_1.append(".POOL.get();");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("\t");
        _builder_1.append("deltaValue.getDepartures().add(exchange_");
        String _methodName_6 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_6, "\t\t\t");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("\t");
        _builder_1.append("exchange_");
        String _methodName_7 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_7, "\t\t\t");
        _builder_1.append(".setType(");
        String _importedName_5 = this.getImportedName("org.eclipse.stem.core.graph.ExchangeType");
        _builder_1.append(_importedName_5, "\t\t\t");
        _builder_1.append(".COMPARTMENT_TRANSITION);");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("\t");
        _builder_1.append("exchange_");
        String _methodName_8 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_8, "\t\t\t");
        _builder_1.append(".setSource(");
        String _packageAccessorName = this.getPackageAccessorName(this.getGenFeature(s_1.getTransition().getSource()));
        _builder_1.append(_packageAccessorName, "\t\t\t");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("\t");
        _builder_1.append("exchange_");
        String _methodName_9 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_9, "\t\t\t");
        _builder_1.append(".setTarget(");
        String _packageAccessorName_1 = this.getPackageAccessorName(this.getGenFeature(s_1.getTransition().getTarget()));
        _builder_1.append(_packageAccessorName_1, "\t\t\t");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t");
        _builder_1.append("\t");
        _builder_1.append("exchange_");
        String _methodName_10 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_10, "\t\t\t");
        _builder_1.append(".setCount(generated_");
        String _methodName_11 = this.getMethodName(s_1.getTransition());
        _builder_1.append(_methodName_11, "\t\t\t");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        {
          EList<Compartment> _forIncidence_1 = s_1.getTransition().getForIncidence();
          for(final Compartment c_1 : _forIncidence_1) {
            _builder_1.append("\t\t");
            _builder_1.append("\t");
            _builder_1.append("exchange_");
            String _methodName_12 = this.getMethodName(s_1.getTransition());
            _builder_1.append(_methodName_12, "\t\t\t");
            _builder_1.append(".getForIncidence().add(");
            String _packageAccessorName_2 = this.getPackageAccessorName(this.getGenFeature(c_1));
            _builder_1.append(_packageAccessorName_2, "\t\t\t");
            _builder_1.append(");");
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder_1.append("\t\t");
    _builder_1.newLine();
    {
      Set<Compartment> _affectedCompartments_1 = this.getAffectedCompartments(r);
      for(final Compartment s_2 : _affectedCompartments_1) {
        _builder_1.append("\t\t");
        _builder_1.append("deltaValue.set");
        String _accessorName_4 = this.getAccessorName(s_2);
        _builder_1.append(_accessorName_4, "\t\t");
        _builder_1.append("(delta");
        String _accessorName_5 = this.getAccessorName(s_2);
        _builder_1.append(_accessorName_5, "\t\t");
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("\t\t\t");
    _builder_1.newLine();
    {
      for(final XtextResource e : r) {
        CharSequence _compile = this.compile(e);
        _builder_1.append(_compile);
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.append("} //");
    String body = _builder_1.toString();
    String imports = this.getSortedImports();
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append(pkg);
    _builder_2.newLineIfNotEmpty();
    _builder_2.newLine();
    _builder_2.append(imports);
    _builder_2.newLineIfNotEmpty();
    _builder_2.newLine();
    _builder_2.append(body);
    return ((CharSequence) _builder_2);
  }
  
  protected CharSequence _compile(final Resource r) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(IterableExtensions.<TransitionBlock>head(Iterables.<TransitionBlock>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), TransitionBlock.class)));
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final TransitionBlock t) {
    EObject _eContainer = t.eContainer();
    CompartmentTransitionDefinitions ctd = ((CompartmentTransitionDefinitions) _eContainer);
    Transition transition = ctd.getMetamodel().getTransition();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Computes delta for transition ");
    String _name = transition.getSource().getName();
    _builder.append(_name, " ");
    _builder.append(" -> ");
    String _name_1 = transition.getTarget().getName();
    _builder.append(_name_1, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* @generated");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected double ");
    String _name_2 = transition.getSource().getName();
    _builder.append(_name_2);
    _builder.append("_");
    String _name_3 = transition.getTarget().getName();
    _builder.append(_name_3);
    _builder.append(" (double t, long timeDelta, ");
    String _importedName = this.getImportedName("org.eclipse.stem.core.model.STEMTime");
    _builder.append(_importedName);
    _builder.append(" time, ");
    String _importGenClassInterface = this.importGenClassInterface(this.modelGenClass);
    _builder.append(_importGenClassInterface);
    _builder.append(" model, ");
    String _importGenClassInterface_1 = this.importGenClassInterface(this.labelGenClass);
    _builder.append(_importGenClassInterface_1);
    _builder.append(" label, ");
    String _importGenClassInterface_2 = this.importGenClassInterface(this.labelValueGenClass);
    _builder.append(_importGenClassInterface_2);
    _builder.append(" labelValue, ");
    String _importedName_1 = this.getImportedName("org.eclipse.stem.core.graph.Node");
    _builder.append(_importedName_1);
    _builder.append(" node) {");
    _builder.newLineIfNotEmpty();
    {
      EList<DefStatement> _statements = t.getBlock().getStatements();
      for(final DefStatement s : _statements) {
        Object _compile = this.compile(s);
        _builder.append(_compile);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("return ");
    Object _compile_1 = this.compile(t.getBlock().getRet());
    _builder.append(_compile_1);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return ((CharSequence) _builder);
  }
  
  protected CharSequence _compile(final DefStatement d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("double ");
    String _varname = d.getVarname();
    _builder.append(_varname);
    _builder.append("=");
    Object _compile = this.compile(d.getExpr());
    _builder.append(_compile);
    _builder.append(";");
    return _builder;
  }
  
  protected CharSequence _compile(final Evaluation e) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(e.getExpression(), Double.TYPE);
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compile(final PrimaryExpression pe, final Class<?> expectedType) {
    String neg = "";
    boolean _isNegate = pe.isNegate();
    if (_isNegate) {
      neg = "-";
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    _builder.append(neg);
    Object _compile = this.compile(pe.getExp(), expectedType);
    _builder.append(_compile);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return ((CharSequence) _builder);
  }
  
  protected CharSequence _compile(final Plus p, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compile = this.compile(p.getLeft(), Double.TYPE);
    _builder.append(_compile);
    _builder.append("+");
    Object _compile_1 = this.compile(p.getRight(), Double.TYPE);
    _builder.append(_compile_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compile(final Minus m, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compile = this.compile(m.getLeft(), Double.TYPE);
    _builder.append(_compile);
    _builder.append("-");
    Object _compile_1 = this.compile(m.getRight(), Double.TYPE);
    _builder.append(_compile_1);
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compile(final Multi m, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(m.getLeft(), Double.TYPE);
    _builder.append(_compile);
    _builder.append("*");
    Object _compile_1 = this.compile(m.getRight(), Double.TYPE);
    _builder.append(_compile_1);
    return _builder;
  }
  
  protected CharSequence _compile(final Div d, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(d.getLeft(), Double.TYPE);
    _builder.append(_compile);
    _builder.append("/");
    Object _compile_1 = this.compile(d.getRight(), Double.TYPE);
    _builder.append(_compile_1);
    return _builder;
  }
  
  protected CharSequence _compileReference(final GlobalVariableReference rf, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = rf.getName();
    _builder.append(_name);
    return _builder;
  }
  
  protected CharSequence _compileReference(final LocalVariableReference rf, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = rf.getName();
    _builder.append(_name);
    return _builder;
  }
  
  protected CharSequence _compileReference(final AbsoluteCompartmentValueReference rf, final Class<?> expectedType) {
    ITypeSerializer serializer = TypeSerializerFactory.getSerializer(rf, expectedType, this.labelValueGenClass);
    if ((serializer != null)) {
      return serializer.serialize();
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("labelValue.get");
    String _firstUpper = StringExtensions.toFirstUpper(rf.getObj().getName());
    _builder.append(_firstUpper);
    _builder.append("()");
    return ((CharSequence) _builder);
  }
  
  protected CharSequence _compileReference(final RelativeCompartmentValueReference rf, final Class<?> expectedType) {
    ITypeSerializer serializer = TypeSerializerFactory.getSerializer(rf, expectedType, this.labelValueGenClass);
    if ((serializer != null)) {
      return serializer.serialize();
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(labelValue.getPopulationCount() > 0)? (labelValue.get");
    String _firstUpper = StringExtensions.toFirstUpper(rf.getObj().getName());
    _builder.append(_firstUpper);
    _builder.append("()/labelValue.getPopulationCount()):0");
    return ((CharSequence) _builder);
  }
  
  protected CharSequence _compileReference(final ModelParamReference rf, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("model.get");
    String _firstUpper = StringExtensions.toFirstUpper(rf.getObj().getName());
    _builder.append(_firstUpper);
    _builder.append("()");
    return _builder;
  }
  
  protected CharSequence _compile(final VariableReference rf, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileReference = this.compileReference(rf.getRef(), expectedType);
    _builder.append(_compileReference);
    return _builder;
  }
  
  protected CharSequence _compile(final NumberLiteral nl, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    double _value = nl.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _compile(final StringLiteral sl, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _value = sl.getValue();
    _builder.append(_value);
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _compile(final BooleanLiteral bl, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    boolean _isValue = bl.isValue();
    _builder.append(_isValue);
    return _builder;
  }
  
  protected CharSequence _compile(final Expression exp, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(exp.getExp(), expectedType);
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compileArgument(final SystemArgumentReference arg, final FunctionCall fc) {
    StringConcatenation _builder = new StringConcatenation();
    String _mapsFrom = arg.getMapsFrom();
    _builder.append(_mapsFrom);
    return _builder;
  }
  
  protected CharSequence _compileArgument(final FunctionArgumentReference arg, final FunctionCall fc) {
    StringConcatenation _builder = new StringConcatenation();
    Object _compile = this.compile(fc.getArgs().get(arg.getArgIndex()), arg.getJavaType());
    _builder.append(_compile);
    return _builder;
  }
  
  protected CharSequence _compileFunction(final ExternalFunctionReference fcr, final FunctionCall fc) {
    StringConcatenation _builder = new StringConcatenation();
    String _importedName = this.getImportedName(fcr.getFunc().getClassName());
    _builder.append(_importedName);
    _builder.append(".");
    String _methodName = fcr.getFunc().getMethodName();
    _builder.append(_methodName);
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    {
      EList<JavaMethodArgument> _javaMethodArguments = fcr.getFunc().getJavaMethodArguments();
      for(final JavaMethodArgument arg : _javaMethodArguments) {
        _builder.append("\t\t");
        {
          JavaMethodArgument _head = IterableExtensions.<JavaMethodArgument>head(fcr.getFunc().getJavaMethodArguments());
          boolean _notEquals = (!Objects.equal(arg, _head));
          if (_notEquals) {
            _builder.append(",");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        CharSequence _compileArgument = this.compileArgument(arg, fc);
        _builder.append(_compileArgument, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compileFunction(final FunctionReference fcr, final FunctionCall fc) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = fcr.getName();
    _builder.append(_name);
    _builder.append("(");
    {
      EList<Expression> _args = fc.getArgs();
      for(final Expression e : _args) {
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        {
          Expression _head = IterableExtensions.<Expression>head(fc.getArgs());
          boolean _equals = Objects.equal(e, _head);
          if (_equals) {
            Object _compile = this.compile(e);
            _builder.append(_compile);
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append(",");
            Object _compile_1 = this.compile(e);
            _builder.append(_compile_1);
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t\t");
      }
    }
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _compile(final FunctionCall fc, final Class<?> expectedType) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileFunction = this.compileFunction(fc.getRef(), fc);
    _builder.append(_compileFunction);
    return _builder;
  }
  
  public CharSequence compile(final Notifier e) {
    if (e instanceof Evaluation) {
      return _compile((Evaluation)e);
    } else if (e instanceof DefStatement) {
      return _compile((DefStatement)e);
    } else if (e instanceof TransitionBlock) {
      return _compile((TransitionBlock)e);
    } else if (e instanceof Resource) {
      return _compile((Resource)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
  
  public CharSequence compile(final Expression bl, final Class<?> expectedType) {
    if (bl instanceof BooleanLiteral) {
      return _compile((BooleanLiteral)bl, expectedType);
    } else if (bl instanceof Div) {
      return _compile((Div)bl, expectedType);
    } else if (bl instanceof FunctionCall) {
      return _compile((FunctionCall)bl, expectedType);
    } else if (bl instanceof Minus) {
      return _compile((Minus)bl, expectedType);
    } else if (bl instanceof Multi) {
      return _compile((Multi)bl, expectedType);
    } else if (bl instanceof NumberLiteral) {
      return _compile((NumberLiteral)bl, expectedType);
    } else if (bl instanceof Plus) {
      return _compile((Plus)bl, expectedType);
    } else if (bl instanceof PrimaryExpression) {
      return _compile((PrimaryExpression)bl, expectedType);
    } else if (bl instanceof StringLiteral) {
      return _compile((StringLiteral)bl, expectedType);
    } else if (bl instanceof VariableReference) {
      return _compile((VariableReference)bl, expectedType);
    } else if (bl != null) {
      return _compile(bl, expectedType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bl, expectedType).toString());
    }
  }
  
  public CharSequence compileReference(final ScopedVariableReference rf, final Class<?> expectedType) {
    if (rf instanceof AbsoluteCompartmentValueReference) {
      return _compileReference((AbsoluteCompartmentValueReference)rf, expectedType);
    } else if (rf instanceof RelativeCompartmentValueReference) {
      return _compileReference((RelativeCompartmentValueReference)rf, expectedType);
    } else if (rf instanceof GlobalVariableReference) {
      return _compileReference((GlobalVariableReference)rf, expectedType);
    } else if (rf instanceof LocalVariableReference) {
      return _compileReference((LocalVariableReference)rf, expectedType);
    } else if (rf instanceof ModelParamReference) {
      return _compileReference((ModelParamReference)rf, expectedType);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(rf, expectedType).toString());
    }
  }
  
  public CharSequence compileArgument(final JavaMethodArgument arg, final FunctionCall fc) {
    if (arg instanceof FunctionArgumentReference) {
      return _compileArgument((FunctionArgumentReference)arg, fc);
    } else if (arg instanceof SystemArgumentReference) {
      return _compileArgument((SystemArgumentReference)arg, fc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(arg, fc).toString());
    }
  }
  
  public CharSequence compileFunction(final FunctionReference fcr, final FunctionCall fc) {
    if (fcr instanceof ExternalFunctionReference) {
      return _compileFunction((ExternalFunctionReference)fcr, fc);
    } else if (fcr != null) {
      return _compileFunction(fcr, fc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(fcr, fc).toString());
    }
  }
}
