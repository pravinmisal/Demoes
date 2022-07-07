package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe" );
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.myntra.com/");
Thread.sleep(1000);
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(7000) ;
driver.navigate().refresh();
Thread.sleep(2000);
driver.close();
}}
