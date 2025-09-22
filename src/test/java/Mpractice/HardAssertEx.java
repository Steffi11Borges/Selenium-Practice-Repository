 package Mpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	//28-06-2023
	
	@Test
	public void m1()
	{
		System.out.println("step1");
		String expData = "steffi";
		String actData = "steffi";
		Assert.assertEquals(actData, expData);
		Assert.assertEquals(true, false);

		System.out.println("step2");
	}
	
	@Test
	public void m2()
	{
		System.out.println("step3");
		Assert.assertEquals(false, false);
		
	}

}
