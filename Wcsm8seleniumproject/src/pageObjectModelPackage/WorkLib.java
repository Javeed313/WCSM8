package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;

public class WorkLib extends BaseTest {
	
	public void handleConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}
	
}
