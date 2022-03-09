package sampl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoWebShop {
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chrome_driver\\chromedriver (2).exe");

	WebDriver driver=new ChromeDriver();

	driver.get("http://demowebshop.tricentis.com/login");

	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@value='Register']")).click();

	driver.navigate().back();

	Thread.sleep(3000);

	driver.navigate().forward();

	Thread.sleep(3000);

	driver.navigate().to("http://demowebshop.tricentis.com/login");

	Thread.sleep(3000);

	driver.navigate().refresh();

	Thread.sleep(3000);

	driver.close();




	}



	
}
