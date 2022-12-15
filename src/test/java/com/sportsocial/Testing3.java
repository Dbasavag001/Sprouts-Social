package com.sportsocial;

import org.testng.annotations.Test;

public class Testing3 
{
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(groups = "Reg")
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(groups = "Sanity")
	public void test3()
	{
		System.out.println("Test3");
	}

}
