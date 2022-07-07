package testngdiscussionpractice;

import org.testng.annotations.Test;

public class SingleClassExecutionPractice2 {
	@Test(priority=1)
	public void login() {
		System.out.println("login to Application");
	}

	@Test(priority=2)
	public void dashboard() {
		System.out.println("Dashboard Test Cases");

	}

	@Test(invocationCount=5,priority=-4)
	public void profile() {
		System.out.println("profile Test Cases");

	}

	@Test(priority=3)
	public void home() {
		System.out.println("home test cases");

	}

	@Test
	public void logout() {
		System.out.println("logout test cases");

	}
}
