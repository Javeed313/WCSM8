package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BlueStoneFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.xpath("//span[text()='Not now']")).click();

		driver.switchTo().frame("fc_widget");

		driver.findElement(By.id("chat-icon")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("chat-fc-name")).sendKeys("Javed");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-email")).sendKeys("abcd445451@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
