package com.cyient.redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='mobileNoInp']")));
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("7583009867");
		
	}

}
