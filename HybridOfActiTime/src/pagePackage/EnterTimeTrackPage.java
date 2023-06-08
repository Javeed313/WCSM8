package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class EnterTimeTrackPage {

	@FindBy(xpath="@FindBy(xpath=\"//*[@id='cpSelector.cpButton.contentsContainer']\")private WebElement allActiveProjectsDropDown;")private WebElement selectUserDropDown;
	@FindBy(xpath="//*[@id='cpSelector.cpButton.contentsContainer']")private WebElement allActiveProjectsDropDown;
	@FindBy(xpath="//label[.='All active projects of all active customers']")private WebElement allActiveProjectsRadioBT;
	@FindBy(xpath="//*[@id='closeButton']")private WebElement closeDropDownBT;
	@FindBy(xpath="//TABLE[@cellspacing='1']/TBODY/TR[2]/TD[4]/INPUT[@type='checkbox']")private WebElement selectTaskCheckBox;
	@FindBy(xpath="//input[@value='Insert Selected Tasks to the Enter Time-Track Page']")private WebElement inserSelectedTaskBT;
	@FindBy(xpath="//*[@id='SubmitTTButton']")private WebElement saveChangesBT;
	
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
	
	public void assignTask()
	{
		allActiveProjectsDropDown.click();
		allActiveProjectsRadioBT.click();
		closeDropDownBT.click();
		selectTaskCheckBox.click();
		inserSelectedTaskBT.click();
	}
	
	public void saveChangesBT() {
		saveChangesBT.click();
	}
	
	
}
