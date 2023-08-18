package Basic_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_program {

	public static void main(String[] args) throws Throwable{
		//manages drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximises the browser
		driver.manage().window().maximize();
		//opens URL
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//navigating to another URL
		driver.navigate().to("http://amazon.com/");
		Thread.sleep(5000);
		
		//navigating to back page
		driver.navigate().back();
		Thread.sleep(5000);
		
		//navigating to forward page
		driver.navigate().forward();
		Thread.sleep(5000);
		
		//refresh page
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//close browser
		driver.close();
		

	}

}
