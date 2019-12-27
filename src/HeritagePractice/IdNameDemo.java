package HeritagePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdNameDemo {

	public static void main(String[] args) {

			WebDriver driver; 
			System.setProperty("webdriver.gecko.driver", "C:/Users/lbragin/Documents/JavaEclipse/geckodriver-v0.11.1-win64/geckodriver.exe");
			driver = new FirefoxDriver();
			//String baseURL = "http://www.google.com";
			//String baseURL = "https://www.eauth.usda.gov/Login/login.aspx?ZONE=Z2&TRYIWA=TRUE&TYPE=33554433&REALMOID=06-e6757b07-3328-4173-823b-c781dca5804e&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-kz0Rqa%2fd59GAs5NEOPEvs%2bvL32fD1BXWqem8Rccm5p0lJs4OGDHYbzcbi16V9R1f1fjlDaU0roq8asxXbmDJuzM%2f6p7%2fsUymXNtzaH0MOnXaH20nu2DpAPtkByYzzZI9&TARGET=-SM-https%3a%2f%2fnrmdevb%2efs%2eusda%2egov%2fnrm%2fheritage%2f";
			String baseURL = "https://nrmdevb.fs.usda.gov/nrm/heritage/";
			//String baseURL = "https://nrmdevb.fs.usda.gov/nrm/heritage/#results/project";
					
			driver.manage().window().maximize();
			driver.get(baseURL);
			
			driver.findElement(By.name("USERID")).sendKeys("LANCE.BRAGIN");
			driver.findElement(By.name("PASS")).sendKeys("!itcher1Po$ition");
			//ibLogin
			driver.findElement(By.name("ibLogin")).click();
			
		}


	}