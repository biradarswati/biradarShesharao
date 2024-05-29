package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static void selectdropdown(WebElement element,int index) {
		
		Select s=new Select(element);
		s.selectByIndex(index);

	}
	
	public static void handleAssertions(String actual,String expected,String massage) {

		SoftAssert a=new SoftAssert();
		
		String ac=actual;
				
		String Exp=expected;	
		
		a.assertEquals(ac, Exp,massage);
		
		a.assertAll();
		
	}
}
