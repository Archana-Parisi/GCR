package testing;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Intdatadriven {
	
	@Test (dataProvider="testdata")
	public void add(String num1,String num2,String num3,String num4){
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = Integer.parseInt(num3);
		int d = Integer.parseInt(num4);
		int result = a+b+c+d;
		Assert.assertEquals(result, a+b+c+d);
	}

	@DataProvider (name="testdata")
	public Object[][] readexcel() throws InvalidFormatException, IOException {
		File f = new File("C:/Users/Prayag/Desktop/New Microsoft Office Excel Worksheet.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s = w.getSheet("Sheet2");
		
	Iterator<Row> riterator=s.iterator();
		int i=0,k=0,j;
			while (riterator.hasNext()){
			Row rows=riterator.next();
		    Iterator<Cell> citerator =rows.cellIterator();
		  
		    while (citerator.hasNext()){
		    Cell cells=citerator.next();
		    k++;
		   
	//	    System.out.println(cells);
		}
		    i++;
		}
		j=k/i;
System.out.println("number of rows"+i+ "Number of cols"+j);   
String intData[][]= new String[i][j];	
   for (int a=0;a<i;a++){
	   for(int b=0;b<j;b++){
			   intData[a][b]=s.getRow(a).getCell(b).getRawValue();
	    //       System.out.println(intData[a][b]);
		   
	   }
   }
return intData;    
}
}
