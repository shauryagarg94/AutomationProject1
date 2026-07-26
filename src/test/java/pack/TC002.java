package pack;

import org.testng.annotations.Test;



public class TC002 {
	@Test(priority = 2)
	public void login()
	{
		System.out.println("login");
	}
	@Test(priority = 1)
	public void register()
	{
		System.out.println("register");
	}
	@Test(priority = 3)
	public void dashboard()
	{
		System.out.println("dashboard");
	}
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("logout");
	}

}
