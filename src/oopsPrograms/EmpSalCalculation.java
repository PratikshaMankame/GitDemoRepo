package oopsPrograms;

public class EmpSalCalculation 
{
	private int basic_sal;
	private void calculateGrossSalary(int bsal)
	{
		basic_sal=bsal;
		int gsal,da1=1000,da2=1500;
		if(basic_sal>=5000 && basic_sal<=10000)
		{
			gsal=basic_sal+da1;
			System.out.println("Gross salary - "+gsal);
		}
		else if(basic_sal>10000 && basic_sal<=15000)
		{
			gsal=basic_sal+da2;
			System.out.println("Gross salary - "+gsal);
		}
		else
			System.out.println("Invalid salary range");
	}

	protected void get_calculateGrossSalary(int bsal)
	{
		calculateGrossSalary(bsal);
	}
}
