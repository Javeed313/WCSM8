package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartWindowHandle {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Samsung S23 Ultra");
	
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
	String parentWindow = driver.getWindowHandle();
	
	driver.findElement(By.xpath("//div[@class='col col-7-12']/div[text()='SAMSUNG Galaxy S23 Ultra 5G (Green, 256 GB)']")).click();
	
	Set<String> allWindows = driver.getWindowHandles();

	for(String aw:allWindows)
	{
		if(!parentWindow.equals(aw))
		{	
			
			driver.switchTo().window(aw);
			Thread.sleep(3000);
			WebElement target = driver.findElement(By.xpath("//ul[@class='_1q8vHb']/li[@id='swatch-0-color']/a[@class='kmlXmn']"));
			
			target.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='512 GB']")).click(); // select storage
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("411061"); // check delivery address
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Check']")).click(); // click on check button
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Add 3 Items to Cart']")).click(); // click on add to cart button
			
			Thread.sleep(4000);
			WebElement removebt= driver.findElement(By.xpath("//div[text()='Remove']")); // To click on Remove
			org.openqa.selenium.Point loc = removebt.getLocation();
			int xaxis = loc.getX();
			int yaxis = loc.getY();
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
			removebt.click();
			
			driver.findElement(By.xpath("//div[@class='td-FUv WDiNrH']/div[text()='Remove']")).click();
			
			driver.close();
			
		}
	}
	Thread.sleep(2000);
	driver.close();
}
}
