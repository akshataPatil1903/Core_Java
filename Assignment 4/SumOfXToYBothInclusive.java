import java.util.Scanner;

public class SumOfXToYBothInclusive{
	public static void main(String[] args){
		
		int x , y, i;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X Number : ");
		x = sc.nextInt();
		System.out.println("Enter Y Number : ");
		y = sc.nextInt();
		

		for(i = x ; i <= y ; i++ ){
			 cnt += i;
		}
		System.out.println("Sum of  " + x +" to "+ y +" Both Inclusive : "+cnt);
	}
}