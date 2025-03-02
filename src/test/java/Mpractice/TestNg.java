package Mpractice;

import org.testng.annotations.Test;

//@Test //2)to execute all method
public class TestNg {
	//21-06-2023
	
	//@Test //1)to execute 1 method
	//@Test(priority = 3) //3)for priority we have to mention like this for each method
	//@Test //4)Depends on Method
	//@Test(invocationCount = 5)  //5)it will get executed 5times
	@Test //6)enable method
	public void createContact()
	{
//		int arr[]= {1,2,3}; //4.1)
//		System.out.println(arr[5]);//4.1) this will fail createContact and skip reaming 2methods
		System.out.println("contact created");
	}
	

	//@Test /1)to execute 1 method
	//@Test(priority = 1) //3)for priority we have to mention like this for each method
    //@Test (dependsOnMethods ="createContact" )//4)Depends on Method
	//@Test(invocationCount = 0)  //5)it will not get executed at all
	@Test //6)enable method

	public void modifyContact()
	{
		System.out.println("contact Modified");
	}
    
    
	
	//@Test /1)to execute 1 method
	//@Test(priority = 2) //3)for priority we have to mention like this for each method
    //@Test (dependsOnMethods ="createContact" )//4)Depends on Method
    //@Test //5) it will get executed 1time
	@Test(enabled = false) //6)enable method when it is used that particular method will not get executed

	public void deleteContact()
	{
		System.out.println("contact deleted");
	}
	
}
