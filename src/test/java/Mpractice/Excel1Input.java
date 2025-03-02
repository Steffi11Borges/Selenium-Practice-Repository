package Mpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Excel1Input {

	public static void main(String[] args) throws Throwable {
		//Step1:-set the path
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		
		//Step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step:-3 get the control to the sheet
		 Sheet sh = book.getSheet("Sheet1");
		
		//step:-4 get the control on the row
		Row row = sh.getRow(0);
		

		org.apache.poi.ss.usermodel.Cell cel = row.createCell(0);
		cel.setCellValue("phone");

		//To write data into ExcelSheet
		FileOutputStream fos=new FileOutputStream("./Book1.xlsx");
		book.write(fos);
		book.close();
	}

}
