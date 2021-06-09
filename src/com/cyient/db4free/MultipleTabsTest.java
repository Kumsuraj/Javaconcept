package com.cyient.db4free;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.db4free.net/");
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		Set<String> multi= driver.getWindowHandles();
		for(String m: multi)
		{
			driver.switchTo().window(m);
			if(driver.getTitle().equals("phpMyAdmin"))
			{
				break;
			}
		}
		driver.findElement(By.id("input_username")).sendKeys("surajkumar");
		driver.findElement(By.id("input_password")).sendKeys("Sur@12345");
		driver.findElement(By.id("input_go")).click();
	}

}
