package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods 
{
	public static void main(String[] args) 
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();

		wd.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		wd.findElement(By.xpath("//input[@value=\"radio1\"]")).click();

		//radio1
		//		boolean st=wd.findElement(By.xpath("//input[@value=\"radio1\"]")).isSelected();
		//		System.out.println("Radio1 is selected ? -"+st);

		//2) isDisplayed()
		//click on hid button
		wd.findElement(By.id("hide-textbox")).click();

		WebElement inputBox=wd.findElement(By.id("displayed-text"));
		if(inputBox.isDisplayed())
			inputBox.sendKeys("isDisplayed()");
		else
			System.out.println("Input box is not visible on webpage");
		
		
	}
}