import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalndrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "//path//to//chromedriver");
		System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.spicejet.com/");
		wd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		wd.findElement(By.xpath("//a[@value='PNQ']")).click();
		wd.findElement(By.cssSelector("a[value='JAI']")).click();
		
		//Current Date
		//wd.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//wd.findElement(By.xpath("//a[@contains(text(),'30')]")).click();
		
		
		
		
		
		

	}

}
