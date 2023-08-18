package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement_extra {

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
		driver.get("https://www.amazon.in/");
		
		//address of search text field
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("computers");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
