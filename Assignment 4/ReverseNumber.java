import java.util.Scanner;

public class ReverseNumber{
	public static void main(String[] args){
		
		int n, temp, rem, rev = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		n = sc.nextInt();
		temp = n;
		
		while(n>0){
			rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println("Reverse Number is :"+rev);
	}
}