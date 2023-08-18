package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_selector_locator {

	public static void main(String[] args) {
		//manages drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximises the browser
		driver.manage().window().maximize();
		//opens URL
		driver.get("https://www.facebook.com/");
		
		//fetching the adres of email text field and giving input
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kavithashreecss");

	}

}
