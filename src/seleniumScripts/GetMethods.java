package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new FirefoxDriver();
		//WebDriver w=new EdgeDriver();
		wd.manage().window().maximize();
		
		//get(String url)
		wd.get("https://www.saucedemo.com/v1/index.html");
		
		//getTitle()
		System.out.println("Page title - "+wd.getTitle());
		
		//getCurrentUrl()
		System.out.println("Page url - "+wd.getCurrentUrl());
		
		//getPageSource()
		System.out.println("Page source - \n "+wd.getPageSource());
		
		//getText
		System.out.println("Updated code1");
		System.out.println("Updated code2");
		System.out.println("Updated code3");
		
		System.out.println("Updated code4");
		System.out.println("Updated code5");
		System.out.println("Updated code6");
		Thread.sleep(5000);
		wd.close();
	}
}