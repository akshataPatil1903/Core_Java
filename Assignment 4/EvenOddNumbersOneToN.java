import java.util.Scanner;

public class EvenOddNumbersOneToN{
	public static void main(String[] args){
		
		int i, n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		System.out.println("Even Numbers between 1 to "+ n +" : ");
		for(i = 1 ; i <= n ; i++ ){
			if(i % 2 == 0)
				System.out.println(i);
		}

		System.out.println("Odd Numbers between 1 to " + n +" : ");
		for(i = 0 ; i <= n; i++ ){
			if(i % 2 != 0 )
				System.out.println(i);
		}
	}
}