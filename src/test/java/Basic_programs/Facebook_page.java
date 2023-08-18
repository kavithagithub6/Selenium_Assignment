package Basic_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_page {

	public static void main(String[] args) throws Throwable{
		
		//managing drivers
		WebDriverManager.chromedriver().setup();
		//opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		//entering the url
		driver.get("https://www.facebook.com/");
		
		//printing title to console
		System.out.println(driver.getTitle());
		
		//printing the current URL
		System.out.println(driver.getCurrentUrl());
		
		//delay 2 secs
		Thread.sleep(2000);
		
		//closing the window
		driver.close();
		
		

	}

}
