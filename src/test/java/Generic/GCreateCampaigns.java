package Generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import GenericUtility.Webdriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GCreateCampaigns {

	public static void main(String[] args) throws Throwable {
		//07-06-2023
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		//09-06-2023
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebDriver Utility //09-06-2023
		Webdriver_utility wlib=new Webdriver_utility();
		wlib.implicitwait(driver);
		
		/*
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		*/
		
		 FileInputStream fis=new FileInputStream("./src/test/resources/AdvSelenium.properties");
			Properties pro=new Properties();
			pro.load(fis);
			String URL = pro.getProperty("url");
			String USERNAME = pro.getProperty("username");
			String PASSWORD = pro.getProperty("password");
			
			driver.get(URL);
			
			//WebDriver Utility //09-06-2023
            wlib.maximizeScreen(driver)	;
            
            driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
			
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
		
		Random r= new Random();
		int ranNum = r.nextInt(1000);
		
		//Step1:-set the path
        FileInputStream fis1=new FileInputStream("./src/test/resources/Excelsheet.xlsx");

		//Step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis1);
		
		//step:-3 get the control to the sheet
		 Sheet sh = book.getSheet("Campaigns");
		
		//step:-4 get the control on the row
		Row row = sh.getRow(2);
	
	   //step:-5 get the control on the cell
	    Cell cel = row.getCell(1);
	
	  //step6:- fetch the data from the cell
		String OrgName = cel.getStringCellValue()+ranNum;	
		
		
		driver.findElement(By.name("campaignname")).sendKeys("marketing");
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		
		// Action Class //09-06-2023
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act = new Actions(driver);
		
		//1st method
		//act.contextClick(ele).click();
		
		//2nd method
		act.moveToElement(ele).perform();
	
		
		//using method
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
	}

}
