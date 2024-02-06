package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Write a selenium script to goto "wikepedia", "facebook", and "google".
 * close the all windows, execute the above in chrome, firefox and edge.
 */
public class Assignment1
{

	public static void main(String[] args)
	{
		WebDriver driver1 =new ChromeDriver();
		WebDriver driver2 =new FirefoxDriver();
		WebDriver driver3 =new EdgeDriver();
		
		driver1.get("https:\\www.google.com");
		driver2.get("https://www.facebook.com");
		driver3.get("https://www.wikipedia.org");
		
		driver1.close();
		driver2.close();
		driver3.close();

	}

}
