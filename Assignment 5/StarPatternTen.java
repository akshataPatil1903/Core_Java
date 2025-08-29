import java.util.Scanner;

public class StarPatternTen{
	public static void main(String[] args){
		
		int n, i, j, k;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		n = sc.nextInt();

		System.out.println();

		for( i=1 ; i<=n ; i++){
			 for( k=1 ; k<i ; k++)         
				System.out.print(" ");
        		for( j=1;j<=n-i+1;j++){
        			if(i == 1 || j == 1 || j == n-i+1)
					System.out.print("* ");
        			else
					System.out.print("  ");
        		}
			System.out.println();
		}
	}
}