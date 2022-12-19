package com.sportsocial.Homemodule;

import java.io.File;

import org.testng.annotations.Test;

import com.sportsocial.POM.Uploadstatus;
import com.sportsocial.genaricUtility.BaseClassAdmin;
import com.sportsocial.genaricUtility.FilePaths;

public class AddStatusTest extends BaseClassAdmin {
	Uploadstatus uploadstatus;
	String expectedText;
	String expectedImage;
	File file;
	
	@Test
	public void addStatusWithPhoto() throws InterruptedException {
		uploadstatus= new Uploadstatus(driver);
		expectedText = excelfile.getExcelData(FilePaths.HOME_MODULE_SHEET, 10, 0)+javautil.getradomNo(100);
		expectedImage = excelfile.getExcelData(FilePaths.HOME_MODULE_SHEET, 18, 1);
		file=new File(expectedImage);
		String expImage = file.getAbsolutePath();
				
		System.out.println(expectedText);
		System.out.println(expImage);
		uploadstatus.shareThepost(expectedText, expImage);
	}

}
