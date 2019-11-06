import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChckBoxes {
	
	
	public WebDriver wd;
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		ChckBoxes cb=new ChckBoxes();
		cb.runme();
	}
	

	public void runme()
	{
		System.setProperty("webdriver.chrome.driver", "E://Browser Drivers//chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		wd=new ChromeDriver();
		wd.get("https://www.spicejet.com/Default.aspx");
		
		//Assert.assertFalse(condition);
		//if condition returns false, testcase will pass, if condition returns true, testcase fails
		Assert.assertFalse(wd.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		Assert.assertFalse(false);//testcase pass
		//Assert.assertFalse(true);//testcase fail
		//Assert.assertTrue(wd.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		//System.out.println(wd.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		wd.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
		Assert.assertTrue(wd.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		//wd.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isEnabled();
		
		//System.out.println(wd.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());
		
		//Count no of checkboxes on the page
		
		//Assert.assertEquals(actual, expected);
		//Assert.assertEquals(wd.findElements(By.cssSelector("input[type='checkbox']")).size(), 5); //will fail
		
		Assert.assertEquals(wd.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		//System.out.println(wd.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
	
}
