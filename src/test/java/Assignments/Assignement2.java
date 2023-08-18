package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement2 {

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
		//address of create a page link
		WebElement page = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		
		//locate x & y coordinates
		Point coOrdinates = page.getLocation();
		System.out.println("X and Y coordinates");
		System.out.println(coOrdinates.getX());
		System.out.println(coOrdinates.getY());
		
		System.out.println("Attribute :"+ page.getAttribute("class"));
		System.out.println("Tag name :"+ page.getTagName());
		
		driver.close();
	}

}
