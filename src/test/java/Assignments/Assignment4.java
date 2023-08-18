package Assignments;

//open login page of fb and enter url and user credentials with out hardcoding

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws Throwable {
		//create an object for properties class
		Properties p = new Properties();
		
		//create an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties.txt");
		//loading fis
		p.load(fis);
		String Url = p.getProperty("url");
		String brow = p.getProperty("browser");
		System.out.println("Data"+Url+brow);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Url);
		
		//user credentials
		String email = p.getProperty("username");
		String pass = p.getProperty("password");
		
		//address of email
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}

}
