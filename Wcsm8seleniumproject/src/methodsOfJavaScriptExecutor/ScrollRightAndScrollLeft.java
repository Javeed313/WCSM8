package methodsOfJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollRightAndScrollLeft {
	
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		
		// To Scroll Right

		jse.executeScript("window.scrollBy(2000,0)");
		
		Thread.sleep(2000);
		
		// To Scroll Left
		jse.executeScript("window.scrollBy(-2000,0)");
	}
	
}