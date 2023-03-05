//****************************************************************************
//Name = Shashank Ratre
//Date = 22/05/2022
//Description = GIFT VOUCHER
package com.wipro.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wipro.testbase.Base_Class;

public class TC05  extends Base_Class {
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
	
	 @Test(priority=1)
	 public void giftvoucher() throws InterruptedException {
		
		 driver.findElement(By.linkText("Gift Certificates")).click();
	        driver.findElement(By.name("to_name")).sendKeys("Rohit");
	        driver.findElement(By.name("to_email")).sendKeys("rohitkumar@gmail.com");
	        driver.findElement(By.name("from_name")).clear();
	        driver.findElement(By.name("from_name")).sendKeys("Shashank Ratre");
	        driver.findElement(By.name("from_email")).clear();
	        driver.findElement(By.name("from_email")).sendKeys("opencart@gmail.com");
	        driver.findElement(By.name("voucher_theme_id")).click();
	        driver.findElement(By.name("message")).sendKeys("Happy Birthday Rohit...");
	        driver.findElement(By.name("amount")).clear();
	        driver.findElement(By.name("amount")).sendKeys("100");
	        driver.findElement(By.name("agree")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[8]/div/input[2]")).click();
	        
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	        Thread.sleep(5000);
	        try {
				TC05.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Gift Certificates.png") ;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.linkText("Checkout")).click();
	        Thread.sleep(5000);
	        
	   //VALIDATION 
	        
	        boolean a=  driver.findElement(By.xpath("//h1[contains(text(),'Checkout')]")).isDisplayed();
	        Assert.assertTrue(a);
	        Assert.assertEquals(a,true);
	       
	 }
	       @Test(priority=2)
	  	 public void customerservice() throws InterruptedException {
	        driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
	        driver.findElement(By.name("name")).clear();
	        driver.findElement(By.name("name")).sendKeys("Shashank");
	        driver.findElement(By.name("email")).clear();
	        driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
	        driver.findElement(By.name("enquiry")).sendKeys("Hi \"Open cart\". Hi This is 'Shashank Ratre'. My current registered address of my account is Hyderabad, So I would like to change my address to Bangalore. And also, my registered phone number is '9179414987', so I would also like to change my phone number to '9676461080'. So I kindly request you to look into my enquiry and update my respective details. Thank you.");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	        Thread.sleep(5000);
	        try {
				TC05.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Customer Service.png") ;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        String title=driver.getTitle();
	        
            Assert.assertEquals(title,"Your Store","title not matched");
	       }
	        @Test(priority=3)
		  	 public void accountupdate() throws InterruptedException {
	        driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[3]/a")).click();
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]")).click();
	        driver.findElement(By.name("telephone")).clear();
	        driver.findElement(By.name("telephone")).sendKeys("9676461087");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[4]/a")).click();
	        driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[2]/a")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.name("firstname")).clear();
	        driver.findElement(By.name("firstname")).sendKeys("Shashank");
	        driver.findElement(By.name("lastname")).clear();
	        driver.findElement(By.name("lastname")).sendKeys("Ratre");
	        driver.findElement(By.name("email")).clear();
	        driver.findElement(By.name("email")).sendKeys("opencart@gmail.com");
	        driver.findElement(By.name("telephone")).clear();
	        driver.findElement(By.name("telephone")).sendKeys("9179414987");
	        driver.findElement(By.name("order_id")).sendKeys("01121");
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[1]/div[6]/div/div/span/button/i")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/table/tbody/tr[5]/td[4]")).click();
	        driver.findElement(By.name("product")).sendKeys("MacBook");
	        driver.findElement(By.name("model")).sendKeys("Product 16");
	        driver.findElement(By.name("return_reason_id")).click();
	        driver.findElement(By.name("comment")).sendKeys("I have got different product.");
	        try {
				TC05.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Product Return.png") ;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.linkText("My Account")).click();
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	        
	        driver.findElement(By.linkText("Modify your address book entries")).click();
	        driver.findElement(By.linkText("New Address")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.name("firstname")).sendKeys("Shashank");
	        driver.findElement(By.name("lastname")).sendKeys("Ratre");
	        driver.findElement(By.name("company")).sendKeys("Wipro");
	        driver.findElement(By.name("address_1")).sendKeys("Station Road");
	        driver.findElement(By.name("address_2")).sendKeys("Seepat");
	        driver.findElement(By.name("city")).sendKeys("Bilaspur");
	        driver.findElement(By.name("postcode")).sendKeys("495001");
	        Thread.sleep(10000);
	        driver.findElement(By.name("country_id")).click();
	        driver.findElement(By.xpath("//*[@id=\"input-country\"]/option[107]")).click();
	        Thread.sleep(10000);
	        
	        driver.findElement(By.name("zone_id")).click();
	        driver.findElement(By.xpath("//*[@id=\"input-zone\"]/option[12]")).click();
	        Thread.sleep(10000);
	        
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div[2]/input")).click();
	        Thread.sleep(10000);
	        boolean b=driver.findElement(By.xpath("//body/div[@id='account-address']/div[1]")).isDisplayed();
	        Assert.assertTrue(b);
	        Assert.assertEquals(b, true);
	        try {
				TC05.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\Updated Address.png") ;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	        @Test(priority=4) 
		   	 public void logout() {
		   		 driver.findElement(By.linkText("My Account")).click();
		   	        driver.findElement(By.linkText("Logout")).click();
		   	     try {
						TC05.takeSnapShot(driver, "C:\\Users\\admin\\eclipse-workspace\\Intern_Selenium_Project_1268597_Shashank_Ratre\\Screenshots\\LogOut 5.png") ;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		   	     boolean c=  driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).isDisplayed();
			        Assert.assertTrue(c);
			        Assert.assertEquals(c,true);
		   	 }
 	 @AfterMethod
		    public void teardown() {
		   		
		   	 driver.close();
		   	}
	        }