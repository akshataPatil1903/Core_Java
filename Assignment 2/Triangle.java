import java.util.Scanner;

public class Triangle{
	public static void main(String[] args){

		int a , b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Sides : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a + b <= c)
			System.out.println("Triangle is not Valid ");
		else if(a + c <= b)
			System.out.println("Triangle is Not Valid");
		else if(a + c <= b)
			System.out.println("Triangle is Not Valid");
		else 
			System.out.println("Triangle is Valid");
	}
}