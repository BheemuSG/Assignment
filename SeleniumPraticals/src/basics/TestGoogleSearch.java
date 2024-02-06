package basics;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearch
{

	public static void main(String[] args)
	{
		WebDriver driver;
		driver =new ChromeDriver();
		
		//Navigating to URL
		driver.get("https://google.com");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//waits till the web page loaded completely with specified time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		//Finding the search text box
		WebElement gSearch= driver.findElement(By.id("APjFqb"));
		gSearch.sendKeys("Software Testing"+ Keys.ENTER);
		
		//closing the current window
		//driver.close();
		
		//closing all the opened window
		//driver.quit();
		
		//get the current url of the current page
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		//get the title of the window
		driver.getTitle();
		

	}

}
