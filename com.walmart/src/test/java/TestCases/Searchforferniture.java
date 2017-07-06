package TestCases;

import org.testng.annotations.Test;

import Pages.MainPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Searchforferniture {
	WebDriver driver = new FirefoxDriver();
	
	
	
	@Test
	
	public void WalmartSearch(){
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		MainPage mp = new MainPage(driver);
		mp.MainPageForSearch();
		
		
	}
	
}
