package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  
		System.setProperty("webdriver.chrome.driver", "E:\\\\Softwares\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("dhruba.deka621@gmail.com");
		//driver.findElement(By.xpath("[@id='email']")).sendKeys("dhruba.deka621@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Password12345");
		driver.findElement(By.name("SubmitLogin")).click();
		
		driver.get("http://automationpractice.com/index.php?controller=order");
		
		
/*		String s = driver.findElement(By.xpath("//div[@class='box']")).getText();
		//System.out.println(s);
		String[] items = s.split("-");
		String orderPlaced = items[5].substring(46, 55);
		System.out.println("orderPlaced: "+orderPlaced);
		driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
		
		String orderHistory =driver.findElement(By.xpath("//a[contains(text(),'"+orderPlaced+"')]")).getText();
		//String orderHistory = driver.findElement(By.xpath("//a[@class='color-myaccount']")).getText();
		System.out.println("orderHistory: "+orderHistory);
		
		Assert.assertEquals(orderPlaced.equals(orderHistory), true, "Values not matched");
		*/
		String s= driver.findElement(By.xpath("//h1[@id=\"cart_title\"]")).getText();
		System.out.println(s);
  }
}
