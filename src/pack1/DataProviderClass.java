package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.*;

public class DataProviderClass {
	@Test(dataProvider = "getData")
	public void setData(String username,String password) {
		System.out.println("Username : "+username);
		System.out.println("Password : "+password+"\n");
	}
/*
 *The below class provides data from an excel .XLS file:  
 */
@DataProvider
public void getData() throws Exception{ 
	//Object[][] data=new Object[100][2];
	//ArrayList[][] data = new ArrayList[][];
	
	try {
		FileInputStream fis=new FileInputStream("./resources/DataproviderClass.xlsx");
		XSSFWorkbook wb=XSSFWorkbookFactory.createWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		for(int i=0;i<sheet.getLastRowNum();i++) {
			XSSFRow row=sheet.getRow(i);
			for(int j=0;i<2;j++) {
				XSSFCell cell=row.getCell(j);
				//data[i][j]=cell.getStringCellValue();
				System.out.println(cell.getStringCellValue());
				}
			fis.close();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

  }
}
