package oopsPrograms;

public class EncapDemo 
{
	public String e_name="Nirav";
	protected String e_role="QA-Automation";
	private int e_sal;
	String e_id="A2125";

	protected void getSal()//getter
	{
		System.out.println("Emp current salary - "+e_sal);
	}
	
	protected void setSal()//setter
	{
		System.out.println("Updated salary - "+(e_sal+2000));
	}
	public static void main(String[] args) 
	{
		EncapDemo e=new EncapDemo();
		System.out.println("Emp name - "+e.e_name);
		System.out.println("Emp role - "+e.e_role);
		System.out.println("Emp salary - "+e.e_sal);
		System.out.println("Emp id - "+e.e_id);
		e.getSal();
		e.setSal();
	}
}