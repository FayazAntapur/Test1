package selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelTest {
	
	public static RemoteWebDriver driver;
	@BeforeTest
	public void before() throws MalformedURLException {
		
		DesiredCapabilities dc= DesiredCapabilities.firefox();
		dc.setPlatform(Platform.ANY);
		dc.setBrowserName("firefox");
		URL url= new URL("http://192.168.1.4:5566/wd/hub");
		
		 driver= new RemoteWebDriver(url, dc);
		driver.get("https://www.facebook.com/");
	}
  @Test
  public void f() {
	  System.out.println(driver.getTitle());
	  driver.quit();
	  
  }
}
