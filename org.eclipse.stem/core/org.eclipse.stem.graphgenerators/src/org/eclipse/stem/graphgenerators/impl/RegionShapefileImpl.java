/**
 */
package org.eclipse.stem.graphgenerators.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.stem.graphgenerators.AreaUnit;
import org.eclipse.stem.graphgenerators.GraphgeneratorsPackage;
import org.eclipse.stem.graphgenerators.RegionShapefile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Shapefile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl#getArea <em>Area</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl#getAreaUnit <em>Area Unit</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl#getPopulationNames <em>Population Names</em>}</li>
 *   <li>{@link org.eclipse.stem.graphgenerators.impl.RegionShapefileImpl#getPopulationSizes <em>Population Sizes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionShapefileImpl extends ShapefileImpl implements RegionShapefile {
	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAreaUnit() <em>Area Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaUnit()
	 * @generated
	 * @ordered
	 */
	protected static final AreaUnit AREA_UNIT_EDEFAULT = AreaUnit.SQ_KM;

	/**
	 * The cached value of the '{@link #getAreaUnit() <em>Area Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaUnit()
	 * @generated
	 * @ordered
	 */
	protected AreaUnit areaUnit = AREA_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPopulationNames() <em>Population Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> populationNames;

	/**
	 * The cached value of the '{@link #getPopulationSizes() <em>Population Sizes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationSizes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> populationSizes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionShapefileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgeneratorsPackage.Literals.REGION_SHAPEFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.REGION_SHAPEFILE__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaUnit getAreaUnit() {
		return areaUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaUnit(AreaUnit newAreaUnit) {
		AreaUnit oldAreaUnit = areaUnit;
		areaUnit = newAreaUnit == null ? AREA_UNIT_EDEFAULT : newAreaUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgeneratorsPackage.REGION_SHAPEFILE__AREA_UNIT, oldAreaUnit, areaUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPopulationNames() {
		if (populationNames == null) {
			populationNames = new EDataTypeEList<String>(String.class, this, GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_NAMES);
		}
		return populationNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPopulationSizes() {
		if (populationSizes == null) {
			populationSizes = new EDataTypeEList<String>(String.class, this, GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_SIZES);
		}
		return populationSizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA:
				return getArea();
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA_UNIT:
				return getAreaUnit();
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_NAMES:
				return getPopulationNames();
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_SIZES:
				return getPopulationSizes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA:
				setArea((String)newValue);
				return;
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA_UNIT:
				setAreaUnit((AreaUnit)newValue);
				return;
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_NAMES:
				getPopulationNames().clear();
				getPopulationNames().addAll((Collection<? extends String>)newValue);
				return;
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_SIZES:
				getPopulationSizes().clear();
				getPopulationSizes().addAll((Collection<? extends String>)newValue);
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
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA_UNIT:
				setAreaUnit(AREA_UNIT_EDEFAULT);
				return;
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_NAMES:
				getPopulationNames().clear();
				return;
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_SIZES:
				getPopulationSizes().clear();
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
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA:
				return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
			case GraphgeneratorsPackage.REGION_SHAPEFILE__AREA_UNIT:
				return areaUnit != AREA_UNIT_EDEFAULT;
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_NAMES:
				return populationNames != null && !populationNames.isEmpty();
			case GraphgeneratorsPackage.REGION_SHAPEFILE__POPULATION_SIZES:
				return populationSizes != null && !populationSizes.isEmpty();
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
		result.append(" (area: ");
		result.append(area);
		result.append(", areaUnit: ");
		result.append(areaUnit);
		result.append(", populationNames: ");
		result.append(populationNames);
		result.append(", populationSizes: ");
		result.append(populationSizes);
		result.append(')');
		return result.toString();
	}

} //RegionShapefileImpl
