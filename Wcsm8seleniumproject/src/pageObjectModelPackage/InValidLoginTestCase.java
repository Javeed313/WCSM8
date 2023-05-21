package pageObjectModelPackage;

import java.io.IOException;

public class InValidLoginTestCase extends BaseTest {
public static void main(String[] args) throws InterruptedException, IOException {
	BaseTest bt = new BaseTest();
	bt.setUp();
	LoginPage lp = new LoginPage(driver);
	Flib flib = new Flib();
	Thread.sleep(1000);
	int rc = flib.rowCount(EXCEL_PATH, "invalidCreds");
	
	for(int i=1;i<=rc;i++)
	{
	lp.inValidLogin(flib.readExcelData(EXCEL_PATH, "invalidCreds", i, 0),flib.readExcelData(EXCEL_PATH, "invalidCreds", i, 1));
	Thread.sleep(1000);
}
}
}
