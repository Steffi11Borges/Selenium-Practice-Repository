package seleniumTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {
	
		@Test
		public void TrueF()
		{
			System.out.println("step1");
			
			SoftAssert softt= new SoftAssert();
			Assert.assertEquals(false, false);//actual and expected
			
			System.out.println("step2");
			System.out.println("step3");
			
			softt.assertAll();
			
		}
		
		@Test
		public void TrueFa()
		{
			System.out.println("st");
			
			SoftAssert softt= new SoftAssert();
			Assert.assertEquals(true, false);;//actual and expected
						
			System.out.println("step");
			
			softt.assertAll();
			
		}

		private void assertAll() {
			// TODO Auto-generated method stub
			
		}
}


