package pack;

import org.testng.annotations.Test;

public class Group1 {

	@Test(groups={"Smoke","Regression","Sanity"})
	public void login()
	{
		System.out.println("login");
	}
	@Test(groups="Regression")
	public void payment()
	{
		System.out.println("payment ");
	}
	@Test(groups={"Smoke","Regression"})
	public void logout()
	{
		System.out.println("logout");
	}
	@Test(groups="Regression")
	public void profileUpdate()
	{
		System.out.println("profileUpdate");
	}
	@Test(groups="Regression")
	public void searchProduct()
	{
		System.out.println("searchProduct");
	}
	
}
