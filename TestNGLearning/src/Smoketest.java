
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class Smoketest {
	public WebDriver driver;
	@Test
	public void OpenTheBrowser(){
		
		
		System.out.println("Browser has been Opened");
		
	}
	@Test
	public void logIn(){
	//code
		System.out.println("LogIn page has been Opened");
	
		//throw new SkipException("This test will be skipped");
}
	@BeforeMethod
		public void openBrowser(){
		driver = new FirefoxDriver();
	}
	@AfterMethod
	public void CloseBrowser(){
	//System.out.println("Closed");
		driver.close();
}
	@BeforeTest
	public void DBconnectionOpen(){
		System.out.println("DB has been Connected");	
	}
	@AfterTest
	public void DBconnectionClose(){
		System.out.println("DB has been disConnected");
	
}}