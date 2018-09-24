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
		driver.manage().timeout().inplicitlywait(3,timeunit.seconds);
		driver.findElement(By.cssselector("#inputEmail3")).sendKeys("info@roboapp.com");
		driver.findElement(By.cssseletor("#inputPassword3")).sendKeys("Super123");
		driver.findElement(By.cssseletor("#loginForm > div:nth-child(3) > div > button")).click();
		
		driver.close();
		driver.quit();
		

	
	          
    
	}
	
	
}
