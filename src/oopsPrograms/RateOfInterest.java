package oopsPrograms;

interface RBI
{
	public int getROI();
}

class SBI implements RBI
{
	@Override
	public int getROI()
	{
		return 7;
	}
}
class CBI implements RBI
{
	@Override
	public int getROI()
	{
		return 8;
	}
}
public class RateOfInterest
{
	public static void main(String[] args)
	{
		SBI s=new SBI();
		CBI c=new CBI();

		System.out.println("SBI roi - "+s.getROI()+"%");
		System.out.println("CBI roi - "+c.getROI()+"%");




	}
}
