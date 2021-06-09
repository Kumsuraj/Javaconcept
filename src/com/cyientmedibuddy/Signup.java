 package com.cyientmedibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Signup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		driver.get("https://www.medibuddy.in/");
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Signup")).click();
		//Thread.sleep(5000);
		driver.findElement(By.name("firstName")).sendKeys("Suraj");
		driver.findElement(By.name("phone")).sendKeys("8578456700");
		driver.findElement(By.name("username")).sendKeys("surajkuma@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sur@12345");
		 driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
		 driver.findElement(By.name("employeeId")).sendKeys("457");
		 //Select selectYear=new Select(driver.findElement(By))
		driver.findElement(By.xpath("//span[text()='Male']")).click();

	}

}
