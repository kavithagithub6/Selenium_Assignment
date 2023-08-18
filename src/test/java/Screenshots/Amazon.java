package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	private static final OutputType OutputType = null;
	private static final String FILE = null;

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
		driver.get("https://www.amazon.in/");
		
		//downcasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//access the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//creating an object for physical file
		File dest = new File("./ScreenShot/amazon.png");
		FileUtils.copyFile(src,dest);
		driver.close();
		
		
		
		
		

	}

}
