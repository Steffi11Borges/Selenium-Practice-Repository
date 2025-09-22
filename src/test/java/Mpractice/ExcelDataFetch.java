package Mpractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetch {

    public static void main(String[] args) throws IOException {
        // Step 1: load file
        FileInputStream fis = new FileInputStream("./MultiData.xlsx");

        // Step 2: open workbook in read mode
        Workbook book = WorkbookFactory.create(fis);

        // Step 3: get the control to the sheet
        Sheet sh = book.getSheet("Sheet1");

        // Get row and cell
        Row row = sh.getRow(0);
        Cell cel = row.getCell(0);

        // Use Apache POI DataFormatter (not your own class!)
        DataFormatter format = new DataFormatter();
        String data = format.formatCellValue(cel);
        System.out.println("Cell value: " + data);

        // Close resources
        book.close();
        fis.close();
    }
}

//public class DataFormatter {
//
//	public static void main(String[] args) {
//		FileInputStream fis=new FileInputStream("./MultiData.xlsx");
//		
//		//Step2:-open workbook in read mode
//		Workbook book = WorkbookFactory.create(fis);
//		
//		//step:-3 get the control to the sheet
//		Sheet sh = book.getSheet("Sheet1");
//    	Row row = sh.getRow(0);
//	    Cell cel = row.getCell(0);
//
//	DataFormatter format=new DataFormatter();
//	String data = format.formatCellValue(cel);
//	System.out.println(data);
//	}
//
//}
