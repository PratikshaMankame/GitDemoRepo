package day1;

import java.util.Scanner;

public class ArithmeticOperations 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value for variable a -");
		int a=sc.nextInt();//int a=sc.nextInt(),b=sc.nextInt();
		System.out.println("Enter value for variable b -");
		int b=sc.nextInt();
		
		System.out.println("Addition - "+(a+b));
		System.out.println("Subtraction - "+(a-b));
		System.out.println("Division - "+(a/b));
		System.out.println("Multiplication - "+(a*b));
		System.out.println("Modulus - "+(a%b));
		System.out.println("Increment - "+(++a));
		System.out.println("Decrement - "+(--b));
		
		//calculate area of circle --
		
		
		//wap to take marks of 3 sub. from user
		//consider it is out of 100
		//Calculate obtained marks as well as calculate percentage
		sc.close();
		
		
		
	}
}