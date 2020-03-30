package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Savings {
	@Test
	public void individual()
	{
		System.out.println("welcome to individual");
	}
	@AfterTest
	public void current() {
		System.out.println("welcome current");
	}
	@BeforeTest
	public void bank() {
		System.out.println("welcome to bank");
	}
	@Test
	public void Money() {
		System.out.println("welcome to money");
	}

	
	
	

	

}
