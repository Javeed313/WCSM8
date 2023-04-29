package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("hp laptop");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//div[@class='_3879cV' and text()='Core i7']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		
		List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		
		List<WebElement> laptopname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		/*for(int i=0;i<allLaptops.size();i++)
		{
			String name = laptopname.get(i).getText();
			System.out.print(name+": ");
			
			String laptop = allLaptops.get(i).getText();
			System.out.println(laptop);
			Thread.sleep(2000);
		}*/
		for(int i=0;i<allLaptops.size();i++)
		{
			String name = laptopname.get(i).getText();
			for(int j=i;j<=i;j++)
			{
				String laptop = allLaptops.get(j).getText();
				System.out.print(name+": ");
				System.out.println(laptop+"\n");
				Thread.sleep(2000);
			}
		}
}
}