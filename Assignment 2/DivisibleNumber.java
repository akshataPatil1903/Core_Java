import java.util.Scanner;

public class DivisibleNumber{

	public static void main(String[] args){
		
		int n;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		if(n % 5 == 0 && n % 7 == 0)
			System.out.println("Number is Divisible by " + n);
		else
			System.out.println("Number is Not Divisible by  " + n);
	}
}