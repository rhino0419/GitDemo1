package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {

	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void test1() {
		System.out.println("Open Browser");
		System.out.println("India");
		System.out.println("sri lanka");
		
		System.out.println("Australia");
		System.out.println("USA");
		
		
		
		
		Assert.assertEquals(true, true);//Hard assertion
		
		System.out.println("Enter username");
		System.out.println("Enter Password");
		System.out.println("Click on sign in button");
		
		softAssert.assertEquals(true, false,"Home page title is not correct");//Hard assertion
		
		System.out.println("Validate homePage");
		
		softAssert.assertEquals(true, false);//Hard assertion
		
		System.out.println("Go to deals page");
		System.out.println("Create a deal");
		
		System.out.println("Go to contacts page");
		System.out.println("Create a contacts");
		
		softAssert.assertAll();
	}
}
