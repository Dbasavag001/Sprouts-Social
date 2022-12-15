package com.sportsocial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicWebtable
{

	public static void main(String[] args) 
	{ 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButt")).click();
		driver.findElement(By.xpath("//td[@class='tabUnSelected']/a[.='Organizations']")).click();

		String page = driver.findElement(By.xpath("//span[@name='Accounts_listViewCountContainerName']")).getText();

		int pageNO = Integer.parseInt(page.split(" ")[1]);
		String	expetd_org="Abc";
		boolean count = false;
		for (int i = 0; i < pageNO; i++)
		{

			List<WebElement> list_org = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]"));

			for (int j = 0; j < list_org.size(); j++)
			{
				String actual_org = list_org.get(j).getText();

				if(expetd_org.equals(actual_org))
				{
					driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+(j+2)+"]/td/input")).click();
					count = true;
					break;
				}

			}
			if(count) break;

			driver.findElement(By.xpath("//a[@alt='Next']")).click();
			WebElement load_status = driver.findElement(By.xpath("//div[@id='status']"));
			wait.until(ExpectedConditions.invisibilityOf(load_status));
		}
		//driver.quit();

	}

}
