package com.maven.demo.MyMavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestOpenApp {
	
	
	@Test
	public void openApp() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.myhcl.com");
		driver.close();
	}

}
