package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void testcase1()
	{
		System.setProperty("WebDriver.Chrome.driver", "C:/Users/New/Desktop/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://54.144.210.255:8081/");
		driver.findElementById("inputEmail3").sendKeys("info@roboapp.com");
		driver.findElementById("inputPassword3").sendKeys("Super123");
// 		driver.findElement(By.xpath("//button[@type='submit']")).submit();
// 		driver.findElement(By.xpath("//*[@id="loginForm"]/div[3]/div/button")).click();
// 		driver.findElementByXpath("//*[@id="loginForm"]/div[3]/div/button").click();
	       
	
	}
	
	
}
