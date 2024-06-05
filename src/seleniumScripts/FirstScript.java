package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript 
{
	public static void main(String[] args) throws Exception 
	{
		//used to open blank instance of web-browser
		WebDriver wd=new ChromeDriver();
		
		//used to maximize current opened instance of web-browser
		wd.manage().window().maximize();
		
		Thread.sleep(2000);
		//used to close current opened single instance of web-browser
		//wd.close();
		Thread.sleep(1000);
		//used to close current opened multiple instances of web-browser
		wd.quit();//
	}
}