import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {

		int x, y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x axis: ");
		x = sc.nextInt();
		System.out.println("Enter y axis: ");
		y = sc.nextInt();

		if (x == 0 && y == 0) 
			System.out.println("The point lies at the origin");
		else if (x > 0 && y > 0) 
			System.out.println("This is I quadrant");
		else if (x < 0 && y > 0) 
			System.out.println("This is II quadrant");
		else if (x < 0 && y < 0) 
			System.out.println("This is III quadrant");
		else if (x > 0 && y < 0) 
			System.out.println("This is IV quadrant");
	}
}
