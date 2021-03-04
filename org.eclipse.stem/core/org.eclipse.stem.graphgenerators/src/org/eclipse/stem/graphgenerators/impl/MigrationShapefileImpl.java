/**
 */
package org.eclipse.stem.graphgenerators.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.MigrationShapefile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migration Shapefile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.MigrationShapefileImpl#getPopulationName <em>Population Name</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.MigrationShapefileImpl#getMigrationRate <em>Migration Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MigrationShapefileImpl extends ShapefileImpl implements MigrationShapefile {
	/**
	 * The default value of the '{@link #getPopulationName() <em>Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationName()
	 * @generated
	 * @ordered
	 */
	protected static final String POPULATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopulationName() <em>Population Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationName()
	 * @generated
	 * @ordered
	 */
	protected String populationName = POPULATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMigrationRate() <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationRate()
	 * @generated
	 * @ordered
	 */
	protected static final String MIGRATION_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMigrationRate() <em>Migration Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMigrationRate()
	 * @generated
	 * @ordered
	 */
	protected String migrationRate = MIGRATION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigrationShapefileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgeneratorsPackage.Literals.MIGRATION_SHAPEFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopulationName() {
		return populationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationName(String newPopulationName) {
		String oldPopulationName = populationName;
		populationName = newPopulationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.MIGRATION_SHAPEFILE__POPULATION_NAME, oldPopulationName, populationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMigrationRate() {
		return migrationRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMigrationRate(String newMigrationRate) {
		String oldMigrationRate = migrationRate;
		migrationRate = newMigrationRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.MIGRATION_SHAPEFILE__MIGRATION_RATE, oldMigrationRate, migrationRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__POPULATION_NAME:
				return getPopulationName();
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__MIGRATION_RATE:
				return getMigrationRate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__POPULATION_NAME:
				setPopulationName((String)newValue);
				return;
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__MIGRATION_RATE:
				setMigrationRate((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__POPULATION_NAME:
				setPopulationName(POPULATION_NAME_EDEFAULT);
				return;
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__MIGRATION_RATE:
				setMigrationRate(MIGRATION_RATE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__POPULATION_NAME:
				return POPULATION_NAME_EDEFAULT == null ? populationName != null : !POPULATION_NAME_EDEFAULT.equals(populationName);
			case GraphgeneratorsPackage.MIGRATION_SHAPEFILE__MIGRATION_RATE:
				return MIGRATION_RATE_EDEFAULT == null ? migrationRate != null : !MIGRATION_RATE_EDEFAULT.equals(migrationRate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (populationName: ");
		result.append(populationName);
		result.append(", migrationRate: ");
		result.append(migrationRate);
		result.append(')');
		return result.toString();
	}

} //MigrationShapefileImpl
