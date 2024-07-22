package Vtigre;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFetching {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\AdvanceSelenium\\DRIVERS\\Excel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
	}

}
