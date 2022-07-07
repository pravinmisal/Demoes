package basicmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayDropDownFindElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	List<WebElement> daydropdown = driver.findElements(By.xpath("//*[@id='day']//option"));
	for(WebElement value:daydropdown) {
		String day = value.getText();
		System.out.println(day);
		if(day.equals("20")) {
			value.click();
		}
	}
}
}
