import java.util.Scanner;

public class ArrayNNumbersSumAndAverage{
	public static void main(String[] args){
		
		int n ,i, sum =0;
		double avg; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		
		int a [] = new int[n];
	
		System.out.println("Enter Array of Elements :");
		for(i=0; i<n; i++)
			a[i] = sc.nextInt();

		for(i=0; i<n; i++)
			sum += a[i];

 		avg = (double) sum / n;

		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+avg);
	}
}