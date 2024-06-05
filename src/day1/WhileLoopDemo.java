package day1;

import java.util.Scanner;

public class WhileLoopDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i<=3)
		{
			System.out.println("Enter the pin number - ");
			int pin=sc.nextInt();

			if(pin==1234)
			{
				System.out.println("Access granted");
				break;
			}
			else
			{
				System.out.println("Access denied");
				if(3-i==0)
					System.out.println("Exausted with attempts");
				else
					System.out.println(3-i+" attempts remaining");
			}
			i++;
		}














		//print 1-10
		//		int i=1;
		//		while (i<=10)
		//		{
		//			System.out.println(i);
		//			i++;
		//		}
		//		System.out.println("-------------------");
		//		//print 10-1 numbers
		//		//	i=10;
		//		i--;
		//		while (i>=1)
		//		{
		//			System.out.println(i);
		//			i--;
		//		}



	}
}