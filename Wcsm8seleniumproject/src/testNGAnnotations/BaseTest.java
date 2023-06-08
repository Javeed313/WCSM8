package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BaseTest {
  static WebDriver driver;
  @BeforeMethod
  public void setup() {
	  
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.google.com");
	  
  }

  @AfterMethod
  public void tearDown() {
	  
	  driver.quit();
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
	  //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  
  }


}
