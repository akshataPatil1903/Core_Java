import java.util.Scanner;

public class  DivisibleNumberUsingOROperator{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		n = sc.nextInt();
		
		if(n % 5 != 0 || n % 7 != 0)
			System.out.println("Not Divisible by 5 and 7 by "  + n);
		else
			System.out.println("Divisible by 5 and 7 by " + n);
	}
}