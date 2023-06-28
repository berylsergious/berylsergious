package com.tutorialsninja.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup () {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
	}
	
	@AfterMethod
	public void QuitBrowser () {
		driver.quit();
	}
	@Test
	public void registerNewUser ()
	{
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("not");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("sure");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("not");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("12347");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("not");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("not");
		driver.findElement(By.xpath("//input[(@name='newsletter' and @value='1')]']")).click();
		driver.findElement(By.xpath("//input[(@name='agree' and @value='1')]")).click();
		driver.findElement(By.xpath("//input[(@type='submit' and @value='Continue')]")).click();
		
		
		
		
		

		
	}
}
