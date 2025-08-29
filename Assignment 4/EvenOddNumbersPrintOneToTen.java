public class EvenOddNumbersPrintOneToTen{
	public static void main(String[] args){
		
		int i;

		System.out.println("Even Numbers between 1 to 10 : ");
		for(i = 2 ; i <= 10 ; i+=2 ){
			System.out.println(i);
		}

		System.out.println("Odd Numbers between 1 to 10 : ");
		for(i = 1 ; i <= 10 ; i+=2 ){
			System.out.println(i);
		}
	}
}