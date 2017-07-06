package dataProvide;

import org.testng.annotations.Test;

public class readdata {
	@Test(dataProvider = "dp1", dataProviderClass = DataProvide.class)
	public void login(String username, String Password){
	
		System.out.println("USERNAME is: " + username + "and PASSWORD is: " + Password);
		
	}
	
		@Test(dataProvider = "dp2", dataProviderClass = DataProvide.class)
		public void login(String username, String Password, int age){
		
			System.out.println("USERNAME is: " + username + "and PASSWORD is: " + Password + "And age"+ age);
			
		}
}
