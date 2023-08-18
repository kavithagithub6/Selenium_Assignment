package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_click {

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
		driver.get("https://demoapp.skillrary.com/");
		//address of course
		WebElement course = driver.findElement(By.id("course"));
		//creating an object for Actions class
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();
		Thread.sleep(2000);
		//address of selenium training
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		//address + button
		WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		
	    a.doubleClick(plus).perform();
	    Thread.sleep(2000);
	    driver.close();
	}

}
