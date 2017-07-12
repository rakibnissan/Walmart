package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	public WebDriver driver;
	
	public LogInPage(WebDriver driver){
		this.driver=driver;
	}
	
	public Search ToSearch(){
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Books");
		
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		return new Search(driver);
	}
}
