package pack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC010_HardSoftAssertion {
	
	@Test
	public void hardAssertion()
	{
		System.out.println("first line");
		
		Assert.assertEquals("abc", "abc123");
		
		System.out.println("second line");
	}

	@Test
	public void softAssertion()
	{
		System.out.println("first line");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("abc", "abc123");
		
		System.out.println("second line");
	}
}
