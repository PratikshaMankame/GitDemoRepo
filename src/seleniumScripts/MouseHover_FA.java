package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_FA {
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new FirefoxDriver();
		//WebDriver w=new EdgeDriver();
		wd.manage().window().maximize();

		Actions act=new Actions(wd);

		//get(String url)
		wd.get("https://demo.frontaccounting.eu/");
		//	click on login
		wd.findElement(By.name("SubmitUser")).click();

		List<WebElement> menus=wd.findElements(By.xpath("//*[@class=\"tabs\"]/a"));
//		System.out.println(menus.size());
		menus.addAll(wd.findElements(By.xpath("//*[@class=\"logoutBarRight\"]/a")));

		System.out.println(menus.size());
		for (WebElement m : menus) 
		{
			Thread.sleep(1000);
			act.moveToElement(m).perform();
			Thread.sleep(1000);
			if(m.getText().equals("  Logout"))
				m.click();			
			//*[@id="_page_body"]/table/tbody/tr
		}
	}
}