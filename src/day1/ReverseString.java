package day1;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String - ");
		String str=sc.nextLine(),rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
//			rev=rev+str.charAt(i);
			rev+=str.charAt(i);
		}
		System.out.println("Reverse of entered  string - "+rev);
		//Check entered string is palindrome or not.
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");		
	}
}