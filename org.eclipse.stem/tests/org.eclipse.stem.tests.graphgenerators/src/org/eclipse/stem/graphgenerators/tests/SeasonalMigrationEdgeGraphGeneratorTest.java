/**
 */
package org.eclipse.stem.graphgenerators.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.graphgenerators.GraphgeneratorsFactory;
import org.eclipse.stem.graphgenerators.SeasonalMigrationEdgeGraphGenerator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Seasonal Migration Edge Graph Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeasonalMigrationEdgeGraphGeneratorTest extends GraphGeneratorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SeasonalMigrationEdgeGraphGeneratorTest.class);
	}

	/**
	 * Constructs a new Seasonal Migration Edge Graph Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonalMigrationEdgeGraphGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Seasonal Migration Edge Graph Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SeasonalMigrationEdgeGraphGenerator getFixture() {
		return (SeasonalMigrationEdgeGraphGenerator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphgeneratorsFactory.eINSTANCE.createSeasonalMigrationEdgeGraphGenerator());
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

} //SeasonalMigrationEdgeGraphGeneratorTest
