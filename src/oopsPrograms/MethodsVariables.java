package oopsPrograms;

public class MethodsVariables 
{
	public void add()//declaration of method
	{//method body 
		//implementation of method
		int a=5,b=5; // local variable
		System.out.println("Addition - "+(a+b));
	}

	public void subtract(int a,int b)//parameterized variables 
	{
		System.out.println("Subtraction - "+(a-b));
	}

	public int div() 
	{
		int a=10,b=2;
		return a/b;	
	}
	
	public int multiplication(int a,int b) 
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
//		MethodsVariables m;//declaration of object
//		m=new MethodsVariables();//initialization of object
		MethodsVariables m=new MethodsVariables();
		m.add();
		m.subtract(5, 1);
		int d=m.div();
		System.out.println("Division - "+d);
		System.out.println("Multiplication - "+m.multiplication(d, 2));
	}
}