package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagname_locator {

	public static void main(String[] args) {
		//manages drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximises the browser
		driver.manage().window().maximize();
		//opens URL
		driver.get("https://www.facebook.com/");
		
		//fetching all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement allLinks:links)
		{
			System.out.println(allLinks.getText());
		}
		


	}

}
