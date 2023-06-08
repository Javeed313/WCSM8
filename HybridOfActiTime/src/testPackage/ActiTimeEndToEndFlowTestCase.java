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
		BaseTest bt = new BaseTest();
		bt.setUp();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
        Thread.sleep(2000);
        HomePage hp = new HomePage(driver);
        hp.usersModule();
        Thread.sleep(2000);
        UserListPage ulp = new UserListPage(driver);
        ulp.createUser(flib.readExcelData(EXCEL_PATH,"mgr",1,0), flib.readExcelData(EXCEL_PATH,"mgr",1,1),flib.readExcelData(EXCEL_PATH,"mgr",1,2),flib.readExcelData(EXCEL_PATH,"mgr",1,3));
		ulp.managerPermissions();
		ulp.managerCreateMethod();
		Thread.sleep(2000);
		hp.taskModule();
		TasksPage task = new TasksPage(driver);
		task.createNewCustomreMethod(flib.readExcelData(EXCEL_PATH,"customer&projectList",1,0));
		Thread.sleep(2000);
		task.createProjectMethod(0,flib.readExcelData(EXCEL_PATH,"customer&projectList",1,1));
		Thread.sleep(2000);
		hp.logoutlink();
		lp.validLogin(flib.readExcelData(EXCEL_PATH,"mgr",1,0), flib.readExcelData(EXCEL_PATH,"mgr",1,1));
		Thread.sleep(2000);
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.createNewTaskMethod(flib.readExcelData(EXCEL_PATH,"customer&projectList",1,0), flib.readExcelData(EXCEL_PATH,"customer&projectList",1,1), flib.readExcelData(EXCEL_PATH,"task",1,0), flib.readExcelData(EXCEL_PATH,"task",1,1), 3, 4);
		Thread.sleep(2000);
		ulp.createUser(flib.readExcelData(EXCEL_PATH,"tester",1,0), flib.readExcelData(EXCEL_PATH,"tester",1,1),flib.readExcelData(EXCEL_PATH,"tester",1,2),flib.readExcelData(EXCEL_PATH,"tester",1,3));
		ulp.managerCreateMethod();
		EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
		ettp.selectUser(2);
		ettp.assignTask();
		Thread.sleep(2000);
		ettp.saveChangesBT();
		
		

	}

}
