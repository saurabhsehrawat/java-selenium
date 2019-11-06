import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ThrdIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set path of driver
		System.setProperty("webdriver.ie.driver", "E://Browser Drivers//MicrosoftWebDriver.exe");
		//First Invoke Browser Driver Object
		//WebDriver wd=new InternetExplorerDriver();
		WebDriver wd=new InternetExplorerDriver();
		//Now perform any action
		
		wd.get("http://google.com");
		System.out.println(wd.getTitle());//get Page Title
		
		
	}

}
