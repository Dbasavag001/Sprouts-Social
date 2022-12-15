package com.sportsocial;

import java.time.Duration;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flikartpricepratcice 
{


	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		ArrayList<String> Pname=new ArrayList<String>();

		Pname.add("APPLE iPhone 11 (White, 64 GB)");
		Pname.add("APPLE iPhone 11 (White, 64 GB)");
		Pname.add("SAMSUNG Galaxy F22 (Denim Black, 128 GB)");
		Pname.add("POCO C31 (Royal Blue, 64 GB)");



		for (String string : Pname) 
		{
			WebElement price = driver.findElement(By.xpath("//div[.='"+string+"']/../..//div[@class='_30jeq3 _1_WHN1']"));



			System.out.println(price.getText());

		}

	
		driver.quit();
	}

}
