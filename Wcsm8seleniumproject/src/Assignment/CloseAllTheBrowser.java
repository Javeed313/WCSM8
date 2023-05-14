package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAllTheBrowser {
public static void main(String[] args) {
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
	
	driver.quit();
	
	
}
}
