/**
 */
package org.eclipse.stem.graphgenerators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road Shapefile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.stem.graphgenerators.RoadShapefile#getRoadClass <em>Road Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getRoadShapefile()
 * @model
 * @generated
 */
public interface RoadShapefile extends Shapefile {
	/**
	 * Returns the value of the '<em><b>Road Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Road Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Road Class</em>' attribute.
	 * @see #setRoadClass(String)
	 * @see org.eclipse.stem.graphgenerators.GraphgeneratorsPackage#getRoadShapefile_RoadClass()
	 * @model
	 * @generated
	 */
	String getRoadClass();

	/**
	 * Sets the value of the '{@link org.eclipse.stem.graphgenerators.RoadShapefile#getRoadClass <em>Road Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Road Class</em>' attribute.
	 * @see #getRoadClass()
	 * @generated
	 */
	void setRoadClass(String value);

} // RoadShapefile
