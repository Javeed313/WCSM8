package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitle 
{
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		
		// to launch the web application
		driver.get("https://www.instagram.com/");
		
		//To print the title of the web page
		System.out.println(driver.getTitle());
		
		//Stop the execution of script for 2seconds
		Thread.sleep(2000);
		
		// to close the browser
		driver.close();
		
		
	}
	

}
