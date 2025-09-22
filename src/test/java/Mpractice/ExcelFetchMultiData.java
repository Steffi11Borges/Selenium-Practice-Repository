package Mpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetchMultiData {

	public static void main(String[] args) throws Throwable  {		
		FileInputStream fis=new FileInputStream("./MultiData.xlsx");
		
		//Step2:-open workbook in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step:-3 get the control to the sheet
		Sheet sh = book.getSheet("Sheet1");
		
		System.out.println(sh.getLastRowNum());
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			Row row = sh.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				Cell cel = row.getCell(j);
				DataFormatter format=new DataFormatter();
				String data = format.formatCellValue(cel);
	
				System.out.println(data);
			}
		}

	}
}
