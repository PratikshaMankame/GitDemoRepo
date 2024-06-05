package day1;

import java.util.Scanner;

public class ForLoopDemo 
{
	public static void main(String[] args) 
	{
		//		for(int i=1;i<=5;i++)
		//		{
		//			System.out.println("HI");
		//		}
		//		
		////	print 1-10 numbers
		//		for(int i=1;i<=10;i++)
		//		{
		//			System.out.println(i);
		//		}
		////		print 10-1 numbers	
		//		for(int i=10;i>=1;i--)
		//		{
		//			System.out.println(i);
		//		}

		//		Wap to print table of entered number
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("Enter the number - ");
		//		int n=sc.nextInt();
		//
		//		for(int i=1;i<=10;i++)
		//		{
		//			System.out.println(n*i);
		//		}

		//print table of 1-10 numbers
		//		for(int i=1;i<=10;i++)//numbers
		//		{
		//			for(int j=1;j<=10;j++)
		//			{
		//				System.out.print(i*j+"\t");
		//			}
		//			System.out.println();
		//		}
//------------------------------------------------------
		//WAP to find out even numbers between 1-100
//		System.out.println("List of even no.s between 1-100 - ");
//		for(int i=1;i<=100;i++)//numbers
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//		}

		for(int i=1;i<=5;i++)//no. of rows
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
 
	}
}