/**
 */
package org.eclipse.stem.populationmodels.standard.tests;

import junit.textui.TestRunner;

import org.eclipse.stem.populationmodels.standard.SeasonalMigratoryPopulationModel;
import org.eclipse.stem.populationmodels.standard.StandardFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Seasonal Migratory Population Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeasonalMigratoryPopulationModelTest extends StandardPopulationModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SeasonalMigratoryPopulationModelTest.class);
	}

	/**
	 * Constructs a new Seasonal Migratory Population Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeasonalMigratoryPopulationModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Seasonal Migratory Population Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SeasonalMigratoryPopulationModel getFixture() {
		return (SeasonalMigratoryPopulationModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StandardFactory.eINSTANCE.createSeasonalMigratoryPopulationModel());
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

} //SeasonalMigratoryPopulationModelTest
