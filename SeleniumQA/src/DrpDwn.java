
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDwn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "//path//to//chromedriver");
		System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.spicejet.com/Default.aspx");
		
		wd.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		//wd.findElement(By.cssSelector("#hrefIncChd")).click();	
		for(int i=0;i<2;i++)
		{
			wd.findElement(By.cssSelector("#hrefIncChd")).click();	
		}
		wd.findElement(By.cssSelector("#hrefIncAdt")).click();
		wd.findElement(By.cssSelector("#btnclosepaxoption")).click();
	}

}
