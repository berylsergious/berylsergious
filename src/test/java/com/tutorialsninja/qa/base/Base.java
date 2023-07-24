package com.tutorialsninja.qa.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	
	
	
	public static String getUserInfoFromEmail () {
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get("https://yopmail.com/en/email-generator");
		
		
		String Username = driver.findElement(By.xpath("//span[@class=\"genytxt\"]")).getText();
		return Username;
		
	}
	
}
