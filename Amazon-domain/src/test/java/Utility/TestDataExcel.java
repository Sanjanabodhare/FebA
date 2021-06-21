package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataExcel {

public static String excel(int i,int j) throws EncryptedDocumentException, IOException {
		
		String data = null;

		FileInputStream file=new FileInputStream("C:\\Users\\PRAVIN BODHARE\\Desktop\\Xpath\\Xpath1.xlsx");
		
		Sheet c =WorkbookFactory.create(file).getSheet("Sheet1");
		
		Cell d= c.getRow(i).getCell(j);
				 try 
				 {
					  data=d.getStringCellValue();
				 }
				catch(IllegalStateException e)
				 {
					double v =d.getNumericCellValue();
					 data =String.valueOf(v+" ");
				 }
		return data;	 
	}
}
