/**
 */
package org.eclipse.stem.graphgenerators.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.RoadShapefile;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Road Shapefile</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoadShapefileTest extends ShapefileTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoadShapefileTest.class);
	}

	/**
	 * Constructs a new Road Shapefile test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoadShapefileTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Road Shapefile test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RoadShapefile getFixture() {
		return (RoadShapefile)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphgeneratorsFactory.eINSTANCE.createRoadShapefile());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RoadShapefileTest
