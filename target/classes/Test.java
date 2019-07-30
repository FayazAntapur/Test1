import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	
	public static void main(String[] args) {
		
		WebDriver wd = new FirefoxDriver();
		
		wd.get("http://automationpractice.com");
		
	}
}
