package com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class is a generic class contains non static method to read datra from 
 * property and excel file
 * @author Sipun
 *
 */
public class FileLibrary {
	/**
	 * This method is a non static method used to read data from property file.
	 * @param key
	 * @return 
	 * @throws IOException
	 */
     public String readDataFromPropertyFile(String key) throws IOException {
    	 FileInputStream fis= new FileInputStream("./testdata/commonfile.property");
    	 Properties p=new Properties();
    	 p.load(fis);
    	String value=p.getProperty(key);
    	return value;
     }
     /**
      * This method is non static method used to read data from excel sheet.
      * @param sheet
      * @param row
      * @param cell
      * @return
      * @throws EncryptedDocumentException
      * @throws IOException
      */
     public String readDataFromExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
    	 FileInputStream fis =new FileInputStream("./testdata/ABNKINGInfo.xlsx");
    	 Workbook wb = WorkbookFactory.create(fis);
    	 String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		 return value;
     }
     
}
