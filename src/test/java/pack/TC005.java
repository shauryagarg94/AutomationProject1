package pack;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC005 {
	@Test
	public void register()
	{
		
		System.out.println("registration page launched");
	}
	@Test
	public void login()
	{
		
		System.out.println("registration page launched");
	}
	@BeforeMethod
	public void browserlaunch()
	{
		System.out.println("browser launched");
	}
}
