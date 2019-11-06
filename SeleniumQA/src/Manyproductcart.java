
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manyproductcart {
	static WebDriver wd;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int j = 0;

		// System.setProperty("webdriver.chrome.driver", "//path//to//chromedriver");
		System.setProperty("webdriver.firefox.driver", "//path//to//geckodriver");
		// WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		// wd=new ChromeDriver();
		wd = new FirefoxDriver();

		wd.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		String[] productsList = { "Cucumber", "Brinjal", "Mushroom" };
		Thread.sleep(3000);
		// get all product names
		List<WebElement> products = wd.findElements(By.xpath("//h4[@class='product-name']"));

		// convert above array to list
		// Thread.sleep(3000);
		List lst = Arrays.asList(productsList);

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			// ex "Brinjal - 1 Kg" will be in two strings "Brinjal " and " 1 Kg", so make
			// string an array
			String formattedName = name[0].trim();// trim() removes all white spaces
			if (lst.contains(formattedName)) {
				j++;
				// gives not exact result as ADD TO CART changes to ADDED so index changes thats
				// why not reliable xpath
				// wd.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				// Thread.sleep(6000);
				// break;
				wd.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// traversing parent to child xpath..parent/child
				// if(j==3) //counts when products added to 3, loop stops working
				if (j == productsList.length)

					break;
			}
		}

	}

}
