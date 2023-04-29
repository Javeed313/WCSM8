package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://shoppersstack.com/user-signin");
		
		Thread.sleep(2000);
		
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		
		
	
}
}