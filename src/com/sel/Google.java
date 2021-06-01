package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\devaworkspace\\Sample\\src\\com\\sel");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
	    WebElement logbtn = driver.findElement(By.name("login"));
	    JavascriptExecutor j =(JavascriptExecutor)driver;
	    j.executeScript("arguments[0].setattribute('value','Greens')");
	    Object o = j.executeScript("return arguements[0].getattribute('value')", "username");
	    System.out.println(0);
	    j.executeScript("arguements[0].click()", logbtn);	
	    
	}
	
}
