package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_deivision_cal {

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
			driver.get("https://www.redbus.in/");
			//address of Date
			driver.findElement(By.xpath("//span[text()='Date']")).click();
			Thread.sleep(2000);
			//selecting the date from calender pop up
			driver.findElement(By.xpath("//div[text()='Aug']/../../../..//span[text()='17']")).click();
	}

}
