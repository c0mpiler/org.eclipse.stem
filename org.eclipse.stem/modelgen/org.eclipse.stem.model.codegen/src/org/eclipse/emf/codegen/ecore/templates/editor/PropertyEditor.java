package org.eclipse.emf.codegen.ecore.templates.editor;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.stem.model.codegen.STEMGenClass;

public class PropertyEditor
{
  protected static String nl;
  public static synchronized PropertyEditor create(String lineSeparator)
  {
    nl = lineSeparator;
    PropertyEditor result = new PropertyEditor();
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
  protected final String TEXT_7 = ";" + NL + "" + NL + "import org.eclipse.emf.ecore.EStructuralFeature;" + NL + "import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;" + NL + "import org.eclipse.core.resources.IProject;" + NL + "import org.eclipse.swt.events.ModifyListener;" + NL + "import org.eclipse.swt.widgets.Composite;" + NL + "import java.util.MissingResourceException;";
  protected final String TEXT_8 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = "PropertyEditor extends" + NL + "\t\t";
  protected final String TEXT_10 = " " + NL + "{" + NL + "\t/**" + NL + "\t * @param parent" + NL + "\t * @param style" + NL + "\t * @param model" + NL + "\t * @param projectValidator" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_11 = "PropertyEditor(Composite parent, int style," + NL + "\t\t\t";
  protected final String TEXT_12 = " model, ModifyListener projectValidator," + NL + "\t\t\tIProject project) {" + NL + "\t\tsuper(parent, style, model, projectValidator, project);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic void populate(";
  protected final String TEXT_13 = " object) {" + NL + "\t\tsuper.populate(object);" + NL;
  protected final String TEXT_14 = NL + "\t\t";
  protected final String TEXT_15 = " model = (";
  protected final String TEXT_16 = ")object;";
  protected final String TEXT_17 = NL + "\t\t// Remove Comment If Adding Custom Code" + NL + "\t\t//";
  protected final String TEXT_18 = " model = (";
  protected final String TEXT_19 = ")object;";
  protected final String TEXT_20 = NL;
  protected final String TEXT_21 = NL + " \t\t// Set value for ";
  protected final String TEXT_22 = " (";
  protected final String TEXT_23 = ")";
  protected final String TEXT_24 = NL + "\t\ttry {" + NL + "\t\t\t";
  protected final String TEXT_25 = " ";
  protected final String TEXT_26 = "Value = ";
  protected final String TEXT_27 = ".parse";
  protected final String TEXT_28 = "(" + NL + "\t\t\t\tmap.get(";
  protected final String TEXT_29 = ").getText());" + NL + "\t\t\tmodel.set";
  protected final String TEXT_30 = "(";
  protected final String TEXT_31 = "Value);" + NL + "\t\t} catch (NumberFormatException nfe) {" + NL + "\t\t\t// empty" + NL + "\t\t}";
  protected final String TEXT_32 = NL + "\t\ttry {" + NL + "\t\t\tInteger ";
  protected final String TEXT_33 = "Value = Integer.parseInt(" + NL + "\t\t\t\t\tmap.get(";
  protected final String TEXT_34 = ").getText());" + NL + "\t\t\tmodel.set";
  protected final String TEXT_35 = "(";
  protected final String TEXT_36 = "Value);" + NL + "\t\t} catch (NumberFormatException nfe) {" + NL + "\t\t\t// empty" + NL + "\t\t}";
  protected final String TEXT_37 = NL + "\t\tboolean ";
  protected final String TEXT_38 = "Value = booleanMap.get(";
  protected final String TEXT_39 = ").getSelection();" + NL + "\t\tmodel.set";
  protected final String TEXT_40 = "(";
  protected final String TEXT_41 = "Value);\t\t\t";
  protected final String TEXT_42 = NL + "  \t\tString ";
  protected final String TEXT_43 = "Value = map.get(";
  protected final String TEXT_44 = ").getText();" + NL + "\t\tmodel.set";
  protected final String TEXT_45 = "(";
  protected final String TEXT_46 = "Value);";
  protected final String TEXT_47 = NL + "\t\t// TODO Add code to set \"";
  protected final String TEXT_48 = "\" value" + NL + "\t\t// ";
  protected final String TEXT_49 = " ";
  protected final String TEXT_50 = "Value = ...;" + NL + "\t\t// model.set";
  protected final String TEXT_51 = "(";
  protected final String TEXT_52 = "Value);";
  protected final String TEXT_53 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic boolean validate() {" + NL + "\t\tboolean valid = super.validate();" + NL;
  protected final String TEXT_54 = NL + "\t\tvalid = valid && validateFeatureConstraint(";
  protected final String TEXT_55 = ");";
  protected final String TEXT_56 = NL + NL + "\t\treturn valid;" + NL + "\t}" + NL + "" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class ";
  protected final String TEXT_57 = "PropertyStringProviderAdapter" + NL + "\t\textends ";
  protected final String TEXT_58 = NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * @param descriptor" + NL + "\t\t * @return the NLS'd name of the property to display to the user" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getPropertyName(IItemPropertyDescriptor descriptor) {" + NL + "\t\t\ttry {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_59 = "WizardMessages" + NL + "\t\t\t\t\t\t.getString(((EStructuralFeature) descriptor" + NL + "\t\t\t\t\t\t\t\t.getFeature(null)).getName(), \"";
  protected final String TEXT_60 = "\");" + NL + "\t\t\t} catch (MissingResourceException e) {" + NL + "\t\t\t\treturn super.getPropertyName(descriptor);" + NL + "\t\t\t}" + NL + "\t\t} // getPropertyName" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @param descriptor" + NL + "\t\t * @return the NLS'd tool tip text that describes the property" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getPropertyToolTip(" + NL + "\t\t\t\tIItemPropertyDescriptor descriptor) {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tfinal EStructuralFeature feature = (EStructuralFeature) descriptor" + NL + "\t\t\t\t\t\t.getFeature(null);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_61 = "WizardMessages.getString(feature" + NL + "\t\t\t\t\t\t.getName() + TT_SUFFIX, \"";
  protected final String TEXT_62 = "\");" + NL + "\t\t\t} catch (MissingResourceException e) {" + NL + "\t\t\t\treturn super.getPropertyToolTip(descriptor);" + NL + "\t\t\t}" + NL + "\t\t} // getPropertyToolTip" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @param descriptor" + NL + "\t\t * @return the NLS'd text that represents the units of the" + NL + "\t\t *         property" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getPropertyUnits(" + NL + "\t\t\t\tIItemPropertyDescriptor descriptor) {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tfinal EStructuralFeature feature = (EStructuralFeature) descriptor" + NL + "\t\t\t\t\t\t.getFeature(null);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_63 = "WizardMessages.getString(feature" + NL + "\t\t\t\t\t\t.getName() + UNIT_SUFFIX, \"";
  protected final String TEXT_64 = "\");" + NL + "\t\t\t} catch (MissingResourceException e) {" + NL + "\t\t\t\treturn super.getPropertyUnits(descriptor);" + NL + "\t\t\t}" + NL + "\t\t} // getPropertyUnits" + NL + "\t\t" + NL + "\t\t/**" + NL + "\t\t * @param descriptor" + NL + "\t\t * @return the NLS'd text for a missing property error message" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getPropertyMissing(" + NL + "\t\t\t\tIItemPropertyDescriptor descriptor) {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tfinal EStructuralFeature feature = (EStructuralFeature) descriptor" + NL + "\t\t\t\t\t\t.getFeature(null);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_65 = "WizardMessages.getString(feature" + NL + "\t\t\t\t\t\t.getName() + MISSING_SUFFIX, \"";
  protected final String TEXT_66 = "\");" + NL + "\t\t\t} catch (MissingResourceException e) {" + NL + "\t\t\t\treturn super.getPropertyMissing(descriptor);" + NL + "\t\t\t}" + NL + "\t\t} // getPropertyMissing" + NL + "\t\t" + NL + "\t\t/**" + NL + "\t\t * @param descriptor" + NL + "\t\t * @return the NLS'd text for a missing property error message" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic String getPropertyInvalid(" + NL + "\t\t\t\tIItemPropertyDescriptor descriptor) {" + NL + "\t\t\ttry {" + NL + "\t\t\t\tfinal EStructuralFeature feature = (EStructuralFeature) descriptor" + NL + "\t\t\t\t\t\t.getFeature(null);" + NL + "\t\t\t\treturn ";
  protected final String TEXT_67 = "WizardMessages.getString(feature" + NL + "\t\t\t\t\t\t.getName() + INVALID_SUFFIX, \"";
  protected final String TEXT_68 = "\");" + NL + "\t\t\t} catch (MissingResourceException e) {\t" + NL + "\t\t\t\treturn super.getPropertyInvalid(descriptor);" + NL + "\t\t\t}" + NL + "\t\t} // getPropertyInvalid\t\t" + NL + "\t}" + NL + "" + NL + "}";

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
GenClass genClass = stemGenClass.getGenClass();
GenPackage genPackage = genClass.getGenPackage();
GenModel genModel = genPackage.getGenModel();
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
    stringBuffer.append(genModel.getImportedName(stemGenClass.getPropertyEditorSuperClassName()));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(importedModelClassName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(importedModelClassName);
    stringBuffer.append(TEXT_13);
    if (genClass.getImplementedGenFeatures().size() > 0) {
String importedClassName = genModel.getImportedName(genPackage.getInterfacePackageName() + "." + genClass.getName());

    stringBuffer.append(TEXT_14);
    stringBuffer.append(importedClassName);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(importedClassName);
    stringBuffer.append(TEXT_16);
    }else{
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_19);
    }
    stringBuffer.append(TEXT_20);
     for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { 
     
 	//STEMGenFeature stemFeature = STEMGenFeature.get(genFeature); 
 	//STEMGenFeature.STEMGenFeatureConstraint constraint = stemFeature.getConstraint();

     if (genFeature.isChangeable()) { 
     String rawType = STEMGenClass.getPrimitiveObjectName(genFeature.getImportedType(genClass)); 
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(rawType);
    stringBuffer.append(TEXT_23);
     if (rawType.equals("Double") || 
  	rawType.equals("Float") || rawType.equals("Short") || 
  	rawType.equals("Long") || rawType.equals("Byte")) { 
    stringBuffer.append(TEXT_24);
    stringBuffer.append(rawType);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(rawType);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(rawType);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_31);
     } else if (rawType.equals("Integer")) { 
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_36);
     } else if (rawType.equals("Boolean")) { 
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_41);
     } else if (rawType.equals("String")) { 
    stringBuffer.append(TEXT_42);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_46);
     } else { 
    stringBuffer.append(TEXT_47);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_52);
     } //if type 
     } //if changeable 
     } //for feature 
    stringBuffer.append(TEXT_53);
     for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { 
     if (genFeature.isChangeable()) { 
    stringBuffer.append(TEXT_54);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_55);
     } //if changeable 
     } //for feature 
    stringBuffer.append(TEXT_56);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_57);
    stringBuffer.append(genModel.getImportedName(stemGenClass.getStringProviderSuperClassName()));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genClass.getName());
    stringBuffer.append(TEXT_68);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
