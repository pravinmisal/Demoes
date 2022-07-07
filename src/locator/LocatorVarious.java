package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorVarious {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//WebElement username = driver.findElement(By.name("txtUsername"));
//username.sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
//driver.findElement(By.className("button")).submit();
//driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.partialLinkText("got your")).click();
}
}
