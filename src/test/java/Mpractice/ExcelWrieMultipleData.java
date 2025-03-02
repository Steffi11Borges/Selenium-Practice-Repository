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

public class ExcelWrieMultipleData {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./MultiData.xlsx");
		
        Workbook book = WorkbookFactory.create(fis);

        Sheet sh = book.getSheet("Sheet1");
        
        WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();	
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> allink = driver.findElements(By.xpath("//a"));
		
		for(int i=0; i<allink.size(); i++)
		{
			Row row = sh.createRow(i);
            Cell cel = row.createCell(0);
			cel.setCellValue(allink.get(i).getAttribute("href"));

			FileOutputStream fos=new FileOutputStream("./MultiData.xlsx");
			book.write(fos);
			book.close();
		}
		
	}

}
