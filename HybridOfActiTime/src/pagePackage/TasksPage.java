package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.Worklib;

public class TasksPage {

	@FindBy(xpath="//a[.='Open Tasks']")private WebElement OpenTasksModule;
	@FindBy(xpath="//a[.='Completed Tasks']")private WebElement CompletedTaskModule;
	@FindBy(xpath="//a[.='Projects & Customers']")private WebElement ProjectsandCustomersModule;
	@FindBy(xpath="//a[.='Archives']")private WebElement ArchivesModule;
	@FindBy(xpath="//input[@value='Create New Customer']")private WebElement CreateNewCutomerBT;
	@FindBy(xpath="//input[@value='Create New Project']")private WebElement CreateNewProjectBT;
	@FindBy(xpath="//*[@name='name']")private WebElement CustomerTB;
	@FindBy(xpath="//*[@name='createCustomerSubmit']")private WebElement CreateCustomerBT;
	@FindBy(xpath="//select[@name='customerId']")private WebElement ProjetcSelectCustomerDropDown;
	@FindBy(xpath="//*[@name='name']")private WebElement ProjectNameTB;
	@FindBy(xpath="//*[@name='createProjectSubmit']")private WebElement CreateProjectBT;
	@FindBy(xpath="//input[@onclick='cancelProjectCreation();']")private WebElement ProjectCancelBT;
	@FindBy(xpath="//a[text()='All']")private WebElement selectCustomersAndProjectsAllBT;
	@FindBy(xpath="//input[@value='Archive Selected']")private WebElement archiveSlectedBT;
	
	public WebElement getSelectCustomersAndProjectsCB() {
		return selectCustomersAndProjectsAllBT;
	}

	public WebElement getArchiveSlectedBT() {
		return archiveSlectedBT;
	}

	public TasksPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getOpenTasksModule() {
		return OpenTasksModule;
	}

	public WebElement getCompletedTaskModule() {
		return CompletedTaskModule;
	}

	public WebElement getProjectsandCustomersModule() {
		return ProjectsandCustomersModule;
	}

	public WebElement getArchivesModule() {
		return ArchivesModule;
	}

	public WebElement getCreateNewCutomerBT() {
		return CreateNewCutomerBT;
	}

	public WebElement getCreateNewProjectBT() {
		return CreateNewProjectBT;
	}

	public WebElement getCustomerTB() {
		return CustomerTB;
	}

	public WebElement getCreateCustomerBT() {
		return CreateCustomerBT;
	}

	public WebElement getProjetcSelectCustomerDropDown() {
		return ProjetcSelectCustomerDropDown;
	}

	public WebElement getProjectNameTB() {
		return ProjectNameTB;
	}

	public WebElement getCreateProjectBT() {
		return CreateProjectBT;
	}

	public WebElement getProjectCancelBT() {
		return ProjectCancelBT;
	}
	
	// Operational Methods
	
	public void projectsAndCutomersModuleMethod()
	{
		ProjectsandCustomersModule.click();
	}
	
	public void createNewCustomreMethod(String custName) throws InterruptedException
	{
		ProjectsandCustomersModule.click();
		CreateNewCutomerBT.click();
		CustomerTB.sendKeys(custName);
		Thread.sleep(2000);
		CreateCustomerBT.click();
	}
	
	public void createProjectMethod(int index,String projectName) throws InterruptedException
	{
		CreateNewProjectBT.click();
		Worklib wb = new Worklib();
		ProjetcSelectCustomerDropDown.click();
		wb.dropDownSelect(ProjetcSelectCustomerDropDown, index);
		ProjectNameTB.sendKeys(projectName);
		Thread.sleep(2000);
		CreateProjectBT.click();
		
	}
	
	public void archiveCustomerAndProjectMethod()
	{
		selectCustomersAndProjectsAllBT.click();
		archiveSlectedBT.click();
		Worklib wl = new Worklib();
		wl.acceptConfirmation();
	}
	
	
	
}
