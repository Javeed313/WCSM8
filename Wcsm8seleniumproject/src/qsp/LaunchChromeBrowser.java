package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// To avoid ConnectionFailedException.

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		// To Launch Chrome Browser.

		ChromeDriver driver = new ChromeDriver(co);
		
		// To Maximize the Browser.
		
		driver.manage().window().maximize();
		
		// To Stop the execution of Script for 3 seconds.
		
		Thread.sleep(3000);
		
		// To Close the Chrome Browser.
		
		driver.close();
	}

}