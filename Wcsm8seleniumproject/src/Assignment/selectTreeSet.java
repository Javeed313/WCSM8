package Assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectTreeSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/moula/Desktop/Selenium%20Data/Web%20Elements/MultiSelectDropDown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dd = driver.findElement(By.name("menu"));
		Select sel = new Select(dd);
		List<WebElement> allOptions = sel.getOptions();
		TreeSet<String> ts = new TreeSet<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			Thread.sleep(2000);
			ts.add(allOptions.get(i).getText());
		} 
		for(Object op:ts)
		{
			System.out.println(op);
		}
		driver.quit();



	}

}
