package com.sportsocial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartproductnameandprice
{

	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
        //String page = driver.findElement(By.xpath("//div[@class='_2MImiq']/span[1]")).getText();
		
		 List<WebElement> Pname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
         
     for (int i = 0; i < Pname.size(); i++)
     {
    	// WebElement pName = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div["+i+"]//div[@class='_3pLy-c row']/div[@class='col col-7-12']/div[@class='_4rR01T']"));
    	 String Mname = Pname.get(i).getText();
    	 WebElement price = driver.findElement(By.xpath("//div[.='"+Mname+"']/../../div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']"));
       System.out.println(Mname+" ------->"+price.getText());
       
    	 
	}
   
	}

}
