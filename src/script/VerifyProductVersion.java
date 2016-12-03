package script;

import generics.Excel;
import org.testng.annotations.Test;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyProductVersion extends BaseTest{
@Test
public void testVerifyProductVersion(){
	String sheet="VerifyProductVersion";
	String un=Excel.getCellValue(XL_PATH,sheet,1,0);
	String pw=Excel.getCellValue(XL_PATH,sheet,1,1);
	String version=Excel.getCellValue(XL_PATH,sheet,1,2);
		//enter valid un
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//enter valid pwd
		l.setPassword(pw);
		//click login
		l.clickLogin();
		//click help
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clickHelp();
		//click about
		e.clickAboutActiTIME();
		//verify the product version is actiTIME 2016.1
		e.verifyProductVersion(version);
		//click close button
		e.clickCloseButton();
		//click logout
		e.clickLogoutLink();
     }	
}

