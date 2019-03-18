package com.mansi.housingcost;

import com.mansi.housingcost.services.HousingCostServices;

/**
 * Hello world!
 *
 */
public class App {
	private HousingCostServices costService;

	public App(HousingCostServices costService) {

		this.costService = costService;

	}

	/**
	 * 
	 * @param areaofhouse
	 * @param Material
	 * @param Automated
	 * @return cost of house
	 */
	public double calculateCostofHouse(double areaofhouse, String Material, String Automated) {

		return costService.costofhouse(areaofhouse, Material, Automated);

	}

}
