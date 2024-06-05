package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_FA
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();

		wd.navigate().to("https://demo.frontaccounting.eu/");

		//click on login
		wd.findElement(By.xpath("//input[@type='submit']")).click();

		//click on 'Sales Quotation Entry'
		wd.findElement(By.linkText("Sales Quotation Entry")).click();
		
		//click on "Cancel Quotation" button
		wd.findElement(By.id("CancelOrder")).click();
	
		Thread.sleep(1000);
		Alert alt=wd.switchTo().alert();
		
		//capture text
		
		System.out.println("Text of alert - "+alt.getText());
		
		//click on ok button
//		alt.accept();
		
		alt.dismiss();
	}
}