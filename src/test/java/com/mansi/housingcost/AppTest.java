package com.mansi.housingcost;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;

import org.junit.Test;

import com.mansi.housingcost.services.HousingCostImplementation;

/**
 * 
 * Unit test for simple App.
 * 
 */

public class AppTest

{

	private static App app;

	/**
	 * 
	 * Setting up instance of the class
	 * 
	 * @throws Exception
	 * 
	 */

	@BeforeClass

	public static void BeforeClass() throws Exception {

		app = new App(new HousingCostImplementation());

	}

	/**
	 * 
	 * Function to test house cost build with standard material
	 * 
	 */

	@Test

	public void Standardhousecost() {

		assertEquals(12000.0, app.calculateCostofHouse(10, "standard", "no"), 0.0);

	}

	/**
	 * 
	 * Function to test house cost build with above standard material
	 * 
	 */

	@Test

	public void AboveStandardHouseCost() {

		assertEquals(15000.0, app.calculateCostofHouse(10, "abovestandard", "no"), 0.0);

	}

	/**
	 * 
	 * Function to test cost of house build with high standard material
	 * 
	 */

	@Test

	public void HighStandardHouseCost() {

		assertEquals(18000.0, app.calculateCostofHouse(10, "highstandard", "no"), 0.0);

	}

	/**
	 * 
	 * Function to test cost of house build with high standard material and full
	 * automation
	 * 
	 */

	@Test

	public void HighstandardhouseCostWithAutomation() {

		assertEquals(25000.0, app.calculateCostofHouse(10, "highstandard", "fullyautomated"), 0.0);

	}

}
