package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sheet2 {

	public static void main(String[] args) throws Throwable {
		// 1-06-2023
		
				//Step1:- set the path
				FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
				
				//step2:- open work book in read mode
		Workbook book = WorkbookFactory.create(fis);

		//step3:- get the control to the sheet
		Sheet sh = book.getSheet("Sheet2");
		Row row = sh.getRow(0);
		Cell cel = row.getCell(0);

		DataFormatter format=new DataFormatter();
		String data = format.formatCellValue(cel);
		System.out.println(data);
	}

}
