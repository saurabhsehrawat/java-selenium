import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CstmxpathCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "E://Browser Drivers//geckodriver.exe");
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.facebook.com");
		//Custom xpath: //tagName[@attribute='value']
		/*wd.findElement(By.xpath("//input[@name='email']")).sendKeys("helloworld");
		wd.findElement(By.xpath("//*[@type='password']")).sendKeys("october19");
		wd.findElement(By.xpath("//input[@value='Log In']")).click();*/
		//Custom CSS: //tagName[attribute='value']
		/*wd.findElement(By.cssSelector("input[name='email']")).sendKeys("helloworld");
		wd.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("helloworld123");
		wd.findElement(By.cssSelector("input[value='Log In']")).click();*/
		//flexible ways of writing CSS
		//1) tagName#id where tagName can be kept blank
		//2) tagName.classname
		//wd.findElement(By.cssSelector("input#email")).sendKeys("hello3");
		//wd.findElement(By.cssSelector("#pass")).sendKeys("hello321");
		
		
		//Regular Expression-Xpath
		//tagname[contains(@attribute,'matching value not exact one')]
		
		wd.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("helo1");
		//regular expression CSS tagname[attribute*='value']
		wd.findElement(By.cssSelector("input[type*='passw']")).sendKeys("pswd");
	}

}
