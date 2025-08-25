import java.util.Scanner;

public class MarksAverage{
	public static void main(String[] args){

		float m1, m2, m3;
		float total, avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks ");
		System.out.println("Marks 1: ");
		m1 = sc.nextFloat();
		System.out.println("Marks 2: ");
		m2 = sc.nextFloat();
		System.out.println("Marks 3: ");
		m3 = sc.nextFloat();

		total = m1 + m2 + m3;
		avg = total / 3;

		if (avg <= 100 && avg > 80) 
			System.out.println("Class I");
		else if (avg <= 80 && avg > 60) 
			System.out.println("Class II");
		else if (avg <= 60 && avg > 40) 
			System.out.println("Pass Class");
		else 
			System.out.println("Fail");
	}
}
