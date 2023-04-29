package qsp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		driver.get("https://github.com/gitHub28012/wcsm8repository");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


	}
}
