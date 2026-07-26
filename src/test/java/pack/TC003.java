package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003 {
	@Test
	public void logicCart()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://logicnextgen.com/projects/logiccart/upload/");
	}
	@Test
	public void logicUpload()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://logicnextgen.com/tutorials/");
	}
	
}
