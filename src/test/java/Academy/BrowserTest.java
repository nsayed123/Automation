package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hello Guys");
// 		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:Selenium-java-chromedriver_win32chromedriver.exe");
		
		WebDriverManager.chromedriver().clearCache()
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://sssaliqa.azurewebsites.net/webapp/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}
