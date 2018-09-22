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
	        WebElement id = driver.findElement(By.name("username"));
                WebElement pass = driver.findElement(By.name("password"));
                WebElement button = driver.findElement(By.xpath("//*[@id="loginForm"]/div[3]/div/button"));         

                id.sendKeys("info@roboapp.com");
                pass.sendKeys("Super123");
                button.submit();
    }
	}
	
	
}
