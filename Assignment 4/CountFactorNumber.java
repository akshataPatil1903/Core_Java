import java.util.Scanner;

public class CountFactorNumber{
	public static void main(String[] args){
		
		int n, i, cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");	
		n = sc.nextInt();
		
		for( i=1 ; i<=n ; i++){
			if(n % i == 0)
				cnt++;
		}
		System.out.println("Count of Factor is : " + cnt);
	}
}