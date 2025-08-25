import java.util.Scanner;

public class VowelConsonant{
	public static void main(String[] args){

		char ch;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Character ");
		ch = sc.next().charAt(0);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("This Character are Vowels ");
		else
			System.out.println("This Character are Consonant");
	}
}