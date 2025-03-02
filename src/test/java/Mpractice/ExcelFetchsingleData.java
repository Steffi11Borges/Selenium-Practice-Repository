package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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

public class ExcelFetchsingleData {

	public static void main(String[] args) throws Throwable  {
		
	FileInputStream file=new FileInputStream("./Book1.xlsx");
	Workbook work = WorkbookFactory.create(file);
	Sheet sh = work.getSheet("Sheet1");
	Row rw = sh.getRow(0);
	Cell cel = rw.getCell(0);
	String val = cel.getStringCellValue();
	
    System.out.println(val);

	
	
	
	}

}
