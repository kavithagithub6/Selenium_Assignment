package Basic_programs;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_launch {

	public static void main(String[] args) {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		//opening chrome  browser
		ChromeDriver driver = new ChromeDriver();
		
	}

}
