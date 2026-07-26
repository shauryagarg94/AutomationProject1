package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC006 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void browserlaunch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void login()
	{
		
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/login&language=en-gb");
	}
	@Test(priority = 1)
	public void register()
	{
		
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/register&language=en-gb\r\n"
				+ "");
	}
	
}
