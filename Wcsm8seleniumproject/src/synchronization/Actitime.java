package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=c5lrf9g8b8btn");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		new WebDriverWait(driver, Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		if(wait.until(ExpectedConditions.titleContains("actiTIME - Login")))
		{
			System.out.println("Title of the web page is matched, Test Case is passed");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement (By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
		}
		else
		{
			System.out.println("Title of the web page is not matched, Test Case is failed");
		}
		
		if(wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track")))
		{
			System.out.println("Title of the web page is matched, Test Case is passed");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Logout")).click();
		}
		else
		{
			System.out.println("Title of the web page is not matched, Test Case is failed");
		}
		driver.quit();
		
	}
}