package dataProvide;

import org.testng.annotations.DataProvider;



public class DataProvide {
	
	
	
	
	
	
	@DataProvider(name = "dp1")
	public Object[][] getData(){
		Object[][] data = new Object [3][2];
		data[0][0]= "a@gmail.com";
		data[0][1]= "123";
		
		data[1][0]= "b@gmail.com";
		data[1][1]= "123";
		
		data[2][0]= "c@gmail.com";
		data[2][1]= "123";		
						
		
		return data;
	}
	@DataProvider(name = "dp2")
	public Object[][] getDatax(){
		Object[][] data = new Object [3][3];
		data[0][0]= "ax@gmail.com";
		data[0][1]= "123";
		data[0][2]= "23";
		
		data[1][0]= "y@gmail.com";
		data[1][1]= "123";
		data[1][2]= "33";
		
		data[2][0]= "z@gmail.com";
		data[2][1]= "123";	
		data[2][2]= "44";
						
		
		return data;
	}

}
