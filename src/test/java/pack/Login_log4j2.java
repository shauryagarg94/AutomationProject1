package pack;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_log4j2 {
	public Logger logger; // Used for Log4j2

	@Test
	public void Register() throws InterruptedException {
		
		logger = LogManager.getLogger(this.getClass());// Log4j2
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/login&language=en-gb");
		logger.info("URL lunch done");

		driver.findElement(By.id("input-email")).sendKeys("Kundan");
		logger.info("email entered successfully");
		driver.findElement(By.id("input-password")).sendKeys("Kapoor");
		logger.info("password entered successfully");
		Thread.sleep(3000);
		driver.findElement(By.id("login_button_kapoor1")).click();
		logger.info("login clicked successfully");
		
		//logger.info("Info Message");

        //logger.warn("Warning Message");

        //logger.error("Error Message");

	}


}
