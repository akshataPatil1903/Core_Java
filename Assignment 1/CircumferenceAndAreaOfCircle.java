import java.util.Scanner;

public class CircumferenceAndAreaOfCircle{
	public static void main(String[] args){
    
		float r;
		double area , circumference;
		Scanner sc = new Scanner(System.in);
    
		System.out.println("Enter Radius : ");
		r = sc.nextFloat();

		area = Math.PI * r * r;
		System.out.println("Area Of Circle is : "+ area);

		circumference = 2 * Math.PI * r;
		System.out.println("Circumference Of Circle is : "+circumference);
	}
}