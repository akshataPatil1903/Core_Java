import java.util.Scanner;

public class  DivisibleNumberWithElseIf{
	public static void main(String[] args){
		int a;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		a = sc.nextInt();
		
		if(a % 5 == 0 && a % 7 == 0)
			System.out.println(" Divisible 5 and 7 by " + a);
        	else if(a % 5 == 0)
            		System.out.println(" Divisible 5 but not 7 by " + a);
		else if( a % 7 == 0)
			System.out.println(" Divisible 7 but not 5 by " + a);
		else
			System.out.println(" Nor divisible 7 neither 5 by " + a);
	}
}