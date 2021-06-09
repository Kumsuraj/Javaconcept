package com.cyient.manegto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("register")).click();
        driver.findElement(By.id("firstname")).sendKeys("Kumar");
        driver.findElement(By.id("lastname")).sendKeys("Suraj");
        driver.findElement(By.id("email_address")).sendKeys("surajkum@gmail.com");
        driver.findElement(By.id("self_defined_company")).sendKeys("Cy");
        
        Select sc = new Select(driver.findElement(By.id("company_type")));
        sc.selectByVisibleText("Tech Partner");
        
        Select su = new Select(driver.findElement(By.id("individual_role")));
        su.selectByVisibleText("Technical/developer");
        
        Select sur = new Select(driver.findElement(By.id("country")));
        sur.selectByVisibleText("India");
        
        driver.findElement(By.id("agree_terms")).click();

	}

}
