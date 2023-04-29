package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		act.clickAndHold(target1).perform();
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_RIGHT);
		rbt.keyRelease(KeyEvent.VK_RIGHT);
	}
}
