package oopsPrograms;

import java.util.Scanner;

public class CheckPalindrome extends ReverseObject 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		CheckPalindrome c=new CheckPalindrome();
		System.out.println("Select input - \n1-Number\n2-String -");
		int ch=sc.nextInt();

		switch (ch) 
		{
		case 1:
			System.out.println("Enter number - ");
			int n=sc.nextInt();
			int rev=c.reverseNumber(n);
			if(rev==n)
				System.out.println("Entered no. is palindrome");
			else
				System.out.println("Entered no. is not palindrome");
			break;

		case 2:
			System.out.println("Enter string - ");
			sc.nextLine();
			String str=sc.nextLine();
			String revStr=c.reverseString(str);
			if(str.equals(revStr))
				System.out.println("Entered string is palindrome");
			else
				System.out.println("Entered string is not palindrome");
			break;

		default:
			System.out.println("Invalid input");
			break;
		}
	}
}