package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns_ChkBoxs 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		//radio button
//		wd.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
		
//		List<WebElement> radioBtns= wd.findElements(By.name("radioButton"));
//		System.out.println(radioBtns.size());
//		
//		for (WebElement rdo : radioBtns) 
//		{
//			Thread.sleep(1000);
//			rdo.click();
//		}
		
		//checkboxes
		//div[@id="checkbox-example"]//input
		List<WebElement> chkBoxes=
				wd.findElements(By.xpath("//input[starts-with(@name,'checkBoxOption')]"));
		System.out.println(chkBoxes.size());
		
		for (WebElement chk : chkBoxes)
		{
			Thread.sleep(1000);
			chk.click();
		}
		
		
		
	}
}