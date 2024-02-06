package basics;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;
import graphql.relay.Edge;

public class Assignment3
{

	public static void main(String[] args)
	{
		WebDriver driver;
		driver =new FirefoxDriver();

		driver.get("https://www.flipkart.com/account/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

		WebElement login=driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		login.click();


		WebElement user=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		user.sendKeys("9738321158");

		WebElement requestOTP=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		requestOTP.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Mobile"+ Keys.ENTER);
	
		
		
	}

}
