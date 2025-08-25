import java.util.Scanner;

public class Character{
	public static void main(String[] args){

		char ch;
 		char prevchar, nextchar;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Character : ");
		ch = sc.next().charAt(0);

		prevchar = (char)(ch - 1);
		nextchar = (char)(ch + 1);

		System.out.println("The Previous Character is : " + prevchar);
		System.out.println("The Next Character is     : " + nextchar);
	}
}