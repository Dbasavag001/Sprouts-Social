package com.sportsocial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amamzon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=samsung+mobile&sprefix=sa%2Caps%2C526&ref=nb_sb_ss_ts-doa-p_1_2");
		List<WebElement> list = driver.findElements(By.xpath("//span[contains( .,'Sponsored')]"));
		for (WebElement webElement : list) 
		{
			System.out.println(webElement.getText());
			
		}

	}

}
