package Mpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.Excel_utility;

public class DataProvider3 {
	
	@Test(dataProvider="getdata")
	public void bookTickets(String src, String dest)
	{
		System.out.println("Book Tickets From"+src+"to"+dest);
	}
	
	@DataProvider
public Object[][] getdata() throws Throwable
{
		Excel_utility elib = new Excel_utility();
	Object[][] value = elib.readMultipleData("DataProvider");
	return value;	
	
	//Error//java.lang.RuntimeException: java.lang.NullPointerException: 
	//Cannot invoke "org.apache.poi.ss.usermodel.Cell.getStringCellValue()
	//" because the return value of "org.apache.poi.ss.usermodel.Row.getCell(int)" is null

		 
}

}
