package comk.aurionpro.temperatureconverter;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter temperature: ");
    double temperature = scanner.nextDouble();
    
    System.out.println("Choose conversion:");
    System.out.println("1. Celsius to Fahrenheit");
    System.out.println("2. Fahrenheit to Celsius");
    System.out.println("3. Celsius to Kelvin");
    System.out.println("4. Kelvin to Celsius");
    System.out.println("5. Fahrenheit to Kelvin");
    System.out.println("6. Kelvin to Fahrenheit");
    
    int choice = scanner.nextInt();
    double Fahrenheit = 0.0;
    double Celcius = 0.0;
    double Kelvin = 0.0;
    switch(choice)
    {
    case 1:
    	Fahrenheit = (((9/5)*temperature) + 32);
    	System.out.println(Fahrenheit);
	break;
    case 2:
    	Celcius = (temperature - 32) * (5/9);
    	System.out.println(Celcius);
    	break;
    case 3:
    	Kelvin = (temperature + 273.15);
    	System.out.println(Kelvin);
    	break;
    case 4:
    	double C1 = temperature - 273.15;
    	System.out.println(C1);
    	break;
    case 5:
    	double K1 = ((temperature-32)*(5/9))+273.15;
    	System.out.println(K1);
    	break;
    case 6:
    	double F1 = ((temperature-273.15)*(9*5))+32;
    	System.out.println(F1);
    	break;
    	
    }
}}
