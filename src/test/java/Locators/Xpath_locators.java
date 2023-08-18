package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_locators {

	public static void main(String[] args) throws Throwable{
		//manage drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//opens URL
		driver.get("https://www.facebook.com/");
		
		//fetching the address of email text field using xpath by attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kavixpath");
		
		//fetching the address of password using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("kavipass");
		
		Thread.sleep(2000);
		
		//fetching the address of forgottem password using xpath by text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		//fetching the address of forgotten password using xpath contains text
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		driver.close();
		
		
		

	}

}
