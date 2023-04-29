package methodsOfWebDriver;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManageSetPositionMethod 
{

	public static void main(String[] args) throws InterruptedException  {

		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver= new ChromeDriver(co);
		
		Point targetPosition = new Point(300,300);	
		
		driver.manage().window().setPosition(targetPosition);
		
		Thread.sleep(2000);
		
		driver.close();



	}
	
}
