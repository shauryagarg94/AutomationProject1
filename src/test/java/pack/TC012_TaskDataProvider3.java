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

public class TC012_TaskDataProvider3 {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(dataProvider="registertestdata")
	public void testLogin(String fname,String lname,String email,String phone, String password) throws InterruptedException {

		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/register&language=en-gb");
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("input-firstname")).sendKeys(email);
		driver.findElement(By.id("input-lastname")).sendKeys(lname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("k_kapoor_check_box")).click();
		//driver.findElement(By.xpath("//input[@id='k_kapoor_check_box']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("k_kapoor_developer_button")).click();
		Thread.sleep(3000);
		
		
		//driver.findElement(By.xpath("//h1[normalize-space()='My Account']")).isDisplayed();
		//Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		/*WebElement logoutBtn = driver
				.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutBtn);
*/
	}

	@AfterClass
	public void tearDown() {
		driver.close();

	}
	@DataProvider(name="registertestdata")
	Object[][] loginData() 
	{
		
		Object data[][] = {  { "fname1","lname1","fname1@gmail.com","987654321", "123456" } , 
							 { "fname2","lname2","fname2@gmail.com","987654322", "123456" },
							 { "fname3","lname3","fname3@gmail.com","987654323", "123456" },
							 { "fname4","lname4","fname4@gmail.com","987654324", "123456" },
							 { "fname5","lname5","fname5@gmail.com","987654325", "123456" },

		};

		return data;

	}

}