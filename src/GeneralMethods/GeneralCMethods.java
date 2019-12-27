package GeneralMethods;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GeneralCMethods {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String randomNumbers = RandomStringUtils.randomNumeric(4);
	private String randomAlpha = RandomStringUtils.randomAlphabetic(4);

	
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
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		
		
	}

	@Test
	public void testUntitled() throws Exception {
		driver.findElement(By.id("USERID")).sendKeys("LANCE.BRAGIN");
		driver.findElement(By.id("PASS")).sendKeys("$econdBase4Po$ition");
		driver.findElement(By.id("ibLogin")).click();

		WebDriverWait wait = new WebDriverWait(driver,15); 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("clearBtn")));
		driver.findElement(By.id("clearBtn")).click();
		
		WebElement buttonElement = driver.findElement(By.id("searchBtn"));
		String elementText = buttonElement.getText();
		
		System.out.println("Text on the element is: " + elementText);

			}
	/*
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit():
	}
	*/
	}
					
	

	



