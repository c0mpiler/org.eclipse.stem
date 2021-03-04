package org.eclipse.stem.analysis.automaticexperiment.ui;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.stem.analysis.ErrorFunction;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticExperiment;
import org.eclipse.stem.analysis.automaticexperiment.AutomaticexperimentFactory;
import org.eclipse.stem.analysis.automaticexperiment.ModifiableParameter;
import org.eclipse.stem.analysis.automaticexperiment.OptimizerAlgorithm;
import org.eclipse.stem.analysis.automaticexperiment.views.Messages;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.impl.IdentifiableImpl;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.impl.ScenarioImpl;
import org.eclipse.stem.ui.Activator;
import org.eclipse.stem.ui.widgets.IdentifiablePickerDialog;
import org.eclipse.stem.ui.widgets.ParameterPickerDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class AutomaticExperimentCompositeEditor extends AlgorithmCompositeEditor {

	Text maxItersText;
	Text referenceDataText;
	Text baseScenarioText;
	Combo errorFunctionCombo;
	Text startValText;
	Text stepValText;
	Text minValText;
	Text maxValText;
	Text toleranceText;
	Table table;
	
	boolean reInit = true;
	ArrayList<Identifiable> identifiableList = new ArrayList<Identifiable>();
	ArrayList<EAttribute> attributeList = new ArrayList<EAttribute>();
	ArrayList<Double>minList = new ArrayList<Double>();
	ArrayList<Double>maxList = new ArrayList<Double>();
	ArrayList<Double>startList = new ArrayList<Double>();
	ArrayList<Double>stepList = new ArrayList<Double>();
	int currentTableIndex;
	Scenario baseScenario;
	
	String errorMessage;
	
	
	public AutomaticExperimentCompositeEditor(Composite parent, int style, final ModifyListener projectValidator, final IProject project) {
		super(parent, style);
		// Fill in the rest here
		
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		setLayout(gridLayout);
		
		Label maxItersLabel = new Label(this, SWT.NONE);
		maxItersLabel.setText(Messages.getString("NM.MAXITERS"));
		GridData gridData = new GridData();
		gridData.horizontalSpan = 1;
		maxItersLabel.setLayoutData(gridData);
		
		maxItersText = new Text(this, SWT.NONE);
		maxItersText.setText("-1");
		GridData gridData2 = new GridData();
		gridData2.horizontalSpan = 2;
		gridData2.grabExcessHorizontalSpace = true;
		gridData2.horizontalAlignment = SWT.FILL;
		maxItersText.setLayoutData(gridData2);
		maxItersText.addModifyListener(projectValidator);
		
		Label refDataLabel = new Label(this, SWT.NONE);
		refDataLabel.setText(Messages.getString("NM.REFERENCE"));
		GridData gridData3 = new GridData();
		gridData3.horizontalSpan = 1;
		refDataLabel.setLayoutData(gridData3);
		
		referenceDataText = new Text(this, SWT.NONE);
		referenceDataText.setText("");
		GridData gridData4 = new GridData();
		gridData4.horizontalSpan = 1;
		gridData4.grabExcessHorizontalSpace = true;
		gridData4.horizontalAlignment = SWT.FILL;
		referenceDataText.setLayoutData(gridData4);
		referenceDataText.addModifyListener(projectValidator);
		
		Button pickRefereceButton = new Button(this, SWT.NONE);
		pickRefereceButton.setText(Messages.getString("NM.REFPICKFOLDER"));
		GridData gridData5 = new GridData();
		gridData5.horizontalSpan = 1;
		pickRefereceButton.setLayoutData(gridData5);
		final Shell shell = this.getShell();
		pickRefereceButton.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				final DirectoryDialog dd = new DirectoryDialog(shell,
						SWT.OPEN | SWT.SINGLE);
				dd.setText(Messages.getString("NM.REFFOLDERTITLE")); //$NON-NLS-1$
				
				String selected = dd.open();
				if(selected != null) referenceDataText.setText(selected);
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		Label baseScenarioLabel = new Label(this, SWT.NONE);
		baseScenarioLabel.setText(Messages.getString("NM.BASESCENARIO"));
		GridData gridData6 = new GridData();
		gridData6.horizontalSpan = 1;
		baseScenarioLabel.setLayoutData(gridData6);
		
		baseScenarioText = new Text(this, SWT.NONE);
		baseScenarioText.setText("");
		GridData gridData7 = new GridData();
		gridData7.horizontalSpan = 1;
		gridData7.grabExcessHorizontalSpace = true;
		gridData7.horizontalAlignment = SWT.FILL;
		baseScenarioText.setLayoutData(gridData7);
		baseScenarioText.setEditable(false);
		baseScenarioText.addModifyListener(projectValidator);
		
		Button pickScenarioButton = new Button(this, SWT.NONE);
		pickScenarioButton.setText(Messages.getString("NM.SELECTSCENARIO"));
		GridData gridData8 = new GridData();
		gridData8.horizontalSpan = 1;
		pickScenarioButton.setLayoutData(gridData8);
		pickScenarioButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				
				IdentifiablePickerDialog ppDialog = new IdentifiablePickerDialog(AutomaticExperimentCompositeEditor.this.getShell(), SWT.NONE, Messages.getString("NM.PICKSCENARIO"), project, ScenarioImpl.class);
				Object  ret = ppDialog.open();
				if(ret != null) {
					baseScenario = (Scenario)ret;
					baseScenarioText.setText(baseScenario.getURI().toString());
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		Label errorFunctionLabel = new Label(this, SWT.NONE);
		errorFunctionLabel.setText(Messages.getString("NM.ERRORFUNCTION"));
		GridData gridData9 = new GridData();
		gridData9.horizontalSpan = 1;
		baseScenarioLabel.setLayoutData(gridData9);
	
		errorFunctionCombo = new Combo(this, SWT.NONE);
		initializeErrorFunctionCombo();
		GridData gridData10 = new GridData();
		gridData10.horizontalSpan = 2;
		gridData10.grabExcessHorizontalSpace = true;
		gridData10.horizontalAlignment = SWT.FILL;
		errorFunctionCombo.setLayoutData(gridData10);
		
		Label reInitLabel = new Label(this, SWT.NONE);
		reInitLabel.setText(Messages.getString("NM.REINITLABEL"));
		GridData gridDataRI = new GridData();
		gridDataRI.horizontalSpan = 1;
		reInitLabel.setLayoutData(gridDataRI);
		
		Composite radioComposite = new Composite(this, SWT.BORDER);
	    FillLayout fillLayout = new FillLayout();
	    fillLayout.type = SWT.HORIZONTAL;
	    radioComposite.setLayout(fillLayout);
	    
	    final Button falseButton = new Button(radioComposite, SWT.RADIO);
	    falseButton.setText(Messages.getString("NM.NO"));//$NON-NLS-1$
	    
	    Button trueButton = new Button(radioComposite, SWT.RADIO);
	    trueButton.setText(Messages.getString("NM.YES"));//$NON-NLS-1$
	    	    
	   	trueButton.setSelection(true);
	    falseButton.setSelection(false);
	    
	    Listener listener = new Listener() {
	        public void handleEvent(Event event) {
	          if (event.widget == falseButton) {
	        	reInit = !falseButton.getSelection();
	          }
	        }
	      };
	    // these are radio buttons so we only need to add the listener to one of them.
	    falseButton.addListener(SWT.Selection, listener);
	    final GridData cGD = new GridData();
	    cGD.grabExcessHorizontalSpace = true;
		cGD.horizontalAlignment = SWT.FILL;
		cGD.horizontalSpan = 2;
		radioComposite.setLayoutData(cGD);
		
		Label toleranceTabel = new Label(this, SWT.NONE);
		toleranceTabel.setText(Messages.getString("NM.TOLERANCE"));
		GridData tolGD = new GridData();
		tolGD.horizontalSpan = 1;
		toleranceTabel.setLayoutData(tolGD);
		
		toleranceText = new Text(this, SWT.NONE);
		toleranceText.setText("1E-9");
		GridData tol2GD = new GridData();
		tol2GD.horizontalSpan = 2;
		tol2GD.grabExcessHorizontalSpace = true;
		tol2GD.horizontalAlignment = SWT.FILL;
		toleranceText.setLayoutData(tol2GD);
		
		table = new Table(this, SWT.BORDER | SWT.SINGLE);
		GridData gridData11 = new GridData();
		gridData11.horizontalSpan = 1;
		gridData11.grabExcessHorizontalSpace = true;
		gridData11.horizontalAlignment = SWT.FILL;
		gridData11.grabExcessVerticalSpace = false;
		table.setLayoutData(gridData11);	
		
		Composite startStepComp = new Composite(this, SWT.NONE);
		GridLayout startLayout = new GridLayout();
		startLayout.numColumns = 2;
		startStepComp.setLayout(startLayout);
		
		Label startLabel = new Label(startStepComp, SWT.NONE);
		startLabel.setText(Messages.getString("NM.INITIAL"));
		GridData gridData12 = new GridData();
		gridData12.horizontalSpan=1;
		startLabel.setLayoutData(gridData12);
		Label stepLabel = new Label(startStepComp, SWT.NONE);
		stepLabel.setText(Messages.getString("NM.STEP"));
		GridData gridData13 = new GridData();
		gridData13.horizontalSpan=1;
		stepLabel.setLayoutData(gridData13);
		startValText = new Text(startStepComp, SWT.NONE);
		GridData gridData14 = new GridData();
		gridData13.horizontalSpan = 1;
		startValText.setLayoutData(gridData14);
		startValText.addModifyListener(projectValidator);
		startValText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(currentTableIndex == -1) return;
				String txt = startValText.getText();
				double d = 0.0;
				try { 
					d = Double.parseDouble(txt);
				} catch(NumberFormatException nfe) {
					// Ignore, the validator will report the error
				}
				startList.set(currentTableIndex, d);
			}
		});
		stepValText = new Text(startStepComp, SWT.NONE);
		GridData gridData15 = new GridData();
		gridData15.horizontalSpan = 1;
		stepValText.setLayoutData(gridData15);
		stepValText.addModifyListener(projectValidator);
		stepValText.addModifyListener(new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				if(currentTableIndex == -1) return;
				String txt = stepValText.getText();
				double d = 0.0;
				try { 
					d = Double.parseDouble(txt);
				} catch(NumberFormatException nfe) {
					// Ignore, the validator will report the error
				}
				stepList.set(currentTableIndex, d);
			}
		});
		
		Composite minMaxComp = new Composite(this, SWT.NONE);
		GridLayout minMaxLayout = new GridLayout();
		minMaxLayout.numColumns = 2;
		minMaxComp.setLayout(startLayout);

		Label minLabel = new Label(minMaxComp, SWT.NONE);
		minLabel.setText(Messages.getString("NM.MIN"));
		GridData gridData16 = new GridData();
		gridData16.horizontalSpan=1;
		minLabel.setLayoutData(gridData12);
		Label maxLabel = new Label(minMaxComp, SWT.NONE);
		maxLabel.setText(Messages.getString("NM.MAX"));
		GridData gridData17 = new GridData();
		gridData17.horizontalSpan=1;
		maxLabel.setLayoutData(gridData17);
		minValText = new Text(minMaxComp, SWT.NONE);
		GridData gridData18 = new GridData();
		gridData18.horizontalSpan = 1;
		minValText.setLayoutData(gridData18);
		minValText.addModifyListener(projectValidator);
		minValText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(currentTableIndex == -1) return;
				String txt = minValText.getText();
				double d = 0.0;
				try { 
					d = Double.parseDouble(txt);
				} catch(NumberFormatException nfe) {
					// Ignore, the validator will report the error
				}
				minList.set(currentTableIndex, d);
			}
		});
		maxValText = new Text(minMaxComp, SWT.NONE);
		GridData gridData19 = new GridData();
		gridData19.horizontalSpan = 1;
		maxValText.setLayoutData(gridData19);
		maxValText.addModifyListener(projectValidator);
		maxValText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(currentTableIndex == -1) return;
				String txt = maxValText.getText();
				double d = 0.0;
				try { 
					d = Double.parseDouble(txt);
				} catch(NumberFormatException nfe) {
					// Ignore, the validator will report the error
				}
				maxList.set(currentTableIndex, d);
			}
		});
		minValText.setEnabled(false);
		maxValText.setEnabled(false);
		startValText.setEnabled(false);
		stepValText.setEnabled(false);
		
		

		Composite plusminusbuttons = new Composite(this, SWT.NONE);
		GridLayout gridLayout2 = new GridLayout();
		gridLayout2.numColumns = 2;
		plusminusbuttons.setLayout(gridLayout2);
		
		GridData gridData20 = new GridData();
		gridData20.horizontalSpan = 1;
		gridData20.grabExcessHorizontalSpace = true;
		gridData20.horizontalAlignment = SWT.FILL;
		plusminusbuttons.setLayoutData(gridData20);
		
	    Button plusButton = new Button(plusminusbuttons, SWT.NONE);
	    plusButton.setText(Messages.getString("NM.PLUS"));
	    GridData gridData21 = new GridData();
		gridData21.horizontalSpan = 1;
		plusButton.setLayoutData(gridData21);
		
		final Button minusButton = new Button(plusminusbuttons, SWT.NONE);
		minusButton.setText(Messages.getString("NM.MINUS"));
		GridData gridData22 = new GridData();
		gridData21.horizontalSpan = 1;
		minusButton.setLayoutData(gridData22);
		minusButton.setEnabled(false);
			
		table.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				currentTableIndex = table.getSelectionIndex();
				if(currentTableIndex > -1) {
					minValText.setText(minList.get(currentTableIndex)+"");
					maxValText.setText(maxList.get(currentTableIndex)+"");
					startValText.setText(startList.get(currentTableIndex)+"");
					stepValText.setText(stepList.get(currentTableIndex)+"");
					minValText.setEnabled(true);
					maxValText.setEnabled(true);
					startValText.setEnabled(true);
					stepValText.setEnabled(true);
					minusButton.setEnabled(true);
				} else {
					minValText.setText("");
					maxValText.setText("");
					startValText.setText("");
					stepValText.setText("");
					
					minValText.setEnabled(false);
					maxValText.setEnabled(false);
					startValText.setEnabled(false);
					stepValText.setEnabled(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		

		plusButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				
				ParameterPickerDialog ppDialog = new ParameterPickerDialog(AutomaticExperimentCompositeEditor.this.getShell(), SWT.NONE, Messages.getString("NM.PICKPARAM"), project, IdentifiableImpl.class);
				Object [] ret = ppDialog.open();
				if(ret != null) {
					Identifiable id = (Identifiable)ret[0];
					EAttribute attr = (EAttribute)ret[1];
					identifiableList.add(id);
					attributeList.add(attr);
					TableItem newRow= new TableItem(table, SWT.NONE);
					newRow.setText(attr.getName()+" ("+id.getURI().lastSegment()+")");
					minList.add(0.0);
					maxList.add(1.0);
					startList.add(0.5);
					stepList.add(0.1);
					projectValidator.modifyText(null);// 

				}
			
				
				
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		minusButton.addSelectionListener(new SelectionListener() {
			
			public void widgetSelected(SelectionEvent e) {
				
				if(currentTableIndex > -1) {
					table.remove(currentTableIndex);
					minList.remove(currentTableIndex);
					maxList.remove(currentTableIndex);
					startList.remove(currentTableIndex);
					stepList.remove(currentTableIndex);

					currentTableIndex = table.getSelectionIndex();

					minValText.setText("");
					maxValText.setText("");
					startValText.setText("");
					stepValText.setText("");
					if(minList.size() == 0) {
						minusButton.setEnabled(false);
						minValText.setEnabled(false);
						maxValText.setEnabled(false);
						startValText.setEnabled(false);
						stepValText.setEnabled(false);
					}
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}

	private ErrorFunction[] errorFunctions;
	
	private void initializeErrorFunctionCombo() {
		
		final IExtensionRegistry registry = Platform.getExtensionRegistry();
		final IConfigurationElement[] errorFunctionsConfigElements = registry
				.getConfigurationElementsFor(org.eclipse.stem.analysis.Constants.ID_ERRORFUNCTION_EXTENSION_POINT);

			final java.util.List<ErrorFunction> temp = new ArrayList<ErrorFunction>();

			errorFunctions = new ErrorFunction[errorFunctionsConfigElements.length];

			for (int i = 0; i < errorFunctionsConfigElements.length; i++) {
				final IConfigurationElement element = errorFunctionsConfigElements[i];
			
				System.out.println(element.getName());
				
				if (element.getName().equals(org.eclipse.stem.analysis.Constants.ERRORFUNCTION_ELEMENT)) {
					// Yes
					try {
						temp.add((ErrorFunction) element
								.createExecutableExtension("class")); //$NON-NLS-1$
					} catch (final CoreException e) {
						Activator.logError(
								Messages.getString("Unable to instantiate extension point "+element), e); //$NON-NLS-1$
					}
				} // if
			} // for each configuration element

			errorFunctions = temp.toArray(new ErrorFunction[] {});
	
		for(int i=0;i<errorFunctions.length;++i)
			errorFunctionCombo.add(errorFunctions[i].eClass().getName());
		errorFunctionCombo.select(0);
	}
	
	@SuppressWarnings("unused")
	@Override
	public boolean validate() {
		boolean retValue = true;
		double minVal=0, maxVal=1, startVal=0.5, stepVal=0.1; // valid set of values, just in case the text boxes aren't enabled yet.
		errorMessage = "";
		if(retValue) {
			if(startValText.isEnabled()) {
				String val = startValText.getText();
				retValue = checkDouble(val);
				if(!retValue) errorMessage = Messages.getString("NM.BADSTART");
				else startVal = Double.parseDouble(val);
			}
		}

		if(retValue) {
			if(stepValText.isEnabled()) {
				String val = stepValText.getText();
				retValue = checkDoubleNonZero(val);
				if(!retValue) errorMessage = Messages.getString("NM.BADSTEP");
				else stepVal = Double.parseDouble(val);
			}
		}

		if(retValue) {
			if(minValText.isEnabled()) {
				String val = minValText.getText();
				retValue = checkDouble(val);
				if(!retValue) errorMessage = Messages.getString("NM.BADMIN");
				else minVal = Double.parseDouble(val);
			}
		}

		if(retValue) {
			if(maxValText.isEnabled()) {
				String val = maxValText.getText();
				retValue = checkDouble(val);
				if(!retValue) errorMessage = Messages.getString("NM.BADMAX");
				else maxVal = Double.parseDouble(val);
			}
		}

		if(retValue)
			if(minVal >maxVal) {
				 errorMessage = Messages.getString("NM.BADMINMAX");
				 retValue = false;
			}
		
		if(retValue)
			if(maxItersText.isEnabled()) {
				String val = maxItersText.getText();
				retValue = checkIntegerMinValue(val, -1);
				if(!retValue) errorMessage = Messages.getString("NM.BADMAXITERS");
			}
		if(retValue)
			if(referenceDataText.getText() == null || referenceDataText.getText().trim().equals("")) {
				 errorMessage = Messages.getString("NM.BADREFERENCE");
				 retValue = false;
			}

		if(retValue)
			if(baseScenario == null) {
				 errorMessage = Messages.getString("NM.BADBASESCENARIO");
				 retValue = false;
			}

		if(retValue)
			if(table.getItemCount() == 0) {
				 errorMessage = Messages.getString("NM.ATLEASTONEPARAM");
				 retValue = false;
			}
		
		if(retValue)
			if(toleranceText.isEnabled()) {
				 retValue = checkDoublePositiveNonZero(toleranceText.getText());
			}
		return retValue;
	}

	@Override
	public String getErrorMessage() {
		return errorMessage;
	}

	private boolean checkDouble(String d) {
		boolean retValue = true;
		try {
			Double.parseDouble(d);
		} catch(Exception e) {
			retValue = false;
		}
		return retValue;
	}
	
	private boolean checkDoubleNonZero(String d) {
		boolean retValue = true;
		try {
			double _d = Double.parseDouble(d);
			if(_d == 0.0) retValue = false;
		} catch(Exception e) {
			retValue = false;
		}
		return retValue;
	}
	
	private boolean checkIntegerMinValue(String i, int min) {
		boolean retValue = true;
		try {
			int _i = Integer.parseInt(i);
			if(_i < min) retValue = false;
		} catch(Exception e) {
			retValue = false;
		}
		return retValue;
	}


	private boolean checkDoublePositiveNonZero(String d) {
		boolean retValue = true;
		try {
			double _d = Double.parseDouble(d);
			if(_d < 0.0) retValue = false;
		} catch(Exception e) {
			retValue = false;
		}
		return retValue;
	}
	
	@Override
	public OptimizerAlgorithm createAlgorithm() {
		AutomaticExperiment autoExperiment = AutomaticexperimentFactory.eINSTANCE.createAutomaticExperiment();

		autoExperiment.setBaseScenario(baseScenario);
		int ind = errorFunctionCombo.getSelectionIndex();
		if(ind == -1) ind = 0; // grab first one
		autoExperiment.setErrorFunc(errorFunctions[ind]); 
		autoExperiment.setMaximumNumberOfIterations(Integer.parseInt(maxItersText.getText()));
		String refDir = referenceDataText.getText();
		IPath rootPath = new Path(ResourcesPlugin.getWorkspace()
				.getRoot().getLocation().toFile().toString());

		if (refDir != null) {
			IPath path = new Path(refDir);


			if (rootPath.isPrefixOf(path)) {
				String relPath = path.makeRelativeTo(rootPath)
						.toString();


				if (relPath.isEmpty()) {
					relPath = "/";
				}


				autoExperiment.setReferanceDataDir(URI.createPlatformResourceURI(relPath,false).toString());
			} else {
				autoExperiment.setReferanceDataDir(refDir);
			}

		}autoExperiment.setReInit(reInit);
		autoExperiment.setTolerance(Double.parseDouble(toleranceText.getText()));

		int n=0;
		for(Identifiable ident :identifiableList) {
			ModifiableParameter param = AutomaticexperimentFactory.eINSTANCE.createModifiableParameter();
			param.setTargetURI(ident.getURI());
			param.setFeatureName(attributeList.get(n).getName());
			param.setInitialValue(startList.get(n));
			param.setStep(stepList.get(n));
			param.setLowerBound(minList.get(n));
			param.setUpperBound(maxList.get(n));
			
			autoExperiment.getParameters().add(param);
			++n;
		}
		return autoExperiment;
	}
}
