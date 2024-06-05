package oopsPrograms;

import java.util.Scanner;

public class OddNumberMethod 
{
	public void odd_exception(int n) throws Exception
	{
		if(!(n%2==0))
		{
			throw new Exception("Its odd number");
		}
		else
			System.out.println("Its even no.");
	}
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number - ");
		int num=sc.nextInt();
		OddNumberMethod o=new OddNumberMethod();
		o.odd_exception(num);
		
	}

}

