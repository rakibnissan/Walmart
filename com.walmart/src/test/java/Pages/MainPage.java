package Pages;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	public WebDriver driver;
	
	public MainPage (WebDriver d){
		this.driver=d;
		
	}
	
	public Furniture MainPageForSearch (){
		
		driver.findElement(By.xpath(".//*[@id='global-search-input']")).sendKeys("Furniture");
		
		
		driver.findElement(By.xpath(".//*[@id='global-search-form']/div/div[3]/button")).click();
		return new Furniture(driver);
		
	}
	

}
