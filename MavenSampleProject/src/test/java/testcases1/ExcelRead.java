package testcases1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
public class ExcelRead {
	@DataProvider(name="Credentials")
	public static String[][] getData() throws IOException {
	//public static void main(String ar[]) {
		File excelfile=new File("C:\\Users\\Basil\\Downloads\\login_credentials.xlsx");
		System.out.println(excelfile.exists());
	    FileInputStream fis=new FileInputStream(excelfile);
	    XSSFWorkbook workbook=new XSSFWorkbook(fis);
	    XSSFSheet sheet =workbook.getSheet("Sheet1");
	    int rowCount=sheet.getPhysicalNumberOfRows();
	    int colCount=sheet.getRow(0).getLastCellNum();
	    System.out.println("col"+ colCount);
	    System.out.println("row" + rowCount);
	    String[][] data=new String[rowCount-1][colCount];
	    for(int i=0;i<rowCount-1;i++)
	    {
	    	for(int j=0;j<colCount;j++) {
	    		DataFormatter df=new DataFormatter();
	    		data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
	    	
	    	}
	    	
	    }
	    workbook.close();
	    fis.close();
	    //for (String[] dataArr : data) {
			//System.out.println(Arrays.toString(dataArr));
		 //}
     return data;
//
	}
}
