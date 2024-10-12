package com.example;

import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mahesh");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement login = driver.findElement(By.xpath("//div[text() = 'Log in']"));
		
		username.click();
		username.sendKeys("Mahesh");
		
		password.click();
		password.sendKeys("Raj");
		
		login.click();
		
		 
		//driver.close();
		

	}

}
