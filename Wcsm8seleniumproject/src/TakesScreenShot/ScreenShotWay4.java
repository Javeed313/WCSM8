package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.instagram.com/");

		@SuppressWarnings("deprecation")
		EventFiringWebDriver ewd = new EventFiringWebDriver(driver);

		File src = ewd.getScreenshotAs(OutputType.FILE);

		File dest = new File("./screenshots/insta1.png");

		Files.copy(src, dest);


	}

}
