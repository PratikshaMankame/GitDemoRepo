package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Swaglabs 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.navigate().to("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(2000);
		
		//enter usename
		WebElement username= wd.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(1000);
						
		//enter password
		wd.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//click on login button
		wd.findElement(By.className("btn_action")).click();
		Thread.sleep(2000);

		//handling "product_sort_container" dropdown
		Select sel=new Select(wd.findElement(By.className("product_sort_container")));
		//1) by index
//		sel.selectByIndex(2);
//		Thread.sleep(2000);
//		
//		//2) by value
//		sel.selectByValue("za");
//		Thread.sleep(2000);
//		
//		//3) by visible text
//		sel.selectByVisibleText("Price (high to low)");
//		
		
		List<WebElement> dropDown_options= sel.getOptions();
		
//		System.out.println(dropDown_options.size());
		for (WebElement opt : dropDown_options) 
		{
			Thread.sleep(1000);
			opt.click();
		}
		
		System.out.println(sel.isMultiple());
		
//		Thread.sleep(5000);
//		wd.quit();		
	}

}
