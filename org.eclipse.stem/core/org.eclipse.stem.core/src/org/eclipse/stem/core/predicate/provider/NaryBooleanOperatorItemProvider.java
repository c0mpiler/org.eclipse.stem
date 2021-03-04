package org.eclipse.stem.core.predicate.provider;

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


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.stem.core.predicate.NaryBooleanOperator;
import org.eclipse.stem.core.predicate.PredicateFactory;
import org.eclipse.stem.core.predicate.PredicatePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.stem.core.predicate.NaryBooleanOperator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NaryBooleanOperatorItemProvider
	extends BooleanOperatorItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaryBooleanOperatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_NaryBooleanOperator_type"); //$NON-NLS-1$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NaryBooleanOperator.class)) {
			case PredicatePackage.NARY_BOOLEAN_OPERATOR__OPERANDS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createFalse()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createOr()));

//		newChildDescriptors.add
//			(createChildParameter
//				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
//				 PredicateFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createPredicateExpression()));

//		newChildDescriptors.add
//			(createChildParameter
//				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
//				 PredicateFactory.eINSTANCE.createIdentifiablePredicateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createElapsedTimeTest()));
		
		newChildDescriptors.add
		(createChildParameter
			(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
			 PredicateFactory.eINSTANCE.createModulusTimeTest()));
	} // collectNewChildDescriptors

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//@Override
	protected void collectNewChildDescriptorsGen(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createFalse()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createPredicateReference()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createPredicateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createIdentifiablePredicateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createElapsedTimeTest()));

		newChildDescriptors.add
			(createChildParameter
				(PredicatePackage.Literals.NARY_BOOLEAN_OPERATOR__OPERANDS,
				 PredicateFactory.eINSTANCE.createModulusTimeTest()));
	}

	
} // NaryBooleanOperatorItemProvider