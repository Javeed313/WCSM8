package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/moula/Desktop/Selenium%20Data/Web%20Elements/Textbox.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Javed");
	
	
	//-------------------------------------------------
	
	driver.navigate().to("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Javed");
}
}
