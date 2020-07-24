package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sonali\\Appium Data\\Jar Files\\chromedriver1.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.spicejet.com/");
	    driver.manage().window().maximize();
	    
	    Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    s.selectByValue("INR");
	    
	    driver.findElement(By.id("divpaxinfo")).click();
	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	    Select sn = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	    sn.selectByValue("5");
	    driver.findElement(By.id("divpaxinfo")).click();
	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}	

}
