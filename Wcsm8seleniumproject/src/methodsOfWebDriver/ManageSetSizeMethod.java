package methodsOfWebDriver;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageSetSizeMethod {
	
	public static void main(String[] args) throws InterruptedException  {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		
		Dimension targetSize = new Dimension(950,450);
		
		driver.manage().window().setSize(targetSize);
		
		Thread.sleep(2000);
		
		driver.close();



	}

}
