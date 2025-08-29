import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String[] args){
		
		int n, temp,rem,sum = 0;
		double arm = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		temp = n;
				
		while(n>0){
			sum++;
			n/=10;
		}
		n = temp;
		while(n>0){
			rem = n % 10;
			arm += Math.pow(rem,sum);	
			n /= 10;
		}
		if(arm == temp)
			System.out.println("Armstrong Number is " + temp);
		else
			System.out.println(" Not Armstrong Number is " + temp);
	}
}