package com.selenium.assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SheetCompare {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fr = new FileInputStream("C:\\Users\\HEMA\\Desktop\\SeleniumProject.xlsx");
		
		Workbook wb = WorkbookFactory.create(fr);
		Sheet sh1 = wb.getSheet("Sheet1");
		Sheet sh2 = wb.getSheet("Sheet2");
		if(sh1.getLastRowNum() == sh2.getLastRowNum())
		{
			Mainloop:
			for (int i = 0; i <= sh1.getLastRowNum(); i++) 
			{
				Row r1 = sh1.getRow(i);
				Row r2 = sh2.getRow(i);
				for (int j = 0; j < r1.getLastCellNum(); j++) 
				{
					Cell c1 = r1.getCell(j);
					Cell c2 = r2.getCell(j);
					String data1 = c1.toString();
					String data2 = c2.toString();
					if(!data1.equals(data2))
					{
						System.out.println("Sheet are different");
						break Mainloop;
					}
				}
				if (i == sh1.getLastRowNum()) 
					System.out.println("Sheet are same");
			}	
		}
		else 
			System.out.println("Sheet are different");
	}
}

