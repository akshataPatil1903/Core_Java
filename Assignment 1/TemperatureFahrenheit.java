import java.util.Scanner;

public class TemperatureFahrenheit{
	public static void main(String[] args){
     
		float fahrenheit;
		double kelvin , celsius;
     
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Temperatures in Fahrenheit : ");
		fahrenheit = sc.nextFloat();

		celsius = (5.0/9.0) * (fahrenheit - 32);
		kelvin = celsius + 273.15;

		System.out.println("Celsius is : "+celsius);
		System.out.println("Kelvin is  :"+kelvin);
	}
}