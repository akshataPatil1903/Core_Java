import java.util.Scanner;

public class Discount{
	public static void main(String[] args){

		int item1, item2, item3;
		float amount, discount = 0, finalAmount;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Item 1: ");
		item1 = sc.nextInt();
		System.out.println("Enter Item 2: ");
		item2 = sc.nextInt();
		System.out.println("Enter Item 3: ");
		item3 = sc.nextInt();

		amount = item1 + item2 + item3;
		finalAmount = amount - discount;


		if (amount > 50000){
		discount = (amount * 20) / 100;
			System.out.println("Discount is :  " + discount);
		}

		else if (amount > 25000 && amount <= 50000){
		discount = (amount * 15) / 100;
			System.out.println("Discount is  : " + discount);
		}

		else if (amount > 10000 && amount <= 25000){
		discount = (amount * 8) / 100;
			System.out.println("Discount is  :  " + discount);
		}

		else 
			System.out.println("No Discount");

		System.out.println("Total Amount is :  " + amount);
		System.out.println("Discount is  :  " + discount);
		System.out.println("Final Amount is : " + finalAmount);
	}
}
