package oopsPrograms;

import java.util.Scanner;

class ShapeDemo//parent
{
	public void area(int value)
	{
		System.out.println("calculate area of shapes");
	}
}//end of parent class

class Triangle extends ShapeDemo//child
{
	public void area(int length)
	{
		System.out.println("Area of traingle - "+((length*length)/2));
	}
}//end of child class

class Circle extends ShapeDemo//child
{
	public void area(int radius)
	{
		System.out.println("Area of Circle - "+(3.14*radius*radius));
	}
}//end of child class
public class CalculatingAreaOfShapes 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter radius - ");
		int r=sc.nextInt();
		c.area(r);
		System.out.println("---------------------------------");
		
		Triangle t=new Triangle();
		System.out.println("Enter length - ");
		int l=sc.nextInt();
		t.area(l);
	}
}