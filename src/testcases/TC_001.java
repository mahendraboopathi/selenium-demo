package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/New/Desktop/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.findElementById("loginbutton").click();
		driver.quit();
	}
	
	
}
