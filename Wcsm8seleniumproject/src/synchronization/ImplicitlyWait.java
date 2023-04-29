package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//Applying implicitly waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/");
		//Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("javeedshirguppi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Javeed");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
}
	
}
