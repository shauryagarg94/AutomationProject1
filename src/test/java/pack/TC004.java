package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC004 {

	@Test(priority = 2)
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/login&language=en-gb");
	}
	@Test(priority = 1)
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://logicnextgen.com/projects/logiccart/upload/index.php?route=account/register&language=en-gb\r\n"
				+ "");
	}
}
