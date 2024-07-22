package testNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnmethod {
	@Test
	public void login()
	{
		Reporter.log("Running Tc1",true);
	}

	@Test (dependsOnMethods = {"login"})
	public void logout()
	{
		Reporter.log("Running Tc2",true);
	}
}
