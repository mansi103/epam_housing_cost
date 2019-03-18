package com.mansi.housingcost.services;

public class HousingCostImplementation implements HousingCostServices {

	@Override
	public double costofhouse(double areaofhouse, String Material, String Automated) {
		// TODO Auto-generated method stub
		double costofHouse = 0.0;
		if (Material.equals("standard")) {

			costofHouse = areaofhouse * 1200;

		} else if (Material.equals("aboveStandard")) {

			costofHouse = areaofhouse * 1500;

		} else if (Material.equals("highstandard")) {

			costofHouse = areaofhouse * 1800;

		} else if (Automated.equals("fullyautomated")) {

			if (Material.equals("highstandard")) {

				costofHouse = areaofhouse * 2500;

			}

		}

		return costofHouse;
	}

}
