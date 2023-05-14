package windowBasedPopup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumPagePrintAndSavePage {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.selenium.dev/");
	
	Thread.sleep(2000);
	Robot rbt = new Robot();
	
	rbt.keyPress(KeyEvent.VK_CONTROL);
	rbt.keyPress(KeyEvent.VK_P);
	rbt.keyRelease(KeyEvent.VK_CONTROL);
	rbt.keyRelease(KeyEvent.VK_P);
	Thread.sleep(2000);
	
	for(int i=0;i<=2;i++)
	{
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_PAGE_UP);
		rbt.keyRelease(KeyEvent.VK_PAGE_UP);
	}
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_ENTER);
	rbt.keyRelease(KeyEvent.VK_ENTER);
	
	File file = new File("./autoit/PrintWindowPopup.exe");
	String absolutePath = file.getAbsolutePath();
	
	Runtime.getRuntime().exec(absolutePath);
	Thread.sleep(2000);
	
	driver.quit();
	
}
}
