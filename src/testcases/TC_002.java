package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void testcase1()
	{
		System.setProperty("WebDriver.Chrome.driver", "C:/Users/New/Desktop/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://54.144.210.255:8081/");
		driver.findElementById("inputEmail3").sendKeys("info@roboapp.com");
		driver.findElementById("inputPassword3").sendKeys("Super123");
		driver.findElementByXPath("//*[@id="loginForm"]/div[3]/div/button").click();
		driver.findElementByXPath("//*[@id="loginForm"]/div[4]/div/button[1]").click();
		driver.findElementByXpath("/html/body/main/ba-sidebar/aside/div[1]/ul/li[2]/a/span").click();
		driver.findElementByXpath("//*[@id="view_0"]").click();
		
	}
	
	
}
