import java.util.Scanner;

public class CountDigitEvenOddZero{
	public static void main(String[] args){
		
		int n ;
		int rem = 0 ,evencnt = 0 ,oddcnt = 0, zerocnt = 0;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Integer : ");
		n = sc.nextInt();
		

		if(n == 0)
			zerocnt = 1;
	
		while(n > 0){
			rem = n % 10;

			if(rem == 0)
				zerocnt++;
			else if(rem % 2 == 0)
				evencnt++;
			else
				oddcnt++;
			n /= 10;
		}
		System.out.println(" Even Number Digit is  : " +evencnt);
		System.out.println(" Odd Number Digits is  : " +oddcnt);
		System.out.println(" Zero Number Digits is : " +zerocnt);
	}
}   