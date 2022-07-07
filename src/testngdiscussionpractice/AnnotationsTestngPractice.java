package testngdiscussionpractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
public class AnnotationsTestngPractice {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before Suite is Executing");
	}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After Suite is Executing");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test executing");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After test executing");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("before method");
	}
	@AfterMethod
	public void am() {
		System.out.println("after method");
	}
	@Test
public void logintest() {
	System.out.println("Log in To Application");
}	
	@Test
public void logouttest() {
	System.out.println("Logout To Application");
}
}
