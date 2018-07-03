package com.demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumtest1 {
	@Test
	public void testgithudlogin()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b7c.06.13\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.id( "login_field")).sendKeys("kalakshmiswathi");
		driver.findElement(By.id("password")).sendKeys("Swathi@123");
		driver.findElement(By.name("commit")).click();
		
	    String title= driver.getTitle();
	    Assert.assertEquals(title, "GitHub");
	    System.out.println("continue with test code");
		System.out.println("Morning");
	}

}
