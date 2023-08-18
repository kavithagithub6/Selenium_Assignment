package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_getActions {

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
		driver.get("https://www.amazon.in/");
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println("Attribute :"+ mobile.getAttribute("class"));
		System.out.println("Attribute :"+ mobile.getTagName());

		driver.close();
	}

}
