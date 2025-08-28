import java.util.Scanner;

public class OperationsTwoNumber{
	public static void main(String[] args){

		int x = 0, y = 0, num = 0;
		int choice;

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Equality\n2. Less Than\n3. Quotient and Remainder\n4. Range\n5. Swap\nEnter a Choice : ");
		choice = sc.nextInt();

		if (choice == 4){
			System.out.println("Enter Value of num : ");
			num = sc.nextInt();
		}
		if (choice <= 5){
			System.out.println("Enter Value of x and y : ");
			x = sc.nextInt();
			y = sc.nextInt();
		}

		switch (choice) {
			case 1 ->{
				if (x == y)
					System.out.println(x + " is equal to " + y);
				else
					System.out.println(x + " is not equal to " + y);
				}

			case 2 ->{
				if (x < y)
					System.out.println(x + " is less than " + y);
				else
					System.out.println(x + " is not less than " + y);
				}

			case 3 ->{
				System.out.println("Quotient = " + (x / y));
				System.out.println("Remainder = " + (x % y));
				}

			case 4 ->{
				if (num >= x && num <= y)
					System.out.println(num + " lies between " + x + " & " + y);
				else
					System.out.println(num + " does not lie between " + x + " & " + y);
				}

			case 5 ->{
				System.out.println("Before Swapping\nx = " + x + "\ny = " + y);
					x = x + y;
					y = x - y;
					x = x - y;
				System.out.println("After Swapping\nx = " + x + "\ny = " + y);
				}
			default-> System.out.println("Invalid Choice");
		}
	}
}
