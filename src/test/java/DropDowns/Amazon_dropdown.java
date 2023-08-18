package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_dropdown {

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
		
		//address of the dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//create object for select class to handle dropdown
		Select s = new Select(dropdown);
		s.selectByIndex(8);
		Thread.sleep(2000);
		s.selectByValue("search-alias=fashion");
		Thread.sleep(2000);
		s.selectByVisibleText("Beauty");
		Thread.sleep(2000);
		
		//to check if it is multiple or single dropdown
		System.out.println(s.isMultiple());
		
		//print options to console
		List<WebElement> values = s.getOptions();
		
		for(WebElement b:values)
		{
			System.out.println(b.getText());
		}
		

	}

}
