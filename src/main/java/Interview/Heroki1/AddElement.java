package Interview.Heroki1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddElement {
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\viveq\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void addVerifyElements() {
		 driver.get("https://the-internet.herokuapp.com/");
	        driver.findElement(By.linkText("Add/Remove Elements")).click();
	        for(int i=0;i<5;i++) {
	        	driver.findElement(By.xpath("//button[text()='Add Element']")).click();
	        }
	        int totalElements=driver.findElements(By.cssSelector(".added-manually")).size();
	       

	        // Assert equals
	        Assert.assertEquals(5, totalElements, "Values are not equal");	}


}
