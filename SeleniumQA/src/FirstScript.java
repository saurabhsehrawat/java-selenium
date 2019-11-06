import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		//WebDriver wd=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "E://Browser Drivers//geckodriver.exe");
		WebDriver wd=new FirefoxDriver();
		wd.get("https://in.yahoo.com");
		wd.findElement(By.xpath("//a[contains(@id,'signin')]")).click();
		wd.findElement(By.cssSelector("a#createacc")).click();
		wd.findElement(By.cssSelector("input.ureg-fname")).sendKeys("Test");
		wd.findElement(By.cssSelector("#usernamereg-lastName")).sendKeys("Data");
		wd.findElement(By.xpath("//input[@name='yid']")).sendKeys("testdatasel123");
		wd.findElement(By.xpath("//input[@type='password']")).sendKeys("mypswd123");
		wd.findElement(By.cssSelector("input.phone-no")).sendKeys("9650123321");
	}

}
