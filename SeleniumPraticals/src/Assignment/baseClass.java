package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseClass implements MethodsInterface
{
	
	WebDriver driver =new ChromeDriver();
	
	@Override
	public void login() 
	{
		driver.get("https://admin-demo.nopcommerce.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
	}

	@Override
	public void findElements() 
	{
		WebElement catalog= driver.findElement(By.xpath("//p[normalize-space()='Catalog']//i[contains(@class,'right fas fa-angle-left')]"));
		catalog.click();
		WebElement categories=driver.findElement(By.xpath("//p[normalize-space()='Categories']"));
		categories.click();
		
		WebElement dropDown=driver.findElement(By.id("SearchPublishedId"));
		Select select= new Select(dropDown);
		
		select.selectByIndex(1);
		String textValue=select.getFirstSelectedOption().getText();
	
		if("Published only".equals(textValue))
			System.out.println("Published only option selected.");

		else
			System.out.println(textValue +"option selected.");
			
		WebElement searchButton=driver.findElement(By.xpath("//button[@id='search-categories']"));
		searchButton.click();
		
		WebElement nameCheckBox=driver.findElement(By.className("mastercheckbox"));
		nameCheckBox.click();
		
	}

	@Override
	public void logout() 
	{
		WebElement logout=driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		logout.click();	
	}

	@Override
	public void teardown() 
	{
		driver.close();
	}

}
