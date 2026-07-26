package pack;

import org.testng.annotations.Test;

public class SkipTest {
	
	@Test(enabled=false)
	public void login()
	{
		System.out.println("login method");
	}
	@Test(enabled=false)
	public void payment()
	{
		System.out.println("payment ");
	}
	@Test(enabled=false)
	public void logout()
	{
		System.out.println("logout");
	}
	
}
