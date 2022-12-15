package com.sportsocial;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for (int i = 0; i < links.size(); i++)
		{
			String url = links.get(i).getAttribute("href");
			URL u=new URL(url);
			URLConnection urlconnection = u.openConnection();
		
			HttpURLConnection httpconn=(HttpURLConnection)urlconnection;
			int res = httpconn.getResponseCode();
			if(res!=200)
			{
				System.out.println(res);
				
			}
			else
			{
				System.out.println("Nthing is there ");
			}
			
		}
driver.quit();
	}

}
