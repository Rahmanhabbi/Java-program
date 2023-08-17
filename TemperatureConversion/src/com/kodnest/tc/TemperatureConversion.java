package com.kodnest.tc;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Enter your choice:");
		int num=scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("Enter the temperature in Celsius:");
			double celsius=scan.nextDouble();
			double res=TemperatureConversionApp.celsiusToFahrenheit(celsius);
			System.out.println(celsius+" C is equivalent to "+res+" F");
			break;
		case 2:	
			System.out.println("Enter the temperature in Fahrenheit:");
			double fahrenheit=scan.nextDouble();
			double res1=TemperatureConversionApp.fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+" F is equivalent to "+res1+" C");
			break;
		default:
			System.out.println("Number is Invalid");
			}
		
	}
	

}
