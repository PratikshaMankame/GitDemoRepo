package oopsPrograms;

interface MI1//parent-1
{
	public void implementDemo();
	public void demo();
}
interface MI2 extends MI1//parent-2
{
	public void implementDemo();
}
public class MultiInh implements MI2 //child class
{
	public static void main(String[] args) 
	{
		MultiInh m=new MultiInh();
		m.implementDemo();
		m.demo();
	}
	@Override
	public void implementDemo() 
	{
		System.out.println("child class implementation");
	}
	@Override
	public void demo() 
	{
		System.out.println("inaterface extends interface");
	}
}