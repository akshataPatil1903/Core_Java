import java.util.Scanner;

public class  PrintXToYBothInclusive{
	public static void main(String[] args){

		int x, y, i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X Number : ");
		x = sc.nextInt();

		System.out.println("Enter Y Number : ");
		y = sc.nextInt();

		for(i = x ; i <= y ; i++ )
			System.out.println(i);
	}
}