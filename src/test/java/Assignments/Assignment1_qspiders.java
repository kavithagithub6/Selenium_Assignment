package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_qspiders {

	public static void main(String[] args) throws Throwable{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://online.qspiders.com");
		
		//address of email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kavithashree.r@gmail.com");
		Thread.sleep(2000);
		//address of password
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9880457799");
		Thread.sleep(2000);
		//address of login
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).submit();
		Thread.sleep(2000);

	}

}
