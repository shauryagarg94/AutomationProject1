package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P7_DoubleClickButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://logicnextgen.com/projects/AutomationTestingPractice/buttons.php");
		
		Actions action = new Actions(driver);
		WebElement doubleClickBtn1 = driver.findElement(By.id("doubleBtn"));
		action.doubleClick(doubleClickBtn1).perform();
	}

}
