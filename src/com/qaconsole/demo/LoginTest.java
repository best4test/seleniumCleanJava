package com.qaconsole.demo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	static WebDriver driver;
    static Wait<WebDriver> wait;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
//		System.setProperty("webdriver.gecko.driver","C:\\tools\\geckodriver-v0.15.0.exe");
//		driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver_2.29.exe");
		driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
        driver.get("http://demo.qaconsole.com/");

	}

	@Test
	public void test_ASDF1234() {
		 driver.findElement(By.name("email")).sendKeys("guest@qaconsole.com");
		 driver.findElement(By.name("password")).sendKeys("guest2017");         
         driver.findElement(By.cssSelector(".btn-lg")).click();
	     wait.until(new ExpectedCondition<Boolean>() {
	    	 public Boolean apply(WebDriver webDriver) {
	    		 System.out.println("Waiting ...");
	    		 return webDriver.findElement(By.cssSelector(".panel-danger")) != null;
	    	 }
	     });
	}
	
	@Test
	public void ztest_ASDF0015() {
		 driver.findElement(By.name("email")).sendKeys("guest@qaconsole.com");
	}
	
	 @AfterClass
	 public static void closeBrowser(){
		 driver.quit();
	 }

}
