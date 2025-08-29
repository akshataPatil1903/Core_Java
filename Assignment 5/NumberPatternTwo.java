import java.util.Scanner;

public class NumberPatternTwo{
	public static void main(String[] args){
		int i, j, n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		n = sc.nextInt();
		System.out.println();
		for( i=1 ; i<=n ; i++){
			for( j=n; j>=n-i+1 ; j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}