package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessDemo
{

	public static void main(String[] args) 
	{
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("https://google.com/");
		
		System.out.println("The Title of page: "+ driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("");
		
		String newTitle= driver.getTitle();
		
		System.out.println("the new title: " + newTitle);
		
		System.out.println("The current URL of page : " + driver.getCurrentUrl());
		
		driver.quit();
	}

}
