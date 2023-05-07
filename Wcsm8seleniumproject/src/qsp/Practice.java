package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement target = driver.findElement(By.xpath("//div[@class='desktop-navLink']/descendant::a[text()='Men']"));

		Actions act = new Actions(driver);
		act.moveToElement(target).perform();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='desktop-logoContainer']/following-sibling::nav/descendant::li[@data-reactid='30']/descendant::a[text()='T-Shirts']")).click();


	}
}
