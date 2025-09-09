import java.util.Scanner;

public class LinearSearch{
	public static void main(String[] args){
		
		int n,i, key, flag = 0, pos = -1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter " + n + " Numbers : ");
		for ( i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		System.out.print("Enter a Search number: ");
		key = sc.nextInt();

		for ( i = 0; i < n; i++){
			if (a[i] == key){
				flag = 1;
				pos = i;
				break;
			}
		}

		if (flag == 1)
			System.out.println("Position of search number is : " + pos);
		else
		System.out.println("-1");
	}
}
