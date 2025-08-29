import java.util.Scanner;

public class SumFactorsNumber{
	public static void main(String[] args){
		
		int n, i ,sum =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");	
		n = sc.nextInt();
		
		for( i=1 ; i<=n ; i++){
			if(n % i == 0)
				sum += i;
		}
		System.out.println("Sum of factors is : " + sum);
	}
}