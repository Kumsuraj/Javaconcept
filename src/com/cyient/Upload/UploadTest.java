package com.cyient.Upload;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.naukri.com/");
		 File file=new File("File/profile.docx");
		 String profilePath=file.getAbsolutePath();
		 System.out.println(profilePath);
		 driver.findElement(By.id("file_upload")).sendKeys(profilePath);
		 //driver.findElement(By.id("file_upload")).sendKeys("C:\\Users\\sk59152\\Desktop\\Automation\\java_workspace\\SeleniumConcept2\\File\\java.doc");

	}

}
