package com.kodnest.tc;

public class TaxCalciApp {
	public static double calculateTotalWithTax(double amount,double taxRate) {
		double totalCost = (amount * taxRate)+amount;
		return totalCost;
	}
}
