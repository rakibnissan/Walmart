package Test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.HomePage;

public class GotoLogintest {
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void AmazonLoginPageTest(){
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage HP = new HomePage(driver);
		HP.ToLogIn();
		driver.close();
		
		
		
	}

}
