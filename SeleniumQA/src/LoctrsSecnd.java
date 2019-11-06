import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctrsSecnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		
		wd.get("https://login.salesforce.com");
		//class name can not be used id space is available
		//if 2 class names of fields are same, first will get executed
		wd.findElement(By.id("username")).sendKeys("hello");
		wd.findElement(By.name("pw")).sendKeys("349-09w0");
		//wd.findElement(By.className("button r4 wide primary")).click();//throws error due to space in classname	
		wd.findElement(By.cssSelector("#Login")).click();
		System.out.println(wd.findElement(By.cssSelector("div#error.loginError")).getText());//picks text from webpage
		
		
		
		
		
		
		
	}

}
