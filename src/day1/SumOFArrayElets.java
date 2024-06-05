package day1;

import java.util.Scanner;

public class SumOFArrayElets 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array - ");
		int len=sc.nextInt(),sum=0;

		int []arr=new int[len];//defining array

		System.out.println("Insert array elements -");
		for (int i = 0; i < arr.length; i++)//
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("Sum of array elements - "+sum);
		System.out.println("Average - "+sum/len);
	}
}
