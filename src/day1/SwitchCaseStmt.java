package day1;

import java.util.Scanner;

public class SwitchCaseStmt 
{
	public static void main(String[] args) 
	{
		//WAP to display student record of provided roll no.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers - ");
		int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("1-Add\n2-Subtract\n3-Multi\n4-Div");
		System.out.println("Select operation - ");
		int choice=sc.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("Addition - "+(a+b));
			break;
		case 2:
			System.out.println("Subtraction - "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication - "+(a*b));
			break;
		case 4:
			System.out.println("Division - "+(a/b));
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}
//		System.out.println("Select roll number from 1-10 ");
//		System.out.println("Enter the roll number -");
//		int choice=sc.nextInt();
//		
//		switch (choice)
//		{
//		case 1:
//			System.out.println("Name - Amit \nCont.- 1234587");
//			break;
//		case 2:
//			System.out.println("Name - Bhairavi \nCont.- 895547");
//			break;
//			
//		default:
//			System.out.println("Invalid roll number");
//			break;
//		}
	}
}