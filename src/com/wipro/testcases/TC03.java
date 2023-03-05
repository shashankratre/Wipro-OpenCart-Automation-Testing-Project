//****************************************************************************
//Name = Shashank Ratre
//Date = 21/05/2022
//Description = Adding Phone to Cart From HomePage
package com.wipro.testcases;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03 {
	WebDriver driver;  
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\admin\\\\\\\\eclipse-workspace\\\\\\\\Intern_Selenium_Project_1268597_Shashank_Ratre\\\\\\\\src\\\\\\\\driverfiles\\\\\\\\chromedriver.exe");
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
	 public void addphone() throws InterruptedException {
		 
		 driver.findElement(By.linkText("Tablets")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[1]/a/img")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
	       Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	       Thread.sleep(2000);
	        
	    	try 
	    	{
				TC03.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Samsung Tab.png") ;
			} catch (Exception e1) 
	    	{
				// TODO Auto-generated catch block
				e1.printStackTrace();
	    	}
       	    Thread.sleep(10000);
      
	        }
	        @Test(priority=2) 
	       public void checkout() throws InterruptedException 
	        {
	        	 driver.findElement(By.linkText("Tablets")).click();
	 	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[1]/a/img")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[1]/li[1]/a/img")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("/html/body/div[2]/div/button[2]")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click();
	 	       Thread.sleep(1000);
	 	        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
	 	       Thread.sleep(2000);
	 	      driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]")).click();
	 	       Thread.sleep(1000);
	 	       // TO SELECT ACCORDIAN BOX
	 	      driver.findElement(By.xpath("//body/div[@id='checkout-cart']/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).click();
	             Thread.sleep(1000);
	             try 
	 	    	{
	 				TC03.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Accordian Clicked.png") ;
	 			} catch (Exception e1) 
	 	    	{
	 				// TODO Auto-generated catch block
	 				e1.printStackTrace();
	 	    	}
	             
	      
	        new Select(driver.findElement(By.xpath("//select[@id='input-country']"))).selectByValue("2");
	        Thread.sleep(2000);
	        new Select(driver.findElement(By.xpath("//select[@id='input-zone']"))).selectByValue("33");
	        Thread.sleep(2000);
	        
	        try 
	    	{
				TC03.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Billing Zone.png") ;
			} catch (Exception e1) 
	    	{
				// TODO Auto-generated catch block
				e1.printStackTrace();
	    	}
	   
	        driver.findElement(By.xpath("//button[@id='button-quote']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//body/div[@id='modal-shipping']/div[1]/div[1]/div[2]/div[1]/label[1]/input[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='button-shipping']")).click();
	        Thread.sleep(2000);
	        
	        //EXTERNAL LINK 
	        
	        driver.findElement(By.linkText("Checkout")).click();
	        Thread.sleep(2000);
	        try 
	    	{
				TC03.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\CheckOut Page.png") ;
			} catch (Exception e1) 
	    	{
				// TODO Auto-generated catch block
				e1.printStackTrace();
	    	}
	        
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
				TC03.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Samsung Order Placed .png") ;
			} catch (Exception e11) 
	    	{
				// TODO Auto-generated catch block
				e11.printStackTrace();
			}
		    	}
		 
	       // Thread.sleep(5000);
	        
	 @Test(priority=3) 
	 public void logout() {
		 driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.linkText("Logout")).click();
	    	try 
	    	{
				TC03.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\LogOut 2.png") ;
			} catch (Exception e1) 
	    	{
				// TODO Auto-generated catch block
				e1.printStackTrace();
	    	}
			
	 }
	 @AfterMethod
	 public void teardown() {
		
	 driver.close();
	}
}
