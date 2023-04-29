package Assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectLinkedHashSet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/moula/Desktop/Selenium%20Data/Web%20Elements/MultiSelectDropDown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dd = driver.findElement(By.name("menu"));
		Select sel = new Select(dd);
		List<WebElement> allOptions = sel.getOptions();
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			Thread.sleep(2000);
			ls.add(allOptions.get(i).getText());
		} 
		
//		for(int i=0;i<ls.size();i++)
//		{
//			System.out.println(ls[i]);
//		}
		
		for(String op:ls)
		{
			System.out.println(op);
		}
		driver.quit();



	}

}
