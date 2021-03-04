package org.eclipse.emf.codegen.ecore.templates.editor;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.stem.model.codegen.STEMGenClass;
import org.eclipse.stem.model.codegen.STEMGenPackage;

public class PropertyEditorAdapterFactory
{
  protected static String nl;
  public static synchronized PropertyEditorAdapterFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    PropertyEditorAdapterFactory result = new PropertyEditorAdapterFactory();
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
  protected final String TEXT_7 = ";" + NL + "" + NL + "import org.eclipse.emf.common.notify.Adapter;" + NL + "import ";
  protected final String TEXT_8 = ".";
  protected final String TEXT_9 = ";" + NL + "import org.eclipse.ui.IStartup;";
  protected final String TEXT_10 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_11 = "PropertyEditorAdapterFactory extends" + NL + "\t\t";
  protected final String TEXT_12 = "AdapterFactory implements IStartup";
  protected final String TEXT_13 = ", ";
  protected final String TEXT_14 = " {" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_15 = "PropertyEditorAdapterFactory() " + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_16 = NL + "\t\t";
  protected final String TEXT_17 = ".INSTANCE.addAdapterFactory(this);";
  protected final String TEXT_18 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void earlyStartup() {" + NL + "\t\tnew ";
  protected final String TEXT_19 = "PropertyStringProviderAdapterFactory();" + NL + "\t}" + NL;
  protected final String TEXT_20 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic Adapter create";
  protected final String TEXT_21 = "Adapter() {" + NL + "\t\treturn new ";
  protected final String TEXT_22 = "PropertyEditorAdapter();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_23 = NL + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isFactoryForType(Object type) " + NL + "\t{" + NL + "\t\tboolean isType = super.isFactoryForType(type);";
  protected final String TEXT_24 = NL + "\t\tisType = isType || type == ";
  protected final String TEXT_25 = ".class;";
  protected final String TEXT_26 = NL + "\t\treturn isType;" + NL + "\t}" + NL + "}";

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

    
STEMGenPackage stemGenPackage = (STEMGenPackage)((Object[])argument)[0]; 
GenPackage genPackage = stemGenPackage.getGenPackage(); 
GenModel genModel=genPackage.getGenModel(); 

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
    stringBuffer.append(genPackage.getUtilitiesPackageName() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getAdapterFactoryClassName());
    stringBuffer.append(TEXT_9);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_12);
     for (String adapterFactoryType : stemGenPackage.getPropertyEditorAdapterFactoryBaseTypes().values()) { 
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getImportedName(adapterFactoryType));
    }
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_15);
     for (String adapterFactoryType : stemGenPackage.getPropertyEditorAdapterFactoryBaseTypes().values()) { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getImportedName(adapterFactoryType));
    stringBuffer.append(TEXT_17);
    }
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_19);
     /* Generates the adapter methods for each computational model EClass */ 
     for (STEMGenClass stemGenClass : stemGenPackage.getComputationalModelClasses()) { 
    stringBuffer.append(TEXT_20);
    stringBuffer.append(stemGenClass.getGenClass().getName() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append(stemGenClass.getGenClass().getName());
    stringBuffer.append(TEXT_22);
     } 
    stringBuffer.append(TEXT_23);
     for (String adapterType : stemGenPackage.getPropertyEditorAdapterBaseTypes().values()) { 
    stringBuffer.append(TEXT_24);
    stringBuffer.append(genModel.getImportedName(adapterType));
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
