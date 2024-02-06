package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		String url="https://demowebshop.tricentis.com/";
		driver.get(url);
		
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.id("small-searchterms"));
		search.sendKeys("Women's Running Shoe");
		WebElement button= driver.findElement(By.className("button-1"));
		button.click();
		
		String currentURL=driver.getCurrentUrl();
		
		if(currentURL.equals(url))
		{
			System.out.println("Above code not executed");
			
		}
		
		List<WebElement> LinkElements = driver.findElements(By.tagName("div"));

		for(WebElement link : LinkElements)
		{
			System.out.println(link.getText());
		}
		System.out.println(LinkElements.size());
	}

}
