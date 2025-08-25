import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){

		int year;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a year : ");
		year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			System.out.println( "Leap year is " + year);
		else 
			System.out.println( "Not Leap year is "+year);
	}
}
