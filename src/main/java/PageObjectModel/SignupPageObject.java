package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {

	public WebDriver driver;

	private By firstName=By.xpath("//input[@name='UserFirstName']");
	private By lastName=By.xpath("//input[@name='UserLastName']");
	private By jobTitle=By.xpath("//input[@name='UserTitle']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	
	
	public SignupPageObject(WebDriver driver2) {
        this.driver=driver2;
	}
	public WebElement enterfirstName() {
		return driver.findElement(firstName);
	}
	public WebElement enterlastname() {
		return driver.findElement(lastName);
	}
	public WebElement enterjobtitle() {
		return driver.findElement(jobTitle);
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}
	public WebElement enterphone() {
		return driver.findElement(phone);
	}
	public WebElement selectEmployee() {
		return driver.findElement(employees);
	}
	public WebElement selectCountry() {
		return driver.findElement(country);
	}
	
	
	
}
