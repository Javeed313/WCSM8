package keyWordDrivenPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InValidLoginTestCase extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	
	Flib flib = new Flib();
	int rc = flib.rowCount(EXCEL_PATH, "invalidCreds");
	for(int i=1;i<=rc;i++)
	{
	driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidCreds", i, 0));
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidCreds", i, 1));
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("username")).clear();
	}
	
	bt.closeBrowser();
}
}
