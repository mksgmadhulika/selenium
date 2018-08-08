package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\gecko-driver\\geckodriver.exe");
		
		//System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getCurrentUrl());
	driver.close();

	}

}
