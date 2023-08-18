package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_locator_amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximises the browser
		driver.manage().window().maximize();
		//opens URL
		driver.get("https://www.amazon.in/");
		
		
		//fetching the adres of search text field and giving input
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		
		//click on search
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		
		driver.close();

	}

}
