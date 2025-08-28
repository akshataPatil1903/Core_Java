import java.util.Scanner;

public class CircleOperations{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int n;
		double r;

		System.out.println("1. Area of Cirlce\n2. Circumference of Circle\n3. Volume of Sphere\n Enter a Choice : ");
		n = sc.nextInt();	

		System.out.println("Enter Radius : ");
		r = sc.nextDouble();

		switch(n)
    		{
        		case 1 -> System.out.println("Area of Circle is : " + ( Math.PI * r * r ));        
			case 2 -> System.out.println("Circumference of Circle is : " + ( 2 * Math.PI * r  ));
	       		case 3 -> System.out.println("Volume of Sphere is : " + ( Math.PI * r * r * r * (4.0 /3.0 )));
                	default-> System.out.println("Invalid Choice ");
		}
	}
}
		