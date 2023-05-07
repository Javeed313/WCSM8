package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShotWay1 {

	public static void main(String[] args) throws IOException {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.xpath("//span[text()='Not now']")).click();

		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ssbluestone.png");

		Files.copy(src, dest);


	}
	
}
