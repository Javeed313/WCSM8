package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class EnterTimeTrackPage {

	@FindBy(xpath="//*[@name='usersSelector.selectedUser']")private WebElement selectUserDropDown;
	@FindBy(xpath="//td[@id='cpSelector.cpButton.contentsContainer']")private WebElement allActiveProjectsDropDown;
	@FindBy(xpath="//label[.='All active projects of all active customers']")private WebElement allActiveProjectsRadioBT;
	@FindBy(xpath="//*[@id='closeButton']")private WebElement closeDropDownBT;
	@FindBy(xpath="//TABLE[@cellspacing='1']/TBODY/TR[2]/TD[4]/INPUT[@type='checkbox']")private WebElement selectTaskCheckBox;
	@FindBy(xpath="//input[@value='Insert Selected Tasks to the Enter Time-Track Page']")private WebElement inserSelectedTaskBT;
	@FindBy(xpath="//*[@id='SubmitTTButton']")private WebElement saveChangesBT;
	@FindBy(xpath="//a[text()='Insert existing tasks']")private WebElement insertExistingTasks;
	@FindBy(xpath="(//input[@class='text inputTT'])[1]")private WebElement testerPerformTaskTBday1;
	@FindBy(xpath="(//input[@class='text inputTT'])[2]")private WebElement testerPerformTaskTBday2;
	
	public WebElement getTesterPerformTaskTBday2() {
		return testerPerformTaskTBday2;
	}

	public WebElement getTesterPerformTaskTB() {
		return testerPerformTaskTBday1;
	}

	public WebElement getInsertExistingTasks() {
		return insertExistingTasks;
	}

	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAllActiveProjectsDropDown() {
		return allActiveProjectsDropDown;
	}

	public WebElement getAllActiveProjectsRadioBT() {
		return allActiveProjectsRadioBT;
	}

	public WebElement getCloseDropDownBT() {
		return closeDropDownBT;
	}

	public WebElement getSelectTaskCheckBox() {
		return selectTaskCheckBox;
	}

	public WebElement getInserSelectedTaskBT() {
		return inserSelectedTaskBT;
	}
	
	public WebElement getSaveChangesBT() {
		return saveChangesBT;
	}

	public WebElement getSelectUserDropDown() {
		return selectUserDropDown;
	}
	
	//Operational Methods
	

	public void selectUser(int index) {
		Worklib wl = new Worklib();
		wl.dropDownSelect(selectUserDropDown, index);
	}
	
	public void assignTask() throws InterruptedException
	{
		Worklib wl = new Worklib();
		wl.switchToChildWindow(insertExistingTasks);
		allActiveProjectsDropDown.click();
		allActiveProjectsRadioBT.click();
		closeDropDownBT.click();
		selectTaskCheckBox.click();
		inserSelectedTaskBT.click();
	}
	
	public void saveChangesBT() {
		saveChangesBT.click();
	}
	
	public void testerPerformTaskMethod(String durationD1,String durationD2)
	{
		testerPerformTaskTBday1.sendKeys(durationD1);
		testerPerformTaskTBday2.sendKeys(durationD2);
	}
	
	
}
