import java.util.Scanner;

public class SumEvenOddNumbersOneToN{
	public static void main(String[] args){
		
		int n, i;
		int cnt = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
	
			for(i = 1 ; i <= n ; i++ ){
			if(i % 2 == 0)
				cnt += i;
		}		
		System.out.println("Sum Of Even Number between 1 to " + n + "  : "+cnt);

		
			for(i = 1 ; i <= n ; i++ ){
			if(i % 2 != 0)
				sum += i;
		}
		System.out.println("Sum Of Odd Number between 1 to " + n + " : "+sum);
	}
}