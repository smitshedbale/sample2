package testNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test (priority = 3)
	public void TC1()
	{
		Reporter.log("Running test case1",true);
	}
	@Test (priority = 2)
	public void TC2()
	{
		Reporter.log("Running test case2",true);
	}
	@Test (priority = 1)
	public void TC3()
	{
		Reporter.log("Running test case3",true);
	}

}
