package org.eclipse.stem.diseasemodels.multipopulation.presentation;

/*******************************************************************************
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
 *******************************************************************************/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.stem.core.common.CommonFactory;
import org.eclipse.stem.core.common.CommonPackage;
import org.eclipse.stem.core.common.DoubleValue;
import org.eclipse.stem.core.common.DoubleValueList;
import org.eclipse.stem.core.common.DoubleValueMatrix;
import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSEIRDiseaseModel;
import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIDiseaseModel;
import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSIRDiseaseModel;
import org.eclipse.stem.diseasemodels.multipopulation.MultiPopulationSeasonalDiseaseModel;
import org.eclipse.stem.diseasemodels.multipopulation.MultipopulationPackage;
import org.eclipse.stem.diseasemodels.standard.DiseaseModel;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapter;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;
import org.eclipse.stem.ui.widgets.MatrixEditorDialog;
import org.eclipse.stem.ui.widgets.MatrixEditorWidget.MatrixEditorValidator;
import org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 *
 */
public class MultiPopulationDiseaseModelPropertyEditor extends
		StandardDiseaseModelPropertyEditor {

	protected final Map<EStructuralFeature, String[]> matrixMap = new HashMap<EStructuralFeature, String[]>();

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public MultiPopulationDiseaseModelPropertyEditor(Composite parent,
			int style, DiseaseModel diseaseModel,
			ModifyListener projectValidator, IProject project) {
		super(parent, style, diseaseModel, projectValidator, project);

		final PropertyStringProviderAdapter pspa = (PropertyStringProviderAdapter) PropertyStringProviderAdapterFactory.INSTANCE
				.adapt(diseaseModel, PropertyStringProvider.class);
		final ComposedAdapterFactory itemProviderFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		final IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory
				.adapt(diseaseModel, IItemPropertySource.class);
		final List<IItemPropertyDescriptor> properties = propertySource
				.getPropertyDescriptors(diseaseModel);

		for (final IItemPropertyDescriptor descriptor : properties) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			final EClassifier type = feature.getEType();

			if (type != CommonPackage.Literals.STRING_VALUE_LIST
					&& type != CommonPackage.Literals.DOUBLE_VALUE_LIST
					&& type != CommonPackage.Literals.DOUBLE_VALUE_MATRIX) {
				continue;
			}

			Label label = new Label(this, SWT.NONE);
			label.setText(pspa.getPropertyName(descriptor));
			label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

			Button button = new Button(this, SWT.NONE);

			if (type.getClassifierID() == CommonPackage.DOUBLE_VALUE_LIST
					|| type.getClassifierID() == CommonPackage.STRING_VALUE_LIST)
				button.setImage(AbstractUIPlugin.imageDescriptorFromPlugin(
						"org.eclipse.stem.ui",
						"/icons/full/customobj16/List.gif").createImage());
			else
				button.setImage(AbstractUIPlugin.imageDescriptorFromPlugin(
						"org.eclipse.stem.ui",
						"/icons/full/customobj16/Matrix.gif").createImage());

			button.setLayoutData(new GridData(GridData.END));
			button.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent arg0) {
					String title = pspa.getPropertyName(descriptor);
					String[] existingVals = matrixMap.get(feature);
					short cols = getColCount(feature);
					short rows = getRowCount(feature);
					String[] rownames = getRowNames(feature);
					String[] colnames = getColNames(feature);
					boolean fixedSize = getFixedSize(feature);
					MatrixEditorValidator validator = getValidator(feature);

					// Pre-populate with 0 (default from EMF not possible
					// since it's
					// a reference)
					if (existingVals == null
							&& (type.getClassifierID() == CommonPackage.DOUBLE_VALUE_LIST || type
									.getClassifierID() == CommonPackage.DOUBLE_VALUE_MATRIX)) {
						existingVals = new String[cols * rows];
						for (int i = 0; i < cols * rows; ++i)
							existingVals[i] = "0.0";
					}

					Shell shell = MultiPopulationDiseaseModelPropertyEditor.this
							.getShell();
					MatrixEditorDialog dialog = new MatrixEditorDialog(shell,
							SWT.NONE, title, rows, cols, rownames, colnames,
							existingVals, fixedSize, validator);
					String[] res = dialog.open();

					if (res != null) {
						matrixMap.put(feature, res);
					}

					resizeListsAndMatrices();
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent arg0) {
				}
			});

			final Label unitLabel = new Label(this, SWT.NONE);
			unitLabel.setText(pspa.getPropertyUnits(descriptor));
			unitLabel.setLayoutData(new GridData(SWT.END, SWT.CENTER, false,
					false));
		}
	} // MultiDiseaseModelPropertyEditor

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#populate(org.eclipse.stem.diseasemodels.standard.DiseaseModel)
	 */
	@Override
	public void populate(DiseaseModel diseaseModel) {
		super.populate(diseaseModel);

		if (diseaseModel instanceof MultiPopulationSIDiseaseModel) {
			MultiPopulationSIDiseaseModel model = (MultiPopulationSIDiseaseModel) diseaseModel;

			String[] svals = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS);
			if (svals != null) {
				model.setPopulationGroups(CommonFactory.eINSTANCE
						.createStringValueList());
				for (String s : svals) {
					org.eclipse.stem.core.common.StringValue sval = CommonFactory.eINSTANCE
							.createStringValue();
					sval.setValue(s);
					model.getPopulationGroups().getValues().add(sval);
				}
			}

			svals = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE);
			if (svals != null) {
				double[] dvals = getDoubleArray(svals);
				int groups = (int) Math.sqrt(dvals.length);
				model.setTransmissionRate(CommonFactory.eINSTANCE
						.createDoubleValueMatrix());
				for (int r = 0; r < groups; r++) {
					DoubleValueList nl = CommonFactory.eINSTANCE
							.createDoubleValueList();
					model.getTransmissionRate().getValueLists().add(nl);
					for (int c = 0; c < groups; ++c) {
						DoubleValue dval = CommonFactory.eINSTANCE
								.createDoubleValue();
						dval.setValue(dvals[r * groups + c]);
						nl.getValues().add(dval);
					}
				}
			}

			svals = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE);
			if (svals != null) {
				double[] dvals = getDoubleArray(svals);
				model.setInfectiousMortalityRate(CommonFactory.eINSTANCE
						.createDoubleValueList());
				for (double d : dvals) {
					DoubleValue dval = CommonPackage.eINSTANCE
							.getCommonFactory().createDoubleValue();
					dval.setValue(d);
					model.getInfectiousMortalityRate().getValues().add(dval);
				}
			}

			svals = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE);
			if (svals != null) {
				double[] dvals = getDoubleArray(svals);
				model.setRecoveryRate(CommonFactory.eINSTANCE
						.createDoubleValueList());
				for (double d : dvals) {
					DoubleValue dval = CommonFactory.eINSTANCE
							.createDoubleValue();
					dval.setValue(d);
					((MultiPopulationSIDiseaseModel) diseaseModel)
							.getRecoveryRate().getValues().add(dval);
				}
			}
		}

		if (diseaseModel instanceof MultiPopulationSEIRDiseaseModel) {
			MultiPopulationSEIRDiseaseModel model = (MultiPopulationSEIRDiseaseModel) diseaseModel;

			String[] svals = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE);
			if (svals != null) {
				double[] dvals = getDoubleArray(svals);
				model.setIncubationRate(CommonFactory.eINSTANCE
						.createDoubleValueList());
				for (double d : dvals) {
					DoubleValue dval = CommonFactory.eINSTANCE
							.createDoubleValue();
					dval.setValue(d);
					model.getIncubationRate().getValues().add(dval);
				}
			}
		}

		if (diseaseModel instanceof MultiPopulationSIRDiseaseModel) {
			MultiPopulationSIRDiseaseModel model = (MultiPopulationSIRDiseaseModel) diseaseModel;

			String[] svals = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE);
			if (svals != null) {
				double[] dvals = getDoubleArray(svals);
				model.setImmunityLossRate(CommonFactory.eINSTANCE
						.createDoubleValueList());
				for (double d : dvals) {
					DoubleValue dval = CommonFactory.eINSTANCE
							.createDoubleValue();
					dval.setValue(d);
					model.getImmunityLossRate().getValues().add(dval);
				}
			}
		}

		if (diseaseModel instanceof MultiPopulationSeasonalDiseaseModel) {
			MultiPopulationSeasonalDiseaseModel model = (MultiPopulationSeasonalDiseaseModel) diseaseModel;

			model.setUseSplineInterpolation(booleanMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__USE_SPLINE_INTERPOLATION)
					.getSelection());

			String[] svals = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS);
			if (svals != null) {
				double[] dvals = getDoubleArray(svals);
				int points = (int) (dvals.length / 2);
				model.setModulationPoints(CommonFactory.eINSTANCE
						.createDoubleValueMatrix());
				for (int r = 0; r < points; ++r) {
					DoubleValueList nl = CommonPackage.eINSTANCE
							.getCommonFactory().createDoubleValueList();
					model.getModulationPoints().getValueLists().add(nl);
					for (int c = 0; c < 2; ++c) {
						DoubleValue dval = CommonPackage.eINSTANCE
								.getCommonFactory().createDoubleValue();
						dval.setValue(dvals[r * 2 + c]);
						nl.getValues().add(dval);
					}
				}
			}
		}

		// Let's fill in the identifiers for the various rates to make it easier
		// to edit later in the property editor
		if (((MultiPopulationSIDiseaseModel) diseaseModel)
				.getPopulationGroups() != null) {
			String[] groups = new String[((MultiPopulationSIDiseaseModel) diseaseModel)
					.getPopulationGroups().getValues().size()];
			int i = 0;
			for (org.eclipse.stem.core.common.StringValue sv : ((MultiPopulationSIDiseaseModel) diseaseModel)
					.getPopulationGroups().getValues())
				groups[i++] = sv.getValue();

			i = 0;
			DoubleValueList dvl = ((MultiPopulationSIDiseaseModel) diseaseModel)
					.getInfectiousMortalityRate();
			if (dvl != null)
				for (DoubleValue dv : dvl.getValues())
					dv.setIdentifier(groups[i++]);

			i = 0;
			dvl = ((MultiPopulationSIDiseaseModel) diseaseModel)
					.getRecoveryRate();
			if (dvl != null)
				for (DoubleValue dv : dvl.getValues())
					dv.setIdentifier(groups[i++]);

			i = 0;
			DoubleValueMatrix dvm = ((MultiPopulationSIDiseaseModel) diseaseModel)
					.getTransmissionRate();
			if (dvm != null)
				for (DoubleValueList dvl2 : dvm.getValueLists()) {
					dvl2.setIdentifier(groups[i++]);
					int j = 0;
					for (DoubleValue dv : dvl2.getValues())
						dv.setIdentifier(groups[j++]);
				}

			if (diseaseModel instanceof MultiPopulationSIRDiseaseModel) {
				i = 0;
				dvl = ((MultiPopulationSIRDiseaseModel) diseaseModel)
						.getImmunityLossRate();
				if (dvl != null)
					for (DoubleValue dv : dvl.getValues())
						dv.setIdentifier(groups[i++]);
			}

			if (diseaseModel instanceof MultiPopulationSEIRDiseaseModel) {
				i = 0;
				dvl = ((MultiPopulationSEIRDiseaseModel) diseaseModel)
						.getIncubationRate();
				if (dvl != null)
					for (DoubleValue dv : dvl.getValues())
						dv.setIdentifier(groups[i++]);
			}

			if (diseaseModel instanceof MultiPopulationSeasonalDiseaseModel) {
				i = 0;
				dvm = ((MultiPopulationSeasonalDiseaseModel) diseaseModel)
						.getModulationPoints();
				if (dvm != null)
					for (DoubleValueList dvl2 : dvm.getValueLists()) {
						dvl2.setIdentifier("p" + (i++));
						dvl2.getValues().get(0).setIdentifier("x");
						dvl2.getValues().get(1).setIdentifier("y");
					}
			}
		} // has groups
	}

	private double[] getDoubleArray(String[] svals) {
		double[] res = new double[svals.length];
		for (int i = 0; i < res.length; ++i)
			res[i] = Double.parseDouble(svals[i]);
		return res;
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#validate()
	 */
	@Override
	public boolean validate() {
		return super.validate();
	}

	public short getRowCount(EStructuralFeature feature) {
		if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS) {
			String[] points = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS);

			if (points != null) {
				return (short) (points.length / 2);
			} else {
				return 0;
			}
		} else {
			String[] groups = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS);

			if (groups != null) {
				return (short) groups.length;
			} else {
				return 0;
			}
		}
	}

	public short getColCount(EStructuralFeature feature) {
		if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE) {
			String[] groups = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS);

			if (groups != null) {
				return (short) groups.length;
			}

			return 0;
		} else if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS) {
			return 2;
		} else {
			return 1;
		}
	}

	public boolean getFixedSize(EStructuralFeature feature) {
		if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS) {
			return false;
		} else if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS) {
			return false;
		} else {
			return true;
		}
	}

	public String[] getRowNames(EStructuralFeature feature) {
		if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS) {
			return null;
		} else if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE) {
			String[] groups = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS);
					

			if (groups != null) {
				groups = groups.clone();
				for (int i = 0; i < groups.length; i++) {
					groups[i] = MultipopulationDiseaseWizardMessages
							.getString("transmissionTo") + " " + groups[i];
				}
			}

			return groups;
		} else if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS) {
			return null;
		} else {
			return matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS);
		}
	}

	public String[] getColNames(EStructuralFeature feature) {
		if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE) {
			String[] groups = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS);

			if (groups != null) {
				groups = groups.clone();
				for (int i = 0; i < groups.length; i++) {
					groups[i] = MultipopulationDiseaseWizardMessages
							.getString("transmissionFrom") + " " + groups[i];
				}
			}

			return groups;
		} else if (feature == MultipopulationPackage.Literals.MULTI_POPULATION_SEASONAL_DISEASE_MODEL__MODULATION_POINTS) {
			return new String[] {
					MultipopulationDiseaseWizardMessages
							.getString("dayOfTheYear"),
					MultipopulationDiseaseWizardMessages
							.getString("transmissionFactor") };
		} else {
			return new String[] { "" };
		}
	}

	/**
	 * getValidator. Validators subclass for more advanced validation (>0 etc.)
	 * 
	 * @param feature
	 * @return
	 */
	public MatrixEditorValidator getValidator(EStructuralFeature feature) {
		EClassifier type = feature.getEType();
		MatrixEditorValidator validator = null;
		if (type == CommonPackage.Literals.DOUBLE_VALUE_LIST
				|| type == CommonPackage.Literals.DOUBLE_VALUE_MATRIX)
			validator = new MatrixEditorValidator() {

				@Override
				public boolean validateValue(String val) {
					if (val == null || val.trim().equals(""))
						return false;
					try {
						Double.parseDouble(val.trim());
					} catch (NumberFormatException nfe) {
						return false;
					}
					return true;
				}

				@Override
				public boolean validateAllValues(List<Text> vals) {
					return true;
				}
			};
		else if (type == CommonPackage.Literals.STRING_VALUE_LIST)
			validator = new MatrixEditorValidator() {

				@Override
				public boolean validateValue(String val) {
					if (val == null || val.trim().equals(""))
						return false;
					return true;
				}

				@Override
				public boolean validateAllValues(List<Text> vals) {
					return true;
				}
			};
		return validator;
	}

	private void resizeListsAndMatrices() {
		String[] groups = matrixMap
				.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__POPULATION_GROUPS);

		if (groups == null) {
			matrixMap
					.remove(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE);
			matrixMap
					.remove(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE);
			matrixMap
					.remove(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE);
			matrixMap
					.remove(MultipopulationPackage.Literals.MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE);
			matrixMap
					.remove(MultipopulationPackage.Literals.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE);
		} else {
			int n = groups.length;

			String[] transmission = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE);
			if (transmission == null || transmission.length != n * n) {
				transmission = new String[n * n];
				Arrays.fill(transmission, "0.0");
				matrixMap
						.put(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__TRANSMISSION_RATE,
								transmission);
			}

			String[] mortality = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE);
			if (mortality == null || mortality.length != n) {
				mortality = new String[n];
				Arrays.fill(mortality, "0.0");
				matrixMap
						.put(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__INFECTIOUS_MORTALITY_RATE,
								mortality);
			}

			String[] recovery = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE);
			if (recovery == null || recovery.length != n) {
				recovery = new String[n];
				Arrays.fill(recovery, "0.0");
				matrixMap
						.put(MultipopulationPackage.Literals.MULTI_POPULATION_SI_DISEASE_MODEL__RECOVERY_RATE,
								recovery);
			}

			String[] immunity = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE);
			if (immunity == null || immunity.length != n) {
				immunity = new String[n];
				Arrays.fill(immunity, "0.0");
				matrixMap
						.put(MultipopulationPackage.Literals.MULTI_POPULATION_SIR_DISEASE_MODEL__IMMUNITY_LOSS_RATE,
								immunity);
			}

			String[] incubation = matrixMap
					.get(MultipopulationPackage.Literals.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE);
			if (incubation == null || incubation.length != n) {
				incubation = new String[n];
				Arrays.fill(incubation, "0.0");
				matrixMap
						.put(MultipopulationPackage.Literals.MULTI_POPULATION_SEIR_DISEASE_MODEL__INCUBATION_RATE,
								incubation);
			}
		}
	}

} // MultiPopulationDiseaseModelPropertyEditor
