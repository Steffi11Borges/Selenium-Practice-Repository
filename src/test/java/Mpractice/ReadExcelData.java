package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws Throwable {
		// 31-05-2023
		//Fetching Data From ExcelSheet
		
		//Step1:- set the path
		FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
		
		//step2:- open work book in read mode
Workbook book = WorkbookFactory.create(fis);

//step3:- get the control to the sheet
Sheet sh = book.getSheet("Sheet1");

//step4:- get the control on the row
Row row = sh.getRow(2);

//step5:- get the control on the cell
Cell cel = row.getCell(2);

//step6:- fetch the data from the cell
String data = cel.getStringCellValue();

System.out.println(data);

	}


}
