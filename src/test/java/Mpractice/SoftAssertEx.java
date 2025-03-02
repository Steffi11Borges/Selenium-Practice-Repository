package Mpractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	//30-06-2023
	
		@Test
		public void m1()
		{
			System.out.println("step1");
			System.out.println("step2");
			System.out.println("step3");
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(false, true);
			System.out.println("step4");
			System.out.println("step5");
			soft.assertAll();
		}
		
		@Test
		public void m2()
		{
			String expData = "Qspiders";
			String actData = "qspiders";
			SoftAssert Soft = new SoftAssert();
            Soft.assertEquals(actData, expData);
            Soft.assertAll();
			
		}
	

}
