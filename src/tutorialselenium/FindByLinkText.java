package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) throws Exception  {
		WebDriver driver; 
		System.setProperty("webdriver.gecko.driver", "C:/Users/lbragin/Documents/JavaEclipse/geckodriver-v0.11.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		//Thread.sleep(10000); 
		//driver.findElement(By.linkText("Shipping")).click();
		//driver.findElement(By.partialLinkText("shipping")).click();
		///html/body/div[1]/div[1]/div[3]/div[1]/div/div[4]/div/ul/li[4]/a/span
		
		Thread.sleep(10000); 
		driver.findElement(By.partialLinkText("x-cart")).click();
	
	
	}

}
