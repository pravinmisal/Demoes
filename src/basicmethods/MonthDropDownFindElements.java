package basicmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonthDropDownFindElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\selenium\\chromedriver_win32\\lastchrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	List<WebElement> monthdropdown = driver.findElements(By.xpath("//*[@id='month']//option"));
	for(WebElement value:monthdropdown) {
		String month = value.getText();
		System.out.println(month);
		if(month.equals("Aug")) {
			value.click();
		}
	}
}
}
