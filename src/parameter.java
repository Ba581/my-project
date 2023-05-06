import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class parameter {
	WebDriver driver;
	SoftAssert myAssertion;
	Random rand;
	Actions aa ;
	
	@BeforeTest
	public void setup(){
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");  
		 driver = new ChromeDriver(options);
		 myAssertion=new SoftAssert();
		 rand = new Random();
		 aa=new Actions( driver);
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	}
	@AfterTest
	public void closed() {
//		driver.close();
		
	}
}
