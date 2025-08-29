import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){

		int i , f, n;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
	
		f = 1;
		for( i = 1 ; i <= n ; i++)
			f *= i;
		System.out.println(n+"! = "+f);
	}
}