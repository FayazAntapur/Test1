package selenium;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WalletHub {

	public static WebDriver driver;	
	
	public static String chromePath="E:\\Softwares\\chromedriver.exe";	
	public static String userName="fayazantapur23@gmail.com";
	public static String passWord="Wallet@123";

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wallethub.com/profile/test_insurance_company/");
		
		//Click on login
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Email Address\"]")).sendKeys(userName);
		
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(passWord);
	
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

}
