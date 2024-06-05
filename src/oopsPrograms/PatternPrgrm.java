package oopsPrograms;

public class PatternPrgrm 
{
	public static void main(String[] args)
	{
		System.out.println("printing 5*4 rectangular pattern -");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("- ");
			}
			System.out.println();
		}
	}
}