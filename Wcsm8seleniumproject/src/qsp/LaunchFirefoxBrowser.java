		package qsp;
			
		import org.openqa.selenium.firefox.FirefoxDriver;
			
		public class LaunchFirefoxBrowser
		{
		public static void main(String[] args) throws InterruptedException 
		{
			
			// To Launch Firefox Browser
			
			FirefoxDriver driver = new FirefoxDriver();
			
			// To Stop the execution of Script for 3 seconds.
			
			Thread.sleep(3000);
			
			// To Close the Firefox Browser.
			
			driver.close();			
		}
		}
