package com.kodnest.bs;

public class BitwiseSwapperApp {
	public static void swapUsingBitwise(int num1,int num2) {
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("After swapping: First = "+num1+" , Second = "+num2);
		
	}
}
