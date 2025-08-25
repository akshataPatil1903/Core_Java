import java.util.Scanner;

public class LibraryFineCharges{
	public static void main(String[] args){
		
		int dayNumber, fine;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of days: ");
		dayNumber = sc.nextInt();

		if (dayNumber > 0 && dayNumber <= 5){
			fine = dayNumber * 5;
			System.out.println("Fine Charges is Rs " + fine);
		} 

		else if (dayNumber >= 6 && dayNumber <= 10){
			fine = dayNumber * 10;
			System.out.println("Fine Charges is Rs " + fine);
		} 

		else if (dayNumber > 10){
			fine = dayNumber * 15;
			System.out.println("Fine Charges is Rs " + fine);
		} 

		else{
			System.out.println("No Fine Charges");
		}
	}
}
