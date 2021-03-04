/*******************************************************************************
 * Copyright (c) 2012 Bundesinstitut für Risikobewertung and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * Contributors:
 *     Bundesinstitut für Risikobewertung - initial API and implementation
 *******************************************************************************/
package org.eclipse.stem.model.transform;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreSwitch;

/**
 * Very simple implementation of an EMF Ecore to EMF GenModel transformer. Does
 * not handle all type transformations and is mostly limited to the specific
 * case of supporting the STEM Metamodel -> EMF Ecore -> EMF GenModel pipeline
 * for code generation.
 * 
 */
public class GenModelTransformSwitch extends EcoreSwitch<GenBase> {

	/**
	 * Performs a simple Ecore to GenMoel transformation for the 
	 * given EPackage (including all nested EPackages)
	 * 
	 * @param ePackage EPackage to transform to GenModel / GenPackage
	 * @return The transformed GenModel containing one or more GenPackages.
	 */
	public GenModel transform(EPackage ePackage) {
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		genModel.getGenPackages().add(caseEPackage(ePackage));
		return genModel;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEPackage(org.eclipse.emf.ecore.EPackage)
	 */
	@Override
	public GenPackage caseEPackage(EPackage ePackage) {
		GenPackage gp = GenModelFactory.eINSTANCE.createGenPackage();
		gp.setPrefix(ePackage.getName());
		// This sets the EPackage to lower case so that full package name is
		// lower case
		ePackage.setName(ePackage.getName().toLowerCase());

		gp.setBasePackage(getBasePackage(ePackage));
		gp.setDisposableProviderFactory(true);
		gp.setEcorePackage(ePackage);

		for (EPackage subPackage : ePackage.getESubpackages()) {
			gp.getSubGenPackages().add(caseEPackage(subPackage));
		}

		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				gp.getGenClasses().add(caseEClass((EClass) classifier));
			}
		}

		return gp;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature)
	 */
	@Override
	public GenFeature caseEStructuralFeature(EStructuralFeature feature) {
		GenFeature gf = GenModelFactory.eINSTANCE.createGenFeature();
		gf.setEcoreFeature(feature);
		
		if ("DoubleValueList".equals(feature.getEType().getName()) ||
			"DoubleValueMatrix".equals(feature.getEType().getName()) ||
			"StringValueList".equals(feature.getEType().getName())) {
			gf.setChildren(true);
			gf.setCreateChild(true);
		}
		
		return gf;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EcoreSwitch#caseEClass(org.eclipse.emf.ecore.EClass)
	 */
	@Override
	public GenClass caseEClass(EClass eClass) {
		GenClass gc = GenModelFactory.eINSTANCE.createGenClass();
		gc.setEcoreClass(eClass);
		gc.setImage(false);
		for (EStructuralFeature feature : eClass.getEStructuralFeatures()) {
			gc.getGenFeatures().add(caseEStructuralFeature(feature));
		}

		return gc;
	}

	/**
	 * Removes the last segment from the NS URI if it matches 
	 * the NS Prefix
	 * @param ePackage
	 * @return
	 */
	private String getBasePackage(EPackage ePackage) {
		String prefix = ePackage.getNsPrefix();
		int lastSegmentIdx = prefix.lastIndexOf('.');
		if (lastSegmentIdx > 0) {
			String lastSegment = prefix.substring(lastSegmentIdx + 1);
			if (ePackage.getName().equalsIgnoreCase(lastSegment)) {
				// Remove last segment from prefix if equal to the package name
				// (prevents "com.example.project.project")
				prefix = prefix.substring(0, lastSegmentIdx);
			}
		}

		return prefix;
	}
}

/**
 * <ecore:EPackage xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 * xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" name="testmodel"
 * nsURI="http:///org/eclipse/stem/diseasemodels/testmodel/testmodel.ecore"
 * nsPrefix="org.eclipse.stem.diseasemodels.testmodel"> <eClassifiers
 * xsi:type="ecore:EClass" name="label1Label"/> <eClassifiers
 * xsi:type="ecore:EClass" name="label1LabelValue"> <eStructuralFeatures
 * xsi:type="ecore:EAttribute" name="s1"
 * eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
 * <eStructuralFeatures xsi:type="ecore:EAttribute" name="s2"
 * eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble"/>
 * </eClassifiers> <eClassifiers xsi:type="ecore:EClass"
 * name="TransformerDiseaseModel"
 * eSuperTypes="http:///org/eclipse/stem/diseasemodels/standard.ecore#//SI">
 * <eAnnotations source="org.eclipse.stem.model.label"> <details key="*"
 * value="label1Label"/> </eAnnotations> <eAnnotations
 * source="org.eclipse.stem.model.labelvalue"> <details key="*"
 * value="label1LabelValue"/> </eAnnotations> <eStructuralFeatures
 * xsi:type="ecore:EAttribute" name="param1"
 * eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EDouble">
 * <eAnnotations source="org.eclipse.stem.models.feature.messages"> <details
 * key="name" value="Parameter 1"/> </eAnnotations> </eStructuralFeatures>
 * <eStructuralFeatures xsi:type="ecore:EAttribute" name="param2"
 * eType="ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString">
 * <eAnnotations source="org.eclipse.stem.models.feature.constraint"> <details
 * key="minValue" value="0.0"/> <details key="maxValue" value="1.0"/>
 * </eAnnotations> <eAnnotations
 * source="org.eclipse.stem.models.feature.messages"> <details key="name"
 * value="Parameter 2"/> </eAnnotations> </eStructuralFeatures> </eClassifiers>
 * </ecore:EPackage>
 * 
 * <genmodel:GenModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI"
 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 * xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore"
 * xmlns:genmodel="http://www.eclipse.org/emf/2002/GenModel"
 * modelDirectory="/testproject/src" modelPluginID="testproject"
 * modelName="Test1" importerID="org.eclipse.emf.importer.ecore"
 * copyrightFields="false"> <genPackages prefix="Testmodel"
 * disposableProviderFactory="true"> <ecorePackage href="test1.ecore#/"/>
 * <genClasses> <ecoreClass href="test1.ecore#//label1Label"/> </genClasses>
 * <genClasses> <ecoreClass href="test1.ecore#//label1LabelValue"/> <genFeatures
 * createChild="false"> <ecoreFeature xsi:type="ecore:EAttribute"
 * href="test1.ecore#//label1LabelValue/s1"/> </genFeatures> <genFeatures
 * createChild="false"> <ecoreFeature xsi:type="ecore:EAttribute"
 * href="test1.ecore#//label1LabelValue/s2"/> </genFeatures> </genClasses>
 * <genClasses> <ecoreClass href="test1.ecore#//TransformerDiseaseModel"/>
 * <genFeatures createChild="false"> <ecoreFeature xsi:type="ecore:EAttribute"
 * href="test1.ecore#//TransformerDiseaseModel/param1"/> </genFeatures>
 * <genFeatures createChild="false"> <ecoreFeature xsi:type="ecore:EAttribute"
 * href="test1.ecore#//TransformerDiseaseModel/param2"/> </genFeatures>
 * </genClasses> </genPackages> <usedGenPackages
 * href="../../../plugin/org.eclipse.stem.core/model/core.genmodel#//common"/>
 * <usedGenPackages href=
 * "../../../plugin/org.eclipse.stem.core/model/core.genmodel#//experiment"/>
 * </>
 */
