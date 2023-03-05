//****************************************************************************
//Name = Shashank Ratre
//Date = 10/05/2022
//Description = Automation Of Registration And Add to Cart in OpenCart 
package com.wipro.testcases;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC01 {
	WebDriver driver;  
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\src\\driverfiles\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://localhost/opencartsite/");
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
	 public void registration() throws InterruptedException {
   
        //registration
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Shashank");
        driver.findElement(By.name("lastname")).sendKeys("Ratre");
        driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("9179414987");
        driver.findElement(By.name("password")).sendKeys("ABCD1234");
        driver.findElement(By.name("confirm")).sendKeys("ABCD1234");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        Thread.sleep(5000);
        boolean a=  driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed();
        Assert.assertTrue(a);
        Assert.assertEquals(a,true);
        try {
			TC01.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Registration.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 @Test(priority=2) 
     public void contactus() throws InterruptedException {
 		 driver.findElement(By.linkText("My Account")).click();
 		 driver.findElement(By.linkText("Login")).click();
 		 driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
 		 driver.findElement(By.name("password")).sendKeys("ABCD1234");
 		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
 		 driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
     driver.findElement(By.name("enquiry")).sendKeys("Hi This is 'Shashank Ratre'. My current registered address of my account is Hyderabad, So I would like to change my address to Bangalore. And also, my registered phone number is '9179414987', so I would also like to change my phone number to '9676461080'. So I kindly request you to look into my enquiry and update my respective details. Thank you.");
     driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
  //driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
     boolean b=driver.findElement(By.linkText("Contact Us")).isDisplayed();
     Assert.assertTrue(b);
     Assert.assertEquals(b, true);
     try {
			TC01.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\ContactUs.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
       @Test(priority=3) 
       
        public void review() throws InterruptedException {
    		 driver.findElement(By.linkText("My Account")).click();
    		 driver.findElement(By.linkText("Login")).click();
    		 driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
    		 driver.findElement(By.name("password")).sendKeys("ABCD1234");
    		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
    		 driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
        driver.findElement(By.name("enquiry")).sendKeys("Hi This is 'Shashank Ratre'. My current registered address of my account is Hyderabad, So I would like to change my address to Bangalore. And also, my registered phone number is '9179414987', so I would also like to change my phone number to '9676461080'. So I kindly request you to look into my enquiry and update my respective details. Thank you.");
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
        
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[2]/i")).click();
        Thread.sleep(10000);
    		 driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")).click();
    		  Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/ul[2]/li[3]/a")).click();
        Thread.sleep(4000);
        
        driver.findElement(By.name("text")).sendKeys("Hi guys. I tried this product. Its performance is very good. It has many different new features. I recommend to try the product for sure. It is very good.");
        driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[4]/div/input[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"button-review\"]")).click();
        
        try {
			TC01.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Review.png") ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       }
        @Test(priority=4) 
        public void wishlist() throws InterruptedException {
        	 driver.findElement(By.linkText("My Account")).click();
    		 driver.findElement(By.linkText("Login")).click();
    		 driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
    		 driver.findElement(By.name("password")).sendKeys("ABCD1234");
    		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
            driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]")).click();
            Thread.sleep(10000);
            //Euro Price
            driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i")).click();
            driver.findElement(By.name("EUR")).click();
            String price=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[5]/div")).getText();
            System.out.println("EURO               " + price);
            // Pound Sterling Price
            driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i")).click();
            driver.findElement(By.name("GBP")).click();
            price=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[5]/div")).getText();
            System.out.println("POUND STERLING     " + price);
            // US Dollar Price
            driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/i")).click();
            driver.findElement(By.name("USD")).click();
            price=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[5]/div")).getText();
            System.out.println("US DOLLAR          " + price);
            // Add to cart
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button/i")).click();
            Thread.sleep(10000);
            //Remove from wish list
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/a/i")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
            Thread.sleep(10000);
            //Logout
            driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
            Thread.sleep(10000);
            String title=driver.getTitle();
     
            Assert.assertEquals(title,"Your Store","title not matched");
            
            try {
    			TC01.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\WishList.png") ;
    		} catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        } 
     @AfterMethod() 
        public void teardown() {
        driver.close();
        }
}
	 

