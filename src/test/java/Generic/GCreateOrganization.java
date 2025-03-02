package Generic;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import GenericUtility.Excel_utility;
import GenericUtility.Java_Utility;
import GenericUtility.Webdriver_utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GCreateOrganization {

	public static void main(String[] args) throws Throwable {
		// 07-06-2023
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		/*
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		*/
		
		// calling URL from  property file
		FileInputStream fis=new FileInputStream("./src/test/resources/AdvSelenium.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		

		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		//java utility //08-06-2023
		Java_Utility jlib=new Java_Utility();
		int ranNum = jlib.getRandomNum();

		//Random r= new Random();
		//int ranNum = r.nextInt(1000);
		
		//Excel Utility //08-06-2023
				Excel_utility elib=new Excel_utility();
				String OrgName = elib.getExcelData("Organization", 1, 0)+ranNum;
		
		/*
		//Step1:-set the path
        FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");

		//Step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step:-3 get the control to the sheet
		 Sheet sh = book.getSheet("Organization");
		
		//step:-4 get the control on the row
		Row row = sh.getRow(1);
	
	   //step:-5 get the control on the cell
	    Cell cel = row.getCell(0);
	
	  //step6:- fetch the data from the cell
		String OrgName = cel.getStringCellValue()+ranNum;	
		
		*/
		
        driver.findElement(By.name("accountname")).sendKeys(OrgName);
        
		//Excel Utility //08-06-2023
		String phoneNum = elib.getExcelDataUsingDataFormatter("Organization", 2, 0);
		driver.findElement(By.id("phone")).sendKeys(phoneNum);

		String email = elib.getExcelDataUsingDataFormatter("Organization", 3, 0);
		driver.findElement(By.id("email1")).sendKeys(email);

		
		//driver.findElement(By.id("phone")).sendKeys("6544654684");
		//driver.findElement(By.id("email1")).sendKeys("yewvdy@gmail.com");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		Thread.sleep(3000);
		/*
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		*/
		
		// Using Action Class //09-06-2023
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		
		//WebDriver Utility
		Webdriver_utility wlib=new Webdriver_utility();
        wlib.ActionsMoveToElement(driver, ele);
        
        
		/* //using actions method
		Actions act = new Actions(driver);
		
		//1st method
		//act.contextClick(ele).click();
		
		//2nd method
		act.moveToElement(ele).perform();
		*/
	
		//using method //optimizing
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
		//Normal Method
		//driver.findElement(By.linkText("Sign Out")).click();
	}

	}


