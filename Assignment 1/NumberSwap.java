import java.util.Scanner;

public class NumberSwap{
	public static void main(String[] args){
		
		int a , b, c;
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
      
		System.out.println("Before Swapping :  ");
		System.out.println("A :  "+a);
		System.out.println("B :  "+b);

		c = a;
		a = b;
		b = c;

		System.out.println("After Swapping :  ");
		System.out.println("A :  "+a);
		System.out.println("B :  "+b);
	}
}