package seleniumScripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wait_OHM {
	public static void main(String[] args) throws Exception
	{
		WebDriver wd=new FirefoxDriver();
		//WebDriver w=new EdgeDriver();
		wd.manage().window().maximize();

		//1)Implicit wait
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2)Explicit wait
		
		//get(String url)
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		wd.findElement(By.name("username")).sendKeys("Admin");
		
		//password
		wd.findElement(By.name("password")).sendKeys("admin123");
	}
}
