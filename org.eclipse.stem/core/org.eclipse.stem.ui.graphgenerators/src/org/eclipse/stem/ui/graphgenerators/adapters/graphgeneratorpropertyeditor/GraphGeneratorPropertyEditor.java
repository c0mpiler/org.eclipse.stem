package org.eclipse.stem.ui.graphgenerators.adapters.graphgeneratorpropertyeditor;

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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.definitions.lattice.impl.LatticeGeneratorUtilityImpl;
import org.eclipse.stem.graphgenerators.AreaUnit;
import org.eclipse.stem.graphgenerators.GraphGenerator;
import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.LatticeGraphGenerator;
import org.eclipse.stem.graphgenerators.MigrationEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.MigrationShapefile;
import org.eclipse.stem.graphgenerators.MixingEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.PajekNetGraphGenerator;
import org.eclipse.stem.graphgenerators.PlateCarreeGlobeGraphGenerator;
import org.eclipse.stem.graphgenerators.RegionShapefile;
import org.eclipse.stem.graphgenerators.RoadShapefile;
import org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator;
import org.eclipse.stem.graphgenerators.Shapefile;
import org.eclipse.stem.graphgenerators.ShapefileGraphGenerator;
import org.eclipse.stem.graphgenerators.SquareLatticeGraphGenerator;
import org.eclipse.stem.graphgenerators.impl.Reader;
import org.eclipse.stem.ui.editors.GenericPropertyEditor;
import org.eclipse.stem.ui.graphgenerators.wizards.Messages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class GraphGeneratorPropertyEditor extends GenericPropertyEditor
		implements SelectionListener, ModifyListener {

	private ModifyListener projectValidator;

	private List<Shapefile> shapefiles;

	private String selectedDir;
	private List<String> columnNames;
	private List<List<String>> data;

	private Button shapeButton;
	private org.eclipse.swt.widgets.List shapeFileList;
	private Group typeGroup;
	private Button regionButton;
	private Button roadButton;
	private Button migrationButton;
	private Button showDataButton;
	private Group dataGroup;
	private Text regionIDText;
	private Combo regionIDCombo;
	private Text regionAreaText;
	private Combo regionAreaCombo;
	private Combo regionAreaUnitCombo;
	private List<Text> regionPopNameTexts;
	private List<Combo> regionPopNameCombos;
	private List<Text> regionPopSizeTexts;
	private List<Combo> regionPopSizeCombos;
	private Button regionAddPopButton;
	private Button regionRemovePopButton;
	private Text roadIDText;
	private Combo roadIDCombo;
	private Text roadClassText;
	private Combo roadClassCombo;
	private Text migrationIDText;
	private Combo migrationIDCombo;
	private Text migrationPopulationText;
	private Combo migrationPopulationCombo;
	private Text migrationRateText;
	private Combo migrationRateCombo;

	public GraphGeneratorPropertyEditor(Composite parent, int style,
			IProject project) {
		super(parent, style, project);
	}

	/**
	 * Create the composite
	 * 
	 * @param parent
	 * @param style
	 * @param projectValidator
	 */
	public GraphGeneratorPropertyEditor(final Composite parent,
			final int style, final GraphGenerator graphGenerator,
			final ModifyListener projectValidator, IProject project) {
		super(parent, style, (Identifiable) graphGenerator, projectValidator,
				project);
		this.projectValidator = projectValidator;

		if (graphGenerator instanceof ShapefileGraphGenerator) {
			shapefiles = new ArrayList<Shapefile>();

			shapeButton = new Button(this, SWT.PUSH);
			shapeButton.setText(Messages.getString("selectShapefiles"));
			shapeButton.addSelectionListener(this);
			shapeButton.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true,
					true, 3, 1));
			Label listLabel = new Label(this, SWT.NONE);
			listLabel.setText(Messages.getString("shapefileListHelp") + ":");
			listLabel.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, true,
					true, 3, 1));
			shapeFileList = new org.eclipse.swt.widgets.List(this, SWT.SINGLE
					| SWT.V_SCROLL | SWT.BORDER);
			shapeFileList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true, 3, 1));
			shapeFileList.addSelectionListener(this);

			regionPopNameTexts = new ArrayList<Text>();
			regionPopNameCombos = new ArrayList<Combo>();
			regionPopSizeTexts = new ArrayList<Text>();
			regionPopSizeCombos = new ArrayList<Combo>();
		}

	}

	/**
	 * @param graphGenerator
	 *            the {@link GraphGenerator} instance to populate.
	 */
	public Graph getGraph(final GraphGenerator graphGenerator) {
		if (graphGenerator instanceof LatticeGraphGenerator) {
			LatticeGraphGenerator lattice = (LatticeGraphGenerator) graphGenerator;

			EAttribute nearest = GraphgeneratorsPackage.Literals.LATTICE_GRAPH_GENERATOR__USE_NEAREST_NEIGHBORS;
			EAttribute nextNearest = GraphgeneratorsPackage.Literals.LATTICE_GRAPH_GENERATOR__USE_NEXT_NEAREST_NEIGHBORS;
			EAttribute periodic = GraphgeneratorsPackage.Literals.LATTICE_GRAPH_GENERATOR__PERIODIC_BOUNDARIES;

			lattice.setUseNearestNeighbors(booleanMap.get(nearest)
					.getSelection());
			lattice.setUseNextNearestNeighbors(booleanMap.get(nextNearest)
					.getSelection());
			lattice.setPeriodicBoundaries(booleanMap.get(periodic)
					.getSelection());
		}

		if (graphGenerator instanceof SquareLatticeGraphGenerator) {
			SquareLatticeGraphGenerator squareLattice = (SquareLatticeGraphGenerator) graphGenerator;

			EAttribute xSize = GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__XSIZE;
			EAttribute ySize = GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__YSIZE;
			EAttribute area = GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__AREA;

			squareLattice.setXSize(Integer.parseInt(map.get(xSize).getText()));
			squareLattice.setYSize(Integer.parseInt(map.get(ySize).getText()));
			squareLattice.setArea(Double.parseDouble(map.get(area).getText()));
		}

		if (graphGenerator instanceof PlateCarreeGlobeGraphGenerator) {
			PlateCarreeGlobeGraphGenerator plateCarree = (PlateCarreeGlobeGraphGenerator) graphGenerator;

			EAttribute angularStep = GraphgeneratorsPackage.Literals.PLATE_CARREE_GLOBE_GRAPH_GENERATOR__ANGULAR_STEP;
			EAttribute radius = GraphgeneratorsPackage.Literals.PLATE_CARREE_GLOBE_GRAPH_GENERATOR__RADIUS;

			plateCarree.setAngularStep(Integer.parseInt(map.get(angularStep)
					.getText()));
			plateCarree
					.setRadius(Double.parseDouble(map.get(radius).getText()));
		}

		if (graphGenerator instanceof MigrationEdgeGraphGenerator) {
			MigrationEdgeGraphGenerator migrationEdge = (MigrationEdgeGraphGenerator) graphGenerator;

			EAttribute rate = GraphgeneratorsPackage.Literals.MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE;
			EAttribute rateType = GraphgeneratorsPackage.Literals.MIGRATION_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES;
			EAttribute population = GraphgeneratorsPackage.Literals.MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION;
			String populationString = map.get(population).getText().trim();
			EAttribute location = GraphgeneratorsPackage.Literals.MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION;
			String locationString = map.get(location).getText().trim();

			migrationEdge.setMigrationRate(Double.parseDouble(map.get(rate)
					.getText()));
			migrationEdge.setUseAbsoluteValues(booleanMap.get(rateType)
					.getSelection());
			if (project != null)
				migrationEdge.setProject(project);

			if (!populationString.isEmpty()) {
				migrationEdge.setPopulation(populationString);
			}

			if (!locationString.isEmpty()) {
				migrationEdge.setLocation(STEMURI.createURI(locationString));
			}
		}

		if (graphGenerator instanceof MixingEdgeGraphGenerator) {
			MixingEdgeGraphGenerator mixingEdge = (MixingEdgeGraphGenerator) graphGenerator;

			EAttribute rate = GraphgeneratorsPackage.Literals.MIXING_EDGE_GRAPH_GENERATOR__MIXING_RATE;
			EAttribute rateType = GraphgeneratorsPackage.Literals.MIXING_EDGE_GRAPH_GENERATOR__USE_ABSOLUTE_VALUES;
			EAttribute population = GraphgeneratorsPackage.Literals.MIXING_EDGE_GRAPH_GENERATOR__POPULATION;
			String populationString = map.get(population).getText().trim();
			EAttribute location = GraphgeneratorsPackage.Literals.MIXING_EDGE_GRAPH_GENERATOR__LOCATION;
			String locationString = map.get(location).getText().trim();

			mixingEdge.setMixingRate(Double
					.parseDouble(map.get(rate).getText()));
			mixingEdge.setUseAbsoluteValues(booleanMap.get(rateType)
					.getSelection());
			if (project != null)
				mixingEdge.setProject(project);

			if (!populationString.isEmpty()) {
				mixingEdge.setPopulation(populationString);
			}

			if (!locationString.isEmpty()) {
				mixingEdge.setLocation(STEMURI.createURI(locationString));
			}
		}

		if (graphGenerator instanceof PajekNetGraphGenerator) {
			PajekNetGraphGenerator pajek = (PajekNetGraphGenerator) graphGenerator;

			EAttribute file = GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE;
			EAttribute scaling = GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__SCALING_FACTOR;
			EAttribute size = GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__NODE_SIZE;
			EAttribute regionURI = GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__USE_REGION_URI;
			EAttribute moveToContainer = GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__MOVE_NODES_TO_CONTAINERS;
			EAttribute useAbsoluteValues = GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__USE_ABSOLUTE_RATES;
			String fileString = map.get(file).getText().trim();

			pajek.setScalingFactor(Double.parseDouble(map.get(scaling)
					.getText()));
			pajek.setNodeSize(Double.parseDouble(map.get(size).getText()));
			pajek.setUseRegionURI(booleanMap.get(regionURI).getSelection());
			pajek.setMoveNodesToContainers(booleanMap.get(moveToContainer)
					.getSelection());
			pajek.setUseAbsoluteRates(booleanMap.get(useAbsoluteValues)
					.getSelection());
			pajek.setProject(project);

			if (!fileString.isEmpty()) {
				pajek.setDataFile(fileString);
			}
		}

		if(graphGenerator instanceof SeasonalMigrationEdgeGraphGenerator) {
			SeasonalMigrationEdgeGraphGenerator migrationEdgeGG = (SeasonalMigrationEdgeGraphGenerator) graphGenerator;

			EAttribute rate = GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE;
			EAttribute population = GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION;
			EAttribute toleranceAngleA = GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A;
			EAttribute toleranceAngleB = GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B;
			String populationString = map.get(population).getText().trim();
			EAttribute locationA = GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_A;
			EAttribute locationB = GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__LOCATION_B;
			Text locationAText = map.get(locationA);
			String locationAString = "";
			if(locationAText != null) locationAString = locationAText.getText().trim();
			Text locationBText = map.get(locationB);
			String locationBString = "";
			if(locationBText != null) locationBString = locationBText.getText().trim();
			String toleranceAngleAString = map.get(toleranceAngleA).getText();
			String toleranceAngleBString = map.get(toleranceAngleB).getText();
			migrationEdgeGG.setMigrationRate(Double.parseDouble(map.get(rate)
					.getText()));
		
			if (project != null)
				migrationEdgeGG.setProject(project);

			if (!populationString.isEmpty()) {
				migrationEdgeGG.setPopulation(populationString);
			}

			if (!locationAString.isEmpty()) {
				migrationEdgeGG.setLocationA(STEMURI.createURI(locationAString));
			}
			if (!locationBString.isEmpty()) {
				migrationEdgeGG.setLocationB(STEMURI.createURI(locationBString));
			}
			migrationEdgeGG.setToleranceAngleA(Double.parseDouble(toleranceAngleAString));
			migrationEdgeGG.setToleranceAngleB(Double.parseDouble(toleranceAngleBString));
		}
		if (graphGenerator instanceof ShapefileGraphGenerator) {
			ShapefileGraphGenerator shapefile = (ShapefileGraphGenerator) graphGenerator;

			shapefile.getShapefiles().clear();
			shapefile.getShapefiles().addAll(shapefiles);
		}

		return graphGenerator.getGraph();
	}

	/**
	 * @return <code>true</code> if the contents are valid, <code>false</code>
	 *         otherwise.
	 */
	@Override
	public boolean validate() {
		boolean retValue = true;
		if (retValue) {
			// Yes
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__XSIZE);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr1"); //$NON-NLS-1$
				} // if
				else {
					// No
					// Is it a valid value?
					retValue = isValidIntValue(text.getText(), 1);
					if (!retValue) {
						// No
						errorMessage = Messages.getString("NGGWizErr2"); //$NON-NLS-1$
					} // if
				}
			} // if text != null
		} // if Transmission Rate

		if (retValue) {
			// Yes
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__YSIZE);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr3"); //$NON-NLS-1$
				} // if
				else {
					// No
					// Is it a valid value?
					retValue = isValidIntValue(text.getText(), 1);
					if (!retValue) {
						// No
						errorMessage = Messages.getString("NGGWizErr4"); //$NON-NLS-1$
					} // if
				}
			} // if text != null
		} //

		if (retValue) {
			// Yes
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__AREA);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr8"); //$NON-NLS-1$
				} // if
				else {
					// No
					// Is it a valid value?
					retValue = isValidValue(text.getText(), 0);
					if (!retValue) {
						// No
						errorMessage = Messages.getString("NGGWizErr9"); //$NON-NLS-1$
					} // if
				}
			} // if text != null
		} // if Non-Linearity Coefficient

		if (retValue) {
			// Yes
			Text text = map
					.get(GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__XSIZE);
			if (text != null) {
				int xsize = Integer.parseInt(text.getText());
				text = map
						.get(GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__YSIZE);
				int ysize = Integer.parseInt(text.getText());
				text = map
						.get(GraphgeneratorsPackage.Literals.SQUARE_LATTICE_GRAPH_GENERATOR__AREA);
				double area = Double.parseDouble(text.getText());

				double scale = Math.sqrt(area);
				if (xsize * scale / LatticeGeneratorUtilityImpl.KM_PER_DEG_LON > 360.0
						|| ysize * scale
								/ LatticeGeneratorUtilityImpl.KM_PER_DEG_LAT > 180.0) {
					retValue = false;
					// Yes
					errorMessage = Messages.getString("NGGWizErr10"); //$NON-NLS-1$
				}
			}
		}
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr5"); //$NON-NLS-1$
				} // if
			}
		}

		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.PLATE_CARREE_GLOBE_GRAPH_GENERATOR__ANGULAR_STEP);
			// Is it a valid value?
			if (text != null) {
				retValue = isValidIntValue(text.getText(), 1);
				if (!retValue) {
					// No
					errorMessage = Messages.getString("NGGWizErr11"); //$NON-NLS-1$
				} // if
			}
		}
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.PLATE_CARREE_GLOBE_GRAPH_GENERATOR__RADIUS);
			// Is it a valid value?
			if (text != null) {
				retValue = isValidDoubleValue(text.getText(), 1);
				if (!retValue) {
					// No
					errorMessage = Messages.getString("NGGWizErr12"); //$NON-NLS-1$
				} // if
			}
		}

		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr5"); //$NON-NLS-1$
				} // if
			}
		}
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE);
			if (text != null) {
				// Yes
				try {
					double rate = Double.parseDouble(text.getText());
					if (rate < 0.0) {
						retValue = false;
						errorMessage = Messages.getString("NGGWizErr7");
					}
				} catch (Exception e) {
					retValue = false;
					errorMessage = Messages.getString("NGGWizErr6");
				}
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr5"); //$NON-NLS-1$
				} // if
			}
		}
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.PAJEK_NET_GRAPH_GENERATOR__DATA_FILE);
			if (text != null) {
				// Yes
				File file = new File(text.getText());
				retValue = file != null && !file.isDirectory() && file.exists();
				if (!retValue)
					errorMessage = Messages.getString("NGGWizErr13");
			}
		}
		if (retValue) {
			if (shapeButton != null) {
				if (shapefiles.isEmpty()) {
					retValue = false;
					errorMessage = Messages.getString("NGGWizErr15");
				} else {
					boolean error = false;

					for (Shapefile s : shapefiles) {
						if (s.getId().equals("")) {
							error = true;
							break;
						} else if (s instanceof RegionShapefile) {
							RegionShapefile rs = (RegionShapefile) s;

							for (int i = 0; i < rs.getPopulationNames().size(); i++) {
								if (rs.getPopulationNames().get(i).equals("")
										|| rs.getPopulationSizes().get(i)
												.equals("")) {
									error = true;
									break;
								}
							}

							if (error) {
								break;
							}
						} else if (s instanceof RoadShapefile) {
							if (((RoadShapefile) s).getRoadClass().equals("")) {
								error = true;
								break;
							}
						} else if (s instanceof MigrationShapefile) {
							MigrationShapefile ms = (MigrationShapefile) s;

							if (ms.getPopulationName().equals("")
									|| ms.getMigrationRate().equals("")) {
								error = true;
								break;
							}
						}
					}

					if (error) {
						retValue = false;
						errorMessage = Messages.getString("NGGWizErr16");
					}
				}
			}
		}
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_A);
			if (text != null) {
				// Yes
				try {
					double angle = Double.parseDouble(text.getText());
					if (angle < 5.0) {
						retValue = false;
						errorMessage = Messages.getString("NGGWizErr17");
					}
					if (angle > 179.0) {
						retValue = false;
						errorMessage = Messages.getString("NGGWizErr17");
					}
				} catch (Exception e) {
					retValue = false;
					errorMessage = Messages.getString("NGGWizErr17");
				}
			}
		}
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__TOLERANCE_ANGLE_B);
			if (text != null) {
				// Yes
				try {
					double angle = Double.parseDouble(text.getText());
					if (angle < 5.0) {
						retValue = false;
						errorMessage = Messages.getString("NGGWizErr17");
					}
					if (angle > 179.0) {
						retValue = false;
						errorMessage = Messages.getString("NGGWizErr17");
					}
				} catch (Exception e) {
					retValue = false;
					errorMessage = Messages.getString("NGGWizErr17");
				}
			}
		}
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__POPULATION);
			if (text != null) {
				// Yes
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr5"); //$NON-NLS-1$
				} // if
			}
		}
		
		if (retValue) {
			final Text text = map
					.get(GraphgeneratorsPackage.Literals.SEASONAL_MIGRATION_EDGE_GRAPH_GENERATOR__MIGRATION_RATE);
			if (text != null) {
				// Yes
				try {
					double rate = Double.parseDouble(text.getText());
					if (rate < 0.0) {
						retValue = false;
						errorMessage = Messages.getString("NGGWizErr6");
					}
				} catch (Exception e) {
					retValue = false;
					errorMessage = Messages.getString("NGGWizErr6");
				}
				retValue = !text.getText().equals(""); //$NON-NLS-1$
				// nothing?
				if (!retValue) {
					// Yes
					errorMessage = Messages.getString("NGGWizErr6"); //$NON-NLS-1$
				} // if
			}
		}
		return retValue;
	}

	/**
	 * @param feature
	 * @return <code>true</code> if the feature is a dublin core feature that is
	 *         specified by a user.
	 */
	@Override
	protected boolean isUserSpecifiedProperty(EStructuralFeature feature) {
		boolean retValue = false;
		EClass containingClass = feature.getEContainingClass();

		if (containingClass.getEPackage() == GraphgeneratorsPackage.eINSTANCE) {
			retValue = true;
		}

		// If the "shapefile" type, then we'll specify it ourself.
		if (containingClass == GraphgeneratorsPackage.Literals.SHAPEFILE_GRAPH_GENERATOR) {
			retValue = false;
		}

		return retValue;
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		if (e.getSource() == shapeButton) {
			FileDialog fileDialog_shp = new FileDialog(new Shell(), SWT.MULTI);

			fileDialog_shp.setFilterPath(selectedDir);
			fileDialog_shp.setFilterExtensions(new String[] { "*.shp" });

			if (fileDialog_shp.open() != null) {
				selectedDir = fileDialog_shp.getFilterPath();
				shapeFileList.removeAll();
				shapefiles.clear();

				for (String fName : fileDialog_shp.getFileNames()) {
					RegionShapefile s = GraphgeneratorsFactory.eINSTANCE
							.createRegionShapefile();

					s.setFileName(fileDialog_shp.getFilterPath() + "/" + fName);
					s.setId("");
					s.setArea("");

					shapeFileList.add(fName);
					shapefiles.add(s);
				}

				if (dataGroup != null) {
					dataGroup.dispose();
				}

				if (showDataButton != null) {
					showDataButton.dispose();
				}

				if (typeGroup != null) {
					typeGroup.dispose();
				}

				shapeFileList.setSelection(0);
				updateSelection();
				updateUI();
				projectValidator.modifyText(null);
			}
		} else if (e.getSource() == shapeFileList) {
			updateSelection();
			updateUI();
		} else if (e.getSource() == showDataButton) {
			new TableDialog(this.getShell(), "", columnNames, data);
		} else if (e.getSource() == regionButton) {
			if (dataGroup != null) {
				dataGroup.dispose();
			}

			int i = shapeFileList.getSelectionIndex();
			RegionShapefile s = GraphgeneratorsFactory.eINSTANCE
					.createRegionShapefile();

			s.setFileName(shapefiles.get(i).getFileName());
			s.setId("");
			s.setArea("");
			shapefiles.set(i, s);
			createRegionComposite();
			updateUI();
			projectValidator.modifyText(null);
		} else if (e.getSource() == roadButton) {
			if (dataGroup != null) {
				dataGroup.dispose();
			}

			int i = shapeFileList.getSelectionIndex();
			RoadShapefile s = GraphgeneratorsFactory.eINSTANCE
					.createRoadShapefile();

			s.setFileName(shapefiles.get(i).getFileName());
			s.setId("");
			s.setRoadClass("");
			shapefiles.set(i, s);
			createRoadComposite();
			updateUI();
			projectValidator.modifyText(null);
		} else if (e.getSource() == migrationButton) {
			if (dataGroup != null) {
				dataGroup.dispose();
			}

			int i = shapeFileList.getSelectionIndex();
			MigrationShapefile s = GraphgeneratorsFactory.eINSTANCE
					.createMigrationShapefile();

			s.setFileName(shapefiles.get(i).getFileName());
			s.setId("");
			s.setPopulationName("");
			s.setMigrationRate("");
			shapefiles.set(i, s);
			createMigrationComposite();
			updateUI();
			projectValidator.modifyText(null);
		} else if (e.getSource() == regionIDCombo) {
			String regionID = "column:"
					+ columnNames.get(regionIDCombo.getSelectionIndex());

			regionIDText.setText(regionID);
			shapefiles.get(shapeFileList.getSelectionIndex()).setId(regionID);
			projectValidator.modifyText(null);
		} else if (e.getSource() == regionAreaCombo) {
			String regionArea = "column:"
					+ columnNames.get(regionAreaCombo.getSelectionIndex());

			regionAreaText.setText(regionArea);
			((RegionShapefile) shapefiles
					.get(shapeFileList.getSelectionIndex()))
					.setArea(regionArea);
			projectValidator.modifyText(null);
		} else if (e.getSource() == regionAreaUnitCombo) {
			RegionShapefile s = (RegionShapefile) shapefiles.get(shapeFileList
					.getSelectionIndex());

			s.setAreaUnit(AreaUnit.get(regionAreaUnitCombo
					.getItem(regionAreaUnitCombo.getSelectionIndex())));
			projectValidator.modifyText(null);
		} else if (e.getSource() == regionAddPopButton) {
			RegionShapefile s = (RegionShapefile) shapefiles.get(shapeFileList
					.getSelectionIndex());

			s.getPopulationNames().add("");
			s.getPopulationSizes().add("");
			updateSelection();
			updateUI();
			projectValidator.modifyText(null);
		} else if (e.getSource() == regionRemovePopButton) {
			RegionShapefile s = (RegionShapefile) shapefiles.get(shapeFileList
					.getSelectionIndex());

			if (!s.getPopulationNames().isEmpty()) {
				s.getPopulationNames().remove("");
				s.getPopulationSizes().remove("");
				updateSelection();
				updateUI();
				projectValidator.modifyText(null);
			}
		} else if (e.getSource() == roadIDCombo) {
			String roadID = "column:"
					+ columnNames.get(roadIDCombo.getSelectionIndex());

			roadIDText.setText(roadID);
			shapefiles.get(shapeFileList.getSelectionIndex()).setId(roadID);
			projectValidator.modifyText(null);
		} else if (e.getSource() == roadClassCombo) {
			String roadClass = "column:"
					+ columnNames.get(roadClassCombo.getSelectionIndex());

			roadClassText.setText(roadClass);
			((RoadShapefile) shapefiles.get(shapeFileList.getSelectionIndex()))
					.setRoadClass(roadClass);
			projectValidator.modifyText(null);
		} else if (e.getSource() == migrationIDCombo) {
			String migrationID = "column:"
					+ columnNames.get(migrationIDCombo.getSelectionIndex());

			migrationIDText.setText(migrationID);
			shapefiles.get(shapeFileList.getSelectionIndex())
					.setId(migrationID);
			projectValidator.modifyText(null);
		} else if (e.getSource() == migrationPopulationCombo) {
			String migrationPopulation = "column:"
					+ columnNames.get(migrationPopulationCombo
							.getSelectionIndex());

			migrationPopulationText.setText(migrationPopulation);
			((MigrationShapefile) shapefiles.get(shapeFileList
					.getSelectionIndex()))
					.setPopulationName(migrationPopulation);
			projectValidator.modifyText(null);
		} else if (e.getSource() == migrationRateCombo) {
			String migrationRate = "column:"
					+ columnNames.get(migrationRateCombo.getSelectionIndex());

			migrationRateText.setText(migrationRate);
			((MigrationShapefile) shapefiles.get(shapeFileList
					.getSelectionIndex())).setMigrationRate(migrationRate);
			projectValidator.modifyText(null);
		} else if (regionPopNameCombos.contains(e.getSource())) {
			int i = regionPopNameCombos.indexOf(e.getSource());
			String popName = "column:"
					+ columnNames.get(regionPopNameCombos.get(i)
							.getSelectionIndex());

			regionPopNameTexts.get(i).setText(popName);
			((RegionShapefile) shapefiles
					.get(shapeFileList.getSelectionIndex()))
					.getPopulationNames().set(i, popName);
			projectValidator.modifyText(null);
		} else if (regionPopSizeCombos.contains(e.getSource())) {
			int i = regionPopSizeCombos.indexOf(e.getSource());
			String popSize = "column:"
					+ columnNames.get(regionPopSizeCombos.get(i)
							.getSelectionIndex());

			regionPopSizeTexts.get(i).setText(popSize);
			((RegionShapefile) shapefiles
					.get(shapeFileList.getSelectionIndex()))
					.getPopulationSizes().set(i, popSize);
			projectValidator.modifyText(null);
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void modifyText(ModifyEvent e) {
		if (e.getSource() == regionAreaText) {
			int column = getColumnIndex(regionAreaText.getText());

			((RegionShapefile) shapefiles
					.get(shapeFileList.getSelectionIndex()))
					.setArea(regionAreaText.getText());

			if (column == -1) {
				regionAreaCombo.removeAll();
				regionAreaCombo.setItems(columnNames.toArray(new String[0]));
			} else {
				regionAreaCombo.select(column);
			}
		} else if (e.getSource() == roadClassText) {
			int column = getColumnIndex(roadClassText.getText());

			((RoadShapefile) shapefiles.get(shapeFileList.getSelectionIndex()))
					.setRoadClass(roadClassText.getText());

			if (column == -1) {
				roadClassCombo.removeAll();
				roadClassCombo.setItems(columnNames.toArray(new String[0]));
			} else {
				roadClassCombo.select(column);
			}
		} else if (e.getSource() == migrationPopulationText) {
			int column = getColumnIndex(migrationPopulationText.getText());

			((MigrationShapefile) shapefiles.get(shapeFileList
					.getSelectionIndex()))
					.setPopulationName(migrationPopulationText.getText());

			if (column == -1) {
				migrationPopulationCombo.removeAll();
				migrationPopulationCombo.setItems(columnNames
						.toArray(new String[0]));
			} else {
				migrationPopulationCombo.select(column);
			}
		} else if (e.getSource() == migrationRateText) {
			int column = getColumnIndex(migrationRateText.getText());

			((MigrationShapefile) shapefiles.get(shapeFileList
					.getSelectionIndex())).setMigrationRate(migrationRateText
					.getText());

			if (column == -1) {
				migrationRateCombo.removeAll();
				migrationRateCombo.setItems(columnNames.toArray(new String[0]));
			} else {
				migrationRateCombo.select(column);
			}
		} else if (regionPopNameTexts.contains(e.getSource())) {
			int i = regionPopNameTexts.indexOf(e.getSource());
			int column = getColumnIndex(regionPopNameTexts.get(i).getText());

			((RegionShapefile) shapefiles
					.get(shapeFileList.getSelectionIndex()))
					.getPopulationNames().set(i,
							regionPopNameTexts.get(i).getText());

			if (column == -1) {
				regionPopNameCombos.get(i).removeAll();
				regionPopNameCombos.get(i).setItems(
						columnNames.toArray(new String[0]));
			} else {
				regionPopNameCombos.get(i).select(column);
			}
		} else if (regionPopSizeTexts.contains(e.getSource())) {
			int i = regionPopSizeTexts.indexOf(e.getSource());
			int column = getColumnIndex(regionPopSizeTexts.get(i).getText());

			((RegionShapefile) shapefiles
					.get(shapeFileList.getSelectionIndex()))
					.getPopulationSizes().set(i,
							regionPopSizeTexts.get(i).getText());

			if (column == -1) {
				regionPopSizeCombos.get(i).removeAll();
				regionPopSizeCombos.get(i).setItems(
						columnNames.toArray(new String[0]));
			} else {
				regionPopSizeCombos.get(i).select(column);
			}
		}

		projectValidator.modifyText(e);
	}

	private void createRegionComposite() {
		RegionShapefile shapefile = (RegionShapefile) shapefiles
				.get(shapeFileList.getSelectionIndex());
		Label regionIDLabel;
		Label regionIDColumnLabel;
		Label regionAreaLabel;
		Label regionAreaColumnLabel;
		Label regionAreaUnitLabel;
		List<String> units = new ArrayList<String>();

		for (AreaUnit u : AreaUnit.VALUES) {
			units.add(u.getLiteral());
		}

		dataGroup = new Group(this, SWT.NONE);
		dataGroup.setText("Data");
		dataGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false,
				3, 1));
		dataGroup.setLayout(new GridLayout(4, true));

		regionIDLabel = new Label(dataGroup, SWT.NONE);
		regionIDLabel.setText(Messages.getString("regionID") + ":");
		regionIDLabel
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		regionIDText = new Text(dataGroup, SWT.BORDER);
		regionIDText.setText(shapefile.getId());
		regionIDText.setEditable(false);
		regionIDText
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		regionIDColumnLabel = new Label(dataGroup, SWT.NONE);
		regionIDColumnLabel.setText(Messages.getString("selectColumn") + ":");
		regionIDColumnLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		regionIDCombo = new Combo(dataGroup, SWT.READ_ONLY);
		regionIDCombo.setItems(columnNames.toArray(new String[0]));
		regionIDCombo.addSelectionListener(this);
		regionIDCombo
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		regionAreaLabel = new Label(dataGroup, SWT.NONE);
		regionAreaLabel.setText(Messages.getString("regionArea") + ":");
		regionAreaLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		regionAreaText = new Text(dataGroup, SWT.BORDER);
		regionAreaText.setText(shapefile.getArea());
		regionAreaText.addModifyListener(this);
		regionAreaText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		regionAreaColumnLabel = new Label(dataGroup, SWT.NONE);
		regionAreaColumnLabel.setText(Messages.getString("selectColumn") + ":");
		regionAreaColumnLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		regionAreaCombo = new Combo(dataGroup, SWT.READ_ONLY);
		regionAreaCombo.setItems(columnNames.toArray(new String[0]));
		regionAreaCombo.addSelectionListener(this);
		regionAreaCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		regionAreaUnitLabel = new Label(dataGroup, SWT.NONE);
		regionAreaUnitLabel.setText(Messages.getString("regionAreaUnit") + ":");
		regionAreaUnitLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		regionAreaUnitCombo = new Combo(dataGroup, SWT.READ_ONLY);
		regionAreaUnitCombo.setItems(units.toArray(new String[0]));
		regionAreaUnitCombo.addSelectionListener(this);
		regionAreaUnitCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		regionAreaUnitCombo.select(units.indexOf(shapefile.getAreaUnit()
				.getLiteral()));
		new Label(dataGroup, SWT.NONE);
		new Label(dataGroup, SWT.NONE);

		int regionIDIndex = getColumnIndex(shapefile.getId());
		int regionAreaIndex = getColumnIndex(shapefile.getArea());

		if (regionIDIndex != -1) {
			regionIDCombo.select(regionIDIndex);
		}

		if (regionAreaIndex != -1) {
			regionAreaCombo.select(regionAreaIndex);
		}

		regionPopNameTexts.clear();
		regionPopNameCombos.clear();
		regionPopSizeTexts.clear();
		regionPopSizeCombos.clear();

		Label regionPopNameLabel;
		Text regionPopNameText;
		Label regionPopNameColumnLabel;
		Combo regionPopNameCombo;
		Label regionPopSizeLabel;
		Text regionPopSizeText;
		Label regionPopSizeColumnLabel;
		Combo regionPopSizeCombo;

		for (int i = 0; i < shapefile.getPopulationNames().size(); i++) {
			regionPopNameLabel = new Label(dataGroup, SWT.NONE);
			regionPopNameLabel.setText(Messages
					.getString("regionPopulationName") + ":");
			regionPopNameLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));
			regionPopNameText = new Text(dataGroup, SWT.BORDER);
			regionPopNameText.setText(shapefile.getPopulationNames().get(i));
			regionPopNameText.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));
			regionPopNameText.addModifyListener(this);
			regionPopNameColumnLabel = new Label(dataGroup, SWT.NONE);
			regionPopNameColumnLabel.setText(Messages.getString("selectColumn")
					+ ":");
			regionPopNameColumnLabel.setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, true));
			regionPopNameCombo = new Combo(dataGroup, SWT.READ_ONLY);
			regionPopNameCombo.setItems(columnNames.toArray(new String[0]));
			regionPopNameCombo.addSelectionListener(this);
			regionPopNameCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));

			regionPopSizeLabel = new Label(dataGroup, SWT.NONE);
			regionPopSizeLabel.setText(Messages
					.getString("regionPopulationSize") + ":");
			regionPopSizeLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));
			regionPopSizeText = new Text(dataGroup, SWT.BORDER);
			regionPopSizeText.setText(shapefile.getPopulationSizes().get(i));
			regionPopSizeText.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));
			regionPopSizeText.addModifyListener(this);
			regionPopSizeColumnLabel = new Label(dataGroup, SWT.NONE);
			regionPopSizeColumnLabel.setText(Messages.getString("selectColumn")
					+ ":");
			regionPopSizeColumnLabel.setLayoutData(new GridData(SWT.FILL,
					SWT.FILL, true, true));
			regionPopSizeCombo = new Combo(dataGroup, SWT.READ_ONLY);
			regionPopSizeCombo.setItems(columnNames.toArray(new String[0]));
			regionPopSizeCombo.addSelectionListener(this);
			regionPopSizeCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));

			int regionPopNameIndex = getColumnIndex(shapefile
					.getPopulationNames().get(i));
			int regionPopSizeIndex = getColumnIndex(shapefile
					.getPopulationSizes().get(i));

			if (regionPopNameIndex != -1) {
				regionPopNameCombo.select(regionPopNameIndex);
			}

			if (regionPopSizeIndex != -1) {
				regionPopSizeCombo.select(regionPopSizeIndex);
			}

			regionPopNameTexts.add(regionPopNameText);
			regionPopNameCombos.add(regionPopNameCombo);
			regionPopSizeTexts.add(regionPopSizeText);
			regionPopSizeCombos.add(regionPopSizeCombo);
		}

		new Label(dataGroup, SWT.NONE);
		new Label(dataGroup, SWT.NONE);
		regionAddPopButton = new Button(dataGroup, SWT.PUSH);
		regionAddPopButton.setText(Messages.getString("regionAddPopulation"));
		regionAddPopButton.addSelectionListener(this);
		regionAddPopButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		regionRemovePopButton = new Button(dataGroup, SWT.PUSH);
		regionRemovePopButton.setText(Messages
				.getString("regionRemovePopulation"));
		regionRemovePopButton.addSelectionListener(this);
		regionRemovePopButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
	}

	private void createRoadComposite() {
		RoadShapefile shapefile = (RoadShapefile) shapefiles.get(shapeFileList
				.getSelectionIndex());
		Label roadIDLabel;
		Label roadIDColumnLabel;
		Label roadClassLabel;
		Label roadClassColumnLabel;

		dataGroup = new Group(this, SWT.NONE);
		dataGroup.setText("Data");
		dataGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false,
				3, 1));
		dataGroup.setLayout(new GridLayout(4, true));

		roadIDLabel = new Label(dataGroup, SWT.NONE);
		roadIDLabel.setText(Messages.getString("roadID") + ":");
		roadIDLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		roadIDText = new Text(dataGroup, SWT.BORDER);
		roadIDText.setText(shapefile.getId());
		roadIDText.setEditable(false);
		roadIDText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		roadIDColumnLabel = new Label(dataGroup, SWT.NONE);
		roadIDColumnLabel.setText(Messages.getString("selectColumn") + ":");
		roadIDColumnLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		roadIDCombo = new Combo(dataGroup, SWT.READ_ONLY);
		roadIDCombo.setItems(columnNames.toArray(new String[0]));
		roadIDCombo.addSelectionListener(this);
		roadIDCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		roadClassLabel = new Label(dataGroup, SWT.NONE);
		roadClassLabel.setText(Messages.getString("roadClass") + ":");
		roadClassLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		roadClassText = new Text(dataGroup, SWT.BORDER);
		roadClassText.setText(shapefile.getRoadClass());
		roadClassText.addModifyListener(this);
		roadClassText
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		roadClassColumnLabel = new Label(dataGroup, SWT.NONE);
		roadClassColumnLabel.setText(Messages.getString("selectColumn") + ":");
		roadClassColumnLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		roadClassCombo = new Combo(dataGroup, SWT.READ_ONLY);
		roadClassCombo.setItems(columnNames.toArray(new String[0]));
		roadClassCombo.addSelectionListener(this);
		roadClassCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		int roadIDIndex = getColumnIndex(shapefile.getId());
		int roadClassIndex = getColumnIndex(shapefile.getRoadClass());

		if (roadIDIndex != -1) {
			roadIDCombo.select(roadIDIndex);
		}

		if (roadClassIndex != -1) {
			roadClassCombo.select(roadClassIndex);
		}
	}

	private void createMigrationComposite() {
		MigrationShapefile shapefile = (MigrationShapefile) shapefiles
				.get(shapeFileList.getSelectionIndex());
		Label migrationIDLabel;
		Label migrationIDColumnLabel;
		Label migrationPopulationLabel;
		Label migrationPopulationColumnLabel;
		Label migrationRateLabel;
		Label migrationRateColumnLabel;

		dataGroup = new Group(this, SWT.NONE);
		dataGroup.setText("Data");
		dataGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false,
				3, 1));
		dataGroup.setLayout(new GridLayout(4, true));

		migrationIDLabel = new Label(dataGroup, SWT.NONE);
		migrationIDLabel.setText(Messages.getString("migrationID") + ":");
		migrationIDLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		migrationIDText = new Text(dataGroup, SWT.BORDER);
		migrationIDText.setText(shapefile.getId());
		migrationIDText.setEditable(false);
		migrationIDText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		migrationIDColumnLabel = new Label(dataGroup, SWT.NONE);
		migrationIDColumnLabel
				.setText(Messages.getString("selectColumn") + ":");
		migrationIDColumnLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		migrationIDCombo = new Combo(dataGroup, SWT.READ_ONLY);
		migrationIDCombo.setItems(columnNames.toArray(new String[0]));
		migrationIDCombo.addSelectionListener(this);
		migrationIDCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		migrationPopulationLabel = new Label(dataGroup, SWT.NONE);
		migrationPopulationLabel.setText(Messages
				.getString("migrationPopulation") + ":");
		migrationPopulationLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		migrationPopulationText = new Text(dataGroup, SWT.BORDER);
		migrationPopulationText.setText(shapefile.getPopulationName());
		migrationPopulationText.addModifyListener(this);
		migrationPopulationText.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		migrationPopulationColumnLabel = new Label(dataGroup, SWT.NONE);
		migrationPopulationColumnLabel.setText(Messages
				.getString("selectColumn") + ":");
		migrationPopulationColumnLabel.setLayoutData(new GridData(SWT.FILL,
				SWT.FILL, true, true));
		migrationPopulationCombo = new Combo(dataGroup, SWT.READ_ONLY);
		migrationPopulationCombo.setItems(columnNames.toArray(new String[0]));
		migrationPopulationCombo.addSelectionListener(this);
		migrationPopulationCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));

		migrationRateLabel = new Label(dataGroup, SWT.NONE);
		migrationRateLabel.setText(Messages.getString("migrationRate") + ":");
		migrationRateLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		migrationRateText = new Text(dataGroup, SWT.BORDER);
		migrationRateText.setText(shapefile.getMigrationRate());
		migrationRateText.addModifyListener(this);
		migrationRateText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		migrationRateColumnLabel = new Label(dataGroup, SWT.NONE);
		migrationRateColumnLabel.setText(Messages.getString("selectColumn")
				+ ":");
		migrationRateColumnLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		migrationRateCombo = new Combo(dataGroup, SWT.READ_ONLY);
		migrationRateCombo.setItems(columnNames.toArray(new String[0]));
		migrationRateCombo.addSelectionListener(this);
		migrationRateCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		int migrationIDIndex = getColumnIndex(shapefile.getId());
		int migrationPopulationIndex = getColumnIndex(shapefile
				.getPopulationName());
		int migrationRateIndex = getColumnIndex(shapefile.getMigrationRate());

		if (migrationIDIndex != -1) {
			migrationIDCombo.select(migrationIDIndex);
		}

		if (migrationPopulationIndex != -1) {
			migrationPopulationCombo.select(migrationPopulationIndex);
		}

		if (migrationRateIndex != -1) {
			migrationRateCombo.select(migrationRateIndex);
		}
	}

	private void updateSelection() {
		int selection = shapeFileList.getSelectionIndex();

		if (dataGroup != null) {
			dataGroup.dispose();
		}

		if (showDataButton != null) {
			showDataButton.dispose();
		}

		if (typeGroup != null) {
			typeGroup.dispose();
		}

		if (selection != -1) {
			updateDBFData();

			showDataButton = new Button(this, SWT.PUSH);
			showDataButton.setText(Messages.getString("showData"));
			showDataButton.addSelectionListener(this);
			typeGroup = new Group(this, SWT.NONE);
			typeGroup.setText(Messages.getString("shapefileType"));
			typeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
					false, 3, 1));
			typeGroup.setLayout(new GridLayout(3, true));
			regionButton = new Button(typeGroup, SWT.RADIO);
			regionButton.setText(Messages.getString("regionsType"));
			regionButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true));
			regionButton.addSelectionListener(this);
			roadButton = new Button(typeGroup, SWT.RADIO);
			roadButton.setText(Messages.getString("roadsType"));
			roadButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					true));
			roadButton.addSelectionListener(this);
			migrationButton = new Button(typeGroup, SWT.RADIO);
			migrationButton.setText(Messages.getString("migrationType"));
			migrationButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));
			migrationButton.addSelectionListener(this);

			Shapefile shapefile = shapefiles.get(selection);

			if (shapefile instanceof RegionShapefile) {
				regionButton.setSelection(true);
				createRegionComposite();
			} else if (shapefile instanceof RoadShapefile) {
				roadButton.setSelection(true);
				createRoadComposite();
			} else if (shapefile instanceof MigrationShapefile) {
				migrationButton.setSelection(true);
				createMigrationComposite();
			}
		}
	}

	private void updateUI() {
		pack();
		getParent().layout();
		getParent().getParent().getParent().layout();
		layout();
	}

	private void updateDBFData() {
		try {
			Reader reader = new Reader(shapefiles.get(
					shapeFileList.getSelectionIndex()).getFileName());

			columnNames = reader.getColumnNames();
			data = reader.getData();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	private int getColumnIndex(String s) {
		if (!s.startsWith("column:")) {
			return -1;
		}

		s = s.replaceFirst("column:", "");

		return columnNames.indexOf(s);
	}

} // GraphGeneratorPropertyEditor
