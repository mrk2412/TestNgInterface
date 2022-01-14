package Listener_Demo;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;             		

@Listeners(test.class)			

public class listener {				
WebDriver driver= new FirefoxDriver();					

//Test to pass as to verify listeners.		
@Test		
public void Login()				
{		
    driver.get("http://demo.guru99.com/V4/");					
    driver.findElement(By.name("uid")).sendKeys("Mahesh24");							
    driver.findElement(By.name("password")).sendKeys("Zxcvbnm.");							
}		

@Test		
public void closeDriver()				
{		
    driver.close();
    System.out.println("Test passed Successfully");
}		
}