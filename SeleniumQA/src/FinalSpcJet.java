import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FinalSpcJet {

	public WebDriver wd;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FinalSpcJet fsj=new FinalSpcJet();
		fsj.fnltest();
		
	}

	
	public void fnltest() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","//path//to//chromedriver");
		System.setProperty("webdriver.firefox.driver","//path//to//geckodriver");
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//wd=new ChromeDriver();
		wd=new FirefoxDriver();
		wd.get("https://www.spicejet.com/Default.aspx");
		wd.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		wd.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		wd.findElement(By.xpath("//a[@value='COK']")).click();
		//Thread.sleep(2000);
		wd.findElement(By.xpath("//a[@value='GOI']")).click();
		//Thread.sleep(2000);
		wd.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		wd.findElement(By.name("ctl00$mainContent$view_date2")).click();
		wd.findElement(By.xpath("//a[contains(text(),'23')][1]")).click();
		//Thread.sleep(2000);
		wd.findElement(By.id("divpaxinfo")).click();
		
		WebElement we=wd.findElement(By.name("ctl00$mainContent$ddl_Adult"));
		WebElement we1=wd.findElement(By.id("ctl00_mainContent_ddl_Child"));
		WebElement we2=wd.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		WebElement we3=wd.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		Select s=new Select(we);
		Select s1=new Select(we1);
		Select s2=new Select(we2);
		Select s3=new Select(we3);
		
		we.click();
		s.selectByValue("3");
		we1.click();
		s1.selectByIndex(1);
		we2.click();
		s2.selectByVisibleText("1");
		we3.click();
		s3.selectByVisibleText("AED");
		wd.findElement(By.cssSelector("#ctl00_mainContent_chk_StudentDiscount")).click();
		
		wd.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		
	}
	
}
