package com.sportsocial;

import org.testng.annotations.Test;

import com.sportsocial.genaricUtility.TestngBaseClass;

public class Testing1 extends  TestngBaseClass
{
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println("Test1_01");
	}
	
	@Test(groups = "Reg")
	public void test2()
	{
		System.out.println("Test1_02");
	}
	@Test(groups = "Sanity")
	public void test3()
	{
		System.out.println("Test1_03");
	}

}
