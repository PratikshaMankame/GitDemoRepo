package oopsPrograms;

import java.util.Scanner;

public class TryCatchDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two variables -");
		int a=sc.nextInt(), b=sc.nextInt();

		int arr[]=new int[2];
		try
		{
			int c=a/b;
			arr[7]=c;
		}
		catch(ArithmeticException o)
		{
			System.err.println("ArithmeticException");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("ArrayIndexOutOfBoundsException");
		}
		catch (Exception e) 
		{
			System.err.println(e.getMessage());
		}
		finally 
		{
			System.out.println("Finally block executed");
			sc.close();
		}
		
		
		
	}
}