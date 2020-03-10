package AutomateGmail;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Gmailteszt {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\test\\drivers\\geckodriver.exe");
		 FirefoxOptions options  = new FirefoxOptions();
		 options.addArguments("--disable-popup-blocking", "true");
		 FirefoxProfile profile = new FirefoxProfile();
		 profile.setAcceptUntrustedCertificates(true);
		 profile.setAssumeUntrustedCertificateIssuer(false);
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("marionette", true);
		 capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		 capabilities.setCapability("acceptInsecureCerts", true);
		 
	     //   options.setCapability("excludeSwitches", "disable-popup-blocking");
	 WebDriver  driver = new FirefoxDriver(options);
	 
	        driver.get("https://sso-qa.2adpro.com/login?gotoUrl=https://dam-qa.2adpro.com/");
	        driver.findElement(By.id("username")).sendKeys("reporting4");
	        driver.findElement(By.id("loginBtn")).click();
	        driver.findElement(By.id("password")).sendKeys("welcome@123");
	        driver.findElement(By.id("loginBtn")).click();
	        driver.findElement(By.className("filter-text")).click();
	        driver.findElement(By.id("iNWkQnABwCjtEViuZJ4y")).click();
	       
		/*
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
		 * capabilities.setCapability(ChromeOptions.CAPABILITY, options); driver = new
		 * GeckoDriver(capabilities);
		 */
	     //Actions ac=new Actions(driver);
	     
	       //Alert alert= driver.switchTo().alert();
	       //alert.accept();
	        driver.findElement(By.xpath("//div[@class='filter-item clrBtnWrap']")).click();
	        

	}

}
