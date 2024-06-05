package day1;

public class ForEachDemo 
{
	public static void main(String[] args) 
	{
//		int arr[]= {12,23,34,45};
//		
//		System.out.println("Printing all elements of array - ");
//		for (int i : arr)
//		{
//			System.out.println(i);
//		}
//		
//		String str[]= {"abc123", "hij564"};
//		for (String str1: str)
//		{
//			System.out.println(str1);
//		}
		
//-----------------------------------------		
//converting character array into string		
		char ch[]= {'a','b','c'};
		String newStr=new String(ch);
		System.out.println(newStr);
//---------------------------------------------------		
		
		
		String s= "123456acbs";
		for (char c : s.toCharArray()) 
		{
			System.out.println(c);
		}
		
		
	}
}