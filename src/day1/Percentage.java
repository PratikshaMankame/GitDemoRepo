package day1;

import java.util.Scanner;

public class Percentage 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects -");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		
		double oMarks=a+b+c;
		System.out.println("Obtained marks - "+oMarks);
		
		System.out.println("Percentage - "+((oMarks/300)*100)+'%');
		
		
	}
}