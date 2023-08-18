package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	@org.testng.annotations.DataProvider
	//@DataProvider 
	public Object[][] getData()
	{
		Object[][] a = new Object[3][2];
		a[0][0] = "asassa";
		a[0][1] = "1234";
		
		a[1][0] = "testwq";
		a[1][1] = "2345";
		
		a[2][0] = "hjhjhj";
		a[2][1] = "3456";
		
		return a;
	}
	
	@Test(dataProvider="getData")
	public void demo(String username,String pwd)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
	}
	
}
