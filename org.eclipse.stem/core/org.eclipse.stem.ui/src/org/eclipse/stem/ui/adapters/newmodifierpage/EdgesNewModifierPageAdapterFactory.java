// LabelsNewModifierPageAdapterFactory.java
package org.eclipse.stem.ui.adapters.newmodifierpage;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.definitions.edges.EdgesPackage;
import org.eclipse.stem.definitions.edges.util.EdgesAdapterFactory;
import org.eclipse.stem.ui.adapters.newmodifierpage.GraphNewModifierPageAdapterFactory.StaticLabelNewModifierPageAdapter;
import org.eclipse.stem.ui.wizards.NewModifierPage;

/**
 * This class is an {@link NewModifierPageAdapterFactory} that adapts members of
 * the Label model to {@link NewModifierPage}s.
 */
public class EdgesNewModifierPageAdapterFactory extends EdgesAdapterFactory
		implements NewModifierPageAdapterFactory {

	/**
	 * Default constructor
	 */
	public EdgesNewModifierPageAdapterFactory() {
		super();
		NewModifierPageAdapterFactory.INSTANCE.addAdapterFactory(this);
	}

	/**
	 * @see org.eclipse.stem.core.graph.util.GraphAdapterFactory#isFactoryForType(java.lang.Object)
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return type == NewModifierPageAdapter.class
				|| super.isFactoryForType(type);
	}

	/**
	 * @see org.eclipse.stem.definitions.labels.util.LabelsAdapterFactory#createPhysicalRelationshipLabelAdapter()
	 */
	@Override
	public Adapter createMigrationEdgeLabelAdapter() {
		return new MigrationEdgeLabelNewModifierPageAdapter();
	}

	/**
	 * This class is extended by classes that adapt
	 * {@link org.eclipse.stem.definitions.labels.PhysicalRelationshipLabel}s to {@link NewModifierPage}s.
	 */
	public class MigrationEdgeLabelNewModifierPageAdapter extends
			StaticLabelNewModifierPageAdapter {

		/**
		 * @see org.eclipse.stem.ui.adapters.newmodifierpage.GraphNewModifierPageAdapterFactory.StaticLabelNewModifierPageAdapter#createNewModifierPage()
		 */
		@Override
		public NewModifierPage createNewModifierPage() {
			return new GraphNewModifierPageAdapterFactory.StaticLabelNewModifierPage(
					(Identifiable) getTarget()) {
				@Override
				protected boolean isUserSpecifiedProperty(
						EStructuralFeature feature) {
					boolean retValue = super.isUserSpecifiedProperty(feature);

					retValue = retValue
							&& (feature
									.equals(EdgesPackage.Literals.MIGRATION_EDGE_LABEL_VALUE__MIGRATION_RATE));

					return retValue;
				} // isUserSpecifiedProperty
			};
		} // createNewModifierPage
		
	} // MigrationEdgeLabelNewModifierPageAdapter
} // EdgesNewModifierPageAdapterFactory
