package seleniumScripts;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrwsrTesting 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1-ChromeBrwse\n2-FireFox");
		System.out.println("Select Browser - ");
		int ch=sc.nextInt();
		WebDriver wd=null;
		switch (ch)
		{
		case 1:
			wd=new ChromeDriver();
			break;
		case 2:
			wd=new FirefoxDriver();
			break;
		}
		Thread.sleep(2000);
		try
		{
			wd.manage().window().maximize();
			wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("Title - "+ wd.getTitle());

			Thread.sleep(2000);
			wd.close();
		}
		catch (Exception e) 
		{
			System.err.println("Invalid choice of browser.");
		}
		sc.close();
	}
}