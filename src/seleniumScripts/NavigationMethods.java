package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//automation practice pages
//opencart
public class NavigationMethods 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		//navigate.to(String url)
		wd.navigate().to("https://www.saucedemo.com/v1/index.html");
		
		Thread.sleep(2000);
		//navigate().back()
		wd.navigate().back();
		
		Thread.sleep(2000);
		//navigate().forward()
		wd.navigate().forward();
		
		Thread.sleep(2000);
		//navigate().refresh() 
		wd.navigate().refresh();
		
		Thread.sleep(5000);
		wd.quit();
	}
}