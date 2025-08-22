import java.util.Scanner;

public class VelocityAndDistance{
	public static void main(String[] args){

		float u, a, t;
		double v , s;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Velocity     : ");
		u = sc.nextFloat();
		System.out.println("Enter a Acceleration : ");
		a = sc.nextFloat();
		System.out.println("Enter a time         : ");
		t = sc.nextFloat();

		v = u + a * t;
		s = (u * t) +(0.5* a * t * t);

		System.out.println("Velocity is  : "+v);
		System.out.println("Distance is  : "+s);
	}
}