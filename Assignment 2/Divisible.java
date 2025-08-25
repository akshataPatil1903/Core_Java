//using nested if

import java.util.Scanner;
public class Divisible{

	public static void main(String[] args){
		
		int n;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number ");
		n = sc.nextInt();

		if(n % 5 ==0){
			if(n % 7 ==0)
				System.out.println("Number is Divisible 5 and 7 by " + n);
			else
				System.out.println("Number is Divisible 5 by "+ n);
		}	
		else
			System.out.println("Number is Divisible 7 by " + n);
	}
}