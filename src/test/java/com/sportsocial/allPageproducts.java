package com.sportsocial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allPageproducts {

	public static void main(String[] args) {
		
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		        String page = driver.findElement(By.xpath("//div[@class='_2MImiq']/span[1]")).getText();
				
		        int Pageno=Integer.parseInt(page.split(" ")[3]);
				
		         
		     for (int i = 0; i < Pageno; i++)
		     {
		    	 WebElement pName = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div["+i+"]//div[@class='_3pLy-c row']/div[@class='col col-7-12']/div[@class='_4rR01T']"));
		    	
		    	 WebElement price = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div["+i+"]//div[@class='_3pLy-c row']/div[@class='col col-5-12 nlI3QM']/div[@class='_3tbKJL']/div[@class='_25b18c']/div[@class='_30jeq3 _1_WHN1']"));
		       System.out.println(pName.getText()+" ------->"+price.getText());
		       
		    	 
			}
		     driver.findElement(By.xpath("//span[.='Next']")).click();
		     
		     
		   
			}

		


	}


