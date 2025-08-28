import java.util.Scanner;

public class PrintOneToN{
	public static void main(String[] args){

		int n , i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		for(i = 1 ; i <= n ; i++ )
			System.out.println(i);
	}
}