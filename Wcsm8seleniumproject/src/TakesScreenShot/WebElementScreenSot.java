package TakesScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementScreenSot {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com");
		
		WebElement button = driver.findElement(By.className("_acan _acap _acas _aj1-"));
		
		if(button.isEnabled())
		{
			System.out.println("The Login button is Enabled We can Login");
		}
		else
		{
			File src = button.getScreenshotAs(OutputType.FILE);
		}
		
	}
	
}
