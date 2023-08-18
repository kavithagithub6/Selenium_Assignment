package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement3 {

	public static void main(String[] args) throws Throwable {
		//manage drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//opens URL
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		Thread.sleep(2000);
		
		//handling frame using name
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(2000);
		//address of some link in handled frame
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		Thread.sleep(2000);
		//shifting control to web page
		driver.switchTo().defaultContent();
		
		//handling frame using name
		driver.switchTo().frame("packageFrame");
		Thread.sleep(2000);
		//address of some class 
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		Thread.sleep(2000);
		//shifting control to web page
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//click on help
		driver.findElement(By.xpath("(//a[text()='Help'])[2]")).click();
		//driver.findElement(By.xpath("(//a[@href='help-doc.html'])[1]")).click();
		Thread.sleep(2000);
	}	

}
