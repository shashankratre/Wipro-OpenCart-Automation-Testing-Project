//****************************************************************************
//Name = Shashank Ratre
//Date = 22/05/2022
//Description = ADDING ALL THE PRODUCTS FROM A CATEGORY
package com.wipro.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wipro.testbase.Base_Class;

public class TC07 extends Base_Class {
	WebDriver driver;  
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\admin\\\\\\\\eclipse-workspace\\\\\\\\Intern_Selenium_Project_1268597_Shashank_Ratre\\\\\\\\src\\\\\\\\driverfiles\\\\\\\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://localhost/opencartsite/");
	}
	
	 @Test(priority=1)
	 public void addingsametocart() throws InterruptedException {
		 driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("ABCD1234");
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		 driver.findElement(By.linkText("Phones & PDAs")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]/i")).click();
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[1]/i")).click();
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[1]/i")).click();
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i")).click();
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
	        Thread.sleep(7000);
	        //
 // Final Check Out Page
	        
	        driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='button-shipping-address']")).click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.name("agree")).click();
	        
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        driver.findElement(By.xpath("//input[@id='button-confirm']")).click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        //To Accept Pop Up Message
	        /*
	        Alert alt = driver.switchTo().alert();

	        alt.accept();
	        driver.findElement(By.xpath("//input[@id='button-confirm']")).click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        */
	    	try 
	    	{
				TC03.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Samsung Order Placed 07 .png") ;
			} catch (Exception e11) 
	    	{
				// TODO Auto-generated catch block
				e11.printStackTrace();
			}
		    	}
		

		
	@AfterMethod
	 public void teardown() {
		 driver.close();
	 }
	 }

