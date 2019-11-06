import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.spicejet.com/Default.aspx");
		wd.findElement(By.id("divpaxinfo")).click();
		WebElement e1=wd.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		WebElement e2=wd.findElement(By.id("ctl00_mainContent_ddl_Child"));
		WebElement e3=wd.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select s=new Select(e1);
		s.selectByValue("2");
		Select s1=new Select(e2);
		s1.selectByIndex(3);
		Select s3=new Select(e3);
		s3.selectByVisibleText("3");
		
		/*Select s[]=new Select[3];
		s[0].selectByValue("2");
		s[1].selectByIndex(3);
		s[2].selectByVisibleText("3");*/
		
	}

}
