import java.util.Scanner;

public class PerfectNumberOneToN{
	public static void main(String[] args){

		int n, i, j;
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter Number : ");
		n = sc.nextInt();

		System.out.println("Prime Numbers from 1 to "+n+" are: ");
    	
		for( i=1 ; i<=n ; i++){
			int num = 0;
			int cnt = i;
				for( j=1; j<=cnt/2; j++){
					if(cnt % j == 0){
						num += j;
					}
				}
			if(num == cnt)
				System.out.println(cnt+" ");
		}
	}
}