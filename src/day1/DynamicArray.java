package day1;

import java.util.Scanner;

public class DynamicArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array - ");
		int len=sc.nextInt();
		
		int []arr=new int[len];//defining array
		
		System.out.println("Insert array elements -");
		for (int i = 0; i < arr.length; i++)//
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Displaying array elements -");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}