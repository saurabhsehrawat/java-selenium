import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationTabs {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "//path//to//chromedriver");
				System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
				//WebDriverManager.chromedriver().setup();
				WebDriverManager.firefoxdriver().setup();
				WebDriver wd=new FirefoxDriver();
				JavascriptExecutor jse=(JavascriptExecutor)wd;
			
				
				ArrayList<String> tabs=new ArrayList<String>(wd.getWindowHandles());
				wd.switchTo().window(tabs.get(0));
				wd.get("https://www.facebook.com");
				jse.executeScript("window.open()");
				wd.switchTo().window(tabs.get(1));//throwing error
				wd.get("https://www.gmail.com");
		
	}

}
