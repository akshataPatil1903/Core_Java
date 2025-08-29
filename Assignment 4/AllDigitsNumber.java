import java.util.Scanner;

public class AllDigitsNumber{
	public static void main(String[] args){

		int n, reversed = 0,originalNumber,remainder;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		originalNumber = n;
			
		while(n > 0){
			remainder = n % 10;
			reversed  = reversed  * 10 + remainder;
			n /= 10;
		}
		System.out.println("Digits : " );
		
		while(reversed > 0){
			originalNumber = reversed % 10;
			System.out.println(originalNumber);
			reversed  /= 10;
		}	
	}
}