package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceldatatoSearchbar {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();	
		
		driver.get("https://www.flipkart.com/");
		
	FileInputStream file=new FileInputStream("./Book1.xlsx");
	Workbook work = WorkbookFactory.create(file);
	Sheet sh = work.getSheet("Sheet1");
	Row rw = sh.getRow(0);
	Cell cel = rw.getCell(0);
	String val = cel.getStringCellValue();
	
    driver.findElement(By.name("q")).sendKeys(val);
    System.out.println(val);
	}

}
