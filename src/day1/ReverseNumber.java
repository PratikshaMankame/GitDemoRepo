package day1;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number - ");
		int n=sc.nextInt(),rev=0,a=n;

		while (n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println("Reverse of entered number - "+rev);
		
		if(rev==a)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		
		
		
		
	}
}