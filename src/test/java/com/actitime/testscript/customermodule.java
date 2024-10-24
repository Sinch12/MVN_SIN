package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class customermodule {
@Test
	public void createcustomer() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		}
	}


