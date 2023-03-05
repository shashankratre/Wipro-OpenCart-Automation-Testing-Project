//****************************************************************************
//Name = Shashank Ratre
//Date = 17/05/2022
//Description = Automation of Product Comparison
package com.wipro.testcases;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC02 {
	static WebDriver driver;  
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Intern_Selenium_Project_1268597_Shashank_Ratre\\\\src\\\\driverfiles\\\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://localhost/opencartsite/");
		 
		 driver.findElement(By.linkText("My Account")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
		 driver.findElement(By.name("password")).sendKeys("ABCD1234");
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}
	
	//Automated ScreenShot Code
		public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception
		{
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)webdriver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File(fileWithPath);
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
		}
		
		 @Test(priority=1)
		 public static void productcamp() {
		
	WebElement el =	 driver.findElement(By.name("search"));
	           el.sendKeys("apple");
	 // Keys.ENTER with sendKeys
               el.sendKeys(Keys.ENTER);
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 driver.findElement(By.name("category_id")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.name("sub_category")).click();
		 driver.findElement(By.xpath("//*[@id=\"button-search\"]")).click();
		 driver.findElement(By.linkText("Phones & PDAs")).click();
		 driver.findElement(By.xpath("//*[@id=\"input-sort\"]")).click();
		 try {
		
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		

		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[3]/i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[3]/i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[3]/i")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 driver.findElement(By.xpath("//*[@id=\"compare-total\"]")).click();
			try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Compare Total.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 driver.findElement(By.linkText("HTC Touch HD")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 
			try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Added To Cart.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 {
		 driver.findElement(By.linkText("shopping cart")).click();
		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try {
			TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Shopping Cart.png") ;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
			try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\CheckOut.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		// driver.findElement(By.linkText("Checkout")).click();
		 
		  /*  driver.findElement(By.name("firstname")).sendKeys("Shashank");
	        driver.findElement(By.name("lastname")).sendKeys("Ratre");
	        driver.findElement(By.name("address_1")).sendKeys("Station Road");
	        driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("Bilaspur");
	        driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("01234");
	        
	        // for drop down select 
	         
	        new Select(driver.findElement(By.xpath("//select[@id='input-payment-country']"))).selectByValue("Bolivia");
	        new Select(driver.findElement(By.xpath("//select[@id='input-payment-zone']"))).selectByValue("Chaguanas");
	        */
	        driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) 
		 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	    	try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Order Placed.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 }
		 }
		 @Test(priority=2)
		 public void orderhistory() throws InterruptedException {
		 driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[2]/a")).click();
		  driver.findElement(By.linkText("Continue")).click();
		 driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).click();
			try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Subscribe_Unsubscribe.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 driver.findElement(By.linkText("Specials")).click();
		 Thread.sleep(15000);
			try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Specials.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 driver.findElement(By.xpath("//*[@id=\"grid-view\"]/i")).click();
			try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Grid View.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 }
		 @Test(priority=3) 
	   	 public void logout() {
	   		 driver.findElement(By.linkText("My Account")).click();
	   	        driver.findElement(By.linkText("Logout")).click();
	   	 	try {
				TC02.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\LogOut.png") ;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	   	 }
	    @AfterMethod
	   	 public void teardown() {
	   		
	   	 driver.close();
	   	} 
		 
		 
		 
		 
		 
		  
		 	 
}

