package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_locator {

	public static void main(String[] args) throws Throwable{
		//manages drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximises the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlywait(DurationOf.SECONDS(10));
		
		//opens URL
		driver.get("https://www.facebook.com/");
		
		//fetching the adres of email text field and giving input
		driver.findElement(By.id("email")).sendKeys("kavithashree");
		//fetching the adres of password text field and giving input
		driver.findElement(By.id("pass")).sendKeys("kavisu");
		
		
		//address of link using linktext
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//address of link using partialLinkText
		driver.findElement(By.partialLinkText("Forgotten")).click();
	
		Thread.sleep(1000);
		
		driver.close();

	}

}
