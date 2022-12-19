package com.sportsocial.Homemodule;

import org.testng.annotations.Test;

import com.sportsocial.POM.Uploadstatus;
import com.sportsocial.genaricUtility.BaseClassAdmin;

public class AddStatusTest extends BaseClassAdmin {
	
	@Test
	public void addStatusWithPhoto() {
		Uploadstatus uploadstatus= new Uploadstatus(driver);
		uploadstatus.shareThepost(null, null);
		
	}

}
