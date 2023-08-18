package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_type {

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
		driver.get("https://www.facebook.com/");
		
		//address of email textfield
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kavithashree.r@gmail.com");
		Thread.sleep(2000);
		email.clear();
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.submit();
		
		driver.close();
		
		
		
				

	}

}
