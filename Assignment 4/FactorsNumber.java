import java.util.Scanner;

public class FactorsNumber{
	public static void main(String[] args){

		int n, i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");	
		n = sc.nextInt();
		
		System.out.println("Factors Number is " + n + ": ");
		for( i=1 ; i<=n ; i++){
			if(n % i == 0)
				System.out.print(i + " ");
		}
	}
}