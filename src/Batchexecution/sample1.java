package Batchexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample1 {
	@Test(enabled = false)
	public void m1()
	{
	Reporter.log("Running Tc1",true);
	}
	@Test
	public void m2()
	{
	Reporter.log("Running Tc2 change from github",true);
	}
	

}
