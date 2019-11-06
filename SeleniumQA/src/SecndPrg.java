import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecndPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set path of driver
				System.setProperty("webdriver.gecko.driver", "E://Browser Drivers//geckodriver.exe");
				//First Invoke Browser Driver Object
				WebDriver wd=new FirefoxDriver();
				//Now perform any action
				
				wd.get("http://google.com");
				System.out.println(wd.getTitle());//get Page Title
				System.out.println(wd.getCurrentUrl());
				//System.out.println(wd.getPageSource());
				wd.get("http://yahoo.com");
				wd.navigate().back();//back button
				wd.navigate().forward();
				wd.navigate().to("http://mail.gspann.com");
				//wd.close();//close current browser in which test is running
				wd.quit();//close current browser window alongwith its child window
	}

}
