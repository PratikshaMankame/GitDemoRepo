package day1;

public class SwapNumbers 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping a -"+a);
		System.out.println("After swapping b -"+b);
	}
}