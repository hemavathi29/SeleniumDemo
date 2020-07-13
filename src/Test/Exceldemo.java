package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldemo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//to read the excel file from the local system use fileInputStream.
		FileInputStream fr = new FileInputStream("C:\\Users\\HEMA\\Desktop\\SeleniumProject.xlsx");
		
		Workbook wb = WorkbookFactory.create(fr);//create the object of workbookfactory
		Sheet sh = wb.getSheet("Sheet1");//using workbook object get the corresponding sheet
		
//		Row rw = sh.getRow(4);//using that particular sheet get which row should be selected
//		Cell c =  rw.getCell(2);//use the row selected the actual cell need to be displayed
//		String name = c.toString();//we will be not knowing which datatype is used take a value and convert it to string
//		System.out.println(name);
//		System.out.println(sh.getFirstRowNum());
//		System.out.println(sh.getLastRowNum());
		
		for (int i = sh.getFirstRowNum(); i <= sh.getLastRowNum(); i++) 
		{
			Row r = sh.getRow(i);
			for (int j = r.getFirstCellNum(); j < r.getLastCellNum(); j++) 
			{
				Cell cw = r.getCell(j);
				String str = cw.toString();
				System.out.print(str+ " ");	
			}
			System.out.println();
		}
	}
}		
//		
//		System.out.println(sh.getFirstRowNum());
//		System.out.println(sh.getLastRowNum());
//		
//		for (int i = sh.getFirstRowNum(); i <= sh.getLastRowNum() ; i++) 
//		{	
//			Row rw = sh.getRow(i);
//			
//			Cell c1 =  rw.getCell(0);
//			
//			String name =  c1.toString();
//			
//			System.out.println("name =" +  name);
//		}
//	}
//}
