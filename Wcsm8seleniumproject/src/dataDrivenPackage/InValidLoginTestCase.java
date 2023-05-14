package dataDrivenPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class InValidLoginTestCase {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://127.0.0.1/login.do;jsessionid=6tqjagcm30fhp");
	
	Flib flib = new Flib();
	int rc = flib.rowCount("./data/ActiTimeTestData.xlsx", "inValidCreds");
	
	for(int r=1;r<=rc;r++)
	{
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidCreds", r, 0));
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx", "invalidCreds", r, 1));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		userName.clear();
		password.clear();
	}
	
}
}
