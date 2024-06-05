package day1;

import java.util.Scanner;

public class NestedIFStmt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter two numbers -");
		int a=sc.nextInt(),b=sc.nextInt();
		
		if(a!=b)//outer if
		{
			if(a>b)//inner if
				System.out.println(a+ " is greater than "+b);
			else
				System.out.println(b+ " is greater than "+a);
		}
		else
			System.out.println("both numbers are equal");
	}
}