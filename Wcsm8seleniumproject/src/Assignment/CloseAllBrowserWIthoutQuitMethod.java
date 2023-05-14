package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAllBrowserWIthoutQuitMethod {
public static void main(String[] args) throws InterruptedException {
FirefoxDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://omayo.blogspot.com/");
	
	WebElement link = driver.findElement(By.linkText("Open a popup window"));
	Point point = link.getLocation();
	int xaxis = point.getX();
	int yaxis = point.getY();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(\"+xaxis+\",\"+yaxis+");
	
	link.click();
	
	Set<String> allHandles = driver.getWindowHandles();
	for(String wh:allHandles)
	{
		Thread.sleep(2000);
		driver.switchTo().window(wh).close();
	}
}
}
