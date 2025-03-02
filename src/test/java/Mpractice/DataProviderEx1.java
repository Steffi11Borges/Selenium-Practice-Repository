package Mpractice;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx1 {
//27-06-2023
	
	@Test(dataProvider="getdata")
	public void m1(String orgName,String phoneNum,String emailId) throws Throwable
	{		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
driver.get("http://localhost:8888/");	
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
driver.findElement(By.linkText("Organizations")).click();
driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
driver.findElement(By.name("accountname")).sendKeys(orgName);
driver.findElement(By.name("phone")).sendKeys(phoneNum);
driver.findElement(By.id("email1")).sendKeys(emailId);
Thread.sleep(1000);

driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
Thread.sleep(1000);

driver.quit();
}

	@DataProvider
public Object[][] getdata()
{
		 Random ran = new Random();
		 int ranNum = ran.nextInt(1000);
		
		 Object[][] obj = new Object[3][3];
		 obj[0][0]="AAA"+ranNum;
		 obj[0][1]="8798478958";
		 obj[0][2]="sfsf@gmail.com";
		 
		 obj[1][0]="bbb+ranNum"+ranNum;
		 obj[1][1]="8758478958";
		 obj[1][2]="sfsbbb@gmail.com";
		 
		 obj[2][0]="ccc+ranNum"+ranNum;
		 obj[2][1]="8768478958";
		 obj[2][2]="sfsfccc@gmail.com";
		 
		return obj;
}
	
	
}
