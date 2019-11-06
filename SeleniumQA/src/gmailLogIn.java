import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmailLogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "path//to//geckodriver");
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		//wd.manage().window().fullscreen();
		wd.manage().window().maximize();
		//starting program
		//wd.get("https://www.google.com/intl/en-GB/gmail/about/");
		//wd.findElement(By.xpath("//body/div[2]/div[1]/div[4]/ul/li[2]/a")).click();
		//working Absolue Paths
		wd.get("https://accounts.google.com/signin/v2/identifier?");
		wd.findElement(By.cssSelector("input[type='email']")).sendKeys("jayantisehrawat@gmail.com");
		wd.findElement(By.xpath("//div[@id='initialView']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div/span")).click();
		wd.findElement(By.xpath("//div[@id='view_container']/div/div/div[2]/div/div[2]/div/div/div/span")).sendKeys("hahdshd,");
		
	}

}
