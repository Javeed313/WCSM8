package pagePackage;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class OpenTasksPage {
	
	@FindBy(xpath="/HTML/BODY/DIV[1]/TABLE/TBODY/TR[1]/TD/FORM/TABLE/TBODY/TR[1]/TD/TABLE/TBODY/TR/TD[2]/TABLE/TBODY/TR/TD/INPUT")private WebElement CreateNewTasksBT;
	@FindBy(xpath="//*[@name='customerId']")private WebElement SelectCustomerDropDown;
	@FindBy(xpath="//*[@name='projectId']")private WebElement SelectProjectDropDown;
	@FindBy(xpath="//*[@name='customerName']")private WebElement CustomerNameTB;
	@FindBy(xpath="//*[@name='projectName']")private WebElement ProjetNameTB;
	@FindBy(xpath="//TD[@id='task0.cell']/INPUT[@class='text']")private WebElement TaskTB;
	@FindBy(xpath="//select[@name='task[0].billingType']")private WebElement BillableDropDown;
	@FindBy(xpath="//*[contains(@name,'task[0].deadline')]")private WebElement deadlinedateTB;
	@FindBy(xpath="//input[@value='Create Tasks']")private WebElement createTaskBT;
	@FindBy(xpath="//input[@onclick='cancelTasksCreation();']")private WebElement cancelBT;
	@FindBy(xpath="//input[@type='checkbox']")private WebElement selectTaskCheckBox;
	@FindBy(xpath="//input[@value='Complete Selected Tasks']")private WebElement completeSelectedTasksBT;
	
	public WebElement getSelectTaskCheckBox() {
		return selectTaskCheckBox;
	}

	public WebElement getCompleteSelectedTasksBT() {
		return completeSelectedTasksBT;
	}

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

	public void createNewTaskMethod(String customerName,String projectName,String task,String deadlineDate, int customerDdIndex, int projectDdIndex,int billableDdIndex) throws InterruptedException
	{
		CreateNewTasksBT.click();
		Worklib wl = new Worklib();
		wl.dropDownSelect(SelectCustomerDropDown, customerDdIndex);
		wl.dropDownSelect(SelectProjectDropDown, projectDdIndex);
		TaskTB.sendKeys(task);
		deadlinedateTB.sendKeys(deadlineDate);
		wl.dropDownSelect(BillableDropDown, billableDdIndex);
		Thread.sleep(2000);		
	}
	
	public void createTaskButtonMethod() throws InterruptedException
	{
		Worklib wl = new Worklib();
		wl.scrollBy(createTaskBT);
		createTaskBT.click();
		Thread.sleep(2000);
	}

	public void selectTaskMethod()
	{
		selectTaskCheckBox.click();
	}
	
	public void completeSelectedTasksMethod()
	{
		completeSelectedTasksBT.click();
	}
}
