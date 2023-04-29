package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndiaXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.airindia.in/");

		driver.findElement(By.xpath("//a[contains(text(),' Login/Enrol')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'signInName')]")).sendKeys("javeedshirguppi@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Javeed@313");
		
		driver.findElement(By.xpath("//button[contains(@id,'next')]")).click();
		
		
		
	}

}