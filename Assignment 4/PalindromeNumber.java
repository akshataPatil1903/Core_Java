import java.util.Scanner;

public class PalindromeNumber{
	public static void main(String[] args){
		
		int n, temp, rev = 0, rem;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		n = sc.nextInt();
		temp = n;
		
		while(n>0){
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if(rev == temp)
			System.out.println("Palindrome Number is " + temp);
		else
			System.out.println("Not Palindrome Number is " + temp);
	}
}