package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidLoginTestCase 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=6tqjagcm30fhp");
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "validCreds", 1, 0));
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "validCreds", 1, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		driver.quit();
	
	}
	
}
