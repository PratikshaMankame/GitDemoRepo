package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XapthLocatorDemo 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();

		wd.navigate().to("https://demo.frontaccounting.eu/");
		//xpath(String xpath)
		//i) absolute xpath
		//finding username field
		WebElement username=wd.findElement(By.xpath
				("/html/body/div/form/center[1]/table/tbody/tr[3]/td[2]/input"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("demouser");
		Thread.sleep(1000);
		
		//ii) relative xpath
		WebElement passwd=wd.findElement(By.xpath
				("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input"));
		passwd.clear();
		Thread.sleep(2000);
		passwd.sendKeys("password");
		
		//iii)dynamic xpath
		//a] //tagname[@atrribute=”value of attribute”]
		//click on login
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		
		//b] contains(@attribute ,'value')
		//click on 'Purchase' menu
		wd.findElement(By.xpath("//*[contains(@href,'application=AP')]")).click();
		
		//c] Using OR and AND 
		// click on Help menu
		// using OR 
		//wd.findElement(By.xpath("//*[@target=\"_blank\" or @href=\"data\"]")).click();
		// using AND 
		//wd.findElement(By.xpath("//*[@target=\"_blank\" and @href=\"http://frontaccounting.com/fawiki/index.php?n=Help.Purchases&ctxhelp=1&lang=C\"]")).click();

		//d] starts-with()
 		//click on Help menu
		//wd.findElement(By.xpath("//*[starts-with(@onclick,'javascript:openWindow')]")).click();
		
		//e] text()
 		//wd.findElement(By.xpath("//*[text()='Help']"));
		wd.findElement(By.xpath("//*[contains(text(),'Help')]")).click();
		
		
		
		
	}
}