package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/moula/Desktop/Selenium%20Data/Web%20Elements/SingleSelectDropDown.html");
		Thread.sleep(2000);
		driver.findElement(By.id("i1")).click();
	}
}
