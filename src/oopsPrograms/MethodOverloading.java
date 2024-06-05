package oopsPrograms;

public class MethodOverloading 
{
	public void add(int a, int b)
	{
		System.out.println("Addition of 2 var - "+(a+b));
	}
	
	//1) by changing no.of parameters
	public void add(int a, int b, int c)
	{
		System.out.println("Addition of 3 var - "+(a+b+c));
	}
	
	//2)by changing type of parameters
	public void add(double a, int b)
	{
		System.out.println("Addition of 2 var of diff. type - "+(a+b));
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading m=new MethodOverloading();
		m.add(5, 8);
		m.add(6, 7, 2);
		m.add(10.5, 5);
	
		//1) can we achieve method overloading by changing type of 
		//    method ? --- NO
		//2) Is method overloading is present in "System.out.println()"? -- YES
		//3) can we overload constructor ? -- YES
		//4) why method overloading is called as "compile time polymorphism" ?
		
		
		
	}
}