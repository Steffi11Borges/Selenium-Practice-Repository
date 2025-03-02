package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws Throwable {
		// 31-05-2023
		//inputing or inserting data into the excel sheet
		
		//Step1:- set the path
				FileInputStream fis=new FileInputStream("./Stelfra.xlsx");
				
				//step2:- open work book in read mode
		Workbook book = WorkbookFactory.create(fis);

		//step3:- get the control to the sheet
		Sheet sh = book.getSheet("Sheet1");

		//step4:- get the control on the row
		Row row = sh.getRow(0);
		
        Cell cel = row.createCell(0);
        cel.setCellValue("java");
		
		FileOutputStream fos=new FileOutputStream("./Stelfra.xlsx");
		book.write(fos);
		book.close();

	}

}
