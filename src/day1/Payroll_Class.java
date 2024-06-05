package day1;

import java.util.Scanner;
import oopsPrograms.EmpSalCalculation;

public class Payroll_Class extends EmpSalCalculation
{
	public static void main(String[] args) 
	{
		Payroll_Class p=new Payroll_Class();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary - ");
		int sal=sc.nextInt();
		
		p.get_calculateGrossSalary(sal);		
	}
}