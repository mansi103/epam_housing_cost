package com.mansi.housingcost.services;
/**
* @param area
* @param Material
* @param Automated
* @return cost of house
*/
public interface HousingCostServices {
	public double costOfHouse(double area, String material, String automated);
}
