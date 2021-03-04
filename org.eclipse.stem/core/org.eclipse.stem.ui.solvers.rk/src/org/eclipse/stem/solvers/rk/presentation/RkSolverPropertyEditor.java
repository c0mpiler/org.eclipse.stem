package org.eclipse.stem.solvers.rk.presentation;

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

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.solvers.rk.DormandPrince54;
import org.eclipse.stem.solvers.rk.DormandPrince853;
import org.eclipse.stem.solvers.rk.FastRungeKutta;
import org.eclipse.stem.solvers.rk.GraggBulirschStoer;
import org.eclipse.stem.solvers.rk.HighamHall54;
import org.eclipse.stem.solvers.rk.RkFactory;
import org.eclipse.stem.solvers.rk.RkPackage;
import org.eclipse.stem.solvers.rk.RungeKutta;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProvider;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapter;
import org.eclipse.stem.ui.adapters.propertystrings.PropertyStringProviderAdapterFactory;
import org.eclipse.stem.ui.solvers.rk.SolverMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class RkSolverPropertyEditor extends org.eclipse.stem.core.solver.SolverPropertyEditor {

	/**
	 * @param parent
	 * @param style
	 * @param diseaseModel
	 * @param projectValidator
	 */
	public RkSolverPropertyEditor(Composite parent,
			int style, Solver solver,
			ModifyListener projectValidator) {
		super(parent, style);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		setLayout(gridLayout);

		// Get the adapter that will provide NLS'd names for the
		// properties of the disease model
		final PropertyStringProviderAdapter pspa = (PropertyStringProviderAdapter) PropertyStringProviderAdapterFactory.INSTANCE
				.adapt(solver, PropertyStringProvider.class);

		final ComposedAdapterFactory itemProviderFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		
		final IItemPropertySource propertySource = (IItemPropertySource) itemProviderFactory
				.adapt(solver, IItemPropertySource.class);
		
		final List<IItemPropertyDescriptor> properties = propertySource
				.getPropertyDescriptors(solver);

		for (final IItemPropertyDescriptor descriptor : properties) {
			final EStructuralFeature feature = (EStructuralFeature) descriptor
					.getFeature(null);
			// Is this a disease model property that the user should specify?
			if (isUserSpecifiedSolverProperty(feature)) {
				// Yes
				final Label label = new Label(this, SWT.NONE);
				label.setText(pspa.getPropertyName(descriptor));

				final GridData labelGD = new GridData(GridData.BEGINNING);
				labelGD.grabExcessHorizontalSpace = true;
				labelGD.horizontalAlignment = SWT.FILL;
				labelGD.horizontalIndent = 0;
				label.setLayoutData(labelGD);

				// Get a string value for the default value of the feature

				final String defaultValueString = getPropertyDefaultValueString(descriptor);

				final Text text = new Text(this, SWT.BORDER | SWT.TRAIL);
				text.setText(defaultValueString);
				text.setToolTipText(pspa.getPropertyToolTip(descriptor));
				map.put(feature, text);

				final GridData textGD = new GridData(GridData.END);
				textGD.grabExcessHorizontalSpace = true;
				textGD.horizontalAlignment = SWT.FILL;
				text.setLayoutData(textGD);

				text.addModifyListener(projectValidator);

				final Label unitLabel = new Label(this, SWT.NONE);
				unitLabel.setText(pspa.getPropertyUnits(descriptor));
				final GridData unitLabelGD = new GridData(GridData.END);
				unitLabelGD.verticalAlignment = GridData.CENTER;
				unitLabel.setLayoutData(unitLabelGD);

			} // if user specified
		} // for each solver property
	}
	
	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature 
	 * that is specified by a user.
	 */
	public static boolean isUserSpecifiedSolverProperty(final EStructuralFeature feature) {
		boolean retValue = false;
		final EClass containingClass = feature.getEContainingClass();
		// Is it a disease model property?
		if (containingClass.equals(RkPackage.eINSTANCE.getRungeKutta()) ||
				containingClass.equals(RkPackage.eINSTANCE.getDormandPrince853()) ||
				containingClass.equals(RkPackage.eINSTANCE.getDormandPrince54()) ||
				containingClass.equals(RkPackage.eINSTANCE.getFastRungeKutta()) ||
				containingClass.equals(RkPackage.eINSTANCE.getGraggBulirschStoer()) ||
				containingClass.equals(RkPackage.eINSTANCE.getHighamHall54())) {
			retValue = true;
		} // if a disease model property
		return retValue;
	} // isUserSpecifiedDiseaseModelProperty

	

	public RkSolverPropertyEditor(Composite parent, int style) {
		super(parent,style);
	}

	/**
	 * @see org.eclipse.stem.ui.wizards.StandardDiseaseModelPropertyEditor#populate(org.eclipse.stem.diseasemodels.standard.DiseaseModel)
	 */
	@Override
	public void populate(Solver solver) {
		super.populate(solver);
		
		for (final Map.Entry<EStructuralFeature, Text> entry : map.entrySet()) {
			double dVal = 0.0;
		
			if(solver instanceof RungeKutta)
				switch (entry.getKey().getFeatureID()) {
				case RkPackage.RUNGE_KUTTA__RELATIVE_TOLERANCE:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((RungeKutta) solver).setRelativeTolerance(dVal);
					break;
				case RkPackage.RUNGE_KUTTA__MIN_STEP:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((RungeKutta) solver).setMinStep(dVal);
					break;
				default:
					break;
				} // switch
			else if(solver instanceof DormandPrince853) {
				switch (entry.getKey().getFeatureID()) {
				case RkPackage.DORMAND_PRINCE853__RELATIVE_TOLERANCE:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince853) solver).setRelativeTolerance(dVal);
					break;
				case RkPackage.DORMAND_PRINCE853__ABSOLUTE_TOLERANCE:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince853) solver).setAbsoluteTolerance(dVal);
					break;
				case RkPackage.DORMAND_PRINCE853__MAX_STEP:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince853) solver).setMaxStep(dVal);
					break;
				case RkPackage.DORMAND_PRINCE853__MIN_STEP:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince853) solver).setMinStep(dVal);
					break;
				default:
					break;
				} // switch
			} else if(solver instanceof DormandPrince54) {
				switch (entry.getKey().getFeatureID()) {
				case RkPackage.DORMAND_PRINCE54__RELATIVE_TOLERANCE:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince54) solver).setRelativeTolerance(dVal);
					break;
				case RkPackage.DORMAND_PRINCE54__ABSOLUTE_TOLERANCE:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince54) solver).setAbsoluteTolerance(dVal);
					break;
				case RkPackage.DORMAND_PRINCE54__MAX_STEP:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince54) solver).setMaxStep(dVal);
					break;
				case RkPackage.DORMAND_PRINCE54__MIN_STEP:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((DormandPrince54) solver).setMinStep(dVal);
					break;
				default:
					break;
				} // switch
			} else if(solver instanceof FastRungeKutta)
				switch (entry.getKey().getFeatureID()) {
				case RkPackage.FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((FastRungeKutta) solver).setRelativeTolerance(dVal);
					break;
				case RkPackage.FAST_RUNGE_KUTTA__MIN_STEP:
					dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
					((FastRungeKutta) solver).setMinStep(dVal);
					break;
				default:
					break;
				} // switch
			else if(solver instanceof GraggBulirschStoer) 
				switch (entry.getKey().getFeatureID()) {
					case RkPackage.GRAGG_BULIRSCH_STOER__RELATIVE_TOLERANCE:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((GraggBulirschStoer) solver).setRelativeTolerance(dVal);
						break;
					case RkPackage.GRAGG_BULIRSCH_STOER__ABSOLUTE_TOLERANCE:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((GraggBulirschStoer) solver).setAbsoluteTolerance(dVal);
						break;
					case RkPackage.GRAGG_BULIRSCH_STOER__MAX_STEP:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((GraggBulirschStoer) solver).setMaxStep(dVal);
						break;
					case RkPackage.GRAGG_BULIRSCH_STOER__MIN_STEP:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((GraggBulirschStoer) solver).setMinStep(dVal);
						break;
					default:
						break;
				} // switch
			else if(solver instanceof HighamHall54) 
					switch (entry.getKey().getFeatureID()) {
					case RkPackage.HIGHAM_HALL54__RELATIVE_TOLERANCE:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((HighamHall54) solver).setRelativeTolerance(dVal);
						break;
					case RkPackage.HIGHAM_HALL54__ABSOLUTE_TOLERANCE:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((HighamHall54) solver).setAbsoluteTolerance(dVal);
						break;
					case RkPackage.HIGHAM_HALL54__MAX_STEP:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((HighamHall54) solver).setMaxStep(dVal);
						break;
					case RkPackage.HIGHAM_HALL54__MIN_STEP:
						dVal = (Double.valueOf(entry.getValue().getText())).doubleValue();
						((HighamHall54) solver).setMinStep(dVal);
						break;
					default:
						break;
					} // switch
		} // for each Map.entry
	}

	public boolean validate() {
		if (!super.validate()) {
			return false;
		}

		Text text;

		// RK Relative Tolerance
		text = map
				.get(RkPackage.Literals.RUNGE_KUTTA__RELATIVE_TOLERANCE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_REL_TOL"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_REL_TOL"); //$NON-NLS-1$
				return false;
			}
		}

		// RK Min step
		text = map
				.get(RkPackage.Literals.RUNGE_KUTTA__MIN_STEP);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_MIN_STEP"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_MIN_STEP"); //$NON-NLS-1$
				return false;
			}
		}

		// Fast RK Relative Tolerance
		text = map
				.get(RkPackage.Literals.FAST_RUNGE_KUTTA__RELATIVE_TOLERANCE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_REL_TOL"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_REL_TOL"); //$NON-NLS-1$
				return false;
			}
		}

		// Fast RK Min step
		text = map
				.get(RkPackage.Literals.FAST_RUNGE_KUTTA__MIN_STEP);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_MIN_STEP"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_RK_INVALID_MIN_STEP"); //$NON-NLS-1$
				return false;
			}
		}

		// DP853
		text = map.get(RkPackage.Literals.DORMAND_PRINCE853__ABSOLUTE_TOLERANCE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
					return false;
				}
		}
		text = map.get(RkPackage.Literals.DORMAND_PRINCE853__RELATIVE_TOLERANCE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
					return false;
				}
		}

		text = map.get(RkPackage.Literals.DORMAND_PRINCE853__MIN_STEP);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
					return false;
				}
		}
		text = map.get(RkPackage.Literals.DORMAND_PRINCE853__MAX_STEP);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
				return false;
			}
		}

		// DP54
		text = map.get(RkPackage.Literals.DORMAND_PRINCE54__ABSOLUTE_TOLERANCE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
				return false;
			}
		}
		text = map.get(RkPackage.Literals.DORMAND_PRINCE54__RELATIVE_TOLERANCE);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
				return false;
			}
		}

		text = map.get(RkPackage.Literals.DORMAND_PRINCE54__MIN_STEP);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
				return false;
			}
		}
		text = map.get(RkPackage.Literals.DORMAND_PRINCE54__MAX_STEP);
		if (text != null) {
			if (text.getText().equals("")) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
				return false;
			} else if (!isValidValue(text.getText(), 0.0)) {
				errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
				return false;
			}
		}
		
		// Gragg Bulirsch
				text = map.get(RkPackage.Literals.GRAGG_BULIRSCH_STOER__ABSOLUTE_TOLERANCE);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
						return false;
					}
				}
				text = map.get(RkPackage.Literals.GRAGG_BULIRSCH_STOER__RELATIVE_TOLERANCE);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
						return false;
					}
				}

				text = map.get(RkPackage.Literals.GRAGG_BULIRSCH_STOER__MIN_STEP);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
						return false;
					}
				}
				text = map.get(RkPackage.Literals.GRAGG_BULIRSCH_STOER__MAX_STEP);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
						return false;
					}
				}
				
				// Higham hall
				text = map.get(RkPackage.Literals.HIGHAM_HALL54__ABSOLUTE_TOLERANCE);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_ABS_TOLERANCE"); //$NON-NLS-1$
						return false;
					}
				}
				text = map.get(RkPackage.Literals.HIGHAM_HALL54__RELATIVE_TOLERANCE);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_REL_TOLERANCE"); //$NON-NLS-1$
						return false;
					}
				}

				text = map.get(RkPackage.Literals.HIGHAM_HALL54__MIN_STEP);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MIN_STEP"); //$NON-NLS-1$
						return false;
					}
				}
				text = map.get(RkPackage.Literals.HIGHAM_HALL54__MAX_STEP);
				if (text != null) {
					if (text.getText().equals("")) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
						return false;
					} else if (!isValidValue(text.getText(), 0.0)) {
						errorMessage = SolverMessages.getString("SOLV_DP_INVALID_MAX_STEP"); //$NON-NLS-1$
						return false;
					}
				}

		return true;
	} // validate

	
	private boolean isValidValue(String s, double minValue) {
		boolean ret = true;
		try {
			double d = Double.parseDouble(s);
			if(d < minValue) ret=false;
		} catch(Exception e) {
			ret = false;
		}
		return ret;
	}
	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}

	@Override
	public Solver createAndPopulateSolver() {
		
		// Use the map to determine which solver to use
		
		Set<EStructuralFeature>keys = map.keySet();
		EStructuralFeature feature = keys.iterator().next(); //  Must be at least one
		final EClass containingClass = feature.getEContainingClass();
		// Is it a disease model property?
		Solver retValue = null;
		if (containingClass.equals(RkPackage.eINSTANCE.getRungeKutta()))
			retValue = RkFactory.eINSTANCE.createRungeKutta();
		else if (containingClass.equals(RkPackage.eINSTANCE.getDormandPrince853())) 
			retValue = RkFactory.eINSTANCE.createDormandPrince853();
		else if (containingClass.equals(RkPackage.eINSTANCE.getDormandPrince54())) 
			retValue = RkFactory.eINSTANCE.createDormandPrince54();
		else if (containingClass.equals(RkPackage.eINSTANCE.getFastRungeKutta())) 
			retValue = RkFactory.eINSTANCE.createFastRungeKutta();
		else if (containingClass.equals(RkPackage.eINSTANCE.getGraggBulirschStoer())) 
			retValue = RkFactory.eINSTANCE.createGraggBulirschStoer();
		else if (containingClass.equals(RkPackage.eINSTANCE.getHighamHall54())) 
			retValue = RkFactory.eINSTANCE.createHighamHall54();

		retValue.setURI(STEMURI.createURI(RungeKutta.URI_TYPE_SOLVER_SEGMENT+"/"+STEMURI.generateUniquePart()));
		populate(retValue);
		return retValue;
	}
} // RkSolverPropertyEditor
