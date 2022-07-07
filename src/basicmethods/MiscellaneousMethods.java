package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscellaneousMethods {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admine");
driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@name='Submit']")).click();
WebElement textmessage = driver.findElement(By.xpath("//*[@id='spanMessage']"));
String value = textmessage.getText();
System.out.println(value);
}
}
