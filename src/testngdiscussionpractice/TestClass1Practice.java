package testngdiscussionpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
public class TestClass1Practice {
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
	@Test
public void login () {
	System.out.println("login to Application");
}
   @Test
public void dashboard () {
	System.out.println("Dashboard test case");
}
}
