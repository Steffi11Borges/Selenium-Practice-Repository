package Mpractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx2 {
	
	@Test(dataProvider="dataProviderExecute")
	public void bookTickets(String src, String dest)
	{
		System.out.println("Book Tickets From"+src+"to"+dest);
	}
	
	@DataProvider
public Object[][] dataProviderExecute()
{		
		 Object[][] obj = new Object[2][2];
		 obj[0][0]=" Banglore ";
		 obj[0][1]=" Goa ";
		 
		 obj[1][0]=" Delhi ";
		 obj[1][1]=" Mumbai ";
		return obj;
}

}
