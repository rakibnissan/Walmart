package TestNGListener;

import org.testng.annotations.Test;

public class Group {

	@Test(groups = {"Smoke", "Regression"})
	public void m1(){
		System.out.println("Statemet from M1");
	}
	@Test(groups = "Regression")
	public void m2(){
		System.out.println("Statemet from M2");
	}
	@Test(groups = "Functional")
	public void m3(){
		System.out.println("Statemet from M3");
	}
	@Test(groups = "Smoke")
	public void m4(){
		System.out.println("Statemet from M4");
	}
}
