package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {
	
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	WebElement elementClick= driver.findElement(By.xpath("//input[1]"));
	System.out.println(elementClick.isDisplayed());
	System.out.println(elementClick.isSelected());
}
}
