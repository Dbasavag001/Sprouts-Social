package com.sportsocial.database;


import com.sportsocial.genaricUtility.ClassObjects;

public class readdatafromdbtestcase1 extends ClassObjects
{

	public static void main(String[] args)  
	{

      du.connectToDataBase("jdbc:mysql://localhost:3306/Niranjan", "root", "root");
      du.executeQuerytoread("select*from login_Creditinal");
      du.readDatafromDB("username");
      du.readDatafromDB("password");
      du.disconnetFromDataBase();  
    
		
	}

}
