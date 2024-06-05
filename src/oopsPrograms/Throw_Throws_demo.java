package oopsPrograms;

import java.io.FileInputStream;

public class Throw_Throws_demo 
{
	public static void main(String[] args) throws Exception
	{		
//		 FileInputStream fi=new FileInputStream("c://abc.xls");
//		System.out.println("stmt 1");
//		Thread.sleep(2000);
//		System.out.println("stmt 2");	
//		Throw_Throws_demo t=new Throw_Throws_demo();
//		t.abc();
		int var_a=10;
		
		if(var_a<20)
		{
			throw new Exception("var a is less than 20");
		}
		else
			System.out.println("var a is greater than 20");
	}
	public void abc() throws InterruptedException 
	{
		Thread.sleep(1000);
	}
}