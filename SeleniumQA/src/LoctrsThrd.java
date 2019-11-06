import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoctrsThrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "E://Browser Drivers//geckodriver.exe");
		WebDriver wd=new ChromeDriver();
		//WebDriver wd=new FirefoxDriver();
		
		wd.get("https://www.facebook.com/login/");
		wd.findElement(By.cssSelector(("input#email.inputtext._55r1._1kbt"))).sendKeys("abc123");
		wd.findElement(By.cssSelector("input#pass.inputtext._55r1._1kbt")).sendKeys("HELLLO");
		wd.findElement(By.cssSelector("#forgot-password-link")).click();
		
	}

}
