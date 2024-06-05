package day1;

import java.util.Scanner;

public class DuplicateArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array - ");
		int len=sc.nextInt();
		
		int []arr1=new int[len];//creating 1st array
		
		System.out.println("Insert elements in 1st array -");
		for (int i = 0; i < arr1.length; i++)//
		{
			arr1[i]=sc.nextInt();
		}
		
		//creating 2nd array 
		int []arr2=new int[arr1.length];
		//copying elements of 1st array into 2nd array
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Displaying elements of 2nd array -");
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
	}
}