package org.eclipse.emf.codegen.ecore.templates.editor;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.stem.model.codegen.STEMGenClass;
import org.eclipse.stem.model.codegen.STEMGenPackage;

public class RelativeValueProviderAdapterFactory
{
  protected static String nl;
  public static synchronized RelativeValueProviderAdapterFactory create(String lineSeparator)
  {
    nl = lineSeparator;
    RelativeValueProviderAdapterFactory result = new RelativeValueProviderAdapterFactory();
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
  protected final String TEXT_7 = ";" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "" + NL + "import org.eclipse.emf.ecore.EReference;" + NL + "import org.eclipse.emf.ecore.EStructuralFeature;" + NL + "import org.eclipse.emf.edit.provider.ChangeNotifier;" + NL + "import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;" + NL + "import org.eclipse.emf.edit.provider.ComposedAdapterFactory;" + NL + "import org.eclipse.emf.edit.provider.IChangeNotifier;" + NL + "import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;" + NL + "import org.eclipse.emf.edit.provider.IItemPropertySource;" + NL + "import org.eclipse.emf.edit.provider.INotifyChangedListener;" + NL + "import org.eclipse.emf.edit.ui.provider.PropertySource;" + NL + "import org.eclipse.emf.common.notify.Adapter;" + NL + "import org.eclipse.emf.common.notify.Notification;";
  protected final String TEXT_8 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_9 = "RelativeValueProviderAdapterFactory extends" + NL + "\t\t";
  protected final String TEXT_10 = " " + NL + "\t\timplements ";
  protected final String TEXT_11 = ", ";
  protected final String TEXT_12 = " {" + NL + "\t" + NL + "\t/**" + NL + "\t * This keeps track of the root adapter factory that delegates to this" + NL + "\t * adapter factory." + NL + "\t */" + NL + "\tprotected ComposedAdapterFactory parentAdapterFactory;" + NL + "" + NL + "\t/**" + NL + "\t * This is used to implement" + NL + "\t * {@link org.eclipse.emf.edit.provider.IChangeNotifier}." + NL + "\t */" + NL + "\tprotected IChangeNotifier changeNotifier = new ChangeNotifier();" + NL + "" + NL + "\t/**" + NL + "\t * This factory is used to create item providers for the adapted classes." + NL + "\t * The item providers are used as property sources to get the properties" + NL + "\t * that can have relative values." + NL + "\t */" + NL + "\tprivate static ";
  protected final String TEXT_13 = " itemProviderFactory;\t" + NL + "\t" + NL + "\t" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_14 = "RelativeValueProviderAdapterFactory() {" + NL + "\t\tsuper();" + NL + "\t\t";
  protected final String TEXT_15 = ".INSTANCE.addAdapterFactory(this);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void earlyStartup() {" + NL + "\t\tnew ";
  protected final String TEXT_16 = "RelativeValueProviderAdapterFactory();" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.IChangeNotifier#addListener(org.eclipse.emf.edit.provider.INotifyChangedListener)" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void addListener(INotifyChangedListener notifyChangedListener) {" + NL + "\t\tchangeNotifier.addListener(notifyChangedListener);" + NL + "\t} // addListener" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.IChangeNotifier#fireNotifyChanged(org.eclipse.emf.common.notify.Notification)" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void fireNotifyChanged(Notification notification) {" + NL + "\t\tchangeNotifier.fireNotifyChanged(notification);" + NL + "\t\tif (parentAdapterFactory != null) {" + NL + "\t\t\tparentAdapterFactory.fireNotifyChanged(notification);" + NL + "\t\t}" + NL + "\t} // fireNotifyChanged" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.IChangeNotifier#removeListener(org.eclipse.emf.edit.provider.INotifyChangedListener)" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void removeListener(INotifyChangedListener notifyChangedListener) {" + NL + "\t\tchangeNotifier.removeListener(notifyChangedListener);" + NL + "\t} // removeListener" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#getRootAdapterFactory()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ComposeableAdapterFactory getRootAdapterFactory() {" + NL + "\t\treturn parentAdapterFactory == null ? this : parentAdapterFactory" + NL + "\t\t\t\t.getRootAdapterFactory();" + NL + "\t} // getRootAdapterFactory" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.emf.edit.provider.ComposeableAdapterFactory#setParentAdapterFactory(org.eclipse.emf.edit.provider.ComposedAdapterFactory)" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setParentAdapterFactory(" + NL + "\t\t\tComposedAdapterFactory parentAdapterFactory) {" + NL + "\t\tthis.parentAdapterFactory = parentAdapterFactory;" + NL + "\t} // setParentAdapterFactory" + NL + "" + NL + "\t/**" + NL + "\t * This disposes all of the item providers created by this factory." + NL + "\t * " + NL + "\t * @see org.eclipse.emf.edit.provider.IDisposable#dispose()" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void dispose() {" + NL + "\t\t// Nothing" + NL + "\t} // dispose" + NL + "" + NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic boolean isFactoryForType(Object type) {" + NL + "\t\treturn super.isFactoryForType(type)" + NL + "\t\t\t\t|| type == ";
  protected final String TEXT_17 = ".class;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @return the instance of the Relative Value Provider Adapter Factory" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static ";
  protected final String TEXT_18 = " getRelativeValueProviderAdapterFactory() {" + NL + "\t\treturn ";
  protected final String TEXT_19 = ".INSTANCE;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @return the instance of the Standard Item Provider factory." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static ";
  protected final String TEXT_20 = " getItemProviderFactory() {" + NL + "\t\tif (itemProviderFactory == null) {" + NL + "\t\t\titemProviderFactory = new ";
  protected final String TEXT_21 = "();" + NL + "\t\t}" + NL + "\t\treturn itemProviderFactory;" + NL + "\t}" + NL;
  protected final String TEXT_22 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic Adapter create";
  protected final String TEXT_23 = "Adapter() {" + NL + "\t\treturn new ";
  protected final String TEXT_24 = "RelativeValueProviderAdapter();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_25 = NL + " ";
  protected final String TEXT_26 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\t@Override" + NL + "\tpublic Adapter create";
  protected final String TEXT_27 = "Adapter() {" + NL + "\t\treturn new ";
  protected final String TEXT_28 = "RelativeValueProviderAdapter();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_29 = NL;
  protected final String TEXT_30 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class ";
  protected final String TEXT_31 = "RelativeValueProviderAdapter " + NL + "\t\textends ";
  protected final String TEXT_32 = " {" + NL + "\t" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprivate ";
  protected final String TEXT_33 = " getCurrentLabelValue() {" + NL + "\t\t\treturn (";
  protected final String TEXT_34 = ")((";
  protected final String TEXT_35 = ")getTarget()).getCurrentValue();" + NL + "\t\t}" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tprivate ";
  protected final String TEXT_36 = " getCurrentLabelValueRelativeValueProvider() {" + NL + "\t\t\treturn (";
  protected final String TEXT_37 = ")getRelativeValueProviderAdapterFactory()" + NL + "\t\t\t\t.adapt(getCurrentLabelValue(), ";
  protected final String TEXT_38 = ".class);" + NL + "\t\t} " + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic List<IItemPropertyDescriptor> getProperties() {" + NL + "\t\t\treturn getCurrentLabelValueRelativeValueProvider().getProperties();" + NL + "\t\t}" + NL;
  protected final String TEXT_39 = NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getRelativeValue(final EStructuralFeature feature) {" + NL + "\t\t\treturn getCurrentLabelValueRelativeValueProvider().getRelativeValue(feature);" + NL + "\t\t}" + NL + "  " + NL + "  \t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getDenominator(final EStructuralFeature feature) {" + NL + "\t\t\treturn ((";
  protected final String TEXT_40 = ")getCurrentLabelValue()).getPopulationCount();" + NL + "\t\t}  ";
  protected final String TEXT_41 = NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getRelativeValue(final EStructuralFeature feature) {" + NL + "\t\t\treturn super.getRelativeValue(feature);" + NL + "\t\t}" + NL + "  " + NL + "  \t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getDenominator(final EStructuralFeature feature) {" + NL + "\t\t\t//return 1.0;" + NL + "\t\t\treturn super.getDenominator(feature);" + NL + "\t\t}";
  protected final String TEXT_42 = NL + "\t}" + NL;
  protected final String TEXT_43 = NL;
  protected final String TEXT_44 = NL + "\t/**" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class ";
  protected final String TEXT_45 = "RelativeValueProviderAdapter " + NL + "\t\textends ";
  protected final String TEXT_46 = " {" + NL + "" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic List<IItemPropertyDescriptor> getProperties() {" + NL + "\t\t\tfinal IItemPropertySource propertySource = (IItemPropertySource)getItemProviderFactory()" + NL + "\t\t\t\t\t.adapt(getTarget(), PropertySource.class);" + NL + "" + NL + "\t\t\tfinal List<IItemPropertyDescriptor> properties = new ArrayList<IItemPropertyDescriptor>();" + NL + "\t\t\tfor (IItemPropertyDescriptor descriptor : propertySource.getPropertyDescriptors(null)) {" + NL + "\t\t\t\tfinal EStructuralFeature feature = (EStructuralFeature) descriptor" + NL + "\t\t\t\t\t\t.getFeature(null);" + NL + "\t\t\t\tif (!(feature instanceof EReference)) {" + NL + "\t\t\t\t\tproperties.add(descriptor);" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn properties;" + NL + "\t\t}" + NL;
  protected final String TEXT_47 = NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getRelativeValue(final EStructuralFeature feature) {" + NL + "\t\t\tfinal IntegrationLabelValue labelValue = (IntegrationLabelValue)getTarget();" + NL + "\t\t\tfinal double stateCount = labelValue.eGetDouble(feature.getFeatureID());" + NL + "\t\t\tfinal double denominator = getDenominator(feature);" + NL + "\t\t\tif (denominator <= 0.0) {" + NL + "\t\t\t\treturn 0.0;" + NL + "\t\t\t}" + NL + "\t\t\treturn stateCount / denominator;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getDenominator(final EStructuralFeature feature) {" + NL + "\t\t\treturn ((";
  protected final String TEXT_48 = ")getTarget()).getPopulationCount();" + NL + "\t\t}";
  protected final String TEXT_49 = NL + "\t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getRelativeValue(final EStructuralFeature feature) {" + NL + "\t\t\treturn super.getRelativeValue(feature);" + NL + "\t\t}" + NL + "  " + NL + "  \t\t/**" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\t@Override" + NL + "\t\tpublic double getDenominator(final EStructuralFeature feature) {" + NL + "\t\t\t//return 1.0;" + NL + "\t\t\treturn super.getDenominator(feature);" + NL + "\t\t}";
  protected final String TEXT_50 = NL + "\t}" + NL;
  protected final String TEXT_51 = NL + "}";

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
String itemProviderFactoryClassName = genModel.getImportedName(genPackage.getProviderPackageName() +"."+ genPackage.getItemProviderAdapterFactoryClassName());
String relativeValueProviderAdapterFactoryClassName = genModel.getImportedName("org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapterFactory");

String integrationLabelClassName = genModel.getImportedName("org.eclipse.stem.core.graph.IntegrationLabel");
String integrationLabelValueClassName = genModel.getImportedName("org.eclipse.stem.core.graph.IntegrationLabelValue");
String relativeValueProviderClassName = genModel.getImportedName("org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProvider");
//String relativeValueProviderAdapterClassName = genModel.getImportedName("org.eclipse.stem.definitions.adapters.relativevalue.RelativeValueProviderAdapter");

String dmLabelValueClassName = genModel.getImportedName("org.eclipse.stem.diseasemodels.standard.DiseaseModelLabelValue");

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
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genModel.getImportedName(genPackage.getUtilitiesPackageName()+"."+genPackage.getAdapterFactoryClassName()));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ui.IStartup"));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(relativeValueProviderAdapterFactoryClassName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(itemProviderFactoryClassName);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(relativeValueProviderAdapterFactoryClassName);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(relativeValueProviderClassName);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(relativeValueProviderAdapterFactoryClassName);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(relativeValueProviderAdapterFactoryClassName);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(itemProviderFactoryClassName);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(itemProviderFactoryClassName);
    stringBuffer.append(TEXT_21);
    /* Generates the adapter methods for each integration label EClass */
    for (STEMGenClass stemGenClass : stemGenPackage.getIntegrationLabelClasses()){
    stringBuffer.append(TEXT_22);
    stringBuffer.append(stemGenClass.getGenClass().getName() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(stemGenClass.getGenClass().getName());
    stringBuffer.append(TEXT_24);
    }
    stringBuffer.append(TEXT_25);
    /* Generates the adapter methods for each integration label EClass */
    for (STEMGenClass stemGenClass : stemGenPackage.getIntegrationLabelValueClasses()){
    stringBuffer.append(TEXT_26);
    stringBuffer.append(stemGenClass.getGenClass().getName() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append(stemGenClass.getGenClass().getName());
    stringBuffer.append(TEXT_28);
    }
    stringBuffer.append(TEXT_29);
    /* Generate the adapter class for each integration label EClass */
    for (STEMGenClass stemGenClass : stemGenPackage.getIntegrationLabelClasses()){
    stringBuffer.append(TEXT_30);
    stringBuffer.append(stemGenClass.getGenClass().getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genModel.getImportedName(stemGenClass.getLabelRelativeValueProviderSuperClassName()));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(integrationLabelValueClassName);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(integrationLabelValueClassName);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(integrationLabelClassName);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(relativeValueProviderClassName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(relativeValueProviderClassName);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(relativeValueProviderClassName);
    stringBuffer.append(TEXT_38);
    if("DiseaseModel".equals(stemGenClass.getDescriptor().getModelType())){
    stringBuffer.append(TEXT_39);
    stringBuffer.append(dmLabelValueClassName);
    stringBuffer.append(TEXT_40);
    }else{
    stringBuffer.append(TEXT_41);
    }//endif
    stringBuffer.append(TEXT_42);
    }//endfor
    stringBuffer.append(TEXT_43);
    /* Generates the adapter methods for each integration label EClass */
    for (STEMGenClass stemGenClass : stemGenPackage.getIntegrationLabelValueClasses()){
    stringBuffer.append(TEXT_44);
    stringBuffer.append(stemGenClass.getGenClass().getName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genModel.getImportedName(stemGenClass.getLabelValueRelativeValueProviderSuperClassName()));
    stringBuffer.append(TEXT_46);
    if("DiseaseModel".equals(stemGenClass.getDescriptor().getModelType())){
    stringBuffer.append(TEXT_47);
    stringBuffer.append(dmLabelValueClassName);
    stringBuffer.append(TEXT_48);
    }else{
    stringBuffer.append(TEXT_49);
    }//endif
    stringBuffer.append(TEXT_50);
    }//endfor
    stringBuffer.append(TEXT_51);
    genModel.emitSortedImports();
    return stringBuffer.toString();
  }
}
