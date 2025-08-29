import java.util.Scanner;

public class MultiplicationTableOneToN{
	public static void main(String[] args){
	
		int a, b, i, j;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Multiplication Start Number : ");
		a = sc.nextInt();
		System.out.println("Enter Multiplication End Number : ");
		b = sc.nextInt();
		
		for( i=1 ; i<=10; i++){
			for( j=a ;j<=b; j++)
				System.out.print(j + " X " + i + " = "+( j * i ) + "\t");
				System.out.println();
		}
	}
}