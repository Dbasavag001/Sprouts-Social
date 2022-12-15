package com.sportsocial.signup;



import com.sportsocial.POM.CommonPage;
import com.sportsocial.POM.EditProfilePage;
import com.sportsocial.POM.LoginAction;

import com.sportsocial.genaricUtility.FilePaths;
import com.sportsocial.genaricUtility.TestngBaseClass;
public class CreateaccountsTest_1 extends TestngBaseClass
{

	public  void CreateAccount()
	{
        
		int rowcount = excelfile.getExcelData(FilePaths.CREATE_ACCOUNT_SHEET);
		
		  LoginAction login=new LoginAction(driver);
          CommonPage commonpage=new CommonPage(driver);
          EditProfilePage profile=new EditProfilePage(driver);
		for(int i=2; i<=rowcount; i++)
		{
            
			String FirstName = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 1);
			String LastName = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 2);
			String UserName = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 3);
			String Birthday = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 4);
			String BirthMonth = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 5);
			String Birthyear = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 6);
			String Gender = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 7);
			String MobileNo =excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 8);
			String Emailid = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 9);
			String Password = excelfile.getExcelData( FilePaths.CREATE_ACCOUNT_SHEET, i, 10);
			commonpage.clickonlogoutButton();
           
            
             commonpage.clickonSignupButton();
             
            profile.createProfile(webdriverutil, FirstName, LastName, UserName, Birthday, BirthMonth, Birthyear, Gender, MobileNo, Emailid, Password);
         
            try {
			String text = webdriverutil.SwitchToAlert().getText();
				System.out.println(text); 
            }catch (Exception e) {
		
			 commonpage.clickonSigninButton();
			 login.logintoapplication(Emailid, Password);
				System.out.println(FirstName+" "+LastName+ "  "+   "Account is created sucessfully");	
				commonpage.clickonlogoutButton();
			}
		}
		
		
     		
	}

}



