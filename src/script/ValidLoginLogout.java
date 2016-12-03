package script;

import generics.Excel;
import org.testng.annotations.Test;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLoginLogout extends BaseTest{
@Test
public void testValidLoginLogout()
{
	String un = Excel.getCellValue(XL_PATH,"ValidLoginLogout",1,0);
	String pw=Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1,1);
	String hp=Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1,2);
	String lp=Excel.getCellValue(XL_PATH, "ValidLoginLogout", 1,3);
	//enter valid un
	LoginPage l=new LoginPage(driver);
	l.setUserName(un);
	//enter valid pwd
	l.setPassword(pw);
	//click login
	l.clickLogin();
	//verify home page....
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.verifyTitle(hp);
	//click logout
	e.clickLogoutLink();
	//verify login page....
	l.verifyTitle(lp);
	}
}
