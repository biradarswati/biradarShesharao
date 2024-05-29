package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseClass {

	 public WebDriver driver;
	 public Properties prop;
	
	public void driverInitilize() throws IOException {
		
		//this will readd the properties file
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

	//access the properties file-
    prop=new Properties();
	prop.load(fis);
	
	 String browserName=prop.getProperty("browser");
	
		if(browserName.equalsIgnoreCase("chrome")) {
		   driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			//firefox
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			//edge
		}
		else{
			System.out.println("plz make sure you have correct browser");
		}
		
	}
		
		@BeforeMethod
		public void openurl() throws IOException {
		driverInitilize();
		//this driver have scope
		 String urlName=prop.getProperty("url");
		 driver.get(urlName);
		}	
				
		@AfterMethod
		public void closeBrowser() {
		driver.quit();
		
		
		}
		
		
		
	}


