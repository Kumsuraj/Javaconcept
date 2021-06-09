package com.cyient.multipletabs;

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
		driver.get("https://www.online.citibank.co.in/");
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
        System.out.println("tab1");
        String title=driver.getTitle();
        System.out.println(title);
        String tab1=driver.getWindowHandle();
        System.out.println(tab1);
        Set<String> tabSession=  driver.getWindowHandles();
        for(String tabsession: tabSession )
        {
        	System.out.println(tabsession);
        	driver.switchTo().window(tabsession);
        	String currentTitle=driver.getTitle();
        	System.out.println(currentTitle);
        }
	}

}