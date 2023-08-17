package com.kodnest.moc;

public class MethodOverloadingCalculatorApp {
	public static double calculate(double num1,double num2) {
		double res=num1+num2;
		return res;
	}
	public static double calculate(double num1,double num2,char operator) {
		double res=(num1*num2);
		return res;
	}
	public static double calculate(double num1,double num2,char operator,char operator1) {
		double res= (num1-num2);
		return res;
	}
	public static double calculate(double num1,double num2,char operator,char operator1,char operator2) {
		double res=(num1/num2);
		return res;
	}
}
