public class SumEvenOddNumbersOneToTen{
	public static void main(String[] args){

		int i, sum =0, cnt = 0;
		
		for( i = 2 ; i <= 10 ; i+=2 )
			sum += i ;	
			System.out.println("Sum Of Even Numbers between 1 to 10  : " + sum);

		for( i = 1 ; i <= 10 ; i+=2 )
			cnt += i;
			System.out.println("Sum Of Odd Numbers between 1 to 10   : " + cnt);
	}
}