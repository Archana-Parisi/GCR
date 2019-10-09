package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//import jxl.Cell;
//import jxl.Sheet;
//import jxl.Workbook;
//import jxl.read.biff.BiffException;


import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataDriven {
	
	WebDriver driver;
	
	@Test(dataProvider="testdata")
	public void adminLogin(String uname,String pwd){
		System.setProperty("webdriver.chrome.driver","C:/Users/Prayag/Downloads/chromedriver1_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/admin");
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("tdb1")).click();
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "http://www.gcrit.com/build3/admin/index.php");
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}

	@DataProvider(name="testdata")    
	public Object[][] readExcel() throws IOException, InvalidFormatException{
//	public static void main (String [] args) throws IOException, InvalidFormatException{
		
		File f = new File("C:/Users/Prayag/Desktop/New Microsoft Office Excel Worksheet.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s = w.getSheet("Sheet1");
		int i=0,k =0;
	    Iterator<Row> riterator=s.iterator();
	    while (riterator.hasNext()){
	    	Row row=riterator.next();
	   // 	i++;
	    	Iterator<Cell> citerator= row.cellIterator();
	    	while (citerator.hasNext()){
	    		Cell cell = citerator.next();
	    		k++;
	    //		System.out.println(cell);
	    	
	    	}
	    	i++;
	    }
	    int j =k/i;
	/*    System.out.println("number of rows are" +i);
	    System.out.println("number of cells are" +k);
	    
	    System.out.println("Number of columns are" +j);
	*/    
	    
	String inputData[][] = new String [i][j];
		for(int a=0;a<i;a++) {
			for (int b=0;b<j;b++){			
			        inputData[a][b]=s.getRow(a).getCell(b).getStringCellValue();
	//			System.out.println(inputData[a][b]);
			}
		}
		
		return inputData;
     	}
	
	
	}     
	


