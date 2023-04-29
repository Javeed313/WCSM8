package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));

		Actions act = new Actions(driver);
		act.moveToElement(target).perform();

		driver.findElement(By.xpath("//span[text()='1 gram' and @data-p='gold-coins-weight-1gms,m']")).click();
		try {
			WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a"));

			if(coin.isDisplayed())
			{
				System.out.println("The coin has dislpayed Successfully, The test case is passed");
			}
		}
		catch(NoSuchElementException e)
		{
			System.out.println("The coin has not displayed, The test case is failed");
		}

	}
}
