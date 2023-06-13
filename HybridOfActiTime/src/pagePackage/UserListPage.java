package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class UserListPage {

	@FindBy(xpath="//input[@value='Create New User']")private WebElement createNewuserBT;
	@FindBy(xpath="//*[@name='username']")private WebElement usernameTB;
	@FindBy(xpath="//*[@name='passwordText']")private WebElement passwordTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']")private WebElement passwordReTypeTB;
	@FindBy(xpath="//*[@name='firstName']")private WebElement firstNameTB;
	@FindBy(xpath="//*[@name='lastName']")private WebElement lastNameTB;
	@FindBy(xpath="//input[@type='submit']")private WebElement createUseBT;
	@FindBy(xpath="//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]")private WebElement cancelBT;
	@FindBy(xpath="(//a[contains(text(),'System,')]/ancestor::tbody/descendant::a)[1]")private WebElement userListFirstSuggestion;
	@FindBy(xpath="//input[@value='Delete This User']")private WebElement deleteThisUserButton;
	@FindBy(xpath="//*[@id='right12']")private WebElement ModifyTimeTrack;
	@FindBy(xpath="//*[@id='right2']")private WebElement ManageCustomers;
	@FindBy(xpath="//input[@name='rightGranted[13]']")private WebElement ManageTasks;
	@FindBy(xpath="//*[@id='right1']")private WebElement GenerateReports;
	@FindBy(xpath="//*[@id='right5']")private WebElement ManageUsers;
	@FindBy(xpath="//*[@id='right7']")private WebElement ManageBillingTypes;
	
	//initialization
	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization

	public WebElement getCreateNewuserBT() {
		return createNewuserBT;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getPasswordReTypeTB() {
		return passwordReTypeTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getCreateUseBT() {
		return createUseBT;
	}

	public WebElement getCancelBT() {
		return cancelBT;
	}

	public WebElement getUserListFirstSuggestion() {
		return userListFirstSuggestion;
	}

	public WebElement getDeleteThisUserButton() {
		return deleteThisUserButton;
	}
	
	public WebElement getModifyTimeTrack() {
		return ModifyTimeTrack;
	}

	public WebElement getManageCustomers() {
		return ManageCustomers;
	}

	public WebElement getManageTasks() {
		return ManageTasks;
	}

	public WebElement getGenerateReports() {
		return GenerateReports;
	}

	public WebElement getManageUsers() {
		return ManageUsers;
	}

	public WebElement getManageBillingTypes() {
		return ManageBillingTypes;
	}
	
	//operational methods

	public void createUser(String un, String pwd,String fn,String ln) throws InterruptedException
	{
		createNewuserBT.click();
		Thread.sleep(1000);
		usernameTB.sendKeys(un);
		Thread.sleep(1000);
		passwordTB.sendKeys(pwd);
		Thread.sleep(1000);
		passwordReTypeTB.sendKeys(pwd);
		Thread.sleep(1000);
		firstNameTB.sendKeys(fn);
		Thread.sleep(1000);
		lastNameTB.sendKeys(ln);
	}
	
	public void managerCreateMethod() {
		createUseBT.click();
	}
	
	public void managerPermissions() throws InterruptedException
	{
		ModifyTimeTrack.click();
		Thread.sleep(2000);
		ManageCustomers.click();
		//ManageTasks.click();
		GenerateReports.click();
		ManageUsers.click();
		ManageBillingTypes.click();
	}
	
	public void deleteUser() throws InterruptedException {
		userListFirstSuggestion.click();
		Thread.sleep(1000);
		deleteThisUserButton.click();
		Thread.sleep(1000);
		
		 Worklib wl = new Worklib();
	     wl.acceptConfirmation();
	}
	
	
	
	
}