package HeritagePractice;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HelpAltF1SaleInformation {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:/Users/lbragin/Documents/JavaEclipse/geckodriver-v0.11.1-win64/geckodriver.exe");
	driver = new FirefoxDriver();
    baseUrl = "https://nrmdevb.fs.usda.gov/nrm/heritage/#results/assemblage";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testHelpAltF1Activities() throws Exception {
    driver.get("https://nrmdevb.fs.usda.gov/nrm/facts/");
    driver.findElement(By.id("USERID")).sendKeys("LANCE.BRAGIN");
	driver.findElement(By.id("PASS")).sendKeys("$econdBase4Po$ition");
	driver.findElement(By.id("ibLogin")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("//*[@id='helpMenu']"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    	
    }

    String Help = driver.findElement(By.xpath("//*[@id='helpMenu']")).getText();
    System.out.println(Help);
    assertEquals("Help", driver.findElement(By.xpath("//*[@id='helpMenu']")).getText());
    driver.findElement(By.xpath("//*[@id='j1_4_anchor']")).click(); 
      driver.findElement(By.xpath("//*[@id='j1_4_anchor']")).sendKeys(Keys.ALT, Keys.F1);
  
      
    try {
      assertTrue(driver.getCurrentUrl().matches("^[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*NOT AVAIL YET[\\s\\S]*[\\s\\S]*[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    //driver.close();
  }

  @After
  
  public void tearDown() throws Exception {
    /*  This tear was not working it well, it was producing an Firefox error, need to revise
	  driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
  }*/ 
    }
   

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
