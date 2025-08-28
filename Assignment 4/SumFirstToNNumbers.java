import java.util.Scanner;

public class SumFirstToNNumbers{
	public static void main(String[] args){
		
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		int i ,sum = 0;
		for(i = 1 ; i <= n ; i++ ){
			 sum += i;
		}
		System.out.println("Sum of 1 to " + n +" (Using loop): " + sum);

		sum = ( n * ( n + 1 ) ) / 2;
		System.out.println("Sum of 1 to "+ n +"(Without loop) : " + sum);
	}
}