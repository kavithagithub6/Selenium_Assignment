package Pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_popup {

	public static void main(String[] args) throws InterruptedException {
		//manage drivers
		WebDriverManager.chromedriver().setup();
		//opens chrome empty browser
		WebDriver driver = new ChromeDriver();
		//maximizes the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//opens URL
		driver.get("https://skillrary.com/");
		
		//handling parent window
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		//handling child window
		Set<String> child = driver.getWindowHandles();
		
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		
		//address of element in child window
		driver.findElement(By.id("mytext")).sendKeys("kavi");
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		//driver.quit(); //to close both the windows
		
		
	}

}
