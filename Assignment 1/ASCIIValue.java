import java.util.Scanner;

public class ASCIIValue{
	public static void main(String[] args){
		char ch;

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Character : ");
		ch = sc.next().charAt(0);
		
		int num = (int) ch;
		System.out.println("The ASCII value of '" + ch + "' is: " + num);
	}
}