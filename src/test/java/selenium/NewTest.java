package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testf() {
	  
	  //to run chrome
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fayaz\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
//		options.addArguments("--disable-infobars");
//		WebDriver driver= new ChromeDriver(options);
		
		//to run firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Fayaz\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		FirefoxOptions options= new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver= new FirefoxDriver(options);

		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		System.out.println(driver.manage().getClass());
		//driver.manage().getClass();
		driver.quit();

  }
}
