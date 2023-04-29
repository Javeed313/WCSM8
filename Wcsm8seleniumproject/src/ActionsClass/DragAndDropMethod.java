package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	
	WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	
	WebElement src2 = driver.findElement(By.xpath("//a[text()=' BANK ']"));

	WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));

	WebElement targetdac = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='bank']"));
	
	WebElement targetdam = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt7']"));
	
	WebElement targetcac = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='loan']"));

	WebElement targetcam = driver.findElement(By.xpath("//li[@class='placeholder']/ancestor::ol[@id='amt8']"));
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(src1, targetdam).perform();
	act.dragAndDrop(src1, targetcam).perform();
	act.dragAndDrop(src2, targetdac).perform();
	act.dragAndDrop(src3, targetcac).perform();
	
	driver.quit();
	
}
}
