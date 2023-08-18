package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mutiple_dropdown {

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

		//address of dropdown
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		
		//create select object
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		//to check if it is multiple or single dropdown
		System.out.println(s.isMultiple());
				
		//print selected options to console
		List<WebElement> alloptions = s.getAllSelectedOptions();
		
		for(WebElement c:alloptions)
		{
			System.out.println(c.getText());
		}
		s.deselectByIndex(1);
		Thread.sleep(2000);
		s.deselectByValue("199");
		Thread.sleep(2000);
		s.deselectByVisibleText("INR 200 - INR 299 ( 3 )");
		
		//deselects all options
		//s.deselectAll();
	}

}
