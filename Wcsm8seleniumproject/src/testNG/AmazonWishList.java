package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonWishList {
  @Test
  public void f() throws InterruptedException {
	  
	  EdgeOptions eo = new EdgeOptions();
	  eo.addArguments("--disable-notifications");
	  EdgeDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.amazon.in/");
	  
	  WebElement accountSetting = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	  Actions act = new Actions(driver);
	  act.moveToElement(accountSetting).perform();
	  driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
	  driver.findElement(By.id("nameOrEmailField")).sendKeys("Javed",Keys.ENTER);
	  driver.findElement(By.id("cityField")).sendKeys("Pune");
	  driver.findElement(By.id("stateField")).sendKeys("Maharashtra");
	  
	  WebElement arrivaldropdown = driver.findElement(By.xpath("//span[text()='Arrival Month']"));
	  WebElement yeardropdown = driver.findElement(By.xpath("//span[text()='Year']"));
	  arrivaldropdown.click();
	  driver.findElement(By.id("eventDateMonthField_6")).click();
	  yeardropdown.click();
	  driver.findElement(By.id("eventDateYearField_3")).click();
	
	  Thread.sleep(2000);
	  driver.findElement(By.id("a-autoid-4-announce")).click();
	  
	  
	  
  }
}
