package hybrid_framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_connection 
{
	public static FileInputStream fi;
	public static String path="test-data//";
	public static XSSFWorkbook book;
	public static XSSFSheet sht;
	
	public static void E_connection(String filename, String sheetname)
	{
		try {
			fi=new FileInputStream(path+filename);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//E_connection-method close
		
	public static String get_celldata(int row, int col)
		{
			String celldata=sht.getRow(row).getCell(col).getStringCellValue();
			return celldata;
			
		}
	
	
	
}//class close