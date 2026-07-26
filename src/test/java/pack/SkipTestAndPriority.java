package pack;

import org.testng.annotations.Test;

public class SkipTestAndPriority {
	
	@Test(enabled=true, priority=1)
	public void login()
	{
		System.out.println("login");
	}
	@Test(enabled=true, priority=2)
	public void payment()
	{
		System.out.println("payment ");
	}
	@Test(enabled=false, priority=3)
	public void logout()
	{
		System.out.println("logout");
	}

}
