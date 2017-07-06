import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class FunctioinalityTest {
	
		
	
@BeforeSuite
	public void Welcome(){
		//later, webdriver
		
		System.out.println("Welcome to abc Project");
	
}
	@AfterSuite
	public void Closingmessage(){
		//later, webdriver
		
		System.out.println("Thank you for reading");}
	@Test(priority=3, dependsOnMethods = {"tologin"})
	public void OcheckTheTitle(){
		//later, webdriver
		
		System.out.println("Title Verified");
		System.out.println("Vvv");}
	@Test (priority=1)
	public void tologin(){
		System.out.println("USer log in");
		System.out.println("Valied 1");
		System.out.println("Valied 2");
		try {
			Assert.fail();
		} catch (Throwable t) {
			System.out.println("Error found");
		throw new RuntimeException();	
		}finally{
			System.out.println("Valied 1");
			System.out.println("Valied 2");}
	}
	
	@Test (priority=2, dependsOnMethods = {"tologin"})
	public void reg(){
		System.out.println("Registered");
		System.out.println("Valied3");
	}
	@Test (priority=4, dependsOnMethods = {"tologin"})
	public void Payment(){
		System.out.println("Made the payment");	
	}
}