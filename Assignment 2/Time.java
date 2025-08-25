import java.util.Scanner;

public class Time{
	public static void main(String[] args){

		int h , m, s;	

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Hour : ");
		h = sc.nextInt();
		System.out.println("Enter Minute : ");
		m = sc.nextInt();
		System.out.println("Enter Second : ");
		s = sc.nextInt();

		if(h > 0 && h < 24){        
			if(m > 0 && m < 60){
				if(s > 0 && s < 60){
					System.out.println("Time is Valid");
				}
				else
					System.out.println("Seconds are Invalid ");
				}
			else
				System.out.println("Minutes are Invalid ");
			}
		else
				System.out.println("Hours are Invalid");		
	}
}