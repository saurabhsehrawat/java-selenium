import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsHandle {
public static WebDriver wd;
	
static String text="Saurabh";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","//path//to//chromedriver");
				System.setProperty("webdriver.firefox.driver","//path//to//geckodriver");
				//WebDriverManager.chromedriver().setup();
				WebDriverManager.firefoxdriver().setup();
				//wd=new ChromeDriver();
				wd=new FirefoxDriver();
				wd.get("https://rahulshettyacademy.com/AutomationPractice/");
				wd.findElement(By.id("name")).sendKeys(text);
				wd.findElement(By.id("alertbtn")).click();
				Thread.sleep(3000);
				System.out.println(wd.switchTo().alert().getText());
				wd.switchTo().alert().accept();
				wd.findElement(By.cssSelector("#confirmbtn")).click();
				Thread.sleep(2000);
				System.out.println(wd.switchTo().alert().getText());
				wd.switchTo().alert().dismiss();
				
	}

}
