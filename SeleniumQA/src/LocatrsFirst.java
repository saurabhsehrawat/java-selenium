import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatrsFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "E://Browser Drivers//geckodriver.exe");
		WebDriver wd=new FirefoxDriver();*/
		
		wd.get("http://www.facebook.com");
		wd.findElement(By.id("email")).sendKeys("saurabh.sehrawat");//find using ID locator
		wd.findElement(By.name("pass")).sendKeys("@Brahan15032015");//find using NAME locator
		//wd.findElement(By.linkText("Forgotten account?")).click();//find using LINKTEXT locator
		wd.findElement(By.xpath("//*[@id='u_0_b']")).click();
		
		
	}

}
