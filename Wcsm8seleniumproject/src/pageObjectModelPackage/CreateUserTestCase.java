package pageObjectModelPackage;

import java.io.IOException;
import java.util.ArrayList;

public class CreateUserTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		Thread.sleep(1000);
		HomePage hp = new HomePage(driver);
		hp.usersModule();
		Thread.sleep(1000);
		UserListPage ulp = new UserListPage(driver);
		
		String[] al = new String[4];
		//short cc = flib.cellCount(EXCEL_PATH, "createuser",1 );
		
		for(int i=0;i<=3;i++) 
		{
			al[i]=flib.readExcelData(EXCEL_PATH, "createuser", 1, i);
		}
		
		ulp.createUser(al[0], al[1], al[2], al[3]);
		Thread.sleep(1000);
		ulp.deleteUser();	
	
	}
	
}
