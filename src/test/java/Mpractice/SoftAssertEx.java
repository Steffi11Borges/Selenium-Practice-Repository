package Mpractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	//30-06-2023
	
		@Test
		public void m1()
		{
			System.out.println("step1");
			
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(true, true);
			soft.assertAll();
		}
		
		@Test
		public void m2() 
		{
			String expData = "steffi";
			String actData = "steffi";
			SoftAssert Soft = new SoftAssert();
            Soft.assertEquals(actData, expData);
            Soft.assertAll();
			
		}
	

}
