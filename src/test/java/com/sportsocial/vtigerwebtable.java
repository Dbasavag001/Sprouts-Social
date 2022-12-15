package com.sportsocial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vtigerwebtable {

	public static void main(String[] args) 
	
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[.='Organizations']")).click();
		 
	 String	expetd_org="LG";
		
		 List<WebElement> list_org = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]"));
		 
		 
		 
		 for (int i = 1; i < list_org.size(); i++)
		 {
			 String actual_org = list_org.get(i).getText();
			 
		  if(expetd_org.equals(actual_org))
		  {
			  driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+(i+2)+"]/td/input")).click();
			  break;
		  }
			
		}
		
		driver.quit();
		
	

	}

}
