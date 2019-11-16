import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScndPrg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "//Users//saurabhsehrawat//eclipse-workspace//java-selenium//geckodriver");
				WebDriver driver=new FirefoxDriver();
				//System.setProperty("webdriver.chrome.driver", "//Users//saurabhsehrawat//eclipse-workspace//java-selenium//chromedriver");
				//WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com");
				Thread.sleep(2000);
				System.out.println(driver.getTitle());// gets page title of tab where test is running
				//driver.navigate().forward();//test fails as only facebook opened, there's nothing to go back or forward
				driver.get("http://www.google.com");
				Thread.sleep(2000);
				driver.navigate().back();
				driver.navigate().forward();
				Thread.sleep(4000);
				driver.close(); //close current browser window in focus
				//driver.quit(); //closes all opened windows or child windows of a browser
		       

	}

}
 