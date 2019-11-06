import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Set path of driver
		System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		//First Invoke Browser Driver Object
		WebDriver wd=new ChromeDriver();
		//Now perform any action
		
		wd.get("http://google.com");
		System.out.println(wd.getTitle());//get Page Title
		System.out.println(wd.getCurrentUrl());
		//System.out.println(wd.getPageSource());
		wd.get("http://yahoo.com");
		wd.navigate().back();//back button
		//wd.navigate().forward();
		//wd.close();
		
		
		
		
	}

}
