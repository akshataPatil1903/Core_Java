import java.util.Scanner;

public class PerfectNumber{
	public static void main(String[] args){
		
		int n , i , sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		sum = 0;
		for(i=1; i<=n/2; i++){
			if(n % i == 0)
				sum += i;
		}
		if(sum == n)
			System.out.println("Perfect Number is : " + n);
		else
			System.out.println("Not Perfect Number is :  "+ n);
	}
}