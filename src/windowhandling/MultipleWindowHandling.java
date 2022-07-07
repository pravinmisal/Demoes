package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	String parentid = driver.getWindowHandle();
	System.out.println("parentid is:"+parentid);
	
	WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
	link.click();
	link.click();
	link.click();
	Set<String> allwindowid = driver.getWindowHandles();

	int numberofid = allwindowid.size();
	System.out.println(numberofid);
	
}
}
