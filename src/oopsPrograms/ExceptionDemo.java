package oopsPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two variables -");
		try
		{
			int a=sc.nextInt(), b=sc.nextInt();

			System.out.println("Addition - "+(a+b));
			System.out.println("Subtraction - "+(a-b));
			try
			{
				System.out.println("Division - "+(a/b));
			}
			catch (Exception e) 
			{
				System.err.println(e.getMessage());
			}
			System.out.println("Multiplication - "+(a*b));
		}
		catch (InputMismatchException e)
		{
			System.err.println("Input mismatch");
		}
	}
}