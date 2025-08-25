import java.util.Scanner;

public class EvenOddConditionalOperator{
	public static void main(String[] args){

		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		System.out.println((n % 2 == 0) ?"Number is Even ": "Number is Odd ");
	}		
}