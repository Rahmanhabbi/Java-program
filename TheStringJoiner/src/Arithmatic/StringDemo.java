package Arithmatic;

import java.util.Scanner;
import java.lang.*;

public class StringDemo {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String str1=scan.next();
		String str2=scan.next();
		System.out.println(joinStrings(str1, str2));
	}
	public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}

}
