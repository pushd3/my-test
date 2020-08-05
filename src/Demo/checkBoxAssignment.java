package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkBoxAssignment {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sonali\\Appium Data\\Jar Files\\chromedriver1.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.manage().window().maximize();	    
	    driver.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    driver.findElement(By.id("checkBoxOption1")).click();
	    Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	    
	}
}
