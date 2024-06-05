package oopsPrograms;

import java.util.Scanner;

public class CombineTwoArrays 
{
	public static void main(String[] args) 
	{
		int arr1[]= {10,20,30};
		int arr2[]= {1,5,20};

		int len3=arr1.length+arr2.length;
		int arr3[]=new int[len3];

		//inserting elets from 1st array
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		//inserting elets from 2nd array
		for(int i=0;i<arr2.length;i++)
		{
			arr3[arr1.length+i]=arr2[i];
		}

		System.out.println("Displaying array elets after merging - ");
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}
}