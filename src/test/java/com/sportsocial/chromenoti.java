package com.sportsocial;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromenoti {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-Allnotifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/index.php#");
		driver.manage().window().maximize();
		
		FileInputStream fisw=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb= WorkbookFactory.create(fisw);
		String name = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String phno = wb.getSheet("Sheet1").getRow(2).getCell(2).toString();
		String mail = wb.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		String landline = wb.getSheet("Sheet1").getRow(4).getCell(2).toString();
		String dob = wb.getSheet("Sheet1").getRow(5).getCell(2).toString();
		String panno = wb.getSheet("Sheet1").getRow(6).getCell(2).toString();
		String citizenship = wb.getSheet("Sheet1").getRow(7).getCell(2).getStringCellValue();
		String homeaddrs = wb.getSheet("Sheet1").getRow(8).getCell(2).getStringCellValue();
		String officeaddrs = wb.getSheet("Sheet1").getRow(9).getCell(2).getStringCellValue();
		String pin = wb.getSheet("Sheet1").getRow(10).getCell(2).toString();
		String arealoc = wb.getSheet("Sheet1").getRow(11).getCell(2).getStringCellValue();
		String nominee_name = wb.getSheet("Sheet1").getRow(12).getCell(2).getStringCellValue();
		String nominee_ac_no = wb.getSheet("Sheet1").getRow(13).getCell(2).toString();
		driver.findElement(By.xpath("//li[text()='Open Account']")).click();

		driver.findElement(By.name("name")).sendKeys(name);

		WebElement gender = driver.findElement(By.name("gender"));
		Select s=new Select(gender);
		s.selectByValue("Male");
		driver.findElement(By.name("mobile")).sendKeys(phno);
		driver.findElement(By.name("email")).sendKeys(mail);
		driver.findElement(By.name("landline")).sendKeys(landline);
		;
		driver.findElement(By.xpath("//input[@name='dob']")).click();

		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(dob);
		driver.findElement(By.name("pan_no")).sendKeys(panno);
		driver.findElement(By.name("citizenship")).sendKeys(citizenship);
		driver.findElement(By.name("homeaddrs")).sendKeys(homeaddrs);
		driver.findElement(By.name("officeaddrs")).sendKeys(officeaddrs);
		WebElement state = driver.findElement(By.name("state"));
		Select s1=new Select(state);
		s1.selectByValue("Texas");
		WebElement city = driver.findElement(By.name("city"));
		Select s2=new Select(city);
		s2.selectByValue("Houston");
		driver.findElement(By.name("pin")).sendKeys(pin);
		driver.findElement(By.name("arealoc")).sendKeys(arealoc);
		driver.findElement(By.name("nominee_name")).sendKeys(nominee_name);
		driver.findElement(By.name("nominee_ac_no")).sendKeys(nominee_ac_no);
		WebElement acctype = driver.findElement(By.name("acctype"));
		
		
		Select s3=new Select(acctype);
		s3.selectByValue("Saving");
 
		driver.findElement(By.name("submit")).click();
		
		Thread.sleep(5000);
		


		driver.findElement(By.name("cnfrm-submit")).click();
	

      String[] cmdArray=new String[1];
      cmdArray[0]="C:\\Users\\Admin\\Desktop\\saveadress.exe";
      Runtime.getRuntime().exec(cmdArray,null);
           
	}
}
