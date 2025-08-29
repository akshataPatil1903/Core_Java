import java.util.Scanner;

public class ReverseStarTrianglePatternEight{
	public static void main(String[] args){
		
		int n, i,j,k;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N:");
		n = sc.nextInt();

		System.out.println();

		for( i=n ; i>=1 ; i--){
			for( k=i ; k<n ; k++)
				System.out.print(" ");
        		for( j=1 ; j<=i ; j++)
				System.out.print("* "); 
				System.out.println();
		}
	}
}