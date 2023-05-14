package readExcelDta;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
	Workbook wb2 = WorkbookFactory.create(fis2);
	Sheet sheet2 = wb2.getSheet("IPL");
	int rc = sheet2.getLastRowNum();
	
	for(int r=0;r<=rc;r++)
	{
		for(int c0=0;c0<=0;c0++)
		{
			for(int c1=1;c1<=1;c1++)
			{
				int team=10;
				
				FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				Sheet sheet = wb.getSheet("IPL");
				Row row = sheet.getRow(r);
				Cell cell = row.getCell(c0);
				Cell cell1 = row.getCell(c1);
		
				String datateam = cell.getStringCellValue();
				String datacaptain = cell1.getStringCellValue();
				
				for(int l=0;l<=team;l++)
				{
					if(datateam.length()!=team)
					{
						datateam=datateam+" ";
					}
				}
				System.out.print(datateam);
				System.out.println(datacaptain);
			}
				
		}
	}
	
}
}

//FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
//Workbook wb = WorkbookFactory.create(fis);
//Sheet sheet = wb.getSheet("IPL");
//Row row = sheet.getRow(r);
//Cell cell = row.getCell(c);
//Cell cell1 = row.getCell(c+1);
//String datateam = cell.getStringCellValue();
//String datacaptain = cell1.getStringCellValue();
//System.out.print(datateam+"             :");
//System.out.println(datacaptain);


//for(int r=0;r<=10;r++)
//{
//	for(int c0=0;c0<=0;c0++)
//	{
//		for(int c1=1;c1<=1;c1++)
//		{
//			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
//			Workbook wb = WorkbookFactory.create(fis);
//			Sheet sheet = wb.getSheet("IPL");
//			Row row = sheet.getRow(r);
//			Cell cell = row.getCell(c0);
//			Cell cell1 = row.getCell(c1);
//			String datateam = cell.getStringCellValue();
//			String datacaptain = cell1.getStringCellValue();
//			System.out.print(datateam+"             :");
//			System.out.println(datacaptain);
//		}
//			
//	}
//}