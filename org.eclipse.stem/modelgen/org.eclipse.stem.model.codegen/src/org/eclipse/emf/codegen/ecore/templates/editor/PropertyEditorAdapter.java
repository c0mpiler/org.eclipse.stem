package org.eclipse.emf.codegen.ecore.templates.editor;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.stem.model.codegen.STEMGenClass;

public class PropertyEditorAdapter
{
  protected static String nl;
  public static synchronized PropertyEditorAdapter create(String lineSeparator)
  {
    nl = lineSeparator;
    PropertyEditorAdapter result = new PropertyEditorAdapter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_5 = "Id";
  protected final String TEXT_6 = NL + " */" + NL + "package ";
  protected final String TEXT_7 = ";" + NL + "" + NL + "import org.eclipse.core.resources.IProject;" + NL + "import org.eclipse.swt.events.ModifyListener;";
  protected final String TEXT_8 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = "PropertyEditorAdapter extends" + NL + "\t\t";
  protected final String TEXT_10 = " {" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_11 = " create";
  protected final String TEXT_12 = "PropertyEditor(" + NL + "\t\t\t";
  protected final String TEXT_13 = " composite," + NL + "\t\t\tint style, ModifyListener projectValidator, IProject project) {" + NL + "\t\treturn new ";
  protected final String TEXT_14 = "PropertyEditor(" + NL + "\t\t\t\tcomposite, style," + NL + "\t\t\t\t(";
  protected final String TEXT_15 = ")getTarget(), projectValidator, project);" + NL + "\t}" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    
STEMGenClass stemGenClass = (STEMGenClass)((Object[])argument)[0]; 
//STEMGenPackage stemGenPackage = stemGenClass.getSTEMGenPackage();
GenClass genClass = stemGenClass.getGenClass();
GenPackage genPackage = genClass.getGenPackage(); 
GenModel genModel=genPackage.getGenModel(); 
String importedModelClassName = genModel.getImportedName(stemGenClass.getModelTypeClassName());

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    }}
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genPackage.getPresentationPackageName());
    stringBuffer.append(TEXT_7);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genModel.getImportedName(stemGenClass.getPropertyEditorAdapterBaseType()));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genModel.getImportedName(stemGenClass.getPropertyEditorBaseType()));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(importedModelClassName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getImportedName(stemGenClass.getPropertyEditorCompositeBaseType()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(importedModelClassName);
    stringBuffer.append(TEXT_15);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
