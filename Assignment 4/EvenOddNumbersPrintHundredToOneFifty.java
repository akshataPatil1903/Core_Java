public class EvenOddNumbersPrintHundredToOneFifty{
	public static void main(String[] args){
		
		int i;

		System.out.println("Even Numbers between 100 to 150 : ");
		for(i = 100 ; i <= 150 ; i+=2 ){
			System.out.println(i);
		}

		System.out.println("Odd Numbers between 100 to 150 : ");
		for(i = 101 ; i <= 150 ; i+=2 ){
			System.out.println(i);
		}

	}
}