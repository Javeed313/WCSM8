package methodsOfJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollUpAndScrollDown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	
	
	// To Scroll Up

	jse.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(2000);
	
	// To Scroll Down
	jse.executeScript("window.scrollBy(0,-500)");
}
}
