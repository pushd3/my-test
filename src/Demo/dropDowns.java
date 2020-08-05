package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sonali\\Appium Data\\Jar Files\\chromedriver1.exe");
	    WebDriver driver = new ChromeDriver();
	 /*   driver.get("https://www.spicejet.com/");
	    driver.manage().window().maximize(); */
	    
	    
	  // dropdown with Select tag and options.  
	  /*  Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    s.selectByValue("INR");	    
	    driver.findElement(By.id("divpaxinfo")).click();	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());	    
	    Select sn = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    sn.selectByValue("5");
	    driver.findElement(By.id("divpaxinfo")).click();	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());    */
	    
	    
	    
	    
	  // Dynamic dropdown ( without select tag and options )  
	  /*  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='BLR']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	    //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	    //Select current date in calendar
	    driver.findElement(By.cssSelector("[class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
      */
	    
	    
	  // Validating if UI Element is disabled or enabled with Attributes
	  // System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

	 /*   System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

	    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

	    {

	    System.out.println("its enabled");

	    Assert.assertTrue(true);

	    }

	    else

	    {

	    Assert.assertTrue(false);

	    }   */
	    
      
	  // Autosuggestive dropdown
       driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       driver.manage().window().maximize();
       driver.findElement(By.id("autosuggest")).sendKeys("ind");
       Thread.sleep(3000);
       List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
       
       for (WebElement option : options)
       {
    	   if (option.getText().equalsIgnoreCase("India"))
    	   {
    		   option.click();
    		   break;
    	   }
       }

	}	

}
