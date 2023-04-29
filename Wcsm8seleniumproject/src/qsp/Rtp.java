package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		// Ask the input from users
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the browser which you want open!");
		String browservalue=sc.next();
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(3000);			
			driver.close();
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			Thread.sleep(3000);			
			driver.close();
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);			
			driver.close();
			
		}
		else
		{
			System.out.println("Please enter valid browser name!");
			main(args);
		}
	}

}