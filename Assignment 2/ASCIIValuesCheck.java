import java.util.Scanner;

public class ASCIIValuesCheck{
	public static void main(String[] args){
		
		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a character: ");
		ch = sc.next().charAt(0); 
 
		if (ch >= 48 && ch <= 57){
			System.out.println("It is a Digit.");
		}

		else if (ch >= 65 && ch <= 90){
			System.out.println("It is an Uppercase Alphabet.");
		}

		else if (ch >= 97 && ch <= 122){
			System.out.println("It is an Lowercase Alphabet.");
		}
 
		else{
			System.out.println("It is neither a digit nor an alphabet.");
		}
	}
}
