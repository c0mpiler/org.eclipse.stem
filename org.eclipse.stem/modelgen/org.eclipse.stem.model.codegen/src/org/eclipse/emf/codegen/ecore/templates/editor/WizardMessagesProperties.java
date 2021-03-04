package org.eclipse.emf.codegen.ecore.templates.editor;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.stem.model.codegen.STEMGenClass;
import org.eclipse.stem.model.codegen.STEMGenFeature;
import org.eclipse.stem.model.codegen.STEMGenPackage;

public class WizardMessagesProperties
{
  protected static String nl;
  public static synchronized WizardMessagesProperties create(String lineSeparator)
  {
    nl = lineSeparator;
    WizardMessagesProperties result = new WizardMessagesProperties();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "# ";
  protected final String TEXT_2 = NL + "# <copyright>" + NL + "# </copyright>" + NL + "#" + NL + "# ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + "# Messages for ";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = ".";
  protected final String TEXT_7 = " = ";
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = ".";
  protected final String TEXT_10 = "TT = ";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = ".";
  protected final String TEXT_13 = "UNIT = ";
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = ".";
  protected final String TEXT_16 = "MISSING = ";
  protected final String TEXT_17 = NL;
  protected final String TEXT_18 = ".";
  protected final String TEXT_19 = "INVALID = ";
  protected final String TEXT_20 = NL;
  protected final String TEXT_21 = NL + " ";

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
//GenPackage genPackage = stemGenPackage.getGenPackage(); 

    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    }}
    for(STEMGenClass stemGenClass : stemGenPackage.getComputationalModelClasses()){
    GenClass genClass = stemGenClass.getGenClass();
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genClass.getName());
    for(STEMGenFeature stemGenFeature : stemGenClass.getSTEMGenFeatures()){
    GenFeature genFeature = stemGenFeature.getGenFeature();
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(stemGenFeature.getNameMessage());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(stemGenFeature.getToolTipMessage());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(stemGenFeature.getUnitMessage());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(stemGenFeature.getMissingMessage());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_19);
    stringBuffer.append(stemGenFeature.getInvalidMessage());
    stringBuffer.append(TEXT_20);
    }
    }
    stringBuffer.append(TEXT_21);
    return stringBuffer.toString();
  }
}
