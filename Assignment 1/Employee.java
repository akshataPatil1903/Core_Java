import java.util.Scanner;

public class Employee{
	public static void main(String[] args){

		float hra = 10;
		float da  = 30;
		float tax = 5;
		int eid;
		float basicSalary, totalSalary;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee ID : ");
		eid = sc.nextInt();
		System.out.println("Enter Employee Basic Salary : ");
		basicSalary = sc.nextFloat();

		totalSalary = basicSalary + (basicSalary * (hra + da - tax)/100);
		System.out.println("Home Salary is : "+totalSalary);
	}
}