package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GotoLogInPage {
		public WebDriver driver;
		
		public GotoLogInPage(WebDriver driver){
			this.driver=driver;

}
		
		public LogInPage login(){
			driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("rakibnissan@gmail.com");
			driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("rakib@nissan");
			driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
			return new LogInPage(driver);
			
			
		}

	}