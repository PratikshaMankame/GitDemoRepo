package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.navigate().to("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(2000);
		//1) id(String id)
		//enter usename
		WebElement username= wd.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
		username.clear();
				
		//2) name(String name)
		//enter password
//		wd.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//3) className(String class)
		//click on login button
//		wd.findElement(By.className("btn_action")).click();
//		
//		//4) linkText(String hypertext)
////		wd.findElement(By.linkText("Sauce Labs Backpack")).click();
//		
//		//5) partialLinkText(String partial hypertext)
//		//click on "Sauce Labs Backpack" text 
//		wd.findElement(By.partialLinkText("abs Backpack")).click();
//		
//		Thread.sleep(1000);
//		//clicking on Back button
//		wd.findElement(By.className("inventory_details_back_button")).click();
//		Thread.sleep(1000);
//		
//		//6) cssSelector(String value)
//		//i] tagname.className
//		//clicking on menu icon
//		wd.findElement(By.cssSelector("div.bm-burger-button")).click();
//		
//		Thread.sleep(1000);
//		//ii] tagname#id 
//		//clicking on Logout
//		wd.findElement(By.cssSelector("a#logout_sidebar_link")).click();
//		
//		Thread.sleep(1000);
//		//iii] tagname[attribute=value]
//		//clicking on Login button
//		wd.findElement(By.cssSelector("input[type=submit]")).click();
			
	}
}