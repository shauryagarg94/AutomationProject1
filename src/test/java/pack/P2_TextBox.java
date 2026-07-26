package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_TextBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://logicnextgen.com/projects/AutomationTestingPractice/textbox.php");
		driver.findElement(By.id("fullname")).sendKeys("shaurya garg");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

	}

}
