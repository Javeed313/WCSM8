package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitylyWait {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	co.addArguments("--disable-notifications");

	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//span[text()='Cart']")).click();
	driver.findElement(By.xpath("//span[text()='Login']")).click();
}
	
}
