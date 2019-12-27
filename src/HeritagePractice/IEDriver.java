package HeritagePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriver {

	public static void main(String[] args) {
		
		//***below is temp fix.  perm fix is to enable protected mode in internet options but I don't have admin rights to do that
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver = new InternetExplorerDriver(caps); 
		
		//***below was my original code before it broke  
		//WebDriver driver;
		System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriver32Bit/IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		
		String baseURL = "https://nrmdevb.fs.usda.gov/nrm/heritage/";
		
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		
		driver.findElement(By.id("USERID")).sendKeys("LANCE.BRAGIN");
		driver.findElement(By.id("PASS")).sendKeys("!itcher1Po$ition");
		//ibLogin
		driver.findElement(By.id("ibLogin")).click();
		
		
	}

}








