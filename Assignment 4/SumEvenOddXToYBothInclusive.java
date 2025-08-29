import java.util.Scanner;

public class  SumEvenOddXToYBothInclusive{
	public static void main(String[] args){
		
		int x , y;
		int n, i, cnt = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter X Number : ");
		x = sc.nextInt();
		System.out.println("Enter Y Number : ");
		y = sc.nextInt();
	
		for( i = x ; i <= y ; i++ ){
			if(i % 2 == 0)
				cnt += i;
		}		
		System.out.println("Sum Of Even Number between " + x + " to " + y + "  : "+cnt);

		for( i = x ; i <= y ; i++ ){
			if(i % 2 != 0)
				sum += i;
		}
		System.out.println("Sum Of Odd Number between " + x + " to " + y + " : "+sum);
	}
}