import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChkBxChild extends ChckBoxes {

	public static WebDriver wd;
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
	
		ChkBxChild c=new ChkBxChild();
		c.runme();
		wd.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
	}
	
}
