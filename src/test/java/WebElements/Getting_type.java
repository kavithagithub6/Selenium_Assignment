package WebElements;

//import java.awt.Point;
import org.openqa.selenium.Dimension;//maually added
import org.openqa.selenium.Point; //manually added

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_type {

	public static void main(String[] args) {
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
		
		//fetching the coordinates
		System.out.println("X and Y coordinates of email");
		Point coOrdinates = email.getLocation();
		System.out.println(coOrdinates.getX());
		System.out.println(coOrdinates.getY());
		
		//fetching the dimensions
		System.out.println("Size of email");
		Dimension size = email.getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		
		
		
		
		

	}

}
