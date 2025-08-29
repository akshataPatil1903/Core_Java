import java.util.Scanner;

public class PowerOfNumber{
	public static void main(String[] args){
		
		int x , n, i, power = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X Number : ");
		x = sc.nextInt();
		System.out.println("Enter X Power Number : ");
		n = sc.nextInt();

		for(i = 1 ; i <= n ; i++ )
			power *= x;
		System.out.println(x + " ^ " + n + " = "+power);
	}
}