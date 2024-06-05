package day1;

import java.util.Scanner;

public class IfStmt_prgrm 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number -");
		int n=sc.nextInt();

		if(n!=0)//outer if
		{
			if (n>0) //inner if
			{//condition == true
				System.out.println(n+" is +ve number");
			}
			else 
			{//condition == false
				System.out.println(n+" is -ve number");
			}
		}
		else
			System.out.println(n+" is neutral number");
		}
	}