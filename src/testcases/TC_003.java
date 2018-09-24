package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/New/Desktop/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://54.144.210.255:8081/");
		driver.findElementById("inputEmail3").sendKeys("info@roboapp.com");
		driver.findElementById("inputPassword3").sendKeys("Super123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id="loginForm"]/div[3]/div/button")).click();
		Thread.sleep(5000);
	
		driver.quit();
    
	}
	
	
}
