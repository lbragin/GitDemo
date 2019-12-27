package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {

	public static void main(String[] args) {
		WebDriver driver; 
		System.setProperty("webdriver.gecko.driver", "C:/Users/lbragin/Documents/JavaEclipse/geckodriver-v0.11.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.className("title")).click();
		
		//driver.findElement(By.className("leaf")).click();
		

	}

}
