package selenium;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFacebook {
	
	public static WebDriver driver;	
	
	public String chromePath="E:\\Softwares\\geckodriver.exe";
	public String userName="abc@gmail.com";
	public String passWord="abc@786";
	
	
	public void openBrowser() {

		// Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create object of ChromeOption class
//		ChromeOptions options = new ChromeOptions();

		// Set the experimental option
	//	options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.gecko.driver", chromePath);
		//driver = new ChromeDriver(options);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}
	
	public  void login() {
		
		driver.findElement(By.id("email")).sendKeys(userName);
		
		driver.findElement(By.id("pass")).sendKeys(passWord);
		
		driver.findElement(By.xpath("//input[@value=\"Log In\"]")).click();
		
	}
	
	public void postStatus(String status) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[contains(@title,'Write something here')]")));
		
		driver.findElement(By.xpath("//textarea[contains(@title,'Write something here')]")).click();
		
		driver.findElement(By.xpath("//textarea[contains(@title,'Write something here')]")).sendKeys(status);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Share']//parent::button[@type='submit']")));
		driver.findElement(By.xpath("//span[text()='Share']//parent::button[@type='submit']")).click();
	}
	
	public static void main(String[] args) {
		
		LoginFacebook LF= new LoginFacebook();
		
		//open browser
		LF.openBrowser();
		
		//Enter username and password
		LF.login();
		
		//Enter your status
		LF.postStatus("Hello World");
		
	}

}
