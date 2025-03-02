package seleniumTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 {
	@Test
	public void HardAssert()
	{
		System.out.println("step1");
		Assert.assertEquals(false, false);//actual and expected
		//we can give both true
		//to fail we need to give one true 
		
		System.out.println("step2");
		System.out.println("step3");
	}


	
	// NO OF METHOD 2
	@Test
	public void qspiderHardAssert()
	{
		String expData = "Qspiders";//to pass we can give both string value same
		String actData = "qspiders";
		Assert.assertEquals(actData, expData);
	}
}	
	
	