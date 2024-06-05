package oopsPrograms;

public class ReverseObject //parent class 
{
	public int reverseNumber(int number)
	{
		int rev=0;
		while (number!=0)
		{
			rev=rev*10;
			rev=rev+number%10;
			number=number/10;
		}
		return rev;
	}
	public String reverseString(String str)
	{
		String revString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			revString+=str.charAt(i);
		}
		return revString;
	}
}
