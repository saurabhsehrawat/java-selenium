import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlngAttributes {
	public WebDriver wd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlngAttributes ha=new HandlngAttributes();
		ha.startme();
		
	}

	public void startme()
	{
		System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		wd=new ChromeDriver();
		wd.get("https://www.spicejet.com/Default.aspx");
		
		
		System.out.println(wd.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());//must return False
		System.out.println(wd.findElement(By.id("Div1")).getAttribute("style"));
		wd.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(wd.findElement(By.id("Div1")).getAttribute("style"));
		System.out.println(wd.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());//must return true
		
		if(wd.findElement(By.id("Div1")).getAttribute("style").endsWith("1;"))//contains() can also be used
		{
			System.out.println("True");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("False");
			Assert.assertTrue(false);
		}
	}
	
}
