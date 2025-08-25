import java.util.Scanner;

public class PositiveNumber{
	public static void main(String[] args){

		int a;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		a = sc.nextInt();
		
		if(a > 0)
			System.out.println("Number is Positive ");

}
}