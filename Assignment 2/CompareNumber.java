import java.util.Scanner;

public class CompareNumber{
	public static void main(String[] arg){

		int a, b;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Two Number : ");
		a = sc.nextInt();
		b = sc.nextInt();

		if(a == b)
			System.out.println(a + " equal to " + b);
		else if(a > b)
			System.out.println( a + " greater than " +  b);
		else 
			System.out.println( a + " less than " +  b);		
	}
}