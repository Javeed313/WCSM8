package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {
	public static void main(String[] args) throws AWTException, InterruptedException {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.xpath("//span[text()='Not now']")).click();

		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));

		Actions act = new Actions(driver);
		act.moveToElement(target).perform();

		driver.findElement(By.xpath("//a[text()='Band']")).click();

		WebElement target1 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		act.doubleClick(target1).perform();

		Robot rbt = new Robot();
		
		for(int i=0;i<=2;i++)
		{
			act.clickAndHold(target1).perform();
		}
		
		Thread.sleep(2000);
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		Thread.sleep(2000);
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);

		//driver.findElement(By.name("submit_search")).click();
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
}
