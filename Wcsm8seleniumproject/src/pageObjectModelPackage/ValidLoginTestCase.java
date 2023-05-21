package pageObjectModelPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	
	BaseTest bt = new BaseTest();
	bt.setUp();
	LoginPage lp = new LoginPage(driver);
	Flib flib = new Flib();
	Thread.sleep(1000);
	lp.validLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	Thread.sleep(1000);
	HomePage hp = new HomePage(driver);
	hp.logoutlink();

}
}
