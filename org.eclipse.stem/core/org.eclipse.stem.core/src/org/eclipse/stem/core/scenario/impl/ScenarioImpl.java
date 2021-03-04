package org.eclipse.stem.core.scenario.impl;

/******************************************************************************* 
 * Copyright (c) 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018
 * IBM Corporation, BfR, and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     IBM Corporation - initial API and implementation 
 *******************************************************************************/
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.osgi.util.NLS;
import org.eclipse.stem.core.CorePlugin;
import org.eclipse.stem.core.STEMURI;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.common.impl.IdentifiableFilterImpl;
import org.eclipse.stem.core.common.impl.IdentifiableImpl;
import org.eclipse.stem.core.graph.Graph;
import org.eclipse.stem.core.graph.IntegrationLabel;
import org.eclipse.stem.core.graph.NodeLabel;
import org.eclipse.stem.core.graph.UnresolvedIdentifiable;
import org.eclipse.stem.core.logger.Logger;
import org.eclipse.stem.core.model.Decorator;
import org.eclipse.stem.core.model.IntegrationDecorator;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.ModelPackage;
import org.eclipse.stem.core.model.STEMTime;
import org.eclipse.stem.core.model.TransformationDecorator;
import org.eclipse.stem.core.scenario.Scenario;
import org.eclipse.stem.core.scenario.ScenarioInitializationException;
import org.eclipse.stem.core.scenario.ScenarioPackage;
import org.eclipse.stem.core.sequencer.Sequencer;
import org.eclipse.stem.core.solver.Solver;
import org.eclipse.stem.core.solver.SolverException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.scenario.impl.ScenarioImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.impl.ScenarioImpl#getSequencer <em>Sequencer</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.impl.ScenarioImpl#getScenarioDecorators <em>Scenario Decorators</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.impl.ScenarioImpl#getCanonicalGraph <em>Canonical Graph</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.impl.ScenarioImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.impl.ScenarioImpl#getSolver <em>Solver</em>}</li>
 *   <li>{@link org.eclipse.stem.core.scenario.impl.ScenarioImpl#getLoggers <em>Loggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioImpl extends IdentifiableImpl implements Scenario {

	
	/**
	 * This is the {@link URI} used to identify the canonical {@link Graph} used during the
	 * simulation
	 * 
	 * TODO is this the right URI to use for canonical graphs?
	 */
	protected static final URI CANONICAL_GRAPH_URI = URI
			.createURI("stem:canonicalgraph"); //$NON-NLS-1$
	
	/**
	 * This flag controls the reporting of each and every unresolved 
	 * {@link Identifiable} reference encountered when creating the 
	 * canonical {@link Graph}.  Default: <code>false</code>
	 */
	public static boolean reportEachUnresolvedIdentifiable = true;

	/**
	 * This flag controls the reporting of dangling air transport edges 
	 */
	public static boolean reportDanglingAirTransportEdges = false; 

	/**
	 * This flag controls the reporting of a single summary message of the 
	 * number of unresolved {@link Identifiable} references encountered 
	 * when creating the canonical {@link Graph}. Default: <code>false</code>
	 */
	public static boolean reportNumberofUnresolvedIdentifiables = false;
	
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getSequencer() <em>Sequencer</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSequencer()
	 * @generated
	 * @ordered
	 */
	protected Sequencer sequencer;

	/**
	 * The cached value of the '{@link #getScenarioDecorators() <em>Scenario Decorators</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScenarioDecorators()
	 * @generated
	 * @ordered
	 */
	protected EList<Decorator> scenarioDecorators;

	/**
	 * The cached value of the '{@link #getCanonicalGraph() <em>Canonical Graph</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCanonicalGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph canonicalGraph;
	
	/**
	 * The default value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected static final double PROGRESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProgress() <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgress()
	 * @generated
	 * @ordered
	 */
	protected double progress = PROGRESS_EDEFAULT;

	
	/**
	 * The cached value of the '{@link #getSolver() <em>Solver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolver()
	 * @generated
	 * @ordered
	 */
	protected Solver solver;


	/**
	 * The cached value of the '{@link #getLoggers() <em>Loggers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Logger> loggers;


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected ScenarioImpl() {
		super();
		setURI(STEMURI.createURI(URI_TYPE_SCENARIO_SEGMENT + "/" //$NON-NLS-1$
				+  STEMURI.generateUniquePart()));
		setTypeURI(STEMURI.SCENARIO_TYPE_URI);
	} // ScenarioImpl

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.SCENARIO__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Sequencer getSequencer() {
		if (sequencer != null && sequencer.eIsProxy()) {
			InternalEObject oldSequencer = (InternalEObject)sequencer;
			sequencer = (Sequencer)eResolveProxy(oldSequencer);
			if (sequencer != oldSequencer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.SCENARIO__SEQUENCER, oldSequencer, sequencer));
			}
		}
		return sequencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequencer basicGetSequencer() {
		return sequencer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequencer(Sequencer newSequencer) {
		Sequencer oldSequencer = sequencer;
		sequencer = newSequencer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO__SEQUENCER, oldSequencer, sequencer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * The value is set in {@link #initialize()} <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getCanonicalGraph() {
		return canonicalGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProgress() {
		return progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(double newProgress) {
		double oldProgress = progress;
		progress = newProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO__PROGRESS, oldProgress, progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solver getSolver() {
		if (solver != null && solver.eIsProxy()) {
			InternalEObject oldSolver = (InternalEObject)solver;
			solver = (Solver)eResolveProxy(oldSolver);
			if (solver != oldSolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScenarioPackage.SCENARIO__SOLVER, oldSolver, solver));
			}
		}
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solver basicGetSolver() {
		return solver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolver(Solver newSolver) {
		Solver oldSolver = solver;
		solver = newSolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.SCENARIO__SOLVER, oldSolver, solver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Logger> getLoggers() {
		if (loggers == null) {
			loggers = new EObjectResolvingEList<Logger>(Logger.class, this, ScenarioPackage.SCENARIO__LOGGERS);
		}
		return loggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * @return <code>true</code> if it's ok to call step again.
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean step() throws SolverException {
		boolean success = true;
		// Is the sequencer finished?
		
		if (!getSequencer().isTimeToStop()) {
			// No
			// Is there a canonical graph?
//			Commented out 9/29/11 since it's not needed
//			if (getCanonicalGraph() == null) {
				// No
				// Create one then...
//				initialize();
//			} // if no canonical graph

			// Everything should be sane
			assert sane();

			final STEMTime currentTime = getSequencer().getNextTime();
			final long timeDelta = getSequencer().getTimeDelta();
			
			// First reset the progress of each decorator to 0. Necessary for the iteration progress
			// bar
			for (final Iterator<Decorator> decoratorIter = getCanonicalGraph()
					.getDecorators().iterator(); decoratorIter.hasNext();) {
				final Decorator decorator = decoratorIter.next();
				decorator.setProgress(0.0);
			}
			
			
			// Do the one step using the current solver
			success = getSolver().step(currentTime, timeDelta, getSequencer().getCycle());
						
			// Everything should still be sane
			assert sane();
	
			// Once everyone is done, we tell the graph to switch all the
			// dynamic labels to their next value and then we're ready to do
			// it all over again.
			getCanonicalGraph().switchToNextValue(currentTime);
		} // if sequencer finished
		if(success) success = !getSequencer().isTimeToStop();
		return success;
	} // step

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void reset() throws ScenarioInitializationException {
		// Set the sequencer back to its original state. The sequencer determines
		// the "current" time of the simulation. This is a value used to compute
		// the values of dynamic labels for each step of the simulation.
		getSequencer().reset();
		
		// Set the time 
		getCanonicalGraph().setTime((STEMTime) EcoreUtil.copy(getSequencer()
				.getCurrentTime()));
		
		//  Now give each decorator a chance to reset its dynamic
		// labels in the canonical graph
		
		// SED fix. We need to reset the disease models first since the infectors
		// inoculators depend up those being reset beforehand.
		
		ArrayList<Decorator>intDecorators = new ArrayList<Decorator>();
		ArrayList<Decorator>otherDecorators = new ArrayList<Decorator>();
		
		Set<URI> initialDecoratorUris = new HashSet<URI>();
		getAllIntegrationDecoratorsFromModel(getModel(), initialDecoratorUris);
		
		for (final Iterator<Decorator> graphDecoratorIter = getCanonicalGraph().getDecorators()
				.iterator(); graphDecoratorIter.hasNext();) {
			final Decorator decorator = graphDecoratorIter
					.next();
			
			boolean remove = true;
			if (decorator instanceof IntegrationDecorator && 
					!(decorator instanceof TransformationDecorator)) {
				for (URI uri : initialDecoratorUris) {
					if (uri != null && decorator.getURI() != null && uri.equals(decorator.getURI())) {
						remove = false;
						break;
					}
				}
				if (remove) {
					graphDecoratorIter.remove();
					continue;
				}

			}
			
			if (decorator instanceof IntegrationDecorator) {
				intDecorators.add(decorator);
			} else {
				otherDecorators.add(decorator);
			}
		}
		for(Decorator decorator : intDecorators){
			// Is the Decorator enabled?
			if (decorator.isEnabled()) {
				// Yes
				decorator.resetLabels();
			} // if 
			
			// Reset the solver
		} // for each decorator
		for(Decorator decorator:otherDecorators){
			// Is the Decorator enabled?
			if (decorator.isEnabled()) {
				// Yes
				decorator.resetLabels();
			} // if 
			
			// Reset the solver
		} // for each decorator
	
		pruneLabels();
		getSolver().reset();
	}// reset

	/**
	 * Removes labels whose decorator is not contained within the canonical graph.
	 * This is a clean up step for returning the scenario back to initial state 
	 * during a reset
	 */
	private void pruneLabels() {
		final EList<Decorator> currentDecorators = getCanonicalGraph().getDecorators();
		for (final Iterator<Entry<URI,NodeLabel>> nodeIter = getCanonicalGraph().getNodeLabels()
				.iterator(); nodeIter.hasNext();) {
			final NodeLabel label = nodeIter.next().getValue();
			if (label instanceof IntegrationLabel) { 
				Decorator d = ((IntegrationLabel)label).getDecorator();
				if (!currentDecorators.contains(d)) {					
					nodeIter.remove();
				}
			}
		}
	}
	
	/**
	 * Returns a unique set of {@link URI}s containing all {@link IntegrationDecorator} instances
	 * from the underlying {@link Model} list of node, edge, and graph decorators.
	 * @param model	The STEM {@link Model} object to search
	 * @param filtered The filtered list of {@link Model} {@link URI}s
	 */
	private static void getAllIntegrationDecoratorsFromModel(Model model, Set<URI> filtered) {
		filterIntegrationDecorators(model.getNodeDecorators(), filtered);
		filterIntegrationDecorators(model.getEdgeDecorators(), filtered);
		filterIntegrationDecorators(model.getGraphDecorators(), filtered);
		for (Model childModel : model.getModels()) {
			getAllIntegrationDecoratorsFromModel(childModel, filtered);
		}
	}
	
	/**
	 * Filter {@link IntegrationDecorator} instances and add the associated {@link URI} to 
	 * from the list of {@link Decorator}s.
	 * 
	 * @param decorators
	 * @param filtered
	 */
	private static void filterIntegrationDecorators(EList<? extends Decorator> decorators, Set<URI> filtered) {
		for (Decorator d : decorators) {
			if (d instanceof IntegrationDecorator) {
				filtered.add(d.getURI());
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void initialize() throws ScenarioInitializationException {
		// Set the sequencer back to its original state. The sequencer determines
		// the "current" time of the simulation. This is a value used to compute
		// the values of dynamic labels for each step of the simulation.
		
		if(getSequencer() == null) 
			throw new ScenarioInitializationException(NLS.bind(Messages.MISSING_SEQUENCER, new Object[] {this.getURI().toString()}),this,  new Exception());
		getSequencer().reset();

		// Prepare the model and perform any pre-processing steps necessary
		// before we begin
		STEMTime start = getSequencer().getStartTime();
	
		if(getModel() == null) 
			throw new ScenarioInitializationException(NLS.bind(Messages.MISSING_MODEL, new Object[] {this}), this, new Exception());
	
		getModel().prepare(start);
		
		// Get the canonical graph that we'll use for the simulation. It
		// maintains all state information during the simulation.
		canonicalGraph = getModel().getCanonicalGraph(CANONICAL_GRAPH_URI, new IdentifiableFilterImpl(getModel().getDublinCore().getCoverage()), start);

		getCanonicalGraph().setTime((STEMTime) EcoreUtil.copy(getSequencer()
				.getCurrentTime()));

		//
		// Confirm, re-validate the set of unresolved identifiables.
		// Because we add graphs to graphs and models to models some of the 
		// unresolved identifiables do not resolve until the very end
		// this method does that check on the FINAL canonicalGraph.
		//
		Iterator<UnresolvedIdentifiable> unresolved = getCanonicalGraph().getUnresolvedIdentifiables().iterator();
		  while (unresolved.hasNext()) {
		   UnresolvedIdentifiable temp = unresolved.next();
		   
		   if (getCanonicalGraph().getNodes().get(temp.getUnresolvedURI()) != null 
		     || getCanonicalGraph().getEdges().get(temp.getUnresolvedURI()) != null) {
		    unresolved.remove();
		   }
		}
		// Just checking...
		assert getCanonicalGraph().sane();

		// Add the adaptors to keep track of the progress for each graph decorator
		final double numDecorators = this.getCanonicalGraph().getDecorators().size();
		final Scenario self = this;
		for (final Iterator<Decorator> scenarioDecorators = this.getCanonicalGraph().getDecorators()
				.iterator(); scenarioDecorators.hasNext();) {
			final Decorator decorator = scenarioDecorators.next();
			decorator.eAdapters().add(
					new AdapterImpl() {
						/**
						   * @override
						   */
						  public void notifyChanged(Notification msg)
						  {
							  Decorator decorator = (Decorator)msg.getNotifier();
							  switch(msg.getFeatureID(Decorator.class)) {
							  	case ModelPackage.DECORATOR__PROGRESS:
							  		double delta = (msg.getNewDoubleValue() - msg.getOldDoubleValue());
							  		delta /= numDecorators;
							  		self.setProgress(self.getProgress()+delta);
							  }
						  }
					}
			);
		}
		
		// The scenario decorators are regular decorators that are allowed to
		// modified the state of the canonical graph to customize it for a
		// particular scenario. At this point the model decorators have done
		// their job. They were invoked above in the call to
		// getCanonicalGraph(). Now it is the turn of the scenario decorators to
		// add their final touch to the graph. The scenario decorators need to
		// be copied however so that any state information they may generate and
		// retain does not become part of the scenario itself. 

		ArrayList<Decorator>intDecorators = new ArrayList<Decorator>();
		ArrayList<Decorator>otherDecorators = new ArrayList<Decorator>();
		// Let the scenario decorators decorate the graph
		for (final Iterator<Decorator> scenarioDecorators = this.getScenarioDecorators()
				.iterator(); scenarioDecorators.hasNext();) {
			final Decorator decorator = (Decorator) EcoreUtil.copy(scenarioDecorators.next());
			if(decorator instanceof IntegrationDecorator)intDecorators.add(decorator);
			else otherDecorators.add(decorator);
		}
		for(Decorator decorator:intDecorators) {
			getCanonicalGraph().getDecorators().add(decorator);
			decorator.decorateGraph(start);
			decorator.setGraphDecorated(true);
		} 
		for(Decorator decorator:otherDecorators) {
			getCanonicalGraph().getDecorators().add(decorator);
			decorator.decorateGraph(start);
			decorator.setGraphDecorated(true);
		} 

		
		// Are there any unresolved identifiables in the canonical graph and 
		// should we report them?
		if ( reportEachUnresolvedIdentifiable && getCanonicalGraph().getUnresolvedIdentifiables().size() > 0) {
			// Yes
			logUnresolvedIdentifiables();
		}
		
		// Are there any unresolved identifiables in the canonical graph and 
		// should we report their number?
		if ( reportNumberofUnresolvedIdentifiables && getCanonicalGraph().getUnresolvedIdentifiables().size() > 0) {
			// Yes
			logNumberOfUnresolvedIdentifiables();
		}
	} // initialize


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String produceTitle() {
		String retValue = this.getURI().lastSegment();
		if(retValue.contains(".")) //$NON-NLS-1$
			return retValue.substring(0, retValue.indexOf(".")); //$NON-NLS-1$
		else return retValue;	
	} // produceTitle

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Decorator> getScenarioDecorators() {
		if (scenarioDecorators == null) {
			scenarioDecorators = new EObjectResolvingEList<Decorator>(Decorator.class, this, ScenarioPackage.SCENARIO__SCENARIO_DECORATORS);
		}
		return scenarioDecorators;
	}

	/**
	 * Report the unresolved Identifiables in the canonical graph
	 */
	private void logUnresolvedIdentifiables() {
		for (Iterator<UnresolvedIdentifiable> unresolvedIter = getCanonicalGraph()
				.getUnresolvedIdentifiables().iterator(); unresolvedIter
				.hasNext();) {
			final UnresolvedIdentifiable unresolvedID = unresolvedIter
					.next();
				
			CorePlugin.logInformation("In scenario " //$NON-NLS-1$
					+ produceTitle()
					+ "\", model \"" //$NON-NLS-1$
					+ unresolvedID.getModel().getDublinCore()
							.getTitle()
					+ "\",  the URI \"" //$NON-NLS-1$
					+ unresolvedID.getUnresolvedURI()
					+ "\" was unresolved." //$NON-NLS-1$
	
			, null);
		} // for each unresolved identifiable
	} // reportUnresolvedIdentifiables

	/**
	 * Report the number of unresolved Identifiables in the canonical graph.
	 */
	private void logNumberOfUnresolvedIdentifiables() {
		CorePlugin.logInformation("In scenario \"" //$NON-NLS-1$
				+ produceTitle()
				+ "\", there were " //$NON-NLS-1$
				+ getCanonicalGraph().getUnresolvedIdentifiables().size()
				+ " unresolved references." //$NON-NLS-1$
		, null);
		
	} // logNumberOfUnresolvedIdentifiables

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("boxing")
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case ScenarioPackage.SCENARIO__SEQUENCER:
				if (resolve) return getSequencer();
				return basicGetSequencer();
			case ScenarioPackage.SCENARIO__SCENARIO_DECORATORS:
				return getScenarioDecorators();
			case ScenarioPackage.SCENARIO__CANONICAL_GRAPH:
				return getCanonicalGraph();
			case ScenarioPackage.SCENARIO__PROGRESS:
				return getProgress();
			case ScenarioPackage.SCENARIO__SOLVER:
				if (resolve) return getSolver();
				return basicGetSolver();
			case ScenarioPackage.SCENARIO__LOGGERS:
				return getLoggers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "boxing" })
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__MODEL:
				setModel((Model)newValue);
				return;
			case ScenarioPackage.SCENARIO__SEQUENCER:
				setSequencer((Sequencer)newValue);
				return;
			case ScenarioPackage.SCENARIO__SCENARIO_DECORATORS:
				getScenarioDecorators().clear();
				getScenarioDecorators().addAll((Collection<? extends Decorator>)newValue);
				return;
			case ScenarioPackage.SCENARIO__PROGRESS:
				setProgress((Double)newValue);
				return;
			case ScenarioPackage.SCENARIO__SOLVER:
				setSolver((Solver)newValue);
				return;
			case ScenarioPackage.SCENARIO__LOGGERS:
				getLoggers().clear();
				getLoggers().addAll((Collection<? extends Logger>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__MODEL:
				setModel((Model)null);
				return;
			case ScenarioPackage.SCENARIO__SEQUENCER:
				setSequencer((Sequencer)null);
				return;
			case ScenarioPackage.SCENARIO__SCENARIO_DECORATORS:
				getScenarioDecorators().clear();
				return;
			case ScenarioPackage.SCENARIO__PROGRESS:
				setProgress(PROGRESS_EDEFAULT);
				return;
			case ScenarioPackage.SCENARIO__SOLVER:
				setSolver((Solver)null);
				return;
			case ScenarioPackage.SCENARIO__LOGGERS:
				getLoggers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ScenarioPackage.SCENARIO__MODEL:
				return model != null;
			case ScenarioPackage.SCENARIO__SEQUENCER:
				return sequencer != null;
			case ScenarioPackage.SCENARIO__SCENARIO_DECORATORS:
				return scenarioDecorators != null && !scenarioDecorators.isEmpty();
			case ScenarioPackage.SCENARIO__CANONICAL_GRAPH:
				return canonicalGraph != null;
			case ScenarioPackage.SCENARIO__PROGRESS:
				return progress != PROGRESS_EDEFAULT;
			case ScenarioPackage.SCENARIO__SOLVER:
				return solver != null;
			case ScenarioPackage.SCENARIO__LOGGERS:
				return loggers != null && !loggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @see org.eclipse.stem.common.impl.IdentifiableImpl#toString()
	 * @generated NOT
	 */
	@Override
	public String toString() {
		// If there is a title then we use that otherwise we let the super class
		// handle it
		final String title = getDublinCore().getTitle();
		return (title != null ? title : super.toString());
	} // toString

	/**
	 * @see org.eclipse.stem.common.impl.IdentifiableImpl#sane()
	 * @generated NOT
	 */
	@Override
	public boolean sane() {
		boolean retValue = super.sane();

		if (retValue && getModel() != null) {
			retValue = retValue && getModel().sane();
			assert retValue;
		}

		if (retValue && getCanonicalGraph() != null) {
			retValue = retValue && getCanonicalGraph().sane();
			assert retValue;
		}

		if (retValue && getSequencer() != null) {
			retValue = retValue && getSequencer().sane();
			assert retValue;
		}

		return retValue;
	} // sane

} // ScenarioImpl
