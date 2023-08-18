package Autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable{
		//manage drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//opens URL
		driver.get("https://www.google.com/");
		
		//address of search field
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
		Thread.sleep(2000);
		//address of autosuggestion
		List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(2000);
		//size of Autosuggestion
		System.out.println(list.size());
		
		for(WebElement b:list)
		{
			System.out.println(b.getText());
		}
				
		driver.close();
	}

}
