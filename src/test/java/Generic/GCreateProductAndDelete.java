package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GCreateProductAndDelete {

	public static void main(String[] args) throws Throwable {
	// 07-06-2023
		

//		WebDriver driver;
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		
		Random ran=new Random();
		int ranNum = ran.nextInt(1000);
		
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
		String ProductData = cel.getStringCellValue()+ranNum;	
driver.findElement(By.name("productname")).sendKeys(ProductData);
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//delete product
driver.findElement(By.xpath("//a[text()='Products']")).click();
driver.findElement(By.xpath("//table[@class='lvt small']/tbody//td//a[text()='"+ProductData+"']/../preceding-sibling::td/input")).click();
driver.findElement(By.xpath("//input[@value='Delete']")).click();
				
Alert alt=driver.switchTo().alert();
alt.accept();
	}

}
