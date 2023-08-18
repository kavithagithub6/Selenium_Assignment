package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_WithCoordinates {

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
		
		//address of career
		WebElement career = driver.findElement(By.xpath("//a[text()='Career']"));
		//location of link to get coordinates
		Point point = career.getLocation();
		int x = point.getX();
		int y = point.getY();
		
		//downcasting
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scroll using co ordinates
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",career);
	}

}
