package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RTSWebsiteNivigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("RTS Labs", Keys.ENTER);
Thread.sleep(3000);
driver.findElement(By.xpath("//cite[text()='https://rtslabs.com']")).click();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
	}

}
