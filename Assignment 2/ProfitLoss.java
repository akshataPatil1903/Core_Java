import java.util.Scanner;
public class ProfitLoss{
	public static void main(String[] args){
		
		double cp, sp;
		double profit , loss;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Cost Price : ");
		cp = sc.nextDouble();
		System.out.println("Enter a Selling Price : ");
		sp = sc.nextDouble();

		profit = sp - cp;
		loss = cp - sp;

		if(sp > cp)
			System.out.println("Profit  : "+profit);
		else 
			System.out.println("Loss : "+loss);
	}
}

