package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListners;
import genericPackage.Flib;
import pagePackage.EnterTimeTrackPage;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.OpenTasksPage;
import pagePackage.TasksPage;
import pagePackage.UserListPage;
@Listeners(CustomeListners.class)
public class ActiTimeEndToEndFlowTestCase extends BaseTest {

	@Test
	public void validTestCase() throws IOException, InterruptedException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
        //Thread.sleep(2000);
        HomePage hp = new HomePage(driver);
        hp.usersModule();
        //Thread.sleep(2000);
        UserListPage ulp = new UserListPage(driver);
        ulp.createUser(flib.readExcelData(EXCEL_PATH,"mgr",1,0), flib.readExcelData(EXCEL_PATH,"mgr",1,1),flib.readExcelData(EXCEL_PATH,"mgr",1,2),flib.readExcelData(EXCEL_PATH,"mgr",1,3));
		ulp.managerPermissions();
		ulp.managerCreateMethod();
		//Thread.sleep(2000);
		hp.taskModule();
		TasksPage task = new TasksPage(driver);
		task.createNewCustomreMethod(flib.readExcelData(EXCEL_PATH,"customer&projectList",1,0));
		//Thread.sleep(2000);
		task.createProjectMethod(1,flib.readExcelData(EXCEL_PATH,"customer&projectList",1,1));
		//Thread.sleep(2000);
		hp.logoutlink();
		lp.validLogin(flib.readExcelData(EXCEL_PATH,"mgr",1,0), flib.readExcelData(EXCEL_PATH,"mgr",1,1));
		//Thread.sleep(2000);
		hp.taskModule();
		OpenTasksPage otp =new OpenTasksPage(driver);
		otp.createNewTaskMethod(flib.readExcelData(EXCEL_PATH,"customer&projectList",1,0), flib.readExcelData(EXCEL_PATH,"customer&projectList",1,1), flib.readExcelData(EXCEL_PATH,"task",1,0), flib.readExcelData(EXCEL_PATH,"task",1,1), 3, 4,1);
		otp.createTaskButtonMethod();
		//Thread.sleep(2000);
		otp.createTaskButtonMethod();
		Thread.sleep(2000);
		hp.usersModule();
		ulp.createUser(flib.readExcelData(EXCEL_PATH,"tester",1,0), flib.readExcelData(EXCEL_PATH,"tester",1,1),flib.readExcelData(EXCEL_PATH,"tester",1,2),flib.readExcelData(EXCEL_PATH,"tester",1,3));
		//ulp.managerPermissions();
		ulp.managerCreateMethod();
		//Thread.sleep(2000);
		hp.timeTrackModule();
		String parentWindow = driver.getWindowHandle();
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		Thread.sleep(2000);
		ettp.selectUser(2);
		Thread.sleep(4000);
		ettp.assignTask();
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		ettp.saveChangesBT();
		hp.logoutlink();
		lp.validLogin(flib.readExcelData(EXCEL_PATH,"tester",1,0), flib.readExcelData(EXCEL_PATH,"tester",1,1));
		ettp.testerPerformTaskMethod("8.00","8.00");
		Thread.sleep(2000);
		ettp.saveChangesBT();
		hp.logoutlink();
		lp.validLogin(flib.readExcelData(EXCEL_PATH,"mgr",1,0), flib.readExcelData(EXCEL_PATH,"mgr",1,1));
		hp.taskModule();
		otp.selectTaskMethod();
		otp.completeSelectedTasksMethod();
		Thread.sleep(1000);
		hp.logoutlink(); 	       
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		hp.taskModule();
		task.projectsAndCutomersModuleMethod();
		Thread.sleep(1000);
		task.archiveCustomerAndProjectMethod();
		
		
		
		
		

	}

}
