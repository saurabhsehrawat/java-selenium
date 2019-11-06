import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleCart {
static WebDriver wd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "//path//to//chromedriver");
		//System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		wd=new ChromeDriver();

		wd.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		//get all product names
		List<WebElement> products=wd.findElements(By.xpath("//h4[@class='product-name']"));
		
		
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			if(name.contains("Cucumber"))
			{
				wd.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

}
