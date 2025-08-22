import java.util.Scanner;

public class ArithmeticAndHarmonicNumber{
	public static void main(String[] args){
      
		int a, b;
		float am, hm;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();

		am = (a + b) / 2;
		hm = a * b / ( a + b);

		System.out.println("Arithmetic Number is : "+am);
		System.out.println("harmonic Number is   : "+hm);
	}
}