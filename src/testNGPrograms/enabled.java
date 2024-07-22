package testNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
	//
	@Test (enabled = false)
	//Test case 1 is ignored
	public void TC1()
	{
		Reporter.log("Running test case1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Running test case2",true);
	}
	@Test 
	public void TC3()
	{
		Reporter.log("Running test case3",true);
	}
}
