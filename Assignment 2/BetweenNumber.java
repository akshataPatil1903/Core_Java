import java.util.Scanner;

public class BetweenNumber{
	public static void main(String[] args){
		
		int a , b, c;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Three Number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if((a > b || a < c ) || (a > c && a < b))
			System.out.println( a + " is between " +  b +" and " + c);
		else
			System.out.println( a + " is between " +  b +" and " + c);	
	}
}