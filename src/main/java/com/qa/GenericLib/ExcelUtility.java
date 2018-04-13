package com.qa.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {
		public String filePath=null;
		public FileInputStream fis=null;
		public FileOutputStream fos=null;
		public Workbook wb=null;
		public Sheet sheet=null;
		public Row row=null;
		public Cell cell=null;
		public ExcelUtility(String filePath) throws Exception{
			this.filePath=filePath;
			fis=new FileInputStream(filePath);
			wb=WorkbookFactory.create(fis);
			wb.close();
		}
		public String getCellData(String sheetName, String columnName, int rowNum) {
			try {
				int cellNum=0;
				sheet=wb.getSheet(sheetName);
				row=sheet.getRow(0);
				for(int i=0; i<row.getLastCellNum(); i++) {
						if(row.getCell(i).getStringCellValue().trim().equals(columnName)) {
							cellNum=i;
						}
				}
				row=sheet.getRow(rowNum -1);
				cell=row.getCell(cellNum);
				return cell.getStringCellValue();
			}
			catch(Throwable e) {
				e.printStackTrace();
				return  " Data Not Found";
			}
		}
public int getLastRowNum(String sheetName)  {
				int lastRowNum=wb.getSheet(sheetName).getLastRowNum();
				return lastRowNum;
		}
}






