package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Safariexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.gecko.driver","C:\\gecko-driver\\geckodriver.exe");
 
 
 WebDriver driver= new FirefoxDriver();
 
 driver.get("https://www.google.com/");
 driver.navigate().to("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("kanthasrigowri@gmail.com");
 driver.findElement(By.name("pass")).sendKeys("mKsg#15021989");

 
 
 driver.findElement(By.linkText("Forgot account?")).click();
 		
	}
	

}
