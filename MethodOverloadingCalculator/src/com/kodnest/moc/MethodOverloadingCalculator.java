package com.kodnest.moc;

import java.util.Scanner;

public class MethodOverloadingCalculator {


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number:");
		double num1=scan.nextDouble();
		System.out.println("Enter the second number:");
		double num2=scan.nextDouble();
		System.out.println("Enter the operator (+, -, *, /):");
		char operator=scan.next().charAt(0);
		switch(operator)
		{
		case '+':
			System.out.println("Result: "+MethodOverloadingCalculatorApp.calculate(num1, num2));
			break;
		case '-':
			System.out.println("Result: "+MethodOverloadingCalculatorApp.calculate(num1, num2,operator,operator));
			break;
		case '*':
			System.out.println("Result: "+MethodOverloadingCalculatorApp.calculate(num1, num2,operator));
			break;
		case '/':
			System.out.println("Result: "+MethodOverloadingCalculatorApp.calculate(num1, num2,operator,operator,operator));
			break;
		default:
			System.out.println("Invalid operation");
		}

	}

}
