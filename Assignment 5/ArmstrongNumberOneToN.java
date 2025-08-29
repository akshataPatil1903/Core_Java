import java.util.Scanner;

public class ArmstrongNumberOneToN {
	public static void main(String[] args) {
        	
		int n,i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();

		System.out.println("Armstrong Numbers between 1 to " + n + " :");
		for (i = 1; i <= n; i++){
			int cnt = 0, sum = 0, rem,temp = i;

			while (temp > 0){
				cnt++;
				temp /= 10;
			}

			temp = i;
			while (temp > 0){
			rem = temp % 10;
			sum += Math.pow(rem, cnt);
			temp /= 10;
			}

			if (sum == i){
			System.out.print(i + " ");
			}
		}
	}
}
