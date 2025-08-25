import java.util.Scanner;

public class UpperLowerConverter{
	public static void main(String[] args){

		char ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character: ");
		ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z'){
			ch = (char)(ch - 32); 
			System.out.println("Convert Uppercase : " + ch);
		} 

		else if (ch >= 'A' && ch <= 'Z'){
			ch = (char)(ch + 32); 
			System.out.println("Convert Lowercase : " + ch);
		} 

		else{
			System.out.println("Not an alphabet character.");
		}
	}
}
