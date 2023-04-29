package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime2 {
	
	public static Boolean waitM(WebDriver driver,int sec,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		Boolean title = wait.until(ExpectedConditions.titleContains(value));
		return title;
	}
	
	
	public static WebElement waitE(WebDriver driver,int sec,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name(value)));
		return element;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do;jsessionid=c5lrf9g8b8btn");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		if(waitM(driver,30,"actiTIME - Login"))
		{
			System.out.println("Title of the web page is matched, Test Case is passed");
			waitE(driver,30,"username").sendKeys("admin");
			//driver.findElement(By.name("username")).sendKeys("admin");
			waitE(driver,30,"pwd").sendKeys("manager");
			//driver.findElement (By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
		}
		else
		{
			System.out.println("Title of the web page is not matched, Test Case is failed");
		}
		
		
		if(waitM(driver,30,"actiTIME - Enter Time-Track"))
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
