public class SumEvenOddNumbers100To200{
	public static void main(String[] args){
		
		int sum = 0, cnt = 0, i;
		for(i = 100 ; i <= 200 ; i+=2 )
			sum += i ;	
			System.out.println("Sum Of Even Numbers between 100 to 200  : " + sum);

		
		for(i = 101 ; i <= 200 ; i+=2 )
			cnt += i;
			System.out.println("Sum Of Odd Numbers between 100 to 200   : " + cnt);
	}
}