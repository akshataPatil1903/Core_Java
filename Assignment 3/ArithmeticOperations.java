import java.util.Scanner;

public class ArithmeticOperations{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int a,b;
		char ch;

		System.out.println("Enter an Expersion : ");
		a = sc.nextInt();
		ch = sc.next().charAt(0);
		b = sc.nextInt();
		
		switch (ch) {
			case '+' -> System.out.println("Addition is : " + (a + b));
			case '-' -> System.out.println("Substraction is : " + (a - b));
			case '*' -> System.out.println("Multiplication is : " + (a * b));	
			case '/' -> System.out.println("Division is : " + (a / b));
		}
	}
}