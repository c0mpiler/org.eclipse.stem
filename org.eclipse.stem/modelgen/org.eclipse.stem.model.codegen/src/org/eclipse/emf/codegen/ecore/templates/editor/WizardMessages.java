package org.eclipse.emf.codegen.ecore.templates.editor;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.stem.model.codegen.STEMGenPackage;

public class WizardMessages
{
  protected static String nl;
  public static synchronized WizardMessages create(String lineSeparator)
  {
    nl = lineSeparator;
    WizardMessages result = new WizardMessages();
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
  protected final String TEXT_7 = ";" + NL + "" + NL + "import java.util.MissingResourceException;" + NL + "import java.util.ResourceBundle;" + NL + "" + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_8 = "WizardMessages" + NL + "{" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final String BUNDLE_NAME = \"";
  protected final String TEXT_9 = ".messages\"; //$NON-NLS-1$" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_10 = "WizardMessages() " + NL + "\t{" + NL + "\t\t// empty" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @param key the key for the message" + NL + "\t * @return the string that matches the key" + NL + "\t * @throws MissingResourceException if the key cannot be found" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static String getString(String key) throws MissingResourceException" + NL + "\t{" + NL + "\t\treturn RESOURCE_BUNDLE.getString(key);" + NL + "\t}" + NL + "\t" + NL + "\t/**" + NL + "\t * @param key the key for the message" + NL + "\t * @param context the class name for which this key resides" + NL + "\t * @return the string that matches the key" + NL + "\t * @throws MissingResourceException if the key cannot be found" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static String getString(String key, String context) throws MissingResourceException" + NL + "\t{" + NL + "\t\treturn RESOURCE_BUNDLE.getString(context +\".\"+ key);" + NL + "\t}\t" + NL + "\t" + NL + "}";
  protected final String TEXT_11 = NL;

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

    
STEMGenPackage stemGenerator = (STEMGenPackage)((Object[])argument)[0]; 
GenPackage genPackage = stemGenerator.getGenPackage(); 

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
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getPresentationPackageName());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
