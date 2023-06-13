package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//A[@class='content tasks']/IMG[@class='sizer']")private WebElement taskModule;
	@FindBy(xpath="//A[@class='content reports']/IMG[@class='sizer']")private WebElement reportsModule;
	@FindBy(xpath="//A[@class='content users']/IMG[@class='sizer']")private WebElement usersModule;
	@FindBy(xpath="//A[@class='content calendar']/IMG[@class='sizer']")private WebElement workscheduleModule;
	@FindBy(xpath="//A[@class='content administration']/IMG[@class='sizer']")private WebElement settingsModule;
	@FindBy(xpath="//a[contains(normalize-space(@class),'logout')]")private WebElement logoutlink;
	@FindBy(xpath="//div[text()='Time-Track']/..")private WebElement timeTrackModule;
	
	//initialization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public WebElement getTimeTrackModule() {
		return timeTrackModule;
	}

	public WebElement getTaskModule() {
		return taskModule;
	}

	public WebElement getReportsModule() {
		return reportsModule;
	}

	public WebElement getUsersModule() {
		return usersModule;
	}

	public WebElement getWorkscheduleModule() {
		return workscheduleModule;
	}

	public WebElement getSettingsModule() {
		return settingsModule;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
	//operational methods
	
	public void timeTrackModule()
	{
		timeTrackModule.click();
	}
	
	public void logoutlink()
	{
		logoutlink.click();
	}
	
	public void usersModule()
	{
		usersModule.click();
	}
	
	public void taskModule()
	{
		taskModule.click();
	}
	
	
	
	
}
