package day1;

import java.util.Scanner;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String - ");
		String str=sc.nextLine().toLowerCase();//ice
		int cC=0,v=0,oc=0,n=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')//vowels
			{
				v++;
			}
			else if(c>='b' && c<='z')//consonants
			{
				cC++;
			}
			else if(Character.isDigit(c))//integers
			{
				n++;
			}
			else//other characters
			{
				oc++;
			}				
		}
		System.out.println("No. of vowels - "+v);
		System.out.println("No. of consonants - "+cC);	
		System.out.println("No. of integers - "+n);
		System.out.println("No. of other characters - "+oc);
	}
	
	
	
	//reverse entered the string
	//java  avaj
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}