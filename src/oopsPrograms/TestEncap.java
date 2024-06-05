package oopsPrograms;

public class TestEncap
{
	public static void main(String[] args)
	{
		EncapDemo e=new EncapDemo();
		System.out.println("Emp name - "+e.e_name);
		System.out.println("Emp role - "+e.e_role);
		System.out.println("Emp id - "+e.e_id);
		
		System.out.println("-------------------");
		e.getSal();
	}
}