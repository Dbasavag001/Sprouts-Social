package com.sportsocial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroolbar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://btp.gov.in/");
		JavascriptExecutor jss= (JavascriptExecutor)driver; 
	//	driver.findElement(By.xpath("//*[@id=SideTabEnglish]")).click();
		WebElement link = driver.findElement(By.xpath("(//div[@class='hesder-icon'])[4]"));
		//*[@id="SideTabEnglish"]
		//jss.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		jss.executeScript("arguments[0].scrollIntoView();", link);
		Thread.sleep(4000);
		driver.quit();
			

	}

}
