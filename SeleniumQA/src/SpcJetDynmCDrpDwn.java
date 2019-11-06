import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpcJetDynmCDrpDwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.spicejet.com/Default.aspx");
		
		wd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		wd.findElement(By.xpath("//a[@value='IXB']")).click();
		//wd.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		wd.findElement(By.xpath("//a[@value='BLR']")).click();
		//wd.findElement(By.xpath("(//a[@value='BLR'])[2]")).click(); if there are 2 same xpaths
		

	}

}
