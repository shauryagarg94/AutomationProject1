package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC012_TaskDataProvider2 {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(dataProvider="logintestdata")
	public void testLogin(String email,String password) throws InterruptedException {

		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/login&language=en-gb");
	
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("login_button_kapoor1")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[normalize-space()='My Account']")).isDisplayed();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		WebElement logoutBtn = driver
				.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutBtn);

	}

	@AfterClass
	public void tearDown() {
		driver.close();

	}
	@DataProvider(name="logintestdata", indices = {2,3})
	Object[][] loginData() 
	{
		
		Object data[][] = { { "kundan@gmail.com", "123456" }, 
				            { "amit@gmail.com", "1234567" },
				            {"noorhasan@yopmail.com","Noor@123"},
				            {"rahul@yopmail.com", "123456"},
				            {"sumit007@gmail.com", "1234567"},

		};

		return data;

	}

}