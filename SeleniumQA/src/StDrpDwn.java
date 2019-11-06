import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class StDrpDwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//WebDriver wd=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		 
		Select s=new Select(wd.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByIndex(2);
		s.selectByVisibleText("INR");
		
	}

}
