package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://omayo.blogspot.com/");

		RemoteWebDriver rwd = (RemoteWebDriver)driver;

		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ssomayo.png");

		Files.copy(src, dest);


	}

}
