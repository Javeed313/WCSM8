package pagePackage;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class OpenTasksPage {
	
	@FindBy(xpath="//input[@value='Create New Tasks']")private WebElement CreateNewTasksBT;
	@FindBy(xpath="//*[@name='customerId']")private WebElement SelectCustomerDropDown;
	@FindBy(xpath="//*[@name='projectId']")private WebElement SelectProjectDropDown;
	@FindBy(xpath="//*[@name='customerName']")private WebElement CustomerNameTB;
	@FindBy(xpath="//*[@name='projectName']")private WebElement ProjetNameTB;
	@FindBy(xpath="//TD[@id='task0.cell']/INPUT[@class='text']")private WebElement TaskTB;
	@FindBy(xpath="//DIV[@id='bt0']/SELECT[.='Non-BillableBillable']")private WebElement BillableDropDown;
	@FindBy(xpath="//*[contains(@class,'text x-form-text x-form-field x-form-focus')]")private WebElement deadlinedateTB;
	@FindBy(xpath="//input[@value='Create Tasks']")private WebElement createTaskBT;
	@FindBy(xpath="//input[@onclick='cancelTasksCreation();']")private WebElement cancelBT;
	
	public OpenTasksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewTasksBT() {
		return CreateNewTasksBT;
	}

	public WebElement getSelectCustomerDropDown() {
		return SelectCustomerDropDown;
	}

	public WebElement getCustomerNameTB() {
		return CustomerNameTB;
	}

	public WebElement getProjetNameTB() {
		return ProjetNameTB;
	}

	public WebElement getTaskTB() {
		return TaskTB;
	}

	public WebElement getBillableDropDown() {
		return BillableDropDown;
	}

	public WebElement getDeadlinedateTB() {
		return deadlinedateTB;
	}

	public WebElement getCreateTaskBT() {
		return createTaskBT;
	}

	public WebElement getCancelBT() {
		return cancelBT;
	}
	
	
	public WebElement getSelectProjectDropDown() {
		return SelectProjectDropDown;
	}
	
	//Operational Methods

	public void createNewTaskMethod(String customerName,String projectName,String task,String deadlineDate, int customerDdIndex, int projectDdIndex)
	{
		CreateNewTasksBT.click();
		Worklib wl = new Worklib();
		wl.dropDownSelect(SelectCustomerDropDown, customerDdIndex);
		TaskTB.sendKeys(task);
		deadlinedateTB.sendKeys(deadlineDate);
		wl.dropDownSelect(BillableDropDown, projectDdIndex);
		createTaskBT.click();
		
	}

}
