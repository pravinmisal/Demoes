package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	WebElement recruitmentlink = driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']"));
//performing right click on the recruitment link
	Actions act = new Actions(driver);
	act.contextClick(recruitmentlink).perform();
driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//Double Click Operation
WebElement doubleclick = driver.findElement(By.xpath("//*[@id='double-click']"));
	act.doubleClick(doubleclick).perform();
	driver.switchTo().alert().accept();
	
}
}
