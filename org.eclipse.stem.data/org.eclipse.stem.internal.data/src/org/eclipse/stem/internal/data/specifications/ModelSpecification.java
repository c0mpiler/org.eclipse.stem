// ModelSpecification.java
package org.eclipse.stem.internal.data.specifications;

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

import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.model.Model;
import org.eclipse.stem.core.model.ModelFactory;
import org.eclipse.stem.core.model.ModelPackage;

/**
 * This class represents the specification of an {@link Identifiable} that is a
 * {@link Model}.
 */
abstract public class ModelSpecification extends IdentifiableSpecification {

	@Override
	protected String getSerializationFileNameExtension() {
		return ModelPackage.eNAME;
	}

	// Nothing

	@Override
	protected Model createIdentifiableInstance() {
		final Model retValue = ModelFactory.eINSTANCE.createModel();
		dublinCore.setFormat(ModelPackage.eNS_URI);
		return retValue;
	} // createIdentifiableInstance

} // ModelSpecification