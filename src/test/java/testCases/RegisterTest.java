
package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/register&language=en-gb");
	}

	@Test
	public void registerUser() throws InterruptedException {
		
		RegisterPage rp = new RegisterPage(driver);
		Thread.sleep(3000);
		rp.enterFirstName("shaurya");
		Thread.sleep(3000);
		rp.enterLastName("garg");
		Thread.sleep(9000);

	}

	@AfterMethod
	public void tearDown() {

		
		driver.quit();

	}
}
