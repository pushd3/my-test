package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sonali\\Appium Data\\Jar Files\\chromedriver1.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.spicejet.com/");
	    Thread.sleep(5000);
	    driver.manage().window().maximize(); 
	    
	        // Dynamic dropdown ( without select tag and options )  
		    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@value='DEL']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		    //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		    
		    //Select current date in calendar
		    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		    
		    // Validating element enabled or disabled
		    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		    {  System.out.println("its Disabled");
               Assert.assertTrue(true);            }
		    else
		    {  Assert.assertTrue(false);           }   
		    
		    
		    //Dropdown using select tag
		    driver.findElement(By.id("divpaxinfo")).click();
		    Select sn = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		    sn.selectByValue("5");
		    driver.findElement(By.id("divpaxinfo")).click();
		    
		    Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		    s.selectByValue("INR");	 
		    
		    //Selecting checkbox
		    driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();  
		    
		    //Click Search
		    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		   
	      
	    
	    
	}
	
}
