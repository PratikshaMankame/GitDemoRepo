package day1;

public class ArrayDemo 
{
	public static void main(String[] args) 
	{
		//1) datatype arrayname[]={elements of an array separated by comma };
		int arr[]= {5,23,78,45};

		int len=arr.length;
		System.out.println("Length - "+len);

		//2) datatype arrayname[]=new datatype[size]; -- defining array
		//		arrayname[0]=value;
		//		.
		//		.
		//		.
		//		arrayname[length-1]=value;

		String str[]=new String[3];
		str[0]="ascv";
		str[1]="hjh";
		str[2]="hhgh";

		System.out.println("1st element - "+str[0]);
		System.out.println("Last element - "+str[str.length-1]);

		//print all elements on console
		System.out.println("Printing all elements on console");
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("\nPrinting all elements in reverse order");
		//print all elements in reverse order
		for(int i=str.length-1;i>=0;i--)
			System.out.println(str[i]);

		








	}
}