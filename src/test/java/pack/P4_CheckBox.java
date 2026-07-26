package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://logicnextgen.com/projects/AutomationTestingPractice/checkbox.php");
		driver.findElement(By.id("mumbai")).click();
		
	}

}
