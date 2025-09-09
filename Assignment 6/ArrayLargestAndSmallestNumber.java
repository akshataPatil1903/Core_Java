import java.util.Scanner;

public class ArrayLargestAndSmallestNumber{
	public static void main(String[] args){
		int n, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter Array of Elements : ");
		for( i=0; i<n; i++)	
			a[i] = sc.nextInt();
		
		int max = a[0];
		for( i=0; i<n; i++)
			if(max < a[i])
				max = a[i];

		int min = a[0];
		for( i=0; i<n; i++)
			if(min > a[i])
				min = a[i];
	
		System.out.println("Largest Number of Array  : "+ max);
		System.out.println("Smallest Number of Array : "+ min);
	}
}