package guru99.gittest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	
	public static void main(String[] args) throws InterruptedException {
	//Step 1:Create the driver
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//Step 2: open url
	driver.get("https://www.google.com");

	//Step 3: find the element
	//Step 4: set data
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("Java Book");
	
	//Step 5: perform action
	WebElement searchPage = driver.findElement(By.className("A8SBwf"));
	Thread.sleep(2000);
	searchPage.click();
	//WebElement searchBtn = driver.findElement(By.name("btnk"));
	//Thread.sleep(2000);
	//Step 6: perform validation
	//searchBtn.click();
	Thread.sleep(5000);
	//Step 7: close the browser
	driver.close();

			
	}		
	


}
