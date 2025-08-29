import java.util.Scanner;

public class NumberPatternThree{
	public static void main(String[] args){
		
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		n = sc.nextInt();

		System.out.println();

		for( i=1 ; i<=n ; i++){
			for( j=1; j<=n ; j++){
				if(i == 1 || i == n || j == 1 || j == n)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");	
			}
			System.out.println();
		}
	}
}