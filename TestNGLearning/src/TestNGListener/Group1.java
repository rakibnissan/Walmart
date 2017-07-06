package TestNGListener;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = "Smoke")
	public void m5(){
		System.out.println("Statemet from M5");
	}
	@Test(groups = "Regression")
	public void m6(){
		System.out.println("Statemet from M6");
	}
	@Test(groups = "Functional")
	public void m7(){
		System.out.println("Statemet from M7");
	}
	@Test(groups = "Smoke")
	public void m8(){
		System.out.println("Statemet from M8");
	}

}
