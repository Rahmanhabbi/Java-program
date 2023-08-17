package com.kodnest;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Enter the number between 1-4");
		int num=scan.nextInt();
		switch(num) {
		case 1 :
			System.out.println("Addition Result is "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction Result is "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication Result is "+(a*b));
			break;
		case 4:
			System.out.println("Division Result is "+(a/b));
			break;
		default :
			System.out.println("Error");
		}
	}

}
