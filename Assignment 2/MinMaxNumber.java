import java.util.Scanner;

public class MinMaxNumber{
	public static void main(String[] args){

		int a,b,c;
		int max , min;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("Maximum number is: " + max);

		min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		System.out.println("Minimum number is: " + min);
	}
}