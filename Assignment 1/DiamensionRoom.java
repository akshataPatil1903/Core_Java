import java.util.Scanner;

public class DiamensionRoom {
	public static void main(String[] args) {

		double roomLength, roomHeight, roomBreadth, wallArea, roofArea, paintableArea;
		double doorLength, doorBreadth, doorArea;
		double windowLength, windowBreadth, windowArea;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Length, Breadth and Height of Room : ");
		roomLength = sc.nextDouble();
		roomBreadth = sc.nextDouble();
		roomHeight = sc.nextDouble();

		wallArea = 2 * (roomBreadth + roomLength) * roomHeight;

		System.out.println("Enter Length and Width of Window : ");
		windowLength = sc.nextDouble();
		windowBreadth = sc.nextDouble();

		windowArea = (windowLength * windowBreadth) * 2;

		System.out.println("Enter Length and Width of Door : ");
		doorLength = sc.nextDouble();
		doorBreadth = sc.nextDouble();
		doorArea = doorLength * doorBreadth;

		paintableArea = wallArea - (doorArea + windowArea);
		roofArea = roomBreadth * roomLength;

		System.out.println("Area of painted walls is : " + paintableArea + " sq.ms");
		System.out.println("Area of whitewashed roof is : " + roofArea + " sq.ms");
	}
}
