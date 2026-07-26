package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://logicnextgen.com/projects/AutomationTestingPractice/register.php");
		driver.findElement(By.id("firstName")).sendKeys("shaurya");
		driver.findElement(By.id("lastName")).sendKeys("garg");
		driver.findElement(By.id("address")).sendKeys("ghaziabad");
		
		Select select=new Select(driver.findElement(By.id("country")));
		Thread.sleep(3000);
		select.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		Select select1=new Select(driver.findElement(By.id("state")));
		
		select1.selectByVisibleText("Uttar Pradesh");
		
		
		driver.findElement(By.id("username")).sendKeys("shauryagarg");
		driver.findElement(By.id("BillingAddressKapoor2")).click();
		driver.findElement(By.id("Debitcard1")).click();

		driver.findElement(By.id("cc-name")).sendKeys("shaurya");
		driver.findElement(By.id("cc-number")).sendKeys("1234567890");
		
		
		
		
		 
		
	}

}
