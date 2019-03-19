package com.mansi.housingcost.services;

public class HousingCostImplementation implements HousingCostServices {

	@Override
	public double costOfHouse(double areaofhouse, String material, String automated) {
		double costofHouse = 0.0;
		 if (automated.equals("fullyautomated")) {

			if (material.equals("highstandard")) {

				costofHouse = areaofhouse * 2500;

			}

		}
		else{
			if (material.equals("standard")) {

			costofHouse = areaofhouse * 1200;

			} 
			else if (material.equals("aboveStandard")) {

			costofHouse = areaofhouse * 1500;

			} 
			else if (material.equals("highstandard")) {

			costofHouse = areaofhouse * 1800;

			}
		}
		return costofHouse;
	}

}
