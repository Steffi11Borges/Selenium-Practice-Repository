package Generic;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import GenericUtility.Webdriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GCreateCampWithProduct {

	public static void main(String[] args) throws Throwable {
	// 02-06-2023 to 07-06-2023
		
//		WebDriver driver;
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		Random r=new Random();
		 int data = r.nextInt(1000);
		 
		//Step1:-set the path
		          FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
		 
				//Step2:-open workbook in read mode
				Workbook book = WorkbookFactory.create(fis);
				
				//step:-3 get the control to the sheet
				 Sheet sh = book.getSheet("Product");
				
				//step:-4 get the control on the row
				Row row = sh.getRow(0);
			
			   //step:-5 get the control on the cell
			Cell cel = row.getCell(0);
			
			  //step6:- fetch the data from the cell
				String ProductData = cel.getStringCellValue()+data;	
		driver.findElement(By.name("productname")).sendKeys(ProductData);


		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		driver.findElement(By.name("campaignname")).sendKeys("marketing"+data);

		driver.findElement(By.xpath("//img[@alt='Select']")).click();
		
		/*
		 Set<String> allWindows = driver.getWindowHandles();
		 Iterator<String> id = allWindows.iterator();
			while(id.hasNext())
		 {
			 String win = id.next();
			 driver.switchTo().window(win);
			 String title = driver.getTitle();
			 
			 if(title.contains("Products&action"))
			 {
				 break;
			 }
			 }
			 */
		
			//WebDriver Utility //09-06-2023
		Webdriver_utility wlib=new Webdriver_utility();
		wlib.switchWindow(driver, "Products&action");
		
		
		
			driver.findElement(By.name("search_text")).sendKeys(ProductData);
			driver.findElement(By.name("search")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='"+ProductData+"']")).click();
			Set<String> allWindows1 = driver.getWindowHandles();
			 Iterator<String> id1= allWindows1.iterator();
				while(id1.hasNext())
			 {
				 String win1 = id1.next();
				 driver.switchTo().window(win1);
				 String title = driver.getTitle();
				 
				 if(title.contains("Campaigns&action"))
				 {
					 break;
				 }
				 }
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
				driver.findElement(By.linkText("Sign Out")).click();
	}

}
