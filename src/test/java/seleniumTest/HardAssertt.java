package seleniumTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertt {

	
	@Test
	public void TrueFalse()
	{
		System.out.println("step1");		
		Assert.assertEquals(false, false);//actual and expected
		String expData = "Qspiders";
		String actData = "qspiders";
		Assert.assertEquals(actData, expData);		
		System.out.println("step3");
	}
	
// NO OF METHOD 2
	@Test
	public void Qq()
	{
		String expData = "Qspiders";
		String actData = "Qspiders";
		Assert.assertEquals(actData, expData);
		
	}

	
	
	// NO OF METHOD 4
	@Test
	public void Tf()
	{
		System.out.println("step1");
		Assert.assertEquals(true, false);//actual and expected
		System.out.println("step2");
		System.out.println("step3");
	}
}


