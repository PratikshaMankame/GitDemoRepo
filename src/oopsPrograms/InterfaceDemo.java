package oopsPrograms;

public interface InterfaceDemo 
{
	public void demo1();//abstract method
	
	int a=20;//static constant
}

class InterfaceCall implements InterfaceDemo
{
	@Override
	public void demo1() 
	{
		System.out.println("Demo 1 ");
	}
	public void demo2()
	{
		System.out.println("Demo 2 ");
	}
	public static void main(String[] args)
	{
		InterfaceCall i=new InterfaceCall();
		i.demo1();
		i.demo2();
		System.out.println("Static constant value - "+InterfaceCall.a);	
	}	
}
