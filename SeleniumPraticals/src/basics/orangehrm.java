package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm 
{
	public static void main(String[] args) 
	{
		WebDriver driver;
		driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		
		WebElement uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.sendKeys("Admin");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("admin123");
		
		WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		
		//WebElement dashboard=driver.findElement(By.xpath("//li[1]//a[1]//span[1]]"));
		//dashboard.click();
		
		WebElement admin=driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
		admin.click();
		
		WebElement addUser=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--focus']"));
		uname.sendKeys("Bheema");
		
		WebElement userRole=driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']"));
		WebElement adminRoll=driver.findElement(By.xpath("//div[@class='oxd-form-actions']"));
			
	}

}
