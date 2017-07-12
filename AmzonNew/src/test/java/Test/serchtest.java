package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.GotoLogInPage;
import Pages.HomePage;
import Pages.LogInPage;

public class serchtest {
	
	
	
	WebDriver driver = new FirefoxDriver();

	@Test

	public void searchTest(){
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage HP = new HomePage(driver);
		GotoLogInPage LI = new GotoLogInPage(driver);
		LogInPage LP = new LogInPage(driver);
		HP.ToLogIn();
		LI.login();
		LP.ToSearch();
		driver.close();
	}

}
