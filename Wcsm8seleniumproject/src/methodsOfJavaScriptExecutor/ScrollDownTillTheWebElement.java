package methodsOfJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownTillTheWebElement {
public static void main(String[] args) throws InterruptedException {
	
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://in.puma.com/in/en");
	WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
	Actions act = new Actions(driver);
	act.moveToElement(men).perform();
	
	driver.findElement(By.xpath("//a[text()='Sneakers']")).click();
	
	WebElement shoe = driver.findElement(By.xpath("//span[text()='PUMA White-Matte Silver']/ancestor::h3[text()='Smashic Unisex Sneakers']"));
	
	Point shoeLoc = shoe.getLocation();
	int xaxis = shoeLoc.getX();
	int yaxis = shoeLoc.getY();
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,- 500)");
	Thread.sleep(3000);
	
	shoe.click();
	
	Thread.sleep(2000);
	
	driver.quit();
	

}
}
