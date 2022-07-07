package basicmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	
	ChromeDriver cd= new ChromeDriver();
	WebDriver driver= new ChromeDriver();
	RemoteWebDriver rwd=new ChromeDriver();
}
}
