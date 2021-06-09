package com.cyient.manegto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		 
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://magento.com/");
		driver.findElement(By.linkText("ganv_557")).click();
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("balaji@12345");
		driver.findElement(By.id("send2")).click();
        String su= driver.getCurrentUrl();
        
        System.out.println(su);
        
        driver.findElement(By.partialLinkText("Out")).click();
		
	}

}
