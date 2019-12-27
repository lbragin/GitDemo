package HeritagePractice;

import java.util.List;
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


public class HeritageElements {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String randomNumbers = RandomStringUtils.randomNumeric(4);
	private String randomAlpha = RandomStringUtils.randomAlphabetic(4);
	Utilities.WaitTypes wt; 
	
	@Before
	public void setUp() throws Exception {
		
		  
		//***below is temp fix.  perm fix is to enable protected mode in internet options but I don't have admin rights to do that
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		WebDriver driver = new InternetExplorerDriver(caps); 
		System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriver32Bit/IEDriverServer.exe");
		
		
		
		 /*
		//***below was my original code before it broke  
		//to launch Firefox
		System.setProperty("webdriver.gecko.driver", "C:/Users/lbragin/Documents/JavaEclipse/geckodriver-v0.11.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		*/
		
		
		//to launch IE
		System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriver32Bit/IEDriverServer.exe");
		////System.setProperty("webdriver.ie.driver", "C:/Users/lbragin/Documents/JavaEclipse/IEDriver/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	    	
		baseUrl = "https://nrmdevb.fs.usda.gov/nrm/heritage/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		
	}

	@Test
	public void testUntitled() throws Exception {
		//driver.get(baseUrl + "/nrm/heritage/#results/cultResource");
		
		driver.get(baseUrl);
		driver.findElement(By.id("USERID")).sendKeys("LANCE.BRAGIN");
		driver.findElement(By.id("PASS")).sendKeys("$econdBase4Po$ition");
		driver.findElement(By.id("ibLogin")).click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("j1_2_anchor")).click();
		driver.findElement(By.id("j1_1_anchor")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btnNew")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("projectName")).clear();
		driver.findElement(By.id("projectName")).sendKeys("LANCE PROJECT " + randomAlpha);
		driver.findElement(By.cssSelector("span.select2-arrow > b")).click();
		driver.findElement(By.className("select2-result-label")).click(); 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		WebDriverWait wait = new WebDriverWait(driver,15); 
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLargest")));
		driver.findElement(By.id("btnLargest")).click();
		
		Thread.sleep(5000);
		WebElement HeritagePurpose = driver.findElement(By.id("heritageRadio"));
		HeritagePurpose.click();
		
		Thread.sleep(2000);
		WebElement HeritageOther = driver.findElement(By.id("otherRadio"));
		HeritageOther.click();
		
		System.out.println("Heritage Program radio btn is selected? " + HeritagePurpose.isSelected());
		System.out.println("Other radio btn is selected? " + HeritageOther.isSelected());
		
			
		boolean isChecked = false;
		List<WebElement> radioButtons= driver.findElements(
				By.xpath("//input[contains(@type, 'radio') and contains(@name, 'purpose')]"));
		int size = radioButtons.size();
		System.out.println("Size of the list: " + size);
		for (int i=0; i<size; i++){
			isChecked= radioButtons.get(i).isSelected();
			if (!isChecked){
				radioButtons.get(i).click();
				Thread.sleep(2000);
				
		WebElement buttonElement = driver.findElement(By.id("clearBtn"));
		String elementText = buttonElement.getText();
				
		System.out.println("Text on the element is: " + elementText);
		
		WebElement element = driver.findElement(By.id("projectNumber"));
		String attributeValue = element.getAttribute("class");
		
		System.out.println("Value of attribute " + attributeValue);

			}
		}
		}
		
	/*
		@Test  //selecting combo boxes and multiselects and displaying lists
		public void testDropdown() throws Exception {
			Select sel1 = new Select(driver.findElement(By.id("")));
			Select sel2 = new Select(driver.findElement(By.id("")));
			
			List<WebElement> options = sel1.getOptions();
			int size = options.size(); 
			for (int i=0; i<size; i++){
				String optionName = sel1.getOptions().get(i).getText();
				System.out.println(optionName);
			
			//select by value
			sel1.selectByValue("");
			
			//by Index
			//sel2.selectByIndex("");			
		}		
			
		}
		*/
		
		//driver.findElement(By.cssSelector("button.btnLargest")).click();
		//driver.findElement(By.cssSelector("input[id='btnLargest']")).click();
		//driver.findElement(By.id("btnLargest")).click();
		//driver.findElement(By.name("Get Largest")).click();
		//driver.findElement(By.className("btn btn-default btn-xs")).click();
		//driver.findElement(By.className("btn btn-default btn-xs firepath-matching-node")).click();
		//driver.findElement(By.partialLinkText("Get Largest")).click();
		//driver.findElement(By.id("projectName")).click();
		
		//driver.findElement(By.xpath("//button[contains@id='btnLargest']")).click();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("projectNumber")).click();
		//driver.findElement(By.id("projectNumber")).clear();
		//driver.findElement(By.id("projectNumber")).sendKeys("R20170836" + randomNumbers);
	}

	



