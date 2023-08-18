package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("kavi");
		driver.findElement(By.id("pass")).sendKeys("shree");
	}
	@Test
	public void click()
	{
		driver.findElement(By.id("login")).click();
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
	
}
