import java.util.Scanner;

public class CountNumberDigit{
	public static void main(String[] args){
		
		int n ,temp, cnt = 0; 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		n = sc.nextInt();
		temp = n;
		
		while(n > 0){
			cnt++;
			n /= 10;
		}
		System.out.println("Count of Number Digit is : "+cnt);	
	}
}