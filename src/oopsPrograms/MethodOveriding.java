package oopsPrograms;

class Vehicle//parent
{
	public void run()
	{
		System.out.println("All vehicles should run");
	}
}

class Bike extends Vehicle //child
{
	public void run()
	{
		System.out.println("Bike is running");
	}
}
public class MethodOveriding 
{
	public static void main(String[] args) 
	{
		Bike b=new Bike();
		b.run();
	}
}