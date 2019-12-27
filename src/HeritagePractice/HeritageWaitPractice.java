package HeritagePractice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utilities.WaitTypes;


public class HeritageWaitPractice {
	private WebDriver driver;
	private String baseUrl;
	WaitTypes wt; 
	
	@Before
	public void setUp() throws Exception {
		
		  /*
		//***below is temp fix.  perm fix is to enable protected mode in internet options but I don't have admin rights to do that
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver = new InternetExplorerDriver(caps); 
		System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriver32Bit/IEDriverServer.exe");
		  */
		
		
		//  /*
		//***below was my original code before it broke  
		//to launch Firefox
		System.setProperty("webdriver.gecko.driver", "C:/Users/lbragin/Documents/JavaEclipse/geckodriver-v0.11.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		// */
		
		  /*
		//to launch IE
		System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriver32Bit/IEDriverServer.exe");
		////System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	      */
	
		baseUrl = "https://nrmdevb.fs.usda.gov/nrm/heritage/";
		driver.manage().window().maximize();
			
	}

	@Test
	public void testUntitled() throws Exception {
		//driver.get(baseUrl + "/nrm/heritage/#results/cultResource");
		
		driver.get(baseUrl);
		WebElement PASS = wt.waitForElement(By.id("PASS"), 3);
		PASS.click();
		wt.clickWhenReady(By.id("USERID"), 3);		
			
			}
		}
	



