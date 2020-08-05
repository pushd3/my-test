package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sonali\\Appium Data\\Jar Files\\chromedriver1.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.cleartrip.com/");
	    Thread.sleep(1000);
	    driver.manage().window().maximize();
	    
	    Select sa = new Select(driver.findElement(By.id("Adults")));
	    sa.selectByValue("4");
	    Select sc = new Select(driver.findElement(By.id("Childrens")));
	    sc.selectByValue("2");
	    
	    driver.findElement(By.id("DepartDate")).click();
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	    
	    driver.findElement(By.id("MoreOptionsLink")).click();
	    
	    driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Ind");
	    Thread.sleep(2000);
	    List<WebElement> options = driver.findElements(By.cssSelector("ul[id='ui-id-3'] li"));
	    
	     for (WebElement option : options)
	    	 
	     {
	    	 if (option.getText().equalsIgnoreCase("Air India (AI)"))
	    	 {
	    		 option.click();
	    		 break;
	    	 }
	     }
	     
	     driver.findElement(By.id("SearchBtn")).click();
	     
	     System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	    

	}

}
