package redbus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilis 
{
	public static String cellvalue;

	public static String excel(String sheetname,int rownum,int colnum) throws IOException
	{
		FileInputStream fis=new FileInputStream("F:\\SBA projects\\Narayana.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet(sheetname);
		XSSFRow row=sheet.getRow(rownum);
		XSSFCell cell=row.getCell(colnum);
		cellvalue=cell.getStringCellValue();
		return cellvalue;
	}
}
