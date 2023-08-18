package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_snapdeal {

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
		driver.get("https://www.snapdeal.com/");
		
		//address of sign in
		WebElement signIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));

		//creating an object for Actions class
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform(); //for mouse over action
		Thread.sleep(2000);
		//address of Register
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		Thread.sleep(2000);
		//handling frame through index
		//driver.switchTo().frame(0); //not preferable
		
		//handling frame using id
		driver.switchTo().frame("loginIframe");
		
		//handling frame using name
		//driver.switchTo().frame("iframeLogin");
		
		//address of textfield in frame
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kavi");
		Thread.sleep(2000);
		//adress of close icon
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		
		//shifting control to web page
		driver.switchTo().defaultContent();
	}

}
