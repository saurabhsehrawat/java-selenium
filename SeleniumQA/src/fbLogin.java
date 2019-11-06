import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "path//to//chromedriver");
		WebDriverManager.chromedriver().setup();
		
		WebDriver wd=new ChromeDriver();
		wd.get("https://www.facebook.com/");
		wd.findElement(By.id("email")).sendKeys("xyz@xyz.com");
		wd.findElement(By.id("pass")).sendKeys("123456");
		wd.findElement(By.xpath("//input[@value=('Log In')]")).click();
		//Next page
		wd.findElement(By.id("email")).sendKeys("xyz123@gmail.com");
		wd.findElement(By.id("pass")).sendKeys("xyzxyzabc123");
		wd.findElement(By.name("login")).click();
		
	}

}
