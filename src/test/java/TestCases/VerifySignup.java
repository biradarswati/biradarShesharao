package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.CommonMethods;
import Resources.Constants;
import Resources.baseClass;

public class VerifySignup extends baseClass {

	@Test
	public void signup() throws IOException, InterruptedException {
	
		LoginPageObject lpo=new LoginPageObject(driver);
		
		lpo.clickOntryforfree().click();
		
		SignupPageObject spo=new SignupPageObject(driver);
		
		Thread.sleep(5000);
		
		spo.enterfirstName().sendKeys(Constants.firstname);
		
	/*	Select s=new Select(spo.selectEmployee());
		s.selectByIndex(1);
		*/
		
		CommonMethods.selectdropdown(spo.selectEmployee(), 1);
		
		CommonMethods.selectdropdown(spo.selectCountry(), 2);

		
		
		
		
	}
}
