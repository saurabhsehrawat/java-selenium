import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {
	static	WebDriver  wd;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "//path//to//chromedriver");
		//System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		wd=new ChromeDriver(options);
		wd.get("https://www.firstcry.com/tops-and-t-shirts/6/26?scat=26&age=6,7,8,9,10,11&ref2=menu_dd_kidsclothes_tops&tees");
		//wd.switchTo().alert().accept();
		Thread.sleep(2000);
		//wd.switchTo().alert().dismiss();
		
		
		
		
		
		
		List<WebElement> products=wd.findElements(By.xpath("//div[@class='list_img wifi']"));
		
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
				if(name.contains("Babyhug Full Sleeves Tee Tractor & Monster Print - Yellow"))
				{
					//click on add to cart
					//getting index using get(i) as we are again getting all elements
					wd.findElements(By.xpath("//div[text()='ADD TO CART']")).get(i).click();
					//break;
				}
		}
		
	}

}
