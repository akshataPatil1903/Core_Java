import java.util.Scanner;

public class NumberPatternNine{
	public static void main(String[] args){
		
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		n = sc.nextInt();

		System.out.println();

		for( i=1 ; i<=n ; i++){
			for( j=i ; j<=n ; j++){
            			System.out.print(j+" ");
			}

        		for( j=i-1 ; j>=1 ; j--){
            			System.out.print(j+" ");
        		}
			System.out.println();
		}
	}
}