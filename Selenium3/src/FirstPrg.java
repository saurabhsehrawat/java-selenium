import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver", "//Users//saurabhsehrawat//eclipse-workspace//java-selenium//geckodriver");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "//Users//saurabhsehrawat//eclipse-workspace//java-selenium//chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());// gets page title of tab where test is running
		System.out.println(driver.getCurrentUrl()); //validate whether url opened matches with hitted url or not, it fetch current tab url 
		System.out.println(driver.getPageSource());//used to retrieve page source say if right click on some wbsite is disabled ex banking site
		
	}

}
