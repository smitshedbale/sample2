package testNGPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationCount {
	//If you want to run same test case again n again
@Test (invocationCount=10)
public void TC1()
{
	Reporter.log("Running test case1",true);
}
}
