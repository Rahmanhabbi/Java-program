package com.kodnest.tc;

import java.util.Scanner;

public class TaxCalci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double amount=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double taxRate=scan.nextDouble();	
		System.out.println("Total cost including tax: "+TaxCalciApp.calculateTotalWithTax(amount, taxRate));
	}
	
}
