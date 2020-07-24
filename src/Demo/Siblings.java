package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Sonali\\Appium Data\\Jar Files\\chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//button[text()='Practice']")).click();
        System.out.println("Got1");
        
		driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).click();
		System.out.println("Got2");

		System.out.println(driver.findElement(By.xpath(".//button[text()='Practice']/parent::div")).getAttribute("style"));
		

		}
}

