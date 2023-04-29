package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class qsp2 
{
	public static WebDriver driver;

	public void browser(String browservalue) throws InterruptedException
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the browser which you want open!");
//		String browservalue=sc.next();
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();   
//			Thread.sleep(3000);			
//			driver.close();
		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
//			Thread.sleep(3000);			
//			driver.close();
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
//			Thread.sleep(3000);			
//			driver.close();
			
		}
		else
		{
			System.out.println("Please enter valid browser name!");
		}
	}



}
