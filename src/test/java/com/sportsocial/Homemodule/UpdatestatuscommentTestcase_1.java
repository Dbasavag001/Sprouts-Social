package com.sportsocial.Homemodule;


import org.testng.annotations.Test;

import com.sportsocial.POM.Uploadstatus;

import com.sportsocial.genaricUtility.FilePaths;

import com.sportsocial.genaricUtility.TestngBaseClass;

public class UpdatestatuscommentTestcase_1 extends TestngBaseClass {

	@Test
	public void UpadteandCommentStatus() {

		// Scenario Login to Bio-Book application In Home module write a status and add
		// photo and share the post
		// after that verify the post is present if yes comment to that post

		String ExceptedstatusText = excelfile.getExcelData(FilePaths.HOME_MODULE_SHEET, 2, 1)
				+ javautil.getradomNo(100);
		String Exceptedstatusphoto = excelfile.getExcelData(FilePaths.HOME_MODULE_SHEET, 2, 2);
		String commentforpost = excelfile.getExcelData(FilePaths.HOME_MODULE_SHEET, 2, 3);

		Uploadstatus uploadstatus = new Uploadstatus(driver);

		uploadstatus.shareThepost(ExceptedstatusText, Exceptedstatusphoto);
		uploadstatus.commenttopost(ExceptedstatusText, Exceptedstatusphoto, commentforpost);
		uploadstatus.verifythepost(ExceptedstatusText);
		uploadstatus.deletethepost(ExceptedstatusText);

	}

}
