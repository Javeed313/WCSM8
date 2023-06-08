package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	
	static WebDriver driver;
  @Test 
  @Parameters({"browser","url","Vusername","Vpassword"})
  public void method1 (String browserValue,String url,String usn,String pass) {
	  
	  if(browserValue.equalsIgnoreCase("edge"))
	  {
		 
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(usn);
		  driver.findElement(By.name("pwd")).sendKeys(pass);
		  driver.findElement(By.id("loginButton")).click();
	  }
	  else if(browserValue.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  driver.findElement(By.name("username")).sendKeys(usn);
		  driver.findElement(By.name("pwd")).sendKeys(pass);
		  driver.findElement(By.id("loginButton")).click();
	  }
  }
}
