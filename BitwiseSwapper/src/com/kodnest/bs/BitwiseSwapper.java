package com.kodnest.bs;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int num1=scan.nextInt();
		System.out.println("Enter the second integer:");
		int num2=scan.nextInt();
		BitwiseSwapperApp.swapUsingBitwise(num1, num2);
		scan.close();
	}

}
