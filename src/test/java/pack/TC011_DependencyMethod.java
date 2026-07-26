package pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC011_DependencyMethod {

		
		@Test(priority=1)
		public void openWebsite()
		{
			System.out.println("Website Open Code");
			Assert.assertTrue(true);
		}

		@Test(priority=2, dependsOnMethods ="openWebsite")
		public void login()
		{
			System.out.println("Login Code");
			Assert.assertTrue(true);
		}
		
		@Test(priority=3, dependsOnMethods ="login")
		public void Search()
		{
			System.out.println("Search Code");
			Assert.assertTrue(true);
		}

		@Test(priority=4, dependsOnMethods ="Search")
		public void AddCart()
		{
			System.out.println("AddCart Code");
			Assert.assertTrue(false);
		}
		
		@Test(priority=5, dependsOnMethods ="AddCart")
		public void Logout()
		{
			System.out.println("Logout Code");
		}

		
		
	}

