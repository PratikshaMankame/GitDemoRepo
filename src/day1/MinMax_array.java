package day1;

import java.util.Scanner;

public class MinMax_array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array - ");
		int len=sc.nextInt();

		int []arr=new int[len];

		System.out.println("Insert elements in array -");
		for (int i = 0; i < arr.length; i++)//
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0],max=arr[0];
		for (int i = 0; i < arr.length; i++)//
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			else if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("minimum value - "+min);
		System.out.println("maximum value - "+max);
	}
}
