package day1;

import java.util.Scanner;

public class If_else_if_stmt 
{
	public static void main(String[] args) 
	{
		//WAP to check entered number is single / two /three digit
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number -");
		int n=sc.nextInt();
		
		if(n>=-9 && n<=9)
//		if((n>=0 && n<=9) || (n>=-9 && n<0) )
			System.out.println("Single digit");
		
		else if(n>=-99 && n<=99)
			System.out.println("Two digit");
		
		else if(n>=-999 && n<=999)
			System.out.println("Three digit");
		
		else
			System.out.println("Invalid input");
		
		
		
		
		
		
		
//		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
//		
//		if(a>b && a>c)
//		{
//			System.out.println(a+ "a is greater");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b+" is greater");
//		}
//		else if(c>a && c>b)
//		{
//			System.out.println(c+" is greater");
//		}
//		else if(a==b && a!=c)
//		{
//			System.out.println("a and b are equal");
//		}
//		else if(a==c && a!=b)
//		{
//			System.out.println("a and c are equal");
//		}
//		else if(b==c && a!=b)
//		{
//			System.out.println("b and c are equal");
//		}
//		else
//			System.out.println("all numbers are equal");
		
		
	
		
		
		
	}
}