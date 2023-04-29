package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSizeandPositionofBrowser 
{

	public static void main(String[] args) throws InterruptedException  {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		// To launch the Browser
		WebDriver driver= new ChromeDriver(co);
		
		Thread.sleep(2000);
		// To Set Size of the Browser
		Dimension targetSize = new Dimension(950,450);

		driver.manage().window().setSize(targetSize);
		
		Thread.sleep(2000);
		// To Set the Position of the browser
		Point targetPosition = new Point(300,300);	

		driver.manage().window().setPosition(targetPosition);

		Thread.sleep(2000);

		driver.close();



	}

}
