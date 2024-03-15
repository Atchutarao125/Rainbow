package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetching {
public static void main(String[] args) throws Throwable {
	FileInputStream fise=new FileInputStream("C:\\for_selenium\\TestNGATCHUTH\\src\\test\\resources\\testdata.xlsx ");
	Workbook wb=WorkbookFactory.create(fise);
 String data = wb.getSheet("Sheet1").getRow(6).getCell(8).getStringCellValue();
	System.out.println(data);
	
   	boolean data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
   System.out.println(data1);
   
   int data2= (int) wb.getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
  System.out.println(data2);
    
}
}
