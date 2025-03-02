package Mpractice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class DataFormatter {

	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream("./MultiData.xlsx");
		
		//Step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step:-3 get the control to the sheet
		Sheet sh = book.getSheet("Sheet1");
    	Row row = sh.getRow(0);
	    Cell cel = row.getCell(0);

	DataFormatter format=new DataFormatter();
	String data = format.formatCellValue(cel);
	System.out.println(data);
	}

}
