package oopsPrograms;

class Parent//parent/super/base class
{
	public void demo1() 
	{
		System.out.println("Inheritance demo");
	}
	public void demo() 
	{
		System.out.println("Inheritance demo");
	}
}//end of parent class

class SingleInh extends Parent//child / derived /sub-class
{
	public void demo2() 
	{
		System.out.println("Single Inheritance");
	}
}//end of child class


class MultilevelInh extends SingleInh
{
	public void demo3() 
	{
		System.out.println("Multilevel Inheritance");
	}
}//end of sub-child class

class HierarchicalInh extends Parent
{
	public void demo4() 
	{
		System.out.println("Hierarchical Inheritance");
	}
}
public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
//		SingleInh s=new SingleInh();
//		s.demo1();//parent class method
//		s.demo2();//child class method
		
		MultilevelInh m=new MultilevelInh();
		m.demo1();//parent class method
		m.demo2();//child class method
		m.demo3();//sub-child class method
		
		System.out.println("-------------------------------");
		
		HierarchicalInh h=new HierarchicalInh();
		h.demo1();//parent class method
		h.demo4();//child class method
		
	}
}