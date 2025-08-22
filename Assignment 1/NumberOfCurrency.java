import java.util.Scanner;

public class NumberOfCurrency{
	public static void main(String[] args){
		
		int wd, one, five, ten;
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Amount Withdrawn : ");
		wd = sc.nextInt();
	
		ten = wd / 10;
		wd = wd % 10;

		five = wd / 5;
		wd = wd % 5;

		one = wd;

		System.out.println("Currency Notes : ");
		System.out.println("Ten Notes  : "+ ten);
		System.out.println("Five Notes : "+ five);
		System.out.println("One Note   : "+ one);
	}
}