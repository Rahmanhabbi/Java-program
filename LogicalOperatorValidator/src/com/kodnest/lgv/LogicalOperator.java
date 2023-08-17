package com.kodnest.lgv;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean validInput=scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean condition=scan.nextBoolean();
		boolean res=LogicalOperatorApp.isValidInput(validInput, condition);
		if (res==true) 
			System.out.println("Input is valid.");
		else
			System.out.println("Input is Invalid.");
		scan.close();
	}
	

}
