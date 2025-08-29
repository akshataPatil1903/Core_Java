import java.util.Scanner;

public class StarPatternFour{
	public static void main(String[] args){

		int n , i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		n = sc.nextInt();

		System.out.println();

		for( i=1 ; i<=n ; i++){
			for( j=1; j<=n ; j++){
				 if(i==j || j==1 || i==n)
					System.out.print("*");
				else
					System.out.print(" ");		
			}
			System.out.println();
		}
	}
}