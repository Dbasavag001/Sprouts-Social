package com.sportsocial.UserModule;

import org.openqa.selenium.WebDriver;

import com.sportsocial.POM.CommonPage;

import com.sportsocial.POM.Uploadstatus;
import com.sportsocial.genaricUtility.ClassObjects;
import com.sportsocial.genaricUtility.FilePaths;


public class PostthestatusTestcase1 extends ClassObjects {
	static WebDriver driver;

	public static void main(String[] args) {

		String ExceptedstatusText = eu.getExcelData(FilePaths.HOME_MODULE_SHEET, 2, 1);
		String Exceptedstatusphoto = eu.getExcelData(FilePaths.HOME_MODULE_SHEET, 2, 2);

		Uploadstatus uploadstatus = new Uploadstatus(driver);
		CommonPage commonpage = new CommonPage(driver);
		commonpage.clickonuserModule();
		uploadstatus.shareThepost(ExceptedstatusText, Exceptedstatusphoto);

	}

}
