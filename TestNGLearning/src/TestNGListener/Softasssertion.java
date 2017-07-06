package TestNGListener;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Softasssertion {
	@Test (priority =1)
	public void tologin(){
		System.out.println("test loged in");
		try {
			Assert.fail();
		} catch (Throwable t) {
			System.out.println("Error found");
		throw new RuntimeException();	
		}finally{
			System.out.println("Valied 1");
			System.out.println("Valied 2");}
	}
	@Test(priority =4, dependsOnMethods = {"tologin"}, alwaysRun = true)
	public void register(){
		System.out.println("test registered");
	}
	@Test(priority =3, dependsOnMethods = {"tologin"})
	public void payment(){
		System.out.println("payment maid");
	}
	@Test(priority =5, dependsOnMethods = {"tologin"})
	public void signout(){
		System.out.println("test signed out");
	}
	@Test(priority=2, dependsOnMethods = {"tologin"})
	public void searcAndBuy(){
		System.out.println("User bought the product");
	}

}
