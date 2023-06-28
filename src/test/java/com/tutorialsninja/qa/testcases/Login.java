package com.tutorialsninja.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	
	WebDriver driver;
	
	@AfterMethod
	public void QuitBrowser () {
		driver.quit();
	}
	@Test
	public void verifyLogin ()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://yopmail.com/en/email-generator");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
=======
		driver.findElement(By.id("input-email")).sendKeys(Keys.chord(Keys.CONTROL,"a"),"ABCD");
		driver.findElement(By.id("input-password")).sendKeys(Keys.chord(Keys.CONTROL,"a"),"123");

		
		
		String warningAlert = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		String expectedWarningAlert = "Warning: No match for E-Mail Address and/or Password";

		Assert.assertTrue(warningAlert.contains(expectedWarningAlert), expectedWarningAlert + " is displaying as expected");
		

		
	}
}
