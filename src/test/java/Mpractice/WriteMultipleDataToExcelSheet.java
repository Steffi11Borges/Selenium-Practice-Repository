package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 class WriteMultipleDataToExcelSheet {

	public static void main(String[] args) throws Throwable {
		// 2nd assignment fetching links from amazon or flipkart and printing inside excel sheet
		//31-05-2023 		// 1-06-2023

		
		//Step1:- set the path
		FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
		
		//step2:- open work book in read mode
Workbook book = WorkbookFactory.create(fis);

//step3:- get the control to the sheet
Sheet sh = book.getSheet("Sheet1");

WebDriver driver;
WebDriverManager.edgedriver().setup();
driver=new EdgeDriver();

driver.get("https://www.amazon.in/");
List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

for(int i=0; i<allLinks.size();i++)
{
	Row row = sh.createRow(i);
	Cell cel = row.createCell(0);
	cel.setCellValue(allLinks.get(i).getAttribute("href"));

	}
FileOutputStream fos=new FileOutputStream("./src/test/resources/Excelsheet.xlsx");
book.write(fos);
book.close();

}
}
