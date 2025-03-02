package GenericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility {
	
	/**
	 * THis method is used to fetch data from excelsheet
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
		public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
		{
	          FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
			//Step2:-open workbook in read mode
			Workbook book = WorkbookFactory.create(fis);
			
			//step:-3 get the control to the sheet
		 Sheet sh = book.getSheet(sheetName);
			
			//step:-4 get the control on the row
			 Row row = sh.getRow(rowNum);
		
		   //step:-5 get the control on the cell
		 Cell cel = row.getCell(cellNum);
		
		  //step6:- fetch the data from the cell
			String value = cel.getStringCellValue();
			return value;
			}
		
		/**
		 * this method is used to fetch data from excelsheet using Formatter
		 * @param SheetName
		 * @param rowNum
		 * @param callNum
		 * @return
		 * @throws Throwable
		 */
		public String getExcelDataUsingDataFormatter(String SheetName,int rowNum,int callNum) throws Throwable
		{
	          FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			DataFormatter format= new DataFormatter();
			String value = format.formatCellValue(book.getSheet(SheetName).getRow(rowNum).getCell(callNum));
			return value;
			
		}
		
		/**
		 * this method is used to fetch data from excelsheet 
		 * @param SheetName
		 * @param rowNum
		 * @param callNum
		 * @return
		 * @throws Throwable 
		 * @throws Throwable
		 */
		
		public Object[][] readMultipleData(String SheetName) throws Throwable
		{
	          FileInputStream fis=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
			  Workbook book = WorkbookFactory.create(fis);
			  
			Sheet sh = book.getSheet(SheetName);
		   int lastRow = sh.getLastRowNum()+1;
		  int lastCell = sh.getRow(0).getLastCellNum();
			 
		  Object[][] obj = new Object[lastRow][lastCell];
		  for(int i=0; i<lastRow; i++)
		  {
			  for(int j=0; i<lastCell; j++)
			  {
				  obj[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
				  
			  }

		  }
			return obj;

		}
		
}
