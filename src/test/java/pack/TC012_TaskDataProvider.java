package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC012_TaskDataProvider {
	WebDriver driver ;
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/login&language=en-gb");
		//driver.findElement(By.id("input-email")).sendKeys("kundan@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kundan@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.id("login_button_kapoor1")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h1[normalize-space()='My Account']")).isDisplayed();
		Thread.sleep(2000);
		
		WebElement logoutBtn = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutBtn);
		
		//driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		
	}
	
	

}
