import java.util.Scanner;

public class NumberPatternOne{
	public static void main(String[] args){
		
		int n, i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		System.out.println();

		for( i=1 ; i<=n ; i++){
			for( j=1; j<=n ; j++){
				System.out.print((j + 1) % 2 +" ");
			}
			System.out.println();
		}
	}
}