package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void pLoan()
	{
		System.out.println("good");
		
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("i will execute first");
		
	}

}
