package com.vuram.automation.Constants;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtility {
	
	
	 public static void main(String args[]) throws Exception {
		 useExcelData("Firstname");
		 
	 }
	
	public static void useExcelData(String val) throws Exception  
    {
        
             ArrayList<String> b = new ArrayList<String>();
             FileInputStream fis= new FileInputStream("C:\\Users\\sandhyan\\Desktop\\LocalWorkspace\\VuramAutomationTestingToolFreeVersion\\InputSheet\\Datasheet.xlsx");
             XSSFWorkbook wb = new XSSFWorkbook(fis);
             XSSFSheet sheet = wb.getSheet("Sheet1");
             
             Row rows = null;
             
			for(int i =0; i<sheet.getLastRowNum(); i++) {
            	 
              rows=sheet.getRow(i); 
              if(rows!=null) {
            	  Cell cells =rows.getCell(i);
            	  System.out.println("cells value" +cells);
              }
             Cell cell = rows.getCell(0);
             //String abc = cell.getStringCellValue();
             //System.out.println("printing......."+abc);
			}
             //System.out.println(rows);
             
            /* System.out.println(rows.getLastCellNum());
     for(int i=0; i< rows.getLastCellNum();i++)
     
         if(rows.getCell(i).getStringCellValue() != null)
         {
        System.out.println(rows.getCell(i).getStringCellValue());
         String value3 = rows.getCell(i).getStringCellValue();
         System.out.println(value3);
     }*/
}

}
