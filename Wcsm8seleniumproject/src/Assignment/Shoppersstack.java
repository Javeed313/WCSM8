package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='NOSIE']")).click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411061");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Check']"))).click();
		
		//driver.findElement(By.xpath("//button[@name='Check']")).click();
		
		
		
	}
	
}
