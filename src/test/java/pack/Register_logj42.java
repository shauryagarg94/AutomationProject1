package pack;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Register_logj42 {
	
	public Logger logger; // Used for Log4j2

	@Test
	public void Register() throws InterruptedException {
		
		logger = LogManager.getLogger(this.getClass());// Log4j2
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/register&language=en-gb");
		logger.info("URL launch done");

		driver.findElement(By.id("input-firstname")).sendKeys("Kundan");
		logger.info("First name entered successfully");
		driver.findElement(By.id("input-lastname")).sendKeys("Kapoor");
		logger.info("Last name entered successfully");
		driver.findElement(By.id("input-email")).sendKeys("kapoor" + System.currentTimeMillis() + "@test.com");
		logger.info("email entered successfully");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		logger.info("Phone number entered successfully");
		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		logger.info("Password entered successfully");
		Thread.sleep(5000);
		driver.findElement(By.id("k_kapoor_check_box")).click();
		logger.info("Privacy policy clicked successfully");
		Thread.sleep(5000);
		try
		{
		driver.findElement(By.id("k_kapoor_developer_button_1")).click();
		logger.info("Submit button clicked successfully");
		}
		catch(Exception e)
		{
			logger.error("submit button not found",e);
		}
		
		Thread.sleep(5000);
		//logger.info("Info Message");

        //logger.warn("Warning Message");

        //logger.error("Error Message");

	}

}