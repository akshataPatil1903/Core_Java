import java.util.Scanner;

public class NumberPatternFive{
	public static void main(String[] args){
		
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N:");
		n = sc.nextInt();

		System.out.println();

		for( i=1 ; i<=n ; i++){
			for( j=1; j<=n ; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}