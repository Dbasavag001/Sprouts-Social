package com.sportsocial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disablesaveusernameandpassword {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.exe --disable-web-security\r\n");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Niranjanhm44@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Niranjan123$");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		
		Thread.sleep(5000);
		
		
	}

}
