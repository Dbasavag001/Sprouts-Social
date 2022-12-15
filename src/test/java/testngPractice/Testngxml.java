package testngPractice;

import org.testng.annotations.Test;

public class Testngxml
{
	
	@Test(groups = {"sanity","regrestion"})
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups= {"sanity"})
	public void Test2() {
		System.out.println("Test 2");
	}

}
