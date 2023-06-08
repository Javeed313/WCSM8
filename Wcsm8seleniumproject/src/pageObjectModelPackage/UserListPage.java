package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		createUseBT.click();
	}
	
	
	
	public void deleteUser() throws InterruptedException {
		userListFirstSuggestion.click();
		Thread.sleep(1000);
		deleteThisUserButton.click();
		Thread.sleep(1000);
		
		 WorkLib wl = new WorkLib();
	     wl.handleConfirmationPopup();
	}
	
	
	
	
}
