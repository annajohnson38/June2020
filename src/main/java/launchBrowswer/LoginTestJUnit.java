package launchBrowswer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJUnit {
	WebDriver driver;
		
	
	@Before
	public void launchBrowswer () {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jude7\\eclipse-workspace\\FirstSeleniumProject\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get ("https://www.techfios.com/billing/?ng=admin/");
	driver.manage ().window().maximize();
	
}
	
	@Test
	
	public void loginTest () {

	driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.name("login")).click();
	
	}
	@Test
	public void loginTest1 () {
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void tearDown () {
	
	driver.close();
	
	}
	
}
