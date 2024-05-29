package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.CommonMethods;
import Resources.Constants;
import Resources.baseClass;

public class VerifyLogin extends baseClass {

	@Test(dataProvider="testData")
	public void Login(String uname,String password) throws IOException {
		
		//driver.findelemenets(By.xpath("//input[@id="username']").sendkeys("test");
		
		LoginPageObject obj=new LoginPageObject(driver);	
		
		CommonMethods.handleAssertions(driver.getCurrentUrl(), "https://login.salesforce.com/", "url is not matching");
		
		obj.enterusername().sendKeys(uname);
		
		obj.enterpassword().sendKeys(password);
		
		obj.clickOnlogin().click();	
		
		CommonMethods.handleAssertions(obj.errortext().getText(),Constants.ExpectedErrorMassage,"error massage is not matching");
		
	}
	
	@DataProvider
	public Object[][]testData(){
	Object[][]data=new Object[3][2];
	data[0][0]=Constants.username1;
	data[0][1]=Constants.password1;
	data[1][0]=Constants.username2;
	data[1][1]=Constants.password2;
	data[2][0]=Constants.username3;
	data[2][1]=Constants.password3;

	return data;
	}

}
