import java.util.Scanner;

public class NumberPatternSeven{
	public static void main(String[] args){
		
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		n = sc.nextInt();

		System.out.println();

		for( i=1 ; i<=n ; i++){
			for( j=1; j<=n ; j++){
				if(j <= i)
                			System.out.print((n-j+1)+" ");
            			else
                			System.out.print((n-i+1)+" ");	
			}
			System.out.println();
		}
	}
}