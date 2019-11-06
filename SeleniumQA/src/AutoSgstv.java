import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSgstv {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.makemytrip.com/");
		wd.findElement(By.id("fromCity")).click();
		wd.findElement(By.xpath("//input[@placeholder='From']")).click();
		wd.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		//Thread.sleep(2000);
		//wd.findElement(By.id("fromCity")).sendKeys("mum");
		wd.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		wd.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//wd.findElement(By.xpath("//input[@id='toCity']")).click();
		wd.findElement(By.xpath("//input[@placeholder='To']")).click();
		wd.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("del");
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
		wd.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		}
		
		wd.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
		
	}

}
