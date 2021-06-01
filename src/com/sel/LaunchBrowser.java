package com.sel;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\devaworkspace\\Sample\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		TakesScreenshot t = (TakesScreenshot)driver;
		File Source = t.getScreenshotAs(OutputType.FILE);
	    Date d = new Date();
	    int s = d.getSeconds();
		
		File Target = new File("C:\\Users\\Lenovo\\eclipse-workspace\\devaworkspace\\Sample\\Target\\ins_"+s+".png");
        FileUtils.copyFile(Source, Target);
		
		
				
		
		
	}
	
}
