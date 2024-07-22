package testNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
	@Test (timeOut = 10)
	public void TC1()
	{
		Reporter.log("Running Test Case1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running Test Case2",true);
	}

}
