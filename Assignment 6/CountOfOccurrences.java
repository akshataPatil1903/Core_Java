import java.util.Scanner;

public class CountOfOccurrences{
	public static void main(String[] args) {
		
		int n, num, result;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter " + n + " Numbers :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter a Count of Number: ");
		num = sc.nextInt();

		result = countOfOccurrences(arr, num);
		System.out.println(num + " number of occurrences is " + result + " Times ");
	}

	public static int countOfOccurrences(int[] arr, int num) {
		int count = 0;
		for (int value : arr) {
			if (value == num) {
				count++;
			}
		}
		return count;
	}
}
