package testngPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testngpractice1 
{
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before class  1 ");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class 1");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite 1");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite 1");
	}
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method 1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method 1");
	}
	
	

	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test 1");
	}
	
	@org.testng.annotations.AfterTest
	public void afterTest()
	{
		
		System.out.println("After Test 1");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test  case 1 is passed");
	}
	

}
