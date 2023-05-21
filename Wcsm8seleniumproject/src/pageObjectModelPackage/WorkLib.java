package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;

public class WorkLib {
	static WebDriver driver;
	public void handleConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}
	
}
