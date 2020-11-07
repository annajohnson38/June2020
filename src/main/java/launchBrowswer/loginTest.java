package launchBrowswer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {
	public static void main(String[] args) {
		
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\jude7\\eclipse-workspace\\FirstSeleniumProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	}
}
