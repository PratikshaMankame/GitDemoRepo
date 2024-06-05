package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_blazedemo 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();

		wd.navigate().to("https://blazedemo.com/");
		Select sel;
		Thread.sleep(1000);
		//departure dropdown
		sel=new Select(wd.findElement(By.name("fromPort")));
		sel.selectByIndex(2);
		Thread.sleep(1000);
		//destination dropdown
		sel=new Select(wd.findElement(By.name("toPort")));
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		wd.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}
}