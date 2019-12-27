package tutorialselenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/Users/lbragin/Documents/JavaEclipse/geckodriver-v0.11.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
				
		}

	@Test
	public void test(){
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id='navbar']/div/div/div/ul/li[2]/a")).click();
		System.out.println("Clicked on login");
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("BlahID");
		driver.findElement(By.id("user_password")).sendKeys("passTest");
		System.out.println("Clicked on password");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Cleared field");
	}

	@After 
	public void tearDown() throws Exception{
		//driver.quit();
	}

}
