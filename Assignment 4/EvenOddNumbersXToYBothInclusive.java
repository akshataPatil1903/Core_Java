import java.util.Scanner;
public class EvenOddNumbersXToYBothInclusive{
	public static void main(String[] args){
		
		int x,y,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X Number : ");
		x = sc.nextInt();
		System.out.println("Enter Y Number : ");
		y = sc.nextInt();

		System.out.println("Even Numbers between " + x +" to " + y +" : ");
		for(i = x ; i <= y ; i++ ){
			if(i % 2 == 0)
				System.out.println(i);
		}

		System.out.println("Odd Numbers between " + x +" to " + y +" : ");
		for(i = x ; i <= y; i++ ){
			if(i % 2 != 0 )
				System.out.println(i);
		}
	}
}