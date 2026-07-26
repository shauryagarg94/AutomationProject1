package pack;

import org.testng.annotations.Test;

public class TC008_Assertion1 {		
		@Test
		public void testTitle()
		{
			
			String exp_title ="Logic Nextgen";
			
			String act_title ="Logic 12345";
			
			
			if(exp_title.equals(act_title))
			{
				System.out.println("Test Passed");
			}
			else 
			{
				
				System.out.println("Test Failed");
			
			}
			
			
			
		}


}
