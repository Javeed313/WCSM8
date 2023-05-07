package Assignment;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fiveapplicationwebelements {
	
public static void main(String[] args) throws InterruptedException {
	/*WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.linkText("Logout")).click();*/
	
	//===============================================
	 
	  WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Phone number, username, or email']/ancestor::label")).click();
	driver.findElement(By.xpath("//span[text()='Phone number, username, or email']/ancestor::label")).sendKeys("javeedshirguppi@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Password']/ancestor::label")).sendKeys("Javeed@313");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	try {
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		Thread.sleep(2000);
		driver.quit();
	}
	
	  
	  
	 
	 
	
	
	//===============================================
//	ChromeOptions co=new ChromeOptions();
//	co.addArguments("--remote-allow-origins=*");
	
	/*WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/user-signin");
	Thread.sleep(10000);
	driver.findElement(By.className("Email")).sendKeys("javeedshirguppi@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Javeed@313");
	driver.findElement(By.id("Login")).click();*/
	
	//====================================
//	ChromeOptions co=new ChromeOptions();
//	co.addArguments("--remote-allow-origins=*");
//	WebDriver driver=new ChromeDriver(co);
//	driver.manage().window().maximize();
//	driver.get("https://fireflink.com/");
//	driver.findElement(By.className("default-btn")).click();
//	driver.findElement(By.id("mui-1")).sendKeys("javeedshirguppi@gmail.com");
//	driver.findElement(By.id("mui-2")).sendKeys("Javeed@313",Keys.ENTER);
//	//driver.findElement(By.className("primary-btn")).click();
//	Thread.sleep(10000);	
//	driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-i29csa']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//li[text()='Sign out']")).click();
	/*====================================
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("javeedshirguppi@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Javeed@313");
	driver.findElement(By.name("commit")).click();
	driver.findElement(By.className("dropdown-caret")).click();*/
	
	
	
}
}
