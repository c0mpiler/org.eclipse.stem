package org.eclipse.stem.core.graph;
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.stem.core.common.Identifiable;
import org.eclipse.stem.core.model.Decorator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partitioner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.core.graph.GraphPartitioner#getNumProcesses <em>Num Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.core.graph.GraphPackage#getGraphPartitioner()
 * @model abstract="true"
 * @generated
 */
public interface GraphPartitioner extends EObject {
	/**
	 * Returns the value of the '<em><b>Num Processes</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Processes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Processes</em>' attribute.
	 * @see #setNumProcesses(int)
	 * @see org.eclipse.stem.core.graph.GraphPackage#getGraphPartitioner_NumProcesses()
	 * @model default="1"
	 * @generated
	 */
	int getNumProcesses();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.core.graph.GraphPartitioner#getNumProcesses <em>Num Processes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Processes</em>' attribute.
	 * @see #getNumProcesses()
	 * @generated
	 */
	void setNumProcesses(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<DynamicLabel> partitionDecoratorLabels(Decorator decorator, int processRank);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList<DynamicLabel> partitionDecoratorLabels(Decorator decorator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isManaged(Identifiable identifiable);

} // GraphPartitioner
