 import java.util.Scanner;

 public class CuboidSurfaceAreaAndVolume{
 	public static void main(String[] args){
       
 		float l, h, b;
 		float surfaceArea , volume;

 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a Length  : ");
 		l = sc.nextFloat();
 		System.out.println("Enter a Breadth : ");
 		b = sc.nextFloat();
 		System.out.println("Enter a Height  : ");
 		h = sc.nextFloat();

 		surfaceArea = 2 * (l*b + l*h + b*h);
 		volume = l * b * h;

 		System.out.println("Cuboid Surface Area is : "+surfaceArea);
 		System.out.println("Cuboid Volume is       : "+volume);
	}
 }