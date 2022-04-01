package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	
	WebDriver driver;
	SoftAssert soft = new SoftAssert();
	
	@Test()
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver","/Users/user/Documents/testing/com.medicare.frontEnd/src/test/resources/artifacts/chromedriver");
		driver=new ChromeDriver();
		driver.get("http://ec2-54-242-151-100.compute-1.amazonaws.com/");
		try {
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		String title = driver.getTitle();
		soft.assertEquals("MedicareApp",title);
		
	
		driver.findElement(By.id("empL")).click();
		try {
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		driver.findElement(By.id("exampleInputUserName1")).sendKeys("admin1");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("hello");
		driver.findElement(By.id("empS")).click();
		
		
		
		
	}

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
