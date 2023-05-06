import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FinalPROJECT extends parameter {
	@Test()
public void A() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
	driver.findElement(By.name("login[username]")).sendKeys("mukhtarbayan97@gmail.com");
	 driver.findElement(By.name("login[password]")).sendKeys("WCcEMVX3:KXsh4k");
	driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
	Thread.sleep(3000);
	WebElement titleresult = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span"));
	 String Actualtitleresult= titleresult.getText();
	 String Ecpectedtitleresult ="Welcome, Bayan Omar!";
	 myAssertion.assertEquals(Actualtitleresult, Ecpectedtitleresult);
	myAssertion.assertAll();}
		 
	@Test()
	public void B () throws InterruptedException {
	
		String[] search = {"Jacket", "t-shirt", "jeans for men", "jeans for women","pants"};
	    int random_search	=rand.nextInt(0,5);
	    driver.findElement(By.id("search")).sendKeys(search[random_search]+Keys.ENTER);
	    driver.findElement(By.id("search")).clear();
	   
	    Thread.sleep(4000);
	    }
		
	

	@Test()
	public void C() throws InterruptedException  {
		
		
		List<WebElement> elements_product = driver.findElements(By.className("product-item"));
		
		
	     for(
	    		 
	    		 int i=0;i<elements_product.size();i++) {
	    	 List<WebElement> elements_product1 = driver.findElements(By.className("product-item"));
	    	 if(i==0) { Thread.sleep(3000);
		    elements_product1.get(i).click();
			List<WebElement> element_size = driver.findElements(By.cssSelector("[class=\"swatch-option text\"]"));
		    int random_size= rand.nextInt(5);
			List<WebElement> element_color = driver.findElements(By.cssSelector("[class=\"swatch-option color\"]"));
			int random_color= rand.nextInt(3);
	        Thread.sleep(3000);
			element_size.get(random_size).click();
			element_color.get(random_color).click();
			Thread.sleep(3000);
			driver.findElement(By.id("qty")).clear();
			driver.findElement(By.id("qty")).sendKeys("3");
			
			driver.findElement(By.id("product-addtocart-button")).click();
			 Thread.sleep(3000);
			driver.navigate().back();
			}
	        if(i==1) {  
	        Thread.sleep(4000);
	       elements_product1.get(i).click();
		    Thread.sleep(3000);
			List<WebElement> element_size = driver.findElements(By.cssSelector("[class=\"swatch-option text\"]"));
		    int random_size= rand.nextInt(5);
			List<WebElement> element_color = driver.findElements(By.cssSelector("[class=\"swatch-option color\"]"));
	        int random_color= rand.nextInt(3);
	        Thread.sleep(3000);
			element_size.get(random_size).click();
			element_color.get(random_color).click();
			Thread.sleep(3000);
			driver.findElement(By.id("qty")).clear();
			driver.findElement(By.id("qty")).sendKeys("2");
			driver.findElement(By.id("product-addtocart-button")).click();
			 Thread.sleep(3000);
			driver.navigate().back();
			}
	        if(i==2) {  
		        Thread.sleep(4000);
		      
			    elements_product1.get(i).click();
			    Thread.sleep(3000);
				List<WebElement> element_size = driver.findElements(By.cssSelector("[class=\"swatch-option text\"]"));
			    int random_size= rand.nextInt(5);
				List<WebElement> element_color = driver.findElements(By.cssSelector("[class=\"swatch-option color\"]"));
		        Thread.sleep(3000);
				element_size.get(random_size).click();
				element_color.get(0).click();
				Thread.sleep(3000);
				driver.findElement(By.id("qty")).clear();
				driver.findElement(By.id("qty")).sendKeys("4");
				driver.findElement(By.id("product-addtocart-button")).click();
				 Thread.sleep(3000);
				driver.navigate().back();
				}
	     
	        if(i==3) {  
		        Thread.sleep(4000);
		     
			    elements_product1.get(i).click();
			    Thread.sleep(3000);
				List<WebElement> element_size = driver.findElements(By.cssSelector("[class=\"swatch-option text\"]"));
			    int random_size= rand.nextInt(5);
				List<WebElement> element_color = driver.findElements(By.cssSelector("[class=\"swatch-option color\"]"));
		        int random_color= rand.nextInt(3);
		        Thread.sleep(3000);
				element_size.get(random_size).click();
				element_color.get(random_color).click();
				driver.findElement(By.id("product-addtocart-button")).click();
				 Thread.sleep(3000);
				driver.navigate().back();
				}
	     
	        if(i==4) {  
		        Thread.sleep(4000);
		      
			    elements_product1.get(i).click();
			    Thread.sleep(3000);
				driver.findElement(By.id("qty")).clear();
				driver.findElement(By.id("qty")).sendKeys("4");
				driver.findElement(By.id("product-addtocart-button")).click();}}
	        	

	    	 }
	    	
			
		@Test()
		public void D () throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
			driver.findElement(By.id("top-cart-btn-checkout")).click();
			Thread.sleep(30000);
			driver.findElement(By.name("company")).sendKeys("Al_Bayan_Company");
			driver.findElement(By.name("street[0]")).sendKeys("Al_abrar");
		
			driver.findElement(By.name("city")).sendKeys("Amman");
			Thread.sleep(3000);
			driver.findElement(By.name("postcode")).sendKeys("11789");
			WebElement country = driver.findElement(By.name("country_id"));
			Select select=new Select(country);
			 select.selectByValue("JO");
		driver.findElement(By.name("telephone")).sendKeys("0770370205");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[class=\"button action continue primary\"]")).click();
		
		   
		
		 
		 
		 
		 
		}

		@Test()
		public void E() throws InterruptedException {Thread.sleep(5000);
		 WebElement OrderTotal = driver.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[3]/td/strong/span"));
		String OrdarTotalText=OrderTotal.getText();
		String OrdarTotalText1=OrdarTotalText.replace("$","");
		double actualOrderTotal = Double.parseDouble(OrdarTotalText1);
		double expextecOrdarTotal =253.20;
		myAssertion.assertEquals(actualOrderTotal,expextecOrdarTotal );
		myAssertion.assertAll();
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();}

	@Test(invocationCount=5)
	public void F () throws InterruptedException {
		 Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"block-collapsible-nav\"]/ul/li[2]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr/td[6]/a[2]")).click();
	   Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
			Thread.sleep(9000);
			driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
			 Thread.sleep(7000);
			driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")).click();
			 Thread.sleep(2000);
			
		
		  }
		
			
		

		@Test()
		public void G () {
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
			driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
			List<WebElement> Price = driver.findElements(By.className("price"));
		String P1 =	Price.get(0).getText();
		String	P2 =	Price.get(1).getText();
		String	P3	= Price.get(2).getText();
		String	P4 =	Price.get(3).getText();
		String	P5	= Price.get(4).getText();
		System.out.println(Price.size());
//   if(P1.equals(P2)) {System.out.println(true);}
//  else System.out.println(false);
//  if(P2.equals(P3)) {System.out.println(true);}
//   else System.out.println(false);
//  if(P3.equals(P4)) {System.out.println(true);}
//  else System.out.println(false);
//  if(P4.equals(P5)) {System.out.println(true);}
//    else System.out.println(false);
	
			if(P1==P2&&P2==P3&&P3==P4&&P4==P5) {System.out.println(true);
				
			}
			else 
	
				 System.out.println(false);
		 
	}}
			 
			 
			 
			 
			 
			 
		 
		
		
