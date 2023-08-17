package TempCon;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Fahrenheit and Celsius");
		double F=scan.nextDouble();
		TemperatureConverter temp=new TemperatureConverter();
		double temperature=temp.convertFahrenheitToCelsius(F);
		System.out.println(temperature);

	}

}
