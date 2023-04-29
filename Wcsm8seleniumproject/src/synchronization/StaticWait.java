package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticWait {

	public static void main(String[] args) throws InterruptedException {
		
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				
				WebDriver driver= new ChromeDriver(co);
				driver.manage().window().maximize();
				
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
				driver.findElement(By.name("username")).sendKeys("javeedshirguppi@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Javeed");
				driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
	
}
