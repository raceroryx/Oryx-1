package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public abstract class BasePage {
	public WebDriver driver;
	
	public BasePage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void verifyTitle(String eTitle){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		String aTitle=driver.getTitle();
		Assert.assertEquals(aTitle, eTitle);
	}
}
