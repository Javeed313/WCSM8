package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // inmplicit wait
	
	driver.get("http://127.0.0.1/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	
	driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
	
	driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
	
	WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	
	Actions act = new Actions(driver);
	
	act.doubleClick(target).perform();
	Thread.sleep(4000);
	
	File file = new File("./autoit/FileUploadVbScript");
	
	String absolutepath = file.getAbsolutePath();
	
	Runtime.getRuntime().exec(absolutepath);
	Runtime.getRuntime().exec(absolutepath);
	
	
	
	
	
	
	//driver.quit();
}
}
