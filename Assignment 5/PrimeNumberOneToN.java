import java.util.Scanner;

public class PrimeNumberOneToN{
	public static void main(String[] args){

		int n, i, j;
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter a Number : ");
		n = sc.nextInt();
		
		System.out.println("Prime Numbers 1 to " + n + " : ");
    	
		for( i=2 ; i<=n ; i++){
			int cnt=0;
				for( j=2; j<=Math.sqrt(i); j++){
					if(i % j == 0){
					cnt++;
					break;
					}
				}
        		if(cnt == 0)
				System.out.println(i+" ");
        	}
	}
}