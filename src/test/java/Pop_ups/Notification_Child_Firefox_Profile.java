package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Child_Firefox_Profile {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference("dom.webnotifications.enabled", false);
		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
		

	}

}
