package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWritesingledata {

	public static void main(String[] args) throws Throwable {
		
		
		//Step1:- set the path
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		
		//step2:- open work book in read mode
        Workbook book = WorkbookFactory.create(fis);

        //step3:- get the control to the sheet
         Sheet sh = book.getSheet("Sheet1");

        //step4:- get the control on the row
        Row row = sh.getRow(0);

         Cell cel = row.createCell(2);
         cel.setCellValue("ELROI");

         FileOutputStream fos=new FileOutputStream("./Book1.xlsx");
         book.write(fos);
         book.close();
		
		
		
	}

}
