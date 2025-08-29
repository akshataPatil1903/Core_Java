import java.util.Scanner;

public class CountAndSumFactorNumber{
	public static void main(String[] args){
		
		int n, i,cnt = 0, sum = 0;	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		n = sc.nextInt();

		System.out.println("Factors is :");
		for ( i = 1; i <= n; i++){
			if (n % i == 0){
				System.out.print(i + " ");
				cnt++;
				sum += i;
			}
		}

		System.out.println("Count Number Of Factor : " + cnt);
		System.out.println("Sum of Factor Number   : " + sum);
	}
}
