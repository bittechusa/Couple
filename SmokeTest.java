package com.bit.ui.test;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {
	
	@Test
	public void a() throws FileNotFoundException{
		
		
		FileInputStream s=new FileInputStream("config.properties"); 
		Properties p=new Properties();
		FirefoxDriver f=new FirefoxDriver();
		f.navigate().to("url");
		List<WebElement> list=f.findElementsByTagName("a");
		for(WebElement moga:list){
			
			moga.click();
			
		}
		
		
		
		
		
	}
	

}
