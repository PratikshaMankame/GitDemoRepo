package oopsPrograms;

public class ConstructorDemo
{
	static int b;
	public ConstructorDemo()//Non-parameterized constructor
	{
		System.out.println("Non-parameterized constructor");
		System.out.println("----------------------------------");
	}

	public ConstructorDemo(int a)//parameterized constructor
	{
		System.out.println("\n----------------------------------");
		System.out.println("Parameterized constructor "+a);
		b=a;
		System.out.println("Value of b var - "+b);
		demo1();
		System.out.println("----------------------------------");
	}

	public static void demo1()
	{
		System.out.println("Value of b var in demo method- "+b);
	}

	public static void demo2() 
	{
		demo1();	
	}
	
	public static void main(String[] args)
	{
		ConstructorDemo c=new ConstructorDemo();
		ConstructorDemo c1=new ConstructorDemo(5);
		//c1.demo1();
		ConstructorDemo.demo2();
	}
}