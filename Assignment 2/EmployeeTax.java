import java.util.Scanner;

public class EmployeeTax{
	public static void main(String[] args){

		int basicSalary;
		float tax;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Basic Salary: ");
		basicSalary = sc.nextInt();

		if (basicSalary < 150000) 
			System.out.println("No Income tax");
		else if (basicSalary > 150000 && basicSalary < 300000){
			tax = (basicSalary * 20) / 100.0f; 
			System.out.println("Income tax is " + tax);
		}	
		else if (basicSalary > 300000){
			tax = (basicSalary * 30) / 100.0f;
			System.out.println("Income tax is " + tax);
		}
	}
}
