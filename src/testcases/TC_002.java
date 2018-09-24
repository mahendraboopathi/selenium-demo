package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 {

	@Test
	public void testcase1()
	{
		System.setProperty("WebDriver.Chrome.driver", "C:/Users/New/Desktop/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://54.144.210.255:8081");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("info@roboapp.com");
		 driver.findElement(By.name("password")).sendKeys("Super123");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.xpath("//button[@type='submit']")).submit();
	       
	
	}
	
	
}
