package day1;

import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings - ");

		String str1=sc.nextLine().toLowerCase(),str2=sc.nextLine().toLowerCase();
		
//		if(str1.equals(str2))
//		if(str1.equalsIgnoreCase(str2))
//			System.out.println("Both strings are equal");
//		else
//			System.out.println("Both strings not are equal");
		
		if(str1.contains(str2))
			System.out.println("str1 contains str2");
		else
			System.out.println("str1 doesn't contains str2");
		
		System.out.println(str1.concat(str2));

		String s[]={"scgafasfshf","yur"};
	}
}