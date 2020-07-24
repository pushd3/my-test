package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Sonali\\Appium Data\\Jar Files\\chromedriver1.exe");
    WebDriver driver = new ChromeDriver();
    
//    driver.get("https://www.rediff.com/");
//    driver.manage().window().maximize();
//    driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
//    driver.findElement(By.xpath("//input[contains(@id,'logi')]")).sendKeys("MyOwnXpathRE");
//    driver.findElement(By.cssSelector("input#password")).sendKeys("MyOwncSSRE");
//    driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
//    driver.quit();
//    
    driver.get("https://www.google.com");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("News");

	}

}
