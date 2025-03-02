package Mpractice;

import org.testng.annotations.Test;

public class TestNgEx1 {

	@Test(priority=2)
	//1St METHOD	
	public void createContact()
		{
//int[]arr= {1,2,3};//to see depent also gets fail or not by failing main method
//System.out.println(arr[5]);

			System.out.println("contact created");
		}
		
	@Test(invocationCount = 3)
	//@Test(dependsOnMethods = "createContact")
		//@Test(priority=2)
		//2ND METHOD
		public void modifyContact()
		{
			System.out.println("contact Modified");
		}
		
	@Test(enabled = false)
	//@Test(dependsOnMethods = "createContact")
		//@Test(priority=3)
		//3RD METHOD
		public void deleteContact()
		{
			System.out.println("contact deleted");
		}
		
	}


