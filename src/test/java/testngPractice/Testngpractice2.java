package testngPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testngpractice2
{
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before class 2");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class 2");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite 2");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite 2");
	}
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method 2");
	}
	
	

	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test 2");
	}
	
	@org.testng.annotations.AfterTest
	public void afterTest()
	{
		System.out.println("After Test 2");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test  case 2 is passed");
	}
	
	

}
