package com.cyient.dynmic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.royalcaribbean.com/account/create");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("mat-input-1")).sendKeys("Suraj");
        driver.findElement(By.id("mat-input-2")).sendKeys("Kumar");
        driver.findElement(By.xpath("//span[text()='Month']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'April')]")).click();
        driver.findElement(By.xpath("//span[text()='Day']")).click();
        driver.findElement(By.xpath("//span[text()=' 4 ']")).click();
        driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2002");
        driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
        driver.findElement(By.xpath("//span[text()=' India ']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("suraj@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sur@12345");
        driver.findElement(By.xpath("//span[contains(text(),' What was the first concert you attended? ')]")).click();
        driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("Ssssss");
        driver.findElement(By.xpath("//input[@type='checkbox']//..")).click();
      
       
        	      
        	      
        	    
		
	}

}
