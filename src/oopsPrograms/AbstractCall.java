package oopsPrograms;

public class AbstractCall  extends AbstractClass 
{
	public static void main(String[] args) 
	{
		AbstractCall ac=new AbstractCall();
		ac.demo1();
		ac.demo2();
		ac.demo3();

		System.out.println("\nAfter applying upcasting ---");
		//parent ref=new child();
		AbstractClass ab=new AbstractCall();
		ab.demo1();
		ab.demo2();
	}

	@Override
	public void demo1() 
	{
		System.out.println("Abstract method implemented in child class");
	}
	public void demo3()
	{
		System.out.println("Child specific method`");
	}
}